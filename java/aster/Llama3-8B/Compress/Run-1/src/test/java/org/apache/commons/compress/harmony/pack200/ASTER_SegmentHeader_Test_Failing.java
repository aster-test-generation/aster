/**
 * Generated by Aster
 */
package org.apache.commons.compress.harmony.pack200;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_SegmentHeader_Test_Failing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHaveCodeFlagsHi_hyFK0() {
        SegmentHeader segmentHeader = new SegmentHeader();
        boolean result = segmentHeader.have_code_flags_hi();
        assertTrue(result);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHaveMethodFlagsHi_jzxA0() {
        SegmentHeader segmentHeader = new SegmentHeader();
        boolean result = segmentHeader.have_method_flags_hi();
        assert result;
    }
}