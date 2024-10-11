/**
 * Generated by Aster
 */
package com.ibm.websphere.samples.daytrader.web.jsf;
import java.math.BigDecimal;
import java.util.Date;
import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.Date;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_OrderData_Test_Passing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetOrderFee_APZI0() {
    OrderData orderData = new OrderData(1, "Open", new Date(), new Date(), new BigDecimal("10.00"), "Buy", 1, "AAPL", new BigDecimal("100.00"));
    BigDecimal result = orderData.getOrderFee();
    assertEquals(new BigDecimal("10.00"), result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetQuantity_eFVB1() {
    OrderData orderData = new OrderData(1, "Open", new Date(), new Date(), new BigDecimal(10), "Buy", 10, "AAPL");
    double quantity = orderData.getQuantity();
    assertEquals(10, quantity);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSetOrderType_ORjD0() {
    OrderData orderData = new OrderData(1, "Open", new Date(), null, new BigDecimal(0), "Buy", 1, "AAPL", new BigDecimal(100));
    orderData.setOrderType("Sell");
    assertEquals("Sell", orderData.getOrderType());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSetPrice_zWTO0() {
    OrderData orderData = new OrderData(1, "Open", new Date(), null, new BigDecimal(0), "Buy", 1, "AAPL", new BigDecimal(100));
    orderData.setPrice(new BigDecimal(200));
    assertEquals(new BigDecimal(200), orderData.getPrice());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSetOrderStatus_jPOH1() {
    OrderData orderData = new OrderData(1, "pending", new Date(), new Date(), new BigDecimal("10.0"), "buy", 1.0, "AAPL", new BigDecimal("100.0"));
    orderData.setOrderStatus("filled");
    assertEquals("filled", orderData.getOrderStatus());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetOrderStatus_TMdf1() {
    OrderData orderData = new OrderData(1, "Active", new Date(), new Date(), new BigDecimal("10.00"), "Buy", 1.0, "AAPL");
    assertEquals("Active", orderData.getOrderStatus());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetOrderID_XeAk1() {
    OrderData orderData = new OrderData(1, "Active", new Date(), new Date(), new BigDecimal("10.0"), "Buy", 1.0, "AAPL");
    assertEquals(1, orderData.getOrderID());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSetSymbol_KzxQ1() {
    OrderData orderData = new OrderData(1, "Open", new Date(), new Date(), new BigDecimal(10), "Buy", 1, "AAPL");
    orderData.setSymbol("MSFT");
    assertEquals("MSFT", orderData.getSymbol());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSetOrderFee_vEPz1() {
    OrderData orderData = new OrderData(1, "Open", new Date(), null, BigDecimal.ZERO, "Buy", 1, "AAPL", BigDecimal.valueOf(100));
    BigDecimal orderFee = BigDecimal.valueOf(10);
    orderData.setOrderFee(orderFee);
    assertEquals(orderFee, orderData.getOrderFee());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetOpenDate_Buys1() {
    OrderData orderData = new OrderData(1, "Open", new Date(), new Date(), new BigDecimal(1), "Buy", 1, "AAPL");
    Date openDate = orderData.getOpenDate();
    assertEquals(new Date(), openDate);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetCompletionDate_PvGq0() {
        OrderData orderData = new OrderData(1, "open", new Date(), null, new BigDecimal(10), "buy", 1.0, "AAPL", new BigDecimal(100));
        Date completionDate = orderData.getCompletionDate();
        assert completionDate == null;
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSetOpenDateNull_ysLm1() {
    OrderData orderData = new OrderData(1, "open", new Date(), null, new BigDecimal(10), "buy", 1, "AAPL", new BigDecimal(100));
    orderData.setOpenDate(null);
    assertEquals(null, orderData.getOpenDate());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetPrice_TKsb0() {
    OrderData orderData = new OrderData(1, "open", new Date(), new Date(), new BigDecimal("10.0"), "buy", 1.0, "AAPL", new BigDecimal("100.0"));
    BigDecimal result = orderData.getPrice();
    assertEquals(new BigDecimal("100.0"), result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetOrderType_AZoR1() {
    OrderData orderData = new OrderData(1, "Active", new Date(), new Date(), new BigDecimal("10.0"), "Buy", 1.0, "AAPL", new BigDecimal("100.0"));
    assertEquals("Buy", orderData.getOrderType());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSetQuantity_EiBn1() {
    OrderData orderData = new OrderData(1, "Open", new Date(), null, new BigDecimal(10), "Buy", 0, "AAPL", new BigDecimal(100));
    orderData.setQuantity(10);
    assertEquals(10, orderData.getQuantity(), 0);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetTotal_WlkG0() {
        OrderData orderData = new OrderData(1, "Open", new java.util.Date(), null, new java.math.BigDecimal("10.0"), "Buy", 1.0, "AAPL", new java.math.BigDecimal("100.0"));
        assertEquals(new java.math.BigDecimal("100.0"), orderData.getTotal());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSetCompletionDate_tdgG0() {
    OrderData orderData = new OrderData(1, "Open", new Date(), null, new BigDecimal(0), "Buy", 1, "AAPL", new BigDecimal(100));
    Date completionDate = new Date();
    orderData.setCompletionDate(completionDate);
    assertEquals(completionDate, orderData.getCompletionDate());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSetTotal_rZxO1() {
    OrderData orderData = new OrderData(1, "open", new Date(), new Date(), new BigDecimal("10.0"), "buy", 1.0, "AAPL", new BigDecimal("100.0"));
    orderData.setTotal(new BigDecimal("100.0"));
    assertEquals(new BigDecimal("100.0"), orderData.getTotal());
}
}