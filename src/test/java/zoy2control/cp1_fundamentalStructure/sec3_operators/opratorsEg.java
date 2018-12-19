package zoy2control.cp1_fundamentalStructure.sec3_operators;

import org.junit.Test;

/**
 * Created by zouzp on 2018/12/18.
 */
public class opratorsEg {
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
     *     ·因此可以在代码层做控制：java中有个 关键字strcitfp可以是 浮点计算采用 严格的浮点计算，即 中间结果用 64-bit存储，而不是80-bit<p></p>
     *     ·但这样会导致(缺点) 浮点溢出，并且 中间结果由 80-bit截断到 64-bit过程中，影响性能。优点是 可移植性好<p></p>
     *     ·默认情况下，不是严格浮点计算，即 中间结果用 80-bit存储<p></p>
     *     ·但通常情况下，浮点溢出不是什么大问题，所以还是用 默认情况
     */
    @Test
    public void diffMachineFloatPointOverflow() {
        double d = 99999999*999999999/3;
        System.out.println(d);
    }

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

    @Test
    public void relationalOpTest() {
        /* == != > < >= <=*/
    }

    @Test
    public void logicOpTest() {
        /* && ||*/
    }

    @Test
    public void bitWiseOpTest() {

    }







}
