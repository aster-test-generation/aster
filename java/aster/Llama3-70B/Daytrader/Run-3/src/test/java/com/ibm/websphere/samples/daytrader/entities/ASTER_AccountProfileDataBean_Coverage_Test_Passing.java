/**
 * Generated by Aster
 */
package com.ibm.websphere.samples.daytrader.entities;
import static org.junit.jupiter.api.Assertions.assertFalse;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_AccountProfileDataBean_Coverage_Test_Passing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEquals_withNullUserID_nCwP0() {
        AccountProfileDataBean bean1 = new AccountProfileDataBean("user1", "password", "fullName", "address", "email", "creditCard");
        AccountProfileDataBean bean2 = new AccountProfileDataBean(null, "password", "fullName", "address", "email", "creditCard");
        assertFalse(bean1.equals(bean2));
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEquals_withDifferentUserID_dJuf1() {
        AccountProfileDataBean bean1 = new AccountProfileDataBean("user1", "password", "fullName", "address", "email", "creditCard");
        AccountProfileDataBean bean2 = new AccountProfileDataBean("user2", "password", "fullName", "address", "email", "creditCard");
        assertFalse(bean1.equals(bean2));
    }
}