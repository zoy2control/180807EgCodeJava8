package rt.java.util.lang.Array;

import org.junit.Test;

import java.util.ArrayList;

/**
 * Created by zouzp on 2018/12/3.
 */
public class ArrayEg {
    @Test
    public void test01() {
        /**
         *  ·数组初始化
         */
//        char[] chars = new char[];// ·初始化数组必须明确指定 长度
        char[] a = new char[10];// ·eq1
        char[] b = {'1', '2'};// ·eq2


        /**
         * ·可不指定长度，用 集合
         */
//        ArrayList<int> ints = new ArrayList<int>;// ·但集合的泛型不可以是 int/char/long等自带类型，而是要对象
        ArrayList<Integer> integerArrayList = new ArrayList<>();
    }

    /**
     * ·数组和 String之间转换
     */
    @Test
    public void testConvertArrayBtwString() {
        /* ·char[]转 String*/
        char[] c = new char[10];
        String s = new String(c);// ·eq1
        String s1 = String.valueOf(c);// ·eq2

        /* ·String转 char[]*/
        char[] stringChars = s.toCharArray();
    }
}
