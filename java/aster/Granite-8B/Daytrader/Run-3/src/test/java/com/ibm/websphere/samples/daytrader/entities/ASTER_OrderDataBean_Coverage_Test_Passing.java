/**
 * Generated by Aster
 */
package com.ibm.websphere.samples.daytrader.entities;

import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_OrderDataBean_Coverage_Test_Passing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsOpen1_BpGq0() {
        OrderDataBean orderDataBean = new OrderDataBean();
        orderDataBean.setOrderStatus("open");
        boolean ret = orderDataBean.isOpen();
        Assertions.assertTrue(ret);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsOpen2_SbPk1() {
        OrderDataBean orderDataBean = new OrderDataBean();
        orderDataBean.setOrderStatus("processing");
        boolean ret = orderDataBean.isOpen();
        Assertions.assertTrue(ret);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsOpen3_XLlV2() {
        OrderDataBean orderDataBean = new OrderDataBean();
        orderDataBean.setOrderStatus("cancel");
        boolean ret = orderDataBean.isOpen();
        Assertions.assertFalse(ret);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsOpen4_KsVX3() {
        OrderDataBean orderDataBean = new OrderDataBean();
        orderDataBean.setOrderStatus("complete");
        boolean ret = orderDataBean.isOpen();
        Assertions.assertFalse(ret);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsSell1_OkHp0() {
        OrderDataBean orderDataBean = new OrderDataBean();
        orderDataBean.setOrderType("BUY");
        boolean ret = orderDataBean.isSell();
        assertEquals(false, ret);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsSell2_Owgh1() {
        OrderDataBean orderDataBean = new OrderDataBean();
        orderDataBean.setOrderType("SELL");
        boolean ret = orderDataBean.isSell();
        assertEquals(true, ret);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsBuy1_Hmsj0() {
        OrderDataBean orderDataBean = new OrderDataBean();
        orderDataBean.setOrderType("BUY");
        boolean result = orderDataBean.isBuy();
        boolean expected = true;
        assertEquals(expected, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsBuy2_mshU1() {
        OrderDataBean orderDataBean = new OrderDataBean();
        orderDataBean.setOrderType("SELL");
        boolean result = orderDataBean.isBuy();
        boolean expected = false;
        assertEquals(expected, result);
    }
}