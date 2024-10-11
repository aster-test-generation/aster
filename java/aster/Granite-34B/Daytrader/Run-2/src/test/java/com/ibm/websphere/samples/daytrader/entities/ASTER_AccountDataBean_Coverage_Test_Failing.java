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
    public void testLoginWithCorrectPassword_nPqp0() {
        AccountDataBean account = new AccountDataBean(1, 1, 1, new Date(), new Date(), new BigDecimal(100), new BigDecimal(100), "profileId");
        account.login("password");
        // Add assertions here to verify the expected behavior
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testLoginWithNullPassword_WHaR2() {
        AccountDataBean account = new AccountDataBean(1, 1, 1, new Date(), new Date(), new BigDecimal(100), new BigDecimal(100), "profileId");
        account.login(null);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testLoginWithEmptyPassword_fAHp3() {
        AccountDataBean account = new AccountDataBean(1, 1, 1, new Date(), new Date(), new BigDecimal(100), new BigDecimal(100), "profileId");
        account.login("");
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testLoginWithProfileNull_oukT4() {
        AccountDataBean account = new AccountDataBean(1, 1, 1, new Date(), new Date(), new BigDecimal(100), new BigDecimal(100), null);
        account.login("password");
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testLoginWithCorrectPassword_nPqp0_fid2() {
        AccountDataBean account = new AccountDataBean(1, 1, 1, new Date(), new Date(), new BigDecimal(100), new BigDecimal(100), "profileId");
        account.login("password");
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testLoginWithIncorrectPassword_ICnf1() {
        AccountDataBean account = new AccountDataBean(1, 1, 1, new Date(), new Date(), new BigDecimal(100), new BigDecimal(100), "profileId");
        account.login(" incorrectPassword");
    }
}