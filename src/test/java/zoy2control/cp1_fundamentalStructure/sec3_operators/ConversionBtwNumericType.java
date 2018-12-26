package zoy2control.cp1_fundamentalStructure.sec3_operators;


import org.junit.Test;

/**
 * Created by zoypong on 2018/12/25.
 */
public class ConversionBtwNumericType {
    /**
     * ·自动转换
     */
    @Test
    public void basicConversion() {
        /**
         * ·原始类型之间的转换（小 --> 大）
         * ·byte --> short --> int
         * ·byte --> short --> int
         * ·char --> int
         * ·int --> long
         * ·int --> double
         *
         * ·有精度损失的是：
         * ·int --> float
         * ·long --> double
         * ·long --> float
         */
        int n = 123456789;// ·这是一个大数
        float f = n;// ·经过转换
        System.out.println(f);// ·大小结果一样，但精度损失
    }

    /**
     * ·两个不同类型的操作数，要进行OP之前，要先转换成同一类型，再计算
     */
    @Test
    public void diffTypeOp() {
        // ·如果一个操作数是 double --> float --> long --> int，
        // ·则 另一个操作数会转化成 double --> float --> long --> int。最不济也会转化成 int
        byte b = Byte.MAX_VALUE;// ·127
        short s = Short.MAX_VALUE;// ·32767
        System.out.println("(short)(b + s) = " + (short)(b + s));
        System.out.println("b + s = " + (b + s));// ·b、s都转化成 int
    }

    /**
     * ·强制类型转换：大转小
     */
    @Test
    public void cast() {
        double d = 9.99;
        int cast2Int = (int)d;// ·丢掉小数部分
        System.out.println("cast2Int = " + cast2Int);

        long round = Math.round(d);// ·.round()返回的是 long型
        System.out.println("round = " + round);

        int castFromRound = (int)round;// ·long --> int
        System.out.println("castFromRound = " + castFromRound);
    }
}
