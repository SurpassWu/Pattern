package com.example.pattern.factorypattern;

/**
 * Created by wuyue on 16/8/7.
 */
public class ExportDB implements ExportFileApi{
    @Override
    public boolean export(String data) {
        System.out.println("导出数据"+data+"到数据库备份文件");
        return true;
    }
}
