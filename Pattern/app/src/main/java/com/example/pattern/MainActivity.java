package com.example.pattern;

import android.app.IntentService;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.pattern.abstractfactory.AbstractFactory;
import com.example.pattern.abstractfactory.ConcreteFactory1;
import com.example.pattern.builderpattern.base.Director;
import com.example.pattern.builderpattern.base.TxtBuilderImpl;
import com.example.pattern.builderpattern.model.ExportDataModel;
import com.example.pattern.builderpattern.model.ExportFooterModel;
import com.example.pattern.builderpattern.model.ExportHeaderModel;
import com.example.pattern.factorypattern.ExportDBOperation;
import com.example.pattern.factorypattern.ExportOperate;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ExportOperate operate = new ExportDBOperation();
        operate.export("测试数据");


        AbstractFactory af = new ConcreteFactory1();
        af.createProductA();
        af.createProductB();

        ExportHeaderModel ehm = new ExportHeaderModel();
        ehm.setDepId("马上到公司");
        ehm.setExportDate("2016-08-09");
        Map<String,Collection<ExportDataModel>> mapData = new HashMap<String,Collection<ExportDataModel>>();
        Collection<ExportDataModel> collection = new ArrayList<ExportDataModel>();
        ExportDataModel edml = new ExportDataModel();
        edml.setProductId("001");
        edml.setAmount(2000);
        edml.setPrice(1000);
        ExportDataModel edml2 = new ExportDataModel();
        edml.setProductId("002");
        edml.setAmount(3000);
        edml.setPrice(2000);
        collection.add(edml);
        collection.add(edml2);
        mapData.put("销售记录表",collection);
        ExportFooterModel efm = new ExportFooterModel();
        efm.setExportUser("厉害");
        TxtBuilderImpl txtBuilder = new TxtBuilderImpl();
        Director director = new Director(txtBuilder);
        director.construct(ehm,mapData,efm);
        System.out.println("输出文本内容: \n"+txtBuilder.getResult());
    }
}
