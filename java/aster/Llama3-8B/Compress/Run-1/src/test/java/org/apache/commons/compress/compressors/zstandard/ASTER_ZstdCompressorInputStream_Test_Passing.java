/**
 * Generated by Aster
 */
package org.apache.commons.compress.compressors.zstandard;
import java.io.IOException;
import java.io.InputStream;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_ZstdCompressorInputStream_Test_Passing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testClose_aiZI0() throws IOException {
        InputStream in = new java.io.ByteArrayInputStream(new byte[0]);
        ZstdCompressorInputStream compressorInputStream = new ZstdCompressorInputStream(in);
        compressorInputStream.close();
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testToString_FQIE0_xFbJ0() throws IOException {
    java.io.ByteArrayInputStream in = new java.io.ByteArrayInputStream(new byte[0]);
    ZstdCompressorInputStream zstdCompressorInputStream = new ZstdCompressorInputStream(in);
    String result = zstdCompressorInputStream.toString();
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testReadEndOfFile_Bifv1_Qmbn1() throws IOException {
    java.io.ByteArrayInputStream in = new java.io.ByteArrayInputStream(new byte[0]);
    ZstdCompressorInputStream compressorInputStream = new ZstdCompressorInputStream(in);
    int result = compressorInputStream.read();
    assert result == -1;
}
}