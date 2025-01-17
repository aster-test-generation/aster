/**
 * Generated by Aster
 */
package com.ibm.websphere.samples.daytrader.entities;

import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_AccountProfileDataBean_Coverage_Test_Failing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void test_equals_003_uSLO2_bIVy0_fid1() {
        AccountProfileDataBean acc1 = new AccountProfileDataBean("1", "1", "1", "1", "1", "1");
        AccountProfileDataBean acc2 = new AccountProfileDataBean("1", "1", "1", "1", "1", "1");
        acc2.setUserID(null);
        assertTrue(acc1.equals(acc2));
    }
}