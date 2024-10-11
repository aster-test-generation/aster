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
public void testMatches_standardDialect_xKxS0() throws IOException {
    byte[] signature = new byte[] { 0x06, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00 };
    int length = signature.length;
    assertTrue(FramedSnappyCompressorInputStream.matches(signature, length));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testMatches_invalidDialect_bExn3() throws IOException {
    byte[] signature = new byte[] { 0x06, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00 };
    int length = signature.length;
    assertFalse(FramedSnappyCompressorInputStream.matches(signature, length));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testMatches_invalidSignatureAndDialect_BhGM4() throws IOException {
    byte[] signature = new byte[] { 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00 };
    int length = signature.length;
    assertFalse(FramedSnappyCompressorInputStream.matches(signature, length));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testUnmask_standardDialect_MKWE0() {
    long x = 0x1234567890ABCDEFL;
    long expected = 0x1234567890ABCDEFL;
    long actual = FramedSnappyCompressorInputStream.unmask(x);
    assertEquals(expected, actual);
}
}