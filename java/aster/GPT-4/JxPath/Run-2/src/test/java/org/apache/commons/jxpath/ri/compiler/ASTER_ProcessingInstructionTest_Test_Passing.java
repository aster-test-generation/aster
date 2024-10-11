/**
 * Generated by Aster
 */
package org.apache.commons.jxpath.ri.compiler;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_ProcessingInstructionTest_Test_Passing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testToString_LWoa0() {
    ProcessingInstructionTest piTest = new ProcessingInstructionTest("sampleTarget");
    String expected = "processing-instruction('sampleTarget')";
    assertEquals(expected, piTest.toString());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetTarget_rfpC0() {
    ProcessingInstructionTest piTest = new ProcessingInstructionTest("SampleTarget");
    assertEquals("SampleTarget", piTest.getTarget());
}
}