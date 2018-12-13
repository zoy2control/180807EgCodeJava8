package rt.java.util.lang.Thread;

/**
 * Created by zouzp on 2018/12/12.
 */
public class ThreadCaller_181212 {
    public static void main(String[] args) {
        Thread_181212 myThread = new Thread_181212();

        Thread thread01 = new Thread(myThread, "Thread01");
        Thread thread02 = new Thread(myThread, "Thread02");
        Thread thread03 = new Thread(myThread, "Thread03");

        thread01.start();
        thread02.start();
        thread03.start();
    }
}
