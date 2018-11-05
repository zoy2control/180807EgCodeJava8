package rt.java.util.regex;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by zouzp on 2018/10/29.
 */
public class PatternTest {

    private static final Logger logger = LoggerFactory.getLogger(PatternTest.class);

    @Test
    public void test() {

    }
    /**
     * ·对字符串分割
     */
    @Test
    public void testSplitByFenhao() {
        logger.info("对字符串分割，方法一：");
        /*方法一*/
        // ·分隔符“：”
        String pattern = ":";
        Pattern compile = Pattern.compile(pattern);
        // ·带分割字符串
        String content = "aa:vv:cc`dd";
        // ·分割结果
        String[] split = compile.split(content);
        for(String item : split) {
            System.out.println(item);
        }

        /*方法二：简单*/
        String[] split1 = content.split(":");
        for(String item : split1) {
            System.out.println(item);
        }
    }
}
