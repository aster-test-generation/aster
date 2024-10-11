/**
 * Generated by Aster
 */
package com.ibm.websphere.samples.daytrader.web.jsf;

import java.math.BigDecimal;
import java.util.Date;
import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_OrderData_Test_Passing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetOrderFee_Fwek0_1() {
        OrderData orderData = new OrderData(1, "open", new Date(), new Date(), new BigDecimal("100.00"), "limit", 100, "AAPL");
        BigDecimal orderFee = orderData.getOrderFee();
        assertNotNull(orderFee);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetOrderFee_Fwek0_2() {
        OrderData orderData = new OrderData(1, "open", new Date(), new Date(), new BigDecimal("100.00"), "limit", 100, "AAPL");
        BigDecimal orderFee = orderData.getOrderFee();
        assertEquals(new BigDecimal("100.00"), orderFee);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testgetQuantity_Jjxo0() {
        OrderData orderData = new OrderData(1, "open", new Date(), new Date(), new BigDecimal(100), "limit", 100, "symbol");
        assertEquals(100, orderData.getQuantity(), 0);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetPrice_sWhS0() {
        OrderData orderData = new OrderData(1, "open", new Date(), new Date(), new BigDecimal(100), "limit", 100, "AAPL");
        orderData.setPrice(new BigDecimal(100));
        assertEquals(new BigDecimal(100), orderData.getPrice());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetPriceWithNullPrice_ZCCQ1() {
        OrderData orderData = new OrderData(1, "open", new Date(), new Date(), new BigDecimal(100), "limit", 100, "AAPL");
        orderData.setPrice(null);
        assertNull(orderData.getPrice());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetPriceWithZeroPrice_PZcA2() {
        OrderData orderData = new OrderData(1, "open", new Date(), new Date(), new BigDecimal(100), "limit", 100, "AAPL");
        orderData.setPrice(new BigDecimal(0));
        assertEquals(new BigDecimal(0), orderData.getPrice());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetOrderStatus_ZvLN0() {
        OrderData orderData = new OrderData(1, "Open", new Date(), null, new BigDecimal(100.0), "Limit", 100.0, "AAPL");
        String orderStatus = orderData.getOrderStatus();
        assertEquals("Open", orderStatus);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testgetSymbol_MgEt0() {
        OrderData orderData = new OrderData(1, "Open", new Date(), new Date(), new BigDecimal(10.0), "Limit", 100.0, "AAPL", new BigDecimal(150.0));
        assertEquals("AAPL", orderData.getSymbol());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetOrderID_Vpkk0() {
        OrderData orderData = new OrderData(1, "Open", new Date(), null, new BigDecimal("100.00"), "Limit", 100, "AAPL");
        Integer actualOrderID = orderData.getOrderID();
        Integer expectedOrderID = 1;
        assertEquals(expectedOrderID, actualOrderID);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetOrderID_WithNonNullCompleteDate_xBMy2() {
        OrderData orderData = new OrderData(1, "Open", new Date(), new Date(), new BigDecimal("100.00"), "Limit", 100, "AAPL");
        Integer actualOrderID = orderData.getOrderID();
        Integer expectedOrderID = 1;
        assertEquals(expectedOrderID, actualOrderID);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetOrderID_WithZeroQuantity_yqsb3() {
        OrderData orderData = new OrderData(1, "Open", new Date(), null, new BigDecimal("100.00"), "Limit", 0, "AAPL");
        Integer actualOrderID = orderData.getOrderID();
        Integer expectedOrderID = 1;
        assertEquals(expectedOrderID, actualOrderID);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetSymbol_CIjF0() {
        OrderData orderData = new OrderData(1, "open", new Date(), new Date(), new BigDecimal(100), "limit", 100, "symbol");
        orderData.setSymbol("newSymbol");
        assertEquals("newSymbol", orderData.getSymbol());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetOrderFee_anAL0() {
        OrderData orderData = new OrderData(1, "open", new Date(), new Date(), null, "limit", 100, "symbol");
        orderData.setOrderFee(new BigDecimal(10.0));
        assertEquals(new BigDecimal(10.0), orderData.getOrderFee());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testgetOpenDate_SsNU0() {
        OrderData orderData = new OrderData(1, "open", new Date(), null, new BigDecimal(100), "limit", 100, "AAPL");
        Date expected = new Date();
        assertEquals(expected, orderData.getOpenDate());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetOpenDate_ztbb0() {
        OrderData orderData = new OrderData(1, "open", new Date(), null, BigDecimal.ZERO, "limit", 100, "symbol");
        orderData.setOpenDate(new Date());
        assertEquals(new Date(), orderData.getOpenDate());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGettingOrderType_vFRp0() {
        OrderData orderData = new OrderData(1, "open", new Date(), new Date(), new BigDecimal(100), "limit", 100, "AAPL", new BigDecimal(150));
        assertEquals("limit", orderData.getOrderType());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    void testSetOrderID_IjFH0() {
        OrderData orderData = new OrderData(1, "open", new Date(), new Date(), new BigDecimal(100), "limit", 100, "symbol");
        orderData.setOrderID(2);
        assertEquals(2, orderData.getOrderID());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    void testSetOrderIDWithZero_FJUi2() {
        OrderData orderData = new OrderData(1, "open", new Date(), new Date(), new BigDecimal(100), "limit", 100, "symbol");
        orderData.setOrderID(0);
        assertFalse(orderData.getOrderID() > 0);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    void testSetQuantity_tCRF0() {
        OrderData orderData = new OrderData(1, "open", new Date(), new Date(), BigDecimal.ZERO, "limit", 100.0, "symbol");
        orderData.setQuantity(50.0);
        assertEquals(50.0, orderData.getQuantity(), "Quantity should be 50.0");
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetTotal_SDsH0() {
        OrderData orderData = new OrderData(1, "Open", new Date(), new Date(), new BigDecimal(100.0), "Limit", 100.0, "AAPL");
        orderData.setTotal(new BigDecimal(200.0));
        assertEquals(new BigDecimal(200.0), orderData.getTotal());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetCompletionDate_WMvh0() {
        OrderData orderData = new OrderData(1, "open", new Date(), null, new BigDecimal(100), "limit", 100, "AAPL");
        orderData.setCompletionDate(new Date());
        assertEquals(orderData.getCompletionDate(), new Date());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetOrderFee_Fwek0() {
        OrderData orderData = new OrderData(1, "open", new Date(), new Date(), new BigDecimal("100.00"), "limit", 100, "AAPL");
        BigDecimal orderFee = orderData.getOrderFee();
        assertNotNull(orderFee);
        assertEquals(new BigDecimal("100.00"), orderFee);
    }
}