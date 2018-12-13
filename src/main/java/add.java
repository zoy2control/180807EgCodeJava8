import com.sun.xml.internal.bind.v2.TODO;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * Created by zouzp on 2018/8/24.
 */
public class add {

    public static void main(String[] args) throws InterruptedException {
        new Thread() { // 断点0
            @Override
            public void run() {
                System.out.println("1"); // 断点1
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("2"); // 断点2
            }
        }.start();
        // 外线程
        System.out.println("3"); // 断点3
        Thread.sleep(1000);
        System.out.println("4"); // 断点4
    }
}
