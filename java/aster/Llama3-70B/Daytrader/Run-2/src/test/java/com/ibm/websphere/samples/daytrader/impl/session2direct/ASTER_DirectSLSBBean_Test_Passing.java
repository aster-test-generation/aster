/**
 * Generated by Aster
 */
package com.ibm.websphere.samples.daytrader.impl.session2direct;
import java.math.BigDecimal;
import com.ibm.websphere.samples.daytrader.interfaces.TradeServices;
import com.ibm.websphere.samples.daytrader.entities.AccountDataBean;
import com.ibm.websphere.samples.daytrader.entities.HoldingDataBean;
import com.ibm.websphere.samples.daytrader.entities.OrderDataBean;
import com.ibm.websphere.samples.daytrader.entities.QuoteDataBean;
import com.ibm.websphere.samples.daytrader.util.TradeConfig;
import com.ibm.websphere.samples.daytrader.impl.direct.TradeDirect;
import static org.junit.jupiter.api.Assertions.*;
import java.util.Date;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.mockito.Mockito.*;
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
public void testInvestmentReturn_iQRh0() {
    DirectSLSBBean directSLSBBean = new DirectSLSBBean();
    try {
        double result = directSLSBBean.investmentReturn(Math.random(), Math.random());
        Assertions.assertTrue(result >= 0);
    } catch (Exception e) {
    }
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSetInSession_Yhuw0() {
    DirectSLSBBean directSLSBBean = new DirectSLSBBean();
    try {
        directSLSBBean.setInSession(true);
        Assertions.fail("Expected UnsupportedOperationException");
    } catch (UnsupportedOperationException e) {
        Assertions.assertEquals("DirectSLSBBean::setInGlobalTxn not supported", e.getMessage());
    }
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetImpl_parg0() {
    DirectSLSBBean directSLSBBean = new DirectSLSBBean();
    int result = directSLSBBean.getImpl();
    assertEquals(TradeConfig.SESSION_TO_DIRECT, result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testcreateOrder_uoMD0() throws Exception {
    directslsbbean = new DirectSLSBBean();
    directslsbbean.tradeDirect = tradeDirect;
    AccountDataBean account = new AccountDataBean();
    QuoteDataBean quote = new QuoteDataBean("symbol");
    java.util.Date date = new java.util.Date();
    HoldingDataBean holding = new HoldingDataBean(10.0, BigDecimal.valueOf(100.0), java.util.Date.from(date.toInstant()), account, quote);
    String orderType = "BUY";
    double quantity = 10.0;
    OrderDataBean expectedOrder = new OrderDataBean();
    when(tradeDirect.createOrder(account, quote, holding, orderType, quantity)).thenReturn(expectedOrder);
    OrderDataBean actualOrder = directslsbbean.createOrder(account, quote, holding, orderType, quantity);
    verify(tradeDirect, times(1)).createOrder(account, quote, holding, orderType, quantity);
    assertEquals(expectedOrder, actualOrder);
}
}