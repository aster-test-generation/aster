/**
 * Generated by Aster
 */
package org.apache.commons.compress.compressors.zstandard;
import java.io.IOException;
import java.io.InputStream;
import com.github.luben.zstd.BufferPool;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_ZstdCompressorInputStream_Test_Failing {
    private ZstdCompressorInputStream zstdCompressorInputStream;
    private InputStream in;
    private BufferPool bufferPool;
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testMark_ZxFm1() throws IOException {
        zstdCompressorInputStream.mark(10);
    }
}