/**
 * Generated by Aster
 */
package org.apache.commons.compress.harmony.unpack200;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_CpBands_Test_Passing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testUnpack_WNKC0() {
        Segment segment = new Segment();
        CpBands cpBands = new CpBands(segment);
        cpBands.unpack();
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetConstantPool_OjXH0() {
    Segment segment = new Segment();
    CpBands cpBands = new CpBands(segment);
    SegmentConstantPool pool = cpBands.getConstantPool();
    assertNotNull(pool);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetCpDescriptorNameIntsWithInvalidSegment_fxOM4() {
    Segment segment = new Segment();
    CpBands cpBands = new CpBands(segment);
    int[] cpDescriptorNameInts = cpBands.getCpDescriptorNameInts();
    assertNull(cpDescriptorNameInts);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testCpClassValue_string_IatZ0_fid1() {
    CpBands cpBands = new CpBands(new Segment());
    String string = "test";
}
}