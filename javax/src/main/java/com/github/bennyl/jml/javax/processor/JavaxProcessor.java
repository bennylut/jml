/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.bennyl.jml.javax.processor;

import com.github.bennyl.jml.javax.parser.JavaXLexer;
import com.github.bennyl.jml.javax.parser.JavaXParser;
import com.github.bennyl.jml.javax.util.FSUtil;
import com.google.auto.service.AutoService;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.UncheckedIOException;
import java.nio.file.Paths;
import java.util.Collections;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.annotation.processing.AbstractProcessor;
import javax.annotation.processing.Filer;
import javax.annotation.processing.Processor;
import javax.annotation.processing.RoundEnvironment;
import javax.lang.model.element.Element;
import javax.lang.model.element.TypeElement;
import javax.tools.Diagnostic;
import javax.tools.FileObject;
import javax.tools.StandardLocation;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import spoon.reflect.cu.CompilationUnit;

/**
 *
 * @author bennyl
 */
@AutoService(Processor.class)
public class JavaxProcessor extends AbstractProcessor {

    boolean activated = false;

    File srcPath = null;

    @Override
    public Set<String> getSupportedAnnotationTypes() {
        if (!activated) {
            return Collections.EMPTY_SET;
        }
        return Collections.singleton("*"); //always call me!
    }

    @Override
    public boolean process(Set<? extends TypeElement> annotations, RoundEnvironment roundEnv) {
        if (roundEnv.processingOver()) {
            System.out.println("PROCESSING OVER");
        } else {
            FSUtil.scan(getSrcPath())
                    .filter(f -> f.getName().endsWith(".javax"))
                    .forEach(f -> {
                        try {
                            generateCode(f);
                        } catch (IOException ex) {
                            Logger.getLogger(JavaxProcessor.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    });
        }

        return true;
    }

    private void generateCode(File file) throws IOException {
        try (FileInputStream fin = new FileInputStream(file)) {
            ANTLRInputStream input = new ANTLRInputStream(fin);
            JavaXLexer lexer = new JavaXLexer(input);
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            JavaXParser parser = new JavaXParser(tokens);
            ParseTree tree = parser.compilationUnit(); // parse; start at prog

            //CodeGenerationVisitor visitor = new CodeGenerationVisitor(processingEnv);
            SpoonASTParser visitor = new SpoonASTParser();
            CompilationUnit result = (CompilationUnit) visitor.visit(tree);

            System.out.println("got: \n" + visitor.toString(result));
        }
    }

    public File getSrcPath() {
        if (srcPath == null) {
            try {
                Filer filer = processingEnv.getFiler();
                FileObject resource = filer.createResource(StandardLocation.CLASS_OUTPUT, "", "tmp", (Element[]) null);
                File compilationPath = Paths.get(resource.toUri()).toFile();
                while (compilationPath != null && !new File(compilationPath, "src").exists()) {
                    compilationPath = compilationPath.getParentFile();
                }

                if (compilationPath == null) {
                    throw new IOException("cannot find src root");
                }

                srcPath = compilationPath;

                processingEnv.getMessager().printMessage(Diagnostic.Kind.NOTE, "No source path provided. Using: " + srcPath.getPath());

                resource.delete();
            } catch (IOException ex) {
                processingEnv.getMessager().printMessage(Diagnostic.Kind.ERROR, "cannot locate project source folder");
                throw new UncheckedIOException(ex);
            }
        }

        return srcPath;
    }

}
