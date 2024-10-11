/**
 * Generated by Aster
 */
package org.apache.commons.compress.utils;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_ExactMath_Test_Passing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAdd_cayT0() {
        int x = 1;
        long y = 1;
        int expected = 2;
        int actual = ExactMath.add(x, y);
        assertEquals(expected, actual);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAdd2_TkUI1() {
        int x = 1;
        long y = -1;
        int expected = 0;
        int actual = ExactMath.add(x, y);
        assertEquals(expected, actual);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAdd3_ebqc2() {
        int x = -1;
        long y = 1;
        int expected = 0;
        int actual = ExactMath.add(x, y);
        assertEquals(expected, actual);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAdd4_ZGDx3() {
        int x = -1;
        long y = -1;
        int expected = -2;
        int actual = ExactMath.add(x, y);
        assertEquals(expected, actual);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAdd5_zZVH4() {
        int x = Integer.MAX_VALUE;
        long y = 1;
        int expected = -2147483648;
        int actual = ExactMath.add(x, y);
        assertEquals(expected, actual);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAdd6_qlcr5() {
        int x = Integer.MIN_VALUE;
        long y = -1;
        int expected = 2147483647;
        int actual = ExactMath.add(x, y);
        assertEquals(expected, actual);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAdd7_eoWh6() {
        int x = 1;
        long y = Integer.MAX_VALUE;
        int expected = -2147483648;
        int actual = ExactMath.add(x, y);
        assertEquals(expected, actual);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAdd8_htfi7() {
        int x = 1;
        long y = Integer.MIN_VALUE;
        int expected = 2147483647;
        int actual = ExactMath.add(x, y);
        assertEquals(expected, actual);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAdd9_JTsk8() {
        int x = -1;
        long y = Integer.MAX_VALUE;
        int expected = 2147483646;
        int actual = ExactMath.add(x, y);
        assertEquals(expected, actual);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAdd10_nlMr9() {
        int x = -1;
        long y = Integer.MIN_VALUE;
        int expected = -2147483647;
        int actual = ExactMath.add(x, y);
        assertEquals(expected, actual);
    }
}