/**
 * Generated by Aster
 */
package com.ibm.websphere.samples.daytrader.web.jsf;

import java.math.BigDecimal;
import java.util.Date;
import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_OrderData_Test_Passing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetOrderFee_oIFo0() {
        OrderData orderData = new OrderData(1, "Open", new Date(), new Date(), new BigDecimal("10.0"), "Buy", 1.0, "AAPL", new BigDecimal("100.0"));
        BigDecimal fee = orderData.getOrderFee();
        assertEquals(new BigDecimal("10.0"), fee);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetOrderFee2_IJkv1() {
        OrderData orderData = new OrderData(1, "Open", new Date(), new Date(), new BigDecimal("10.0"), "Buy", 1.0, "AAPL");
        BigDecimal fee = orderData.getOrderFee();
        assertEquals(new BigDecimal("10.0"), fee);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetQuantity_oIOg1() {
        OrderData orderData = new OrderData(1, "open", new Date(), new Date(), new BigDecimal(10), "type", 2.0, "symbol", new BigDecimal(5));
        assertEquals(2.0, orderData.getQuantity());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetOrderType_MrOp0() {
        OrderData orderData = new OrderData(1, "Open", new Date(), null, new BigDecimal(10), "Buy", 1, "AAPL", new BigDecimal(100));
        orderData.setOrderType("Sell");
        assertEquals("Sell", orderData.getOrderType());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetPriceNull_nknZ1() {
        OrderData orderData = new OrderData(1, "Open", new Date(), null, new BigDecimal(0), "Buy", 1, "AAPL", new BigDecimal(100));
        orderData.setPrice(null);
        assertEquals(null, orderData.getPrice());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetOrderStatus_CfrP0() {
        OrderData orderData = new OrderData(1, "New", new Date(), new Date(), new BigDecimal("0.0"), "Buy", 1.0, "AAPL", new BigDecimal("100.0"));
        orderData.setOrderStatus("Confirmed");
        assertEquals("Confirmed", orderData.getOrderStatus());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetOrderStatus_rhlZ0() {
        OrderData orderData = new OrderData(1, "Active", new Date(), new Date(), new BigDecimal(10), "Buy", 1, "AAPL", new BigDecimal(100));
        assertEquals("Active", orderData.getOrderStatus());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetSymbol_iWOD1() {
        OrderData orderData = new OrderData(1, "Open", new Date(), new Date(), new BigDecimal(10), "Buy", 1, "AAPL");
        assertEquals("AAPL", orderData.getSymbol());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetOrderID_EctY0() {
        OrderData orderData = new OrderData(1, "Open", new java.util.Date(), new java.util.Date(), new java.math.BigDecimal("10.0"), "Buy", 1.0, "AAPL", new java.math.BigDecimal("100.0"));
        assertEquals(1, orderData.getOrderID());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetSymbol_LxGK1() {
        OrderData orderData = new OrderData(null, null, null, null, null, null, 0, null);
        orderData.setSymbol("AAPL");
        assertEquals("AAPL", orderData.getSymbol());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetOrderFee_XIdl1() {
        OrderData orderData = new OrderData(1, "Open", new Date(), null, BigDecimal.ZERO, "Buy", 1, "AAPL", BigDecimal.valueOf(100));
        BigDecimal orderFee = BigDecimal.valueOf(10);
        orderData.setOrderFee(orderFee);
        assertEquals(orderFee, orderData.getOrderFee());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetOpenDate_OKnq0() {
        OrderData orderData = new OrderData(1, "open", new Date(), new Date(), new BigDecimal("10.0"), "type", 1.0, "symbol");
        Date openDate = orderData.getOpenDate();
        assert openDate != null;
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetOpenDate_zGGf0() {
        OrderData orderData = new OrderData(1, "open", new Date(), null, new BigDecimal(0), "type", 1, "symbol", new BigDecimal(1));
        Date expectedOpenDate = new Date();
        orderData.setOpenDate(expectedOpenDate);
        assertEquals(expectedOpenDate, orderData.getOpenDate());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetCompletionDate_tZXp0() {
        OrderData orderData = new OrderData(1, "Open", new Date(), null, new BigDecimal(0), "Buy", 1, "AAPL", new BigDecimal(100));
        Date completionDate = orderData.getCompletionDate();
        Assertions.assertEquals(completionDate, orderData.getCompletionDate());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetPrice_pNCw0() {
        OrderData orderData = new OrderData(1, "Open", new Date(), new Date(), new BigDecimal("10.0"), "Buy", 1.0, "AAPL", new BigDecimal("100.0"));
        BigDecimal result = orderData.getPrice();
        assertEquals(new BigDecimal("100.0"), result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetOrderType_KpqX1() {
        OrderData orderData = new OrderData(1, "Active", new Date(), new Date(), new BigDecimal("10.0"), "Market", 1.0, "AAPL");
        assertEquals("Market", orderData.getOrderType());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetTotal_Qbsk0() {
        OrderData orderData = new OrderData(1, "Open", new Date(), null, new BigDecimal(0), "Buy", 1, "AAPL", new BigDecimal(100));
        orderData.setTotal(new BigDecimal(1000));
        assertEquals(new BigDecimal(1000), orderData.getTotal());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetCompletionDateNull_WLIG1() {
        OrderData orderData = new OrderData(1, "Open", new Date(), null, new BigDecimal(0), "Buy", 1, "AAPL", new BigDecimal(100));
        orderData.setCompletionDate(null);
        assertEquals(null, orderData.getCompletionDate());
    }
}