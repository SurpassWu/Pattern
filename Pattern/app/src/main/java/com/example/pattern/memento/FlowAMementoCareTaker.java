package com.example.pattern.memento;

/**
 * Created by wuyue on 16/8/31.
 * 负责保存模拟运行流程A的对象的备忘录对象
 */
public class FlowAMementoCareTaker {
    /**
     * 记录被保存的对象
     */
    private FlowAMockMemento memento = null;

    /**
     * 保存备忘录对象
     * @param mockMemento 被保存的备忘录对象
     */
    public void saveMemento(FlowAMockMemento mockMemento){
        this.memento = mockMemento;
    }

    /**
     * 获取被保存的备忘录对象
     * @return
     */
    public FlowAMockMemento retriveMemento(){
        return this.memento;
    }
}
