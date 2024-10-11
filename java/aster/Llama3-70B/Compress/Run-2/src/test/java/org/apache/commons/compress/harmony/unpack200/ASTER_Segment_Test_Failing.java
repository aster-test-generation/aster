/**
 * Generated by Aster
 */
package org.apache.commons.compress.harmony.unpack200;
import java.io.ByteArrayOutputStream;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_Segment_Test_Failing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetConstantPool_tfnD0() {
    Segment segment = new Segment();
    SegmentConstantPool cp = segment.getConstantPool();
    assertNotNull(cp);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetCpBands_prUh0_1() {
    Segment segment = new Segment();
    CpBands cpBands = segment.getCpBands();
    assertNotNull(cpBands);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetCpBands_prUh0_2() {
    Segment segment = new Segment();
    CpBands cpBands = segment.getCpBands();
    assertNotNull(cpBands.getConstantPool());}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetCpBands_prUh0_3() {
    Segment segment = new Segment();
    CpBands cpBands = segment.getCpBands();
    assertNotNull(cpBands.getCpClass());}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetCpBands_prUh0_4() {
    Segment segment = new Segment();
    CpBands cpBands = segment.getCpBands();
    assertNotNull(cpBands.getCpFieldClass());}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetCpBands_prUh0_5() {
    Segment segment = new Segment();
    CpBands cpBands = segment.getCpBands();
    assertNotNull(cpBands.getCpIMethodClass());}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetCpBands_prUh0_6() {
    Segment segment = new Segment();
    CpBands cpBands = segment.getCpBands();
    assertNotNull(cpBands.getCpMethodClass());}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetCpBands_prUh0_7() {
    Segment segment = new Segment();
    CpBands cpBands = segment.getCpBands();
    assertNotNull(cpBands.getCpMethodDescriptor());}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetCpBands_prUh0_8() {
    Segment segment = new Segment();
    CpBands cpBands = segment.getCpBands();
    assertNotNull(cpBands.getCpDescriptor());}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetCpBands_prUh0_9() {
    Segment segment = new Segment();
    CpBands cpBands = segment.getCpBands();
    assertNotNull(cpBands.getCpUTF8());}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetCpBands_prUh0_10() {
    Segment segment = new Segment();
    CpBands cpBands = segment.getCpBands();
    assertNotNull(cpBands.getCpSignature());}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetCpBands_prUh0_11() {
    Segment segment = new Segment();
    CpBands cpBands = segment.getCpBands();
    assertNotNull(cpBands.getCpInt());}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetCpBands_prUh0_12() {
    Segment segment = new Segment();
    CpBands cpBands = segment.getCpBands();
    assertNotNull(cpBands.getCpLong());}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetCpBands_prUh0_13() {
    Segment segment = new Segment();
    CpBands cpBands = segment.getCpBands();
    assertNotNull(cpBands.getCpDescriptorNameInts());}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetCpBands_prUh0_14() {
    Segment segment = new Segment();
    CpBands cpBands = segment.getCpBands();
    assertNotNull(cpBands.getCpDescriptorTypeInts());}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetClassBands_bMAg0_jfnh0_1() {
    Segment segment = new Segment();
    IcBands icBands = segment.getIcBands();
    IcTuple[] icTuples = icBands.getIcTuples();
    assertNotNull(icBands);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetClassBands_bMAg0_jfnh0_2() {
    Segment segment = new Segment();
    IcBands icBands = segment.getIcBands();
    IcTuple[] icTuples = icBands.getIcTuples();
    assertNotNull(icTuples);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetSegmentHeader_RxFc0_xKqb0_3() {
    Segment segment = new Segment();
    IcBands icBands = segment.getIcBands();
    IcTuple[] icTuples = icBands.getIcTuples();
    assertEquals(0, icTuples.length);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testLog_PrintsMessage_WhenLogLevelMatches_gPUQ0_KpVq0() {
    Segment segment = new Segment();
    segment.setLogLevel(1);
    ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    java.lang.System.setOut(new java.io.PrintStream(outContent));
    segment.log(1, "Hello, World!");
    assertEquals("Hello, World!\r\n", outContent.toString());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testLog_DoesNotPrintMessage_WhenLogLevelDoesNotMatch_oOnQ1_pIoX0() {
    Segment segment = new Segment();
    segment.setLogLevel(2);
    ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    java.lang.System.setOut(new java.io.PrintStream(outContent));
    segment.log(1, "Hello, World!");
    assertEquals("", outContent.toString());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetCpBands_prUh0() {
    Segment segment = new Segment();
    CpBands cpBands = segment.getCpBands();
    assertNotNull(cpBands);
    assertNotNull(cpBands.getConstantPool());
    assertNotNull(cpBands.getCpClass());
    assertNotNull(cpBands.getCpFieldClass());
    assertNotNull(cpBands.getCpIMethodClass());
    assertNotNull(cpBands.getCpMethodClass());
    assertNotNull(cpBands.getCpMethodDescriptor());
    assertNotNull(cpBands.getCpDescriptor());
    assertNotNull(cpBands.getCpUTF8());
    assertNotNull(cpBands.getCpSignature());
    assertNotNull(cpBands.getCpInt());
    assertNotNull(cpBands.getCpLong());
    assertNotNull(cpBands.getCpDescriptorNameInts());
    assertNotNull(cpBands.getCpDescriptorTypeInts());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetConstantPool_tfnD0_fid2() {
    Segment segment = new Segment();
    IcBands icBands = segment.getIcBands();
    assertNotNull(icBands);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetSegmentHeader_RxFc0_xKqb0_2_fid2() {
    Segment segment = new Segment();
    IcBands icBands = segment.getIcBands();
    assertNotNull(icBands);
    if (icBands != null) {
        IcTuple[] icTuples = icBands.getIcTuples();
        assertNotNull(icTuples);
    }
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetSegmentHeader_RxFc0_xKqb0_3_fid2() {
    Segment segment = new Segment();
    IcBands icBands = segment.getIcBands();
    assertNotNull(icBands);
    IcTuple[] icTuples = icBands.getIcTuples();
    assertNotNull(icTuples);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testLog_DoesNotPrintMessage_WhenLogLevelDoesNotMatch_oOnQ1_pIoX0_fid2() {
    Segment segment = new Segment();
    segment.setLogLevel(2);
    ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    java.lang.System.setOut(new java.io.PrintStream(outContent));
    segment.log(1, "Hello, World!");
    assertNotNull(segment);
}
}