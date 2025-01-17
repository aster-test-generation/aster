/**
 * Generated by Aster
 */
package com.ibm.websphere.samples.daytrader.web.prims.beanval;

import java.time.LocalDateTime;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_CDIMethodConstraintBean_Test_Passing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetHitCountWithMaxHitCount_NDnX1() {
        CDIMethodConstraintBean bean = new CDIMethodConstraintBean();
        LocalDateTime now = LocalDateTime.now();
        for (int i = 0; i < 100; i++) {
            bean.getHitCount(now);
        }
        int result = bean.getHitCount(now);
        assertEquals(101, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHitList_qJrc0_1() {
        CDIMethodConstraintBean bean = new CDIMethodConstraintBean();
        List<Integer> result = bean.hitList();
        assertNotNull(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHitList_qJrc0_2_fid1() {
        CDIMethodConstraintBean bean = new CDIMethodConstraintBean();
        List<Integer> result = bean.hitList();
        assertFalse(result.size() >= 1);
    }
}