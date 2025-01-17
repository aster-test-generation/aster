/**
 * Generated by Aster
 */
package org.apache.commons.compress.compressors.gzip;
import java.io.IOException;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_GzipCompressorInputStream_Test_Failing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testRead_MchA0() throws IOException {
        GzipCompressorInputStream gzipCompressorInputStream = new GzipCompressorInputStream(null, false);
        gzipCompressorInputStream.read(new byte[1], 0, 1);
        gzipCompressorInputStream = new GzipCompressorInputStream(null);
        gzipCompressorInputStream.read(new byte[1], 0, 1);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testRead1_BIUB1() throws IOException {
        GzipCompressorInputStream gzipCompressorInputStream = new GzipCompressorInputStream(null, false);
        gzipCompressorInputStream.read(new byte[1]);
        gzipCompressorInputStream = new GzipCompressorInputStream(null);
        gzipCompressorInputStream.read(new byte[1]);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testRead2_oEMN2() throws IOException {
        GzipCompressorInputStream gzipCompressorInputStream = new GzipCompressorInputStream(null, false);
        gzipCompressorInputStream.read();
        gzipCompressorInputStream = new GzipCompressorInputStream(null);
        gzipCompressorInputStream.read();
    }
}