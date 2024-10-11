/**
 * Generated by Aster
 */
package org.apache.commons.codec.digest;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

import java.io.IOException;
import java.util.Arrays;
import java.util.concurrent.TimeUnit;
import javax.crypto.Mac;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

public class Aster_HmacUtils_Coverage_Test_Failing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void hmacSha1_test1_XrtV0() {
        byte[] result = HmacUtils.hmacSha1("key", "valueToDigest");
        byte[] expected = new byte[]{1, 2, 3};
        assertEquals(expected, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsAvailable_UvMH0_1_fid2() {
        assertTrue(HmacUtils.isAvailable("hmac_md5"));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsAvailable_UvMH0_2_fid2() {
        assertTrue(HmacUtils.isAvailable("hmac_sha_1"));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsAvailable_UvMH0_3() {
        assertTrue(HmacUtils.isAvailable("hmac_sha_224"));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsAvailable_UvMH0_4() {
        assertTrue(HmacUtils.isAvailable("hmac_sha_256"));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsAvailable_UvMH0_5() {
        assertTrue(HmacUtils.isAvailable("hmac_sha_384"));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsAvailable_UvMH0_6() {
        assertTrue(HmacUtils.isAvailable("hmac_sha_512"));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHmacSha384_qhRL0() {
        byte[] key = new byte[0];
        byte[] valueToDigest = new byte[0];
        byte[] expected = new byte[0];
        byte[] actual = HmacUtils.hmacSha384(key, valueToDigest);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void test_getHmacSha256_2_JQWQ2() throws Exception {
        HmacUtils hmacUtils = new HmacUtils(HmacAlgorithms.HMAC_SHA_256, "key");
        Mac mac = hmacUtils.getHmacSha256("key".getBytes());
        assertEquals(mac.getProvider().getName(), "Android");
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void hmacSha512HexTest1_ldMI0() {
        byte[] key = new byte[0];
        byte[] valueToDigest = new byte[0];
        String expected = HmacUtils.hmacSha512Hex(key, valueToDigest);
        String actual = new HmacUtils(HmacAlgorithms.HMAC_SHA_512, key).hmacHex(valueToDigest);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void getHmacMd5_test1_LwjD0() {
        HmacUtils hmacUtils = new HmacUtils(HmacAlgorithms.HMAC_MD5, "key");
        Mac mac = hmacUtils.getHmacMd5(new byte[]{0x0B, 0x0B, 0x0B, 0x0B, 0x0B, 0x0B, 0x0B, 0x0B, 0x0B, 0x0B, 0x0B, 0x0B, 0x0B, 0x0B, 0x0B, 0x0B, 0x0B, 0x0B, 0x0B, 0x0B});
        Assertions.assertEquals("9294727a3638bb1c13f48ef8158b05", mac.toString());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void hmacSha512Test1_jowl0() {
        byte[] key = new byte[0];
        byte[] valueToDigest = new byte[0];
        byte[] expected = HmacUtils.hmacSha512(key, valueToDigest);
        byte[] actual = HmacUtils.hmacSha512(key, valueToDigest);
        assertArrayEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void hmacMd5Test1_CHlK0() {
        byte[] key = new byte[0];
        byte[] valueToDigest = new byte[0];
        byte[] expected = new byte[0];
        byte[] actual = HmacUtils.hmacMd5(key, valueToDigest);
        assertTrue(Arrays.equals(expected, actual));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void hmacMd5Test2_yoyN1() {
        byte[] key = new byte[1];
        byte[] valueToDigest = new byte[1];
        byte[] expected = new byte[1];
        byte[] actual = HmacUtils.hmacMd5(key, valueToDigest);
        assertTrue(Arrays.equals(expected, actual));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void hmacMd5Test3_Knfv2() {
        byte[] key = new byte[2];
        byte[] valueToDigest = new byte[2];
        byte[] expected = new byte[2];
        byte[] actual = HmacUtils.hmacMd5(key, valueToDigest);
        assertTrue(Arrays.equals(expected, actual));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void hmacMd5Test4_rqMK3() {
        byte[] key = new byte[3];
        byte[] valueToDigest = new byte[3];
        byte[] expected = new byte[3];
        byte[] actual = HmacUtils.hmacMd5(key, valueToDigest);
        assertTrue(Arrays.equals(expected, actual));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void hmacMd5Test5_ILvC4() {
        byte[] key = new byte[4];
        byte[] valueToDigest = new byte[4];
        byte[] expected = new byte[4];
        byte[] actual = HmacUtils.hmacMd5(key, valueToDigest);
        assertTrue(Arrays.equals(expected, actual));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void hmacMd5Test6_nAVs5() {
        byte[] key = new byte[5];
        byte[] valueToDigest = new byte[5];
        byte[] expected = new byte[5];
        byte[] actual = HmacUtils.hmacMd5(key, valueToDigest);
        assertTrue(Arrays.equals(expected, actual));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void hmacMd5Test7_PTOc6() {
        byte[] key = new byte[6];
        byte[] valueToDigest = new byte[6];
        byte[] expected = new byte[6];
        byte[] actual = HmacUtils.hmacMd5(key, valueToDigest);
        assertTrue(Arrays.equals(expected, actual));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void hmacMd5Test8_VXow7() {
        byte[] key = new byte[7];
        byte[] valueToDigest = new byte[7];
        byte[] expected = new byte[7];
        byte[] actual = HmacUtils.hmacMd5(key, valueToDigest);
        assertTrue(Arrays.equals(expected, actual));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void hmacMd5Test9_JkNc8() {
        byte[] key = new byte[8];
        byte[] valueToDigest = new byte[8];
        byte[] expected = new byte[8];
        byte[] actual = HmacUtils.hmacMd5(key, valueToDigest);
        assertTrue(Arrays.equals(expected, actual));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void hmacMd5Test10_cOHj9() {
        byte[] key = new byte[9];
        byte[] valueToDigest = new byte[9];
        byte[] expected = new byte[9];
        byte[] actual = HmacUtils.hmacMd5(key, valueToDigest);
        assertTrue(Arrays.equals(expected, actual));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void hmacMd5Test11_SIll10() {
        byte[] key = new byte[10];
        byte[] valueToDigest = new byte[10];
        byte[] expected = new byte[10];
        byte[] actual = HmacUtils.hmacMd5(key, valueToDigest);
        assertTrue(Arrays.equals(expected, actual));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void hmacMd5Test12_VriF11() {
        byte[] key = new byte[11];
        byte[] valueToDigest = new byte[11];
        byte[] expected = new byte[11];
        byte[] actual = HmacUtils.hmacMd5(key, valueToDigest);
        assertTrue(Arrays.equals(expected, actual));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void hmacSha512Test2_fyUz1_GUXf0() throws IOException {
        byte[] valueToDigest = "valueToDigest".getBytes();
        byte[] key = "key".getBytes();
        HmacUtils hmacUtils = new HmacUtils(HmacAlgorithms.HMAC_SHA_512, key);
        byte[] hmac = hmacUtils.hmac(valueToDigest);
        byte[] expected = new byte[]{1, 2, 3};
        Assertions.assertArrayEquals(expected, hmac);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void hmacSha1Test1_yhXF0_kDNf0() throws IOException {
        byte[] key = new byte[]{0x0b, 0x0b, 0x0b, 0x0b, 0x0b, 0x0b, 0x0b, 0x0b, 0x0b, 0x0b, 0x0b, 0x0b, 0x0b, 0x0b, 0x0b, 0x0b, 0x0b, 0x0b, 0x0b, 0x0b};
        byte[] valueToDigest = "Hi There".getBytes();
        byte[] expected = new byte[]{-48, -95, 12, -103, -43, 100, 117, 114, -4, 126, -127, -117, -116, -97, 5, 73, 110, -57, -7, -63, -71, -4, -86, -122, 26, -37, 103, -46};
        byte[] actual = HmacUtils.hmacSha1(key, valueToDigest);
        assertEquals(Arrays.toString(expected), Arrays.toString(actual));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsAvailable_UvMH0() {
        assertTrue(HmacUtils.isAvailable("hmac_md5"));
        assertTrue(HmacUtils.isAvailable("hmac_sha_1"));
        assertTrue(HmacUtils.isAvailable("hmac_sha_224"));
        assertTrue(HmacUtils.isAvailable("hmac_sha_256"));
        assertTrue(HmacUtils.isAvailable("hmac_sha_384"));
        assertTrue(HmacUtils.isAvailable("hmac_sha_512"));
    }
}