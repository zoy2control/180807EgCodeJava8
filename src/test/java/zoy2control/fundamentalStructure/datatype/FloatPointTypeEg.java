package zoy2control.fundamentalStructure.datatype;

import org.junit.Test;

/**
 * Created by zouzp on 2018/12/13.
 */
public class FloatPointTypeEg {

    @Test
    public void floatEg() {
        float floatMax = Float.MAX_VALUE;// ·4-byte,32-bit,3.4028235e+38f
        float floatMin = Float.MIN_VALUE;// ·4-byte,32-bit,1.4e-45f（-3.4028235e+38f）
        System.out.println("float Max in decimalism : " + floatMax);
        System.out.println("float Min in decimalism : " + floatMin);
    }

    @Test
    public void doubleEg() {
        double doubleMax = Double.MAX_VALUE;// ·8-byte,64-bit,1.7976931348623157e+308
        double doubleMin = Double.MIN_VALUE;// ·8-byte,64-bit,4.9e-324（-1.7976931348623157e+308）
        System.out.println("double Max in decimalism : " + doubleMax);
        System.out.println("double Min in decimalism : " + doubleMin);
        System.out.println(16d);
    }
}
