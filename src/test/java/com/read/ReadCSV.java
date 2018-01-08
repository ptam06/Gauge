package com.read;

import com.thoughtworks.gauge.Gauge;
import com.thoughtworks.gauge.Step;
import com.thoughtworks.gauge.Table;
import com.thoughtworks.gauge.TableRow;

import java.util.List;

public class ReadCSV {
    @Step("display data from csv file <table>")
public void displayCSV(Table table)
    {
        List<TableRow>rows=table.getTableRows();
        List<String>columnnames=table.getColumnNames();
        for(TableRow row:rows)

        {
            //list first column data
            System.out.println(row.getCell(columnnames.get(0)));

        }
    }
}
