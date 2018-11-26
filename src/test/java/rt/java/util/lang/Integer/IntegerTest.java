package rt.java.util.lang.Integer;

import org.junit.Test;

/**
 * Created by zouzp on 2018/11/26.
 */
public class IntegerTest {
    @Test
    public void test01() {
        Integer a = 99, b = 99;
        Integer c = 999,d = 999;

        System.out.println("a == b结果是：" + Boolean.toString(a == b));
        System.out.println("c == d结果是：" + Boolean.toString(c == d));

        // ·-XX:AutoBoxCacheMax=1000，可以扩大 自动装箱、拆箱范围
    }
}
