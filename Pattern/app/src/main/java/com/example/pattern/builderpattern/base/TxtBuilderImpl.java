package com.example.pattern.builderpattern.base;

import com.example.pattern.builderpattern.model.ExportDataModel;
import com.example.pattern.builderpattern.model.ExportFooterModel;
import com.example.pattern.builderpattern.model.ExportHeaderModel;

import java.util.Collection;
import java.util.Map;

/**
 * Created by wuyue on 16/8/9.
 */
public class TxtBuilderImpl implements IBuilder{
    private StringBuffer buffer = new StringBuffer();


    @Override
    public void buildHeader(ExportHeaderModel ehm) {
        buffer.append(ehm.getDepId()+","+ehm.getExportDate()+"\n");
    }

    @Override
    public void buildBody(Map<String, Collection<ExportDataModel>> mapData) {
        for(String tblName : mapData.keySet()){
            buffer.append(tblName+"\n");
            for(ExportDataModel edm : mapData.get(tblName)){
                buffer.append(edm.getPrice()+","+edm.getAmount()+"\n");
            }
        }
    }

    @Override
    public void buildFooter(ExportFooterModel efm) {
            buffer.append(efm.getExportUser());
    }

    public StringBuffer getResult(){
        return buffer;
    }

}
