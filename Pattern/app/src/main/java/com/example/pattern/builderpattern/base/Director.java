package com.example.pattern.builderpattern.base;

import com.example.pattern.builderpattern.model.ExportDataModel;
import com.example.pattern.builderpattern.model.ExportFooterModel;
import com.example.pattern.builderpattern.model.ExportHeaderModel;

import java.util.Collection;
import java.util.Map;

/**
 * Created by wuyue on 16/8/9.
 */
public class Director {
    private IBuilder builder;
    public Director(IBuilder builder){
        this.builder = builder;
    }
    public void construct(ExportHeaderModel ehm, Map<String,Collection<ExportDataModel>> mapData, ExportFooterModel efm){
        builder.buildHeader(ehm);
        builder.buildBody(mapData);
        builder.buildFooter(efm);
    }
}
