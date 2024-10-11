/**
 * Generated by Aster
 */
package org.apache.commons.jxpath.ri.compiler;

import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_LocationPath_Coverage_Test_Failing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testToStringWithStepsAndNotAbsolute_eNKm1() {
        LocationPath locationPath = new LocationPath(false, new Step[1]);
        assertNull(locationPath.toString());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testComputeContextDependentWithAbsoluteTrueAndSuperComputeContextDependentTrue_JuQm0() {
        LocationPath locationPath = new LocationPath(true, new Step[0]);
        boolean actual = locationPath.computeContextDependent();
        boolean expected = true;
        assert actual == expected;
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testComputeContextDependentWithAbsoluteFalseAndSuperComputeContextDependentFalse_gyLr3() {
        LocationPath locationPath = new LocationPath(false, new Step[0]);
        boolean actual = locationPath.computeContextDependent();
        boolean expected = false;
        assert actual == expected;
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testToStringWithStepsAndAbsolute_AWac0() {
        LocationPath locationPath = new LocationPath(true, new Step[1]);
        assertEquals("true", locationPath.toString());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testToStringWithStepsAndNotAbsolute_eNKm1_fid1() {
        LocationPath locationPath = new LocationPath(false, new Step[1]);
        assertEquals("false", locationPath.toString());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testToStringWithoutStepsAndAbsolute_ZUEZ2() {
        LocationPath locationPath = new LocationPath(true, new Step[0]);
        assertEquals("true", locationPath.toString());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testToStringWithoutStepsAndNotAbsolute_msQq3() {
        LocationPath locationPath = new LocationPath(false, new Step[0]);
        assertEquals("false", locationPath.toString());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testToStringWithNullSteps_Ypzr4() {
        LocationPath locationPath = new LocationPath(false, null);
        assertEquals("false", locationPath.toString());
    }
}