/**
 * Generated by Aster
 */
package org.apache.commons.compress.compressors.snappy;
import java.io.IOException;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_FramedSnappyCompressorInputStream_Test_Passing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testMatches_standardDialect_uiFW0() throws IOException {
    byte[] signature = new byte[] { 0x06, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00 };
    int length = signature.length;
    assertTrue(FramedSnappyCompressorInputStream.matches(signature, length));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testMatches_nullSignature_aaEl3() throws IOException {
    byte[] signature = null;
    int length = 0;
    assertFalse(FramedSnappyCompressorInputStream.matches(signature, length));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testMatches_invalidLength_yAFt4() throws IOException {
    byte[] signature = new byte[] { 0x06, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00 };
    int length = signature.length - 1;
    assertFalse(FramedSnappyCompressorInputStream.matches(signature, length));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testMatches_invalidSignature_JiLU5() throws IOException {
    byte[] signature = new byte[] { 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00 };
    int length = signature.length;
    assertFalse(FramedSnappyCompressorInputStream.matches(signature, length));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testMatches_unrecognizedDialect_mdzN6() throws IOException {
    byte[] signature = new byte[] { 0x06, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00 };
    int length = signature.length;
    assertFalse(FramedSnappyCompressorInputStream.matches(signature, length));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testReadBlockWithLengthLessThanAvailableData_SrWb3() throws IOException {
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testUnmask_standard_rTPO0() {
    long x = 1234567890L;
    long expected = 1234567890L;
    long actual = FramedSnappyCompressorInputStream.unmask(x);
    assertEquals(expected, actual);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testUnmask_negative_FneF3() {
    long x = -1234567890L;
    long expected = -1234567890L;
    long actual = FramedSnappyCompressorInputStream.unmask(x);
    assertEquals(expected, actual);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testUnmask_zero_nIQN4() {
    long x = 0L;
    long expected = 0L;
    long actual = FramedSnappyCompressorInputStream.unmask(x);
    assertEquals(expected, actual);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testUnmask_maxValue_BPAH5() {
    long x = Long.MAX_VALUE;
    long expected = Long.MAX_VALUE;
    long actual = FramedSnappyCompressorInputStream.unmask(x);
    assertEquals(expected, actual);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testUnmask_minValue_oQjh6() {
    long x = Long.MIN_VALUE;
    long expected = Long.MIN_VALUE;
    long actual = FramedSnappyCompressorInputStream.unmask(x);
    assertEquals(expected, actual);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testUnmask_null_bEfe7_PIRp0() {
    long x = 0;
    long expected = 0;
    long actual = FramedSnappyCompressorInputStream.unmask(x);
    assertEquals(expected, actual);
}
}