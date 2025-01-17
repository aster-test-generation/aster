/**
 * Generated by Aster
 */
package com.ibm.websphere.samples.daytrader.web.jsf;

import com.ibm.websphere.samples.daytrader.interfaces.TradeServices;
import java.math.BigDecimal;
import java.util.Date;
import java.util.concurrent.TimeUnit;
import javax.enterprise.inject.Instance;
import javax.faces.context.ExternalContext;
import javax.servlet.http.HttpSession;
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
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
@MockitoSettings(strictness = Strictness.LENIENT)
public class Aster_OrderDataJSF_Test_Passing {
  @Mock
  private TradeServices tradeAction;
  @Mock
  private ExternalContext context;
  @Mock
  private HttpSession session;
  @InjectMocks
  private OrderDataJSF orderDataJSF;
  private HttpSession httpSession;
  private ExternalContext externalContext;
  private OrderData orderData;

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetAllOrders_Lgtj0() {
    OrderDataJSF orderDataJSF = new OrderDataJSF(null); // Assuming null can be passed if no actual instance is needed for the test
    OrderData[] result = orderDataJSF.getAllOrders();
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetAllOrderWithEmptySession_yPEc0_HbAu0() {
    HttpSession session = mock(HttpSession.class);
    when(session.getAttribute("uidBean")).thenReturn(null);
    when(context.getSession(true)).thenReturn(session);
    TradeServices tradeServices = mock(TradeServices.class);
    Instance<TradeServices> servicesInstance = mock(Instance.class);
    when(servicesInstance.get()).thenReturn(tradeServices);
    OrderDataJSF orderDataJSF = new OrderDataJSF(servicesInstance);
    orderDataJSF.getAllOrder();
    verify(session).getAttribute("uidBean");
    assertEquals(0, orderDataJSF.getAllOrders().length);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetOrder_WhenOrderDataDoesNotExist_tnhJ0() {
    httpSession = mock(HttpSession.class);
    externalContext = mock(ExternalContext.class);
    Instance<TradeServices> servicesInstance = mock(Instance.class);
    orderData = new OrderData(null, null, null, null, null, null, 0.0, null);
    orderDataJSF = new OrderDataJSF(servicesInstance);
    when(externalContext.getSession(true)).thenReturn(httpSession);
    when(httpSession.getAttribute("orderData")).thenReturn(null);
    orderDataJSF.setOrderData(null);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetOrderData_wmwN0_CnDT0() {
    Instance<TradeServices> servicesInstance = mock(Instance.class);
    OrderDataJSF orderDataJSF = new OrderDataJSF(servicesInstance);
    OrderData orderData = new OrderData(1, "Pending", new java.util.Date(), null, new BigDecimal("100.00"), "Buy", 50.0, "AAPL");
    orderDataJSF.setOrderData(orderData);
    assertEquals(orderData, orderDataJSF.getOrderData());
  }
}