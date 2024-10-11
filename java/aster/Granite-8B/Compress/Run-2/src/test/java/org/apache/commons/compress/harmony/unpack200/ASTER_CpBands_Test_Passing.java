/**
 * Generated by Aster
 */
package org.apache.commons.compress.harmony.unpack200;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

import java.util.concurrent.TimeUnit;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_CpBands_Test_Passing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetConstantPool_cOwR0() {
        Segment segment = new Segment();
        CpBands cpBands = new CpBands(segment);
        SegmentConstantPool constantPool = cpBands.getConstantPool();
        assertNotNull(constantPool);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetCpDescriptorNameInts_UqVl0() {
        CpBands cpBands = new CpBands(new Segment());
        int[] actual = cpBands.getCpDescriptorNameInts();
        int[] expected = null;
        assertArrayEquals(expected, actual);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testgetCpDescriptor_WbFO0_fid1() {
	CpBands cpBands = new CpBands(new Segment());
	String[] cpDescriptor = cpBands.getCpDescriptor();
}
}