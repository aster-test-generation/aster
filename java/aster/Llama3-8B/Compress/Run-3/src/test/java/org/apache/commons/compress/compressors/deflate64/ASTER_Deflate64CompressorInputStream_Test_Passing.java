/**
 * Generated by Aster
 */
package org.apache.commons.compress.compressors.deflate64;
import java.io.IOException;
import static org.junit.jupiter.api.Assertions.fail;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_Deflate64CompressorInputStream_Test_Passing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetCompressedCount_JaHh1_SGJl0() {
    java.io.ByteArrayInputStream originalStream = new java.io.ByteArrayInputStream(new byte[0]);
    Deflate64CompressorInputStream compressorInputStream = new Deflate64CompressorInputStream(originalStream);
    long compressedCount = compressorInputStream.getCompressedCount();
    assert(compressedCount == 0);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testCloseDecoderException_VoXj1_wwyh0() throws IOException {
    Deflate64CompressorInputStream compressorInputStream = new Deflate64CompressorInputStream(new java.io.ByteArrayInputStream(new byte[0]));
    try {
        ((Deflate64CompressorInputStream) compressorInputStream).close();
        fail("Expected IOException");
    } catch (IOException e) {
    }
}
}