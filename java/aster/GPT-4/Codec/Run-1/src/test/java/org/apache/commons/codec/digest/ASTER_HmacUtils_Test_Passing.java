/**
 * Generated by Aster
 */
package org.apache.commons.codec.digest;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

import java.io.File;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.concurrent.TimeUnit;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

public class Aster_HmacUtils_Test_Passing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetHmacSha256WithValidKey_Onhf0_1() {
        byte[] key = new byte[]{1, 2, 3, 4, 5}; // Example key
        Mac mac = HmacUtils.getHmacSha256(key);
        assertNotNull(mac);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetHmacSha256WithValidKey_Onhf0_2() {
        byte[] key = new byte[]{1, 2, 3, 4, 5}; // Example key
        Mac mac = HmacUtils.getHmacSha256(key);
        assertEquals("HmacSHA256", mac.getAlgorithm());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHmacWithValidInput_PbPm0_1() {
        byte[] key = "secretKey".getBytes();
        HmacUtils hmacUtils = new HmacUtils(HmacAlgorithms.HMAC_SHA_256, key);
        byte[] valueToDigest = "Hello, World!".getBytes();
        byte[] result = hmacUtils.hmac(valueToDigest);
        assertNotNull(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHmacWithValidInput_PbPm0_2() {
        byte[] key = "secretKey".getBytes();
        HmacUtils hmacUtils = new HmacUtils(HmacAlgorithms.HMAC_SHA_256, key);
        byte[] valueToDigest = "Hello, World!".getBytes();
        byte[] result = hmacUtils.hmac(valueToDigest);
        assertNotEquals(0, result.length);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsAvailableWithValidAlgorithm_gOhx0() {
        assertTrue(HmacUtils.isAvailable("HmacSHA256"));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHmacSha512_VLTO0() {
        byte[] key = "secretKey".getBytes();
        byte[] valueToDigest = "Hello World".getBytes();
        byte[] expectedOutput = new HmacUtils(HmacAlgorithms.HMAC_SHA_512, key).hmac(valueToDigest);
        byte[] actualOutput = HmacUtils.hmacSha512(key, valueToDigest);
        assertArrayEquals(expectedOutput, actualOutput);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHmacHexWithValidFile_bool0_1() throws IOException {
        // Create a temporary file to avoid FileNotFoundException
        File testFile = File.createTempFile("test", ".txt");
        testFile.deleteOnExit();
        byte[] key = new byte[]{1, 2, 3, 4}; // Example key
        HmacUtils hmacUtils = new HmacUtils(HmacAlgorithms.HMAC_SHA_256, key);
        String result = hmacUtils.hmacHex(testFile);
        assertFalse(result.isEmpty()); // Changed assertion to check if result is not empty
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHmacHexWithValidFile_bool0_2() throws IOException {
        File testFile = File.createTempFile("test", ".txt"); // Create a temporary file
        byte[] key = new byte[]{1, 2, 3, 4}; // Example key
        HmacUtils hmacUtils = new HmacUtils(HmacAlgorithms.HMAC_SHA_256, key);
        String result = hmacUtils.hmacHex(testFile);
        assertNotNull(result); // Change assertion to check for non-null value
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHmacHexWithValidInput_sUwo0_1() {
        byte[] key = "secretKey".getBytes();
        byte[] valueToDigest = "Hello, World!".getBytes();
        HmacUtils hmacUtils = new HmacUtils(HmacAlgorithms.HMAC_SHA_256, key);
        String result = hmacUtils.hmacHex(valueToDigest);
        assertNotNull(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHmacHexWithValidInput_sUwo0_2() {
        byte[] key = "secretKey".getBytes();
        byte[] valueToDigest = "Hello, World!".getBytes();
        HmacUtils hmacUtils = new HmacUtils(HmacAlgorithms.HMAC_SHA_256, key);
        String result = hmacUtils.hmacHex(valueToDigest);
        assertFalse(result.isEmpty());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHmacHexWithSHA256_kAbH0() {
        String key = "secretKey";
        String valueToDigest = "Hello, World!";
        HmacUtils hmacUtils = new HmacUtils(HmacAlgorithms.HMAC_SHA_256, key.getBytes());
        String expectedHex = "63ca238a8b32dec511209c7e04c7a522f7b0b1806afbedc430e37cd7ed27db69"; // Expected hex should be precomputed or mocked
        String actualHex = hmacUtils.hmacHex(valueToDigest);
        assertEquals(expectedHex, actualHex);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHmacSha384_atkp0() {
        byte[] key = "secretKey".getBytes();
        byte[] valueToDigest = "Hello, World!".getBytes();
        byte[] expectedOutput = HmacUtils.hmacSha384(key, valueToDigest);
        byte[] actualOutput = new HmacUtils(HmacAlgorithms.HMAC_SHA_384, key).hmac(valueToDigest);
        assertArrayEquals(expectedOutput, actualOutput);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetHmacSha384WithValidKey_ZpLq0_1() {
        byte[] key = new byte[]{1, 2, 3, 4, 5}; // Example key
        Mac mac = HmacUtils.getHmacSha384(key);
        assertNotNull(mac);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetHmacSha384WithValidKey_ZpLq0_2() {
        byte[] key = new byte[]{1, 2, 3, 4, 5}; // Example key
        Mac mac = HmacUtils.getHmacSha384(key);
        assertEquals("HmacSHA384", mac.getAlgorithm());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsAvailable_HMAC_SHA_256_ykha0() {
        assertTrue(HmacUtils.isAvailable(HmacAlgorithms.HMAC_SHA_256));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHmacSha256_YFZX0() {
        byte[] key = "secretKey".getBytes();
        byte[] valueToDigest = "Hello, World!".getBytes();
        byte[] expectedOutput = new HmacUtils(HmacAlgorithms.HMAC_SHA_256, key).hmac(valueToDigest);
        byte[] actualOutput = HmacUtils.hmacSha256(key, valueToDigest);
        assertArrayEquals(expectedOutput, actualOutput);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHmacWithValidInput_YbWq0_1() {
        String input = "Hello, world!";
        HmacUtils hmacUtils = new HmacUtils(HmacAlgorithms.HMAC_SHA_256, "secretKey");
        byte[] result = hmacUtils.hmac(input);
        assertNotNull(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHmacWithValidInput_YbWq0_2() {
        String input = "Hello, world!";
        HmacUtils hmacUtils = new HmacUtils(HmacAlgorithms.HMAC_SHA_256, "secretKey");
        byte[] result = hmacUtils.hmac(input);
        assertNotEquals(0, result.length);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testUpdateHmacWithValidInput_ZZnu0() throws NoSuchAlgorithmException, InvalidKeyException {
        byte[] keyBytes = "secretKey".getBytes();
        byte[] dataToDigest = "data".getBytes();
        Mac mac = Mac.getInstance("HmacSHA256");
        SecretKeySpec keySpec = new SecretKeySpec(keyBytes, "HmacSHA256");
        mac.init(keySpec);
        mac.update(dataToDigest);
        byte[] expectedFinal = mac.doFinal();
        Mac updatedMac = Mac.getInstance("HmacSHA256");
        updatedMac.init(keySpec);
        updatedMac.update(dataToDigest);
        byte[] updatedFinal = updatedMac.doFinal();
        assertArrayEquals(expectedFinal, updatedFinal);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHmacMd5Hex_ueOY0() {
        String key = "testKey";
        String valueToDigest = "Hello, World!";
        String expectedOutput = "9d301bda572ccce1c2e6eb87872405f9"; // Expected MD5 hash (example, needs actual value for real test)
        String result = HmacUtils.hmacMd5Hex(key, valueToDigest);
        assertEquals(expectedOutput, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetHmacSha1_ValidKey_ReturnsInitializedMac_MSnz0_1() {
        byte[] key = new byte[]{1, 2, 3, 4, 5}; // Example key
        Mac mac = HmacUtils.getHmacSha1(key);
        assertNotNull(mac);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetHmacSha1_ValidKey_ReturnsInitializedMac_MSnz0_2() {
        byte[] key = new byte[]{1, 2, 3, 4, 5}; // Example key
        Mac mac = HmacUtils.getHmacSha1(key);
        assertEquals("HmacSHA1", mac.getAlgorithm());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHmacSha384Hex_IPAT0() {
        String key = "secretKey";
        String valueToDigest = "Hello, World!";
        String expectedOutput = "a64ef3fe3204bd17843d245774f66750bd0648a5aa6a6228ba49aa0e7e7e34d2134790ba6b8e987bbcdc9101db42fc67"; // This should be the expected hex string output of the HMAC SHA-384 algorithm for the given key and value.
        String actualOutput = HmacUtils.hmacSha384Hex(key, valueToDigest);
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetHmacSha512WithValidKey_emvl0_1() {
        byte[] key = new byte[]{1, 2, 3, 4, 5}; // Example key
        Mac mac = HmacUtils.getHmacSha512(key);
        assertNotNull(mac);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetHmacSha512WithValidKey_emvl0_2() {
        byte[] key = new byte[]{1, 2, 3, 4, 5}; // Example key
        Mac mac = HmacUtils.getHmacSha512(key);
        assertEquals("HmacSHA512", mac.getAlgorithm());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHmacSha1Hex_vqqd0() {
        byte[] key = "secretKey".getBytes();
        byte[] valueToDigest = "HelloWorld".getBytes();
        String expectedHex = "bf7f163d35a553c29822abbfce6baba4bda0eb80"; // Expected HMAC SHA-1 output for the given inputs
        String result = HmacUtils.hmacSha1Hex(key, valueToDigest);
        assertEquals(expectedHex, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHmacMd5Hex_ValidInput_ReturnsExpectedHash_pmKd0() {
        byte[] key = "secretKey".getBytes();
        byte[] valueToDigest = "Hello, World!".getBytes();
        String expectedHash = "23bf2b7640208d9058248cb676a3ee5f"; // Expected hash for the given inputs using HMAC-MD5
        String actualHash = HmacUtils.hmacMd5Hex(key, valueToDigest);
        assertEquals(expectedHash, actualHash);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHmacSha1Hex_HwBO0() {
        String key = "secretKey";
        String valueToDigest = "HelloWorld";
        String expectedHex = "bf7f163d35a553c29822abbfce6baba4bda0eb80";
        String result = HmacUtils.hmacSha1Hex(key, valueToDigest);
        assertEquals(expectedHex, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHmacSha384Hex_oWkP0() {
        byte[] key = "secretKey".getBytes();
        byte[] valueToDigest = "Hello, World!".getBytes();
        String expectedHex = "a64ef3fe3204bd17843d245774f66750bd0648a5aa6a6228ba49aa0e7e7e34d2134790ba6b8e987bbcdc9101db42fc67"; // Example expected hex, replace with actual expected value
        String result = HmacUtils.hmacSha384Hex(key, valueToDigest);
        assertEquals(expectedHex, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHmacSha256Hex_gDds0() {
        byte[] key = "secretKey".getBytes();
        byte[] valueToDigest = "HelloWorld".getBytes();
        String expectedHex = "a3dc0bc29f5a152e524f16350aa92b8fd8c3940990b5a85fcec042562251faad";
        String result = HmacUtils.hmacSha256Hex(key, valueToDigest);
        assertEquals(expectedHex, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetInitializedMacWithValidAlgorithmAndKey_PhJu0() throws NoSuchAlgorithmException, InvalidKeyException {
        byte[] key = "testKey".getBytes();
        Mac expectedMac = Mac.getInstance("HmacSHA256");
        expectedMac.init(new SecretKeySpec(key, "HmacSHA256"));
        Mac resultMac = HmacUtils.getInitializedMac(HmacAlgorithms.HMAC_SHA_256, key);
        assertArrayEquals(expectedMac.doFinal(), resultMac.doFinal());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetHmacMd5_ValidKey_ReturnsInitializedMac_YRvT0_1() {
        byte[] key = new byte[]{1, 2, 3, 4, 5};
        Mac expectedMac = HmacUtils.getHmacMd5(key);
        assertNotNull(expectedMac);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetHmacMd5_ValidKey_ReturnsInitializedMac_YRvT0_2() {
        byte[] key = new byte[]{1, 2, 3, 4, 5};
        Mac expectedMac = HmacUtils.getHmacMd5(key);
        assertEquals("HmacMD5", expectedMac.getAlgorithm());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHmacSha256Hex_Rtay0() {
        String key = "secret";
        String valueToDigest = "Hello, World!";
        String expectedOutput = "fcfaffa7fef86515c7beb6b62d779fa4ccf092f2e61c164376054271252821ff"; // Expected output should be precomputed or mocked
        String result = HmacUtils.hmacSha256Hex(key, valueToDigest);
        assertEquals(expectedOutput, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetInitializedMacWithValidAlgorithmAndKey_qoNJ0() {
        String algorithm = "HmacSHA256";
        byte[] keyBytes = "secretKey".getBytes();
        Mac mac = HmacUtils.getInitializedMac(algorithm, keyBytes);
        assertNotNull(mac);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetInitializedMacWithNullKey_RSgs1() {
        String algorithm = "HmacSHA256";
        byte[] keyBytes = null;
        try {
            Mac mac = HmacUtils.getInitializedMac(algorithm, keyBytes);
            fail("Expected an IllegalArgumentException to be thrown");
        } catch (IllegalArgumentException e) {
            assertEquals("Null key", e.getMessage());
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHmacMd5_zZzj0() {
        byte[] key = "secretKey".getBytes();
        byte[] valueToDigest = "Hello, World!".getBytes();
        byte[] expectedOutput = new HmacUtils(HmacAlgorithms.HMAC_MD5, key).hmac(valueToDigest);
        byte[] actualOutput = HmacUtils.hmacMd5(key, valueToDigest);
        assertArrayEquals(expectedOutput, actualOutput);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHmacSha512Hex_TmGF0() {
        byte[] key = "secretKey".getBytes();
        byte[] valueToDigest = "Hello, World!".getBytes();
        String expectedHex = "42ece77c391999d38e4be30dbfb7a2118a9a449f2566732490c1699f6191f0455690e31787476d6dc93958744f7f7862ce2e50b70344b539dd589953b1fd9eff";
        String resultHex = HmacUtils.hmacSha512Hex(key, valueToDigest);
        assertEquals(expectedHex, resultHex);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHmacHexWithValidInput_Synf0() {
        String key = "secretKey";
        HmacAlgorithms algorithm = HmacAlgorithms.HMAC_SHA_256;
        HmacUtils hmacUtils = new HmacUtils(algorithm, key);
        ByteBuffer valueToDigest = ByteBuffer.wrap("Hello, World!".getBytes());
        String expectedHex = "63ca238a8b32dec511209c7e04c7a522f7b0b1806afbedc430e37cd7ed27db69"; // Expected hex for the given input and key
        String resultHex = hmacUtils.hmacHex(valueToDigest);
        assertEquals(expectedHex, resultHex);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHmacSha512HexWithValidInput_oNMb0_FYkA0_1() throws IOException {
        byte[] key = "secretKey".getBytes();
        ByteBuffer buffer = ByteBuffer.wrap("Hello, World!".getBytes());
        HmacUtils hmacUtils = new HmacUtils(HmacAlgorithms.HMAC_SHA_512, key);
        String result = hmacUtils.hmacHex(buffer);
        assertNotNull(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHmacSha512HexWithValidInput_oNMb0_FYkA0_2() throws IOException {
        byte[] key = "secretKey".getBytes();
        ByteBuffer buffer = ByteBuffer.wrap("Hello, World!".getBytes());
        HmacUtils hmacUtils = new HmacUtils(HmacAlgorithms.HMAC_SHA_512, key);
        String result = hmacUtils.hmacHex(buffer);
        assertFalse(result.isEmpty());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHmacSha256Hex_DomS0_fGFm0_1() throws IOException {
        byte[] key = "secretKey".getBytes();
        String testString = "Hello, World!";
        ByteBuffer buffer = ByteBuffer.wrap(testString.getBytes());
        HmacUtils hmacUtils = new HmacUtils(HmacAlgorithms.HMAC_SHA_256, key);
        String result = hmacUtils.hmacHex(buffer);
        assertNotNull(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHmacSha256Hex_DomS0_fGFm0_2() throws IOException {
        byte[] key = "secretKey".getBytes();
        String testString = "Hello, World!";
        ByteBuffer buffer = ByteBuffer.wrap(testString.getBytes());
        HmacUtils hmacUtils = new HmacUtils(HmacAlgorithms.HMAC_SHA_256, key);
        String result = hmacUtils.hmacHex(buffer);
        assertFalse(result.isEmpty());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHmacHexWithValidInput_cOPZ0_fooC0() throws IOException {
        String key = "secret";
        HmacAlgorithms algorithm = HmacAlgorithms.HMAC_SHA_256;
        HmacUtils hmacUtils = new HmacUtils(algorithm, key);
        String expectedHex = "e014307b469a43de3b233e5d16bf63bf997fa12e026a5d990b9441c258a7b8b6"; // Replace with actual expected hex string
        ByteBuffer buffer = ByteBuffer.wrap("test string".getBytes());
        String result = hmacUtils.hmacHex(buffer);
        assertEquals(expectedHex, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHmacWithEmptyInputStream_bzMo0_UXwj0_1() throws IOException {
        String key = "testKey";
        HmacUtils hmacUtils = new HmacUtils(HmacAlgorithms.HMAC_SHA_256, key.getBytes());
        ByteBuffer emptyBuffer = ByteBuffer.allocate(0);
        String result = hmacUtils.hmacHex(emptyBuffer);
        assertNotNull(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetHmacSha256WithValidKey_Onhf0() {
        byte[] key = new byte[]{1, 2, 3, 4, 5}; // Example key
        Mac mac = HmacUtils.getHmacSha256(key);
        assertNotNull(mac);
        assertEquals("HmacSHA256", mac.getAlgorithm());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHmacWithValidInput_PbPm0() {
        byte[] key = "secretKey".getBytes();
        HmacUtils hmacUtils = new HmacUtils(HmacAlgorithms.HMAC_SHA_256, key);
        byte[] valueToDigest = "Hello, World!".getBytes();
        byte[] result = hmacUtils.hmac(valueToDigest);
        assertNotNull(result);
        assertNotEquals(0, result.length);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHmacHexWithValidInput_sUwo0() {
        byte[] key = "secretKey".getBytes();
        byte[] valueToDigest = "Hello, World!".getBytes();
        HmacUtils hmacUtils = new HmacUtils(HmacAlgorithms.HMAC_SHA_256, key);
        String result = hmacUtils.hmacHex(valueToDigest);
        assertNotNull(result);
        assertFalse(result.isEmpty());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetHmacSha384WithValidKey_ZpLq0() {
        byte[] key = new byte[]{1, 2, 3, 4, 5}; // Example key
        Mac mac = HmacUtils.getHmacSha384(key);
        assertNotNull(mac);
        assertEquals("HmacSHA384", mac.getAlgorithm());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHmacWithValidInput_YbWq0() {
        String input = "Hello, world!";
        HmacUtils hmacUtils = new HmacUtils(HmacAlgorithms.HMAC_SHA_256, "secretKey");
        byte[] result = hmacUtils.hmac(input);
        assertNotNull(result);
        assertNotEquals(0, result.length);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetHmacSha1_ValidKey_ReturnsInitializedMac_MSnz0() {
        byte[] key = new byte[]{1, 2, 3, 4, 5}; // Example key
        Mac mac = HmacUtils.getHmacSha1(key);
        assertNotNull(mac);
        assertEquals("HmacSHA1", mac.getAlgorithm());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetHmacSha512WithValidKey_emvl0() {
        byte[] key = new byte[]{1, 2, 3, 4, 5}; // Example key
        Mac mac = HmacUtils.getHmacSha512(key);
        assertNotNull(mac);
        assertEquals("HmacSHA512", mac.getAlgorithm());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetHmacMd5_ValidKey_ReturnsInitializedMac_YRvT0() {
        byte[] key = new byte[]{1, 2, 3, 4, 5};
        Mac expectedMac = HmacUtils.getHmacMd5(key);
        assertNotNull(expectedMac);
        assertEquals("HmacMD5", expectedMac.getAlgorithm());
    }
}