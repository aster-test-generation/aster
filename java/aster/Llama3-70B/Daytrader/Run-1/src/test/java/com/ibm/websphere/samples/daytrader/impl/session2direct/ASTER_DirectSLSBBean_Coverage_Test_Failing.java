/**
 * Generated by Aster
 */
package com.ibm.websphere.samples.daytrader.impl.session2direct;

import com.ibm.websphere.samples.daytrader.entities.OrderDataBean;
import com.ibm.websphere.samples.daytrader.impl.direct.TradeDirect;
import com.ibm.websphere.samples.daytrader.interfaces.TradeServices;
import com.ibm.websphere.samples.daytrader.util.TradeConfig;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
import static org.mockito.Mockito.*;

public class Aster_DirectSLSBBean_Coverage_Test_Failing {
  private TradeDirect tradeDirect;
  private DirectSLSBBean directSLSBBean;

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetInSession_YmUf0() throws Exception {
    DirectSLSBBean directSLSBBean = new DirectSLSBBean();
    TradeDirect tradeDirect = mock(TradeDirect.class);
    directSLSBBean.tradeDirect = tradeDirect;
    directSLSBBean.sell("userID", 1, 1);
    verify(tradeDirect).setInSession(true);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSell_xBio1() throws Exception {
    DirectSLSBBean directSLSBBean = new DirectSLSBBean();
    TradeDirect tradeDirect = mock(TradeDirect.class);
    OrderDataBean orderDataBean = mock(OrderDataBean.class);
    when(tradeDirect.sell("userID", 1, 1)).thenReturn(orderDataBean);
    directSLSBBean.tradeDirect = tradeDirect;
    assertEquals(orderDataBean, directSLSBBean.sell("userID", 1, 1));
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testAsyncOrderProcessing_xVmk2() throws Exception {
    DirectSLSBBean directSLSBBean = spy(new DirectSLSBBean());
    TradeDirect tradeDirect = mock(TradeDirect.class);
    OrderDataBean orderDataBean = mock(OrderDataBean.class);
    when(tradeDirect.sell("userID", 1, TradeConfig.ASYNCH)).thenReturn(orderDataBean);
    directSLSBBean.tradeDirect = tradeDirect;
    directSLSBBean.sell("userID", 1, TradeConfig.ASYNCH);
    verify(directSLSBBean).completeOrderAsync(orderDataBean.getOrderID(), false);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSyncOrderProcessing_uQZx3() throws Exception {
    DirectSLSBBean directSLSBBean = spy(new DirectSLSBBean());
    TradeDirect tradeDirect = mock(TradeDirect.class);
    OrderDataBean orderDataBean = mock(OrderDataBean.class);
    when(tradeDirect.sell("userID", 1, 1)).thenReturn(orderDataBean);
    directSLSBBean.tradeDirect = tradeDirect;
    directSLSBBean.sell("userID", 1, 1);
    verify(directSLSBBean, never()).completeOrderAsync(orderDataBean.getOrderID(), false);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testBuy_AsyncOrderProcessingMode_Dnsx2() throws Exception {
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
  public void testBuy_SynchOrderProcessingMode_KEFZ3() throws Exception {
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
  public void testCancelOrder_SetInSessionTrue_QZSc2() throws Exception {
    Integer orderID = 1;
    boolean twoPhase = true;
    directSLSBBean.cancelOrder(orderID, twoPhase);
    verify(tradeDirect).setInSession(true);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testCancelOrder_CancelOrderCalled_WgMj3() throws Exception {
    Integer orderID = 1;
    boolean twoPhase = true;
    directSLSBBean.cancelOrder(orderID, twoPhase);
    verify(tradeDirect).cancelOrder(orderID, twoPhase);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testQueueOrder_SetInSessionTrue_AIsQ2() throws Exception {
    Integer orderID = 1;
    boolean twoPhase = true;
    directSLSBBean.queueOrder(orderID, twoPhase);
    verify(tradeDirect).setInSession(true);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testQueueOrder_QueueOrderCalled_kTYf3() throws Exception {
    Integer orderID = 1;
    boolean twoPhase = true;
    directSLSBBean.queueOrder(orderID, twoPhase);
    verify(tradeDirect).queueOrder(orderID, twoPhase);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testCompleteOrderAsync_returnNull_iNVp1() throws Exception {
    Integer orderID = 1;
    boolean twoPhase = true;
    Future<OrderDataBean> result = directSLSBBean.completeOrderAsync(orderID, twoPhase);
    assertNotNull(result);
    assertNull(result); // Since return null is expected
  }
}