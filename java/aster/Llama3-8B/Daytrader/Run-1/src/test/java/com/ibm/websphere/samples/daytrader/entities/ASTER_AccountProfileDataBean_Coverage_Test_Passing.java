/**
 * Generated by Aster
 */
package com.ibm.websphere.samples.daytrader.entities;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_AccountProfileDataBean_Coverage_Test_Passing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetRandomInstanceUserID_BYKU0() {
        AccountProfileDataBean bean = AccountProfileDataBean.getRandomInstance();
        String userID = bean.getUserID();
        assertNotNull(userID);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetRandomInstancePassword_Ckwk1() {
        AccountProfileDataBean bean = AccountProfileDataBean.getRandomInstance();
        String password = bean.getPassword();
        assertNotNull(password);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetRandomInstanceFullName_qzPj2() {
        AccountProfileDataBean bean = AccountProfileDataBean.getRandomInstance();
        String fullName = bean.getFullName();
        assertNotNull(fullName);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetRandomInstanceAddress_tVUD3() {
        AccountProfileDataBean bean = AccountProfileDataBean.getRandomInstance();
        String address = bean.getAddress();
        assertNotNull(address);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetRandomInstanceEmail_VQUw4() {
        AccountProfileDataBean bean = AccountProfileDataBean.getRandomInstance();
        String email = bean.getEmail();
        assertNotNull(email);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetRandomInstanceCreditCard_sGJx5() {
        AccountProfileDataBean bean = AccountProfileDataBean.getRandomInstance();
        String creditCard = bean.getCreditCard();
        assertNotNull(creditCard);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEqualsWhenBothObjectsHaveSameUserID_YixI0() {
        AccountProfileDataBean bean1 = new AccountProfileDataBean("user1", "pass", "full1", "addr1", "email1", "credit1");
        AccountProfileDataBean bean2 = new AccountProfileDataBean("user1", "pass", "full1", "addr1", "email1", "credit1");
        assertTrue(bean1.equals(bean2));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEqualsWhenBothObjectsHaveDifferentUserID_atMQ1() {
        AccountProfileDataBean bean1 = new AccountProfileDataBean("user1", "pass", "full1", "addr1", "email1", "credit1");
        AccountProfileDataBean bean2 = new AccountProfileDataBean("user2", "pass", "full1", "addr1", "email1", "credit1");
        assertFalse(bean1.equals(bean2));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEqualsWhenOneObjectHasNullUserIDAndOtherHasNonNullUserID_efuz2() {
        AccountProfileDataBean bean1 = new AccountProfileDataBean("user1", "pass", "full1", "addr1", "email1", "credit1");
        AccountProfileDataBean bean2 = new AccountProfileDataBean(null, "pass", "full1", "addr1", "email1", "credit1");
        assertFalse(bean1.equals(bean2));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEqualsWhenOneObjectHasNonNullUserIDAndOtherHasNullUserID_sRys3() {
        AccountProfileDataBean bean1 = new AccountProfileDataBean(null, "pass", "full1", "addr1", "email1", "credit1");
        AccountProfileDataBean bean2 = new AccountProfileDataBean("user1", "pass", "full1", "addr1", "email1", "credit1");
        assertFalse(bean1.equals(bean2));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEqualsWhenOneObjectHasNullUserIDAndOtherHasDifferentUserID_qIrH5() {
        AccountProfileDataBean bean1 = new AccountProfileDataBean(null, "pass", "full1", "addr1", "email1", "credit1");
        AccountProfileDataBean bean2 = new AccountProfileDataBean("user2", "pass", "full1", "addr1", "email1", "credit1");
        assertFalse(bean1.equals(bean2));
    }
}