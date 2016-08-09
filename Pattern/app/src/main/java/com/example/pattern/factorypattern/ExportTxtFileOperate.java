package com.example.pattern.factorypattern;

/**
 * Created by wuyue on 16/8/7.
 */
public class ExportTxtFileOperate extends ExportOperate{
    @Override
    protected ExportFileApi factoryMethod() {
        return new ExportTxtFile();
    }
}
