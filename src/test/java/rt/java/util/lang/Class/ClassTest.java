package rt.java.util.lang.Class;

import org.junit.Test;
import rt.java.util.lang.Class.help.InterfaceImpl_getGenericsInterface;
import rt.java.util.lang.Class.help.ZoyA;
import rt.java.util.lang.Class.help.ZoyB;

import java.lang.reflect.Type;

/**
 * Created by zouzp on 2018/11/14.
 */
public class ClassTest {
//    private static final Logger logger = LoggerFactory.getLogger(Class.class);


    /**
     * ·.getGenericInterfaces()返回本类直接实现的接口，包含 泛型信息
     * ·.getInterfaces()返回本类直接实现的接口，不包含 泛型信息
     */
    @Test
    public void getIntefaceTest() {
        InterfaceImpl_getGenericsInterface<ZoyA, ZoyB> tmp = new InterfaceImpl_getGenericsInterface();

        // ·注意 返回type都是不一样的：Type[]和 Class<?>[]
        Type[] genericInterfaces = tmp.getClass().getGenericInterfaces();// ·包含了 泛型信息
        Class<?>[] interfaces = tmp.getClass().getInterfaces();

        System.out.println("===================getGenericInterfaces===================");
        for (Type item : genericInterfaces) {
            System.out.println(item);
        }
        System.out.println("===================getInterfaces===================");
        for(Class<?> item : interfaces) {
            System.out.println(item);
        }
    }
}
