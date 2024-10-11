/**
 * Generated by Aster
 */
package com.ibm.websphere.samples.daytrader.entities;
import java.math.BigDecimal;
import java.sql.Timestamp;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_AccountDataBean_Coverage_Test_Passing {
    @Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testLoginNullProfile_MSyH0() {
        AccountDataBean accountDataBean = new AccountDataBean(1, 0, 0, new Timestamp(System.currentTimeMillis()), new Timestamp(System.currentTimeMillis()), BigDecimal.ZERO, BigDecimal.ZERO, "profileID");
        accountDataBean.login("password");
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEquals_withDifferentAccountID_IeYP0() {
        AccountDataBean accountDataBean1 = new AccountDataBean(1, 0, null, null, null, null, null);
        AccountDataBean accountDataBean2 = new AccountDataBean(2, 0, null, null, null, null, null);
        assertFalse(accountDataBean1.equals(accountDataBean2));
    }

@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEquals_withSameAccountID_yUqd2() {
        AccountDataBean accountDataBean1 = new AccountDataBean(1, 0, null, null, null, null, null);
        AccountDataBean accountDataBean2 = new AccountDataBean(1, 0, null, null, null, null, null);
        assertTrue(accountDataBean1.equals(accountDataBean2));
    }
}