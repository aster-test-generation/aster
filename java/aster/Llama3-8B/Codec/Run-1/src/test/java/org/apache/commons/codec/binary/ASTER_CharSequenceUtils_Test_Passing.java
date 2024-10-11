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
    public void testRegionMatches_String_String_JDeB0() {
        CharSequenceUtils charSequenceUtils = new CharSequenceUtils();
        String cs = "Hello";
        boolean ignoreCase = true;
        int thisStart = 0;
        String substring = "He";
        int start = 0;
        int length = 2;
        assertTrue(charSequenceUtils.regionMatches(cs, ignoreCase, thisStart, substring, start, length));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testRegionMatches_String_String_IgnoreCaseFalse_MwwB2() {
        CharSequenceUtils charSequenceUtils = new CharSequenceUtils();
        String cs = "Hello";
        boolean ignoreCase = false;
        int thisStart = 0;
        String substring = "he";
        int start = 0;
        int length = 2;
        assertFalse(charSequenceUtils.regionMatches(cs, ignoreCase, thisStart, substring, start, length));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testRegionMatches_String_String_IgnoreCaseTrue_TBKg3() {
        CharSequenceUtils charSequenceUtils = new CharSequenceUtils();
        String cs = "Hello";
        boolean ignoreCase = true;
        int thisStart = 0;
        String substring = "he";
        int start = 0;
        int length = 2;
        assertTrue(charSequenceUtils.regionMatches(cs, ignoreCase, thisStart, substring, start, length));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testRegionMatches_String_String_LengthZero_kujT4() {
        CharSequenceUtils charSequenceUtils = new CharSequenceUtils();
        String cs = "Hello";
        boolean ignoreCase = true;
        int thisStart = 0;
        String substring = "He";
        int start = 0;
        int length = 0;
        assertTrue(charSequenceUtils.regionMatches(cs, ignoreCase, thisStart, substring, start, length));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testRegionMatches_String_String_StartGreaterThanZero_gLfz6() {
        CharSequenceUtils charSequenceUtils = new CharSequenceUtils();
        String cs = "Hello";
        boolean ignoreCase = true;
        int thisStart = 0;
        String substring = "He";
        int start = 1;
        int length = 2;
        assertFalse(charSequenceUtils.regionMatches(cs, ignoreCase, thisStart, substring, start, length));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testRegionMatches_String_String_LengthGreaterThanSubstringLength_vrtJ7() {
        CharSequenceUtils charSequenceUtils = new CharSequenceUtils();
        String cs = "Hello";
        boolean ignoreCase = true;
        int thisStart = 0;
        String substring = "He";
        int start = 0;
        int length = 3;
        assertFalse(charSequenceUtils.regionMatches(cs, ignoreCase, thisStart, substring, start, length));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testRegionMatches_String_String_False_XuFT1_fid1() {
        CharSequenceUtils charSequenceUtils = new CharSequenceUtils();
        String cs = "Hello";
        boolean ignoreCase = false;
        int thisStart = 0;
        String substring = "He";
        int start = 0;
        int length = 2;
        assertTrue(charSequenceUtils.regionMatches(cs, ignoreCase, thisStart, substring, start, length));
    }
}