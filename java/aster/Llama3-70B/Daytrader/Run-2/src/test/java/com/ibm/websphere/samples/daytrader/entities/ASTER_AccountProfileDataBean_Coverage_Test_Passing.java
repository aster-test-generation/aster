/**
 * Generated by Aster
 */
package com.ibm.websphere.samples.daytrader.entities;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_AccountProfileDataBean_Coverage_Test_Passing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEquals_withNullUserID_CFhz0() {
        AccountProfileDataBean bean1 = new AccountProfileDataBean("user1", "password", "fullName", "address", "email", "creditCard");
        AccountProfileDataBean bean2 = new AccountProfileDataBean(null, "password", "fullName", "address", "email", "creditCard");
        assert !bean1.equals(bean2);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEquals_withDifferentUserID_IINJ1() {
        AccountProfileDataBean bean1 = new AccountProfileDataBean("user1", "password", "fullName", "address", "email", "creditCard");
        AccountProfileDataBean bean2 = new AccountProfileDataBean("user2", "password", "fullName", "address", "email", "creditCard");
        assert !bean1.equals(bean2);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEquals_withSameUserID_rVRd2() {
        AccountProfileDataBean bean1 = new AccountProfileDataBean("user1", "password", "fullName", "address", "email", "creditCard");
        AccountProfileDataBean bean2 = new AccountProfileDataBean("user1", "password", "fullName", "address", "email", "creditCard");
        assert bean1.equals(bean2);
    }
}