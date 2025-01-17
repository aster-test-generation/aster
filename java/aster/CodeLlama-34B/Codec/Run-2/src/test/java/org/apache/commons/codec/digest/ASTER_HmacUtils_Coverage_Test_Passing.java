/**
 * Generated by Aster
 */
package org.apache.commons.codec.digest;

import java.io.IOException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.concurrent.TimeUnit;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_HmacUtils_Coverage_Test_Passing {
    private static final String HMAC_SHA_256 = "HmacSHA256";
    private static final String KEY = "secret";

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetHmacSha384_GSap0_1() {
        byte[] key = new byte[32];
        Mac mac = HmacUtils.getHmacSha384(key);
        assertNotNull(mac);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsAvailable_HmacMd5_PIVC0() {
        HmacAlgorithms algorithm = HmacAlgorithms.HMAC_MD5;
        assertTrue(HmacUtils.isAvailable(algorithm));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsAvailable_HmacSha1_QaPz1() {
        HmacAlgorithms algorithm = HmacAlgorithms.HMAC_SHA_1;
        assertTrue(HmacUtils.isAvailable(algorithm));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsAvailable_HmacSha224_TLeN2() {
        HmacAlgorithms algorithm = HmacAlgorithms.HMAC_SHA_224;
        assertTrue(HmacUtils.isAvailable(algorithm));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsAvailable_HmacSha512_AMkz3() {
        HmacAlgorithms algorithm = HmacAlgorithms.HMAC_SHA_512;
        assertTrue(HmacUtils.isAvailable(algorithm));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetHmacSha1_WLKD0_1() throws NoSuchAlgorithmException, InvalidKeyException {
        byte[] key = "testKey".getBytes();
        Mac mac = HmacUtils.getHmacSha1(key);
        assertNotNull(mac);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetHmacSha1_WLKD0_2() throws NoSuchAlgorithmException, InvalidKeyException {
        byte[] key = "testKey".getBytes();
        Mac mac = HmacUtils.getHmacSha1(key);
        assertEquals("HmacSHA1", mac.getAlgorithm());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testUpdateHmac_cUxn0_1() throws NoSuchAlgorithmException, InvalidKeyException {
        Mac mac = Mac.getInstance("HmacSHA256");
        SecretKeySpec secretKeySpec = new SecretKeySpec("my-secret-key".getBytes(), "HmacSHA256");
        mac.init(secretKeySpec);
        byte[] valueToDigest = "hello world".getBytes();
        Mac updatedMac = HmacUtils.updateHmac(mac, valueToDigest);
        assertNotNull(updatedMac);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testUpdateHmac_cUxn0_2() throws NoSuchAlgorithmException, InvalidKeyException {
        Mac mac = Mac.getInstance("HmacSHA256");
        SecretKeySpec secretKeySpec = new SecretKeySpec("my-secret-key".getBytes(), "HmacSHA256");
        mac.init(secretKeySpec);
        byte[] valueToDigest = "hello world".getBytes();
        Mac updatedMac = HmacUtils.updateHmac(mac, valueToDigest);
        assertEquals(mac, updatedMac);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHmacMd5_shaF0_1() {
        String key = "testKey";
        String valueToDigest = "testValue";
        byte[] expected = new HmacUtils(HmacAlgorithms.HMAC_MD5, key).hmac(valueToDigest);
        byte[] actual = HmacUtils.hmacMd5(key, valueToDigest);
        assertNotNull(actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHmacMd5_shaF0_2() {
        String key = "testKey";
        String valueToDigest = "testValue";
        byte[] expected = new HmacUtils(HmacAlgorithms.HMAC_MD5, key).hmac(valueToDigest);
        byte[] actual = HmacUtils.hmacMd5(key, valueToDigest);
        assertArrayEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHmacSha512Hex_aAdX0_txWJ0() throws IOException {
        byte[] key = "test_key".getBytes();
        byte[] valueToDigest = "test_value".getBytes();
        String expectedResult = "c6b69b7e5cc467667ea54bbf99851886052c0f62acac407560960868fcb763dfdb5798a9c665c47162a307a0df0f8a19f0a10f75cbf4652a5406ce07a9d30305";
        HmacUtils hmacUtils = new HmacUtils(HmacAlgorithms.HMAC_SHA_512, key);
        String actualResult = hmacUtils.hmacHex(valueToDigest);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHmacSha256_hYNv0_AXqP0_1() throws InvalidKeyException, NoSuchAlgorithmException, IOException {
        byte[] key = "test".getBytes();
        byte[] valueToDigest = "test".getBytes();
        byte[] expected = new HmacUtils(HmacAlgorithms.HMAC_SHA_256, key).hmac(valueToDigest);
        byte[] actual = HmacUtils.hmacSha256(key, valueToDigest);
        for (int i = 0; i < expected.length; i++) {
        }
        assertNotNull(actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHmacSha256_hYNv0_AXqP0_2() throws InvalidKeyException, NoSuchAlgorithmException, IOException {
        byte[] key = "test".getBytes();
        byte[] valueToDigest = "test".getBytes();
        byte[] expected = new HmacUtils(HmacAlgorithms.HMAC_SHA_256, key).hmac(valueToDigest);
        byte[] actual = HmacUtils.hmacSha256(key, valueToDigest);
        for (int i = 0; i < expected.length; i++) {
        }
        assertEquals(expected.length, actual.length);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHmacSha512_PEGA0_Qacg0() throws IOException {
        byte[] key = new byte[16];
        byte[] valueToDigest = new byte[16];
        byte[] expected = new HmacUtils(HmacAlgorithms.HMAC_SHA_512, key).hmac(valueToDigest);
        byte[] actual = HmacUtils.hmacSha512(key, valueToDigest);
        assertArrayEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHmacMd5_slLX0_pRUg0_1() throws NoSuchAlgorithmException, InvalidKeyException, IOException {
        byte[] key = new byte[10];
        byte[] valueToDigest = new byte[10];
        byte[] expected = new HmacUtils(HmacAlgorithms.HMAC_MD5, key).hmac(valueToDigest);
        byte[] actual = HmacUtils.hmacMd5(key, valueToDigest);
        for (int i = 0; i < expected.length; i++) {
        }
        assertNotNull(actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHmacMd5_slLX0_pRUg0_2() throws NoSuchAlgorithmException, InvalidKeyException, IOException {
        byte[] key = new byte[10];
        byte[] valueToDigest = new byte[10];
        byte[] expected = new HmacUtils(HmacAlgorithms.HMAC_MD5, key).hmac(valueToDigest);
        byte[] actual = HmacUtils.hmacMd5(key, valueToDigest);
        for (int i = 0; i < expected.length; i++) {
        }
        assertEquals(expected.length, actual.length);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHmacSha1_lAIw0_UJkD0() throws IOException {
        byte[] key = "testKey".getBytes();
        byte[] valueToDigest = "testValue".getBytes();
        byte[] expectedResult = new HmacUtils(HmacAlgorithms.HMAC_SHA_1, key).hmac(valueToDigest);
        byte[] actualResult = HmacUtils.hmacSha1(key, valueToDigest);
        assertArrayEquals(expectedResult, actualResult);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetHmacSha1_WLKD0() throws NoSuchAlgorithmException, InvalidKeyException {
        byte[] key = "testKey".getBytes();
        Mac mac = HmacUtils.getHmacSha1(key);
        assertNotNull(mac);
        assertEquals("HmacSHA1", mac.getAlgorithm());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testUpdateHmac_cUxn0() throws NoSuchAlgorithmException, InvalidKeyException {
        Mac mac = Mac.getInstance("HmacSHA256");
        SecretKeySpec secretKeySpec = new SecretKeySpec("my-secret-key".getBytes(), "HmacSHA256");
        mac.init(secretKeySpec);
        byte[] valueToDigest = "hello world".getBytes();
        Mac updatedMac = HmacUtils.updateHmac(mac, valueToDigest);
        assertNotNull(updatedMac);
        assertEquals(mac, updatedMac);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHmacMd5_shaF0() {
        String key = "testKey";
        String valueToDigest = "testValue";
        byte[] expected = new HmacUtils(HmacAlgorithms.HMAC_MD5, key).hmac(valueToDigest);
        byte[] actual = HmacUtils.hmacMd5(key, valueToDigest);
        assertNotNull(actual);
        assertArrayEquals(expected, actual);
    }
}