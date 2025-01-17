/**
 * Generated by Aster
 */
package org.apache.commons.codec.digest;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

import java.util.concurrent.TimeUnit;
import javax.crypto.Mac;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

public class Aster_HmacUtils_Coverage_Test_Passing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void hmacSha512_1_mSZa0() {
        String key = "key";
        String valueToDigest = "valueToDigest";
        byte[] hmac = HmacUtils.hmacSha512(key, valueToDigest);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsAvailable_UvMH0_1() {
        assertFalse(HmacUtils.isAvailable("hmac_md5"));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsAvailable_UvMH0_2() {
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsAvailableWithNoSuchAlgorithm_CKzY1() {
        assertFalse(HmacUtils.isAvailable("hmac_sha_64"));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void hmacSha512HexTest1_dxQL0() {
        String key = "key";
        String valueToDigest = "valueToDigest";
        String expected = new HmacUtils(HmacAlgorithms.HMAC_SHA_512, key).hmacHex(valueToDigest);
        String actual = HmacUtils.hmacSha512Hex(key, valueToDigest);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void test_getHmacSha256_0_qDCu0() throws Exception {
        HmacUtils hmacUtils = new HmacUtils(HmacAlgorithms.HMAC_SHA_256, "key");
        Mac mac = hmacUtils.getHmacSha256("key".getBytes());
        assertEquals(mac.getAlgorithm(), "HmacSHA256");
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void test_getHmacSha256_1_rGdy1() throws Exception {
        HmacUtils hmacUtils = new HmacUtils(HmacAlgorithms.HMAC_SHA_256, "key");
        Mac mac = hmacUtils.getHmacSha256("key".getBytes());
        assertEquals(mac.getMacLength(), 32);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void hmacSha512Test2_gbNs1() {
        byte[] key = new byte[10];
        byte[] valueToDigest = new byte[10];
        byte[] expected = HmacUtils.hmacSha512(key, valueToDigest);
        byte[] actual = HmacUtils.hmacSha512(key, valueToDigest);
        assertArrayEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void hmacSha512Test3_KqLY2() {
        byte[] key = new byte[20];
        byte[] valueToDigest = new byte[20];
        byte[] expected = HmacUtils.hmacSha512(key, valueToDigest);
        byte[] actual = HmacUtils.hmacSha512(key, valueToDigest);
        assertArrayEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void hmacSha512Test4_lPYm3() {
        byte[] key = new byte[30];
        byte[] valueToDigest = new byte[30];
        byte[] expected = HmacUtils.hmacSha512(key, valueToDigest);
        byte[] actual = HmacUtils.hmacSha512(key, valueToDigest);
        assertArrayEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void hmacSha512Test5_xCUG4() {
        byte[] key = new byte[40];
        byte[] valueToDigest = new byte[40];
        byte[] expected = HmacUtils.hmacSha512(key, valueToDigest);
        byte[] actual = HmacUtils.hmacSha512(key, valueToDigest);
        assertArrayEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void hmacSha512Test6_FDxh5() {
        byte[] key = new byte[50];
        byte[] valueToDigest = new byte[50];
        byte[] expected = HmacUtils.hmacSha512(key, valueToDigest);
        byte[] actual = HmacUtils.hmacSha512(key, valueToDigest);
        assertArrayEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void hmacSha512Test7_jSOC6() {
        byte[] key = new byte[60];
        byte[] valueToDigest = new byte[60];
        byte[] expected = HmacUtils.hmacSha512(key, valueToDigest);
        byte[] actual = HmacUtils.hmacSha512(key, valueToDigest);
        assertArrayEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void hmacSha512Test8_AOVY7() {
        byte[] key = new byte[70];
        byte[] valueToDigest = new byte[70];
        byte[] expected = HmacUtils.hmacSha512(key, valueToDigest);
        byte[] actual = HmacUtils.hmacSha512(key, valueToDigest);
        assertArrayEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void hmacSha512Test9_vvKf8() {
        byte[] key = new byte[80];
        byte[] valueToDigest = new byte[80];
        byte[] expected = HmacUtils.hmacSha512(key, valueToDigest);
        byte[] actual = HmacUtils.hmacSha512(key, valueToDigest);
        assertArrayEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void hmacSha512Test10_bkHm9() {
        byte[] key = new byte[90];
        byte[] valueToDigest = new byte[90];
        byte[] expected = HmacUtils.hmacSha512(key, valueToDigest);
        byte[] actual = HmacUtils.hmacSha512(key, valueToDigest);
        assertArrayEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void hmacSha512Test11_YxWs10() {
        byte[] key = new byte[100];
        byte[] valueToDigest = new byte[100];
        byte[] expected = HmacUtils.hmacSha512(key, valueToDigest);
        byte[] actual = HmacUtils.hmacSha512(key, valueToDigest);
        assertArrayEquals(expected, actual);
    }
}