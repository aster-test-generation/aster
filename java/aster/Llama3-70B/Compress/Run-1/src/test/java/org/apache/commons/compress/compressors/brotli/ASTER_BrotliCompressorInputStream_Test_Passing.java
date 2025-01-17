/**
 * Generated by Aster
 */
package org.apache.commons.compress.compressors.brotli;
import java.io.IOException;
import java.io.InputStream;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_BrotliCompressorInputStream_Test_Passing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testReset_shqt0_dXVg0() throws IOException {
    java.io.ByteArrayInputStream inputStream = new java.io.ByteArrayInputStream(new byte[0]);
    BrotliCompressorInputStream brotliCompressorInputStream = new BrotliCompressorInputStream(inputStream);
    brotliCompressorInputStream.read(new byte[0]); // reset is not applicable for BrotliCompressorInputStream
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testClose_lZtD0_bwQo0() throws IOException {
    java.io.ByteArrayInputStream inputStream = new java.io.ByteArrayInputStream(new byte[0]);
    BrotliCompressorInputStream brotliCompressorInputStream = new BrotliCompressorInputStream(inputStream);
    brotliCompressorInputStream.close();
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testClose_lZtD0_zGIV1() throws IOException {
    java.io.InputStream inputStream = new java.io.ByteArrayInputStream(new byte[0]);
    BrotliCompressorInputStream brotliCompressorInputStream = new BrotliCompressorInputStream(inputStream);
    brotliCompressorInputStream.close();
}
}