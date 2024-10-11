/**
 * Generated by Aster
 */
package org.apache.commons.compress.compressors.lzma;
import java.io.IOException;
import java.io.OutputStream;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_LZMACompressorOutputStream_Test_Passing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testClose_KrVm0_kTlj0_fid1() throws IOException {
    java.io.OutputStream outputStream = new java.io.ByteArrayOutputStream();
    LZMACompressorOutputStream lzmaCompressorOutputStream = new LZMACompressorOutputStream(outputStream);
    lzmaCompressorOutputStream.close();
    assertTrue(outputStream instanceof java.io.ByteArrayOutputStream);
    try {
        outputStream.write(1);
    } catch (IOException e) {
        // Expected
    }
}
}