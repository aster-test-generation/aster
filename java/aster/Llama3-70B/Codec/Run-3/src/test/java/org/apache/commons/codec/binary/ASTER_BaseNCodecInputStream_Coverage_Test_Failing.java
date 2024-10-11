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

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_BaseNCodecInputStream_Coverage_Test_Failing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testRead_ReturnsByteValue_rzOI0_fhOz0() throws IOException {
        byte[] bytes = {1, 2, 3};
        java.io.InputStream inputStream = new java.io.ByteArrayInputStream(bytes);
        Base32 baseNCodec = new Base32();
        BaseNCodecInputStream baseNCodecInputStream = new BaseNCodecInputStream(inputStream, baseNCodec, false);
        int result = baseNCodecInputStream.read();
        assertEquals(1, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAvailable_eofFalse_rbWA1_mAOw0() throws IOException {
        java.io.InputStream inputStream = new java.io.ByteArrayInputStream(new byte[0]);
        Base32 baseNCodec = new Base32();
        BaseNCodecInputStream baseNCodecInputStream = new BaseNCodecInputStream(inputStream, baseNCodec, false);
        int result = baseNCodecInputStream.available();
        assertEquals(0, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSkip_PositiveLength_ReadsFromInputStream_vgLG2_NalG0_1() throws IOException {
        byte[] data = new byte[1024];
        for (int i = 0; i < 1024; i++) {
            data[i] = (byte) i;
        }
        java.io.ByteArrayInputStream byteArrayInputStream = new java.io.ByteArrayInputStream(data);
        BaseNCodecInputStream inputStream = new BaseNCodecInputStream(byteArrayInputStream, new Base32(), false);
        assertEquals(512, inputStream.skip(512));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSkip_PositiveLength_ReadsFromInputStream_vgLG2_NalG0_2() throws IOException {
        byte[] data = new byte[1024];
        for (int i = 0; i < 1024; i++) {
            data[i] = (byte) i;
        }
        java.io.ByteArrayInputStream byteArrayInputStream = new java.io.ByteArrayInputStream(data);
        BaseNCodecInputStream inputStream = new BaseNCodecInputStream(byteArrayInputStream, new Base32(), false);
        assertEquals(512, byteArrayInputStream.available());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSkip_PositiveLength_ReadsFromInputStream_TodoGreaterThanZero_FZtT8_lPHR0_1() throws IOException {
        byte[] data = new byte[1024];
        for (int i = 0; i < 1024; i++) {
            data[i] = (byte) i;
        }
        java.io.ByteArrayInputStream byteArrayInputStream = new java.io.ByteArrayInputStream(data);
        BaseNCodecInputStream inputStream = new BaseNCodecInputStream(byteArrayInputStream, new Base32(), false);
        assertEquals(1024, inputStream.skip(1024));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSkip_PositiveLength_ReadsFromInputStream_TodoGreaterThanZero_FZtT8_lPHR0_2() throws IOException {
        byte[] data = new byte[1024];
        for (int i = 0; i < 1024; i++) {
            data[i] = (byte) i;
        }
        java.io.ByteArrayInputStream byteArrayInputStream = new java.io.ByteArrayInputStream(data);
        BaseNCodecInputStream inputStream = new BaseNCodecInputStream(byteArrayInputStream, new Base32(), false);
        assertEquals(0, inputStream.skip(512));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testRead_ReadsMultipleZeroBytes_UWxo6_vKbr0_1() throws IOException {
        byte[] bytes = {0, 0, 0};
        java.io.ByteArrayInputStream inputStream = new java.io.ByteArrayInputStream(bytes);
        Base32 baseNCodec = new Base32();
        BaseNCodecInputStream baseNCodecInputStream = new BaseNCodecInputStream(inputStream, baseNCodec, false);
        int result1 = baseNCodecInputStream.read();
        int result2 = baseNCodecInputStream.read();
        int result3 = baseNCodecInputStream.read();
        assertEquals(0, result1);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testRead_ReadsMultipleZeroBytes_UWxo6_vKbr0_2() throws IOException {
        byte[] bytes = {0, 0, 0};
        java.io.ByteArrayInputStream inputStream = new java.io.ByteArrayInputStream(bytes);
        Base32 baseNCodec = new Base32();
        BaseNCodecInputStream baseNCodecInputStream = new BaseNCodecInputStream(inputStream, baseNCodec, false);
        int result1 = baseNCodecInputStream.read();
        int result2 = baseNCodecInputStream.read();
        int result3 = baseNCodecInputStream.read();
        assertEquals(0, result2);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testRead_ReadsMultipleZeroBytes_UWxo6_vKbr0_3() throws IOException {
        byte[] bytes = {0, 0, 0};
        java.io.ByteArrayInputStream inputStream = new java.io.ByteArrayInputStream(bytes);
        Base32 baseNCodec = new Base32();
        BaseNCodecInputStream baseNCodecInputStream = new BaseNCodecInputStream(inputStream, baseNCodec, false);
        int result1 = baseNCodecInputStream.read();
        int result2 = baseNCodecInputStream.read();
        int result3 = baseNCodecInputStream.read();
        assertEquals(0, result3);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testRead_ReadsMultipleBytes_KlOJ3_xomH0_1() throws IOException {
        byte[] bytes = {1, 2, 3};
        java.io.ByteArrayInputStream inputStream = new java.io.ByteArrayInputStream(bytes);
        Base32 baseNCodec = new Base32();
        BaseNCodecInputStream baseNCodecInputStream = new BaseNCodecInputStream(inputStream, baseNCodec, false);
        int result1 = baseNCodecInputStream.read();
        int result2 = baseNCodecInputStream.read();
        int result3 = baseNCodecInputStream.read();
        assertEquals(1, result1);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testRead_ReadsMultipleBytes_KlOJ3_xomH0_2() throws IOException {
        byte[] bytes = {1, 2, 3};
        java.io.ByteArrayInputStream inputStream = new java.io.ByteArrayInputStream(bytes);
        Base32 baseNCodec = new Base32();
        BaseNCodecInputStream baseNCodecInputStream = new BaseNCodecInputStream(inputStream, baseNCodec, false);
        int result1 = baseNCodecInputStream.read();
        int result2 = baseNCodecInputStream.read();
        int result3 = baseNCodecInputStream.read();
        assertEquals(2, result2);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testRead_ReadsMultipleBytes_KlOJ3_xomH0_3() throws IOException {
        byte[] bytes = {1, 2, 3};
        java.io.ByteArrayInputStream inputStream = new java.io.ByteArrayInputStream(bytes);
        Base32 baseNCodec = new Base32();
        BaseNCodecInputStream baseNCodecInputStream = new BaseNCodecInputStream(inputStream, baseNCodec, false);
        int result1 = baseNCodecInputStream.read();
        int result2 = baseNCodecInputStream.read();
        int result3 = baseNCodecInputStream.read();
        assertEquals(3, result3);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSkip_PositiveLength_EOF_ReturnsSkipped_MultipleChunks_htIU5_DuGe0_1() throws IOException {
        byte[] data = new byte[1024];
        for (int i = 0; i < 1024; i++) {
            data[i] = (byte) i;
        }
        java.io.ByteArrayInputStream byteArrayInputStream = new java.io.ByteArrayInputStream(data);
        BaseNCodecInputStream inputStream = new BaseNCodecInputStream(byteArrayInputStream, new Base32(), false);
        assertEquals(1024, inputStream.skip(2048));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSkip_PositiveLength_EOF_ReturnsSkipped_MultipleChunks_htIU5_DuGe0_2() throws IOException {
        byte[] data = new byte[1024];
        for (int i = 0; i < 1024; i++) {
            data[i] = (byte) i;
        }
        java.io.ByteArrayInputStream byteArrayInputStream = new java.io.ByteArrayInputStream(data);
        BaseNCodecInputStream inputStream = new BaseNCodecInputStream(byteArrayInputStream, new Base32(), false);
        assertEquals(0, byteArrayInputStream.available());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAvailable_eofTrue_LMOH0_hnGW0() throws IOException {
        java.io.InputStream inputStream = new java.io.ByteArrayInputStream(new byte[0]);
        Base32 baseNCodec = new Base32();
        BaseNCodecInputStream baseNCodecInputStream = new BaseNCodecInputStream(inputStream, baseNCodec, false);
        inputStream.close(); // Simulate EOF
        int result = baseNCodecInputStream.available();
        assertEquals(0, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSkip_PositiveLength_EOF_ReturnsSkipped_fuNW4_mnUr0_1() throws IOException {
        byte[] data = new byte[512];
        for (int i = 0; i < 512; i++) {
            data[i] = (byte) i;
        }
        java.io.ByteArrayInputStream byteArrayInputStream = new java.io.ByteArrayInputStream(data);
        BaseNCodecInputStream inputStream = new BaseNCodecInputStream(byteArrayInputStream, new Base32(), false);
        assertEquals(512, inputStream.skip(1024));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSkip_PositiveLength_EOF_ReturnsSkipped_fuNW4_mnUr0_2() throws IOException {
        byte[] data = new byte[512];
        for (int i = 0; i < 512; i++) {
            data[i] = (byte) i;
        }
        java.io.ByteArrayInputStream byteArrayInputStream = new java.io.ByteArrayInputStream(data);
        BaseNCodecInputStream inputStream = new BaseNCodecInputStream(byteArrayInputStream, new Base32(), false);
        assertEquals(0, byteArrayInputStream.available());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSkip_PositiveLength_ReadsFromInputStream_MultipleChunks_pZIt3_qcNw0_1() throws IOException {
        byte[] data = new byte[2048];
        for (int i = 0; i < 2048; i++) {
            data[i] = (byte) i;
        }
        java.io.ByteArrayInputStream byteArrayInputStream = new java.io.ByteArrayInputStream(data);
        BaseNCodecInputStream inputStream = new BaseNCodecInputStream(byteArrayInputStream, new Base32(), false);
        assertEquals(1024, inputStream.skip(1024));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSkip_PositiveLength_ReadsFromInputStream_MultipleChunks_pZIt3_qcNw0_2() throws IOException {
        byte[] data = new byte[2048];
        for (int i = 0; i < 2048; i++) {
            data[i] = (byte) i;
        }
        java.io.ByteArrayInputStream byteArrayInputStream = new java.io.ByteArrayInputStream(data);
        BaseNCodecInputStream inputStream = new BaseNCodecInputStream(byteArrayInputStream, new Base32(), false);
        assertEquals(1024, inputStream.skip(512));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSkip_PositiveLength_ReadsFromInputStream_MultipleChunks_pZIt3_qcNw0_3() throws IOException {
        byte[] data = new byte[2048];
        for (int i = 0; i < 2048; i++) {
            data[i] = (byte) i;
        }
        java.io.ByteArrayInputStream byteArrayInputStream = new java.io.ByteArrayInputStream(data);
        BaseNCodecInputStream inputStream = new BaseNCodecInputStream(byteArrayInputStream, new Base32(), false);
        assertEquals(512, byteArrayInputStream.available());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testReadWithHasData_XBQj10_vsxj0() throws IOException {
        java.io.ByteArrayOutputStream out = new java.io.ByteArrayOutputStream();
        out.write(1);
        Base32 base32 = new Base32();
        base32.encode(out.toByteArray(), 0, 1, null);
        java.io.InputStream inputStreamStream = new java.io.ByteArrayInputStream(out.toByteArray());
        BaseNCodecInputStream inputStream = new BaseNCodecInputStream(inputStreamStream, base32, false);
        byte[] array = new byte[1];
        assertEquals(1, inputStream.read(array, 0, 1));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSkip_PositiveLength_ReadsFromInputStream_TodoGreaterThanZero_FZtT8_lPHR0_1_fid1() throws IOException {
        byte[] data = new byte[1024];
        for (int i = 0; i < 3; i++) {
            data[i] = (byte) i;
        }
        java.io.ByteArrayInputStream byteArrayInputStream = new java.io.ByteArrayInputStream(data);
        BaseNCodecInputStream inputStream = new BaseNCodecInputStream(byteArrayInputStream, new Base32(), false);
        assertEquals(1024, inputStream.skip(1024));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSkip_PositiveLength_ReadsFromInputStream_TodoGreaterThanZero_FZtT8_lPHR0_2_fid1() throws IOException {
        byte[] data = new byte[1024];
        for (int i = 3; i < 1024; i++) {
            data[i] = (byte) i;
        }
        java.io.ByteArrayInputStream byteArrayInputStream = new java.io.ByteArrayInputStream(data);
        BaseNCodecInputStream inputStream = new BaseNCodecInputStream(byteArrayInputStream, new Base32(), false);
        assertEquals(0, inputStream.skip(512));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testRead_ReadsMultipleZeroBytes_UWxo6_vKbr0_1_fid1() throws IOException {
        byte[] bytes = {0, -1, -1};
        java.io.ByteArrayInputStream inputStream = new java.io.ByteArrayInputStream(bytes);
        Base32 baseNCodec = new Base32();
        BaseNCodecInputStream baseNCodecInputStream = new BaseNCodecInputStream(inputStream, baseNCodec, false);
        int result1 = baseNCodecInputStream.read();
        int result2 = baseNCodecInputStream.read();
        int result3 = baseNCodecInputStream.read();
        assertEquals(0, result1);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testRead_ReadsMultipleZeroBytes_UWxo6_vKbr0_2_fid1() throws IOException {
        byte[] bytes = {0, -1, -1};
        java.io.ByteArrayInputStream inputStream = new java.io.ByteArrayInputStream(bytes);
        Base32 baseNCodec = new Base32();
        BaseNCodecInputStream baseNCodecInputStream = new BaseNCodecInputStream(inputStream, baseNCodec, false);
        int result1 = baseNCodecInputStream.read();
        int result2 = baseNCodecInputStream.read();
        int result3 = baseNCodecInputStream.read();
        assertEquals(0, result2);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testRead_ReadsMultipleZeroBytes_UWxo6_vKbr0_3_fid1() throws IOException {
        byte[] bytes = {0, -1, -1};
        java.io.ByteArrayInputStream inputStream = new java.io.ByteArrayInputStream(bytes);
        Base32 baseNCodec = new Base32();
        BaseNCodecInputStream baseNCodecInputStream = new BaseNCodecInputStream(inputStream, baseNCodec, false);
        int result1 = baseNCodecInputStream.read();
        int result2 = baseNCodecInputStream.read();
        int result3 = baseNCodecInputStream.read();
        assertEquals(0, result3);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testRead_ReadsMultipleBytes_KlOJ3_xomH0_2_fid1() throws IOException {
        byte[] bytes = {1, -1, 3};
        java.io.ByteArrayInputStream inputStream = new java.io.ByteArrayInputStream(bytes);
        Base32 baseNCodec = new Base32();
        BaseNCodecInputStream baseNCodecInputStream = new BaseNCodecInputStream(inputStream, baseNCodec, false);
        int result1 = baseNCodecInputStream.read();
        int result2 = baseNCodecInputStream.read();
        int result3 = baseNCodecInputStream.read();
        assertEquals(2, result2);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testRead_ReadsMultipleBytes_KlOJ3_xomH0_3_fid1() throws IOException {
        byte[] bytes = {1, 2, -1};
        java.io.ByteArrayInputStream inputStream = new java.io.ByteArrayInputStream(bytes);
        Base32 baseNCodec = new Base32();
        BaseNCodecInputStream baseNCodecInputStream = new BaseNCodecInputStream(inputStream, baseNCodec, false);
        int result1 = baseNCodecInputStream.read();
        int result2 = baseNCodecInputStream.read();
        int result3 = baseNCodecInputStream.read();
        assertEquals(3, result3);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSkip_PositiveLength_EOF_ReturnsSkipped_MultipleChunks_htIU5_DuGe0_1_fid1() throws IOException {
        byte[] data = new byte[1024];
        for (int i = 0; i < 3; i++) {
            data[i] = (byte) i;
        }
        java.io.ByteArrayInputStream byteArrayInputStream = new java.io.ByteArrayInputStream(data);
        BaseNCodecInputStream inputStream = new BaseNCodecInputStream(byteArrayInputStream, new Base32(), false);
        assertEquals(1024, inputStream.skip(2048));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSkip_PositiveLength_EOF_ReturnsSkipped_MultipleChunks_htIU5_DuGe0_2_fid1() throws IOException {
        byte[] data = new byte[1024];
        for (int i = 1024; i < 1024; i++) {
            data[i] = (byte) i;
        }
        java.io.ByteArrayInputStream byteArrayInputStream = new java.io.ByteArrayInputStream(data);
        BaseNCodecInputStream inputStream = new BaseNCodecInputStream(byteArrayInputStream, new Base32(), false);
        assertEquals(0, byteArrayInputStream.available());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSkip_PositiveLength_EOF_ReturnsSkipped_fuNW4_mnUr0_1_fid1() throws IOException {
        byte[] data = new byte[512];
        for (int i = 0; i < 3; i++) {
            data[i] = (byte) i;
        }
        java.io.ByteArrayInputStream byteArrayInputStream = new java.io.ByteArrayInputStream(data);
        BaseNCodecInputStream inputStream = new BaseNCodecInputStream(byteArrayInputStream, new Base32(), false);
        assertEquals(512, inputStream.skip(1024));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSkip_PositiveLength_EOF_ReturnsSkipped_fuNW4_mnUr0_2_fid1() throws IOException {
        byte[] data = new byte[512];
        for (int i = 512; i < 512; i++) {
            data[i] = (byte) i;
        }
        java.io.ByteArrayInputStream byteArrayInputStream = new java.io.ByteArrayInputStream(data);
        BaseNCodecInputStream inputStream = new BaseNCodecInputStream(byteArrayInputStream, new Base32(), false);
        assertEquals(0, byteArrayInputStream.available());
    }
}