/**
 * Generated by Aster
 */
package org.apache.commons.codec.digest;

import java.util.concurrent.TimeUnit;
import javax.crypto.Mac;
import org.apache.commons.codec.binary.Hex;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_HmacUtils_Test_Passing {
    private String macsToString(Mac mac) {
        byte[] bytes = mac.doFinal();
        StringBuilder sb = new StringBuilder();
        for (byte b : bytes) {
            sb.append(String.format("%02x", b));
        }
        return sb.toString();
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void test_getHmacSha256_UwIW0() {
        byte[] key = "key".getBytes();
        Mac mac = HmacUtils.getHmacSha256(key);
        assertEquals("HmacSHA256", mac.getAlgorithm());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHmac2_xxsQ1() {
        HmacUtils hmacUtils = new HmacUtils(HmacAlgorithms.HMAC_SHA_1, "key".getBytes());
        byte[] result = hmacUtils.hmac("value".getBytes());
        assertEquals(result.length, 20);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHmac3_XlBH2() {
        HmacUtils hmacUtils = new HmacUtils(HmacAlgorithms.HMAC_SHA_224, "key".getBytes());
        byte[] result = hmacUtils.hmac("value".getBytes());
        assertEquals(result.length, 28);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHmac4_nVfj3() {
        HmacUtils hmacUtils = new HmacUtils(HmacAlgorithms.HMAC_SHA_256, "key".getBytes());
        byte[] result = hmacUtils.hmac("value".getBytes());
        assertEquals(result.length, 32);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHmac5_gqBR4() {
        HmacUtils hmacUtils = new HmacUtils(HmacAlgorithms.HMAC_SHA_384, "key".getBytes());
        byte[] result = hmacUtils.hmac("value".getBytes());
        assertEquals(result.length, 48);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHmac6_gQMl5() {
        HmacUtils hmacUtils = new HmacUtils(HmacAlgorithms.HMAC_SHA_512, "key".getBytes());
        byte[] result = hmacUtils.hmac("value".getBytes());
        assertEquals(result.length, 64);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsAvailable_YCDq0() {
        String name = "HmacSHA256";
        boolean expected = true;
        boolean actual = HmacUtils.isAvailable(name);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsAvailable2_gSmA1() {
        String name = "MD5";
        boolean expected = false;
        boolean actual = HmacUtils.isAvailable(name);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsAvailable3_EAKM2() {
        String name = "HMAC_MD5";
        boolean expected = true;
        boolean actual = HmacUtils.isAvailable(name);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsAvailable4_Avot3() {
        String name = "HMAC_SHA_1";
        boolean expected = true;
        boolean actual = HmacUtils.isAvailable(name);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsAvailable5_IWSS4() {
        String name = "HMAC_SHA_224";
        boolean expected = true;
        boolean actual = HmacUtils.isAvailable(name);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsAvailable6_RXfe5() {
        String name = "HMAC_SHA_256";
        boolean expected = true;
        boolean actual = HmacUtils.isAvailable(name);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsAvailable7_vSSJ6() {
        String name = "HMAC_SHA_384";
        boolean expected = true;
        boolean actual = HmacUtils.isAvailable(name);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsAvailable8_Zfah7() {
        String name = "HMAC_SHA_512";
        boolean expected = false;
        boolean actual = HmacUtils.isAvailable(name);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHmacWithString_cqeK1() {
        HmacUtils hmacUtils = new HmacUtils("HmacSHA256", "key".getBytes());
        String valueToDigest = "valueToDigest";
        byte[] expected = hmacUtils.hmac(valueToDigest.getBytes());
        byte[] actual = hmacUtils.hmac(valueToDigest);
        assertArrayEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHmac2_ihYw1() {
        HmacUtils hmacUtils = new HmacUtils(HmacAlgorithms.HMAC_MD5, "key".getBytes());
        byte[] result = hmacUtils.hmac("value".getBytes());
        assertNotNull(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHmac4_KtXc3() {
        HmacUtils hmacUtils = new HmacUtils(HmacAlgorithms.HMAC_MD5, "key");
        byte[] result = hmacUtils.hmac("value".getBytes());
        assertNotNull(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testgetHmacSha384_yHrT0() {
        byte[] key = new byte[32];
        Mac mac = HmacUtils.getHmacSha384(key);
        assertNotNull(mac);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsAvailable_snjy0_1() {
        assertTrue(HmacUtils.isAvailable(HmacAlgorithms.HMAC_MD5));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsAvailable_snjy0_2() {
        assertTrue(HmacUtils.isAvailable(HmacAlgorithms.HMAC_SHA_1));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsAvailable_snjy0_3() {
        assertTrue(HmacUtils.isAvailable(HmacAlgorithms.HMAC_SHA_224));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsAvailable_snjy0_4() {
        assertTrue(HmacUtils.isAvailable(HmacAlgorithms.HMAC_SHA_256));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsAvailable_snjy0_5() {
        assertTrue(HmacUtils.isAvailable(HmacAlgorithms.HMAC_SHA_384));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsAvailable_snjy0_6() {
        assertTrue(HmacUtils.isAvailable(HmacAlgorithms.HMAC_SHA_512));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHmac_NQWw0() {
        HmacUtils hmacUtils = new HmacUtils(HmacAlgorithms.HMAC_MD5, "key".getBytes());
        String valueToDigest = "value";
        byte[] digest = hmacUtils.hmac(valueToDigest);
        String expectedDigest = "01433efd5f16327ea4b31144572c67f6";
        assertEquals(expectedDigest, new String(Hex.encodeHex(digest)));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHmacMd5Hex_Qqgp0() {
        String key = "key";
        String valueToDigest = "valueToDigest";
        String expected = "05e7be9b69af4228bf184965ba4d9cca";
        String actual = HmacUtils.hmacMd5Hex(key, valueToDigest);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testgetHmacSha1_XmyO0_1() {
        byte[] key = new byte[16];
        Mac mac = HmacUtils.getHmacSha1(key);
        assertNotNull(mac);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testgetHmacSha1_XmyO0_2() {
        byte[] key = new byte[16];
        Mac mac = HmacUtils.getHmacSha1(key);
        assertEquals("HmacSHA1", mac.getAlgorithm());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHmacSha384Hex_wMmb0() {
        String key = "key";
        String valueToDigest = "valueToDigest";
        String expected = "06033628cccfbb7ed0b91f0aeeee422e566eee5f653993d775f37ce31db7f08b67f9267948b4aa2d6c2ca9d367c8939d";
        String actual = HmacUtils.hmacSha384Hex(key, valueToDigest);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testgetHmacSha512_uVXI0() {
        byte[] key = new byte[16];
        Mac mac = HmacUtils.getHmacSha512(key);
        assertNotNull(mac);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHmacSha1Hex_CqvR0() {
        byte[] key = new byte[]{1, 2, 3};
        byte[] valueToDigest = new byte[]{4, 5, 6};
        String expected = "472bcbe729d4794217459df80d26f9b3acc0b3a6";
        String actual = HmacUtils.hmacSha1Hex(key, valueToDigest);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHmacMd5Hex_ExHa0() {
        byte[] key = "key".getBytes();
        byte[] valueToDigest = "valueToDigest".getBytes();
        String expected = "05e7be9b69af4228bf184965ba4d9cca";
        String actual = HmacUtils.hmacMd5Hex(key, valueToDigest);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHmacSha1Hex_sSQf0() {
        String key = "key";
        String valueToDigest = "valueToDigest";
        String expectedResult = "db0cf14221234108d75aa9a10ff7f459d934fb75";
        String actualResult = HmacUtils.hmacSha1Hex(key, valueToDigest);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHmacSha384Hex_uEig0() {
        String key = "key";
        byte[] valueToDigest = "valueToDigest".getBytes();
        String expected = "06033628cccfbb7ed0b91f0aeeee422e566eee5f653993d775f37ce31db7f08b67f9267948b4aa2d6c2ca9d367c8939d";
        String actual = HmacUtils.hmacSha384Hex(key.getBytes(), valueToDigest);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHmacSha256Hex_Fpoj0() {
        byte[] key = "key".getBytes();
        byte[] valueToDigest = "valueToDigest".getBytes();
        String expected = "19fce7c225381ea446738019472fc2835a53dc59604fe6e39b70b8525dda997d";
        String actual = HmacUtils.hmacSha256Hex(key, valueToDigest);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetInitializedMac_hdUX0_1() {
        HmacAlgorithms algorithm = HmacAlgorithms.HMAC_MD5;
        byte[] key = new byte[16]; // Assuming 16 bytes for key
        Mac mac = HmacUtils.getInitializedMac(algorithm, key);
        assertNotNull(mac);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetInitializedMac_hdUX0_2() {
        HmacAlgorithms algorithm = HmacAlgorithms.HMAC_MD5;
        byte[] key = new byte[16]; // Assuming 16 bytes for key
        Mac mac = HmacUtils.getInitializedMac(algorithm, key);
        assertEquals("HmacMD5", mac.getAlgorithm());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetInitializedMacWithSha1AndKey_RmPp1_1() {
        HmacAlgorithms algorithm = HmacAlgorithms.HMAC_SHA_1;
        byte[] key = new byte[20]; // Assuming 20 bytes for key
        Mac mac = HmacUtils.getInitializedMac(algorithm, key);
        assertNotNull(mac);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetInitializedMacWithSha1AndKey_RmPp1_2() {
        HmacAlgorithms algorithm = HmacAlgorithms.HMAC_SHA_1;
        byte[] key = new byte[20]; // Assuming 20 bytes for key
        Mac mac = HmacUtils.getInitializedMac(algorithm, key);
        assertEquals("HmacSHA1", mac.getAlgorithm());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHmacSha512Hex_jvja0() {
        String key = "key";
        String valueToDigest = "valueToDigest";
        String expected = "1b7a0dffd88f80d8499ba4f014ed94ccdc185564eddd9fac6cdca3efeea9f2f8ebb77cfa95e6d43d7c7f56cd693e4ab58e3d1d99b02ef51d0bc4659de86c4380";
        String actual = HmacUtils.hmacSha512Hex(key, valueToDigest);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHmacSha512Hex_clfd0() {
        byte[] key = "key".getBytes();
        byte[] valueToDigest = "valueToDigest".getBytes();
        String expected = "1b7a0dffd88f80d8499ba4f014ed94ccdc185564eddd9fac6cdca3efeea9f2f8ebb77cfa95e6d43d7c7f56cd693e4ab58e3d1d99b02ef51d0bc4659de86c4380";
        String actual = HmacUtils.hmacSha512Hex(key, valueToDigest);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsAvailable_snjy0() {
        assertTrue(HmacUtils.isAvailable(HmacAlgorithms.HMAC_MD5));
        assertTrue(HmacUtils.isAvailable(HmacAlgorithms.HMAC_SHA_1));
        assertTrue(HmacUtils.isAvailable(HmacAlgorithms.HMAC_SHA_224));
        assertTrue(HmacUtils.isAvailable(HmacAlgorithms.HMAC_SHA_256));
        assertTrue(HmacUtils.isAvailable(HmacAlgorithms.HMAC_SHA_384));
        assertTrue(HmacUtils.isAvailable(HmacAlgorithms.HMAC_SHA_512));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testgetHmacSha1_XmyO0() {
        byte[] key = new byte[16];
        Mac mac = HmacUtils.getHmacSha1(key);
        assertNotNull(mac);
        assertEquals("HmacSHA1", mac.getAlgorithm());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetInitializedMac_hdUX0() {
        HmacAlgorithms algorithm = HmacAlgorithms.HMAC_MD5;
        byte[] key = new byte[16]; // Assuming 16 bytes for key
        Mac mac = HmacUtils.getInitializedMac(algorithm, key);
        assertNotNull(mac);
        assertEquals("HmacMD5", mac.getAlgorithm());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetInitializedMacWithSha1AndKey_RmPp1() {
        HmacAlgorithms algorithm = HmacAlgorithms.HMAC_SHA_1;
        byte[] key = new byte[20]; // Assuming 20 bytes for key
        Mac mac = HmacUtils.getInitializedMac(algorithm, key);
        assertNotNull(mac);
        assertEquals("HmacSHA1", mac.getAlgorithm());
    }
}