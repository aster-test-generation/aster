/**
 * Generated by Aster
 */
package org.apache.commons.jxpath;

import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_BasicNodeSet_Coverage_Test_Passing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testgetPointers_zrDp0() {
        BasicNodeSet instance = new BasicNodeSet();
        List expResult = Collections.emptyList();
        List result = instance.getPointers();
        assertEquals(expResult, result);
    }
}