/**
 * Generated by Aster
 */
package org.apache.commons.compress.harmony.unpack200;
import org.apache.commons.compress.harmony.unpack200.bytecode.CPUTF8;
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
    public void testUnpack_bfvT0() {
        Segment segment = new Segment();
        CpBands cpBands = new CpBands(segment);
        cpBands.unpack();
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetConstantPool_uzJv0() {
    CpBands cpBands = new CpBands(new Segment());
    SegmentConstantPool pool = cpBands.getConstantPool();
    assertNotNull(pool);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCpUTF8ValueWithValidStringAndFalseParameter_wuWU5_1() {
        Segment segment = new Segment();
        CpBands cpBands = new CpBands(segment);
        String string = "valid";
        CPUTF8 cpUTF8 = cpBands.cpUTF8Value(string, false);
        assertNotNull(cpUTF8);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCpUTF8ValueWithNullStringAndTrueParameter_tFPr10() {
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetCpMethodClassWithNullSegment_Jmxc1_cAfJ0() {
    CpBands cpBands = new CpBands(new Segment());
    String[] cpMethodClass = cpBands.getCpMethodClass();
    assertNull(cpMethodClass);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetCpMethodClassWithNullCpBandsAndNullSegment_BaKa9_jYHE0() {
    CpBands cpBands = null;
    Segment segment = null;
    String[] cpMethodClass = null;
    assertNull(cpMethodClass);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetCpMethodClassWithNullCpBandsAndEmptySegment_PDZZ10_Ulwa0() {
    CpBands cpBands = null;
    Segment segment = new Segment();
    String[] cpMethodClass = null;
    assertNull(cpMethodClass);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testCpClassValue_index_UTGL1_1_fid1() {
    CpBands cpBands = new CpBands(new Segment());
    int index = 10;
}
}