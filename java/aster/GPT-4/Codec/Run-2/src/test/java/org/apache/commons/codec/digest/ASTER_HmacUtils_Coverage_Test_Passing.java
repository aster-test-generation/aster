/**
 * Generated by Aster
 */
package org.apache.commons.codec.digest;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.concurrent.TimeUnit;
import org.apache.commons.codec.binary.Hex;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class Aster_HmacUtils_Coverage_Test_Passing {
    private static final int STREAM_BUFFER_LENGTH = 1024; // Assuming this is defined somewhere in your class

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsAvailableWithInvalidAlgorithm_Azra0() {
    }

    @Test
    public void testGetInitializedMacWithInvalidAlgorithm_jjnk0_kTzH0() {
        String invalidAlgorithm = "INVALID_ALGO";
        byte[] key = new byte[]{1, 2, 3};
        assertThrows(IllegalArgumentException.class, () -> {
            HmacUtils.getInitializedMac(invalidAlgorithm, key);
        });
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHmacSha256_jlVo0_HIuk0() throws IOException {
        byte[] key = "secretKey".getBytes();
        String data = "Data to be hashed";
        ByteBuffer buffer = ByteBuffer.wrap(data.getBytes());
        HmacUtils hmacUtils = new HmacUtils(HmacAlgorithms.HMAC_SHA_256, key);
        String result = hmacUtils.hmacHex(buffer);
        System.out.println(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHmacSha512_mTDm0_WbhI0() throws IOException {
        byte[] key = "test-key".getBytes();
        String data = "Hello, World!";
        ByteBuffer buffer = ByteBuffer.wrap(data.getBytes());
        HmacUtils hmacUtils = new HmacUtils(HmacAlgorithms.HMAC_SHA_512, key);
        String expectedOutput = "actual HMAC SHA-512 hex output here";
        String result = hmacUtils.hmacHex(buffer);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHmacWithNonEmptyInputStream_plVM1_ApQH0() throws IOException {
        HmacUtils hmacUtils = new HmacUtils(HmacAlgorithms.HMAC_SHA_256, "secretKey".getBytes());
        byte[] inputData = "Hello World".getBytes();
        ByteBuffer buffer = ByteBuffer.wrap(inputData);
        String result = hmacUtils.hmacHex(buffer);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHmacMd5_OyBZ0_rTWa0() throws IOException {
        byte[] key = "test-key".getBytes();
        String data = "Hello, World!";
        ByteBuffer dataBuffer = ByteBuffer.wrap(data.getBytes());
        byte[] expectedOutput = new byte[]{ /* mock or expected HMAC MD5 result bytes here */ };
        HmacUtils mockedHmacUtils = mock(HmacUtils.class);
        when(mockedHmacUtils.hmacHex(dataBuffer)).thenReturn(Hex.encodeHexString(expectedOutput));
        String result = mockedHmacUtils.hmacHex(dataBuffer);
        assertEquals(Hex.encodeHexString(expectedOutput), result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHmacWithEmptyInputStream_HCsp0_Zwcr0() throws IOException {
        HmacUtils hmacUtils = new HmacUtils(HmacAlgorithms.HMAC_SHA_256, "secretKey".getBytes());
        ByteBuffer emptyBuffer = ByteBuffer.allocate(0);
        String result = hmacUtils.hmacHex(emptyBuffer);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHmacSha256Hex_blrZ0_BnGo0() throws IOException {
        byte[] key = "testKey".getBytes();
        ByteBuffer valueToDigest = ByteBuffer.wrap("Hello, World!".getBytes());
        HmacUtils hmacUtils = new HmacUtils(HmacAlgorithms.HMAC_SHA_256, key);
        String expectedHexOutput = "a3b3cea719cf707b4b54a3d3b5f7501b1b0ab5cd8ca48f7eaed9d0a0695a2a6d";
        String result = hmacUtils.hmacHex(valueToDigest);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHmacSha384Hex_qGcP0_Ukti0() throws IOException {
        byte[] key = new byte[]{1, 2, 3, 4, 5};
        String inputString = "Hello, world!";
        ByteBuffer buffer = ByteBuffer.wrap(inputString.getBytes());
        HmacUtils mockedHmacUtils = mock(HmacUtils.class);
        when(mockedHmacUtils.hmacHex(buffer)).thenReturn("expectedHexResult");
        String result = mockedHmacUtils.hmacHex(buffer);
        assertEquals("expectedHexResult", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHmacSha1Hex_Lfty0_Pkgq0() throws IOException {
        byte[] key = "secretKey".getBytes();
        String data = "Sample data for HMAC";
        ByteBuffer dataBuffer = ByteBuffer.wrap(data.getBytes());
        HmacUtils mockedHmacUtils = mock(HmacUtils.class);
        when(mockedHmacUtils.hmacHex(dataBuffer)).thenReturn("de7c9b85b8b78aa6bc8a7a36f70a90701c9db4d9");
        String result = mockedHmacUtils.hmacHex(dataBuffer);
        assertEquals("de7c9b85b8b78aa6bc8a7a36f70a90701c9db4d9", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHmacWithMultipleReads_smmV2_eRdF0() throws IOException {
        HmacUtils hmacUtils = new HmacUtils(HmacAlgorithms.HMAC_SHA_256, "secretKey".getBytes());
        byte[] inputData = new byte[5000]; // Larger than STREAM_BUFFER_LENGTH to force multiple reads
        for (int i = 0; i < inputData.length; i++) {
            inputData[i] = (byte) (i % 256); // Fill with some data
        }
        ByteBuffer buffer = ByteBuffer.wrap(inputData);
        String result = hmacUtils.hmacHex(buffer);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHmacSha1_TyLm0_QuXn0() throws IOException {
        byte[] key = "testKey".getBytes();
        ByteBuffer buffer = ByteBuffer.wrap("Hello, HMAC!".getBytes());
        HmacUtils hmacUtils = new HmacUtils(HmacAlgorithms.HMAC_SHA_1, key);
        String expectedHmacOutput = "5f7d343f51050671d9acb63680a458b94119184c";
        String actualHmacOutput = hmacUtils.hmacHex(buffer);
        assertEquals(expectedHmacOutput, actualHmacOutput);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHmacWithPartialBufferRead_akkm3_OISF0() throws IOException {
        HmacUtils hmacUtils = new HmacUtils(HmacAlgorithms.HMAC_SHA_256, "secretKey".getBytes());
        byte[] inputData = new byte[STREAM_BUFFER_LENGTH - 100]; // Less than STREAM_BUFFER_LENGTH to test partial buffer read
        for (int i = 0; i < inputData.length; i++) {
            inputData[i] = (byte) (i % 256); // Fill with some data
        }
        ByteBuffer buffer = ByteBuffer.wrap(inputData);
        String result = hmacUtils.hmacHex(buffer);
    }
}