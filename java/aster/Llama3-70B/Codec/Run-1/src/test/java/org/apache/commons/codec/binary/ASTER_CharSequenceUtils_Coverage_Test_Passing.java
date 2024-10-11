/**
 * Generated by Aster
 */
package org.apache.commons.codec.binary;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

public class Aster_CharSequenceUtils_Coverage_Test_Passing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testRegionMatches_IgnoreCaseFalse_etaT2() {
        String cs = "HelloWorld";
        String substring = "WORLD";
        assertFalse(CharSequenceUtils.regionMatches(cs, false, 6, substring, 0, 5));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testRegionMatches_ReturnFalse_ruef3() {
        String cs = "HelloWorld";
        String substring = "Universe";
        assertFalse(CharSequenceUtils.regionMatches(cs, false, 6, substring, 0, 5));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testRegionMatches_CharacterCaseMismatch_yIzm6() {
        String cs = "HelloWorld";
        String substring = "WoRlD";
        assertFalse(CharSequenceUtils.regionMatches(cs, false, 6, substring, 0, 5));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testRegionMatches_StringInstances_ykSR0_fid1() {
        String cs = "HelloWorld";
        String substring = "World";
        assertFalse(CharSequenceUtils.regionMatches(cs, false, 6, substring, 0, 5));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testRegionMatches_CharacterUpperCaseMatch_qkWM4_fid1() {
        String cs = "HelloWorld";
        String substring = "WORLD";
        assertFalse(CharSequenceUtils.regionMatches(cs, true, 6, substring, 0, 5));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testRegionMatches_CharacterLowerCaseMatch_FPZb5_fid1() {
        String cs = "HelloWorld";
        String substring = "world";
        assertFalse(CharSequenceUtils.regionMatches(cs, true, 6, substring, 0, 5));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testRegionMatches_CharacterCaseMismatch_IgnoreCase_jQUk7_fid1() {
        String cs = "HelloWorld";
        String substring = "WoRlD";
        assertFalse(CharSequenceUtils.regionMatches(cs, true, 6, substring, 0, 5));
    }
}