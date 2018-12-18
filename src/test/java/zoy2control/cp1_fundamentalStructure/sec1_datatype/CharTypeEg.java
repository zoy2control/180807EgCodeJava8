package zoy2control.cp1_fundamentalStructure.sec1_datatype;

import org.junit.Test;

/**
 * ·单字符
 * <hr>
 * ·总的来说 标准ASCII只有 8-bit，最高位作为 奇偶校验位，所以 2^7=128种字符，涵盖 英文字母大小写、数字0-9、标点符号和 美式英语的特殊控制字符
 * ·后来 因为字符限制，扩展了8-bit，所以这个是 扩展ASCII。
 * <hr>
 *
 * @see <a href="https://baike.baidu.com/item/ASCII/309296?fr=aladdin#reference-[4]-15482-wrap">ASCII--百度百科</a>
 *
 * Created by zouzp on 2018/12/18.
 */
public class CharTypeEg {
    /**
     * ·char，2-byte，16-bit，字母、数字各占一个byte
     */
    @Test
    public void char2ASCIIEg() {
        char cTmp_a = 'a';
        int iTmp_a = cTmp_a;
        System.out.println("a：" + iTmp_a);

        Integer iTmp_z = new Integer('z');// ·注意，单引号
        System.out.println("z：" + iTmp_z);

        Integer iTmp_A = new Integer('A');
        System.out.println("A：" + iTmp_A);

        Integer iTmp_Z = new Integer('Z');
        System.out.println("Z：" + iTmp_Z);

        Integer iTmp_0 = new Integer('0');
        System.out.println("0：" + iTmp_0);

        Integer iTmp_9 = new Integer('9');
        System.out.println("9：" + iTmp_9);

    }

    @Test
    public void ascii2Char() {
        /* ·无限循环，适可而止就好，哈哈哈*/
        int i = 0;
        while(true) {
            System.out.print((char)i + " ");// ·int --> char，数字背后的 字符
            i++;
            if(i % 100 == 0) {// ·每100个字符就换行
                System.out.println();
            }
        }
    }
}
