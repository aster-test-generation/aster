/**
 * Generated by Aster
 */
package org.apache.commons.codec.binary;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

public class Aster_CharSequenceUtils_Test_Passing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testRegionMatches1_wuTR0() {
        CharSequence cs = "Hello";
        boolean ignoreCase = true;
        int thisStart = 0;
        CharSequence substring = "He";
        int start = 0;
        int length = 2;
        boolean expected = true;
        boolean actual = CharSequenceUtils.regionMatches(cs, ignoreCase, thisStart, substring, start, length);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testRegionMatches2_pqjC1() {
        CharSequence cs = "Hello";
        boolean ignoreCase = true;
        int thisStart = 0;
        CharSequence substring = "He";
        int start = 0;
        int length = 3;
        boolean expected = false;
        boolean actual = CharSequenceUtils.regionMatches(cs, ignoreCase, thisStart, substring, start, length);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testRegionMatches3_AGVv2() {
        CharSequence cs = "Hello";
        boolean ignoreCase = false;
        int thisStart = 0;
        CharSequence substring = "He";
        int start = 0;
        int length = 2;
        boolean expected = true;
        boolean actual = CharSequenceUtils.regionMatches(cs, ignoreCase, thisStart, substring, start, length);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testRegionMatches4_DoIJ3() {
        CharSequence cs = "Hello";
        boolean ignoreCase = false;
        int thisStart = 0;
        CharSequence substring = "He";
        int start = 0;
        int length = 3;
        boolean expected = false;
        boolean actual = CharSequenceUtils.regionMatches(cs, ignoreCase, thisStart, substring, start, length);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testRegionMatches6_YaAE5() {
        CharSequence cs = "Hello";
        boolean ignoreCase = true;
        int thisStart = 1;
        CharSequence substring = "He";
        int start = 0;
        int length = 3;
        boolean expected = false;
        boolean actual = CharSequenceUtils.regionMatches(cs, ignoreCase, thisStart, substring, start, length);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testRegionMatches8_YeLK7() {
        CharSequence cs = "Hello";
        boolean ignoreCase = false;
        int thisStart = 1;
        CharSequence substring = "He";
        int start = 0;
        int length = 3;
        boolean expected = false;
        boolean actual = CharSequenceUtils.regionMatches(cs, ignoreCase, thisStart, substring, start, length);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testRegionMatches5_obXn4_fid1() {
        CharSequence cs = "Hello";
        boolean ignoreCase = false;
        int thisStart = 1;
        CharSequence substring = "He";
        int start = 0;
        int length = 2;
        boolean expected = false;
        boolean actual = CharSequenceUtils.regionMatches(cs, ignoreCase, thisStart, substring, start, length);
        assertEquals(expected, actual);
    }
}