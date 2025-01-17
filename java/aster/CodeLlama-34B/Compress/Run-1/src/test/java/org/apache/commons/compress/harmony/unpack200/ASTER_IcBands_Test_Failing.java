/**
 * Generated by Aster
 */
package org.apache.commons.compress.harmony.unpack200;
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
public void testGetRelevantIcTuples_emptyClassName_QMpD0() {
    IcBands icBands = new IcBands(new Segment());
    ClassConstantPool cp = new ClassConstantPool();
    IcTuple[] relevantTuples = icBands.getRelevantIcTuples("", cp);
    assertEquals(0, relevantTuples.length);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetRelevantIcTuples_nullClassName_aZHp1() {
    IcBands icBands = new IcBands(new Segment());
    ClassConstantPool cp = new ClassConstantPool();
    IcTuple[] relevantTuples = icBands.getRelevantIcTuples(null, cp);
    assertEquals(0, relevantTuples.length);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetRelevantIcTuples_emptyClassConstantPool_BzGN2() {
    IcBands icBands = new IcBands(new Segment());
    ClassConstantPool cp = new ClassConstantPool();
    IcTuple[] relevantTuples = icBands.getRelevantIcTuples("TestClass", cp);
    assertEquals(0, relevantTuples.length);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetRelevantIcTuples_nullClassName_aZHp1_sVln0() {
    IcBands icBands = new IcBands(null);
    ClassConstantPool cp = new ClassConstantPool();
    IcTuple[] relevantTuples = icBands.getRelevantIcTuples(null, cp);
    assertEquals(0, relevantTuples.length);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetRelevantIcTuples_nullClassConstantPool_sfYW3_SVZO0() {
    IcBands icBands = new IcBands(null);
    IcTuple[] relevantTuples = icBands.getRelevantIcTuples("TestClass", null);
    assertEquals(0, relevantTuples.length);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetRelevantIcTuples_nullClassConstantPool_sfYW3() {
    IcBands icBands = new IcBands(new Segment());
    IcTuple[] relevantTuples = icBands.getRelevantIcTuples("TestClass", null);
    assertEquals(0, relevantTuples.length);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetRelevantIcTuples_emptyClassName_QMpD0_gIfK0() {
    IcBands icBands = new IcBands(null);
    ClassConstantPool cp = new ClassConstantPool();
    IcTuple[] relevantTuples = icBands.getRelevantIcTuples("", cp);
    assertEquals(0, relevantTuples.length);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetRelevantIcTuples_emptyClassConstantPool_BzGN2_jdRx0() {
    IcBands icBands = new IcBands(null);
    ClassConstantPool cp = new ClassConstantPool();
    IcTuple[] relevantTuples = icBands.getRelevantIcTuples("TestClass", cp);
    assertEquals(0, relevantTuples.length);
}
}