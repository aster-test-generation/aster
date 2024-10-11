/**
 * Generated by Aster
 */
package com.ibm.websphere.samples.daytrader.entities;
import java.math.BigDecimal;
import java.util.Date;
import com.ibm.websphere.samples.daytrader.util.Log;
import com.ibm.websphere.samples.daytrader.util.TradeConfig;
import java.util.Date;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoSettings;
import org.mockito.quality.Strictness;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;   
@ExtendWith(MockitoExtension.class)
@MockitoSettings(strictness = Strictness.LENIENT)
public class Aster_OrderDataBean_Test_Failing {
@Mock
    private TradeConfig tradeConfig;
@Mock
    private QuoteDataBean quoteDataBean;
@Mock
    private AccountDataBean accountDataBean;
@Mock
    private HoldingDataBean holdingDataBean;
private OrderDataBean orderDataBean;
@Mock
    private Integer orderID;
@Mock
    private OrderDataBean orderdatabean;
@Mock
    private Log log;
@Mock
    private HoldingDataBean holding;
@Mock
    private QuoteDataBean quote;
@Mock
    private BigDecimal price;
private String symbol;
@Mock
    private AccountDataBean account;
@Mock
    private BigDecimal orderFee;
@Mock
    private Date openDate;
@Mock
    private Date completionDate;
private String orderType;
    private double quantity; /* quantity */
    private String orderStatus; /*
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetOrderStatus() {
        orderDataBean = new OrderDataBean("Buy", "Open", new Date(), new Date(), 1.0, new BigDecimal("10.0"), new BigDecimal("1.0"), "AAPL");
        // Arrange
        String expectedOrderStatus = "Open";
        // Act
        String actualOrderStatus = orderDataBean.getOrderStatus();
        // Assert
        assertEquals(expectedOrderStatus, actualOrderStatus);
    }
    private String orderStatus; /*
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetOrderStatus() {
        orderDataBean = new OrderDataBean();
        String expectedOrderStatus = "TestOrderStatus";
        orderDataBean.setOrderStatus(expectedOrderStatus);
        assertEquals(expectedOrderStatus, orderDataBean.getOrderStatus());
    }
    @Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetPrice_nNdP0() {
        OrderDataBean orderDataBean = new OrderDataBean();
        BigDecimal price = new BigDecimal("10.00");
        orderDataBean.setPrice(price);
        assertEquals(price, orderDataBean.getPrice());
}
    @Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetPriceWithExistingPrice_doVe1() {
        OrderDataBean orderDataBean = new OrderDataBean();
        BigDecimal price = new BigDecimal("10.00");
        orderDataBean.setPrice(price);
        BigDecimal newPrice = new BigDecimal("20.00");
        orderDataBean.setPrice(newPrice);
        assertEquals(newPrice, orderDataBean.getPrice());
}
    @Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetPriceWithNull_qzEl2() {
        OrderDataBean orderDataBean = new OrderDataBean();
        orderDataBean.setPrice(null);
        assertEquals(null, orderDataBean.getPrice());
}
    @Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetPriceWithZero_Gnvv3() {
        OrderDataBean orderDataBean = new OrderDataBean();
        BigDecimal price = new BigDecimal("0.00");
        orderDataBean.setPrice(price);
        assertEquals(price, orderDataBean.getPrice());
    }
    @Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetOrderStatus_UfHd0() {
        OrderDataBean orderDataBean = new OrderDataBean("Buy", "Open", new Date(), new Date(), 1.0, new BigDecimal("10.0"), new BigDecimal("1.0"), "AAPL");
        assertEquals("Open", orderDataBean.getOrderStatus());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testgetSymbol() throws Exception{
        symbol = "ABC";
        Mockito.when(quote.getSymbol()).thenReturn(symbol);
        orderdatabean = new OrderDataBean();
        orderdatabean.setQuote(quote);
        assertEquals(symbol, orderdatabean.getSymbol());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testgetOrderID() throws Exception{
        orderdatabean = new OrderDataBean();
        Mockito.when(orderdatabean.getOrderID()).thenReturn(orderID);
        Integer actualOrderID = orderdatabean.getOrderID();
        assertEquals(orderID, actualOrderID);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSetOrderStatus_dbgX0() {
    OrderDataBean orderDataBean = new OrderDataBean("Buy", "New", new Date(), new Date(), 10.0, new BigDecimal("100.0"), new BigDecimal("10.0"), "AAPL");
    orderDataBean.setOrderStatus("Updated");
    assertEquals("Updated", orderDataBean.getOrderStatus());
}
    private String orderStatus; /*
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testisOpen_openOrder() throws Exception{
        orderdatabean = Mockito.mock(OrderDataBean.class);
        // Set up the order status to "open"
        Mockito.when(orderdatabean.getOrderStatus()).thenReturn("open");
        // Call the isOpen method
        boolean result = orderdatabean.isOpen();
        // Assert that the result is true
        Assertions.assertTrue(result);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testisOpen_processingOrder() throws Exception{
        orderdatabean = Mockito.mock(OrderDataBean.class);
        // Set up the order status to "processing"
        Mockito.when(orderdatabean.getOrderStatus()).thenReturn("processing");
        // Call the isOpen method
        boolean result = orderdatabean.isOpen();
        // Assert that the result is true
        Assertions.assertTrue(result);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testisOpen_closedOrder() throws Exception{
        orderdatabean = Mockito.mock(OrderDataBean.class);
        // Set up the order status to "closed"
        Mockito.when(orderdatabean.getOrderStatus()).thenReturn("closed");
        // Call the isOpen method
        boolean result = orderdatabean.isOpen();
        // Assert that the result is false
        Assertions.assertFalse(result);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testEqualsSameObject_NvkH0() {
    OrderDataBean order = new OrderDataBean(1, "BUY", "OPEN", new Date(), new Date(), 10, new BigDecimal("10.0"), new BigDecimal("1.0"), "AAPL");
    boolean result = order.equals(order);
    assert(result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testEqualsDifferentClass_FZfd1() {
    OrderDataBean order = new OrderDataBean(1, "BUY", "OPEN", new Date(), new Date(), 10, new BigDecimal("10.0"), new BigDecimal("1.0"), "AAPL");
    Object obj = new HoldingDataBean(1, 10, new BigDecimal("10.0"), new Date(), new QuoteDataBean("AAPL"));
    boolean result = order.equals(obj);
    assert(!result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testEqualsDifferentOrderID_UkHX2() {
    OrderDataBean order1 = new OrderDataBean(1, "BUY", "OPEN", new Date(), new Date(), 10, new BigDecimal("10.0"), new BigDecimal("1.0"), "AAPL");
    OrderDataBean order2 = new OrderDataBean(2, "BUY", "OPEN", new Date(), new Date(), 10, new BigDecimal("10.0"), new BigDecimal("1.0"), "AAPL");
    boolean result = order1.equals(order2);
    assert(!result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testEqualsNullObject_LdCA3() {
    OrderDataBean order = new OrderDataBean(1, "BUY", "OPEN", new Date(), new Date(), 10, new BigDecimal("10.0"), new BigDecimal("1.0"), "AAPL");
    boolean result = order.equals(null);
    assert(!result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testEqualsDifferentOrder_JUbO4() {
    OrderDataBean order1 = new OrderDataBean(1, "BUY", "OPEN", new Date(), new Date(), 10, new BigDecimal("10.0"), new BigDecimal("1.0"), "AAPL");
    OrderDataBean order2 = new OrderDataBean("SELL", "OPEN", new Date(), new Date(), 10, new BigDecimal("10.0"), new BigDecimal("1.0"), "AAPL");
    boolean result = order1.equals(order2);
    assert(!result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetSymbol_WhenQuoteNotNull_WtYE0() {
    OrderDataBean orderDataBean = new OrderDataBean("Buy", "Open", new Date(), new Date(), 10.0, new BigDecimal("100.0"), new BigDecimal("10.0"), new QuoteDataBean("AAPL", "Apple Inc.", 1000000, new BigDecimal("100.0"), new BigDecimal("90.0"), new BigDecimal("110.0"), new BigDecimal("120.0"), 0.0));
    String symbol = orderDataBean.getSymbol();
    assertEquals("AAPL", symbol);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetSymbol_WhenQuoteNull_gGhu1() {
    OrderDataBean orderDataBean = new OrderDataBean();
    String symbol = orderDataBean.getSymbol();
    assertEquals("", symbol);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testToString() throws Exception {
        orderdatabean = new OrderDataBean(
                1, "BUY", "OPEN", new Date(), new Date(), 10.0, new BigDecimal("100.0"), new BigDecimal("10.0"), "AAPL"
        );
        String expected = "Order 1\n\t      orderType: BUY\n\t    orderStatus: OPEN\n\t       openDate: " + orderdatabean.getOpenDate().toString() + "\n\t completionDate: " + orderdatabean.getCompletionDate().toString() + "\n\t       quantity: 10.0\n\t          price: 100.0\n\t       orderFee: 10.0\n\t         symbol: AAPL";
        assertEquals(expected, orderdatabean.toString());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testsetAccount() throws Exception{
        orderdatabean = new OrderDataBean();
        // Arrange
        AccountDataBean accountMock = Mockito.mock(AccountDataBean.class);
        // Act
        orderdatabean.setAccount(accountMock);
        // Assert
        Mockito.verify(orderdatabean, Mockito.times(1)).setAccount(accountMock);
        Assertions.assertEquals(orderdatabean.getAccount(), accountMock);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testOpenOrder_mbpG0() {
    OrderDataBean order = new OrderDataBean("buy", "open", new Date(), new Date(), 10, BigDecimal.valueOf(10.0), BigDecimal.valueOf(1.0), "AAPL");
    assertTrue(order.isOpen());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testProcessingOrder_YWca1() {
    OrderDataBean order = new OrderDataBean("sell", "processing", new Date(), new Date(), 10, BigDecimal.valueOf(10.0), BigDecimal.valueOf(1.0), "AAPL");
    assertTrue(order.isOpen());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testClosedOrder_TJXj2() {
    OrderDataBean order = new OrderDataBean("sell", "completed", new Date(), new Date(), 10, BigDecimal.valueOf(10.0), BigDecimal.valueOf(1.0), "AAPL");
    assertFalse(order.isOpen());
}
    @Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetOrderID_MpPj0() {
        OrderDataBean orderDataBean = new OrderDataBean(Integer.valueOf(1), "BUY", "COMPLETED", new Date(), new Date(), 10.0, BigDecimal.valueOf(100.0), BigDecimal.valueOf(10.0), "AAPL");
        assertEquals(Integer.valueOf(1), orderDataBean.getOrderID());
}
    @Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetOrderIDWithNull_JSQG1() {
        OrderDataBean orderDataBean = new OrderDataBean();
        assertEquals(null, orderDataBean.getOrderID());
}
    @Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetOrderIDWithDefault_dtYQ2() {
        OrderDataBean orderDataBean = new OrderDataBean(Integer.valueOf(1), "BUY", "COMPLETED", new Date(), new Date(), 10.0, BigDecimal.valueOf(100.0), BigDecimal.valueOf(10.0), "AAPL");
        assertEquals(Integer.valueOf(1), orderDataBean.getOrderID());
}
    @Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetOrderIDWithParameters_dYMc3() {
        OrderDataBean orderDataBean = new OrderDataBean(Integer.valueOf(1), "BUY", "COMPLETED", new Date(), new Date(), 10.0, BigDecimal.valueOf(100.0), BigDecimal.valueOf(10.0), "AAPL", new AccountDataBean(), new QuoteDataBean("AAPL"), new HoldingDataBean(10.0, BigDecimal.valueOf(100.0), new Date(), new AccountDataBean(), new QuoteDataBean("AAPL")));
        assertEquals(Integer.valueOf(1), orderDataBean.getOrderID());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testsetOrderFee() throws Exception{
        orderdatabean = new OrderDataBean();
        // Arrange
        BigDecimal expectedOrderFee = new BigDecimal("10.00");
        // Act
        orderdatabean.setOrderFee(expectedOrderFee);
        // Assert
        assertEquals(expectedOrderFee, orderdatabean.getOrderFee);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testgetOpenDate() {
        orderdatabean = new OrderDataBean();
        orderdatabean.setOpenDate(openDate);
        // Arrange
        Date expectedOpenDate = new Date();
        // Act
        Date actualOpenDate = orderdatabean.getOpenDate();
        // Assert
        assertEquals(expectedOpenDate, actualOpenDate);
    }
    @Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetAccount_cbRt0() {
        OrderDataBean orderDataBean = new OrderDataBean();
        AccountDataBean accountDataBean = new AccountDataBean();
        orderDataBean.setAccount(accountDataBean);
        assertEquals(accountDataBean, orderDataBean.getAccount());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSetOrderFee_sBWE0() {
    OrderDataBean orderDataBean = new OrderDataBean();
    BigDecimal orderFee = new BigDecimal("10.00");
    orderDataBean.setOrderFee(orderFee);
    assertEquals(orderFee, orderDataBean.getOrderFee());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testsetOpenDate() {
        orderdatabean = new OrderDataBean();
        // Arrange
        Date expectedOpenDate = new Date();
        // Act
        orderdatabean.setOpenDate(expectedOpenDate);
        // Assert
        assertEquals(expectedOpenDate, orderdatabean.getOpenDate());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testsetHolding() {
        orderdatabean = new OrderDataBean();
        // Arrange
        HoldingDataBean expectedHolding = new HoldingDataBean();
        // Act
        orderdatabean.setHolding(holding);
        // Assert
        assertEquals(expectedHolding, orderdatabean.getHolding());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testgetCompletionDate() {
        MockitoAnnotations.initMocks(this);
        orderdatabean = new OrderDataBean();
        ocompletionDatee;
        // Act
        Date result = orderdatabean.getCompletionDate();
        // Assert
        assertEquals(completionDate, result);
    }
    @Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testToString_wrnX0() {
        OrderDataBean order = new OrderDataBean(1, "BUY", "COMPLETED", new java.util.Date(), new java.util.Date(), 10.0, new java.math.BigDecimal("10.0"), new java.math.BigDecimal("1.0"), "AAPL");
        String result = order.toString();
        assert result.contains("Order 1");
        assert result.contains("orderType: BUY");
        assert result.contains("orderStatus: COMPLETED");
        assert result.contains("openDate: ");
        assert result.contains("completionDate: ");
        assert result.contains("quantity: 10.0");
        assert result.contains("price: 10.0");
        assert result.contains("orderFee: 1.0");
        assert result.contains("symbol: AAPL");
}
    @Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testToStringWithNullFields_buap1() {
        OrderDataBean order = new OrderDataBean();
        String result = order.toString();
        assert result.contains("Order ");
        assert result.contains("orderType: ");
        assert result.contains("orderStatus: ");
        assert result.contains("openDate: ");
        assert result.contains("completionDate: ");
        assert result.contains("quantity: ");
        assert result.contains("price: ");
        assert result.contains("orderFee: ");
        assert result.contains("symbol: ");
}
    @Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testToStringWithAllFields_hmNf2() {
        OrderDataBean order = new OrderDataBean(1, "BUY", "COMPLETED", new java.util.Date(), new java.util.Date(), 10.0, new java.math.BigDecimal("10.0"), new java.math.BigDecimal("1.0"), "AAPL", new AccountDataBean(1, 1, 1, new java.util.Date(), new java.util.Date(), new java.math.BigDecimal("100.0"), new java.math.BigDecimal("100.0"), "profileID"), new QuoteDataBean("AAPL"), new HoldingDataBean(1, 10.0, new java.math.BigDecimal("10.0"), new java.util.Date(), new AccountDataBean(1, 1, 1, new java.util.Date(), new java.util.Date(), new java.math.BigDecimal("100.0"), new java.math.BigDecimal("100.0"), "profileID"), new QuoteDataBean("AAPL")));
        String result = order.toString();
        assert result.contains("Order 1");
        assert result.contains("orderType: BUY");
        assert result.contains("orderStatus: COMPLETED");
        assert result.contains("openDate: ");
        assert result.contains("completionDate: ");
        assert result.contains("quantity: 10.0");
        assert result.contains("price: 10.0");
        assert result.contains("orderFee: 1.0");
        assert result.contains("symbol: AAPL");
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSetOpenDate_orvn0() {
    OrderDataBean order = new OrderDataBean("Buy", "Open", new Date(), null, 1.0, new BigDecimal("10.0"), new BigDecimal("1.0"), "AAPL");
    Date expectedOpenDate = new Date();
    order.setOpenDate(expectedOpenDate);
    assertEquals(expectedOpenDate, order.getOpenDate());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testisSell() throws Exception{
        orderdatabean = Mockito.mock(OrderDataBean.class);
        Mockito.when(orderdatabean.getOrderType()).thenReturn("sell");
        boolean result = orderdatabean.isSell();
        Mockito.verify(orderdatabean).getOrderType();
        Assertions.assertTrue(result);
    }
    @Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetHolding_TUxO0() {
        OrderDataBean orderDataBean = new OrderDataBean();
        HoldingDataBean holdingDataBean = new HoldingDataBean(10.0, new BigDecimal("100.0"), new Date(), new AccountDataBean(), new QuoteDataBean("AAPL"));
        orderDataBean.setHolding(holdingDataBean);
        assertEquals(holdingDataBean, orderDataBean.getHolding());
    }
    private String orderType; /* orderType (buy, sell, etc.) */
}