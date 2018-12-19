package zoy2control.cp1_fundamentalStructure.sec2_variables;

import org.junit.Test;

/**
 * Created by zouzp on 2018/12/18.
 */
public class VariableAndConstEg {
    static final int STATIC_CONST_VAL = 1;// ·类常量。static final
    /**
     * ·变量声明之后一定要初始化
     */
    @Test
    public void varMustBeInited() {
        int i;
//        System.out.println(i);// ·var未初始化，报错。区别 类的成员变量，有 默认值
    }

    /**
     * ·常量：final关键字
     * ·类常量：static final。多个方法可用，但要写在 类内部，方法外部
     */
    @Test
    public void constTest() {
        final int CONST_VAL = 1;// ·方法内部常量。只初始化一次
        System.out.println(CONST_VAL);

//        CONST_VAL = 2;// ·对 常量赋值，会报错
    }
}
