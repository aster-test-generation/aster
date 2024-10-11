/**
 * Generated by Aster
 */
package com.ibm.websphere.samples.daytrader.entities;

import com.ibm.websphere.samples.daytrader.util.TradeConfig;
import java.math.BigDecimal;
import java.util.Date;
import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.mockito.junit.jupiter.MockitoSettings;
import org.mockito.quality.Strictness;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

@ExtendWith(MockitoExtension.class)
@MockitoSettings(strictness = Strictness.LENIENT)
public class Aster_OrderDataBean_Test_Failing {
  private Integer orderID;
  private BigDecimal price;
  private HoldingDataBean holding;
  private double quantity;
  private BigDecimal orderFee;
  private QuoteDataBean quote;
  private String orderStatus;
  private String symbol;
  private AccountDataBean account;
  private Date openDate;
  private Date completionDate;
  private String orderType;
  @Mock
  private OrderDataBean orderDataBean;

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetRandomInstance_1_aOME0_2() {
    OrderDataBean orderDataBean = OrderDataBean.getRandomInstance();
    assertEquals(76261, orderDataBean.getOrderID());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetRandomInstance_1_aOME0_7() {
    OrderDataBean orderDataBean = OrderDataBean.getRandomInstance();
    assertEquals(TradeConfig.rndQuantity(), orderDataBean.getQuantity());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetRandomInstance_1_aOME0_8() {
    OrderDataBean orderDataBean = OrderDataBean.getRandomInstance();
    assertEquals(TradeConfig.rndBigDecimal(1000.0f), orderDataBean.getPrice());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetRandomInstance_1_aOME0_9() {
    OrderDataBean orderDataBean = OrderDataBean.getRandomInstance();
    assertEquals(TradeConfig.rndBigDecimal(1000.0f), orderDataBean.getOrderFee());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetRandomInstance_1_aOME0_10() {
    OrderDataBean orderDataBean = OrderDataBean.getRandomInstance();
    assertEquals(TradeConfig.rndSymbol(), orderDataBean.getSymbol());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetRandomInstance_1_aOME0() {
    OrderDataBean orderDataBean = OrderDataBean.getRandomInstance();
    assertNotNull(orderDataBean);
    assertEquals(100000, orderDataBean.getOrderID());
    assertEquals("buy", orderDataBean.getOrderType());
    assertEquals("open", orderDataBean.getOrderStatus());
    assertNotNull(orderDataBean.getOpenDate());
    assertNotNull(orderDataBean.getCompletionDate());
    assertEquals(TradeConfig.rndQuantity(), orderDataBean.getQuantity());
    assertEquals(TradeConfig.rndBigDecimal(1000.0f), orderDataBean.getPrice());
    assertEquals(TradeConfig.rndBigDecimal(1000.0f), orderDataBean.getOrderFee());
    assertEquals(TradeConfig.rndSymbol(), orderDataBean.getSymbol());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetRandomInstance_2_tHys1() {
    OrderDataBean orderDataBean = OrderDataBean.getRandomInstance();
    assertNotNull(orderDataBean);
    assertEquals(100000, orderDataBean.getOrderID());
    assertEquals("sell", orderDataBean.getOrderType());
    assertEquals("open", orderDataBean.getOrderStatus());
    assertNotNull(orderDataBean.getOpenDate());
    assertNotNull(orderDataBean.getCompletionDate());
    assertEquals(TradeConfig.rndQuantity(), orderDataBean.getQuantity());
    assertEquals(TradeConfig.rndBigDecimal(1000.0f), orderDataBean.getPrice());
    assertEquals(TradeConfig.rndBigDecimal(1000.0f), orderDataBean.getOrderFee());
    assertEquals(TradeConfig.rndSymbol(), orderDataBean.getSymbol());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testPrint_IvsX0() {
    OrderDataBean orderDataBean = new OrderDataBean(1, "BUY", "OPEN", new Date(), new Date(), 10.0, new BigDecimal(10.0), new BigDecimal(1.0), "AAPL");
    orderDataBean.print();
    assertEquals("OrderDataBean{orderID=1, orderType='BUY', orderStatus='OPEN', openDate=new Date(), completionDate=new Date(), quantity=10.0, price=new BigDecimal(10.0), orderFee=new BigDecimal(1.0), symbol='AAPL'}", orderDataBean.toString());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testPrintWithAccountDataBean_OMLt1() {
    AccountDataBean accountDataBean = new AccountDataBean(1, 10, 5, new Date(), new Date(), new BigDecimal(100.0), new BigDecimal(50.0), "profile1");
    OrderDataBean orderDataBean = new OrderDataBean(1, "BUY", "OPEN", new Date(), new Date(), 10.0, new BigDecimal(10.0), new BigDecimal(1.0), "AAPL");
    orderDataBean.setAccount(accountDataBean);
    orderDataBean.print();
    assertEquals("OrderDataBean{orderID=1, orderType='BUY', orderStatus='OPEN', openDate=new Date(), completionDate=new Date(), quantity=10.0, price=new BigDecimal(10.0), orderFee=new BigDecimal(1.0), symbol='AAPL', account=AccountDataBean{accountID=1, loginCount=10, logoutCount=5, lastLogin=new Date(), creationDate=new Date(), balance=new BigDecimal(100.0), openBalance=new BigDecimal(50.0), profileID='profile1'}}", orderDataBean.toString());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetOrderIDWithInvalidOrderType_iorF6() {
    OrderDataBean orderDataBean = new OrderDataBean(1, "INVALID_ORDER_TYPE", "OPEN", new Date(), new Date(), 100.0, BigDecimal.valueOf(10.0), BigDecimal.valueOf(1.0), "AAPL");
    assertNull(orderDataBean.getOrderID());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetOrderIDWithInvalidOrderStatus_PQve7() {
    OrderDataBean orderDataBean = new OrderDataBean(1, "BUY", "INVALID_ORDER_STATUS", new Date(), new Date(), 100.0, BigDecimal.valueOf(10.0), BigDecimal.valueOf(1.0), "AAPL");
    assertNull(orderDataBean.getOrderID());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetOrderIDWithInvalidOpenDate_QpmT8() {
    OrderDataBean orderDataBean = new OrderDataBean(1, "BUY", "OPEN", null, new Date(), 100.0, BigDecimal.valueOf(10.0), BigDecimal.valueOf(1.0), "AAPL");
    assertNull(orderDataBean.getOrderID());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetOrderIDWithInvalidCompletionDate_vTHl9() {
    OrderDataBean orderDataBean = new OrderDataBean(1, "BUY", "OPEN", new Date(), null, 100.0, BigDecimal.valueOf(10.0), BigDecimal.valueOf(1.0), "AAPL");
    assertNull(orderDataBean.getOrderID());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetOpenDateWithDifferentDate_HLlF2() {
    OrderDataBean orderDataBean = new OrderDataBean();
    Date openDate = new Date();
    orderDataBean.setOpenDate(openDate);
    assertNotEquals(openDate, orderDataBean.getOpenDate());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testIsCancelled_nullOrderStatus_xdWJ2() {
    OrderDataBean order = new OrderDataBean(1, "buy", null, new Date(), new Date(), 10.0, BigDecimal.valueOf(10.0), BigDecimal.valueOf(0.0), "AAPL");
    assertFalse(order.isCancelled());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetRandomInstance_1_aOME0_2_fid2() {
    OrderDataBean orderDataBean = OrderDataBean.getRandomInstance();
    assertEquals(100000, orderDataBean.getOrderID());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testToHTML_jWwW0_fHSI0() {
    AccountDataBean account = new AccountDataBean(1, 1, 1, new Date(), new Date(), new BigDecimal(100), new BigDecimal(100), "profileID");
    QuoteDataBean quote = new QuoteDataBean("symbol");
    HoldingDataBean holding = new HoldingDataBean(100, new BigDecimal(100), new Date(), account, quote);
    OrderDataBean order = new OrderDataBean(1, "orderType", "orderStatus", new Date(), new Date(), 100, new BigDecimal(100), new BigDecimal(100), "symbol");
    String html = order.toHTML();
    assertEquals("<BR>Order <B>1</B><LI>      orderType: orderType</LI><LI>    orderStatus: orderStatus</LI><LI>       openDate: " + new Date() + "</LI><LI> completionDate: " + new Date() + "</LI><LI>       quantity: 100</LI><LI>          price: 100</LI><LI>       orderFee: 100</LI><LI>         symbol: symbol</LI>", html);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetQuantityWithNullQuantity_LUvZ3_ofAU0() {
    OrderDataBean orderDataBean = new OrderDataBean(1, "BUY", "OPEN", new Date(), new Date(), 0.0, BigDecimal.valueOf(10.0), BigDecimal.valueOf(1.0), "GOOG");
    assertNull(orderDataBean.getQuantity());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testIsSell_NullOrderType_ejwL2_SSyd0() {
    OrderDataBean order = new OrderDataBean(null, "open", new Date(), new Date(), 10.0, new BigDecimal(10.0), new BigDecimal(0.0), new AccountDataBean(), new QuoteDataBean(), new HoldingDataBean());
    assertFalse(order.isSell());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testIsCompleted_completed_LhrT0_SlPw0() {
    OrderDataBean orderDataBean = new OrderDataBean("completed", "open", new Date(), new Date(), 10.0, new BigDecimal(10.0), new BigDecimal(10.0), new AccountDataBean(), new QuoteDataBean(), new HoldingDataBean());
    assertTrue(orderDataBean.isCompleted());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testIsCompleted_alertcompleted_faaS1_rhJB0() {
    OrderDataBean orderDataBean = new OrderDataBean("alertcompleted", "open", new Date(), new Date(), 10.0, new BigDecimal(10.0), new BigDecimal(10.0), new AccountDataBean(), new QuoteDataBean(), new HoldingDataBean());
    assertTrue(orderDataBean.isCompleted());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testIsCompleted_cancelled_OWNA2_MRuy0() {
    OrderDataBean orderDataBean = new OrderDataBean(null, "cancelled", "open", new Date(), new Date(), 10.0, new BigDecimal(10.0), new BigDecimal(10.0), "AAPL");
    assertTrue(orderDataBean.isCompleted());
  }
}