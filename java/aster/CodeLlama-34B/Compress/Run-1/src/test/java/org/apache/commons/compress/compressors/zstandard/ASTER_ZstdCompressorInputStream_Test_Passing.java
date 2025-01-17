/**
 * Generated by Aster
 */
package org.apache.commons.compress.compressors.zstandard;
import java.io.IOException;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.fail;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_ZstdCompressorInputStream_Test_Passing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testMarkSupported_withNullInputStream_ELXu3() throws IOException {
    ZstdCompressorInputStream zstdCompressorInputStream = new ZstdCompressorInputStream(null);
    assertFalse(zstdCompressorInputStream.markSupported());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testToStringWithNullInputStream_BXfo3_gJWa0() {
    try {
        ZstdCompressorInputStream zcis = new ZstdCompressorInputStream(null);
    } catch (IOException e) {
        fail("Exception should not be thrown");
    }
}
}