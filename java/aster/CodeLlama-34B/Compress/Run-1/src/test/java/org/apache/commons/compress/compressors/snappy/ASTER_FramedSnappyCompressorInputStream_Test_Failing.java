/**
 * Generated by Aster
 */
package org.apache.commons.compress.compressors.snappy;
import java.io.IOException;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_FramedSnappyCompressorInputStream_Test_Failing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testMatches_standardDialect_cGEc0_fid1() throws IOException {
    byte[] signature = new byte[] { 0x06, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00 };
    int length = 8;
    boolean result = FramedSnappyCompressorInputStream.matches(signature, length);
    assertTrue(result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testUnmask_standard_Gmej0_fid1() {
    long x = 1234567890L;
    long expected = 1234567890L;
    long actual = FramedSnappyCompressorInputStream.unmask(x);
    assertEquals(expected, actual);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testUnmask_invalidX_JImj5_fid1() {
    long x = 0L;
    long expected = 0L;
    long actual = FramedSnappyCompressorInputStream.unmask(x);
    assertEquals(expected, actual);
}
}