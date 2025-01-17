/**
 * Generated by Aster
 */
package com.ibm.websphere.samples.daytrader.entities;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_AccountProfileDataBean_Coverage_Test_Passing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEquals1_afui0() {
        AccountProfileDataBean accountProfileDataBean1 = new AccountProfileDataBean("1", "pass", "name", "address", "email", "creditCard");
        AccountProfileDataBean accountProfileDataBean2 = new AccountProfileDataBean("1", "pass", "name", "address", "email", "creditCard");
        assertEquals(accountProfileDataBean1, accountProfileDataBean2);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEquals2_gokT1() {
        AccountProfileDataBean accountProfileDataBean1 = new AccountProfileDataBean("1", "pass", "name", "address", "email", "creditCard");
        AccountProfileDataBean accountProfileDataBean2 = new AccountProfileDataBean("2", "pass", "name", "address", "email", "creditCard");
        assertNotEquals(accountProfileDataBean1, accountProfileDataBean2);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEquals3_Cmxw2() {
        AccountProfileDataBean accountProfileDataBean1 = new AccountProfileDataBean("1", "pass", "name", "address", "email", "creditCard");
        AccountProfileDataBean accountProfileDataBean2 = new AccountProfileDataBean(null, "pass", "name", "address", "email", "creditCard");
        assertNotEquals(accountProfileDataBean1, accountProfileDataBean2);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEquals4_WtGn3() {
        AccountProfileDataBean accountProfileDataBean1 = new AccountProfileDataBean("1", "pass", "name", "address", "email", "creditCard");
        AccountProfileDataBean accountProfileDataBean2 = new AccountProfileDataBean("1", null, "name", "address", "email", "creditCard");
        assertNotEquals(accountProfileDataBean1, accountProfileDataBean2);
    }
}