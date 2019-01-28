package zoy2control.cp1_fundamentalStructure.sec3_operators;

import org.junit.Test;

import javax.sound.midi.Soundbank;
import java.io.Console;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Date;
import java.util.Properties;
import java.util.Scanner;

/**
 * Created by zouzp on 2018/12/27.
 */
public class InputAndOutput {
    @Test
    public void scannerEg() {
        /* ·对于不是 java.lang下的 java文件，引用的时候需要 import显示导入*/
        /* ·GUI输入输出区别 控制台输入输出*/

        /* ·标准输入流 System.in */
        /**
         * <pre>
         *     Scanner类：
         *     .next(),下一个单词（空格符分界）
         *     .nextLine()，下一行单词（分隔符分界）
         *     .nextInt()/.nextDouble()，下一个整形、浮点型字符序列
         * </pre>
         */
    }

    public static void main(String[] args) {
        /* ·这段代码执行到 scanner.nextLine()会等待，我们可以在 console上直接输入，作为 System.in*/
        Scanner scanner = new Scanner(System.in);
        System.out.println("what's your name");
        String name = scanner.nextLine();

        System.out.println("how old are you");
        int age = scanner.nextInt();

        System.out.println(name + ":" + age);
    }


    /**
     * ·格式化输出
     */
    @Test
    public void outputEg() {
        /* ·以%字符开始的 格式说明符都需要 相应参数替换（d,s,f）*/
        System.out.printf("%d",100000);// ·十进制整数
        System.out.println();
        System.out.printf("%s",100000);// ·字符串
        System.out.println();
        System.out.printf("%.2f",100000.0);// ·浮点型
        System.out.println();
        System.out.printf("%,.2f",100000.0);// ·按","分割的浮点型
        System.out.println();
        System.out.printf("%,(.2f",-100000.0);// ·把负数用()括起来
        System.out.println();

        System.out.printf("%tc", new Date());// ·c完整时间
    }

    /**
     * ·读取文件
     * @throws IOException
     */
    @Test
    public void fileOutput() throws IOException {
        /* ·对文件进行读取，需要用 File对象构建 Scanner对象*/
        Path filePath = Paths.get("E:\\fileOutputTest.txt");// ·双反斜杠
        Scanner sc = new Scanner(filePath);
        System.out.println(sc.nextLine());
    }

    /* ·若用 不存在的文件创建一个Scanner对象，或 用一个不能被创建的文件名创建一个PrinterWriter对象，会
    * 有异常，FileNotFoundException*/
    /**
     * ·写入文件，文件位于 相对路径
     * @throws FileNotFoundException
     */
    @Test
    public void fileInputRelatively() throws FileNotFoundException{
        /* ·要 写入文件，需要构建 PrintWirter对象。构造器内直接指定 文件名，
        如果用java命令启动程序，如 java xxx，则 该文件位于 Java虚拟机启动路径的相对位置（命令解释器的当前路径）；
        如果 集成环境，则是 由集成环境控制。此处 IDEA是 当前项目路径下*/
        PrintWriter pw = new PrintWriter("fileOutputTest.txt");// ·在 E:\180807EgCodeJava8下。如果文件不存在，会创建新的

        /* ·可以使用 .getProperty()找到当前路径*/
        String property = System.getProperty("user.dir");
        System.out.println(property);
    }

    /**
     * ·写入文件，文件位于 绝对路径
     * @throws FileNotFoundException
     */
    @Test
    public void fileInputAbsolutely() throws FileNotFoundException {
        /* ·如果觉得 定位文件觉得麻烦，可以使用 绝对路径*/
        PrintWriter pw = new PrintWriter("E:\\fileOutputTest.txt");// ·绝对路径
        pw.write("printWriter");
        pw.flush();// ·刷新流，将数据写入文件
        pw.close();// ·关闭流并 释放占用的相关资源
    }
}
