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
    public void testRegionMatches_BothStringTrueCase_NmqC0() {
        assertTrue(CharSequenceUtils.regionMatches("Hello", true, 0, "Hello", 0, 5));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testRegionMatches_BothStringFalseCase_BAnV1() {
        assertFalse(CharSequenceUtils.regionMatches("Hello", false, 0, "hello", 0, 5));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testRegionMatches_NonStringTrueCase_NvKH2() {
        assertTrue(CharSequenceUtils.regionMatches(new StringBuilder("Hello"), true, 0, new StringBuilder("hello"), 0, 5));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testRegionMatches_NonStringFalseCase_mUOD3() {
        assertFalse(CharSequenceUtils.regionMatches(new StringBuilder("Hello"), false, 0, new StringBuilder("hello"), 0, 5));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testRegionMatches_CaseSensitiveMatch_Ompg4() {
        assertTrue(CharSequenceUtils.regionMatches("Hello", false, 0, "Hello", 0, 5));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testRegionMatches_CaseInsensitiveMatch_uMav5() {
        assertTrue(CharSequenceUtils.regionMatches("Hello", true, 0, "hello", 0, 5));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testRegionMatches_CaseInsensitiveNoMatch_Mokk7() {
        assertFalse(CharSequenceUtils.regionMatches("Hello", true, 0, "world", 0, 5));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testRegionMatches_PartialMatch_Xoeu8() {
        assertTrue(CharSequenceUtils.regionMatches("HelloWorld", true, 5, "World", 0, 5));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testRegionMatches_PartialNoMatch_QjjY9() {
        assertFalse(CharSequenceUtils.regionMatches("HelloWorld", false, 5, "world", 0, 5));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testRegionMatches_ExactMatchAtStart_LwOO10() {
        assertTrue(CharSequenceUtils.regionMatches("Hello", true, 0, "Hel", 0, 3));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testRegionMatches_ExactMatchAtEnd_upTW11() {
        assertTrue(CharSequenceUtils.regionMatches("Hello", true, 2, "llo", 0, 3));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testRegionMatches_OverLength_euOE12() {
        assertFalse(CharSequenceUtils.regionMatches("Hello", true, 0, "HelloWorld", 0, 10));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testRegionMatches_UnderLength_FfEC13() {
        assertTrue(CharSequenceUtils.regionMatches("Hello", true, 0, "He", 0, 2));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testRegionMatches_EmptyStrings_gQyp14() {
        assertTrue(CharSequenceUtils.regionMatches("", true, 0, "", 0, 0));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testRegionMatches_EmptySubstring_QqPe15() {
        assertTrue(CharSequenceUtils.regionMatches("Hello", true, 0, "", 0, 0));
    }
}