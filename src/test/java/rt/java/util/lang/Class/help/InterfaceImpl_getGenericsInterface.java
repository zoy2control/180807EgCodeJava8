package rt.java.util.lang.Class.help;

/**
 * Created by zouzp on 2018/11/14.
 */
public class InterfaceImpl_getGenericsInterface<ZoyA, ZoyB> implements InterfaceA_getGetenicsInterface<ZoyA, ZoyB>, InterfaceB_getGenericsInterface {
    private ZoyA A;
    private ZoyB B;

    @Override
    public ZoyA getA() {
        return A;
    }

    @Override
    public ZoyB getB() {
        return B;
    }

    @Override
    public void sayInterface() {
        System.out.println("------------------------interface------------------------");
    }

}
