package zoy2control.cp1_fundamentalStructure.sec3_operators;

import org.junit.Test;

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
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("what's your name");
        String name = scanner.nextLine();

        System.out.print("how old are you");
        int age = scanner.nextInt();

        System.out.print(name + ":" + age);
    }
}
