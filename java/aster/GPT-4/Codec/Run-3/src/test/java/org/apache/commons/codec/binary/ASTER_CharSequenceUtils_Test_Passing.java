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
    public void testRegionMatches_caseSensitiveMatch_XgFD0() throws Exception {
        CharSequence cs = "HelloWorld";
        CharSequence substring = "World";
        assertTrue(CharSequenceUtils.regionMatches(cs, false, 5, substring, 0, 5));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testRegionMatches_caseInsensitiveMatch_SxCl1() throws Exception {
        CharSequence cs = "HelloWorld";
        CharSequence substring = "world";
        assertTrue(CharSequenceUtils.regionMatches(cs, true, 5, substring, 0, 5));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testRegionMatches_caseSensitiveNoMatch_SROv2() throws Exception {
        CharSequence cs = "HelloWorld";
        CharSequence substring = "world";
        assertFalse(CharSequenceUtils.regionMatches(cs, false, 5, substring, 0, 5));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testRegionMatches_caseInsensitiveNoMatch_LmYZ3() throws Exception {
        CharSequence cs = "HelloWorld";
        CharSequence substring = "planet";
        assertFalse(CharSequenceUtils.regionMatches(cs, true, 5, substring, 0, 6));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testRegionMatches_exactMatch_rtHc4() throws Exception {
        CharSequence cs = "Hello";
        CharSequence substring = "Hello";
        assertTrue(CharSequenceUtils.regionMatches(cs, false, 0, substring, 0, 5));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testRegionMatches_partialMatch_YMgT5() throws Exception {
        CharSequence cs = "HelloWorld";
        CharSequence substring = "loWo";
        assertTrue(CharSequenceUtils.regionMatches(cs, false, 3, substring, 0, 4));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testRegionMatches_outOfBounds_vAzt6() throws Exception {
        CharSequence cs = "Hello";
        CharSequence substring = "Hello";
        assertFalse(CharSequenceUtils.regionMatches(cs, false, 1, substring, 0, 5));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testRegionMatches_emptySubstring_giCF7() throws Exception {
        CharSequence cs = "HelloWorld";
        CharSequence substring = "";
        assertTrue(CharSequenceUtils.regionMatches(cs, false, 5, substring, 0, 0));
    }
}