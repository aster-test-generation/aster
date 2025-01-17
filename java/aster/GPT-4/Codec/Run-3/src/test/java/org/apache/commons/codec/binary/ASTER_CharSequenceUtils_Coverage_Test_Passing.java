/**
 * Generated by Aster
 */
package org.apache.commons.codec.binary;

import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_CharSequenceUtils_Coverage_Test_Passing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testRegionMatches_BothStringAndIgnoreCase_sOxA0() {
        CharSequence cs = "HelloWorld";
        CharSequence substring = "WORLD";
        assertTrue(CharSequenceUtils.regionMatches(cs, true, 5, substring, 0, 5));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testRegionMatches_CharactersMatch_rxwe1() {
        CharSequence cs = "Hello";
        CharSequence substring = "Hello";
        assertTrue(CharSequenceUtils.regionMatches(cs, false, 0, substring, 0, 5));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testRegionMatches_IgnoreCaseFalseAndMismatch_nFrP2() {
        CharSequence cs = "Hello";
        CharSequence substring = "hello";
        assertFalse(CharSequenceUtils.regionMatches(cs, false, 0, substring, 0, 5));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testRegionMatches_LowerCaseNotEqual_LSjW4() {
        CharSequence cs = "Hello";
        CharSequence substring = "HELLO";
        assertTrue(CharSequenceUtils.regionMatches(cs, true, 0, substring, 0, 5));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testRegionMatches_NotInstanceOfString_drgV5() {
        CharSequence cs = new StringBuilder("HelloWorld");
        CharSequence substring = new StringBuilder("world");
        assertTrue(CharSequenceUtils.regionMatches(cs, true, 5, substring, 0, 5));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testRegionMatches_ExactMatchWithoutIgnoreCase_QeXd6() {
        CharSequence cs = "HelloWorld";
        CharSequence substring = "World";
        assertTrue(CharSequenceUtils.regionMatches(cs, false, 5, substring, 0, 5));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testRegionMatches_NoMatchWithIgnoreCase_iemU7() {
        CharSequence cs = "HelloWorld";
        CharSequence substring = "planet";
        assertFalse(CharSequenceUtils.regionMatches(cs, true, 5, substring, 0, 6));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testRegionMatches_UpperCaseNotEqual_NvOF3_fid1() {
        CharSequence cs = "Hello";
        CharSequence substring = "hElLo";
        assertTrue(CharSequenceUtils.regionMatches(cs, true, 0, substring, 0, 5));
    }
}