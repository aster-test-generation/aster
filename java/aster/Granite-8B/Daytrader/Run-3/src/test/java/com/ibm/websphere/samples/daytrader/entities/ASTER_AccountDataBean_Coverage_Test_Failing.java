/**
 * Generated by Aster
 */
package com.ibm.websphere.samples.daytrader.entities;

import java.math.BigDecimal;
import java.util.Date;
import java.util.concurrent.TimeUnit;
import javax.ejb.EJBException;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class Aster_AccountDataBean_Coverage_Test_Failing {
    private AccountDataBean account;

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testLoginWithNullPassword_yXOX2() {
        try {
            account.login(null);
            fail("Expected EJBException");
        } catch (EJBException e) {
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testLoginWithIncorrectPassword_Lqly3() {
        AccountProfileDataBean profile = mock(AccountProfileDataBean.class);
        when(profile.getPassword()).thenReturn(" incorrect");
        when(account.getProfile()).thenReturn(profile);
        try {
            account.login("correct");
            fail("Expected EJBException");
        } catch (EJBException e) {
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testLoginWithCorrectPassword_FrBe4() {
        AccountProfileDataBean profile = mock(AccountProfileDataBean.class);
        when(profile.getPassword()).thenReturn("correct");
        when(account.getProfile()).thenReturn(profile);
        account.login("correct");
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testLoginWithNullProfile_ubJC5() {
        when(account.getProfile()).thenReturn(null);
        try {
            account.login("correct");
            fail("Expected EJBException");
        } catch (EJBException e) {
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testLoginWithNullUserID_xeea8() {
        AccountProfileDataBean profile = mock(AccountProfileDataBean.class);
        when(profile.getUserID()).thenReturn(null);
        when(account.getProfile()).thenReturn(profile);
        try {
            account.login("correct");
            fail("Expected EJBException");
        } catch (EJBException e) {
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testLoginWithEmptyUserID_vSCp9() {
        AccountProfileDataBean profile = mock(AccountProfileDataBean.class);
        when(profile.getUserID()).thenReturn("");
        when(account.getProfile()).thenReturn(profile);
        try {
            account.login("correct");
            fail("Expected EJBException");
        } catch (EJBException e) {
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEquals2_VIJv1() {
        AccountDataBean bean1 = new AccountDataBean(1, 1, new Date(), new Date(), new BigDecimal(1), new BigDecimal(1), "1");
        AccountDataBean bean2 = new AccountDataBean(2, 1, new Date(), new Date(), new BigDecimal(1), new BigDecimal(1), "1");
        assertEquals(false, bean1.equals(bean2));
    }
}