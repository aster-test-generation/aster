/**
 * Generated by Aster
 */
package org.apache.commons.compress.archivers.jar;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_JarArchiveInputStream_Test_Passing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testMatches_Ebtr0() {
        byte[] signature = new byte[4];
        signature[0] = 'P';
        signature[1] = 'K';
        signature[2] = 0x03;
        signature[3] = 0x04;
        boolean result = JarArchiveInputStream.matches(signature, 4);
        assertTrue(result);
    }
}