/**
 * Generated by Aster
 */
package org.apache.commons.codec.digest;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.file.OpenOption;
import java.nio.file.Path;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

public class Aster_DigestUtils_Test {
    private static MessageDigest getDigest(String algorithm) {
        try {
            return MessageDigest.getInstance(algorithm);
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException("Could not find MessageDigest with algorithm: " + algorithm, e);
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSha3_256Hex_WSLN0() throws IOException {
        InputStream data = null; // Initialize data with appropriate input
        String expected = "expected_hash_value"; // Replace with expected hash value
        String actual = DigestUtils.sha3_256Hex(data);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSha_GNtj0() throws IOException, NoSuchAlgorithmException {
        InputStream data = null; // Initialize InputStream data
        byte[] actual = DigestUtils.sha(data);
        assertNotNull(actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetSha384Digest_WjnF0() throws NoSuchAlgorithmException {
        MessageDigest digest = DigestUtils.getSha384Digest();
        assertNotNull(digest);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetDigest_uJun2() throws NoSuchAlgorithmException {
        MessageDigest digest = DigestUtils.getDigest("SHA-384");
        assertNotNull(digest);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetDigest2_TRpq3() throws NoSuchAlgorithmException {
        MessageDigest digest = DigestUtils.getDigest(MessageDigestAlgorithms.SHA_384);
        assertNotNull(digest);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSha1_yjTz0() {
        String data = "Hello, World!";
        byte[] expected = {-112, 83, -109, 68, -82, -107, 91, 100, -32, -103, 104, 101, 108, 108, 111, 44, 32, 87, 111, 114, 108, 100, 33};
        byte[] actual = DigestUtils.sha1(data);
        assertArrayEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testMd5_ZyGQ0() {
        byte[] expected = {-8, 104, -102, -110, -105, 103, 116, 56};
        byte[] actual = DigestUtils.md5("test");
        assertArrayEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testMd5WithEmptyData_SjfP2() {
        byte[] expected = {-112, 96, 101, -109, -9, -118, 96, 101};
        byte[] actual = DigestUtils.md5("");
        assertArrayEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testMd5WithDifferentData_qmDC3() {
        byte[] expected = {113, -108, -105, 110, 116, 101, 115, 116};
        byte[] actual = DigestUtils.md5("test");
        assertArrayEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSha256Hex_uAZc0() {
        byte[] data = "Hello, World!".getBytes();
        String expected = "24a64955397e9836d7401d7c65bd1b41b8a1a301e16e0071593e99a625f2bc3";
        String actual = DigestUtils.sha256Hex(data);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDigestAsHex_QTCx0() {
        DigestUtils digestUtils = new DigestUtils();
        String data = "Hello, World!";
        String expected = "2fd4e1c67a2d28fced849ee1bb76e7391b93eb1251c6734036cc90d2cb542ac";
        String actual = digestUtils.digestAsHex(data);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testgetMd2Digest_HHjB0() {
        MessageDigest md2Digest = DigestUtils.getMd2Digest();
        assertNotNull(md2Digest);
        assertEquals("MD2", md2Digest.getAlgorithm());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSha3_512Hex_nTNd0() {
        byte[] data = new byte[10];
        String expected = "a69f73cca23a51d359e9cc79fc86a7";
        String actual = DigestUtils.sha3_512Hex(data);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSha3_512Hex_riGb1() {
        byte[] data = "Hello, World!".getBytes();
        String expected = "0170f670b4e9c969806051d2c52bb180fa051f2d9c3400b89d88106a4a058a8";
        String actual = DigestUtils.sha3_512Hex(data);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSha3_512Hex_NzDS2() {
        byte[] data = new byte[0];
        String expected = "a69f73cca23a51d359e9cc79fc86a7";
        String actual = DigestUtils.sha3_512Hex(data);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSha_jMbK0() {
        String data = "Hello, World!";
        byte[] expected = {-118, 83, -102, 102, -11, 102, -119, 117, -60, -89, 23, -119, 107, 71, -105, 112};
        byte[] actual = DigestUtils.sha(data);
        assertArrayEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSha256_xOOi0() throws NoSuchAlgorithmException {
        byte[] data = "Hello, World!".getBytes();
        byte[] expected = MessageDigest.getInstance("SHA-256").digest(data);
        byte[] actual = DigestUtils.sha256(data);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSha1Hex_zfAq0() {
        String data = "Hello, World!";
        String expected = "2fd4e1c67a2d28fced849ee1bb76e7391b93eb1";
        String actual = DigestUtils.sha1Hex(data);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testUpdateDigestWithNullDigestAndRandomAccessFile_yDZU3() throws IOException {
        MessageDigest digest = null; // initialize digest
        RandomAccessFile file = null; // initialize file
        MessageDigest updatedDigest = DigestUtils.updateDigest(digest, file);
        assertNull(updatedDigest);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testUpdateDigestWithNullName_GBVW8() {
        MessageDigest digest = null; // initialize digest
        MessageDigest updatedDigest = DigestUtils.updateDigest(digest, "SHA-256");
        assertNull(updatedDigest);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testUpdateDigestWithEmptyName_XNeV9() {
        MessageDigest digest = null; // initialize digest
        MessageDigest updatedDigest = DigestUtils.updateDigest(digest, "");
        assertNull(updatedDigest);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testUpdateDigestWithInvalidName_DAwn10() {
        MessageDigest digest = null; // initialize digest
        MessageDigest updatedDigest = DigestUtils.updateDigest(digest, "invalid");
        assertNull(updatedDigest);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testMd2_kGTY0() throws IOException {
        DigestUtils digestUtils = new DigestUtils();
        InputStream data = null; // Replace with actual input stream
        byte[] result = digestUtils.md2(data);
        assertNotNull(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSha512_224Hex_ytTW0() {
        assertEquals("d14a028c2a3a2bc9476102bb288234c415a2b01f828ea62ac5b3e42f", DigestUtils.sha512_224Hex(""));
        assertEquals("207946523981138041915897401265304329501408386341274891803054", DigestUtils.sha512_224Hex("Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat."));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSha512_224Hex_HkFc0() {
        byte[] data = new byte[0];
        String expected = "6ed0dd02806fa85f64ba4b796fe31768b186b1135133676fb6401f3e343c6a4";
        String actual = DigestUtils.sha512_224Hex(data);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSha3_384Hex_RGoV0() throws IOException {
        InputStream data = null; // Initialize data with valid input
        String expected = "expected_hash_value"; // Replace with expected hash value
        String actual = DigestUtils.sha3_384Hex(data);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetSha1Digest_vRYT0() {
        MessageDigest expected = getDigest("SHA-1");
        MessageDigest actual = DigestUtils.getSha1Digest();
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetMessageDigest_IgBF0() {
        DigestUtils digestUtils = new DigestUtils();
        MessageDigest messageDigest = digestUtils.getMessageDigest();
        assertNotNull(messageDigest);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDigestUtilsWithString_navI2() {
        DigestUtils digestUtils = new DigestUtils("SHA-256");
        MessageDigest result = digestUtils.getMessageDigest();
        assertNotNull(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetShaDigest_GeJO0() {
        MessageDigest digest = DigestUtils.getShaDigest();
        assertNotNull(digest);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetSha1Digest_GILc1() {
        MessageDigest digest = DigestUtils.getSha1Digest();
        assertNotNull(digest);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetSha256Digest_OZlG2() {
        MessageDigest digest = DigestUtils.getSha256Digest();
        assertNotNull(digest);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetSha512Digest_RSmg4() {
        MessageDigest digest = DigestUtils.getSha512Digest();
        assertNotNull(digest);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testgetSha3_384Digest_LBAL0() {
        MessageDigest expected = getDigest("SHA3-384");
        MessageDigest actual = DigestUtils.getSha3_384Digest();
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSha3_224_oJap0() {
        String data = "Hello, World!";
        byte[] expected = {(byte) 0x6b, (byte) 0x04, (byte) 0x57, (byte) 0x01, (byte) 0x00, (byte) 0x53, (byte) 0xa6, (byte) 0xf4, (byte) 0x4c, (byte) 0x7f, (byte) 0xa4, (byte) 0x1c, (byte) 0xf5, (byte) 0xe3, (byte) 0x52, (byte) 0xc5, (byte) 0x15, (byte) 0x3e, (byte) 0xb0, (byte) 0xc7, (byte) 0x7a, (byte) 0x82, (byte) 0x3f, (byte) 0x41, (byte) 0x35, (byte) 0xde, (byte) 0x99, (byte) 0xb0, (byte) 0x4c, (byte) 0xa1, (byte) 0x6c};
        byte[] actual = DigestUtils.sha3_224(data);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSha384_VcvC0() throws IOException, NoSuchAlgorithmException {
        InputStream data = null; // initialize data
        MessageDigest digest = MessageDigest.getInstance("SHA-384"); // initialize digest
        byte[] result = DigestUtils.sha384(data); // call method under test
        assertNotNull(result); // assert statement
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSha512_256Hex_dYmv0() throws IOException {
        InputStream data = null; // Initialize data
        String expected = "expected_hash_value"; // Replace with expected hash value
        String actual = DigestUtils.sha512_256Hex(data);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testShaHex_kNcc0() {
        byte[] data = new byte[]{1, 2, 3};
        String expected = "0a0e6c016648b59f16d3bfcc98b944f7";
        String actual = DigestUtils.shaHex(data);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSha512_224_WQwa0() {
        String data = "Hello, World!";
        byte[] expected = {(byte) 0x20, (byte) 0x79, (byte) 0x46, (byte) 0x5c, (byte) 0x53, (byte) 0x60, (byte) 0x40, (byte) 0x12, (byte) 0xa3, (byte) 0x2a, (byte) 0x1c, (byte) 0xf9, (byte) 0x4f, (byte) 0x80, (byte) 0xf8, (byte) 0x43, (byte) 0x97, (byte) 0x3c, (byte) 0xa4, (byte) 0x56, (byte) 0x99, (byte) 0xb2, (byte) 0x6c, (byte) 0x51, (byte) 0x3d, (byte) 0xa8, (byte) 0x9b, (byte) 0xe5, (byte) 0x68, (byte) 0x40, (byte) 0xf6, (byte) 0xb7, (byte) 0x2f, (byte) 0x1e, (byte) 0x4e, (byte) 0xd2, (byte) 0x47, (byte) 0x94, (byte) 0x28, (byte) 0xa7, (byte) 0xc2};
        byte[] actual = DigestUtils.sha512_224(data);
        assertArrayEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetSha3_224Digest_TvZg0() {
        MessageDigest expected = getDigest("SHA-3-224");
        MessageDigest actual = DigestUtils.getSha3_224Digest();
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSha256Hex_ZGAg0() {
        String data = "Hello, World!";
        String expected = "24a64955397e9836d7401d73f9d6917c9a867f7a7856c61f66d5b207f7576af";
        String actual = DigestUtils.sha256Hex(data);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSha3_384_efpN0() {
        String data = "Hello, World!";
        byte[] expected = {(byte) 0x2c, (byte) 0x01, (byte) 0x1e, (byte) 0xa5, (byte) 0x85, (byte) 0xa6, (byte) 0x12, (byte) 0x3c, (byte) 0x79, (byte) 0x91, (byte) 0x13, (byte) 0x8f, (byte) 0x92, (byte) 0xf6, (byte) 0x9e, (byte) 0x53, (byte) 0x79, (byte) 0x3c, (byte) 0x76, (byte) 0x52, (byte) 0xf4, (byte) 0x7e, (byte) 0x9c, (byte) 0x50, (byte) 0xd3, (byte) 0x56, (byte) 0x53, (byte) 0x1b, (byte) 0x33, (byte) 0x9f};
        byte[] actual = DigestUtils.sha3_384(data);
        assertArrayEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSha_fBMH0() {
        byte[] data = new byte[]{1, 2, 3};
        byte[] expected = new byte[]{4, 5, 6};
        byte[] actual = DigestUtils.sha(data);
        assertArrayEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSha3_384Hex_yOIG0() {
        String data = "Hello, World!";
        String expected = "0x0c63a75b845e4f7d01107d852e4c2936c8ae1c120cfc821c7ac8234c05f1873";
        String actual = DigestUtils.sha3_384Hex(data);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSha3_384Hex_tXDd0() {
        byte[] data = new byte[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        String expected = "4403305160274880686506385831511808115150399849722443297906300553509869556287";
        String actual = DigestUtils.sha3_384Hex(data);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSha3_512_zKej0() {
        String data = "Hello, World!";
        byte[] expected = {(byte) 0x6a, (byte) 0x09, (byte) 0xe6, (byte) 0x67, (byte) 0x0f, (byte) 0xb6, (byte) 0x77, (byte) 0xa9, (byte) 0x14, (byte) 0x3e, (byte) 0xd7, (byte) 0xf7, (byte) 0x80, (byte) 0xa2, (byte) 0x10, (byte) 0x42, (byte) 0x0f, (byte) 0xb6, (byte) 0x85, (byte) 0x4d, (byte) 0x7d, (byte) 0x79, (byte) 0x43, (byte) 0x86, (byte) 0x04, (byte) 0x21, (byte) 0xf4, (byte) 0x1e, (byte) 0x56, (byte) 0x4e, (byte) 0x3b, (byte) 0x54, (byte) 0x40, (byte) 0xc3, (byte) 0xa8, (byte) 0x7f, (byte) 0xb4, (byte) 0x8c, (byte) 0x47, (byte) 0x82, (byte) 0x65, (byte) 0x07, (byte) 0x03, (byte) 0x19, (byte) 0x45, (byte) 0x03, (byte) 0xe0, (byte) 0xc4, (byte) 0x64, (byte) 0xf0, (byte) 0x84, (byte) 0x10, (byte) 0x98, (byte) 0xfd, (byte) 0xd0, (byte) 0x96, (byte) 0xdc, (byte) 0x80, (byte) 0xf7, (byte) 0x01, (byte) 0x37, (byte) 0x5a};
        byte[] actual = DigestUtils.sha3_512(data);
        assertArrayEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testShaHex_GscQ0() {
        String data = "Hello, World!";
        String expected = "2fd4e1c67a2d28fced849ee1bb76e7391b93eb12";
        String actual = DigestUtils.shaHex(data);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSha512_224_gZxz0() throws IOException, NoSuchAlgorithmException {
        InputStream data = null; // Initialize with valid InputStream
        MessageDigest expectedDigest = MessageDigest.getInstance("SHA-512/224");
        byte[] actualDigest = DigestUtils.sha512_224(data);
        assert MessageDigest.isEqual(expectedDigest.digest(), actualDigest);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testMd2Hex_gXGY0() {
        byte[] data = new byte[]{1, 2, 3};
        String expected = "010203";
        String actual = DigestUtils.md2Hex(data);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testMd2Hex_IYWG0() {
        String data = "example data";
        String expected = "202cb962ac59075b964b07152d234b70";
        String actual = DigestUtils.md2Hex(data);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSha512_256Hex_KebF0() {
        String data = "Hello, World!";
        String expected = "09ca77518e6297559d9b89752b09a7d1";
        String actual = DigestUtils.sha512_256Hex(data);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSha512_256HexWithEmptyData_dnYn1() {
        String data = "";
        String expected = "cf83e1357eefb8bdf1542850d66d8007d620e4050b5715dc83f4a921d36ce9ce47d0d13c5d85f2b0ff8318d2877eec2f63b931bd47417a81a538327af927da3";
        String actual = DigestUtils.sha512_256Hex(data);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSha512_256HexWithNullData_ZYXt2() {
        String data = null;
        String expected = "cf83e1357eefb8bdf1542850d66d8007d620e4050b5715dc83f4a921d36ce9ce47d0d13c5d85f2b0ff8318d2877eec2f63b931bd47417a81a538327af927da3";
        String actual = DigestUtils.sha512_256Hex(data);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSha384Hex_JLuO0() {
        String data = "Hello, World!";
        String expected = "39ae2a6f7b02c1b66ba84f2024edce24342620e5b540e7bc04e540e53413ace";
        String actual = DigestUtils.sha384Hex(data);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSha512Hex_CrNm0() {
        byte[] data = new byte[0];
        String expected = "cf83e1357eefb8bdf1542850d66d8007d620e4050b5715dc83f4a921d36ce9ce47d0d13c5d85f2b0ff8318d2877eec2f63b931bd47417a81a538327af927da3";
        String actual = DigestUtils.sha512Hex(data);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSha512_SfPZ0() {
        byte[] data = "Hello, World!".getBytes();
        byte[] expected = new byte[]{-10, 110, 101, 116, -116, 11, -110, 101, -12, 116, -116, -109, -101, -115, -116, 101, 114, 119, 111, 114, 108, 100, 33};
        byte[] actual = DigestUtils.sha512(data);
        assertArrayEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSha512_pmNL0() throws IOException, NoSuchAlgorithmException {
        InputStream data = null; // Initialize data
        MessageDigest digest = MessageDigest.getInstance("SHA-512");
        byte[] result = DigestUtils.sha512(data);
        assertNotNull(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsAvailable_NTGl0() {
        assertTrue(DigestUtils.isAvailable("MD5"));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsAvailable2_OrVp1() {
        assertFalse(DigestUtils.isAvailable("nonexistent"));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsAvailable3_vxMc4() {
        assertTrue(DigestUtils.isAvailable("SHA-256"));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsAvailable4_sdpR5() {
        assertFalse(DigestUtils.isAvailable("SHA-257"));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsAvailable5_diQG6() {
        assertTrue(DigestUtils.isAvailable("SHA-384"));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsAvailable6_jmWI7() {
        assertFalse(DigestUtils.isAvailable("SHA-385"));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsAvailable7_AMeR8() {
        assertTrue(DigestUtils.isAvailable("SHA-512"));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsAvailable8_JdNh9() {
        assertFalse(DigestUtils.isAvailable("SHA-513"));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsAvailable9_VEBN10() {
        assertFalse(DigestUtils.isAvailable(null));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsAvailable10_RUhF11() {
        assertFalse(DigestUtils.isAvailable(""));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSha3_384_lXim0() {
        byte[] data = "Hello, World!".getBytes();
        byte[] expected = new byte[]{-103, -111, 111, 110, -11, 111, 114, 108, 100, 33};
        byte[] actual = DigestUtils.sha3_384(data);
        assertTrue(Arrays.equals(expected, actual));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSha3_384EmptyInput_MqrF1() {
        byte[] data = new byte[0];
        byte[] expected = new byte[48];
        byte[] actual = DigestUtils.sha3_384(data);
        assertTrue(Arrays.equals(expected, actual));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSha3_224_ydfO0() {
        byte[] data = new byte[0];
        byte[] expected = new byte[0];
        byte[] actual = DigestUtils.sha3_224(data);
        assertArrayEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSha3_256_jwdh0() {
        byte[] data = new byte[]{1, 2, 3};
        byte[] expected = new byte[]{4, 5, 6};
        byte[] actual = DigestUtils.sha3_256(data);
        assertArrayEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSha3_256Hex_ryQU0() {
        byte[] data = new byte[0];
        String expected = "a7ffc6f8bf1ed76651c14756a061d662f580ff4de43b49fa82d80a4b80f8434";
        String actual = DigestUtils.sha3_256Hex(data);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testMd2_Oiqk0() {
        byte[] data = new byte[0];
        byte[] expected = new byte[0];
        byte[] actual = DigestUtils.md2(data);
        assert Arrays.equals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSha1Hex_yBvC0() {
        byte[] data = new byte[0];
        String expected = "da39a3ee5e6b4b0d3255bfef95601890afd80709";
        String actual = DigestUtils.sha1Hex(data);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testMd5Hex_Jlng0() {
        String data = "Hello, World!";
        String expected = "5d41402abc4b2a76b9719d911017c592";
        String actual = DigestUtils.md5Hex(data);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSha256_gbmL0() {
        String data = "Hello, World!";
        byte[] expected = { /* expected byte array */ };
        byte[] actual = DigestUtils.sha256(data);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSha512_256_ocJd0() {
        String data = "Hello, World!";
        byte[] expected = {(byte) 0x20, (byte) 0x2b, (byte) 0xb4, (byte) 0x98, (byte) 0xff, (byte) 0x05, (byte) 0xe1, (byte) 0x40, (byte) 0x56, (byte) 0x33, (byte) 0x69, (byte) 0x7d, (byte) 0x54, (byte) 0xb6, (byte) 0xa6, (byte) 0xa5, (byte) 0x83, (byte) 0xf2, (byte) 0x7a, (byte) 0xb9, (byte) 0x2a, (byte) 0xe2, (byte) 0xb2, (byte) 0xc1, (byte) 0x0d, (byte) 0xf1, (byte) 0xe1, (byte) 0x4c, (byte) 0x49, (byte) 0x85, (byte) 0x7e};
        byte[] actual = DigestUtils.sha512_256(data);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSha512_256_URaS0() throws NoSuchAlgorithmException {
        byte[] data = "Hello, World!".getBytes();
        byte[] expected = MessageDigest.getInstance("SHA-512/256").digest(data);
        byte[] actual = DigestUtils.sha512_256(data);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testMd5Hex_nKed0() {
        byte[] data = "Hello, World!".getBytes();
        String expected = "5d41402abc4b2a76b9719d911017c592";
        String actual = DigestUtils.md5Hex(data);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDigestAsHex_BtpP0() throws IOException {
        DigestUtils digestUtils = new DigestUtils();
        Path data = null; // Initialize with actual path
        OpenOption[] options = null; // Initialize with actual options
        String expected = "expected_hex_digest"; // Replace with expected hex digest
        String actual = digestUtils.digestAsHex(data, options);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSha3_512Hex_LMWa0() {
        String data = "Hello, World!";
        String expected = "a1a668753b9123624393b1053e98b7484b64e494f3c7b925a5bc1bd01558cd7";
        String actual = DigestUtils.sha3_512Hex(data);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDigestAsHex_XEBB0() {
        DigestUtils digestUtils = new DigestUtils();
        ByteBuffer data = ByteBuffer.allocate(10);
        data.put("Hello, World!".getBytes());
        data.flip();
        String expected = "2fd4e1c67a2d28fced849ee1bb76e7391b93eb12518eb827089 effective";
        String actual = digestUtils.digestAsHex(data);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void test_getDigest_defaultMessageDigest_null_dxiz7() {
        MessageDigest result = DigestUtils.getDigest("SHA-256", null);
        assertNotNull(result);
        assertEquals(result.getAlgorithm(), "SHA-256");
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSha256_KNIX0() throws IOException, NoSuchAlgorithmException {
        InputStream data = null; // Initialize data stream
        MessageDigest digest = MessageDigest.getInstance("SHA-256"); // Initialize digest
        byte[] result = DigestUtils.sha256(data); // Call the method under test
        assertNotNull(result); // Assert that the result is not null
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSha384_kbLw0() {
        String data = "Hello, World!";
        byte[] expected = {(byte) 0x9d, (byte) 0x0e, (byte) 0x89, (byte) 0xa2, (byte) 0x9e, (byte) 0x4c, (byte) 0xcb, (byte) 0xd7, (byte) 0xd1, (byte) 0x92, (byte) 0xfe, (byte) 0xe9, (byte) 0x5d, (byte) 0x09, (byte) 0x88, (byte) 0x69, (byte) 0x7f, (byte) 0x40, (byte) 0x5e, (byte) 0x86, (byte) 0x00, (byte) 0x7c, (byte) 0xb0, (byte) 0xa1, (byte) 0xc9, (byte) 0x4a, (byte) 0x9e, (byte) 0x8a, (byte) 0xd4, (byte) 0xff};
        byte[] actual = DigestUtils.sha384(data);
        assertArrayEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSha512Hex_EYrh0() {
        String data = "Hello, World!";
        String expected = "86fb269d190d2c85f6e046d162d541895f024977ba78050a06d9b3f153a9997";
        String actual = DigestUtils.sha512Hex(data);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testShaHexString_Lwer1() {
        String data = "test";
        String expected = "a94a8fe5ccb19ba615441462bed4b50deb000b";
        String actual = DigestUtils.shaHex(data);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testShaHexBytes_DoiB2() {
        byte[] data = "test".getBytes();
        String expected = "a94a8fe5ccb19ba615441462bed4b50deb000b";
        String actual = DigestUtils.shaHex(data);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSha512_256_uGtl0() throws IOException, NoSuchAlgorithmException {
        InputStream data = null; // initialize data
        MessageDigest digest = MessageDigest.getInstance("SHA-512/256");
        byte[] result = DigestUtils.sha512_256(data);
        assertNotNull(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testMd5_EhZT0() {
        byte[] data = "Hello, World!".getBytes();
        byte[] expected = {-10, 87, -108, 101, -104, 111, 32, -73, 111, 114, 108, 100, 33};
        byte[] actual = DigestUtils.md5(data);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSha384Hex_FqMH0() {
        byte[] data = new byte[0];
        String expected = "38b060a751ac96384cd9327eb1b1e36a21fdb711ec0682b1e34f41e35677d412";
        String actual = DigestUtils.sha384Hex(data);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDigestAsHex_vZef0() {
        DigestUtils digestUtils = new DigestUtils();
        byte[] data = new byte[]{1, 2, 3};
        String expected = "010203";
        String actual = digestUtils.digestAsHex(data);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDigestAsHexWithString_gYhb2() {
        DigestUtils digestUtils = new DigestUtils("SHA-256");
        byte[] data = new byte[]{1, 2, 3};
        String expected = "a16243010203";
        String actual = digestUtils.digestAsHex(data);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSha512_256Hex_UduR0() {
        byte[] data = new byte[0];
        String expected = "cf83e1357eefb8bdf1542850d66d8007d620e4050b5715dc83f4a921d36ce9ce47d0d13c5d85f2b0ff8318d2877eec2f63b931bd47417a81a538327af927da3";
        String actual = DigestUtils.sha512_256Hex(data);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSha1_hlrf0() throws Exception {
        byte[] data = "Hello, World!".getBytes();
        byte[] expected = MessageDigest.getInstance("SHA-1").digest(data);
        byte[] actual = DigestUtils.sha1(data);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSha3_256Hex_FNiK0() {
        String data = "Hello, World!";
        String expected = "a1a668753b6956138ba8038694e29c807f47bf2a551796c46620641c0c5b06b";
        String actual = DigestUtils.sha3_256Hex(data);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDigest_ouLf0() {
        DigestUtils digestUtils = new DigestUtils();
        String data = "Hello, World!";
        byte[] expected = "Hello, World!".getBytes();
        byte[] actual = digestUtils.digest(data);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSha1_TtLT0() throws IOException, NoSuchAlgorithmException {
        InputStream data = null; // Initialize data
        MessageDigest digest = MessageDigest.getInstance("SHA-1"); // Initialize digest
        byte[] result = DigestUtils.sha1(data); // Call the method under test
        assertNotNull(result); // Assert that the result is not null
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDigest_qTyV0() {
        DigestUtils digestUtils = new DigestUtils();
        byte[] data = new byte[10];
        byte[] expected = new byte[10];
        byte[] actual = digestUtils.digest(data);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSha3_224Hex_tuYW0() {
        String data = "Hello, World!";
        String expected = "7102e757b45f31f33e527193130a7e705595e5d5e742596800000000000000";
        String actual = DigestUtils.sha3_224Hex(data);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSha3_224Hex_kHSt0() {
        byte[] data = new byte[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        String expected = "530f8afbc74536b9a963b4f1c4cb738f48b956e97b32205cb0a0e08a";
        String actual = DigestUtils.sha3_224Hex(data);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetMd5Digest_ZgXV0() {
        MessageDigest md5Digest = DigestUtils.getMd5Digest();
        assertNotNull(md5Digest);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSha512_aMtV0() {
        String data = "Hello, World!";
        byte[] expected = new byte[]{-11, 118, 101, -105, -100, 116, 111, 114, 101, 115, 105, 115, 116, 101, 110, 99, 101, 32, 111, 102, 32, 116, 104, 101, 32, 115, 116, 114, 105, 110, 103, 32, 34, 72, 101, 108, 108, 111, 44, 32, 87, 111, 114, 108, 100, 33, 34, 32, 119, 105, 116, 104, 32, 116, 104, 101, 32, 101, 110, 99, 111, 100, 105, 110, 103, 32, 34, 85, 84, 70, 45, 56, 34};
        byte[] actual = DigestUtils.sha512(data);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDigestAsHex_NGCr0() throws IOException {
        DigestUtils digestUtils = new DigestUtils();
        File file = new File("path_to_file");
        String expected = "expected_hex_digest";
        String actual = digestUtils.digestAsHex(file);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testgetSha512_256Digest_JdUo0() {
        MessageDigest messageDigest = DigestUtils.getSha512_256Digest();
        assertNotNull(messageDigest);
    }
}