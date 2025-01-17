/**
 * Generated by Aster
 */
package com.ibm.websphere.samples.daytrader.entities;

import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_AccountProfileDataBean_Coverage_Test_Passing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEquals1_YeKT0() {
        AccountProfileDataBean bean1 = new AccountProfileDataBean("1", "1", "1", "1", "1", "1");
        AccountProfileDataBean bean2 = new AccountProfileDataBean("1", "1", "1", "1", "1", "1");
        assertEquals(true, bean1.equals(bean2));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEquals2_Hjqq1() {
        AccountProfileDataBean bean1 = new AccountProfileDataBean("1", "1", "1", "1", "1", "1");
        AccountProfileDataBean bean2 = new AccountProfileDataBean("2", "1", "1", "1", "1", "1");
        assertEquals(false, bean1.equals(bean2));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHashCode_JXqc0()
    {
        AccountProfileDataBean bean = new AccountProfileDataBean();
        bean.setUserID("123456789");
        bean.setPassword("password");
        bean.setFullName("John Doe");
        bean.setAddress("123 Main Street");
        bean.setEmail("john.doe@example.com");
        bean.setCreditCard("1234-5678-9012-3456");
        int hash = bean.hashCode();
        assertEquals(hash, -1867378635);
    }
}