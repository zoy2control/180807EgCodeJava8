package zoy2control.fundamentalStructure.datatype;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by zouzp on 2018/12/13.
 */
public class FloatPointTypeEg {

    /**
     * ·JDK 5.0之后，可以用 十六进制表示 浮点型，p表示 指数。而 十进制中 e表示 指数
     * ·尾数为 十六进制，指数为 十进制（其中 指数基数是2，而不是10）
     */

    @Test
    public void floatEg() {
        float floatMax = Float.MAX_VALUE;// ·4-byte,32-bit,3.4028235e+38f
        float floatMin = Float.MIN_VALUE;// ·4-byte,32-bit,1.4e-45f（-3.4028235e+38f）
        System.out.println("float Max in decimalism : " + floatMax);
        System.out.println("float Min in decimalism : " + floatMin);
        System.out.println(14f);// ·f后缀
    }

    @Test
    public void doubleEg() {
        double doubleMax = Double.MAX_VALUE;// ·8-byte,64-bit,1.7976931348623157e+308
        double doubleMin = Double.MIN_VALUE;// ·8-byte,64-bit,4.9e-324（-1.7976931348623157e+308）
        System.out.println("double Max in decimalism : " + doubleMax);
        System.out.println("double Min in decimalism : " + doubleMin);
        System.out.println(16d);// ·d后缀
    }

    /**
     * ·三个特殊 浮点值，表示 溢出或 出错情况
     * ·PS：所以 浮点计算都要符合 IEEE 754规范
     */
    @Test
    public void computeFloatPointData() {
        double NaN = Double.NaN;// ·不是一个数字
        double positiveInfinity = Double.POSITIVE_INFINITY;// ·正无穷
        double negativeInfinity = Double.NEGATIVE_INFINITY;// ·负无穷

        System.out.println("正无穷：" + 1/0.0);
        System.out.println("负无穷：" + -1/0.0);
        System.out.println("不是一个数字：" + Math.sqrt(-1.0));

        System.out.println("isPositiveInfinity：" + (positiveInfinity == (1/0.0)));
        System.out.println("isNegativeInfinity：" + (negativeInfinity == (-1/0.0)));
        System.out.println("isNaN：" + (NaN == Math.sqrt(-1.0)));// ·注意，不能这样检测 一个特殊值是否等于 NaN，永远是 false
        System.out.println("isNaN：" + (Double.isNaN(Math.sqrt(-1.0))));// ·而需要这样检测 该特殊值是否为 NaN
    }
}
