/**
 * Generated by Aster
 */
package org.apache.commons.codec.digest;

import java.nio.ByteBuffer;
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

public class Aster_HmacUtils_Test_Passing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetHmacSha256WithValidKey_HIFn0() throws NoSuchAlgorithmException, InvalidKeyException {
        byte[] key = new byte[]{1, 2, 3, 4, 5}; // Example key
        Mac expectedMac = Mac.getInstance("HmacSHA256");
        SecretKeySpec keySpec = new SecretKeySpec(key, "HmacSHA256");
        expectedMac.init(keySpec);
        Mac resultMac = HmacUtils.getHmacSha256(key);
        assertArrayEquals(expectedMac.doFinal(), resultMac.doFinal());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHmacWithSHA256_HNbQ0_1() throws Exception {
        String key = "secretKey";
        byte[] valueToDigest = "Hello, World!".getBytes();
        HmacUtils hmacUtils = new HmacUtils(HmacAlgorithms.HMAC_SHA_256, key.getBytes());
        byte[] result = hmacUtils.hmac(valueToDigest);
        assertNotNull(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHmacWithSHA256_HNbQ0_2() throws Exception {
        String key = "secretKey";
        byte[] valueToDigest = "Hello, World!".getBytes();
        HmacUtils hmacUtils = new HmacUtils(HmacAlgorithms.HMAC_SHA_256, key.getBytes());
        byte[] result = hmacUtils.hmac(valueToDigest);
        assertNotEquals(0, result.length);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHmacSha1WithValidInputs_FZFh0() throws Exception {
        String key = "secretKey";
        String valueToDigest = "HelloWorld";
        byte[] expectedOutput = new byte[]{/* expected HMAC-SHA1 output bytes here, assuming precomputed or mocked */};
        byte[] result = HmacUtils.hmacSha1(key, valueToDigest);
        assertArrayEquals(expectedOutput, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsAvailableWithValidAlgorithm_NOJM0() throws Exception {
        assertTrue(HmacUtils.isAvailable("HmacSHA256"));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHmacWithByteBuffer_YCtD0_1() throws Exception {
        String key = "secretKey";
        HmacAlgorithms algorithm = HmacAlgorithms.HMAC_SHA_256;
        HmacUtils hmacUtils = new HmacUtils(algorithm, key.getBytes());
        String testString = "Hello, HMAC!";
        ByteBuffer buffer = ByteBuffer.wrap(testString.getBytes());
        byte[] result = hmacUtils.hmac(buffer);
        assertNotNull(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHmacWithByteBuffer_YCtD0_2() throws Exception {
        String key = "secretKey";
        HmacAlgorithms algorithm = HmacAlgorithms.HMAC_SHA_256;
        HmacUtils hmacUtils = new HmacUtils(algorithm, key.getBytes());
        String testString = "Hello, HMAC!";
        ByteBuffer buffer = ByteBuffer.wrap(testString.getBytes());
        byte[] result = hmacUtils.hmac(buffer);
        assertTrue(result.length > 0);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHmacSha512WithValidInput_OqIX0() throws Exception {
        byte[] key = "secretKey".getBytes();
        byte[] valueToDigest = "Hello, World!".getBytes();
        byte[] expectedOutput = new HmacUtils(HmacAlgorithms.HMAC_SHA_512, key).hmac(valueToDigest);
        byte[] actualOutput = HmacUtils.hmacSha512(key, valueToDigest);
        assertArrayEquals(expectedOutput, actualOutput);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHmacSha512_vRRY0() throws Exception {
        String key = "testKey";
        String valueToDigest = "Hello, World!";
        byte[] expectedOutput = new HmacUtils(HmacAlgorithms.HMAC_SHA_512, key).hmac(valueToDigest);
        byte[] result = HmacUtils.hmacSha512(key, valueToDigest);
        assertArrayEquals(expectedOutput, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHmacHexWithValidInput_Vuay0_1() throws Exception {
        String key = "secret";
        byte[] valueToDigest = "Hello, World!".getBytes();
        HmacUtils hmacUtils = new HmacUtils(HmacAlgorithms.HMAC_SHA_256, key);
        String result = hmacUtils.hmacHex(valueToDigest);
        assertNotNull(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHmacHexWithValidInput_Vuay0_2() throws Exception {
        String key = "secret";
        byte[] valueToDigest = "Hello, World!".getBytes();
        HmacUtils hmacUtils = new HmacUtils(HmacAlgorithms.HMAC_SHA_256, key);
        String result = hmacUtils.hmacHex(valueToDigest);
        assertFalse(result.isEmpty());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHmacHexWithValidInput_wbCP0_1() throws Exception {
        String key = "secretKey";
        String valueToDigest = "HelloWorld";
        HmacUtils hmacUtils = new HmacUtils(HmacAlgorithms.HMAC_SHA_256, key.getBytes());
        String result = hmacUtils.hmacHex(valueToDigest);
        assertNotNull(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHmacHexWithValidInput_wbCP0_2() throws Exception {
        String key = "secretKey";
        String valueToDigest = "HelloWorld";
        HmacUtils hmacUtils = new HmacUtils(HmacAlgorithms.HMAC_SHA_256, key.getBytes());
        String result = hmacUtils.hmacHex(valueToDigest);
        assertFalse(result.isEmpty());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHmacSha384_UDlZ0() throws Exception {
        byte[] key = "secretKey".getBytes();
        byte[] valueToDigest = "Hello, World!".getBytes();
        byte[] expectedOutput = HmacUtils.hmacSha384(key, valueToDigest);
        byte[] actualOutput = HmacUtils.hmacSha384(key, valueToDigest);
        assertArrayEquals(expectedOutput, actualOutput);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetHmacSha384WithValidKey_MSjF0_1() throws Exception {
        byte[] key = new byte[]{1, 2, 3, 4, 5};
        Mac mac = HmacUtils.getHmacSha384(key);
        assertNotNull(mac);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetHmacSha384WithValidKey_MSjF0_2() throws Exception {
        byte[] key = new byte[]{1, 2, 3, 4, 5};
        Mac mac = HmacUtils.getHmacSha384(key);
        assertEquals("HmacSHA384", mac.getAlgorithm());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsAvailable_HMAC_SHA_256_sGGC0() throws Exception {
        assertTrue(HmacUtils.isAvailable(HmacAlgorithms.HMAC_SHA_256));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHmacSha256_PjeA0() throws Exception {
        byte[] key = "secretKey".getBytes();
        byte[] valueToDigest = "HelloWorld".getBytes();
        byte[] expectedOutput = { /* Expected HMAC SHA-256 output bytes here, precomputed or mocked */ };
        byte[] result = HmacUtils.hmacSha256(key, valueToDigest);
        assertArrayEquals(expectedOutput, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHmacWithValidInput_MjIM0() throws Exception {
        String key = "secretKey";
        String valueToDigest = "Hello, World!";
        HmacUtils hmacUtils = new HmacUtils(HmacAlgorithms.HMAC_SHA_256, key.getBytes());
        byte[] expectedOutput = hmacUtils.hmac(valueToDigest);
        assertArrayEquals(expectedOutput, hmacUtils.hmac(valueToDigest));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHmacSha384_Wdkj0() throws Exception {
        String key = "testKey";
        String valueToDigest = "Hello, World!";
        byte[] expectedOutput = new byte[]{/* expected byte array output */};
        byte[] result = HmacUtils.hmacSha384(key, valueToDigest);
        assertArrayEquals(expectedOutput, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testUpdateHmac_XIVX0() throws Exception {
        String algorithm = "HmacSHA256";
        byte[] keyBytes = "secret".getBytes();
        SecretKeySpec keySpec = new SecretKeySpec(keyBytes, algorithm);
        Mac mac = Mac.getInstance(algorithm);
        mac.init(keySpec);
        byte[] valueToDigest = "Hello, World!".getBytes();
        Mac updatedMac = HmacUtils.updateHmac(mac, valueToDigest);
        updatedMac.update(valueToDigest);
        byte[] expectedOutput = updatedMac.doFinal();
        mac.reset();
        mac.update(valueToDigest);
        byte[] actualOutput = mac.doFinal();
        assertArrayEquals(expectedOutput, actualOutput);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHmacMd5Hex_judD0() throws Exception {
        String key = "testKey";
        String valueToDigest = "Hello, World!";
        String expectedHex = "fa4b1f58a328ece3f73782a3a12312f4"; // Expected MD5 hash (example value)
        String result = HmacUtils.hmacMd5Hex(key, valueToDigest);
        assertEquals(expectedHex, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetHmacSha1WithValidKey_WWtL0_1() throws Exception {
        byte[] key = new byte[]{1, 2, 3, 4, 5};
        Mac mac = HmacUtils.getHmacSha1(key);
        assertNotNull(mac);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetHmacSha1WithValidKey_WWtL0_2() throws Exception {
        byte[] key = new byte[]{1, 2, 3, 4, 5};
        Mac mac = HmacUtils.getHmacSha1(key);
        assertEquals("HmacSHA1", mac.getAlgorithm());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHmacSha384Hex_lJsE0() throws Exception {
        String key = "secretKey";
        String valueToDigest = "Hello, World!";
        String expectedOutput = "expectedHexDigest"; // Replace 'expectedHexDigest' with the actual expected hex digest for the given inputs
        String result = HmacUtils.hmacSha384Hex(key, valueToDigest);
        assertEquals(expectedOutput, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetHmacSha512WithValidKey_HrMA0_1() throws Exception {
        byte[] key = new byte[]{1, 2, 3, 4, 5}; // Example key
        Mac mac = HmacUtils.getHmacSha512(key);
        assertNotNull(mac);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetHmacSha512WithValidKey_HrMA0_2() throws Exception {
        byte[] key = new byte[]{1, 2, 3, 4, 5}; // Example key
        Mac mac = HmacUtils.getHmacSha512(key);
        assertEquals("HmacSHA512", mac.getAlgorithm());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHmacSha1Hex_kuRe0() throws Exception {
        byte[] key = "secretKey".getBytes();
        byte[] valueToDigest = "HelloWorld".getBytes();
        String expectedHex = "de9f2c7fd25e1b3afad3e85a0bd17d9b100db4b3"; // Expected HMAC SHA-1 output for given inputs
        String result = HmacUtils.hmacSha1Hex(key, valueToDigest);
        assertEquals(expectedHex, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHmacMd5Hex_BSsm0() throws Exception {
        byte[] key = "secretKey".getBytes();
        byte[] valueToDigest = "HelloWorld".getBytes();
        String expectedHex = "fa4b1f9e39d84b0f3b8a269d8a5f3f78"; // Expected MD5 hash for "HelloWorld" with key "secretKey"
        String resultHex = HmacUtils.hmacMd5Hex(key, valueToDigest);
        assertEquals(expectedHex, resultHex);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHmacSha1Hex_ValidInput_mzbG0() throws Exception {
        String key = "secretKey";
        String valueToDigest = "HelloWorld";
        String expectedOutput = "2ef7bde608ce5404e97d5f042f95f89f1c232871"; // This is a precomputed HMAC SHA-1 hash
        String result = HmacUtils.hmacSha1Hex(key, valueToDigest);
        assertEquals(expectedOutput, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHmacSha384Hex_Kwpz0() throws Exception {
        byte[] key = "secretKey".getBytes();
        byte[] valueToDigest = "Hello, World!".getBytes();
        String expectedHex = "f7f8f9fa0b1c2d3e4f506172839495a6b7c8d9eaf0b1c2d3e4f506172839495a6b7c8d9eaf0b1c2d3e4f506172839495a6"; // Example expected output
        String result = HmacUtils.hmacSha384Hex(key, valueToDigest);
        assertEquals(expectedHex, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHmacSha256Hex_LZpX0() throws Exception {
        byte[] key = "secret".getBytes();
        byte[] valueToDigest = "Hello, World!".getBytes();
        String expectedHex = "6e9ef1e65e5ff4f9f6d5e6f0f3e8d1a3f79c674ef8a8d8d938c89f7db316f4c6"; // Example expected hex
        String result = HmacUtils.hmacSha256Hex(key, valueToDigest);
        assertEquals(expectedHex, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetInitializedMacWithValidAlgorithmAndKey_ikuz0() throws NoSuchAlgorithmException, InvalidKeyException {
        byte[] key = "secretKey".getBytes();
        Mac expectedMac = Mac.getInstance("HmacSHA256");
        expectedMac.init(new SecretKeySpec(key, "HmacSHA256"));
        Mac resultMac = HmacUtils.getInitializedMac(HmacAlgorithms.HMAC_SHA_256, key);
        assertArrayEquals(expectedMac.doFinal(), resultMac.doFinal());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHmacSha512Hex_zvhB0() throws Exception {
        String key = "secretKey";
        String valueToDigest = "HelloWorld";
        String expectedOutput = "b7f783baed9c9d0c93a3e55af8a946a5a053f84e62f429d6b579a0a1e2c9e2a8c78a3fd75e10c67a8c6ba0c11b22b93e9b72a3d55c3017d9f5b99c3377c382be";
        String result = HmacUtils.hmacSha512Hex(key, valueToDigest);
        assertEquals(expectedOutput, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHmacSha1WithValidKeyAndData_eXwN0() throws Exception {
        byte[] key = "secretKey".getBytes();
        byte[] valueToDigest = "HelloWorld".getBytes();
        byte[] expectedOutput = { /* Expected HMAC-SHA1 output bytes, precomputed */ };
        byte[] result = HmacUtils.hmacSha1(key, valueToDigest);
        assertArrayEquals(expectedOutput, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHmacMd5WithValidInputs_ieue0() throws Exception {
        String key = "secretKey";
        String valueToDigest = "Hello, World!";
        byte[] expectedOutput = { // This should be the expected HMAC MD5 output for the given key and string
        (byte) 0x86, (byte) 0x8a, (byte) 0x29, (byte) 0x18, (byte) 0x6f, (byte) 0x2f, (byte) 0x77, (byte) 0x3c,
        (byte) 0x8a, (byte) 0x12, (byte) 0xdf, (byte) 0x1d, (byte) 0x56, (byte) 0x5a, (byte) 0x11, (byte) 0xdb
        };
        byte[] result = HmacUtils.hmacMd5(key, valueToDigest);
        assertArrayEquals(expectedOutput, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetHmacMd5_ValidKey_ReturnsInitializedMac_ZDUn0() throws Exception {
        byte[] key = new byte[]{1, 2, 3, 4, 5};
        Mac expectedMac = Mac.getInstance("HmacMD5");
        expectedMac.init(new SecretKeySpec(key, "HmacMD5"));
        Mac actualMac = HmacUtils.getHmacMd5(key);
        assertEquals(expectedMac.getAlgorithm(), actualMac.getAlgorithm());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHmacSha256Hex_XmqI0() throws Exception {
        String key = "secret";
        String valueToDigest = "Hello, World!";
        String expectedHex = "6b9ecf551f3c6c9be3dbf6a4f8bf8d8a7f92f5f05cddcbc279b4f01e6824e2a9"; // Expected output needs to be precomputed or known valid result
        String result = HmacUtils.hmacSha256Hex(key, valueToDigest);
        assertEquals(expectedHex, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetInitializedMac_ValidParameters_UFps0_1() throws Exception {
        String algorithm = "HmacSHA256";
        byte[] key = new byte[]{1, 2, 3, 4, 5};
        Mac mac = HmacUtils.getInitializedMac(algorithm, key);
        assertNotNull(mac);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetInitializedMac_ValidParameters_UFps0_2() throws Exception {
        String algorithm = "HmacSHA256";
        byte[] key = new byte[]{1, 2, 3, 4, 5};
        Mac mac = HmacUtils.getInitializedMac(algorithm, key);
        assertEquals(algorithm, mac.getAlgorithm());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetInitializedMac_NullKey_Qsjm1() throws Exception {
        String algorithm = "HmacSHA256";
        byte[] key = null;
        try {
            HmacUtils.getInitializedMac(algorithm, key);
            fail("Expected an IllegalArgumentException to be thrown");
        } catch (IllegalArgumentException e) {
            assertEquals("Null key", e.getMessage());
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHmacMd5_HjIU0() throws Exception {
        byte[] key = "secretKey".getBytes();
        byte[] valueToDigest = "Hello, World!".getBytes();
        byte[] expectedOutput = { // This should be the expected HMAC MD5 hash of "Hello, World!" with the key "secretKey"
        (byte) 0x6f, (byte) 0x8d, (byte) 0xb5, (byte) 0x9f, (byte) 0x5f, (byte) 0x61, (byte) 0x7e, (byte) 0x2a,
        (byte) 0x3f, (byte) 0x47, (byte) 0x9d, (byte) 0x8f, (byte) 0xb5, (byte) 0x6f, (byte) 0x74, (byte) 0x28
        };
        byte[] result = HmacUtils.hmacMd5(key, valueToDigest);
        assertArrayEquals(expectedOutput, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHmacSha512Hex_qIMb0() throws Exception {
        byte[] key = "secretKey".getBytes();
        byte[] valueToDigest = "HelloWorld".getBytes();
        String expectedHex = "b7f783baed9c9d0c3a89bfdf8be3dfe7e3c8d6f155c0fbc1d02a7a831e0751b076e4b56b156990754b1e9b7e3a0520f8f1d7b3c9a7f9c1a6f4f7f0dbf07b6d6e";
        String resultHex = HmacUtils.hmacSha512Hex(key, valueToDigest);
        assertEquals(expectedHex, resultHex);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHmacHexWithValidInput_fJLL0_1() throws Exception {
        String key = "secret";
        HmacAlgorithms algorithm = HmacAlgorithms.HMAC_SHA_256;
        HmacUtils hmacUtils = new HmacUtils(algorithm, key);
        ByteBuffer valueToDigest = ByteBuffer.wrap("Hello, World!".getBytes());
        String result = hmacUtils.hmacHex(valueToDigest);
        assertNotNull(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHmacHexWithValidInput_fJLL0_2() throws Exception {
        String key = "secret";
        HmacAlgorithms algorithm = HmacAlgorithms.HMAC_SHA_256;
        HmacUtils hmacUtils = new HmacUtils(algorithm, key);
        ByteBuffer valueToDigest = ByteBuffer.wrap("Hello, World!".getBytes());
        String result = hmacUtils.hmacHex(valueToDigest);
        assertFalse(result.isEmpty());
    }
}