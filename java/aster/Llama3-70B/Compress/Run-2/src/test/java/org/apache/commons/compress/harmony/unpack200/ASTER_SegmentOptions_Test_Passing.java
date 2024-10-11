/**
 * Generated by Aster
 */
package org.apache.commons.compress.harmony.unpack200;
import org.apache.commons.compress.harmony.pack200.Pack200Exception;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.fail;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_SegmentOptions_Test_Passing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testHasFieldFlagsHi_false_vebE1_NsSg0() {
    SegmentOptions segmentOptions;
    try {
        segmentOptions = new SegmentOptions(0);
        assertFalse(segmentOptions.hasFileModtime());
    } catch (Pack200Exception e) {
        throw new RuntimeException(e);
    }
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testHasFieldFlagsHi_false_vebE1_eGEO1() throws Pack200Exception {
    SegmentOptions segmentOptions = new SegmentOptions(0);
    assertFalse(segmentOptions.hasFileModtime());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testHasCPNumberCounts_false_oQzn1_IlFc0() {
    try {
        SegmentOptions segmentOptions = new SegmentOptions(0); // error: unreported exception Pack200Exception; must be caught or declared to be thrown
        assertFalse(segmentOptions.hasCPNumberCounts());
    } catch (Pack200Exception e) {
        fail("Should not throw Pack200Exception");
    }
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testHasCPNumberCounts_false_oQzn1_gQRn1() throws Pack200Exception {
    SegmentOptions segmentOptions = new SegmentOptions(0);
    assertFalse(segmentOptions.hasCPNumberCounts());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testHasClassFlagsHi_false_WrLQ1_qkpk1() throws Pack200Exception {
    SegmentOptions segmentOptions = new SegmentOptions(0); 
    assertFalse(segmentOptions.hasClassFlagsHi());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testHasFileOptions_false_RPys1_ffuK0() {
    SegmentOptions segmentOptions;
    try {
        segmentOptions = new SegmentOptions(0);
    } catch (Pack200Exception e) {
        throw new RuntimeException(e);
    }
    assertFalse(segmentOptions.hasFileModtime());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testHasAllCodeFlags_false_rMYU1_oQbY0() throws Pack200Exception {
    SegmentOptions segmentOptions = new SegmentOptions(0); // This line has an error
    assertFalse(segmentOptions.hasFileModtime());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testHasAllCodeFlags_false_rMYU1_dnKx1() {
    try {
        SegmentOptions segmentOptions = new SegmentOptions(0);
        assertFalse(segmentOptions.hasFileModtime());
    } catch (Pack200Exception e) {
        fail("Unexpected Pack200Exception");
    }
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testHasFileModtime_false_otZL1_TBoe0() throws Pack200Exception {
    SegmentOptions segmentOptions = new SegmentOptions(0); // This line has been fixed
    assertFalse(segmentOptions.hasFileModtime());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testHasFileModtime_false_otZL1_wfwk1() {
    try {
        SegmentOptions segmentOptions = new SegmentOptions(0);
        assertFalse(segmentOptions.hasFileModtime());
    } catch (Pack200Exception e) {
        fail("Should not throw Pack200Exception");
    }
}
}