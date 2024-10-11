/**
 * Generated by Aster
 */
package org.apache.commons.compress.harmony.unpack200;
import org.apache.commons.compress.harmony.pack200.Pack200Exception;
import static org.junit.jupiter.api.Assertions.assertFalse;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_SegmentOptions_Test_Passing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHasFileSizeHi_uQwx0_wCqd0() throws Pack200Exception {
        SegmentOptions segmentOptions = new SegmentOptions(0);
        boolean result = segmentOptions.hasFileSizeHi();
        assertFalse(result);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testShouldNotDeflate_DwQs1_RUdc0() {
        SegmentOptions segmentOptions = null;
        try {
            segmentOptions = new SegmentOptions(0);
        } catch (Pack200Exception e) {
            e.printStackTrace();
        }
        boolean result = segmentOptions.shouldDeflate();
        assertFalse(result);
    }
}