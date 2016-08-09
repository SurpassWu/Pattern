package com.example.pattern.builderpattern.base;

import com.example.pattern.builderpattern.model.ExportDataModel;
import com.example.pattern.builderpattern.model.ExportFooterModel;
import com.example.pattern.builderpattern.model.ExportHeaderModel;

import java.util.Collection;
import java.util.Map;

/**
 * Created by wuyue on 16/8/9.
 */
public interface IBuilder {
    public void buildHeader(ExportHeaderModel ehm);
    public void buildBody(Map<String,Collection<ExportDataModel>> mapData);
    public void buildFooter(ExportFooterModel efm);
}
