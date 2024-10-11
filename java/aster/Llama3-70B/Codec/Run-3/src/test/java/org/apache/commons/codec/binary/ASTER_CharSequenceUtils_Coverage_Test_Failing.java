/**
 * Generated by Aster
 */
package org.apache.commons.codec.binary;

import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_CharSequenceUtils_Coverage_Test_Failing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testRegionMatches_StringInstances_CgHv0() {
        String cs = "HelloWorld";
        String substring = "World";
        assertTrue(CharSequenceUtils.regionMatches(cs, false, 6, substring, 0, 5));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testRegionMatches_CharacterUpperCaseMatch_JsVG4() {
        String cs = "HelloWorld";
        String substring = "WORLD";
        assertTrue(CharSequenceUtils.regionMatches(cs, true, 6, substring, 0, 5));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testRegionMatches_CharacterLowerCaseMatch_wwfu5() {
        String cs = "HelloWorld";
        String substring = "world";
        assertTrue(CharSequenceUtils.regionMatches(cs, true, 6, substring, 0, 5));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testRegionMatches_CharacterCaseMismatch_IgnoreCase_fMAQ7() {
        String cs = "HelloWorld";
        String substring = "WoRlD";
        assertTrue(CharSequenceUtils.regionMatches(cs, true, 6, substring, 0, 5));
    }
}