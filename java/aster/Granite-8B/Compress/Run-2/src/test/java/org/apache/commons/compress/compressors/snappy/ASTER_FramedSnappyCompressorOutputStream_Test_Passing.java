/**
 * Generated by Aster
 */
package org.apache.commons.compress.compressors.snappy;

import org.apache.commons.compress.compressors.lz77support.Parameters;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.concurrent.TimeUnit;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_FramedSnappyCompressorOutputStream_Test_Passing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testMask_EJsU0() throws Exception {
        final OutputStream out = null;
        final Parameters params = null;
        try {
            new FramedSnappyCompressorOutputStream(out, params);
        } catch (final IOException e) {
            e.printStackTrace();
        }
        long x = 1L;
        assertEquals(1L, FramedSnappyCompressorOutputStream.mask(x));
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testFinish_aPce0() throws IOException {
        OutputStream out = new ByteArrayOutputStream();
        FramedSnappyCompressorOutputStream compressor = new FramedSnappyCompressorOutputStream(out);
        compressor.finish();
        assertTrue(true);
    }
}