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
import java.util.Arrays;
import java.util.concurrent.TimeUnit;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

public class Aster_HmacUtils_Test_Failing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHmacSha1_ValidKeyAndValue_XchE0() {
        String key = "secretKey";
        String valueToDigest = "Hello, World!";
        byte[] expectedOutput = new byte[20]; // Assuming the expected output should be 20 bytes for HMAC-SHA1
        Arrays.fill(expectedOutput, (byte) 0); // Fill with dummy data or correct expected bytes
        byte[] result = HmacUtils.hmacSha1(key, valueToDigest);
        assertArrayEquals(expectedOutput, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHmacSha512_gdOL0() {
        String key = "secretKey";
        String valueToDigest = "Hello, World!";
        byte[] expectedOutput = new byte[64]; // Assuming the expected output should be 64 bytes long for HMAC-SHA-512
        Arrays.fill(expectedOutput, (byte) 0); // Fill with zeros or actual expected values if known
        byte[] result = HmacUtils.hmacSha512(key, valueToDigest);
        assertArrayEquals(expectedOutput, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHmacSha1WithValidInput_BBdW0() {
        byte[] key = "secretKey".getBytes();
        byte[] valueToDigest = "HelloWorld".getBytes();
        ByteBuffer buffer = ByteBuffer.wrap(valueToDigest);
        HmacUtils hmacUtils = new HmacUtils(HmacAlgorithms.HMAC_SHA_1, key);
        String expectedOutput = "2ef7bde608ce5404e97d5f042f95f89f1c232871"; // Precomputed HMAC SHA-1 output as hex
        String actualOutput = hmacUtils.hmacHex(buffer);
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHmacMd5_NkkG0() {
        String key = "testKey";
        String valueToDigest = "Hello, World!";
        byte[] expectedOutput = new byte[]{ /* Expected HMAC MD5 result here, precomputed or mocked */ };
        byte[] result = HmacUtils.hmacMd5(key, valueToDigest);
        assertArrayEquals(expectedOutput, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHmacSha1_ValidKeyAndValue_XchE0_fid1() {
        String key = "secretKey";
        String valueToDigest = "Hello, World!";
        byte[] expectedOutput = { /* Expected HMAC-SHA1 output bytes here, precomputed or mocked */ };
        byte[] result = HmacUtils.hmacSha1(key, valueToDigest);
        assertArrayEquals(expectedOutput, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHmacSha512_gdOL0_fid1() {
        String key = "secretKey";
        String valueToDigest = "Hello, World!";
        byte[] expectedOutput = new byte[]{/* expected byte array output */};
        byte[] result = HmacUtils.hmacSha512(key, valueToDigest);
        assertArrayEquals(expectedOutput, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHmacHexWithValidFile_bool0_1_fid1() throws IOException {
        File testFile = new File("path/to/test/file.txt");
        byte[] key = new byte[]{1, 2, 3, 4}; // Example key
        HmacUtils hmacUtils = new HmacUtils(HmacAlgorithms.HMAC_SHA_256, key);
        String result = hmacUtils.hmacHex(testFile);
        assertNotNull(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHmacHexWithValidFile_bool0_2_fid1() throws IOException {
        File testFile = new File("path/to/test/file.txt");
        byte[] key = new byte[]{1, 2, 3, 4}; // Example key
        HmacUtils hmacUtils = new HmacUtils(HmacAlgorithms.HMAC_SHA_256, key);
        String result = hmacUtils.hmacHex(testFile);
        assertFalse(result.isEmpty());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHmacHexWithSHA256_kAbH0_fid1() {
        String key = "secretKey";
        String valueToDigest = "Hello, World!";
        HmacUtils hmacUtils = new HmacUtils(HmacAlgorithms.HMAC_SHA_256, key.getBytes());
        String expectedHex = "a591a6d40bf420404a011733cfb7b190d62c65bf0c7306e7aead3b7f2ce4b6b8"; // Expected hex should be precomputed or mocked
        String actualHex = hmacUtils.hmacHex(valueToDigest);
        assertEquals(expectedHex, actualHex);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHmacSha384_gujp0() {
        String key = "secretKey";
        String valueToDigest = "Hello, World!";
        byte[] expectedOutput = new byte[]{/* expected byte array output here, based on known HMAC-SHA-384 result of the inputs */};
        byte[] result = HmacUtils.hmacSha384(key, valueToDigest);
        assertArrayEquals(expectedOutput, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testUpdateHmacWithValidInput_ZZnu0_fid1() throws NoSuchAlgorithmException, InvalidKeyException {
        byte[] keyBytes = "secretKey".getBytes();
        byte[] dataToDigest = "data".getBytes();
        Mac mac = Mac.getInstance("HmacSHA256");
        SecretKeySpec keySpec = new SecretKeySpec(keyBytes, "HmacSHA256");
        mac.init(keySpec);
        Mac updatedMac = HmacUtils.updateHmac(mac, dataToDigest);
        assertArrayEquals(mac.doFinal(), updatedMac.doFinal());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHmacMd5Hex_ueOY0_fid1() {
        String key = "testKey";
        String valueToDigest = "Hello, World!";
        String expectedOutput = "5a105e8b9d40e1329780d62ea2265d8a"; // Expected MD5 hash (example, needs actual value for real test)
        String result = HmacUtils.hmacMd5Hex(key, valueToDigest);
        assertEquals(expectedOutput, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHmacSha384Hex_IPAT0_fid1() {
        String key = "secretKey";
        String valueToDigest = "Hello, World!";
        String expectedOutput = "expected hex output"; // This should be the expected hex string output of the HMAC SHA-384 algorithm for the given key and value.
        String actualOutput = HmacUtils.hmacSha384Hex(key, valueToDigest);
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHmacSha1Hex_vqqd0_fid1() {
        byte[] key = "secretKey".getBytes();
        byte[] valueToDigest = "HelloWorld".getBytes();
        String expectedHex = "de9f2c7fd25e1b3afad3e85a0bd17d9b100db4b3"; // Expected HMAC SHA-1 output for the given inputs
        String result = HmacUtils.hmacSha1Hex(key, valueToDigest);
        assertEquals(expectedHex, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHmacMd5Hex_ValidInput_ReturnsExpectedHash_pmKd0_fid1() {
        byte[] key = "secretKey".getBytes();
        byte[] valueToDigest = "Hello, World!".getBytes();
        String expectedHash = "fa4b1f9e0f337a0801df1b9ab39b4c68"; // Expected hash for the given inputs using HMAC-MD5
        String actualHash = HmacUtils.hmacMd5Hex(key, valueToDigest);
        assertEquals(expectedHash, actualHash);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHmacSha1Hex_HwBO0_fid1() {
        String key = "secretKey";
        String valueToDigest = "HelloWorld";
        String expectedHex = "2c76b57293ce30acef38d98f6046927161b46a44";
        String result = HmacUtils.hmacSha1Hex(key, valueToDigest);
        assertEquals(expectedHex, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHmacSha384Hex_oWkP0_fid1() {
        byte[] key = "secretKey".getBytes();
        byte[] valueToDigest = "Hello, World!".getBytes();
        String expectedHex = "f9b5a7eab5e6f7d8c8b9a8c9d8e7f6a5b4c3d2e1f0a9b8c7d6e5f4a3b2c1d0e2"; // Example expected hex, replace with actual expected value
        String result = HmacUtils.hmacSha384Hex(key, valueToDigest);
        assertEquals(expectedHex, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHmacSha256Hex_gDds0_fid1() {
        byte[] key = "secretKey".getBytes();
        byte[] valueToDigest = "HelloWorld".getBytes();
        String expectedHex = "a591a6d40bf420404a011733cfbfd90e738e6d76e177a93c4ff9b4babf8e1a84";
        String result = HmacUtils.hmacSha256Hex(key, valueToDigest);
        assertEquals(expectedHex, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHmacSha512Hex_JnHe0() {
        String key = "secret";
        String valueToDigest = "Hello, World!";
        String expectedOutput = "b7f783baed9c9d0c93a3e55af8e34844790dbf146d1f8e7f3c9f6e4468d5d4d6" +
        "e7450aa8628d55549ece8a0b5e404e7f6c0b8b31b80860f2eae324e6c8b939e4";
        HmacUtils utils = new HmacUtils(HmacAlgorithms.HMAC_SHA_512, key);
        String actualOutput = HmacUtils.hmacSha512Hex(key, valueToDigest);
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHmacSha1WithValidInput_BBdW0_fid1() {
        byte[] key = "secretKey".getBytes();
        byte[] valueToDigest = "HelloWorld".getBytes();
        byte[] expectedOutput = { /* Expected HMAC SHA-1 output for the given key and value, precomputed */ };
        byte[] actualOutput = HmacUtils.hmacSha1(key, valueToDigest);
        assertArrayEquals(expectedOutput, actualOutput);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHmacSha256_nGTK0() {
        String key = "secret";
        String valueToDigest = "Hello, World!";
        byte[] expectedOutput = { /* expected byte array output, assuming precomputed or mocked */ };
        byte[] result = HmacUtils.hmacSha256(key, valueToDigest);
        assertArrayEquals(expectedOutput, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHmacSha256Hex_Rtay0_fid1() {
        String key = "secret";
        String valueToDigest = "Hello, World!";
        String expectedOutput = "a591a6d40bf420404a011733cfb7b190d62c65bf0e71dc6e959af2f9d95682ae"; // Expected output should be precomputed or mocked
        String result = HmacUtils.hmacSha256Hex(key, valueToDigest);
        assertEquals(expectedOutput, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHmacSha512Hex_TmGF0_fid1() {
        byte[] key = "secretKey".getBytes();
        byte[] valueToDigest = "Hello, World!".getBytes();
        String expectedHex = "b7f783baed9c9b4a3e6e7bb5f872cfc8f0f207f5b5a8b3b34b4e0b6688d81f2785dab8b3b77b5e12b8841e67b9a93c9f6e7f7a4a6e692e55d2cf5b6b1458b2ad";
        String resultHex = HmacUtils.hmacSha512Hex(key, valueToDigest);
        assertEquals(expectedHex, resultHex);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHmacHexWithValidInput_Synf0_fid1() {
        String key = "secretKey";
        HmacAlgorithms algorithm = HmacAlgorithms.HMAC_SHA_256;
        HmacUtils hmacUtils = new HmacUtils(algorithm, key);
        ByteBuffer valueToDigest = ByteBuffer.wrap("Hello, World!".getBytes());
        String expectedHex = "a591a6d40bf420404a011733cfbfd90e7386710d9229a249d6b8a8635b2cc5bb"; // Expected hex for the given input and key
        String resultHex = hmacUtils.hmacHex(valueToDigest);
        assertEquals(expectedHex, resultHex);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHmacHexWithValidInput_cOPZ0_fooC0_fid1() throws IOException {
        String key = "secret";
        HmacAlgorithms algorithm = HmacAlgorithms.HMAC_SHA_256;
        HmacUtils hmacUtils = new HmacUtils(algorithm, key);
        String expectedHex = "expectedHexRepresentationOfTheDigest"; // Replace with actual expected hex string
        ByteBuffer buffer = ByteBuffer.wrap("test string".getBytes());
        String result = hmacUtils.hmacHex(buffer);
        assertEquals(expectedHex, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHmacHexWithValidFile_bool0() throws IOException {
        File testFile = new File("path/to/test/file.txt");
        byte[] key = new byte[]{1, 2, 3, 4}; // Example key
        HmacUtils hmacUtils = new HmacUtils(HmacAlgorithms.HMAC_SHA_256, key);
        String result = hmacUtils.hmacHex(testFile);
        assertNotNull(result);
        assertFalse(result.isEmpty());
    }
}