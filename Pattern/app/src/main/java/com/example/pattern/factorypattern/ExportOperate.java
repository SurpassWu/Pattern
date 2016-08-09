package com.example.pattern.factorypattern;

/**
 * Created by wuyue on 16/8/7.
 */
public abstract class ExportOperate {
    public boolean export(String data){
        ExportFileApi api = factoryMethod();
        return api.export(data);
    }

    protected abstract ExportFileApi factoryMethod();
}
