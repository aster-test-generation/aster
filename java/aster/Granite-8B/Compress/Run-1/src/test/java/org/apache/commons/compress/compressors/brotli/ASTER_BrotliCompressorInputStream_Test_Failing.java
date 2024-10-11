/**
 * Generated by Aster
 */
package org.apache.commons.compress.compressors.brotli;
import java.io.IOException;
import static org.junit.jupiter.api.Assertions.fail;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_BrotliCompressorInputStream_Test_Failing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testResetWithNullInputStream_uRMH1() {
        try {
            new BrotliCompressorInputStream(null);
            fail("Expected IOException");
        } catch (IOException e) {
        }
    }
}