/**
 * Generated by Aster
 */
package org.apache.commons.compress.harmony.unpack200;

import org.apache.commons.compress.harmony.unpack200.bytecode.ClassConstantPool;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

import java.util.concurrent.TimeUnit;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_IcBands_Test_Passing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetRelevantIcTuples_EmptyClassConstantPool_baIi0() throws Exception {
    Segment segment = new Segment();
    IcBands icBands = new IcBands(segment);
    ClassConstantPool cp = new ClassConstantPool();
    IcTuple[] result = icBands.getRelevantIcTuples("TestClassName", cp);
    assertEquals(0, result.length);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetRelevantIcTuples_NullClassName_OfHq1() throws Exception {
    Segment segment = new Segment();
    IcBands icBands = new IcBands(segment);
    ClassConstantPool cp = new ClassConstantPool();
    IcTuple[] result = icBands.getRelevantIcTuples(null, cp);
    assertEquals(0, result.length);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetRelevantIcTuples_ClassNameNotInMap_JdkT2() throws Exception {
    Segment segment = new Segment();
    IcBands icBands = new IcBands(segment);
    ClassConstantPool cp = new ClassConstantPool();
    IcTuple[] result = icBands.getRelevantIcTuples("NonExistentClass", cp);
    assertEquals(0, result.length);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetIcTuplesReturnsNonNullArray_HFUt0() throws Exception {
    Segment segment = new Segment();
    IcBands icBands = new IcBands(segment);
}
}