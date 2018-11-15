package rt.java.basic;

import org.junit.Test;

/**
 * Created by zouzp on 2018/11/14.
 */
public class BasicGrammar {


    /**
     * ·逻辑运算符 ||与 三目运算符的顺序
     */
    @Test
    public void logicOperatorTest() {
        int i = compareTo(Integer.class, 1, 2);// ·eq1
//        int i = compareTo(Integer.class, 10, 2);// ·eq2
//        int i = compareTo(Integer.class, 2, 2);// ·eq3
        System.out.println(i);
    }
    private int compareTo(Class<?> kc, Object k, Object x) {
        int i = Integer.MIN_VALUE;// ·int的最小值
//        int i = (x == null || x.getClass() != kc ? 0 : ((Comparable)k).compareTo(x));// ·eq1
//        int i = ((x == null || x.getClass() != kc) ? 0 : ((Comparable)k).compareTo(x));// ·eq3
        if(x == null || x.getClass() != kc) {// ·eq2
            return 0;
        } else {
            i = ((Comparable)k).compareTo(x);// ·比较 k、x的大小
        }
        return i;
    }

   @Test
    public void shiftOperatorTest() {
        int oldCapacity = 10;
        int newCapacity = oldCapacity << 1;// ·右移1位：*2

        System.out.println("oldCap:" + oldCapacity);// ·注意，oldCap值不变
        System.out.println("newCap:" + newCapacity);
    }
}
