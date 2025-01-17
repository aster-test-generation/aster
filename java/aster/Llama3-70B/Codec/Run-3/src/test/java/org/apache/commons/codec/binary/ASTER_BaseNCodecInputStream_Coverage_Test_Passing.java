/**
 * Generated by Aster
 */
package org.apache.commons.codec.binary;

import java.io.IOException;
import java.io.InputStream;
import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_BaseNCodecInputStream_Coverage_Test_Passing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testRead_ReadsZeroBytes_wYDs5_IZiJ0() throws IOException {
        byte[] bytes = new byte[]{0};
        java.io.ByteArrayInputStream inputStream = new java.io.ByteArrayInputStream(bytes);
        Base32 baseNCodec = new Base32();
        BaseNCodecInputStream baseNCodecInputStream = new BaseNCodecInputStream(inputStream, baseNCodec, false);
        int result = baseNCodecInputStream.read();
        assertEquals(-1, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testReset_ThrowsIOException_IyWy0_iPSC0() throws IOException {
        java.io.InputStream inputStream = new java.io.ByteArrayInputStream(new byte[0]);
        Base32 baseNCodec = new Base32();
        BaseNCodecInputStream baseNCodecInputStream = new BaseNCodecInputStream(inputStream, baseNCodec, false);
        try {
            baseNCodecInputStream.reset();
            fail("Expected IOException to be thrown");
        } catch (IOException e) {
            assertEquals("mark/reset not supported", e.getMessage());
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testMarkSupported_AqBO0_vEtb0() {
        Base32 base32 = new Base32();
        java.io.InputStream inputStream = new java.io.ByteArrayInputStream(new byte[0]);
        BaseNCodecInputStream baseNCodecInputStream = new BaseNCodecInputStream(inputStream, base32, false);
        assertFalse(baseNCodecInputStream.markSupported());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testReadMultipleBytes_EGUe7_giHy0() throws IOException {
        java.io.ByteArrayOutputStream out = new java.io.ByteArrayOutputStream();
        out.write(1);
        out.write(2);
        out.write(3);
        BaseNCodecInputStream inputStream = new BaseNCodecInputStream(new java.io.ByteArrayInputStream(out.toByteArray()), new Base32(76, new byte[]{13, 10}), true);
        byte[] array = new byte[3];
        assertEquals(3, inputStream.read(array, 0, 3));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAvailable_eofFalse_rbWA1_mAOw1() throws IOException {
        java.io.InputStream inputStream = new java.io.ByteArrayInputStream(new byte[1]);
        Base32 baseNCodec = new Base32();
        BaseNCodecInputStream baseNCodecInputStream = new BaseNCodecInputStream(inputStream, baseNCodec, false);
        int result = baseNCodecInputStream.available();
        assertEquals(1, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSkip_PositiveLength_ReadsFromInputStream_vgLG2_NalG0_1_fid1() throws IOException {
        byte[] data = new byte[1024];
        for (int i = 0; i < 1024; i++) {
            data[i] = (byte) i;
        }
        java.io.ByteArrayInputStream byteArrayInputStream = new java.io.ByteArrayInputStream(data);
        BaseNCodecInputStream inputStream = new BaseNCodecInputStream(byteArrayInputStream, new Base32(), false);
        assertEquals(3, inputStream.skip(3));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSkip_PositiveLength_ReadsFromInputStream_vgLG2_NalG0_2_fid1() throws IOException {
        byte[] data = new byte[1024];
        for (int i = 0; i < 1024; i++) {
            data[i] = (byte) i;
        }
        java.io.ByteArrayInputStream byteArrayInputStream = new java.io.ByteArrayInputStream(data);
        BaseNCodecInputStream inputStream = new BaseNCodecInputStream(byteArrayInputStream, new Base32(), false);
        assertEquals(1024, byteArrayInputStream.available());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAvailable_eofTrue_LMOH1_hnGW1() throws IOException {
        java.io.InputStream inputStream = new java.io.ByteArrayInputStream(new byte[1]);
        Base32 baseNCodec = new Base32();
        BaseNCodecInputStream baseNCodecInputStream = new BaseNCodecInputStream(inputStream, baseNCodec, false);
        inputStream.close(); // Simulate EOF
        int result = baseNCodecInputStream.available();
        assertEquals(1, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSkip_PositiveLength_ReadsFromInputStream_MultipleChunks_pZIt3_qcNw0_1_fid1() throws IOException {
        byte[] data = new byte[2048];
        for (int i = 0; i < 2048; i++) {
            data[i] = (byte) i;
        }
        java.io.ByteArrayInputStream byteArrayInputStream = new java.io.ByteArrayInputStream(data);
        BaseNCodecInputStream inputStream = new BaseNCodecInputStream(byteArrayInputStream, new Base32(), false);
        assertEquals(3, inputStream.skip(3));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSkip_PositiveLength_ReadsFromInputStream_MultipleChunks_pZIt3_qcNw0_2_fid1() throws IOException {
        byte[] data = new byte[2048];
        for (int i = 0; i < 2048; i++) {
            data[i] = (byte) i;
        }
        java.io.ByteArrayInputStream byteArrayInputStream = new java.io.ByteArrayInputStream(data);
        BaseNCodecInputStream inputStream = new BaseNCodecInputStream(byteArrayInputStream, new Base32(), false);
        assertEquals(3, inputStream.skip(512));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSkip_PositiveLength_ReadsFromInputStream_MultipleChunks_pZIt3_qcNw0_3_fid1() throws IOException {
        byte[] data = new byte[2048];
        for (int i = 0; i < 2048; i++) {
            data[i] = (byte) i;
        }
        java.io.ByteArrayInputStream byteArrayInputStream = new java.io.ByteArrayInputStream(data);
        BaseNCodecInputStream inputStream = new BaseNCodecInputStream(byteArrayInputStream, new Base32(), false);
        assertEquals(2048, byteArrayInputStream.available());
    }
}