package rt.java.util.lang.Thread;

import java.util.concurrent.TimeUnit;

/**
 * Created by zouzp on 2018/12/12.
 */
public class Thread_181212 implements Runnable{
    @Override
    public void run() {
        Thread thread = Thread.currentThread();
        System.out.println(thread.getName() + "------进入");

        try {
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            System.out.println(thread.getName() + "-------退出");
        }
    }
}
