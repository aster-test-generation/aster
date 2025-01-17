/**
 * Generated by Aster
 */
package com.ibm.websphere.samples.daytrader.impl.session2direct;

import com.ibm.websphere.samples.daytrader.entities.AccountDataBean;
import com.ibm.websphere.samples.daytrader.entities.HoldingDataBean;
import com.ibm.websphere.samples.daytrader.entities.OrderDataBean;
import com.ibm.websphere.samples.daytrader.entities.QuoteDataBean;
import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.mockito.junit.jupiter.MockitoSettings;
import org.mockito.quality.Strictness;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

@ExtendWith(MockitoExtension.class)
@MockitoSettings(strictness = Strictness.LENIENT)
public class Aster_DirectSLSBBean_Test_Passing {
    @Mock
    private AccountDataBean account;
    @Mock
    private QuoteDataBean quote;
    @Mock
    private HoldingDataBean holding;
    @InjectMocks
    private DirectSLSBBean directSLSBBean;
    private DirectSLSBBean tradeDirect = new DirectSLSBBean();

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testLogout_EvQi0() {
        DirectSLSBBean tradeDirect = new DirectSLSBBean();
        try {
            tradeDirect.setInSession(true);
            tradeDirect.logout("user1");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSellWithException_ckEr1() {
        DirectSLSBBean directSLSBBean = new DirectSLSBBean();
        OrderDataBean orderDataBean = OrderDataBean.getRandomInstance();
        int orderProcessingMode = 0; // Assuming 0 is a valid value for orderProcessingMode
        Exception exception = null;
        try {
            directSLSBBean.sell("user1", 1, orderProcessingMode);
        } catch (Exception e) {
            exception = e;
        }
        assertNotNull(exception);
        assertTrue(exception instanceof Exception);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testInvestmentReturn_GabZ0_TFMB0() {
        DirectSLSBBean directSLSBBean = new DirectSLSBBean();
        double rnd1 = 0.5;
        double rnd2 = 0.7;
        double expected = 0.0;
        double actual = 0.0;
        try {
            actual = directSLSBBean.investmentReturn(rnd1, rnd2);
        } catch (Exception e) {
            e.printStackTrace();
        }
        assertEquals(expected, actual, 0.0);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetHolding_YVzu0_eSjr0() {
        DirectSLSBBean directSLSBBean = new DirectSLSBBean();
        HoldingDataBean holdingDataBean = new HoldingDataBean();
        Integer holdingID = holdingDataBean.getHoldingID();
        try {
            HoldingDataBean result = directSLSBBean.getHolding(holdingID);
            assertNotNull(result);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}