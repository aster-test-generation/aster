/**
 * Generated by Aster
 */
package com.ibm.websphere.samples.daytrader.impl.session2direct;
import java.math.BigDecimal;
import java.util.Collection;
import java.util.concurrent.Future;
import com.ibm.websphere.samples.daytrader.interfaces.TradeServices;
import com.ibm.websphere.samples.daytrader.beans.MarketSummaryDataBean;
import com.ibm.websphere.samples.daytrader.entities.OrderDataBean;
import com.ibm.websphere.samples.daytrader.util.TradeConfig;
import static org.junit.jupiter.api.Assertions.*;
import java.util.Collection;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_DirectSLSBBean_Coverage_Test_Failing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetMarketSummary_VeIb0() throws Exception {
    DirectSLSBBean directSLSBBean = new DirectSLSBBean();
    MarketSummaryDataBean marketSummaryDataBean = directSLSBBean.getMarketSummary();
    assertNotNull(marketSummaryDataBean);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetAllQuotes_JkMI0() throws Exception {
        DirectSLSBBean directSLSBBean = new DirectSLSBBean();
        Collection<?> quotes = directSLSBBean.getAllQuotes();
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetAllQuotesSetInSessionTrue_bkHS1() throws Exception {
        DirectSLSBBean directSLSBBean = new DirectSLSBBean();
        directSLSBBean.getAllQuotes();
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetInSession_EBPP0() {
        DirectSLSBBean directSLSBBean = new DirectSLSBBean();
        try {
            directSLSBBean.setInSession(true);
            fail("Expected UnsupportedOperationException");
        } catch (UnsupportedOperationException e) {
            assertEquals("DirectSLSBBean::setInSession not supported", e.getMessage());
        }
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCancelOrder_GKkw0() throws Exception {
        DirectSLSBBean directSLSBBean = new DirectSLSBBean();
        directSLSBBean.cancelOrder(1, true);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCancelOrderTwoPhaseFalse_sobl1() throws Exception {
        DirectSLSBBean directSLSBBean = new DirectSLSBBean();
        directSLSBBean.cancelOrder(1, false);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetOrders_YItW0() throws Exception {
        DirectSLSBBean directSLSBBean = new DirectSLSBBean();
        Collection<?> orders = directSLSBBean.getOrders("userID");
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetOrdersWithSetInSession_PjiS1() throws Exception {
        DirectSLSBBean directSLSBBean = new DirectSLSBBean();
        directSLSBBean.getOrders("userID");
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetQuoteException_FgGW1() throws Exception {
        DirectSLSBBean directSLSBBean = new DirectSLSBBean();
        try {
            directSLSBBean.getQuote(null);
            fail("Expected Exception");
        } catch (Exception e) {
            assertEquals("Invalid symbol", e.getMessage());
        }
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCreateQuoteException_jzrQ1() throws Exception {
        DirectSLSBBean directSLSBBean = new DirectSLSBBean();
        try {
            directSLSBBean.createQuote(null, "companyName", new BigDecimal("price"));
            fail("Expected exception");
        } catch (Exception e) {
            assertEquals("Symbol cannot be null", e.getMessage());
        }
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testQueueOrderWithNullOrderID_FxhT2() throws Exception {
        DirectSLSBBean directSLSBBean = new DirectSLSBBean();
        try {
            directSLSBBean.queueOrder(null, true);
            fail("Expected exception");
        } catch (Exception e) {
            assertEquals("Order ID cannot be null", e.getMessage());
        }
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetAccountProfileDataNullUserID_SUaa1() throws Exception {
    DirectSLSBBean directSLSBBean = new DirectSLSBBean();
    try {
        directSLSBBean.getAccountProfileData(null);
        fail("Expected Exception");
    } catch (Exception e) {
        assertEquals("userID cannot be null", e.getMessage());
    }
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testOrderCompleted_BwUH0() throws Exception {
        DirectSLSBBean directSLSBBean = new DirectSLSBBean();
        directSLSBBean.orderCompleted("testUser", 1);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testOrderCompletedNullUserID_cdKi1() throws Exception {
        DirectSLSBBean directSLSBBean = new DirectSLSBBean();
        directSLSBBean.orderCompleted(null, 1);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testOrderCompletedNullOrderID_ZetN2() throws Exception {
        DirectSLSBBean directSLSBBean = new DirectSLSBBean();
        directSLSBBean.orderCompleted("testUser", null);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testLogout_TFnm0() throws Exception {
        DirectSLSBBean directSLSBBean = new DirectSLSBBean();
        directSLSBBean.logout("testUserID");
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetInSessionTrue_ssiE1() throws Exception {
        DirectSLSBBean directSLSBBean = new DirectSLSBBean();
        directSLSBBean.tradeDirect.setInSession(true);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testLogoutWithUserID_iidt2() throws Exception {
        DirectSLSBBean directSLSBBean = new DirectSLSBBean();
        directSLSBBean.tradeDirect.logout("testUserID");
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetHoldingException_lbQo1() throws Exception {
        DirectSLSBBean directSLSBBean = new DirectSLSBBean();
        try {
            directSLSBBean.getHolding(null);
            fail("Expected Exception");
        } catch (Exception e) {
            assertEquals("Holding ID cannot be null", e.getMessage());
        }
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCompleteOrderAsync_pylj0() throws Exception {
        DirectSLSBBean directSLSBBean = new DirectSLSBBean();
        Future<OrderDataBean> future = directSLSBBean.completeOrderAsync(1, true);
        assertNotNull(future);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testBuyWithAsyncOrderProcessingMode_klmO1() throws Exception {
    DirectSLSBBean directSLSBBean = new DirectSLSBBean();
    String userID = "test_user";
    String symbol = "test_symbol";
    double quantity = 10.0;
    int orderProcessingMode = TradeConfig.ASYNCH;
    OrderDataBean orderDataBean = directSLSBBean.buy(userID, symbol, quantity, orderProcessingMode);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSellAsync_JjNI0() throws Exception {
        DirectSLSBBean directSLSBBean = new DirectSLSBBean();
        String userID = "testUser";
        Integer holdingID = 1;
        int orderProcessingMode = TradeConfig.ASYNCH;
        OrderDataBean orderDataBean = directSLSBBean.sell(userID, holdingID, orderProcessingMode);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSellSync_czxN1() throws Exception {
        DirectSLSBBean directSLSBBean = new DirectSLSBBean();
        String userID = "testUser";
        Integer holdingID = 1;
        int orderProcessingMode = TradeConfig.SYNCH;
        OrderDataBean orderDataBean = directSLSBBean.sell(userID, holdingID, orderProcessingMode);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testPingTwoPhase_ElMb0() throws java.lang.Exception {
        DirectSLSBBean directSLSBBean = new DirectSLSBBean();
        Exception exception = assertThrows(Exception.class, () -> directSLSBBean.pingTwoPhase("symbol"));
        assertEquals("java.lang.UnsupportedOperationException", exception.getMessage());
    }
}