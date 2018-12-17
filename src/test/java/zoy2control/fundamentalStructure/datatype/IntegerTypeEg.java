package zoy2control.fundamentalStructure.datatype;

import com.sun.beans.editors.ByteEditor;
import org.junit.Test;

/**
 * Created by zouzp on 2018/12/13.
 */
public class IntegerTypeEg {

    /**
     * ·==================Java跨平台=================
     * ·Java中 整形数据与 具体机器无关，区别 C，可能32位程序到16位系统上可能会发生溢出
     * ·因为在 JVM中对 整形数据范围已经做了限定，不同机器得到的数值范围都是一定的。
     * ·所以 Java程序对于跨平台是比较友好的
     *
     * ·比如 C/C++中，32位处理器上 long为 4-byte，而 64位处理器上 long为 8-byte
     *
     * ·Java没有 无符号类型
     */

    @Test
    public void byteEg() {
        byte byteMax = Byte.MAX_VALUE;// ·0x7f,1-byte = 8-bit
        byte byteMin = Byte.MIN_VALUE;// ·0x80,1-byte = 8-bit
        System.out.println("byte Max in decimalism : " + byteMax);
        System.out.println("byte Min in decimalism : " + byteMin);

        System.out.println("byte max value hex 2 deci:" + Byte.parseByte("7f", 16));
    }

    @Test
    public void ShortEg() {
        /* 2-byte，即16-bit 有符号，最高位为 符号位。数值计算注意避开 符号位*/
        short shortMax = Short.MAX_VALUE;// ·2-byte,16-bit,Ox7fff，除开符号位即 2^15 = 32767
        short shortMin = Short.MIN_VALUE;// ·2-byte,16-bit,Ox8000，除开符号位即 -2^15 = -32768
        System.out.println("short Max in decimalism : " + shortMax);
        System.out.println("short Min in decimalism : " + shortMin);

        /* 校验：2byte，即16-bit 无符号整数最大值如下：最小值为0*/
        int unsignedMaxShort = 1;
        for(int i = 0; i < 16; i++) {
            unsignedMaxShort *= 2;
        }
        System.out.println("unsigned Max Short:" + unsignedMaxShort);

        /**
         * 十六进制转 十进制。Long.parseLong，Short/Integer类似
         */
        /* ·eq1*/
        System.out.println("0x7fff hex 2 deci:" + Long.parseLong("7fff",16));
        System.out.println("0x8000 hex 2 deci:" + Long.parseLong("8000",16));

        /* ·eq2*/
        String hexMaxShort ="Ox7fff";
        String hexMinShort ="Ox8000";
        System.out.println("0x7fff hex 2 deci:" + Long.parseLong(hexMaxShort.substring(2),16));// ·从下标为2开始读取
        System.out.println("0x8000 hex 2 deci:" + Long.parseLong(hexMinShort.substring(2),16));
    }

    @Test
    public void IntEg() {
        int maxValue = Integer.MAX_VALUE;// ·4-byte,32-bit,0x7fffffff
        int minValue = Integer.MIN_VALUE;// ·4-byte,32-bit,0x80000000
        System.out.println("int maxValue in decimalism : " + maxValue);
        System.out.println("int minValue in decimalism : " + minValue);
    }

    /**
     * 注意后缀L
     */
    @Test
    public void LongEg() {
        long maxValue = Long.MAX_VALUE;// ·8-btye,64-bit,0x7fffffffffffffffL
        long minValue = Long.MIN_VALUE;// ·8-btye,64-bit,0x8000000000000000L
        System.out.println("long Max in decimalism ：" + maxValue);
        System.out.println("long Min in decimalism ：" + minValue);
    }
}
