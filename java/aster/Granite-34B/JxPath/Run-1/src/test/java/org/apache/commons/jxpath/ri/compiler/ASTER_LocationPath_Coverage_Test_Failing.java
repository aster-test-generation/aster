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

public class Aster_LocationPath_Coverage_Test_Failing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testToStringWithStepsAndAbsolute_ldAu0() {
        LocationPath locationPath = new LocationPath(true, new Step[1]);
        String actual = locationPath.toString();
        String expected = "/";
        assert actual.equals(expected);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testToStringWithStepsAndNotAbsolute_Cczo1() {
        LocationPath locationPath = new LocationPath(false, new Step[1]);
        String actual = locationPath.toString();
        String expected = "";
        assert actual.equals(expected);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testToStringWithStepsAndAbsoluteAndMultipleSteps_oWKY4() {
        LocationPath locationPath = new LocationPath(true, new Step[3]);
        String actual = locationPath.toString();
        String expected = "/step1/step2/step3";
        assert actual.equals(expected);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testComputeContextDependentWithAbsoluteTrueAndSuperComputeContextDependentTrue_iIsI0_fid1() {
        LocationPath locationPath = new LocationPath(true, new Step[0]);
        boolean actual = locationPath.computeContextDependent();
        boolean expected = true;
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testComputeContextDependentWithAbsoluteFalse_LXDZ2_fid1() {
        LocationPath locationPath = new LocationPath(false, new Step[0]);
        boolean actual = locationPath.computeContextDependent();
        boolean expected = false;
        assertEquals(expected, actual);
    }
}