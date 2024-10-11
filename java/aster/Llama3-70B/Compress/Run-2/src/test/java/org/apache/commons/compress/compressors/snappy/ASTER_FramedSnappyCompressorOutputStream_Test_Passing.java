/**
 * Generated by Aster
 */
package org.apache.commons.compress.compressors.snappy;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_FramedSnappyCompressorOutputStream_Test_Passing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testMask_TXTZ0() throws Exception {
    long result = FramedSnappyCompressorOutputStream.mask(0x1234567890abcdefL);
    assertEquals(0x12345678L, result);
}
}