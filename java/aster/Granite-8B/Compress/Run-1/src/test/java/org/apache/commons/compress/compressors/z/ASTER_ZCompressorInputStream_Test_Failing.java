/**
 * Generated by Aster
 */
package org.apache.commons.compress.compressors.z;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_ZCompressorInputStream_Test_Failing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testMatches_ZIVq0_WvIV0() {
        byte[] signature = new byte[4];
        signature[0] = 30;
        signature[1] = 120;
        signature[2] = (byte) 156;
        signature[3] = (byte) 250;
        boolean result = ZCompressorInputStream.matches(signature, 4);
        assertTrue(result);
    }
}