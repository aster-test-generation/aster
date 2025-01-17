/**
 * Generated by Aster
 */
package org.apache.commons.codec.binary;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_CharSequenceUtils_Coverage_Test_Failing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testRegionMatches_StringInstances_BEQL0() {
        String cs = "HelloWorld";
        String substring = "World";
        assertTrue(CharSequenceUtils.regionMatches(cs, false, 6, substring, 0, 5));
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testRegionMatches_UpperCaseMatch_XYOI4() {
        String cs = "HelloWorld";
        String substring = "WORLD";
        assertTrue(CharSequenceUtils.regionMatches(cs, true, 6, substring, 0, 5));
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testRegionMatches_LowerCaseMatch_ELya5() {
        String cs = "HelloWorld";
        String substring = "world";
        assertTrue(CharSequenceUtils.regionMatches(cs, true, 6, substring, 0, 5));
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testRegionMatches_CharSequenceInstances_SDVO7() {
        StringBuilder cs = new StringBuilder("HelloWorld");
        StringBuilder substring = new StringBuilder("World");
        assertTrue(CharSequenceUtils.regionMatches(cs, false, 6, substring, 0, 5));
    }
}