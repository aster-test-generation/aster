/**
 * Generated by Aster
 */
package org.apache.commons.compress.harmony.unpack200;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

import java.util.concurrent.TimeUnit;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_SegmentOptions_Test_Passing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testHasFieldFlagsHiFalse_rNXP1() throws Exception {
    SegmentOptions options = new SegmentOptions(0);
    assertFalse(options.hasFieldFlagsHi());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testHasCPNumberCountsFalse_jIIO1() throws Exception {
    SegmentOptions options = new SegmentOptions(0);
    assertFalse(options.hasCPNumberCounts());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testHasClassFlagsHiFalse_DkME1() throws Exception {
    SegmentOptions options = new SegmentOptions(0);
    assertFalse(options.hasClassFlagsHi());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testHasFileSizeHiFalse_jAQL1() throws Exception {
    SegmentOptions options = new SegmentOptions(0);
    assertFalse(options.hasFileSizeHi());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testHasCodeFlagsHiFalse_esZg1() throws Exception {
    SegmentOptions options = new SegmentOptions(0);
    assertFalse(options.hasCodeFlagsHi());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testHasSpecialFormatsFalse_XMdH1() throws Exception {
    SegmentOptions options = new SegmentOptions(0);
    assertFalse(options.hasSpecialFormats());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testHasArchiveFileCountsFalse_btvj1() throws Exception {
    SegmentOptions options = new SegmentOptions(0);
    assertFalse(options.hasArchiveFileCounts());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testHasFileOptionsFalse_DuWn1() throws Exception {
    SegmentOptions options = new SegmentOptions(0);
    assertFalse(options.hasFileOptions());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testShouldDeflateFalse_zTmu1() throws Exception {
    SegmentOptions options = new SegmentOptions(0);
    assertFalse(options.shouldDeflate());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testHasAllCodeFlagsFalse_vYIV1() throws Exception {
    SegmentOptions segmentOptions = new SegmentOptions(0);
    assertFalse(segmentOptions.hasAllCodeFlags());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testHasMethodFlagsHiFalse_wQcG1() throws Exception {
    SegmentOptions options = new SegmentOptions(0);
    assertFalse(options.hasMethodFlagsHi());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testHasFileModtime_WithoutModtimeFlag_uDCW1() throws Exception {
    int options = 0; // No flags set
    SegmentOptions segmentOptions = new SegmentOptions(options);
    assertFalse(segmentOptions.hasFileModtime());
}
}