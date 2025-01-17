/**
 * Generated by Aster
 */
package org.apache.commons.codec.binary;

import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_BaseNCodecOutputStream_Coverage_Test_Failing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testWriteNegativeValue_ucaq1_CVqm0() throws IOException {
        java.io.ByteArrayOutputStream bos = new java.io.ByteArrayOutputStream();
        BaseNCodecOutputStream baseNCodecOutputStream = new BaseNCodecOutputStream(bos, new Base32(), true);
        baseNCodecOutputStream.write(-10);
        byte[] expected = {(byte) -10};
        assertArrayEquals(expected, bos.toByteArray());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testFlushThrowsIOException_MuXT1_NAnL0() throws IOException {
        java.io.ByteArrayOutputStream bos = new java.io.ByteArrayOutputStream();
        BaseNCodecOutputStream codecOutputStream = new BaseNCodecOutputStream(bos, new Base32(), true);
        assertThrows(IOException.class, () -> codecOutputStream.flush());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testFlushThrowsIOException_MuXT1_NAnL0_fid2() throws IOException {
        java.io.ByteArrayOutputStream bos = new java.io.ByteArrayOutputStream();
        BaseNCodecOutputStream codecOutputStream = new BaseNCodecOutputStream(bos, new Base32(), true);
        try {
            codecOutputStream.flush();
            fail("IOException was not thrown");
        } catch (IOException e) {
            // Expected exception
        }
    }
}