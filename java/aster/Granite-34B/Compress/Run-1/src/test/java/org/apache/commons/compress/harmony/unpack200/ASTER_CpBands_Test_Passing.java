/**
 * Generated by Aster
 */
package org.apache.commons.compress.harmony.unpack200;
import org.apache.commons.compress.harmony.unpack200.bytecode.CPUTF8;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_CpBands_Test_Passing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testUnPack_BzDI0() {
        Segment segment = new Segment();
        CpBands cpBands = new CpBands(segment);
        cpBands.unpack();
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetCpDescriptor_roTc0() {
        Segment segment = new Segment();
        CpBands cpBands = new CpBands(segment);
        String[] actual = cpBands.getCpDescriptor();
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetCpMethodDescriptor_GbUh0() {
    Segment segment = new Segment();
    CpBands cpBands = new CpBands(segment);
    String[] result = cpBands.getCpMethodDescriptor();
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetCpInt_AFnd0() {
        Segment segment = new Segment();
        CpBands cpBands = new CpBands(segment);
        int[] result = cpBands.getCpInt();
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void getCpIMethodClassTest_LhoE0() {
        Segment segment = new Segment();
        CpBands cpBands = new CpBands(segment);
        String[] result = cpBands.getCpIMethodClass();
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetCpDescriptorTypeInts_YgkK0() {
        CpBands cpBands = new CpBands(new Segment());
        int[] result = cpBands.getCpDescriptorTypeInts();
        int[] expected = cpBands.getCpDescriptorTypeInts();
        assertArrayEquals(expected, result);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetCpSignature_jEHr0() {
        Segment segment = new Segment();
        CpBands cpBands = new CpBands(segment);
        String[] result = cpBands.getCpSignature();
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetCpSignature_withInvalidSegment_shouldReturnNullSignature_CbDf4() {
        Segment segment = new Segment();
        CpBands cpBands = new CpBands(segment);
        String[] result = cpBands.getCpSignature();
        assertNull(result);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void test_cpUTF8Value_002_nXQr1_fid1() {
	CpBands cpBands = new CpBands(new Segment());
	String string = "string";
	boolean searchForIndex = false;
	CPUTF8 result = cpBands.cpUTF8Value(string, searchForIndex);
    assertNull(null);
}
}