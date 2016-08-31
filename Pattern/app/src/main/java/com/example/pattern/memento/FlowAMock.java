package com.example.pattern.memento;

/**
 * Created by wuyue on 16/8/31.
 * 模拟运行流程A
 */
public class FlowAMock {
    /**
     * 流程名称,不需要外部存储的状态数据
     */
    private String flowName;
    /**
     * 代指某个中间结果,需要外部存储的状态数据
     */
    private int tempResult;
    /**
     * 代指某个中间的结果,需要外部存储的状态数据
     */
    private String tempState;

    /**
     * 构造方法,传入流程名称
     * @param flowname
     */
    public FlowAMock(String flowname){
        this.flowName = flowname;
    }

    /**
     * 运行流程的第一个阶段
     */
    public void runPaseOne(){
        tempResult = 3;
        tempState = "PhaseOne";
    }

    /**
     * 运行流程后半部分
     */
    public void schema1(){
        this.tempState +=",schemal";
        System.out.println(this.tempState+":run now"+tempResult);
        this.tempState += 11;
    }

    /**
     * 按照方案二运行流程后半部分
     */
    public void schema2(){
        this.tempState += ",Schema2";
        System.out.println(this.tempState + ": now run" + tempResult);
        this.tempResult += 22;
    }

    /**
     * 创建保存原发器对象状态的备忘录对象
     * @return
     */
    public FlowAMockMemento createMemento(){
        return new MementoImpl(tempResult,tempState);
    }

    /**
     * 重新设置原发器对象的状态,让其回到备忘录对象记录的状态
     * @param memento
     */
    public void setMemento(FlowAMockMemento memento){
        MementoImpl memento1 = (MementoImpl)memento;
        this.tempResult = memento1.tempResult;
        this.tempState = memento1.tempState;
    }

    /**
     * 真正的备忘录对象,实现备忘录窄接口
     * 实现成私有的内部类,不让外部访问
     */
    private static class MementoImpl implements FlowAMockMemento{
        private int tempResult;
        private String tempState;

        public MementoImpl(int tempResult,String tempState){
            this.tempResult = tempResult;
            this.tempState = tempState;
        }

        public int getTempResult(){
            return tempResult;
        }

        public String getTempState(){
            return tempState;
        }
    }
}
