/**
 * Generated by Aster
 */
package org.apache.commons.codec.digest;

import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_HmacUtils_Coverage_Test_Failing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHmacMd5Hex_ihut0() {
        byte[] key = "key".getBytes();
        byte[] valueToDigest = "value".getBytes();
        String expected = "expectedHmacMd5Hex";
        String actual = HmacUtils.hmacMd5Hex(key, valueToDigest);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHmacMd5_leJC0() {
        String key = "testKey";
        String valueToDigest = "testValue";
        byte[] expected = new byte[]{1, 2, 3, 4, 5};
        byte[] result = HmacUtils.hmacMd5(key, valueToDigest);
        assertArrayEquals(expected, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHmacMd5Hex_xlyg0_MNiU0() throws IOException {
        byte[] key = "key".getBytes();
        byte[] valueToDigest = "value".getBytes();
        String expected = "some expected hmac sha512 hex value";
        String result = HmacUtils.hmacSha512Hex(key, valueToDigest);
        assertEquals(expected, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHmacSha1Hex_fsyo0_txkN0() throws IOException {
        byte[] key = "key".getBytes();
        byte[] valueToDigest = "value".getBytes();
        String expected = "expectedHmacSha1Hex";
        String actual = HmacUtils.hmacSha512Hex(key, valueToDigest);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHmacSha512Hex_gjnH0_vTux0() throws IOException {
        byte[] key = new byte[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        byte[] valueToDigest = new byte[]{11, 12, 13, 14, 15, 16, 17, 18, 19, 20};
        String expected = "your expected hmacSha512Hex result";
        String actual = HmacUtils.hmacSha512Hex(key, valueToDigest);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHmacSha256Hex_FYMc0_PBUJ0() throws IOException {
        byte[] key = new byte[]{(byte) 0x01, (byte) 0x02, (byte) 0x03, (byte) 0x04};
        byte[] valueToDigest = new byte[]{(byte) 0x05, (byte) 0x06, (byte) 0x07, (byte) 0x08};
        String expectedResult = "a5cbf6a5e7f5a5a5a5a5a5a5a5a5a5a5a5a5a5";
        String result = HmacUtils.hmacSha512Hex(key, valueToDigest);
        assertEquals(expectedResult, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHmacSha384Hex_aGyN0_HVoR0() throws IOException {
        byte[] key = new byte[]{(byte) 0x12, (byte) 0x34, (byte) 0x56, (byte) 0x78};
        byte[] valueToDigest = new byte[]{(byte) 0x01, (byte) 0x02, (byte) 0x03, (byte) 0x04};
        String expectedResult = "a6a5a4a3a2a1a0a1a2a3a4a5a6";
        String actualResult = HmacUtils.hmacSha384Hex(key, valueToDigest);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testUpdateHmacWithNullMac_QRjG1_yrlC0() throws java.io.IOException {
        byte[] valueToDigest = "valueToDigest".getBytes();
        assertThrows(NullPointerException.class, () -> HmacUtils.hmacSha512Hex(null, valueToDigest));
    }
}