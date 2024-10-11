/**
 * Generated by Aster
 */
package com.ibm.websphere.samples.daytrader.impl.session2direct;

import com.ibm.websphere.samples.daytrader.entities.AccountDataBean;
import com.ibm.websphere.samples.daytrader.entities.HoldingDataBean;
import com.ibm.websphere.samples.daytrader.entities.OrderDataBean;
import com.ibm.websphere.samples.daytrader.entities.QuoteDataBean;
import com.ibm.websphere.samples.daytrader.impl.direct.TradeDirect;
import com.ibm.websphere.samples.daytrader.interfaces.TradeServices;
import com.ibm.websphere.samples.daytrader.util.TradeConfig;
import java.math.BigDecimal;
import java.util.Date;
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
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
@MockitoSettings(strictness = Strictness.LENIENT)
public class Aster_DirectSLSBBean_Test_Passing {
  @Mock
  private TradeDirect tradeDirect;
  @InjectMocks
  private DirectSLSBBean directSLSBBean;

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testInvestmentReturnThrowsException_ZrrA0() {
    DirectSLSBBean bean = new DirectSLSBBean();
    assertThrows(UnsupportedOperationException.class, () -> {
      bean.investmentReturn(0.5, 0.5);
    });
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testQueueOrderWithValidParameters_lZPO0() throws Exception {
    DirectSLSBBean bean = new DirectSLSBBean();
    Integer orderID = 123;
    boolean twoPhase = true;
    TradeDirect mockTradeDirect = mock(TradeDirect.class);
    bean.tradeDirect = mockTradeDirect;
    bean.queueOrder(orderID, twoPhase);
    verify(mockTradeDirect).setInSession(true);
    verify(mockTradeDirect).queueOrder(orderID, twoPhase);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testPingTwoPhaseThrowsException_XwGR0() {
    DirectSLSBBean bean = new DirectSLSBBean();
    String symbol = "AAPL";
    assertThrows(UnsupportedOperationException.class, () -> {
      bean.pingTwoPhase(symbol);
    });
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetImpl_DZSx0() {
    DirectSLSBBean bean = new DirectSLSBBean();
    int expected = TradeConfig.SESSION_TO_DIRECT;
    assertEquals(expected, bean.getImpl());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testCreateOrder_lAOq0() throws Exception {
    AccountDataBean account = new AccountDataBean();
    QuoteDataBean quote = new QuoteDataBean("SYM123");
    HoldingDataBean holding = new HoldingDataBean(100, new BigDecimal("150.00"), new java.util.Date(), account, quote);
    String orderType = "BUY";
    double quantity = 50;
    OrderDataBean expectedOrder = new OrderDataBean();
    when(tradeDirect.createOrder(account, quote, holding, orderType, quantity)).thenReturn(expectedOrder);
    OrderDataBean result = directSLSBBean.createOrder(account, quote, holding, orderType, quantity);
    verify(tradeDirect).setInSession(true);
    verify(tradeDirect).createOrder(account, quote, holding, orderType, quantity);
  }
}