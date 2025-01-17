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

public class Aster_CharSequenceUtils_Test_Passing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testRegionMatchesExactMatch_nroB0() {
        CharSequence cs = "HelloWorld";
        CharSequence substring = "World";
        assertTrue(CharSequenceUtils.regionMatches(cs, false, 5, substring, 0, 5));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testRegionMatchesCaseInsensitive_Cutb1() {
        CharSequence cs = "HelloWorld";
        CharSequence substring = "world";
        assertTrue(CharSequenceUtils.regionMatches(cs, true, 5, substring, 0, 5));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testRegionMatchesNoMatch_MuIW2() {
        CharSequence cs = "HelloWorld";
        CharSequence substring = "test";
        assertFalse(CharSequenceUtils.regionMatches(cs, false, 5, substring, 0, 4));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testRegionMatchesPartialMatch_xAJn3() {
        CharSequence cs = "HelloWorld";
        CharSequence substring = "Worl";
        assertTrue(CharSequenceUtils.regionMatches(cs, false, 5, substring, 0, 4));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testRegionMatchesOutOfBounds_ViyF4() {
        CharSequence cs = "HelloWorld";
        CharSequence substring = "World";
        assertFalse(CharSequenceUtils.regionMatches(cs, false, 6, substring, 0, 5));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testRegionMatchesCaseInsensitiveMismatch_JMsJ5() {
        CharSequence cs = "HelloWorld";
        CharSequence substring = "WORLD";
        assertTrue(CharSequenceUtils.regionMatches(cs, true, 5, substring, 0, 5));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testRegionMatchesSubstringLongerThanMainString_eHeL6() {
        CharSequence cs = "Hello";
        CharSequence substring = "HelloWorld";
        assertFalse(CharSequenceUtils.regionMatches(cs, false, 0, substring, 0, 10));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testRegionMatchesEmptySubstring_entE7() {
        CharSequence cs = "HelloWorld";
        CharSequence substring = "";
        assertTrue(CharSequenceUtils.regionMatches(cs, false, 5, substring, 0, 0));
    }
}