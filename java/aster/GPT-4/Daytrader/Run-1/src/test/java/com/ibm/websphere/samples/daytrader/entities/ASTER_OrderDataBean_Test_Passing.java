/**
 * Generated by Aster
 */
package com.ibm.websphere.samples.daytrader.entities;

import com.ibm.websphere.samples.daytrader.util.Log;
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

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
import static org.mockito.Mockito.mock;

@ExtendWith(MockitoExtension.class)
@MockitoSettings(strictness = Strictness.LENIENT)
public class Aster_OrderDataBean_Test_Passing {
  @InjectMocks
  private OrderDataBean orderDataBeanWithoutID;
  private BigDecimal expectedPrice;
  @Mock
  private Log logMock;
  @Mock
  private HoldingDataBean holding;
  private final double testQuantity = 100.0;
  private QuoteDataBean quote;
  private OrderDataBean orderDataBean1;
  private OrderDataBean orderDataBean2;
  private Integer orderID1 = 1001;
  private Integer orderID2 = 1002;
  private final String expectedOrderStatus = "Completed";
  private Integer expectedOrderID = 123;
  @Mock
  private AccountDataBean account;
  private Date openDate;
  private Date completionDate;
  private final String orderType = "buy";
  @Mock
  private AccountDataBean accountDataBean;
  @Mock
  private QuoteDataBean quoteDataBean;
  @Mock
  private HoldingDataBean holdingDataBean;
  private String symbol;
  private Integer orderID; /* orderID */
  private BigDecimal price; /* price */
  private double quantity; /* quantity */
  private BigDecimal orderFee; /* price */
  private String orderStatus;

  /*
  Test
  Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
     public void testGetOrderStatus() throws Exception {
         // Initialize OrderDataBean with the expected order status
         orderDataBean = new OrderDataBean();
         // Using reflection to set private field, since there's no setter in the provided code
         java.lang.reflect.Field field = orderDataBean.getClass().getDeclaredField("orderStatus");
         field.setAccessible(true);
         field.set(orderDataBean, expectedOrderStatus);
         // Act
         String actualOrderStatus = orderDataBean.getOrderStatus();
         // Assert
         assertEquals(expectedOrderStatus, actualOrderStatus, "The order status should match the expected value.");
     }
  Test
  Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  ublic void testGetOrderStatus_mvgb0() {
     OrderDataBean order = new OrderDataBean(1, "BUY", "OPEN", new Date(), new Date(), 100.0, new BigDecimal("150.50"), new BigDecimal("10.00"), "AAPL");
     assertEquals("OPEN", order.getOrderStatus());
  
     private String orderStatus; /*
  Test
  Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
     public void testSetOrderStatus() throws Exception {
         orderDataBean = new OrderDataBean();
         // Arrange
         String expectedStatus = "Completed";
         // Act
         orderDataBean.setOrderStatus(expectedStatus);
         // Assert
         assertEquals(expectedStatus, orderDataBean.getOrderStatus(), "The order status should be set to 'Completed'");
     }
  Test
  Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  ublic void testSetOrderStatus_fbqY0() {
     AccountDataBean account = new AccountDataBean(1, 2, new Date(), new Date(), new BigDecimal("1000"), new BigDecimal("1000"), "profile1");
     QuoteDataBean quote = new QuoteDataBean("AAPL", "Apple Inc.", 1000, new BigDecimal("150"), new BigDecimal("145"), new BigDecimal("140"), new BigDecimal("155"), 5);
     HoldingDataBean holding = new HoldingDataBean(1, 50, new BigDecimal("150"), new Date(), "AAPL");
     OrderDataBean order = new OrderDataBean("BUY", "OPEN", new Date(), new Date(), 50, new BigDecimal("150"), new BigDecimal("10"), account, quote, holding);
     order.setOrderStatus("COMPLETED");
     assertEquals("COMPLETED", order.getOrderStatus());
  
     private String symbol;
  Test
  Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
     public void testGetSymbol_WithQuote() {
         quote = mock(QuoteDataBean.class);
         orderDataBean = new OrderDataBean();
         // Setup
         when(quote.getSymbol()).thenReturn("AAPL");
         orderDataBean = new OrderDataBean(null, null, null, null, null, 0, null, null, null, null, quote, null);
         // Execution
         String result = orderDataBean.getSymbol();
         // Assertion
         assertEquals("AAPL", result, "The symbol should be retrieved from the QuoteDataBean");
     }
  Test
  Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
     public void testGetSymbol_WithoutQuote() {
         quote = mock(QuoteDataBean.class);
         orderDataBean = new OrderDataBean();
         // Setup
         orderDataBean = new OrderDataBean();
         osymbol";
         // Execution
         String result = orderDataBean.getSymbol();
         // Assertion
         assertEquals("GOOGL", result, "The symbol should be retrieved directly from the OrderDataBean when quote is null");
     }
  Test
  Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  ublic void testGetSymbolWithQuoteNotNull_nehW0() {
     QuoteDataBean quote = new QuoteDataBean("AAPL");
     OrderDataBean order = new OrderDataBean(null, null, null, null, null, 0, null, null, quote, null, null);
     assertEquals("AAPL", order.getSymbol());
  
  Test
  Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  ublic void testGetSymbolWithQuoteNull_uZpi1() {
     OrderDataBean order = new OrderDataBean();
     assertNull(order.getSymbol());
  
     private Integer orderID; /* orderID */
  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetRandomInstanceNotNull_mmue0() {
    OrderDataBean orderDataBean = OrderDataBean.getRandomInstance();
    assertNotNull(orderDataBean);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetRandomInstanceFieldsNotNull_gInc1_1() {
    OrderDataBean orderDataBean = OrderDataBean.getRandomInstance();
    assertNotNull(orderDataBean.getOrderID());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetRandomInstanceFieldsNotNull_gInc1_2() {
    OrderDataBean orderDataBean = OrderDataBean.getRandomInstance();
    assertNotNull(orderDataBean.getOrderType());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetRandomInstanceFieldsNotNull_gInc1_3() {
    OrderDataBean orderDataBean = OrderDataBean.getRandomInstance();
    assertNotNull(orderDataBean.getOrderStatus());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetRandomInstanceFieldsNotNull_gInc1_4() {
    OrderDataBean orderDataBean = OrderDataBean.getRandomInstance();
    assertNotNull(orderDataBean.getOpenDate());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetRandomInstanceFieldsNotNull_gInc1_5() {
    OrderDataBean orderDataBean = OrderDataBean.getRandomInstance();
    assertNotNull(orderDataBean.getCompletionDate());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetRandomInstanceFieldsNotNull_gInc1_6() {
    OrderDataBean orderDataBean = OrderDataBean.getRandomInstance();
    assertNotNull(orderDataBean.getQuantity());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetRandomInstanceFieldsNotNull_gInc1_7() {
    OrderDataBean orderDataBean = OrderDataBean.getRandomInstance();
    assertNotNull(orderDataBean.getPrice());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetRandomInstanceFieldsNotNull_gInc1_8() {
    OrderDataBean orderDataBean = OrderDataBean.getRandomInstance();
    assertNotNull(orderDataBean.getOrderFee());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetRandomInstanceFieldsNotNull_gInc1_9() {
    OrderDataBean orderDataBean = OrderDataBean.getRandomInstance();
    assertNotNull(orderDataBean.getSymbol());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetSymbol_hOnF0() {
    OrderDataBean orderDataBean = new OrderDataBean();
    String expectedSymbol = "AAPL";
    orderDataBean.setSymbol(expectedSymbol);
    assertEquals(expectedSymbol, orderDataBean.getSymbol());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testHashCodeWithNonNullOrderId_kwSa0() {
    Integer orderId = 123;
    OrderDataBean orderDataBean = new OrderDataBean(orderId, "BUY", "OPEN", new Date(), new Date(), 100.0, new BigDecimal("150.00"), new BigDecimal("10.00"), "AAPL");
    int expectedHashCode = orderId.hashCode();
    assertEquals(expectedHashCode, orderDataBean.hashCode());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testHashCodeWithNullOrderId_rKYs1() {
    OrderDataBean orderDataBean = new OrderDataBean();
    int expectedHashCode = 0;
    assertEquals(expectedHashCode, orderDataBean.hashCode());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetPrice_jBIV0() {
    BigDecimal expectedPrice = new BigDecimal("100.00");
    OrderDataBean orderDataBean = new OrderDataBean(null, "BUY", "OPEN", new Date(), new Date(), 50.0, expectedPrice, new BigDecimal("10.00"), "IBM");
    BigDecimal actualPrice = orderDataBean.getPrice();
    assertEquals(expectedPrice, actualPrice);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetHolding_CUwL0() {
    AccountDataBean account = new AccountDataBean(1, 2, new Date(), new Date(), new BigDecimal("1000.00"), new BigDecimal("1000.00"), "profile1");
    QuoteDataBean quote = new QuoteDataBean("AAPL", "Apple Inc.", 1000, new BigDecimal("150.00"), new BigDecimal("145.00"), new BigDecimal("140.00"), new BigDecimal("155.00"), 5.0);
    HoldingDataBean holding = new HoldingDataBean(1, 50.0, new BigDecimal("145.00"), new Date(), "AAPL");
    OrderDataBean order = new OrderDataBean("BUY", "OPEN", new Date(), new Date(), 50.0, new BigDecimal("150.00"), new BigDecimal("10.00"), account, quote, holding);
    HoldingDataBean result = order.getHolding();
    assertEquals(holding, result);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testCancelSetsOrderStatusToCancelled_svAz0() {
    AccountDataBean account = new AccountDataBean(1, 2, new Date(), new Date(), new BigDecimal("1000.00"), new BigDecimal("1000.00"), "profile123");
    QuoteDataBean quote = new QuoteDataBean("AAPL", "Apple Inc.", 1000, new BigDecimal("150.00"), new BigDecimal("145.00"), new BigDecimal("140.00"), new BigDecimal("155.00"), 5.0);
    HoldingDataBean holding = new HoldingDataBean(1, 50.0, new BigDecimal("145.00"), new Date(), "AAPL");
    OrderDataBean order = new OrderDataBean("buy", "open", new Date(), new Date(), 50.0, new BigDecimal("150.00"), new BigDecimal("10.00"), account, quote, holding);
    order.cancel();
    assertEquals("cancelled", order.getOrderStatus());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetOrderID_WuQc0() {
    Integer expectedOrderID = 123;
    OrderDataBean orderDataBean = new OrderDataBean();
    orderDataBean.setOrderID(expectedOrderID);
    assertEquals(expectedOrderID, orderDataBean.getOrderID());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testToHTML_tkcV0() {
    AccountDataBean account = new AccountDataBean(1, 2, 3, new Date(), new Date(), new BigDecimal("1000.50"), new BigDecimal("1000.50"), "profile123");
    QuoteDataBean quote = new QuoteDataBean("AAPL", "Apple Inc.", 1000000, new BigDecimal("150.00"), new BigDecimal("145.00"), new BigDecimal("140.00"), new BigDecimal("155.00"), 5.00);
    HoldingDataBean holding = new HoldingDataBean(1, 50, new BigDecimal("145.00"), new Date(), "AAPL");
    OrderDataBean order = new OrderDataBean(1, "BUY", "OPEN", new Date(), new Date(), 50, new BigDecimal("150.00"), new BigDecimal("15.00"), "AAPL");
    String expectedHTML = "<BR>Order <B>1</B>" +
        "<LI>      orderType: BUY</LI>" +
        "<LI>    orderStatus: OPEN</LI>" +
        "<LI>       openDate: " + order.getOpenDate() + "</LI>" +
        "<LI> completionDate: " + order.getCompletionDate() + "</LI>" +
        "<LI>       quantity: 50.0</LI>" +
        "<LI>          price: 150.00</LI>" +
        "<LI>       orderFee: 15.00</LI>" +
        "<LI>         symbol: AAPL</LI>";
    String actualHTML = order.toHTML();
    assertEquals(expectedHTML, actualHTML);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetQuantity_iziz0() {
    AccountDataBean account = new AccountDataBean(1, 2, new Date(), new Date(), new BigDecimal("1000"), new BigDecimal("1000"), "profile1");
    QuoteDataBean quote = new QuoteDataBean("AAPL", "Apple Inc.", 1000, new BigDecimal("150"), new BigDecimal("145"), new BigDecimal("140"), new BigDecimal("155"), 5.0);
    HoldingDataBean holding = new HoldingDataBean(1, 150.0, new BigDecimal("145"), new Date(), "AAPL");
    OrderDataBean order = new OrderDataBean("BUY", "OPEN", new Date(), new Date(), 150.0, new BigDecimal("150"), new BigDecimal("10"), account, quote, holding);
    assertEquals(150.0, order.getQuantity(), 0.0);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testEquals_SameObject_ShouldReturnTrue() throws Exception {
    orderDataBean1 = new OrderDataBean(orderID1, "BUY", "OPEN", null, null, 100.0, null, null, "IBM");
    orderDataBean2 = new OrderDataBean(orderID2, "SELL", "CLOSED", null, null, 150.0, null, null, "AAPL");
    assertTrue(orderDataBean1.equals(orderDataBean1), "The same object should be equal to itself.");
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testEquals_DifferentClass_ShouldReturnFalse() throws Exception {
    orderDataBean1 = new OrderDataBean(orderID1, "BUY", "OPEN", null, null, 100.0, null, null, "IBM");
    orderDataBean2 = new OrderDataBean(orderID2, "SELL", "CLOSED", null, null, 150.0, null, null, "AAPL");
    assertFalse(orderDataBean1.equals(new Object()), "Different class objects should not be equal.");
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testEquals_Null_ShouldReturnFalse() throws Exception {
    orderDataBean1 = new OrderDataBean(orderID1, "BUY", "OPEN", null, null, 100.0, null, null, "IBM");
    orderDataBean2 = new OrderDataBean(orderID2, "SELL", "CLOSED", null, null, 150.0, null, null, "AAPL");
    assertFalse(orderDataBean1.equals(null), "Object should not be equal to null.");
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testEquals_SameOrderID_ShouldReturnTrue() throws Exception {
    orderDataBean1 = new OrderDataBean(orderID1, "BUY", "OPEN", null, null, 100.0, null, null, "IBM");
    orderDataBean2 = new OrderDataBean(orderID2, "SELL", "CLOSED", null, null, 150.0, null, null, "AAPL");
    OrderDataBean anotherOrderDataBean = new OrderDataBean(orderID1, "BUY", "OPEN", null, null, 100.0, null, null, "IBM");
    assertTrue(orderDataBean1.equals(anotherOrderDataBean), "Objects with the same orderID should be equal.");
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testEquals_DifferentOrderID_ShouldReturnFalse() throws Exception {
    orderDataBean1 = new OrderDataBean(orderID1, "BUY", "OPEN", null, null, 100.0, null, null, "IBM");
    orderDataBean2 = new OrderDataBean(orderID2, "SELL", "CLOSED", null, null, 150.0, null, null, "AAPL");
    assertFalse(orderDataBean1.equals(orderDataBean2), "Objects with different orderIDs should not be equal.");
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testEqualsWithDifferentID_AdsW1() {
    OrderDataBean order1 = new OrderDataBean(1, "BUY", "OPEN", new Date(), new Date(), 100.0, new BigDecimal("150.00"), new BigDecimal("10.00"), "AAPL");
    OrderDataBean order2 = new OrderDataBean(2, "SELL", "CLOSED", new Date(), new Date(), 200.0, new BigDecimal("155.00"), new BigDecimal("15.00"), "AAPL");
    assertFalse(order1.equals(order2));
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testEqualsWithNullIDInFirstObject_lNUj2() {
    OrderDataBean order1 = new OrderDataBean(null, "BUY", "OPEN", new Date(), new Date(), 100.0, new BigDecimal("150.00"), new BigDecimal("10.00"), "AAPL");
    OrderDataBean order2 = new OrderDataBean(1, "SELL", "CLOSED", new Date(), new Date(), 200.0, new BigDecimal("155.00"), new BigDecimal("15.00"), "AAPL");
    assertFalse(order1.equals(order2));
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testEqualsWithNullIDInSecondObject_Vrlk3() {
    OrderDataBean order1 = new OrderDataBean(1, "BUY", "OPEN", new Date(), new Date(), 100.0, new BigDecimal("150.00"), new BigDecimal("10.00"), "AAPL");
    OrderDataBean order2 = new OrderDataBean(null, "SELL", "CLOSED", new Date(), new Date(), 200.0, new BigDecimal("155.00"), new BigDecimal("15.00"), "AAPL");
    assertFalse(order1.equals(order2));
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testEqualsWithBothNullIDs_ZMLe4() {
    OrderDataBean order1 = new OrderDataBean(null, "BUY", "OPEN", new Date(), new Date(), 100.0, new BigDecimal("150.00"), new BigDecimal("10.00"), "AAPL");
    OrderDataBean order2 = new OrderDataBean(null, "SELL", "CLOSED", new Date(), new Date(), 200.0, new BigDecimal("155.00"), new BigDecimal("15.00"), "AAPL");
    assertTrue(order1.equals(order2));
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetOrderID_wzjV0() {
    Integer expectedOrderID = 123;
    OrderDataBean order = new OrderDataBean(expectedOrderID, "BUY", "OPEN", new Date(), new Date(), 100.0, new BigDecimal("250.00"), new BigDecimal("10.00"), "AAPL");
    Integer actualOrderID = order.getOrderID();
    assertEquals(expectedOrderID, actualOrderID);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testIsOpenWithStatusOpen_ojQE0() {
    OrderDataBean order = new OrderDataBean(1, "open", "open", new Date(), new Date(), 100.0, new BigDecimal("150.0"), new BigDecimal("10.0"), "AAPL");
    assertTrue(order.isOpen());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testIsOpenWithStatusProcessing_hKxf1() {
    OrderDataBean order = new OrderDataBean(2, "processing", "processing", new Date(), new Date(), 200.0, new BigDecimal("250.0"), new BigDecimal("15.0"), "GOOG");
    assertTrue(order.isOpen());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testIsOpenWithStatusClosed_IVCX2() {
    OrderDataBean order = new OrderDataBean(3, "closed", "closed", new Date(), new Date(), 300.0, new BigDecimal("350.0"), new BigDecimal("20.0"), "MSFT");
    assertFalse(order.isOpen());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetAccount_ZNuy0() {
    AccountDataBean accountDataBean = new AccountDataBean();
    OrderDataBean orderDataBean = new OrderDataBean();
    orderDataBean.setAccount(accountDataBean);
    assertEquals(accountDataBean, orderDataBean.getAccount());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetOrderFee_AgpX0() {
    BigDecimal newOrderFee = new BigDecimal("15.00");
    OrderDataBean orderDataBean = new OrderDataBean();
    orderDataBean.setOrderFee(newOrderFee);
    assertEquals(newOrderFee, orderDataBean.getOrderFee());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetOpenDate_Rvxk0() {
    Date expectedOpenDate = new Date();
    OrderDataBean orderDataBean = new OrderDataBean(1, "BUY", "OPEN", expectedOpenDate, null, 100.0, new BigDecimal("150.00"), new BigDecimal("10.00"), "AAPL");
    Date actualOpenDate = orderDataBean.getOpenDate();
    assertEquals(expectedOpenDate, actualOpenDate);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetHolding_fUwj0() {
    OrderDataBean order = new OrderDataBean();
    HoldingDataBean holding = new HoldingDataBean();
    order.setHolding(holding);
    assertEquals(holding, order.getHolding());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetOrderID_EHeV0() throws Exception {
    Integer expectedOrderID = 123; // Assuming expectedOrderID should be defined
    OrderDataBean orderDataBean = new OrderDataBean(expectedOrderID, "BUY", "OPEN", new Date(), null, 100.0, new BigDecimal("250.50"), new BigDecimal("10.00"), "AAPL");
    Integer actualOrderID = orderDataBean.getOrderID();
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetOrderFee_wfFy0() {
    OrderDataBean orderDataBean = new OrderDataBean();
    BigDecimal newOrderFee = new BigDecimal("15.00");
    orderDataBean.setOrderFee(newOrderFee);
    assertEquals(newOrderFee, orderDataBean.getOrderFee());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetOpenDate_Mhvv0() {
    Date openDate = new Date();
    OrderDataBean orderDataBean = new OrderDataBean("BUY", "OPEN", openDate, null, 100.0, null, null, null, null, null);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetOpenDate_SaHo0() {
    OrderDataBean orderDataBean = new OrderDataBean();
    Date openDate = new Date(); // Set the current date as the open date
    orderDataBean.setOpenDate(openDate);
    assertEquals(openDate, orderDataBean.getOpenDate());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetHolding_gSnt0() throws Exception {
    HoldingDataBean holding = mock(HoldingDataBean.class);
    OrderDataBean orderDataBean = new OrderDataBean();
    orderDataBean.setHolding(holding);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetCompletionDate_GlZf0() {
    Date completionDate = new Date();
    OrderDataBean orderDataBean = new OrderDataBean();
    orderDataBean.setCompletionDate(completionDate);
    assertEquals(completionDate, orderDataBean.getCompletionDate());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetCompletionDate_zsXQ0_ekME0() {
    Date expectedCompletionDate = new Date();
    OrderDataBean orderDataBean = new OrderDataBean(null, "BUY", "COMPLETED", new Date(), expectedCompletionDate, 100.0, new BigDecimal("150.50"), new BigDecimal("10.00"), "AAPL");
    Date actualCompletionDate = orderDataBean.getCompletionDate();
    assertEquals(expectedCompletionDate, actualCompletionDate);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testIsSellTrue_PTNr0() {
    OrderDataBean orderDataBean = new OrderDataBean(null, "sell", null, null, null, 0.0, null, null, null);
    assertTrue(orderDataBean.isSell(), "isSell should return true when the order type is 'sell'");
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetOrderType_nOtl0() throws Exception {
    String orderType = "buy";
    OrderDataBean orderDataBean = new OrderDataBean(orderType, "completed", new Date(), new Date(), 100, new BigDecimal("150.00"), new BigDecimal("10.00"), null, null, null);
    String retrievedOrderType = orderDataBean.getOrderType();
    assertEquals(orderType, retrievedOrderType);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetOrderType_ndKr0_FbFQ0() {
    OrderDataBean order = new OrderDataBean("BUY", "OPEN", new Date(), new Date(), 100.0, new BigDecimal("150.00"), new BigDecimal("10.00"), null, null, null);
    assertEquals("BUY", order.getOrderType());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetQuantity_HyeZ0() throws Exception {
    OrderDataBean orderDataBean = new OrderDataBean();
    double expectedQuantity = 10.0;
    orderDataBean.setQuantity(expectedQuantity);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetQuantity_ulIY0_HTuJ0() {
    OrderDataBean orderDataBean = new OrderDataBean();
    double expectedQuantity = 100.0;
    orderDataBean.setQuantity(expectedQuantity);
    assertEquals(expectedQuantity, orderDataBean.getQuantity(), 0.0);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testIsBuyTrue_vige0() throws Exception {
    OrderDataBean orderDataBean = new OrderDataBean("buy", "open", new Date(), new Date(), 100.0, new BigDecimal("150.00"), new BigDecimal("10.00"), accountDataBean, quoteDataBean, holdingDataBean);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS)
  public void testIsCancelledFalse_gkkh0() throws Exception {
    AccountDataBean accountDataBean = new AccountDataBean();
    QuoteDataBean quoteDataBean = new QuoteDataBean();
    HoldingDataBean holdingDataBean = new HoldingDataBean();
    OrderDataBean orderDataBean = new OrderDataBean("sell", "open", new Date(), new Date(), 100.0, new BigDecimal("150.00"), new BigDecimal("10.00"), accountDataBean, quoteDataBean, holdingDataBean);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testIsBuyFalse_KdGt1_hVKZ0() {
    AccountDataBean account = new AccountDataBean();
    QuoteDataBean quote = new QuoteDataBean("AAPL");
    HoldingDataBean holding = new HoldingDataBean();
    OrderDataBean order = new OrderDataBean("sell", "open", new Date(), new Date(), 100.0, new BigDecimal("150.00"), new BigDecimal("10.00"), account, quote, holding);
    assertFalse(order.isCancelled());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetCompletionDate_Ztef0() {
    Date initialDate = new Date();
    Date newCompletionDate = new Date(initialDate.getTime() + 100000); // adds 100 seconds to the initial date
    OrderDataBean orderDataBean = new OrderDataBean();
    orderDataBean.setCompletionDate(initialDate);
    orderDataBean.setCompletionDate(newCompletionDate);
    assertEquals(newCompletionDate, orderDataBean.getCompletionDate());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetAccount_VXWx0() {
    AccountDataBean expectedAccount = new AccountDataBean(1, 5, 3, new Date(), new Date(), new BigDecimal("1000.00"), new BigDecimal("1000.00"), "profile123");
    QuoteDataBean quote = new QuoteDataBean("AAPL");
    HoldingDataBean holding = new HoldingDataBean(1, 150.0, new BigDecimal("150.00"), new Date(), "AAPL");
    OrderDataBean order = new OrderDataBean("BUY", "OPEN", new Date(), new Date(), 150.0, new BigDecimal("150.00"), new BigDecimal("10.00"), expectedAccount, quote, holding);
    AccountDataBean resultAccount = order.getAccount();
    assertEquals(expectedAccount, resultAccount);
  }
}