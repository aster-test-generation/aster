/**
 * Generated by Aster
 */
package com.ibm.websphere.samples.daytrader.web.prims.beanval;

import java.time.LocalDateTime;
import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_CDIMethodConstraintBean_Test_Passing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetHitCount_Kcdf0() {
        CDIMethodConstraintBean cdiMethodConstraintBean = new CDIMethodConstraintBean();
        LocalDateTime now = LocalDateTime.now();
        int hitCount = cdiMethodConstraintBean.getHitCount(now);
        Assertions.assertTrue(hitCount > 0);
    }
}