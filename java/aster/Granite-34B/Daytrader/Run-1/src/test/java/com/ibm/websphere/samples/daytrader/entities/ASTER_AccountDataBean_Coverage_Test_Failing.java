/**
 * Generated by Aster
 */
package com.ibm.websphere.samples.daytrader.entities;

import java.math.BigDecimal;
import java.util.Date;
import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_AccountDataBean_Coverage_Test_Failing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testLoginWithCorrectPassword_tDAp0() {
        AccountDataBean account = new AccountDataBean(1, 1, 1, new Date(), new Date(), new BigDecimal(100), new BigDecimal(100), "profileID");
        account.login("password");
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testLoginWithIncorrectPassword_gHGm1() {
        AccountDataBean account = new AccountDataBean(1, 1, 1, new Date(), new Date(), new BigDecimal(100), new BigDecimal(100), "profileID");
        account.login("correctPassword");
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testLoginWithNullPassword_nuhn2() {
        AccountDataBean account = new AccountDataBean(1, 1, 1, new Date(), new Date(), new BigDecimal(100), new BigDecimal(100), "profileID");
        account.login(null);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testLoginWithEmptyPassword_mHFK3() {
        AccountDataBean account = new AccountDataBean(1, 1, 1, new Date(), new Date(), new BigDecimal(100), new BigDecimal(100), "profileID");
        account.login("");
        account.login(null);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testLoginWithProfileNull_OvFg4() {
        AccountDataBean account = new AccountDataBean(1, 1, 1, new Date(), new Date(), new BigDecimal(100), new BigDecimal(100), null);
        account.login("password");
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testLoginWithIncorrectPassword_gHGm1_fid2() {
        AccountDataBean account = new AccountDataBean(1, 1, 1, new Date(), new Date(), new BigDecimal(100), new BigDecimal(100), "profileID");
        account.login(" incorrectPassword");
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testLoginWithEmptyPassword_mHFK3_fid2() {
        AccountDataBean account = new AccountDataBean(1, 1, 1, new Date(), new Date(), new BigDecimal(100), new BigDecimal(100), "profileID");
        account.login("");
    }
}