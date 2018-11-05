import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;


/**
 * Created by zouzp on 2018/9/5.
 */
public class DateAPI {
    public static void main(String[] args) {
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
        // ·今天的日期，精确到天
        Date today = new Date();
        String out = df.format(today);
        System.out.println(out);

        // ·天数加1
        Calendar calendar = Calendar.getInstance();
        // ·set
        calendar.setTime(today);
        calendar.add(Calendar.DAY_OF_MONTH,1);
        // ·get
        Date tomorrow = calendar.getTime();
        out = df.format(tomorrow);
        System.out.println(out);
    }
}
