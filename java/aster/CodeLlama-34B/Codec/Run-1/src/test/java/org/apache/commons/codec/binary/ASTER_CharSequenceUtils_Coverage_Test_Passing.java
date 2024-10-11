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

public class Aster_CharSequenceUtils_Coverage_Test_Passing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testRegionMatches1_yElq0() {
        CharSequence cs = "abcdef";
        boolean ignoreCase = false;
        int thisStart = 0;
        CharSequence substring = "abc";
        int start = 0;
        int length = 3;
        boolean result = CharSequenceUtils.regionMatches(cs, ignoreCase, thisStart, substring, start, length);
        assertTrue(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testRegionMatches2_LuYS1() {
        CharSequence cs = "abcdef";
        boolean ignoreCase = false;
        int thisStart = 0;
        CharSequence substring = "abc";
        int start = 1;
        int length = 3;
        boolean result = CharSequenceUtils.regionMatches(cs, ignoreCase, thisStart, substring, start, length);
        assertFalse(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testRegionMatches4_podB3() {
        CharSequence cs = "abcdef";
        boolean ignoreCase = true;
        int thisStart = 0;
        CharSequence substring = "abc";
        int start = 1;
        int length = 2;
        boolean result = CharSequenceUtils.regionMatches(cs, ignoreCase, thisStart, substring, start, length);
        assertFalse(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testRegionMatches3_kxhB2_fid1() {
        CharSequence cs = "abcdef";
        boolean ignoreCase = true;
        int thisStart = 0;
        CharSequence substring = "abc";
        int start = 1;
        int length = 3;
        boolean result = CharSequenceUtils.regionMatches(cs, ignoreCase, thisStart, substring, start, length);
        assertFalse(result);
    }
}