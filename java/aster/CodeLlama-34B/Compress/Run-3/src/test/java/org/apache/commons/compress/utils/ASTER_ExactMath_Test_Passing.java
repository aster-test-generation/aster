/**
 * Generated by Aster
 */
package org.apache.commons.compress.utils;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_ExactMath_Test_Passing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAdd_int_long_XLKk0() {
        int x = 10;
        long y = 20L;
        int result = ExactMath.add(x, y);
        assertEquals(30, result);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAdd_int_long_overflow_aTpe1() {
        int x = Integer.MAX_VALUE;
        long y = 1L;
        try {
            ExactMath.add(x, y);
            fail("Expected ArithmeticException");
        } catch (ArithmeticException e) {
            assertEquals("Argument too large or result overflows", e.getMessage());
        }
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAdd_int_long_underflow_XNPq2() {
        int x = Integer.MIN_VALUE;
        long y = -1L;
        try {
            ExactMath.add(x, y);
            fail("Expected ArithmeticException");
        } catch (ArithmeticException e) {
            assertEquals("Argument too large or result overflows", e.getMessage());
        }
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAdd_int_long_zero_qSXv3() {
        int x = 0;
        long y = 0L;
        int result = ExactMath.add(x, y);
        assertEquals(0, result);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAdd_int_long_negative_gAas4() {
        int x = -10;
        long y = -20L;
        int result = ExactMath.add(x, y);
        assertEquals(-30, result);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAdd_int_long_maxValue_YZVk6() {
        int x = Integer.MAX_VALUE;
        long y = Long.MAX_VALUE;
        try {
            ExactMath.add(x, y);
            fail("Expected ArithmeticException");
        } catch (ArithmeticException e) {
            assertEquals("Argument too large or result overflows", e.getMessage());
        }
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAdd_int_long_minValue_TfiI7() {
        int x = Integer.MIN_VALUE;
        long y = Long.MIN_VALUE;
        try {
            ExactMath.add(x, y);
            fail("Expected ArithmeticException");
        } catch (ArithmeticException e) {
            assertEquals("Argument too large or result overflows", e.getMessage());
        }
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAdd_int_long_null_RDjB8_FTFF0() {
        int x = 10;
        long y = 0;
        try {
            ExactMath.add(x, y);
            fail("Expected NullPointerException");
        } catch (NullPointerException e) {
            assertEquals("y is null", e.getMessage());
        }
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testAdd_int_long_null2_CIus9_iAXP0() {
    int x = 0;
    long y = 20L;
    try {
        ExactMath.add(x, y);
        fail("Expected NullPointerException");
    } catch (NullPointerException e) {
        assertEquals("x is null", e.getMessage());
    }
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testAdd_int_long_null3_Dtne10_GsRw0() {
    int x = 0;
    long y = 0;
    try {
        ExactMath.add(x, y);
        fail("Expected NullPointerException");
    } catch (NullPointerException e) {
        assertEquals("x and y are null", e.getMessage());
    }
}
}