/**
 * Generated by Aster
 */
package com.ibm.websphere.samples.daytrader.entities;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.Date;
import javax.ejb.EJBException;
import static org.junit.jupiter.api.Assertions.*;
import java.util.Date;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_AccountDataBean_Coverage_Test_Passing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testLogin_ProfileNotNull_PasswordCorrect_NWAB0_1() {
        AccountDataBean account = new AccountDataBean();
        account.login("password");
        assertEquals(account.getLoginCount(), 1);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testLogin_ProfileNotNull_PasswordCorrect_NWAB0_2() {
        AccountDataBean account = new AccountDataBean();
        account.login("password");
        assertEquals(new Timestamp(System.currentTimeMillis()).toString(), account.getLastLogin().toString());}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testLogin_ProfileNull_wXgs1() {
        AccountDataBean account = new AccountDataBean();
        try {
            account.login("password");
            fail("Expected EJBException");
        } catch (EJBException e) {
            assertEquals("AccountBean:Login failure for account: null null AccountProfile", e.getMessage());
        }
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testLogin_ProfileNotNull_PasswordIncorrect_ErOf2() {
        AccountDataBean account = new AccountDataBean();
        try {
            account.login("wrongpassword");
            fail("Expected EJBException");
        } catch (EJBException e) {
            assertEquals("AccountBean:Login failure for account: null Incorrect password-->:null:null", e.getMessage());
        }
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testLogin_ProfileNotNull_PasswordCorrect_LoginCountIncremented_YrzN3() {
        AccountDataBean account = new AccountDataBean();
        account.setLoginCount(0);
        account.login("password");
        assertEquals(1, account.getLoginCount());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testLogin_ProfileNotNull_PasswordCorrect_LastLoginUpdated_ASPU4() {
        AccountDataBean account = new AccountDataBean();
        account.setLastLogin(new Timestamp(System.currentTimeMillis()));
        account.login("password");
        assertNotEquals(account.getLastLogin(), new Timestamp(System.currentTimeMillis()));
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEqualsWhenBothObjectsHaveSameAccountID_PhJa0() {
        AccountDataBean accountDataBean1 = new AccountDataBean(1, 0, 0, null, null, BigDecimal.ZERO, BigDecimal.ZERO, "profileID");
        AccountDataBean accountDataBean2 = new AccountDataBean(1, 0, 0, null, null, BigDecimal.ZERO, BigDecimal.ZERO, "profileID");
        assertTrue(accountDataBean1.equals(accountDataBean2));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEqualsWhenBothObjectsHaveDifferentAccountID_wHjR1() {
        AccountDataBean accountDataBean1 = new AccountDataBean(1, 0, 0, null, null, BigDecimal.ZERO, BigDecimal.ZERO, "profileID");
        AccountDataBean accountDataBean2 = new AccountDataBean(2, 0, 0, null, null, BigDecimal.ZERO, BigDecimal.ZERO, "profileID");
        assertFalse(accountDataBean1.equals(accountDataBean2));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEqualsWhenOneObjectHasNullAccountIDAndOtherHasNonNullAccountID_ibJo2() {
        AccountDataBean accountDataBean1 = new AccountDataBean(1, 0, 0, null, null, BigDecimal.ZERO, BigDecimal.ZERO, "profileID");
        AccountDataBean accountDataBean2 = new AccountDataBean(null, 0, 0, null, null, BigDecimal.ZERO, BigDecimal.ZERO, "profileID");
        assertFalse(accountDataBean1.equals(accountDataBean2));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEqualsWhenOneObjectHasNonNullAccountIDAndOtherHasNullAccountID_JUNk3() {
        AccountDataBean accountDataBean1 = new AccountDataBean(null, 0, 0, null, null, BigDecimal.ZERO, BigDecimal.ZERO, "profileID");
        AccountDataBean accountDataBean2 = new AccountDataBean(1, 0, 0, null, null, BigDecimal.ZERO, BigDecimal.ZERO, "profileID");
        assertFalse(accountDataBean1.equals(accountDataBean2));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEqualsWhenBothObjectsHaveDifferentAccountIDAndDifferentProfileID_Pmyk4() {
        AccountDataBean accountDataBean1 = new AccountDataBean(1, 0, 0, null, null, BigDecimal.ZERO, BigDecimal.ZERO, "profileID1");
        AccountDataBean accountDataBean2 = new AccountDataBean(2, 0, 0, null, null, BigDecimal.ZERO, BigDecimal.ZERO, "profileID2");
        assertFalse(accountDataBean1.equals(accountDataBean2));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEqualsWhenBothObjectsHaveSameAccountIDButDifferentProfileID_GuYH6() {
        AccountDataBean accountDataBean1 = new AccountDataBean(1, 0, 0, null, null, BigDecimal.ZERO, BigDecimal.ZERO, "profileID1");
        AccountDataBean accountDataBean2 = new AccountDataBean(1, 0, 0, null, null, BigDecimal.ZERO, BigDecimal.ZERO, "profileID2");
        assertFalse(accountDataBean1.equals(accountDataBean2));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEqualsWhenBothObjectsHaveSameAccountIDAndSameProfileIDButDifferentCreationDate_QrEO8() {
        AccountDataBean accountDataBean1 = new AccountDataBean(1, 0, 0, null, new Date(), BigDecimal.ZERO, BigDecimal.ZERO, "profileID");
        AccountDataBean accountDataBean2 = new AccountDataBean(1, 0, 0, null, new Date(1, 1, 1), BigDecimal.ZERO, BigDecimal.ZERO, "profileID");
        assertFalse(accountDataBean1.equals(accountDataBean2));
    }
}