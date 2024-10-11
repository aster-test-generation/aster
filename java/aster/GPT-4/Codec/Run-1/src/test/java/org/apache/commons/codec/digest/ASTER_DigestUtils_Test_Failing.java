/**
 * Generated by Aster
 */
package org.apache.commons.codec.digest;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.file.Files;
import java.nio.file.Path;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

public class Aster_DigestUtils_Test_Failing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSha1WithValidString_MzDt0() {
        String testString = "Hello World";
        byte[] expectedOutput = {
        (byte) 0x2e, (byte) 0xf7, (byte) 0xbd, (byte) 0xe6, (byte) 0x08,
        (byte) 0xce, (byte) 0x54, (byte) 0x04, (byte) 0xe9, (byte) 0x79,
        (byte) 0x09, (byte) 0x2b, (byte) 0xc7, (byte) 0x70, (byte) 0x2d,
        (byte) 0x97, (byte) 0xac, (byte) 0x8d, (byte) 0xf9, (byte) 0x0f
        };
        byte[] result = DigestUtils.sha1(testString);
        assertArrayEquals(expectedOutput, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDigestWithEmptyFile_TKgr0() throws IOException, NoSuchAlgorithmException {
        RandomAccessFile file = new RandomAccessFile("emptyFile.txt", "r");
        MessageDigest md = MessageDigest.getInstance("SHA-256");
        byte[] result = DigestUtils.digest(md, file);
        assertArrayEquals(new byte[32], result); // SHA-256 produces a 32-byte hash
        file.close();
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDigestWithSmallFile_KnfG1() throws IOException, NoSuchAlgorithmException {
        RandomAccessFile file = new RandomAccessFile("smallFile.txt", "r");
        MessageDigest md = MessageDigest.getInstance("SHA-256");
        byte[] result = DigestUtils.digest(md, file);
        assertNotNull(result);
        assertTrue(result.length == 32);
        file.close();
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDigestWithNonEmptyFile_udwu2() throws IOException, NoSuchAlgorithmException {
        RandomAccessFile file = new RandomAccessFile("nonEmptyFile.txt", "r");
        MessageDigest md = MessageDigest.getInstance("MD5");
        byte[] result = DigestUtils.digest(md, file);
        assertNotNull(result);
        assertTrue(result.length == 16); // MD5 produces a 16-byte hash
        file.close();
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDigestWithLargeFile_TfUM3() throws IOException, NoSuchAlgorithmException {
        RandomAccessFile file = new RandomAccessFile("largeFile.txt", "r");
        MessageDigest md = MessageDigest.getInstance("SHA-1");
        byte[] result = DigestUtils.digest(md, file);
        assertNotNull(result);
        assertTrue(result.length == 20); // SHA-1 produces a 20-byte hash
        file.close();
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDigestWithBinaryFile_uQYx5() throws IOException, NoSuchAlgorithmException {
        RandomAccessFile file = new RandomAccessFile("binaryFile.bin", "r");
        MessageDigest md = MessageDigest.getInstance("SHA-256");
        byte[] result = DigestUtils.digest(md, file);
        assertNotNull(result);
        assertTrue(result.length == 32);
        file.close();
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDigestWithEmptySHA512_CJcm6() throws IOException, NoSuchAlgorithmException {
        RandomAccessFile file = new RandomAccessFile("emptyFile.txt", "r");
        MessageDigest md = MessageDigest.getInstance("SHA-512");
        byte[] result = DigestUtils.digest(md, file);
        assertArrayEquals(new byte[64], result); // SHA-512 produces a 64-byte hash
        file.close();
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDigestWithNullMessageDigest_HVkh8() throws IOException {
        RandomAccessFile file = new RandomAccessFile("someFile.txt", "r");
        try {
            DigestUtils.digest(null, file);
            fail("Expected NullPointerException");
        } catch (NullPointerException e) {
            assertNotNull(e);
        } finally {
            file.close();
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDigestAsHexWithValidData_bblC0() {
        DigestUtils digestUtils = new DigestUtils("SHA-256");
        String result = digestUtils.digestAsHex("Hello World");
        assertEquals("a591a6d40bf420404a011733cfb7b190d62c65bf0c7306e7aebb5f1126ab0d1e", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSha3_512HexWithEmptyByteArray_jvUs0() {
        byte[] testData = new byte[0];
        String result = DigestUtils.sha3_512Hex(testData);
        assertEquals("a69f73cca23a9ac5c8b567dc185a756e97c982164fe25859e0a1dcc8f1bbde9a" +
        "d44e3d6f34e90e2e42d7bc99db29d9c2f8a9ac8f9f9dc6f1fd764a56bd29315c" +
        "95f7f0c00b0dfb33f44d054a8e0a5f07bb2e4feb1a2f7c9fd860d5d8a2e50710",
        result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testUpdateDigestWithEmptyFile_UwiU0() throws IOException, NoSuchAlgorithmException {
        Path tempFile = Files.createTempFile("test", ".tmp");
        RandomAccessFile file = new RandomAccessFile(tempFile.toFile(), "r");
        MessageDigest digest = MessageDigest.getInstance("SHA-256");
        MessageDigest updatedDigest = DigestUtils.updateDigest(digest, file);
        assertNotNull(updatedDigest);
        assertArrayEquals(new byte[32], updatedDigest.digest());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testUpdateDigestWithNullDigest_ZSTo7() throws IOException {
        Path tempFile = Files.createTempFile("test", ".tmp");
        RandomAccessFile file = new RandomAccessFile(tempFile.toFile(), "r");
        try {
            DigestUtils.updateDigest(null, file);
            fail("Should have thrown NullPointerException");
        } catch (NullPointerException e) {
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSha512_224Hex_yCdN0() {
        String input = "test input";
        String expectedOutput = "aef8fdd2e8a8a9d395f5f5d44a87ec3b8e58d3fbba9a8e62f36f9f1b";
        String result = DigestUtils.sha512_224Hex(input);
        assertEquals(expectedOutput, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSha512_224Hex_MIrM0() {
        String expected = "d14a028c2a3a2bc9476102bb288234c415a2b01f828ea62ac5b3e42f";
        byte[] data = "Hello, world!".getBytes();
        String result = DigestUtils.sha512_224Hex(data);
        assertEquals(expected, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testShaHexWithEmptyByteArray_lwVu0() {
        byte[] data = new byte[0];
        String result = DigestUtils.shaHex(data);
        assertEquals("", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSha256Hex_ValidInput_ShouldReturnExpectedHash_CzWk0() {
        String input = "Hello, world!";
        String expectedHash = "315f7c672f5e1515f213aa08f07baee9f90b7e48262d0e12a5b99c0b0e2e5e4b";
        String result = DigestUtils.sha256Hex(input);
        assertEquals(expectedHash, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSha3_384Hex_ixcu0() {
        String input = "Hello, World!";
        String expectedOutput = "720aea11019ef06440fbf05b6a11f1c9f1c9d40b07b7b8f97f5d50dcbcbe11e4e3a413ef1a9f9a006b563abc86e7e057";
        String result = DigestUtils.sha3_384Hex(input);
        assertEquals(expectedOutput, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSha3_384Hex_withEmptyByteArray_gSAl0() {
        byte[] testData = new byte[0];
        String expectedHash = "38b060a751ac96384cd9327eb1b1e36a21fdb71114be07434c0cc7bf63f6e1da274edebfe76f65fbd51ad2f14898b95b";
        String result = DigestUtils.sha3_384Hex(testData);
        assertEquals(expectedHash, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testMd2HexWithValidInput_ODyH0() {
        String input = "Hello World";
        String expectedOutput = "da33def2a42df13975352846c30338cd";
        String result = DigestUtils.md2Hex(input);
        assertEquals(expectedOutput, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSha512_256Hex_TQrv0() {
        String input = "Hello, World!";
        String expectedOutput = "6eaee9e2f7e0c6fbbf3b92f2a4c6731c6f8dbfbe1b2f76f3b504fc4f2515f0fb";
        String result = DigestUtils.sha512_256Hex(input);
        assertEquals(expectedOutput, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSha384Hex_RuIk0() {
        String input = "Hello, world!";
        String expectedOutput = "768412320f8c84c4a5394b25e4f2e34d6bc7b45f77b5fe12ad6a807da3efd3cf2a458a0b8f7e0f2348c354a2d35fa01a";
        String result = DigestUtils.sha384Hex(input);
        assertEquals(expectedOutput, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSha512HexWithEmptyArray_vOZX0() {
        byte[] testData = new byte[0];
        String result = DigestUtils.sha512Hex(testData);
        assertEquals("cf83e1357eefb8bdf1542850d66d8007d620e4050e6b5b5dcefa1fa3d8aefdbf" +
        "ad144e46faa4d4e5a3e3e7393240e93d75c0246c0dce4afb68e0b6f7a4f26b22", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSha3_256Hex_withNonNullData_ldvr0() {
        byte[] testData = "test input".getBytes();
        String result = DigestUtils.sha3_256Hex(testData);
        assertNotNull(result);
        assertEquals("a7cab0f9c6d1b3f2b8b0a8e45b2e04b24f4720a4d4f5b8d71a0b7a3185b8c9d7", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSha1HexWithSimpleInput_XGkB0() {
        String expected = "2fd4e1c67a2d28fced849ee1bb76e7391b93eb12";
        byte[] data = "hello".getBytes();
        String result = DigestUtils.sha1Hex(data);
        assertEquals(expected, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testMd5HexWithValidString_lhyq0() {
        String input = "Hello World";
        String expectedOutput = "fc3ff98e8c6a0d3087d515c0473f8677";
        String result = DigestUtils.md5Hex(input);
        assertEquals(expectedOutput, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSha256WithValidString_nCup0() {
        String input = "Hello, world!";
        byte[] expectedOutput = {104, 101, 108, 108, 111, 44, 32, 119, 111, 114, 108, 100, 33};
        byte[] result = DigestUtils.sha256(input);
        assertArrayEquals(expectedOutput, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSha3_512HexWithSimpleString_bFeG0() {
        String input = "Hello, world!";
        String expectedOutput = "6f9a2b6b322b3a2fbbf1b1723e0e898b8a2e8a1f6d13c4e7a9d7e8b83d7958e3a1b0a36f7ba2a5b9d075b5c1dab0b5fdd8ee1b7f776e45c5eefb948c8a5fc6f2";
        String result = DigestUtils.sha3_512Hex(input);
        assertEquals(expectedOutput, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSha512HexWithValidInput_wrWA0() {
        String input = "Hello, world!";
        String expectedOutput = "309ecc489821d96cfe0f0aea9b30de0e1d3e6b6f8e0f7e0c5d540091e9f54036c6f98b4d9990e6a4d3f4f9b1a1f7f9e4c6e1a0099b3d46727be205be51ed1ec7";
        Assertions.assertEquals(expectedOutput, DigestUtils.sha512Hex(input));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testUpdateDigest_JCPd0() {
        MessageDigest md = null;
        try {
            md = MessageDigest.getInstance("SHA-256");
        } catch (NoSuchAlgorithmException e) {
            fail("Algorithm SHA-256 should be available.");
        }
        byte[] data = "test data".getBytes();
        MessageDigest updatedMd = DigestUtils.updateDigest(md, data);
        byte[] expectedDigest = md.digest(data);
        assertArrayEquals(expectedDigest, updatedMd.digest(), "Digests should match after update.");
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSha512_256Hex_ValidInput_ishz0() {
        String expected = "c672b8d1ef56ed28ab87c3622c5114069bdd3ad7b8f9737498d0c01ecef0967a";
        byte[] data = "hello world".getBytes();
        String result = DigestUtils.sha512_256Hex(data);
        assertEquals(expected, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSha3_256Hex_ValidInput_DIQF0() {
        String input = "Hello, world!";
        String expectedOutput = "a6d241f5f5c4f0b2a9a7b8a8dcc9e0e5e0e6e115c1a7e129b9d1a7b9c9e0876b";
        String result = DigestUtils.sha3_256Hex(input);
        assertEquals(expectedOutput, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSha3_224Hex_ValidInput_qgsn0() {
        String input = "Hello World";
        String expectedOutput = "dfb7f18c77e928bb56faeb2da27291bd790bc1045cde45f3210bb6c5";
        String result = DigestUtils.sha3_224Hex(input);
        assertEquals(expectedOutput, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSha3_224HexWithEmptyByteArray_TiKp0() {
        byte[] testData = new byte[0];
        String result = DigestUtils.sha3_224Hex(testData);
        assertEquals("6b4e03423667dbb73b6e15454f0eb1abd4597f9a2a2760f04ca730c9cac2a3c9", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDigestWithSmallFile_KnfG1_1() throws IOException, NoSuchAlgorithmException {
        RandomAccessFile file = new RandomAccessFile("smallFile.txt", "r");
        MessageDigest md = MessageDigest.getInstance("SHA-256");
        byte[] result = DigestUtils.digest(md, file);
        file.close();
        assertNotNull(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDigestWithSmallFile_KnfG1_2() throws IOException, NoSuchAlgorithmException {
        RandomAccessFile file = new RandomAccessFile("smallFile.txt", "r");
        MessageDigest md = MessageDigest.getInstance("SHA-256");
        byte[] result = DigestUtils.digest(md, file);
        file.close();
        assertTrue(result.length == 32);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDigestWithNonEmptyFile_udwu2_1() throws IOException, NoSuchAlgorithmException {
        RandomAccessFile file = new RandomAccessFile("nonEmptyFile.txt", "r");
        MessageDigest md = MessageDigest.getInstance("MD5");
        byte[] result = DigestUtils.digest(md, file);
        file.close();
        assertNotNull(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSha1WithValidString_MzDt0_fid2() {
        String testString = "Hello World";
        byte[] expectedOutput = {
        (byte) 0x0a, (byte) 0xf7, (byte) 0xbd, (byte) 0xe6, (byte) 0x08,
        (byte) 0xce, (byte) 0x54, (byte) 0x04, (byte) 0xe9, (byte) 0x79,
        (byte) 0x09, (byte) 0x2b, (byte) 0xc7, (byte) 0x70, (byte) 0x2d,
        (byte) 0x97, (byte) 0xac, (byte) 0x8d, (byte) 0xf9, (byte) 0x0f
        };
        byte[] result = DigestUtils.sha1(testString);
        assertArrayEquals(expectedOutput, result);
    }
}