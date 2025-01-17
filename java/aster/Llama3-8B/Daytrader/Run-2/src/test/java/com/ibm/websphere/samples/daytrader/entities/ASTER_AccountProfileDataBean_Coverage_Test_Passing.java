/**
 * Generated by Aster
 */
package com.ibm.websphere.samples.daytrader.entities;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_AccountProfileDataBean_Coverage_Test_Passing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testEqualsNullObject_jYHY0() {
    AccountProfileDataBean account = new AccountProfileDataBean("user1", "pass1", "full1", "addr1", "email1", "cc1");
    Assertions.assertFalse(account.equals(null));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testEqualsDifferentClass_LOwo1() {
    AccountProfileDataBean account = new AccountProfileDataBean("user1", "pass1", "full1", "addr1", "email1", "cc1");
    Object obj = new Object();
    Assertions.assertFalse(account.equals(obj));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testEqualsSameObject_GQnh2() {
    AccountProfileDataBean account = new AccountProfileDataBean("user1", "pass1", "full1", "addr1", "email1", "cc1");
    Assertions.assertTrue(account.equals(account));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testEqualsDifferentUserID_zuDf3() {
    AccountProfileDataBean account1 = new AccountProfileDataBean("user1", "pass1", "full1", "addr1", "email1", "cc1");
    AccountProfileDataBean account2 = new AccountProfileDataBean("user2", "pass2", "full2", "addr2", "email2", "cc2");
    Assertions.assertFalse(account1.equals(account2));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testEqualsSameUserID_jKMN4() {
    AccountProfileDataBean account1 = new AccountProfileDataBean("user1", "pass1", "full1", "addr1", "email1", "cc1");
    AccountProfileDataBean account2 = new AccountProfileDataBean("user1", "pass2", "full2", "addr2", "email2", "cc2");
    Assertions.assertTrue(account1.equals(account2));
}
}