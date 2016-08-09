package com.example.pattern.factorypattern;

/**
 * Created by wuyue on 16/8/7.
 */
public class ExportDBOperation extends ExportOperate {
    @Override
    protected ExportFileApi factoryMethod() {
        return new ExportDB();
    }
}
