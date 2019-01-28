package zoy2control.cp1_fundamentalStructure.sec3_operators;

import org.junit.Test;

import javax.xml.transform.Source;
import java.util.Currency;

/**
 * Created by zouzp on 2019/1/4.
 */

public class ControlFlow {
    @Test
    @SuppressWarnings("fallthrough")
    public void caseEg() {
        int count = 1;
        switch(count) {
            case 1 :
                System.out.println("1");
            case 2:
                System.out.println("2");break;
        }
    }

    class SourceId {
        private String bsId;
        private String customerId;

        SourceId(){};
        SourceId(String bsId, String customerId) {
            this.bsId = bsId;
            this.customerId = customerId;
        }

        public void setBsId(String bsId) {
            this.bsId = bsId;
        }
        public void setCustomerId(String customerId) {
            this.customerId = customerId;
        }
        public String getBsId() {
            return this.bsId;
        }
        public String getCustomerId() {
            return this.customerId;
        }
    }

    @Test
    public void ifElseifEg() {
        SourceId sourceId = new SourceId("B123","C123");
        System.out.println("bs_id:" + sourceId.getBsId() + " " + "customerId:" + sourceId.getCustomerId());
        if (sourceId.getBsId() != null) {
            System.out.println("if成立的话，不走 else-if");
        } else if (sourceId.getCustomerId() != null) {
            System.out.println("此处 else-if不被执行，即便 else-if的条件是可以成立的，但 if条件优先成立了");
        }
    }
}
