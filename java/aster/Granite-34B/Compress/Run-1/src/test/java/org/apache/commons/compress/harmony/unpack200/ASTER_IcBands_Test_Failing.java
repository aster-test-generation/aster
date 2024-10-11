/**
 * Generated by Aster
 */
package org.apache.commons.compress.harmony.unpack200;
import java.io.IOException;
import org.apache.commons.compress.harmony.pack200.Pack200Exception;
import org.apache.commons.compress.harmony.unpack200.bytecode.ClassConstantPool;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_IcBands_Test_Failing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testUnPackWithNestedExplicitFlagSet_WVFm3() throws IOException, Pack200Exception {
        Segment segment = new Segment();
        IcBands icBands = new IcBands(segment);
        icBands.unpack();
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void test_getRelevantIcTuples_withEmptyCandidates_fRze0_rKBJ0() {
        IcBands icBands = new IcBands(new Segment());
        String className = "exampleClass";
        ClassConstantPool cp = new ClassConstantPool();
        IcTuple[] relevantIcTuples = icBands.getRelevantIcTuples(className, cp);
        assertEquals(0, relevantIcTuples.length);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void test_getRelevantIcTuples_withNonEmptyCandidates_sFBo1_WtBB0() {
        IcBands icBands = new IcBands(new Segment());
        String className = "exampleClass";
        ClassConstantPool cp = new ClassConstantPool();
        IcTuple[] relevantIcTuples = icBands.getRelevantIcTuples(className, cp);
    }
}