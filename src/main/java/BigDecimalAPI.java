import java.math.BigDecimal;

/**
 * Created by zouzp on 2018/9/6.
 */
public class BigDecimalAPI {
    public static void main(String[] args) {
        BigDecimal big = new BigDecimal(10);
        BigDecimal small = new BigDecimal(5);
        int result = big.compareTo(small);
        System.out.println(result);
    }
}
