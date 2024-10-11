/**
 * Generated by Aster
 */
package com.ibm.websphere.samples.daytrader.entities;
import java.math.BigDecimal;
import java.util.Date;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import java.util.Date;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_OrderDataBean_Coverage_Test_Passing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEquals_withDifferentOrderID_wEet0() {
        OrderDataBean order1 = new OrderDataBean(1, "type", "status", new Date(), new Date(), 10.0, new BigDecimal(10.0), new BigDecimal(1.0), "symbol");
        OrderDataBean order2 = new OrderDataBean(2, "type", "status", new Date(), new Date(), 10.0, new BigDecimal(10.0), new BigDecimal(1.0), "symbol");
        assertFalse(order1.equals(order2));
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEquals_withNullOrderID_HYqy1() {
        OrderDataBean order1 = new OrderDataBean(null, "type", "status", new Date(), new Date(), 10.0, new BigDecimal(10.0), new BigDecimal(1.0), "symbol");
        OrderDataBean order2 = new OrderDataBean(1, "type", "status", new Date(), new Date(), 10.0, new BigDecimal(10.0), new BigDecimal(1.0), "symbol");
        assertFalse(order1.equals(order2));
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEquals_withSameOrderID_cHKO2() {
        OrderDataBean order1 = new OrderDataBean(1, "type", "status", new Date(), new Date(), 10.0, new BigDecimal(10.0), new BigDecimal(1.0), "symbol");
        OrderDataBean order2 = new OrderDataBean(1, "type", "status", new Date(), new Date(), 10.0, new BigDecimal(10.0), new BigDecimal(1.0), "symbol");
        assertTrue(order1.equals(order2));
    }

}