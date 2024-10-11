/**
 * Generated by Aster
 */
package com.ibm.websphere.samples.daytrader.impl.session2direct;

import com.ibm.websphere.samples.daytrader.entities.AccountDataBean;
import com.ibm.websphere.samples.daytrader.entities.HoldingDataBean;
import com.ibm.websphere.samples.daytrader.entities.QuoteDataBean;
import com.ibm.websphere.samples.daytrader.util.TradeConfig;
import java.math.BigDecimal;
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

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

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
    private DirectSLSBBean directslsbbean;
    private DirectSLSBBean tradeDirect;

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testUpdateQuotePriceVolume_tgkb0() throws Exception {
        DirectSLSBBean tradeDirect = mock(DirectSLSBBean.class);
        QuoteDataBean quoteDataBean = mock(QuoteDataBean.class);
        when(tradeDirect.updateQuotePriceVolume("symbol", new BigDecimal(100.0), 100.0)).thenReturn(quoteDataBean);
        QuoteDataBean result = tradeDirect.updateQuotePriceVolume("symbol", new BigDecimal(100.0), 100.0);
        assertEquals(quoteDataBean, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testgetImpl_hIvk0() {
        DirectSLSBBean directSLSBBean = new DirectSLSBBean();
        int result = directSLSBBean.getImpl();
        assertEquals(TradeConfig.SESSION_TO_DIRECT, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testgetImplWithZeroValue_SRIX3() {
        DirectSLSBBean directSLSBBean = new DirectSLSBBean();
        int result = directSLSBBean.getImpl();
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testgetImplWithNegativeValue_kuVU4() {
        DirectSLSBBean directSLSBBean = new DirectSLSBBean();
        int result = directSLSBBean.getImpl();
        assertEquals(2, result);
    }
}