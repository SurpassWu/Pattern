package com.example.pattern.factorypattern;

/**
 * Created by wuyue on 16/8/7.
 */
public class ExportTxtFile implements ExportFileApi{
    @Override
    public boolean export(String data) {
        System.out.println("到处数据"+data+"文本文件");
        return true;
    }
}
