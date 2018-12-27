package zoy2control.cp1_fundamentalStructure.sec3_operators;

import org.junit.Test;

/**
 * Created by zouzp on 2018/12/27.
 */
public class StringEg {

    @Test
    public void subString() {
        /**
         * <pre>
         *     subLen = endIndex - beginIndex;
         *     ((beginIndex == 0) && (endIndex == value.length)) ? this : new String(value, beginIndex, subLen);
         *     <hr>
         *         ·.subString()其实是 重新新建一个 String对象，传入 char[]、beginIndex、subLen来获取 原char[]的元素，放到新String对象上
         *         ·[beginIndex, endIndex)
         * </pre>
         */
        String s = "this is subString";
        s.substring(2,6);
    }

    @Test
    public void concat() {
        String a = "merry ";
        String b = "christmas";
        String c = a + b;
        System.out.println(c);

        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("merry ");
        stringBuilder.append("christmas");
        System.out.println(stringBuilder.toString());
    }

    @Test
    public void finalAndConcat() {
        /* ·public final class String*/
    }

    @Test
    public void emptyOrNull() {
        String empty = "";
        String nullString = null;// ·null调用方法会报错
    }

    /**
     * ·.equals()对内容，==对比引用
     */
    @Test
    public void equalBtwString() {
        // ·a/b指向 常量池同一块内存
        String a = "learning";
        String b = "learning";
        System.out.println(a.equals(b));
        System.out.println(a == b);

        String c = new String("learning");// ·新ref
        System.out.println(a.equals(c));
        System.out.println(a == c);
    }

    @Test
    public void charAtString() {
        /**
         * ·charAt()在 Charset.checkName()中有所应用
         */

        /**
         * ·Eg
         */
        String s = "target";
        int len = s.length();
        for(int i = 0; i < len; i++) {
            char c = s.charAt(i);
            if(c == 'e') {
                // ·打印从头到第一个字符e之间的字符串。.subString(beginIndex, endIndex)，其中[beginIndex, endIndex);
                System.out.println(s.substring(0,i));
            }
        }
    }
}
