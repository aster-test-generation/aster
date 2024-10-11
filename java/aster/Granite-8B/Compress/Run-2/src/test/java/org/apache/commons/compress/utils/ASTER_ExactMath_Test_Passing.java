/**
 * Generated by Aster
 */
package org.apache.commons.compress.utils;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

import java.util.concurrent.TimeUnit;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_ExactMath_Test_Passing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAdd_XAlc0() throws Exception {
        int x = 1;
        long y = 1;
        int expected = 2;
        int actual = ExactMath.add(x, y);
        assertEquals(expected, actual);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAdd2_WCHv1() throws Exception {
        int x = 1;
        long y = -1;
        int expected = 0;
        int actual = ExactMath.add(x, y);
        assertEquals(expected, actual);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAdd3_WtQh2() throws Exception {
        int x = -1;
        long y = 1;
        int expected = 0;
        int actual = ExactMath.add(x, y);
        assertEquals(expected, actual);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAdd4_wNdP3() throws Exception {
        int x = -1;
        long y = -1;
        int expected = -2;
        int actual = ExactMath.add(x, y);
        assertEquals(expected, actual);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAdd5_OZmY4() throws Exception {
        int x = Integer.MAX_VALUE;
        long y = 1;
        int expected = -2147483648;
        int actual = ExactMath.add(x, y);
        assertEquals(expected, actual);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAdd6_QBeS5() throws Exception {
        int x = Integer.MIN_VALUE;
        long y = -1;
        int expected = 2147483647;
        int actual = ExactMath.add(x, y);
        assertEquals(expected, actual);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAdd7_zpJe6() throws Exception {
        int x = 1;
        long y = Integer.MAX_VALUE;
        int expected = -2147483648;
        int actual = ExactMath.add(x, y);
        assertEquals(expected, actual);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAdd8_FxlS7() throws Exception {
        int x = 1;
        long y = Integer.MIN_VALUE;
        int expected = 2147483647;
        int actual = ExactMath.add(x, y);
        assertEquals(expected, actual);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAdd9_DYzF8() throws Exception {
        int x = -1;
        long y = Integer.MAX_VALUE;
        int expected = -2147483647;
        int actual = ExactMath.add(x, y);
        assertEquals(expected, actual);
    }
}