/**
 * Generated by Aster
 */
package com.ibm.websphere.samples.daytrader.impl.session2direct;

import com.ibm.websphere.samples.daytrader.impl.direct.TradeDirect;
import com.ibm.websphere.samples.daytrader.util.TradeConfig;
import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import org.junit.jupiter.api.extension.ExtendWith;

import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.mockito.junit.jupiter.MockitoSettings;
import org.mockito.quality.Strictness;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

@ExtendWith(MockitoExtension.class)
@MockitoSettings(strictness = Strictness.LENIENT)
public class Aster_DirectSLSBBean_Test_Passing {
    @Mock
    private TradeDirect tradeDirect;
    private DirectSLSBBean directslsbbean;

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testInvestmentReturn_ctMR0() {
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
    public void testCompleteOrderNullOrderID_ilxr2() throws Exception {
        DirectSLSBBean directSLSBBean = new DirectSLSBBean();
        try {
            directSLSBBean.completeOrder(null, true);
        } catch (Exception e) {
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetImpl_inTe0() {
        DirectSLSBBean directSLSBBean = new DirectSLSBBean();
        int result = directSLSBBean.getImpl();
        assertEquals(TradeConfig.SESSION_TO_DIRECT, result);
    }
}