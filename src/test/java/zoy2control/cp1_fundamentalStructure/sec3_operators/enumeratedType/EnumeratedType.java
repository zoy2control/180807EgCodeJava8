package zoy2control.cp1_fundamentalStructure.sec3_operators.enumeratedType;


import org.junit.Test;

/**
 * Created by zouzp on 2018/12/26.
 */
public class EnumeratedType {
    public enum COLOR {
        RED,
        GREEN,
        BULE
    }

    /**
     * ·用于 statement
     * @param num
     */
    @Test
    public void enumEg(int num) {
        String color = COLOR.RED.toString();
        switch(num) {
            case 0:
                color = COLOR.RED.toString();break;
            case 1:
                color = COLOR.GREEN.toString();break;
            case 2:
                color = COLOR.BULE.toString();break;
        }
    }


    /* ·psvm可以执行，而 @Test不行。？？？原因：*/
    @Test
    public void enumWithMethod() {
//        EnumWithMethod enumWithMethod = new EnumWithMethod("RED",1);
    }

    public static void main(String[] args) {
        EnumWithMethod red = EnumWithMethod.RED;
        System.out.println(red.toString());
    }

}
