/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.bennyl.jml.core.loaders.common;

import com.github.bennyl.jml.core.Dataset;
import com.github.bennyl.jml.core.Table;
import com.github.bennyl.jml.core.impl.ds.SimpleDataset;
import com.github.bennyl.jml.core.loaders.SpecificDatasetLoader;
import com.github.bennyl.jml.core.services.VectorBuilder;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.Iterator;
import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;
import com.github.bennyl.jml.core.views.TableMetadata;
import com.google.inject.Provider;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author bennyl
 */
public class Csv implements SpecificDatasetLoader {

    private CSVFormat format = CSVFormat.DEFAULT;
    private boolean containHeaders = true;

    public Csv format(final CSVFormat value) {
        this.format = value;
        return this;
    }

    public Csv containHeaders(final boolean value) {
        this.containHeaders = value;
        return this;
    }

    @Override
    public Dataset load(InputStream input) throws IOException {
        Dataset dataset = new SimpleDataset(0, 0);

        Table table = dataset.asTable();
        List<VectorBuilder> columnBuilders = new ArrayList<>();

        try (Reader r = new InputStreamReader(input)) {
            Iterator<CSVRecord> iter = format.parse(r).iterator();

            if (containHeaders && iter.hasNext()) {
                CSVRecord headers = iter.next();
                TableMetadata metaStore = dataset.getInstanceOf(TableMetadata.class);
                for (int i = 0; i < headers.size(); i++) {
                    metaStore.setColumnMetadata(i, headers.get(i));
                }
            }

            int size = -1;
            while (iter.hasNext()) {
                CSVRecord next = iter.next();
                if (size == -1) {
                    size = next.size();
                    Provider<VectorBuilder> vbp = table.getProviderOf(VectorBuilder.class);
                    for (int i = 0; i < size; i++) {
                        columnBuilders.add(vbp.get());
                    }
                } else if (size != next.size()) {
                    throw new UnsupportedOperationException("number of columns is not constant");
                }

                for (int i = 0; i < next.size(); i++) {
                    columnBuilders.get(i).appendParsed(next.get(i));
                }
            }

            for (VectorBuilder builder : columnBuilders) {
                table.appendColumn(builder.toVector());
            }

            return table;
        }
    }

}
