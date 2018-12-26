package zoy2control.cp1_fundamentalStructure.sec3_operators;

import org.junit.Test;

/**
 * ·符号优先级
 * ··优先级：括号 > 一元运算 > 乘除加减 > 移位 > 关系(< <= > >= instanceof) > == != > 位运算 > 逻辑运算
 * Created by zoypong on 2018/12/25.
 */
public class OperatorHierarchy {
    /**
     * ·括号 > 一元运算
     */
    @Test
    public void test01() {
        int a = 1;
        int b = 2;
        int c = (a + b++);
        System.out.println("(a + b++) = " + c);
        System.out.println("b = " + b);
    }



    /**
     * ·一元运算 > 乘除加减。注意，i++和 ++i，只有 ++i生效
     */
    @Test
    public void test02() {
        int a = 2;
        int b = 2;
        int c = a * b++;
        System.out.println("(a * b++) = " + c);

        int d = 3;
        int e = 4;
        int f = d * ++e;
        System.out.println("(d * ++e) = " + f);
    }



    /**
     * ·乘除加减 > 移位
     */
    @Test
    public void test03() {
        int a = 2;
        int b = 3;
        int c = a + b << 2;// ·等效于(a + b) << 2
        System.out.println("a + b << 2 = " + c);
        System.out.println("等效于 (a + b) << 2 = " + c);
    }



    /**
     * ·移位 > 关系
     */
    @Test
    public void test04() {
        int a = 3;
        boolean b = 12 == a << 2;// ·等效于 12 == (a << 2)

        System.out.println(b);
    }

    /**
     * ·关系(< <= > >= instanceof) > == != > 位运算
     * ·PS：如果两个或多个运算符之间，操作符涉及到 类型转换，以 返回类型为准。
     * ·所以可以根据 返回类型来判断 操作符的顺序，比如 != & ==》 不行
     */
    @Test
    public void test05() {
        int a = 2;
        int b = 3;
        boolean b1 = a != b & false;// ·等效于(a != b) & false
        System.out.println(b1);
    }

    /**
     * ·位运算 > 逻辑运算
     */
    @Test
    public void test06() {
        int a = 2;
        int b = 3;

    }
}
