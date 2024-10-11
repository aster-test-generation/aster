/**
 * Generated by Aster
 */
package org.apache.commons.codec.digest;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_DigestUtils_Test_Failing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDigestAsHex_AGHa0() {
        DigestUtils digestUtils = new DigestUtils("SHA-256");
        String data = "test data";
        String expectedHex = "a8b0b6fb37a3a1c9ee9b8b9f9f1b0c3a2b4c5d6e7f8091a2b3c4d5e6f7f8f9fa";
        String result = digestUtils.digestAsHex(data);
        assertEquals(expectedHex, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSha512_224Hex_ACzK0() {
        String input = "Hello, world!";
        String expectedOutput = "f90ddd77e400dfe6a1f0d9b09b5391f5a4a7a5cbe677f19b3e10e8b0";
        String result = DigestUtils.sha512_224Hex(input);
        assertEquals(expectedOutput, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSha3_384Hex_withValidInputStream_OuFk0() throws IOException {
        String expectedOutput = "expected hash here"; // Replace with the expected hash
        String path = "path/to/your/test/file.txt"; // Replace with actual path to a test file
        InputStream data = new FileInputStream(path);
        String result = DigestUtils.sha3_384Hex(data);
        assertEquals(expectedOutput, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testShaHexWithEmptyByteArray_Bepp0() {
        byte[] data = new byte[0];
        String result = DigestUtils.shaHex(data);
        assertEquals("", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSha256Hex_ValidInput_ShouldReturnExpectedHash_cTHy0() {
        String input = "Hello World";
        String expectedOutput = "a591a6d40bf420404a011733cfb7b190d62c65bf0c7306e7a70970f473efa0dc";
        String result = DigestUtils.sha256Hex(input);
        assertEquals(expectedOutput, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSha3_384Hex_PTrH0() {
        String input = "Hello, World!";
        String expectedOutput = "720aea11019ef06440fbf05b6a11f1c9f6199b3f9f1b828f2f9e398e13d0081e7a52d7f9fe20b4c6e8b8ad5287b01f05";
        assertEquals(expectedOutput, DigestUtils.sha3_384Hex(input));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSha3_384HexWithEmptyByteArray_Ncil0() {
        byte[] testData = new byte[0];
        String result = DigestUtils.sha3_384Hex(testData);
        assertEquals("a69f73cca23a9ac5c8b567dc185a756e97c982164fe25859e0d1dcc1475c80a615b2123af1f5f94c11e3e9402c3ac558f500199d95b6d3e301758586281dcd26", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testMd2HexWithValidInput_uVXE0() {
        String input = "Hello World";
        String expectedOutput = "fa6e1fe2ce927023c92c791f8b5f7f77";
        String result = DigestUtils.md2Hex(input);
        assertEquals(expectedOutput, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSha512_256Hex_ValidInput_uWwU0() {
        String input = "Hello, world!";
        String expectedOutput = "6f1bd4e76f6fdaa714f048f2c3ada5a1f1a8b56d8efc36c8d9c7460cab44c9e3";
        String result = DigestUtils.sha512_256Hex(input);
        assertEquals(expectedOutput, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSha384HexWithValidInput_JIkw0() {
        String input = "Hello, world!";
        String expectedOutput = "768412320f6a855ea6d078a1a84f95d9f82ffe992c92ad99c9a2a6f2f3b76b71e4d3e280a6f94b906d60a4b6b5a6d0f7";
        String result = DigestUtils.sha384Hex(input);
        assertEquals(expectedOutput, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDigestWithEmptyFile_cLap0() throws IOException, NoSuchAlgorithmException {
        RandomAccessFile file = new RandomAccessFile("emptyFile.txt", "r");
        MessageDigest md = MessageDigest.getInstance("SHA-256");
        byte[] result = DigestUtils.digest(md, file);
        assertNotNull(result);
        assertEquals(32, result.length); // SHA-256 produces 32 byte hashes
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDigestWithSmallTextFile_ijsd1() throws IOException, NoSuchAlgorithmException {
        RandomAccessFile file = new RandomAccessFile("smallFile.txt", "r");
        MessageDigest md = MessageDigest.getInstance("MD5");
        byte[] result = DigestUtils.digest(md, file);
        assertNotNull(result);
        assertEquals(16, result.length); // MD5 produces 16 byte hashes
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDigestWithLargeFile_Zxsj2() throws IOException, NoSuchAlgorithmException {
        RandomAccessFile file = new RandomAccessFile("largeFile.bin", "r");
        MessageDigest md = MessageDigest.getInstance("SHA-1");
        byte[] result = DigestUtils.digest(md, file);
        assertNotNull(result);
        assertEquals(20, result.length); // SHA-1 produces 20 byte hashes
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDigestWithFileLock_FGlz7() throws IOException, NoSuchAlgorithmException {
        RandomAccessFile file = new RandomAccessFile("lockedFile.txt", "rw");
        file.getChannel().lock();
        MessageDigest md = MessageDigest.getInstance("SHA-256");
        try {
            DigestUtils.digest(md, file);
            fail("Expected an IOException due to file lock");
        } catch (IOException e) {
            assertNotNull(e);
        } finally {
            file.close();
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDigestWithSpecificAlgorithm_lDHV8() throws IOException, NoSuchAlgorithmException {
        RandomAccessFile file = new RandomAccessFile("specificAlgorithmFile.txt", "r");
        MessageDigest md = MessageDigest.getInstance("SHA-512");
        byte[] result = DigestUtils.digest(md, file);
        assertNotNull(result);
        assertEquals(64, result.length); // SHA-512 produces 64 byte hashes
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDigestWithMultipleReads_gJBG9() throws IOException, NoSuchAlgorithmException {
        RandomAccessFile file = new RandomAccessFile("multiReadFile.txt", "r");
        MessageDigest md = MessageDigest.getInstance("SHA-256");
        byte[] result = DigestUtils.digest(md, file);
        assertNotNull(result);
        assertEquals(32, result.length); // SHA-256 produces 32 byte hashes
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testUpdateDigestWithEmptyFile_aQoi0() throws IOException, NoSuchAlgorithmException {
        RandomAccessFile file = new RandomAccessFile("emptyfile.txt", "r");
        MessageDigest digest = MessageDigest.getInstance("SHA-256");
        MessageDigest updatedDigest = DigestUtils.updateDigest(digest, file);
        assertNotNull(updatedDigest);
        assertArrayEquals(new byte[32], updatedDigest.digest());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testUpdateDigestWithNonEmptyFile_xiWE1() throws IOException, NoSuchAlgorithmException {
        RandomAccessFile file = new RandomAccessFile("nonemptyfile.txt", "r");
        MessageDigest digest = MessageDigest.getInstance("SHA-256");
        MessageDigest updatedDigest = DigestUtils.updateDigest(digest, file);
        assertNotNull(updatedDigest);
        assertNotEquals(new byte[32], updatedDigest.digest());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testUpdateDigestWithNullDigest_FTev2() throws IOException {
        RandomAccessFile file = new RandomAccessFile("somefile.txt", "r");
        try {
            DigestUtils.updateDigest(null, file);
            fail("Should have thrown NullPointerException");
        } catch (NullPointerException e) {
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testUpdateDigestWithClosedFile_uzCS4() throws IOException, NoSuchAlgorithmException {
        RandomAccessFile file = new RandomAccessFile("somefile.txt", "r");
        file.close();
        MessageDigest digest = MessageDigest.getInstance("SHA-256");
        try {
            DigestUtils.updateDigest(digest, file);
            fail("Should have thrown IOException");
        } catch (IOException e) {
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testUpdateDigestWithLargeFile_XObD5() throws IOException, NoSuchAlgorithmException {
        RandomAccessFile file = new RandomAccessFile("largefile.txt", "r");
        MessageDigest digest = MessageDigest.getInstance("SHA-256");
        MessageDigest updatedDigest = DigestUtils.updateDigest(digest, file);
        assertNotNull(updatedDigest);
        assertNotEquals(new byte[32], updatedDigest.digest());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testUpdateDigestWithBinaryFile_syOS6() throws IOException, NoSuchAlgorithmException {
        RandomAccessFile file = new RandomAccessFile("binaryfile.bin", "r");
        MessageDigest digest = MessageDigest.getInstance("SHA-256");
        MessageDigest updatedDigest = DigestUtils.updateDigest(digest, file);
        assertNotNull(updatedDigest);
        assertNotEquals(new byte[32], updatedDigest.digest());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testUpdateDigestWithReadOnlyFile_vsUU7() throws IOException, NoSuchAlgorithmException {
        RandomAccessFile file = new RandomAccessFile("readonlyfile.txt", "r");
        MessageDigest digest = MessageDigest.getInstance("SHA-256");
        MessageDigest updatedDigest = DigestUtils.updateDigest(digest, file);
        assertNotNull(updatedDigest);
        assertNotEquals(new byte[32], updatedDigest.digest());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testUpdateDigestWithSpecificAlgorithm_MLLE9() throws IOException, NoSuchAlgorithmException {
        RandomAccessFile file = new RandomAccessFile("specificfile.txt", "r");
        MessageDigest digest = MessageDigest.getInstance("MD5");
        MessageDigest updatedDigest = DigestUtils.updateDigest(digest, file);
        assertNotNull(updatedDigest);
        assertNotEquals(new byte[16], updatedDigest.digest());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testUpdateDigestWithByteBuffer_SZaP0() {
        try {
            MessageDigest digest = MessageDigest.getInstance("SHA-256");
            ByteBuffer buffer = ByteBuffer.wrap(new byte[]{1, 2, 3, 4});
            MessageDigest updatedDigest = DigestUtils.updateDigest(digest, buffer);
            byte[] expectedDigest = digest.digest();
            byte[] actualDigest = updatedDigest.digest();
            assertArrayEquals(expectedDigest, actualDigest);
        } catch (NoSuchAlgorithmException e) {
            fail("No such algorithm exception should not occur");
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSha3_256Hex_ValidInput_HGZB0() {
        byte[] inputData = "test input".getBytes();
        String expectedOutput = "3c2ff7f200c29a2b740c9e4bf4b8b17f5d4df6c226f396d6b45f7f0cc3cf0ebe";
        String result = DigestUtils.sha3_256Hex(inputData);
        assertEquals(expectedOutput, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSha1HexWithKnownValue_SnEb0() {
        String expected = "2fd4e1c67a2d28fced849ee1bb76e7391b93eb12";
        byte[] data = "hello".getBytes();
        String result = DigestUtils.sha1Hex(data);
        assertEquals(expected, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testMd2WithEmptyByteArray_wnqn0() {
        byte[] testData = new byte[0];
        byte[] result = DigestUtils.md2(testData);
        assertNotNull(result);
        assertArrayEquals(new byte[]{-125, 50, 18, -34, -83, -66, 60, -113, 70, -14, -70, 118, 61, 112, 94, 94}, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSha3_512Hex_ValidInput_Rskx0() {
        String input = "Hello, World!";
        String expectedOutput = "1e2c3bcb4dabc620d5aad35c8b040c8a1f4d7e0d41c89d009b42f10f3c8a6642b0b8e7a5b5db6e4e0b8f89f8fb7f8d3f3e5d8809e2d3a8e8e90c5b8f6f8c055b";
        String result = DigestUtils.sha3_512Hex(input);
        assertEquals(expectedOutput, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testUpdateDigest_gffI0() throws NoSuchAlgorithmException {
        MessageDigest digest = MessageDigest.getInstance("SHA-256");
        byte[] inputBytes = "test input".getBytes();
        MessageDigest updatedDigest = DigestUtils.updateDigest(digest, inputBytes);
        byte[] expectedDigest = digest.digest();
        assertArrayEquals(expectedDigest, updatedDigest.digest());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDigestAsHexWithValidData_aNii0() {
        DigestUtils digestUtils = new DigestUtils("SHA-256");
        byte[] data = "test data".getBytes();
        String result = digestUtils.digestAsHex(data);
        assertNotNull(result);
        assertEquals("3a6eb681f62b1545f14b9f8e4e0d7f1f3b6ee9a7ceeeaa34d46e5ea0c6f2cb3f", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSha3_256Hex_ValidInput_QARE0() {
        String input = "Hello, world!";
        String expectedOutput = "a6d338459780c08363090fd7718e5b97e073abf6f895d8e3e5b6a760b6c48f2e";
        String result = DigestUtils.sha3_256Hex(input);
        assertEquals(expectedOutput, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSha3_224Hex_mzyC0() {
        String input = "Hello, world!";
        String expectedOutput = "dfb7a0d1e6a3e3d9b9e6e2d8f7968d1e6a3e3d9b9e6e2d8f7968d1e6a3e3d9b9";
        String result = DigestUtils.sha3_224Hex(input);
        assertEquals(expectedOutput, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSha3_224Hex_withEmptyByteArray_XfaF0() {
        byte[] testData = new byte[0];
        String result = DigestUtils.sha3_224Hex(testData);
        assertEquals("6b23c0d5f35b0f9a1ab6b6f895d65e7e6c1f36456aaf76cc5c7b6a9bf4e6486c", result);
    }
}