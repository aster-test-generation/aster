/**
 * Generated by Aster
 */
package org.apache.commons.jxpath.ri.compiler;

import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_LocationPath_Coverage_Test_Passing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testToStringWithNullSteps_ovoa4() {
        LocationPath locationPath = new LocationPath(false, null);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testComputeContextDependent1_iogR0() {
        LocationPath locationPath = new LocationPath(true, new Step[0]);
        boolean actual = locationPath.computeContextDependent();
        boolean expected = false;
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testComputeContextDependent2_qFnQ1() {
        LocationPath locationPath = new LocationPath(false, new Step[0]);
        boolean actual = locationPath.computeContextDependent();
        boolean expected = true;
        assertEquals(expected, actual);
    }
}