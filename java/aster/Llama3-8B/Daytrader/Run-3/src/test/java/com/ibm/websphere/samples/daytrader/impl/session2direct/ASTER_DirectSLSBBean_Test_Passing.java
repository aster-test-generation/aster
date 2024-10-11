/**
 * Generated by Aster
 */
package com.ibm.websphere.samples.daytrader.impl.session2direct;
import java.math.BigDecimal;
import com.ibm.websphere.samples.daytrader.entities.AccountDataBean;
import com.ibm.websphere.samples.daytrader.entities.QuoteDataBean;
import com.ibm.websphere.samples.daytrader.util.TradeConfig;
import com.ibm.websphere.samples.daytrader.impl.direct.TradeDirect;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoSettings;
import org.mockito.quality.Strictness;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;   
@ExtendWith(MockitoExtension.class)
@MockitoSettings(strictness = Strictness.LENIENT)
public class Aster_DirectSLSBBean_Test_Passing {
@Mock
    private TradeDirect tradeDirect;
private DirectSLSBBean directslsbbean;
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testInvestmentReturn_HFjH0() {
        DirectSLSBBean directSLSBBean = new DirectSLSBBean();
        try {
            double result = directSLSBBean.investmentReturn(1.0, 2.0);
            fail("Expected UnsupportedOperationException");
        } catch (Exception e) {
            assertEquals(UnsupportedOperationException.class, e.getClass());
        }
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testRegisterNull_fWLv1() {
        DirectSLSBBean directSLSBBean = new DirectSLSBBean();
        try {
            directSLSBBean.register(null, "password", "fullname", "address", "email", "creditcard", BigDecimal.valueOf(100));
            fail("Expected exception");
        } catch (Exception e) {
        }
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCreateOrderNullHolding_nyAx3() {
        DirectSLSBBean directSLSBBean = new DirectSLSBBean();
        AccountDataBean account = new AccountDataBean();
        QuoteDataBean quote = new QuoteDataBean("symbol");
        try {
            directSLSBBean.createOrder(account, quote, null, "type", 1);
            fail("Expected Exception");
        } catch (Exception e) {
        }
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetImpl_skmp0() {
        DirectSLSBBean directSLSBBean = new DirectSLSBBean();
        int result = directSLSBBean.getImpl();
        assertEquals(TradeConfig.SESSION_TO_DIRECT, result);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testPingTwoPhase_UcMf0_YbWI1() {
    DirectSLSBBean directSLSBBean = new DirectSLSBBean();
    try {
        directSLSBBean.completeOrderAsync(1, true);
    } catch (Exception e) {
    }
}
}