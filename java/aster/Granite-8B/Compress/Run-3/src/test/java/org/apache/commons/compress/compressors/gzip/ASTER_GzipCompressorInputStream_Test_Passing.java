/**
 * Generated by Aster
 */
package org.apache.commons.compress.compressors.gzip;
import java.io.InputStream;
import java.util.zip.CRC32;
import java.util.zip.Inflater;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_GzipCompressorInputStream_Test_Passing {
    private InputStream in;
    private Inflater inf;
    private CRC32 crc;
    private byte[] buf;
    private int bufUsed;
    private boolean endReached;
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testMatches1_tNnz0() throws Exception {
        byte[] signature = new byte[2];
        signature[0] = 31;
        signature[1] = -117;
        int length = 2;
        boolean result = GzipCompressorInputStream.matches(signature, length);
        assertTrue(result);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testMatches2_TJub1() throws Exception {
        byte[] signature = new byte[2];
        signature[0] = 31;
        signature[1] = -118;
        int length = 2;
        boolean result = GzipCompressorInputStream.matches(signature, length);
        assertFalse(result);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testMatches3_skTv2() throws Exception {
        byte[] signature = new byte[1];
        signature[0] = 31;
        int length = 1;
        boolean result = GzipCompressorInputStream.matches(signature, length);
        assertFalse(result);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testMatches4_FkSe3() throws Exception {
        byte[] signature = new byte[3];
        signature[0] = 31;
        signature[1] = -117;
        signature[2] = 0;
        int length = 3;
        boolean result = GzipCompressorInputStream.matches(signature, length);
        assertTrue(result);
    }
}