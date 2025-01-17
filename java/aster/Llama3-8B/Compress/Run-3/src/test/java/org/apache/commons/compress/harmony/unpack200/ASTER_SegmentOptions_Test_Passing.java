/**
 * Generated by Aster
 */
package org.apache.commons.compress.harmony.unpack200;
import org.apache.commons.compress.harmony.pack200.Pack200Exception;
import static org.junit.jupiter.api.Assertions.fail;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_SegmentOptions_Test_Passing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testHasFieldFlagsHiTrue_fBDr0_REDu0() {
    try {
        SegmentOptions segmentOptions = new SegmentOptions(1);
        boolean result = segmentOptions.hasFileModtime();
        assert(result);
    } catch (Pack200Exception e) {
        throw new RuntimeException(e);
    }
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testHasFieldFlagsHiTrue_utkR2_EDzd0() {
    try {
        SegmentOptions segmentOptions = new SegmentOptions(1);
        boolean result = segmentOptions.hasFileModtime();
        assert(result == true);
    } catch (Pack200Exception e) {
        throw new RuntimeException(e);
    }
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testHasCPNumberCountsTrue_qeNJ2_wDNt0() {
    try {
        SegmentOptions segmentOptions = new SegmentOptions(0);
        boolean result = segmentOptions.hasFileModtime();
        assert(result == false);
    } catch (Pack200Exception e) {
        throw new RuntimeException(e);
    }
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testHasFileSizeHiTrue_OJsZ0_hNWu0() {
    try {
        SegmentOptions segmentOptions = new SegmentOptions(1 << 1);
        boolean result = segmentOptions.hasFileSizeHi();
        assert(result);
    } catch (Pack200Exception e) {
        throw new RuntimeException(e);
    }
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testHasFileSizeHiTrue_LYAO2_sbCB0() {
    try {
        SegmentOptions segmentOptions = new SegmentOptions(0);
        boolean result = segmentOptions.hasFileModtime();
        assert(result == false);
    } catch (Pack200Exception e) {
    }
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testHasSpecialFormatsTrue_LkKR0_TpNF0() {
    try {
        SegmentOptions segmentOptions = new SegmentOptions(1 << 1);
        boolean result = segmentOptions.hasFileModtime();
        assert result;
    } catch (Pack200Exception e) {
        throw new AssertionError("Pack200Exception should not be thrown", e);
    }
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testHasArchiveFileCountsTrue_utQG0_xttC0() {
    try {
        SegmentOptions segmentOptions = new SegmentOptions(0);
        boolean result = segmentOptions.hasFileModtime();
        assert result == false;
    } catch (Pack200Exception e) {
        fail("Pack200Exception should not be thrown");
    }
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testHasArchiveFileCountsTrue_zwpP2_eyaF0() {
    try {
        SegmentOptions segmentOptions = new SegmentOptions(1);
        boolean result = segmentOptions.hasFileModtime();
        assert result;
    } catch (Pack200Exception e) {
        throw new RuntimeException(e);
    }
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testHasFileOptionsTrue_jqab0_BYYn1() {
    try {
        SegmentOptions segmentOptions = new SegmentOptions(1 << 0);
        boolean result = segmentOptions.hasFileModtime();
        assert(result == true);
    } catch (Pack200Exception e) {
        throw new RuntimeException(e);
    }
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testHasFileOptionsFalse_QutV1_xhQb1() throws Pack200Exception {
    SegmentOptions segmentOptions = new SegmentOptions(0);
    boolean result = segmentOptions.hasFileModtime();
    assert(result == false);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testShouldDeflateTrue_csNU0_cVgQ1() throws Pack200Exception {
    SegmentOptions segmentOptions = new SegmentOptions(1);
    boolean result = segmentOptions.hasFileModtime();
    assert(result == true);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testHasAllCodeFlagsFalse_iHRk1_bgTe0() {
    try {
        SegmentOptions segmentOptions = new SegmentOptions(0);
        boolean result = segmentOptions.hasFileModtime();
        assert !result;
    } catch (Pack200Exception e) {
        throw new RuntimeException(e);
    }
}
}