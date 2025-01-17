/**
 * Generated by Aster
 */
package org.apache.commons.codec.digest;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

public class Aster_HmacUtils_Coverage_Test_Failing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHmacSha1Hex_SnXF0() throws IOException {
        final byte[] key = new byte[0];
        final InputStream valueToDigest = null;
        assertEquals("36122f66ef55252b7b46360d4137c56559b115", HmacUtils.hmacSha1Hex(key, valueToDigest));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHmacSha256_PSRY0() throws IOException {
        byte[] key = new byte[16];
        InputStream valueToDigest = null;
        byte[] expected = new byte[32];
        byte[] actual = HmacUtils.hmacSha256(key, valueToDigest);
        assertArrayEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void test_hmacSha384Hex_0_Ufsx0() {
        byte[] key = new byte[0];
        byte[] valueToDigest = new byte[0];
        String output = HmacUtils.hmacSha384Hex(key, valueToDigest);
        assertEquals("16191628630083700777135054654357088818001619162863008370077713505465435708881800", output);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHmacSha1_mEgP0() throws IOException {
        byte[] key = new byte[10];
        InputStream valueToDigest = null;
        byte[] expected = new byte[10];
        byte[] actual = new HmacUtils(HmacAlgorithms.HMAC_SHA_1, key).hmac(valueToDigest);
        assertArrayEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void test_hmacSha512Hex_1_ozdU0_dBGA0() throws IOException {
        byte[] key = new byte[0];
        InputStream valueToDigest = null;
        String expected = null;
        HmacUtils instance = new HmacUtils(HmacAlgorithms.HMAC_SHA_512, key);
        String out = instance.hmacHex(valueToDigest);
        assertEquals(expected, out);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHmacHex_vofR0() {
        HmacUtils hmacUtils = new HmacUtils("HMAC_MD5", "key".getBytes());
        String result = hmacUtils.hmacHex(ByteBuffer.wrap("value".getBytes()));
        assertEquals("772eb885f4a361e8ef719b934d75265", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void test_hmacSha512_1_uwAK0_mYUj0() throws IOException {
        byte[] key = new byte[0];
        byte[] valueToDigest = new byte[0];
        byte[] expected = new byte[0];
        byte[] actual = HmacUtils.hmacSha512(key, valueToDigest);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEmptyKey_XrZn1_Mtpz0_fid2() {
        try {
            HmacUtils.getInitializedMac("HmacSHA256", new byte[0]);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            assertEquals("Null key", e.getMessage());
        }
    }
}