package zoy2control.cp1_fundamentalStructure.sec3_operators;

import org.junit.Test;

/**
 * Created by zouzp on 2018/12/18.
 */
public class opratorsEg {

    @Test
    public void integerOpTest() {
        /* ·运算数分成两种：整型、浮点型*/
        int intResult = 15/7;
        double floatPointResult = 15.0/7.0;

        System.out.println("15/7 intResult：" + intResult);
        System.out.println("15.0/7.0 floatPointResult：" + floatPointResult);

        /* ·除于0也会有不同结果，整型抛异常，浮点型得到 无穷大或 NaN*/
//        int intDivZero = 15/0;// ·运行会报错
        double floatPointDivZero = 15.0/0;
//        System.out.println("15/0 intDivZero：" + intDivZero);
        System.out.println("15.0/0 floatPointDivZero：" + floatPointDivZero);
    }

    /**
     * ·不同机器结果不一致问题：浮点溢出<p></p>
     * ·测试：要在不同机器上跑这段代码，可能结果会不一样
     * <hr>
     *     ·原因：不同机器实现不一样 double d = x*y/z，先把 x*y作为中间结果存储在<p>
     *     ·80-bit的 寄存器中，然后 /z之后把 80-bit结果截断为 64-bit，作为最后 浮点计算结果<p>
     *     ·有些机器会在 计算中间结果x*y的时候就进行了 截断，导致 浮点溢出。<p></p>
     *     ·对于 扩展80-bit，Intel是 扩展指数，而不是 扩展位数
     *<hr>
     *     ·JVM的可移植性目标：因为上面 不同机器有不同 浮点计算结果，所以对于 可移植性来说是一个挑战<p>
     *     ·因此可以在代码层做控制：java中有个 关键字strcitfp可以是 浮点计算采用 严格的浮点计算，即 中间结果用 64-bit存储，而不是80-bit<p>
     *     ·但这样会导致(缺点) 浮点溢出，并且 中间结果由 80-bit截断到 64-bit过程中，影响性能。优点是 可移植性好<p>
     *     ·默认情况下，不是严格浮点计算，即 中间结果用 80-bit存储<p>
     *     ·但通常情况下，浮点溢出不是什么大问题，所以还是用 默认情况
     */
    @Test
    public void diffMachineFloatPointOverflow() {
        double d = 99999999*999999999/3;
        System.out.println(d);
    }



    /**
     * ·单目运算
     */
    @Test
    public void oneOpTest() {
        int i = 0;
        // ·在 var中，这两种没区别。因为都是看最终结果
        i++;
        ++i;
        // ·在 expression中，要注意
        System.out.println(i++);
        System.out.println(++i);
    }



    /**
     * ·三目运算
     */
    @Test
    public void threeOpTest() {
        int i = 10;
        int j = 9;

        int maxValue = (i > j ? i : j);

        /* ·其实 三元运算符可以模拟 if-else，if-else if-else if等等*/
        int a = 5;
        int maxVal = (i > j ? (i > a ? i : a) : j);
        /**
         * ·相当于
         * <pre>
         *     if (i > j) {
         *          if (i > a) {
         *              maxVal = i;
         *          } else {
         *              maxVal = a;
         *          }
         *     } else {
         *         maxVal = j;
         *     }
         * </pre>
         */
    }



    /**
     * ·关系运算
     */
    @Test
    public void relationalOpTest() {
        /* == != > < >= <=*/
        // ·注意“大于等于、小于等于”的等号在右边就可以了
    }



    /**
     * ·逻辑运算
     */
    @Test
    public void logicOpTest() {
        /* && ||*/
        // ·“短路”运算
    }



    /**
     * ·位运算
     * ·常用于 屏蔽技术、mark等
     */
    @Test
    public void bitWiseOpTest() {
        /* ·&，与*/
        /* ·|，或*/
        /* ·~，非*/
        /* ·^，异或*/
    }



    /**
     * ·移位运算
     */
    @Test
    public void moveOpTest() {
        /* ·x << bit，表示 x*2的bit次幂*/
        int i = 10;
        System.out.println("i << 2：" + (i << 2));

        /* ·x >> bit，表示 x/2的bit次幂*/
        int j = 100;
        System.out.println("j >> 3：" + (j >> 3));

        /* ·注意，只有 整型数据才可以 移位运算*/
        double d = 100.0;
//        System.out.println(d >> 3);// ·编译时报错
    }







}
