/**
 * Generated by Aster
 */
package com.ibm.websphere.samples.daytrader.entities;

import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_AccountProfileDataBean_Test_Failing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHashCode_mqXN3() {
        AccountProfileDataBean accountProfileDataBean1 = AccountProfileDataBean.getRandomInstance();
        AccountProfileDataBean accountProfileDataBean2 = AccountProfileDataBean.getRandomInstance();
        int hashCode1 = accountProfileDataBean1.hashCode();
        int hashCode2 = accountProfileDataBean2.hashCode();
        assertEquals(hashCode1, hashCode2);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetAccount_KcqO7() {
        AccountProfileDataBean accountProfileDataBean = AccountProfileDataBean.getRandomInstance();
        AccountDataBean account = accountProfileDataBean.getAccount();
        assertNotNull(account);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHashCode_Xzwe0() {
        AccountProfileDataBean instance = new AccountProfileDataBean("12345", "password", "John Doe", "123 Main St", "johndoe@example.com", "1234567890123456");
        int expResult = 12345;
        int result = instance.hashCode();
        assertEquals(expResult, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHashCode2_QjCz1() {
        AccountProfileDataBean instance = new AccountProfileDataBean("67890", "password", "Jane Smith", "456 Elm St", "janesmith@example.com", "0987654321098765");
        int expResult = 67890;
        int result = instance.hashCode();
        assertEquals(expResult, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetFullNameWithNull_OmDA1() {
        AccountProfileDataBean accountProfileDataBean = new AccountProfileDataBean();
        accountProfileDataBean.setFullName(null);
        assertEquals("", accountProfileDataBean.getFullName());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetAccount_hnkg0() {
        AccountProfileDataBean accountProfile = new AccountProfileDataBean();
        AccountDataBean account = accountProfile.getAccount();
        assertNotNull(account);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHashCode_mqXN3_nYMR0() {
        AccountProfileDataBean accountProfileDataBean1 = AccountProfileDataBean.getRandomInstance();
        AccountProfileDataBean accountProfileDataBean2 = AccountProfileDataBean.getRandomInstance();
        int hashCode1 = accountProfileDataBean1.hashCode();
        int hashCode2 = accountProfileDataBean2.hashCode();
        assertEquals(Integer.valueOf(hashCode1), Integer.valueOf(hashCode2));
    }
}