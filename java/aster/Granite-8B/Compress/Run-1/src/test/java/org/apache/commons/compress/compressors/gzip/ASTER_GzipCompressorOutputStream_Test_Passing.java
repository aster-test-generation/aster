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
public class Aster_GzipCompressorOutputStream_Test_Passing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testWriteInt_xxrb0_JcMf0() {
        GzipCompressorOutputStream gzipCompressorOutputStream = null;
        try {
            gzipCompressorOutputStream = new GzipCompressorOutputStream(System.out);
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            gzipCompressorOutputStream.write(1);
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            gzipCompressorOutputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testWriteByteArrayIntInt_UlpF1_apPL0() throws IOException {
        GzipCompressorOutputStream gzipCompressorOutputStream = new GzipCompressorOutputStream(System.out);
        gzipCompressorOutputStream.write(new byte[]{1}, 0, 1);
        gzipCompressorOutputStream.close();
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testWriteByteArray_ZGOg2_IfyW0() {
        GzipCompressorOutputStream gzipCompressorOutputStream = null;
        try {
            gzipCompressorOutputStream = new GzipCompressorOutputStream(System.out);
            gzipCompressorOutputStream.write(new byte[]{1});
            gzipCompressorOutputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (gzipCompressorOutputStream != null) {
                try {
                    gzipCompressorOutputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}