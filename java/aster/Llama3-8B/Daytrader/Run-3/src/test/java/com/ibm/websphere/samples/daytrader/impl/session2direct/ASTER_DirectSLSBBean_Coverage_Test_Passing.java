/**
 * Generated by Aster
 */
package com.ibm.websphere.samples.daytrader.impl.session2direct;
import java.util.Collection;
import com.ibm.websphere.samples.daytrader.interfaces.TradeServices;
import com.ibm.websphere.samples.daytrader.entities.HoldingDataBean;
import com.ibm.websphere.samples.daytrader.entities.OrderDataBean;
import com.ibm.websphere.samples.daytrader.entities.QuoteDataBean;
import com.ibm.websphere.samples.daytrader.util.TradeConfig;
import com.ibm.websphere.samples.daytrader.impl.direct.TradeDirect;
import static org.junit.jupiter.api.Assertions.*;
import java.util.ArrayList;
import java.util.Collection;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_DirectSLSBBean_Coverage_Test_Passing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testInvestmentReturn_hBIj0() throws java.lang.Exception {
        DirectSLSBBean directSLSBBean = new DirectSLSBBean();
        try {
            double result = directSLSBBean.investmentReturn(1.0, 2.0);
            fail("Expected UnsupportedOperationException");
        } catch (Exception e) {
            if (!(e instanceof UnsupportedOperationException)) {
                fail("Expected UnsupportedOperationException");
            }
        }
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCreateOrderWithNullAccount_zyrZ1() throws Exception {
        DirectSLSBBean directSLSBBean = new DirectSLSBBean();
        QuoteDataBean quote = new QuoteDataBean("symbol");
        HoldingDataBean holding = new HoldingDataBean();
        String orderType = "buy";
        double quantity = 10.0;
        try {
            directSLSBBean.createOrder(null, quote, holding, orderType, quantity);
            fail("Expected NullPointerException");
        } catch (NullPointerException e) {
        }
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testPingTwoPhase_ElMb0_1() throws java.lang.Exception {
        DirectSLSBBean directSLSBBean = new DirectSLSBBean();
        Exception exception = assertThrows(Exception.class, () -> directSLSBBean.pingTwoPhase("symbol"));}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetImpl_KqbS0() {
        DirectSLSBBean directSLSBBean = new DirectSLSBBean();
        int result = directSLSBBean.getImpl();
        assertEquals(TradeConfig.SESSION_TO_DIRECT, result);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSellNullUserID_cwNA2() throws Exception {
        DirectSLSBBean directSLSBBean = new DirectSLSBBean();
        Integer holdingID = 1;
        int orderProcessingMode = TradeConfig.ASYNCH;
        try {
            directSLSBBean.sell(null, holdingID, orderProcessingMode);
            Assertions.fail("Expected NullPointerException");
        } catch (NullPointerException e) {
        }
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSellNullHoldingID_YpRi3() throws Exception {
        DirectSLSBBean directSLSBBean = new DirectSLSBBean();
        String userID = "testUser";
        int orderProcessingMode = TradeConfig.ASYNCH;
        try {
            directSLSBBean.sell(userID, null, orderProcessingMode);
            Assertions.fail("Expected NullPointerException");
        } catch (NullPointerException e) {
        }
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSellInvalidOrderProcessingMode_QIYR4() throws Exception {
        DirectSLSBBean directSLSBBean = new DirectSLSBBean();
        String userID = "testUser";
        Integer holdingID = 1;
        int orderProcessingMode = -1;
        try {
            directSLSBBean.sell(userID, holdingID, orderProcessingMode);
            Assertions.fail("Expected Exception");
        } catch (Exception e) {
        }
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetInSession_EBPP0_fid1() {
        DirectSLSBBean directSLSBBean = new DirectSLSBBean();
        try {
            directSLSBBean.setInSession(true);
            fail("Expected UnsupportedOperationException");
        } catch (UnsupportedOperationException e) {
            assertEquals("DirectSLSBBean::setInGlobalTxn not supported", e.getMessage());
        }
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetClosedOrders_ZmgF0() throws Exception {
        DirectSLSBBean directSLSBBean = new DirectSLSBBean();
        TradeDirect tradeDirect = mock(TradeDirect.class);
        when(tradeDirect.getClosedOrders("userID")).thenReturn(new ArrayList<>());
        directSLSBBean.tradeDirect = tradeDirect;
        Collection<?> closedOrders = directSLSBBean.getClosedOrders("userID");
        verify(tradeDirect, times(1)).setInSession(true);
        verify(tradeDirect, times(1)).getClosedOrders("userID");
        assertEquals(new ArrayList<>(), closedOrders);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetClosedOrdersException_rEVr1() throws Exception {
        DirectSLSBBean directSLSBBean = new DirectSLSBBean();
        TradeDirect tradeDirect = mock(TradeDirect.class);
        when(tradeDirect.getClosedOrders("userID")).thenThrow(new Exception("Exception"));
        directSLSBBean.tradeDirect = tradeDirect;
        try {
            directSLSBBean.getClosedOrders("userID");
            fail("Expected Exception");
        } catch (Exception e) {
            assertEquals("Exception", e.getMessage());
        }
        verify(tradeDirect, times(1)).setInSession(true);
        verify(tradeDirect, times(1)).getClosedOrders("userID");
    }
}