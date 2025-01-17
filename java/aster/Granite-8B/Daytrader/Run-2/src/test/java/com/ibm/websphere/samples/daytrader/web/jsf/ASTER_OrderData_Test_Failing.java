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

public class Aster_OrderData_Test_Failing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetPrice_IYNB0() {
        OrderData orderData = new OrderData(1, "open", new Date(), new Date(), new BigDecimal(100), "limit", 100, "AAPL");
        BigDecimal price = orderData.getPrice();
        assertNull(new BigDecimal(100));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    void testSetOrderIDWithNull_koyF1() {
        OrderData orderData = new OrderData(1, "open", new Date(), new Date(), new BigDecimal(100), "limit", 100, "symbol");
        orderData.setOrderID(null);
        assertNotNull(orderData.getOrderID());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetTotal_oEOM0() {
        OrderData orderData = new OrderData(1, "open", new Date(), new Date(), new BigDecimal(100), "limit", 100, "AAPL");
        BigDecimal total = orderData.getTotal();
        assertNull(new BigDecimal(100));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetPrice_IYNB0_fid1() {
        OrderData orderData = new OrderData(1, "open", new Date(), new Date(), new BigDecimal(100), "limit", 100, "AAPL");
        BigDecimal price = orderData.getPrice();
        assertEquals(new BigDecimal(100), price);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    void testSetOrderIDWithZero_FJUi2_fid1() {
        OrderData orderData = new OrderData(1, "open", new Date(), new Date(), new BigDecimal(100), "limit", 100, "symbol");
        orderData.setOrderID(0);
        assertTrue(orderData.getOrderID() > 0);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetTotal_oEOM0_fid1() {
        OrderData orderData = new OrderData(1, "open", new Date(), new Date(), new BigDecimal(100), "limit", 100, "AAPL");
        BigDecimal total = orderData.getTotal();
        assertEquals(new BigDecimal(100), total);
    }
}