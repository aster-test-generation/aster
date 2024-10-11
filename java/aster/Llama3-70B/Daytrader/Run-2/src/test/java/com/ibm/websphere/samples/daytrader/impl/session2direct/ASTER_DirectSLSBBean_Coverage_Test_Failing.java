/**
 * Generated by Aster
 */
package com.ibm.websphere.samples.daytrader.impl.session2direct;
import java.util.concurrent.Future;
import com.ibm.websphere.samples.daytrader.interfaces.TradeServices;
import com.ibm.websphere.samples.daytrader.entities.OrderDataBean;
import com.ibm.websphere.samples.daytrader.util.TradeConfig;
import com.ibm.websphere.samples.daytrader.impl.direct.TradeDirect;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_DirectSLSBBean_Coverage_Test_Failing {
private TradeDirect tradeDirect;
private DirectSLSBBean directSLSBBean;
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testBuy_AsyncOrderProcessingMode_EEMI2() throws Exception {
        DirectSLSBBean directSLSBBean = new DirectSLSBBean();
        TradeDirect tradeDirect = mock(TradeDirect.class);
        directSLSBBean.tradeDirect = tradeDirect;
        OrderDataBean orderDataBean = mock(OrderDataBean.class);
        when(tradeDirect.buy("userID", "symbol", 10.0, TradeConfig.ASYNCH)).thenReturn(orderDataBean);
        directSLSBBean.buy("userID", "symbol", 10.0, TradeConfig.ASYNCH);
        verify(directSLSBBean).completeOrderAsync(orderDataBean.getOrderID(), false);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testBuy_SynchOrderProcessingMode_PfTp3() throws Exception {
        DirectSLSBBean directSLSBBean = new DirectSLSBBean();
        TradeDirect tradeDirect = mock(TradeDirect.class);
        directSLSBBean.tradeDirect = tradeDirect;
        OrderDataBean orderDataBean = mock(OrderDataBean.class);
        when(tradeDirect.buy("userID", "symbol", 10.0, TradeConfig.SYNCH)).thenReturn(orderDataBean);
        directSLSBBean.buy("userID", "symbol", 10.0, TradeConfig.SYNCH);
        verify(directSLSBBean, never()).completeOrderAsync(orderDataBean.getOrderID(), false);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSell_SetInSession_AkRt0() throws Exception {
        DirectSLSBBean directSLSBBean = new DirectSLSBBean();
        TradeDirect tradeDirect = mock(TradeDirect.class);
        directSLSBBean.tradeDirect = tradeDirect;
        directSLSBBean.sell("userID", 1, TradeConfig.ASYNCH);
        verify(tradeDirect).setInSession(true);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSell_TradeDirectSell_ffDW1() throws Exception {
        DirectSLSBBean directSLSBBean = new DirectSLSBBean();
        TradeDirect tradeDirect = mock(TradeDirect.class);
        directSLSBBean.tradeDirect = tradeDirect;
        OrderDataBean orderDataBean = mock(OrderDataBean.class);
        when(tradeDirect.sell("userID", 1, TradeConfig.ASYNCH)).thenReturn(orderDataBean);
        OrderDataBean result = directSLSBBean.sell("userID", 1, TradeConfig.ASYNCH);
        assertEquals(orderDataBean, result);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSell_AsyncOrderProcessingMode_MatL2() throws Exception {
        DirectSLSBBean directSLSBBean = new DirectSLSBBean();
        TradeDirect tradeDirect = mock(TradeDirect.class);
        directSLSBBean.tradeDirect = tradeDirect;
        OrderDataBean orderDataBean = mock(OrderDataBean.class);
        when(tradeDirect.sell("userID", 1, TradeConfig.ASYNCH)).thenReturn(orderDataBean);
        directSLSBBean.sell("userID", 1, TradeConfig.ASYNCH);
        verify(directSLSBBean).completeOrderAsync(orderDataBean.getOrderID(), false);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSell_SyncOrderProcessingMode_HkJf3() throws Exception {
        DirectSLSBBean directSLSBBean = new DirectSLSBBean();
        TradeDirect tradeDirect = mock(TradeDirect.class);
        directSLSBBean.tradeDirect = tradeDirect;
        OrderDataBean orderDataBean = mock(OrderDataBean.class);
        when(tradeDirect.sell("userID", 1, TradeConfig.SYNCH)).thenReturn(orderDataBean);
        directSLSBBean.sell("userID", 1, TradeConfig.SYNCH);
        verify(directSLSBBean, never()).completeOrderAsync(orderDataBean.getOrderID(), false);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSell_ReturnOrderDataBean_MrMZ4() throws Exception {
        DirectSLSBBean directSLSBBean = new DirectSLSBBean();
        TradeDirect tradeDirect = mock(TradeDirect.class);
        directSLSBBean.tradeDirect = tradeDirect;
        OrderDataBean orderDataBean = mock(OrderDataBean.class);
        when(tradeDirect.sell("userID", 1, TradeConfig.ASYNCH)).thenReturn(orderDataBean);
        OrderDataBean result = directSLSBBean.sell("userID", 1, TradeConfig.ASYNCH);
        assertNotNull(result);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCancelOrder_SetInSession_FQOs2() throws Exception {
        Integer orderID = 1;
        boolean twoPhase = true;
        directSLSBBean.cancelOrder(orderID, twoPhase);
        verify(tradeDirect).setInSession(true);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCancelOrder_CancelOrder_HLbL3() throws Exception {
        Integer orderID = 1;
        boolean twoPhase = true;
        directSLSBBean.cancelOrder(orderID, twoPhase);
        verify(tradeDirect).cancelOrder(orderID, twoPhase);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCompleteOrderAsync_returnNull_VHsJ1() throws Exception {
        Integer orderID = 1;
        boolean twoPhase = true;
        Future<OrderDataBean> result = directSLSBBean.completeOrderAsync(orderID, twoPhase);
        assertNotNull(result);
        assertNull(result); // or assertSame(null, result);
    }
}