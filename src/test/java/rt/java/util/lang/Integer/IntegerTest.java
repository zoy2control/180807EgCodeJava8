package rt.java.util.lang.Integer;

import org.junit.Test;

/**
 * Created by zouzp on 2018/11/26.
 */
public class IntegerTest {

    /**
     * ·对象引用的 ==
     */
    @Test
    public void test01() {
        Integer a = 99, b = 99;
        Integer c = 999,d = 999;

        System.out.println("a == b结果是：" + Boolean.toString(a == b));
        System.out.println("c == d结果是：" + Boolean.toString(c == d));

        // ·虚拟机选项添加 -XX:AutoBoxCacheMax=1000，可以扩大 自动装箱、拆箱范围
    }

    @Test
    public void test02() {
        Integer a = new Integer(99);
        Integer b = new Integer(99);
        System.out.println("a == b结果是：" + Boolean.toString(a == b));// ·注意 a,b是引用，而不是 实际值
    }
}
