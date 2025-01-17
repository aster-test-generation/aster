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
public class Aster_FramedSnappyCompressorInputStream_Test_Failing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testUnmask_RTGn1() {
        long x = 0x12345678L;
        long result = FramedSnappyCompressorInputStream.unmask(x);
        assertEquals(0x12345678L, result);
    }
}