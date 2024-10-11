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
public void testGetOrderFee_BjWo0() {
    OrderData orderData = new OrderData(1, "status", new Date(), new Date(), new BigDecimal("10.0"), "type", 10.0, "symbol", new BigDecimal("20.0"));
    assertEquals(new BigDecimal("10.0"), orderData.getOrderFee());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetQuantity_RmOK0() {
    OrderData orderData = new OrderData(1, "status", new Date(), new Date(), new BigDecimal("10.0"), "type", 10.0, "symbol");
    assertEquals(10.0, orderData.getQuantity(), 0.0);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSetOrderType_AxHG0() {
    OrderData orderData = new OrderData(1, "status", new Date(), new Date(), new BigDecimal("10.0"), "type", 10.0, "symbol", new BigDecimal("20.0"));
    orderData.setOrderType("newType");
    assertEquals("newType", orderData.getOrderType());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSetOrderStatus_jeFY0() {
    OrderData orderData = new OrderData(1, "status", new Date(), new Date(), BigDecimal.valueOf(10), "type", 10, "symbol", BigDecimal.valueOf(10));
    orderData.setOrderStatus("newStatus");
    assertEquals("newStatus", orderData.getOrderStatus());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSetPrice_NRxU0() {
    OrderData orderData = new OrderData(1, "status", new Date(), new Date(), BigDecimal.valueOf(10), "type", 10, "symbol");
    BigDecimal price = BigDecimal.valueOf(20);
    orderData.setPrice(price);
    assertEquals(price, orderData.getPrice());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetOrderStatus_SNxU0() {
    OrderData orderData = new OrderData(1, "Active", new Date(), null, BigDecimal.valueOf(10), "Buy", 10, "AAPL", BigDecimal.valueOf(100));
    assertEquals("Active", orderData.getOrderStatus());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetOrderStatus2_oExe1() {
    OrderData orderData = new OrderData(2, "Inactive", new Date(), new Date(), BigDecimal.valueOf(20), "Sell", 20, "GOOG");
    assertEquals("Inactive", orderData.getOrderStatus());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetSymbol_qsWv0() {
    OrderData orderData = new OrderData(1, "status", new Date(), new Date(), new BigDecimal("10.0"), "type", 10.0, "symbol");
    assertEquals("symbol", orderData.getSymbol());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSetSymbol_NukV0() {
    OrderData orderData = new OrderData(1, "status", new Date(), new Date(), new BigDecimal("10.0"), "type", 10.0, "symbol");
    orderData.setSymbol("newSymbol");
    assertEquals("newSymbol", orderData.getSymbol());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetOpenDate_XDut0() {
    OrderData orderData = new OrderData(1, "status", new Date(), new Date(), new BigDecimal("10.0"), "type", 10.0, "symbol", new BigDecimal("20.0"));
    Date openDate = orderData.getOpenDate();
    assertEquals(new Date(), openDate);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetOrderID_EHES0() {
    OrderData orderData = new OrderData(1, "status", new Date(), new Date(), new BigDecimal("10.0"), "type", 10.0, "symbol", new BigDecimal("20.0"));
    assertEquals(1, orderData.getOrderID());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetOrderID2_nFbl1() {
    OrderData orderData = new OrderData(2, "status", new Date(), new Date(), new BigDecimal("10.0"), "type", 10.0, "symbol");
    assertEquals(2, orderData.getOrderID());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSetOpenDate_ToCa0() {
    OrderData orderData = new OrderData(1, "status", new Date(), new Date(), new BigDecimal("10.0"), "type", 10.0, "symbol");
    Date date = new Date();
    orderData.setOpenDate(date);
    assertEquals(date, orderData.getOpenDate());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetCompletionDate_nkgG0() {
    OrderData orderData = new OrderData(1, "status", new Date(), new Date(), BigDecimal.valueOf(10), "type", 10, "symbol");
    Date completionDate = orderData.getCompletionDate();
    assertEquals(new Date(), completionDate);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSetOrderFee_wWtA0() {
    OrderData orderData = new OrderData(1, "status", new Date(), new Date(), BigDecimal.ZERO, "type", 1.0, "symbol");
    BigDecimal orderFee = BigDecimal.valueOf(10.0);
    orderData.setOrderFee(orderFee);
    assertEquals(orderFee, orderData.getOrderFee());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSetOrderID_LcQe0() {
    OrderData orderData = new OrderData(1, "status", new Date(), new Date(), BigDecimal.valueOf(10), "type", 10, "symbol");
    orderData.setOrderID(2);
    assertEquals(2, orderData.getOrderID().intValue());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetOrderType_cqCm0() {
    OrderData orderData = new OrderData(1, "status", new Date(), new Date(), new BigDecimal("10.0"), "type", 10.0, "symbol", new BigDecimal("20.0"));
    assertEquals("type", orderData.getOrderType());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetOrderTypeWithoutPrice_CvMI1() {
    OrderData orderData = new OrderData(1, "status", new Date(), new Date(), new BigDecimal("10.0"), "type", 10.0, "symbol");
    assertEquals("type", orderData.getOrderType());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSetTotal_Zsrx0() {
    OrderData orderData = new OrderData(1, "status", new Date(), new Date(), BigDecimal.valueOf(10), "type", 10, "symbol");
    BigDecimal total = BigDecimal.valueOf(100);
    orderData.setTotal(total);
    assertEquals(total, orderData.getTotal());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetPrice_McAJ0() {
    OrderData orderData = new OrderData(1, "status", new Date(), new Date(), new BigDecimal("10.0"), "type", 10.0, "symbol", new BigDecimal("20.0"));
    assertEquals(new BigDecimal("20.0"), orderData.getPrice());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSetQuantity_pvjF0() {
    OrderData orderData = new OrderData(1, "status", new Date(), new Date(), new BigDecimal("10.0"), "type", 10.0, "symbol");
    orderData.setQuantity(20.0);
    assertEquals(20.0, orderData.getQuantity(), 0.0);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetTotal_bKyz0() {
    OrderData orderData = new OrderData(1, "status", new Date(), new Date(), new BigDecimal("10.0"), "type", 10.0, "symbol", new BigDecimal("20.0"));
    BigDecimal total = orderData.getTotal();
    assertEquals(new BigDecimal("200.0"), total);
}
}