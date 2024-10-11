/**
 * Generated by Aster
 */
package com.ibm.websphere.samples.daytrader.entities;

import com.ibm.websphere.samples.daytrader.util.Log;
import com.ibm.websphere.samples.daytrader.util.TradeConfig;
import java.math.BigDecimal;
import java.util.Date;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.mockito.junit.jupiter.MockitoSettings;
import org.mockito.quality.Strictness;

@ExtendWith(MockitoExtension.class)
@MockitoSettings(strictness = Strictness.LENIENT)
public class Aster_OrderDataBean_Test_Failing {
  @Mock
  private TradeConfig tradeConfig;
  @Mock
  private AccountDataBean accountDataBean;
  @Mock
  private QuoteDataBean quoteDataBean;
  @Mock
  private HoldingDataBean holdingDataBean;
  private OrderDataBean orderdatabean;
  private String symbol = "TEST_SYMBOL";
  private OrderDataBean orderDataBean;
  private Integer orderID;
  @Mock
  private Integer mockOrderID;
  private BigDecimal price;
  @Mock
  AccountDataBean account;
  @Mock
  QuoteDataBean quote;
  @Mock
  HoldingDataBean holding;
  @Mock
  private Log log;
  private double quantity = 10.0;
  private BigDecimal orderFee;
  private String orderType;
  OrderDataBean otherOrderdatabean;
  OrderDataBean differentOrderdatabean;
  private Date openDate;
  private Date completionDate;
  private String orderStatus; /*
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testgetOrderStatus() throws Exception{
        accountDataBean = new AccountDataBean();
        quoteDataBean = new QuoteDataBean("symbol");
        holdingDataBean = new HoldingDataBean(1.0, BigDecimal.valueOf(10.0), new Date(), accountDataBean, quoteDataBean);
        orderdatabean = new OrderDataBean("orderType", "orderStatus", new Date(), new Date(), 1.0, BigDecimal.valueOf(10.0), BigDecimal.valueOf(1.0), accountDataBean, quoteDataBean, holdingDataBean);
        String result = orderdatabean.getOrderStatus();
        assertEquals("orderStatus", result);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetOrderStatus_Lpqy0() {
    AccountDataBean account = new AccountDataBean(1, 1, 1, new Date(), new Date(), BigDecimal.valueOf(100), BigDecimal.valueOf(100), "profileID");
    QuoteDataBean quote = new QuoteDataBean("symbol", "companyName", 100, BigDecimal.valueOf(10), BigDecimal.valueOf(10), BigDecimal.valueOf(10), BigDecimal.valueOf(10), 1);
    HoldingDataBean holding = new HoldingDataBean(1, 100, BigDecimal.valueOf(10), new Date(), account, quote);
    OrderDataBean order = new OrderDataBean("Buy", "Open", new Date(), new Date(), 100, BigDecimal.valueOf(10), BigDecimal.valueOf(1), "symbol");
    assertEquals("Open", order.getOrderStatus());
}
    private String orderStatus; /*
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testsetOrderStatus() throws Exception{
        account = new AccountDataBean();
        quote = new QuoteDataBean("symbol");
        holding = new HoldingDataBean(1.0, BigDecimal.valueOf(10.0), new Date(), account, quote);
        orderdatabean = new OrderDataBean("type", "status", new Date(), new Date(), 1.0, BigDecimal.valueOf(10.0), BigDecimal.valueOf(1.0), account, quote, holding);
        String newOrderStatus = "NEW_STATUS";
        orderdatabean.setOrderStatus(newOrderStatus);
        assertEquals(newOrderStatus, orderdatabean.getOrderStatus());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSetOrderStatus_SfXk0() {
    OrderDataBean order = new OrderDataBean(1, "type", "status", new Date(), new Date(), 10.0, BigDecimal.valueOf(10.0), BigDecimal.valueOf(1.0), "symbol");
    order.setOrderStatus("newStatus");
    assertEquals("newStatus", order.getOrderStatus());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testgetSymbol_QuoteNotNull() throws Exception{
        quote = mock(QuoteDataBean.class);
        symbol = "symbol";
        orderdatabean = new OrderDataBean();
        orderdatabean.setQuote(quote);
        when(quote.getSymbol()).thenReturn("quoteSymbol");
        assertEquals("quoteSymbol", orderdatabean.getSymbol());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testgetSymbol_QuoteNull() throws Exception{
        quote = mock(QuoteDataBean.class);
        symbol = "symbol";
        orderdatabean = new OrderDataBean();
        orderdatabean.setQuote(quote);
        orderdatabean.setQuote(null);
        orderdatabean.setSymbol(symbol);
        assertEquals(symbol, orderdatabean.getSymbol());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetSymbol_QuoteNotNull_FuPo0() {
    QuoteDataBean quote = new QuoteDataBean("symbol");
    OrderDataBean order = new OrderDataBean("buy", "open", new Date(), new Date(), 10.0, BigDecimal.valueOf(10.0), BigDecimal.valueOf(1.0), null, quote, null);
    assertEquals("symbol", order.getSymbol());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetSymbol_QuoteNull_nKHu1() {
    OrderDataBean order = new OrderDataBean("sell", "close", new Date(), new Date(), 10.0, BigDecimal.valueOf(10.0), BigDecimal.valueOf(1.0), "symbol", null, null);
    assertEquals("symbol", order.getSymbol());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testgetOrderID() throws Exception{
        accountDataBean = new AccountDataBean();
        quoteDataBean = new QuoteDataBean("symbol");
        holdingDataBean = new HoldingDataBean(1.0, BigDecimal.valueOf(10.0), new Date(), accountDataBean, quoteDataBean);
        orderdatabean = new OrderDataBean("orderType", "orderStatus", new Date(), new Date(), 1.0, BigDecimal.valueOf(10.0), BigDecimal.valueOf(1.0), accountDataBean, quoteDataBean, holdingDataBean);
        oorderIDD;
        Integer result = orderdatabean.getOrderID();
        assertEquals(orderID, result);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetOrderID_fMDw0() {
    AccountDataBean account = new AccountDataBean(1, 1, 1, new Date(), new Date(), new BigDecimal("100.0"), new BigDecimal("100.0"), "profileID");
    QuoteDataBean quote = new QuoteDataBean("symbol", "companyName", 100.0, new BigDecimal("10.0"), new BigDecimal("10.0"), new BigDecimal("10.0"), new BigDecimal("10.0"), 1.0);
    HoldingDataBean holding = new HoldingDataBean(1, 100.0, new BigDecimal("10.0"), new Date(), quote);
    OrderDataBean order = new OrderDataBean(1, "orderType", "orderStatus", new Date(), new Date(), 100.0, new BigDecimal("10.0"), new BigDecimal("10.0"), "symbol");
    assertEquals(Integer.valueOf(1), order.getOrderID());
}
    private String orderStatus; /*
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testisOpen_openStatus() throws Exception{
        orderdatabean = Mockito.mock(OrderDataBean.class);
        when(orderdatabean.getOrderStatus()).thenReturn("open"); // default to "open" status
        assertTrue(orderdatabean.isOpen());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testisOpen_processingStatus() throws Exception{
        when(orderdatabean.getOrderStatus()).thenReturn("processing");
        orderdatabean = Mockito.mock(OrderDataBean.class);
        when(orderdatabean.getOrderStatus()).thenReturn("open"); // default to "open" status
        assertTrue(orderdatabean.isOpen());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testisOpen_closedStatus() throws Exception{
        orderdatabean = Mockito.mock(OrderDataBean.class);
        when(orderdatabean.getOrderStatus()).thenReturn("open"); // default to "open" status
        when(orderdatabean.getOrderStatus()).thenReturn("closed");
        assertFalse(orderdatabean.isOpen());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testIsOpen_Open_yltv0() {
    OrderDataBean order = new OrderDataBean(1, "limit", "open", new Date(), null, 10.0, new BigDecimal(10.0), new BigDecimal(1.0), "ABC");
    assertTrue(order.isOpen());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testIsOpen_Processing_XbLk1() {
    OrderDataBean order = new OrderDataBean(1, "market", "processing", new Date(), null, 20.0, new BigDecimal(20.0), new BigDecimal(2.0), "DEF");
    assertTrue(order.isOpen());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testIsOpen_Closed_zjWv2() {
    OrderDataBean order = new OrderDataBean(1, "stop", "closed", new Date(), new Date(), 30.0, new BigDecimal(30.0), new BigDecimal(3.0), "GHI");
    assertFalse(order.isOpen());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testToString() throws Exception {
        when(accountDataBean.toString()).thenReturn("AccountDataBean");
        when(quoteDataBean.toString()).thenReturn("QuoteDataBean");
        when(holdingDataBean.toString()).thenReturn("HoldingDataBean");
        orderdatabean = new OrderDataBean("orderType", "orderStatus", new Date(), new Date(), 10.0, BigDecimal.valueOf(10.0), BigDecimal.valueOf(1.0), accountDataBean, quoteDataBean, holdingDataBean);
        String expected = "Order null\n\t      orderType: orderType\n\t    orderStatus: orderStatus\n\t       openDate: " + orderdatabean.getOpenDate() + "\n\t completionDate: " + orderdatabean.getCompletionDate() + "\n\t       quantity: 10.0\n\t          price: 10.0\n\t       orderFee: 1.0\n\t         symbol: " + orderdatabean.getSymbol();
        assertEquals(expected, orderdatabean.toString());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testToString_oZWS0() {
    AccountDataBean account = new AccountDataBean(1, 1, 1, new Date(), new Date(), BigDecimal.valueOf(100), BigDecimal.valueOf(100), "profileID");
    QuoteDataBean quote = new QuoteDataBean("symbol", "companyName", 100, BigDecimal.valueOf(10), BigDecimal.valueOf(10), BigDecimal.valueOf(10), BigDecimal.valueOf(10), 1);
    HoldingDataBean holding = new HoldingDataBean(1, 100, BigDecimal.valueOf(10), new Date(), quote);
    OrderDataBean order = new OrderDataBean(1, "orderType", "orderStatus", new Date(), new Date(), 100, BigDecimal.valueOf(10), BigDecimal.valueOf(1), "symbol");
    String expected = "Order 1\n\t      orderType: orderType\n\t    orderStatus: orderStatus\n\t       openDate: " + order.getOpenDate() + "\n\t completionDate: " + order.getCompletionDate() + "\n\t       quantity: 100.0\n\t          price: 10.0\n\t       orderFee: 1.0\n\t         symbol: symbol";
    assertEquals(expected, order.toString());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testsetAccount() throws Exception{
        orderdatabean = new OrderDataBean();
        orderdatabean.setAccount(account);
        assertEquals(account);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testgetOpenDate() throws Exception{
        accountDataBean = new AccountDataBean();
        quoteDataBean = new QuoteDataBean("symbol");
        holdingDataBean = new HoldingDataBean(1.0, BigDecimal.valueOf(10.0), new Date(), accountDataBean, quoteDataBean);
        openDate = new Date();
        orderdatabean = new OrderDataBean("orderType", "orderStatus", openDate, new Date(), 1.0, BigDecimal.valueOf(10.0), BigDecimal.valueOf(1.0), "symbol", accountDataBean, quoteDataBean, holdingDataBean);
        Date result = orderdatabean.getOpenDate();
        assertEquals(openDate, result);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetOpenDate_udrq0() {
    AccountDataBean account = new AccountDataBean(1, 1, 1, new Date(), new Date(), new BigDecimal("100.0"), new BigDecimal("100.0"), "profileID");
    QuoteDataBean quote = new QuoteDataBean("symbol", "companyName", 100.0, new BigDecimal("100.0"), new BigDecimal("100.0"), new BigDecimal("100.0"), new BigDecimal("100.0"), 1.0);
    HoldingDataBean holding = new HoldingDataBean(1, 100.0, new BigDecimal("100.0"), new Date(), quote);
    OrderDataBean order = new OrderDataBean("Buy", "Open", new Date(), new Date(), 100.0, new BigDecimal("100.0"), new BigDecimal("10.0"), account, quote, holding);
    assertEquals(new Date(), order.getOpenDate());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testsetOpenDate() throws Exception{
        accountDataBean = new AccountDataBean();
        quoteDataBean = new QuoteDataBean("symbol");
        holdingDataBean = new HoldingDataBean(1.0, BigDecimal.valueOf(10.0), new Date(), accountDataBean, quoteDataBean);
        orderdatabean = new OrderDataBean("orderType", "orderStatus", new Date(), new Date(), 1.0, BigDecimal.valueOf(10.0), BigDecimal.valueOf(1.0), "symbol", accountDataBean, quoteDataBean, holdingDataBean);
        Date newOpenDate = new Date();
        orderdatabean.setOpenDate(newOpenDate);
        assertEquals(openDate);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testsetHolding() throws Exception{
        holding = mock(HoldingDataBean.class);
        orderdatabean = new OrderDataBean();
        orderdatabean.setHolding(holding);
        assertEquals(holding);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetCompletionDate_DqSp0() {
    AccountDataBean account = new AccountDataBean(1, 1, 1, new Date(), new Date(), new BigDecimal("100.0"), new BigDecimal("100.0"), "profileID");
    QuoteDataBean quote = new QuoteDataBean("symbol", "companyName", 100.0, new BigDecimal("10.0"), new BigDecimal("10.0"), new BigDecimal("10.0"), new BigDecimal("10.0"), 0.0);
    HoldingDataBean holding = new HoldingDataBean(1, 100.0, new BigDecimal("10.0"), new Date(), account, quote);
    OrderDataBean order = new OrderDataBean("buy", "open", new Date(), new Date(), 100.0, new BigDecimal("10.0"), new BigDecimal("1.0"), account, quote, holding);
    Date completionDate = order.getCompletionDate();
    assertNotNull(completionDate);
}
    private String orderType; /* orderType (buy, sell, etc.) */
}