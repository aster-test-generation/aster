/**
 * Generated by Aster
 */
package com.ibm.websphere.samples.daytrader.entities;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_AccountProfileDataBean_Coverage_Test_Passing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testEquals1_vjpA0() {
    AccountProfileDataBean bean1 = new AccountProfileDataBean();
    AccountProfileDataBean bean2 = new AccountProfileDataBean();
    bean1.setUserID("1");
    bean2.setUserID("1");
    assertEquals(true, bean1.equals(bean2));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testEquals2_yTvn1() {
    AccountProfileDataBean bean1 = new AccountProfileDataBean();
    AccountProfileDataBean bean2 = new AccountProfileDataBean();
    bean1.setUserID("1");
    bean2.setUserID("2");
    assertEquals(false, bean1.equals(bean2));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testEquals3_UPLP2() {
    AccountProfileDataBean bean1 = new AccountProfileDataBean();
    AccountProfileDataBean bean2 = new AccountProfileDataBean();
    bean1.setUserID(null);
    bean2.setUserID(null);
    assertEquals(true, bean1.equals(bean2));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testEquals4_IUIy3() {
    AccountProfileDataBean bean1 = new AccountProfileDataBean();
    AccountProfileDataBean bean2 = new AccountProfileDataBean();
    bean1.setUserID(null);
    bean2.setUserID("1");
    assertEquals(false, bean1.equals(bean2));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHashCode_RkzC0() {
        AccountProfileDataBean instance = new AccountProfileDataBean("123456789", "password", "John Doe", "123 Main St", "john.doe@example.com", "1234567890123456");
        int expResult =-1867378635;
        int result = instance.hashCode();
        assertEquals(expResult, result);
    }
}