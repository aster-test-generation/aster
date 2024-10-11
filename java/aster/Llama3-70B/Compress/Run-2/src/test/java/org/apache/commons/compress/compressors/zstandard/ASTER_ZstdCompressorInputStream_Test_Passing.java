/**
 * Generated by Aster
 */
package org.apache.commons.compress.compressors.zstandard;
import java.io.IOException;
import java.io.InputStream;
import static org.junit.jupiter.api.Assertions.fail;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_ZstdCompressorInputStream_Test_Passing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testAvailable_dyOu0_sTZD0() throws IOException {
    java.io.InputStream in = new java.io.ByteArrayInputStream(new byte[0]);
    ZstdCompressorInputStream zcis = new ZstdCompressorInputStream(in);
    zcis.close(); 
    try {
        zcis.available();
        fail("Expected IOException");
    } catch (IOException e) {
        // Expected
    }
}
}