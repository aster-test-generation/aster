/**
 * Generated by Aster
 */
package org.apache.commons.codec.binary;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

public class Aster_CharSequenceUtils_Test_Passing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testRegionMatches_True_NduD0() {
        CharSequence cs = "Hello World";
        boolean ignoreCase = true;
        int thisStart = 0;
        CharSequence substring = "Hello";
        int start = 0;
        int length = 5;
        assertTrue(CharSequenceUtils.regionMatches(cs, ignoreCase, thisStart, substring, start, length));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testRegionMatches_False_ywUL1() {
        CharSequence cs = "Hello World";
        boolean ignoreCase = true;
        int thisStart = 0;
        CharSequence substring = "Goodbye";
        int start = 0;
        int length = 5;
        assertFalse(CharSequenceUtils.regionMatches(cs, ignoreCase, thisStart, substring, start, length));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testRegionMatches_IgnoreCase_nxzd2() {
        CharSequence cs = "Hello World";
        boolean ignoreCase = true;
        int thisStart = 0;
        CharSequence substring = "hello";
        int start = 0;
        int length = 5;
        assertTrue(CharSequenceUtils.regionMatches(cs, ignoreCase, thisStart, substring, start, length));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testRegionMatches_DifferentLength_Kdei3() {
        CharSequence cs = "Hello World";
        boolean ignoreCase = true;
        int thisStart = 0;
        CharSequence substring = "Hello";
        int start = 0;
        int length = 6;
        assertFalse(CharSequenceUtils.regionMatches(cs, ignoreCase, thisStart, substring, start, length));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testRegionMatches_DifferentStart_nYgT4() {
        CharSequence cs = "Hello World";
        boolean ignoreCase = true;
        int thisStart = 6;
        CharSequence substring = "World";
        int start = 0;
        int length = 5;
        assertTrue(CharSequenceUtils.regionMatches(cs, ignoreCase, thisStart, substring, start, length));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testRegionMatches_NegativeLength_UaDd7_fid1() {
        CharSequence cs = "Hello World";
        boolean ignoreCase = true;
        int thisStart = 0;
        CharSequence substring = "Hello";
        int start = 0;
        int length = -1;
        assertTrue(CharSequenceUtils.regionMatches(cs, ignoreCase, thisStart, substring, start, length));
    }
}