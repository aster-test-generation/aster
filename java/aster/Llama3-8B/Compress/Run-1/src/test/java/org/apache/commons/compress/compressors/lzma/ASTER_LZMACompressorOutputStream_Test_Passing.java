/**
 * Generated by Aster
 */
package org.apache.commons.compress.compressors.lzma;
import java.io.IOException;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_LZMACompressorOutputStream_Test_Passing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testFinishWithNullOutputStream_BONZ1() {
        assertThrows(NullPointerException.class, () -> new LZMACompressorOutputStream(null));
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testFlush_dWDp0_DkbR0() throws IOException {
    java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream();
    LZMACompressorOutputStream lzmaCompressorOutputStream = new LZMACompressorOutputStream(byteArrayOutputStream);
    lzmaCompressorOutputStream.close();
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testFlushIOException_ApKO1_scjH1() throws IOException {
    java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream();
    LZMACompressorOutputStream lzmaCompressorOutputStream = new LZMACompressorOutputStream(byteArrayOutputStream);
    try {
        lzmaCompressorOutputStream.close();
    } catch (IOException e) {
        assert true;
    }
}
}