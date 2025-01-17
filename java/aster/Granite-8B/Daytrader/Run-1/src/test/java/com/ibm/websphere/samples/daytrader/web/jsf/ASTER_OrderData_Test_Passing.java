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
    public void testGetQuantity_aXqG0() {
        OrderData orderData = new OrderData(1, "open", new Date(), new Date(), new BigDecimal(100), "limit", 100.0, "AAPL");
        assertEquals(100.0, orderData.getQuantity(), 0.0);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    void testSetPrice_VnJQ0() {
        OrderData orderData = new OrderData(1, "open", new Date(), new Date(), new BigDecimal("100"), "limit", 100, "symbol");
        orderData.setPrice(new BigDecimal("10"));
        assertEquals(new BigDecimal("10"), orderData.getPrice());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetOrderStatus_iRyT0() {
        OrderData orderData = new OrderData(1, "Open", new Date(), null, new BigDecimal("100.00"), "Limit", 100, "AAPL");
        assertEquals("Open", orderData.getOrderStatus());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetSymbol_fYGC0() {
        OrderData orderData = new OrderData(1, "open", new Date(), new Date(), new BigDecimal(100), "limit", 100, "AAPL", new BigDecimal(150));
        String symbol = orderData.getSymbol();
        assertEquals("AAPL", symbol);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetOrderID_YlMz0() {
        OrderData orderData = new OrderData(1, "Open", new Date(), null, new BigDecimal("100.00"), "Limit", 100, "AAPL");
        Integer expectedOrderID = 1;
        Integer actualOrderID = orderData.getOrderID();
        assertEquals(expectedOrderID, actualOrderID);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetSymbol_eqXZ0() {
        OrderData orderData = new OrderData(1, "open", new Date(), new Date(), new BigDecimal(100), "limit", 100, "symbol");
        orderData.setSymbol("newSymbol");
        assertEquals("newSymbol", orderData.getSymbol());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetOrderFee_hSDZ0() {
        OrderData orderData = new OrderData(1, "open", new Date(), new Date(), new BigDecimal("100.00"), "limit", 100, "AAPL");
        orderData.setOrderFee(new BigDecimal("5.00"));
        assertEquals(new BigDecimal("5.00"), orderData.getOrderFee());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    void testgetOpenDate() {
        OrderData orderData = new OrderData(1, "open", new Date(), null, new BigDecimal(100), "limit", 100, "symbol");
        assertEquals(new Date(), orderData.getOpenDate());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetOpenDate_ChjE0() {
        OrderData orderData = new OrderData(1, "open", new Date(), null, new BigDecimal(100), "limit", 100, "AAPL");
        orderData.setOpenDate(new Date());
        assertNotNull(orderData.getOpenDate());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testgetCompletionDate_fYeP0() {
        OrderData orderData = new OrderData(1, "open", new Date(), null, new BigDecimal(100), "limit", 100, "symbol");
        Date completionDate = orderData.getCompletionDate();
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetOrderType_mLIg0() {
        OrderData orderData = new OrderData(1, "open", new Date(), new Date(), new BigDecimal(100), "limit", 100, "AAPL");
        String orderType = orderData.getOrderType();
        assertEquals("limit", orderType);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetOrderType_UuVG1() {
        OrderData orderData = new OrderData(1, "open", new Date(), new Date(), new BigDecimal(100), "market", 100, "AAPL");
        String orderType = orderData.getOrderType();
        assertEquals("market", orderType);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetOrderType_iPmz2() {
        OrderData orderData = new OrderData(1, "open", new Date(), new Date(), new BigDecimal(100), "stop", 100, "AAPL");
        String orderType = orderData.getOrderType();
        assertEquals("stop", orderType);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetOrderType_MLtI3() {
        OrderData orderData = new OrderData(1, "open", new Date(), new Date(), new BigDecimal(100), "trailing stop", 100, "AAPL");
        String orderType = orderData.getOrderType();
        assertEquals("trailing stop", orderType);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetOrderType_SGtQ4() {
        OrderData orderData = new OrderData(1, "open", new Date(), new Date(), new BigDecimal(100), "other", 100, "AAPL");
        String orderType = orderData.getOrderType();
        assertEquals("other", orderType);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetOrderType_olmQ5() {
        OrderData orderData = new OrderData(1, "open", new Date(), new Date(), new BigDecimal(100), null, 100, "AAPL");
        String orderType = orderData.getOrderType();
        assertEquals(null, orderType);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetOrderID_aylK0() {
        OrderData orderData = new OrderData(123, "Open", new Date(), null, new BigDecimal("100.00"), "Limit", 100, "AAPL");
        orderData.setOrderID(456);
        assertEquals(456, orderData.getOrderID());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetQuantity_lhzg0() {
        OrderData orderData = new OrderData(1, "open", new Date(), new Date(), new BigDecimal(100), "limit", 100, "symbol");
        orderData.setQuantity(100);
        assertEquals(100, orderData.getQuantity(), 0);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetTotal_qmEQ0() {
        OrderData orderData = new OrderData(1, "Open", new Date(), new Date(), new BigDecimal(100.0), "Limit", 100.0, "AAPL");
        BigDecimal total = orderData.getTotal();
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetTotal_vSqD0() {
        OrderData orderData = new OrderData(1, "open", new Date(), new Date(), new BigDecimal(100), "limit", 100, "AAPL");
        orderData.setTotal(new BigDecimal(200));
        assertEquals(new BigDecimal(200), orderData.getTotal());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetCompletionDate_WWRJ0() {
        OrderData orderData = new OrderData(1, "open", new Date(), null, new BigDecimal(100), "limit", 100, "symbol");
        orderData.setCompletionDate(new Date());
        assertEquals(new Date(), orderData.getCompletionDate());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetCompletionDateWithNull_nMgr1() {
        OrderData orderData = new OrderData(1, "open", new Date(), null, new BigDecimal(100), "limit", 100, "symbol");
        orderData.setCompletionDate(null);
        assertNull(orderData.getCompletionDate());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetCompletionDateWithInvalidDate_zdIl2() {
        OrderData orderData = new OrderData(1, "open", new Date(), null, new BigDecimal(100), "limit", 100, "symbol");
        orderData.setCompletionDate(new Date(-1));
        assertNotNull(orderData.getCompletionDate());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetCompletionDateWithInvalidDate2_jtGQ3() {
        OrderData orderData = new OrderData(1, "open", new Date(), null, new BigDecimal(100), "limit", 100, "symbol");
        orderData.setCompletionDate(new Date(Long.MAX_VALUE));
        assertNotNull(orderData.getCompletionDate());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetCompletionDateWithInvalidDate3_xsyY4() {
        OrderData orderData = new OrderData(1, "open", new Date(), null, new BigDecimal(100), "limit", 100, "symbol");
        orderData.setCompletionDate(new Date(Long.MIN_VALUE));
        assertNotNull(orderData.getCompletionDate());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetCompletionDateWithInvalidDate4_iyKt5() {
        OrderData orderData = new OrderData(1, "open", new Date(), null, new BigDecimal(100), "limit", 100, "symbol");
        orderData.setCompletionDate(new Date(0));
        assertNotNull(orderData.getCompletionDate());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetCompletionDateWithInvalidDate5_JQHV6() {
        OrderData orderData = new OrderData(1, "open", new Date(), null, new BigDecimal(100), "limit", 100, "symbol");
        orderData.setCompletionDate(new Date(1));
        assertNotNull(orderData.getCompletionDate());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetCompletionDateWithInvalidDate6_lrjT7() {
        OrderData orderData = new OrderData(1, "open", new Date(), null, new BigDecimal(100), "limit", 100, "symbol");
        orderData.setCompletionDate(new Date(-1000));
        assertNotNull(orderData.getCompletionDate());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetCompletionDateWithInvalidDate7_uuXJ8() {
        OrderData orderData = new OrderData(1, "open", new Date(), null, new BigDecimal(100), "limit", 100, "symbol");
        orderData.setCompletionDate(new Date(1000));
        assertNotNull(orderData.getCompletionDate());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetOrderFee_iQlj0() {
        OrderData orderData = new OrderData(1, "open", new Date(), new Date(), new BigDecimal(100), "limit", 100, "AAPL");
        BigDecimal orderFee = orderData.getOrderFee();
        assertEquals(new BigDecimal(100), orderFee);
    }
}