/**
 * Generated by Aster
 */
package org.apache.commons.codec.binary;
import static org.junit.jupiter.api.Assertions.assertFalse;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_CharSequenceUtils_Coverage_Test_Passing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testRegionMatches_IgnoreCaseFalse_jGLG2() {
        String cs = "HelloWorld";
        String substring = "WORLD";
        assertFalse(CharSequenceUtils.regionMatches(cs, false, 6, substring, 0, 5));
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testRegionMatches_ReturnFalse_mbjd3() {
        String cs = "HelloWorld";
        String substring = "Universe";
        assertFalse(CharSequenceUtils.regionMatches(cs, false, 6, substring, 0, 5));
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testRegionMatches_IgnoreCaseTrue_False_lFqg6() {
        String cs = "HelloWorld";
        String substring = "Universe";
        assertFalse(CharSequenceUtils.regionMatches(cs, true, 6, substring, 0, 5));
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testRegionMatches_StringInstances_BEQL0_fid1() {
        String cs = "HelloWorld";
        String substring = "World";
        assertFalse(CharSequenceUtils.regionMatches(cs, false, 6, substring, 0, 5));
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testRegionMatches_UpperCaseMatch_XYOI4_fid1() {
        String cs = "HelloWorld";
        String substring = "WORLD";
        assertFalse(CharSequenceUtils.regionMatches(cs, true, 6, substring, 0, 5));
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testRegionMatches_LowerCaseMatch_ELya5_fid1() {
        String cs = "HelloWorld";
        String substring = "world";
        assertFalse(CharSequenceUtils.regionMatches(cs, true, 6, substring, 0, 5));
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testRegionMatches_CharSequenceInstances_SDVO7_fid1() {
        StringBuilder cs = new StringBuilder("HelloWorld");
        StringBuilder substring = new StringBuilder("World");
        assertFalse(CharSequenceUtils.regionMatches(cs, false, 6, substring, 0, 5));
    }
}