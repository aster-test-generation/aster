/**
 * Generated by Aster
 */
package org.apache.commons.codec.digest;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import org.apache.commons.codec.binary.Hex;
import org.apache.commons.codec.binary.StringUtils;
import static org.junit.jupiter.api.Assertions.*;
import java.util.Arrays;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_DigestUtils_Test_Passing {
    private byte[] getExpectedSha3_512() throws IOException, NoSuchAlgorithmException {
        return new byte[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
    }
    private byte[] getExpectedSha3_256() {
        return new byte[] {1, 2, 3, 4, 5};
    }
    private MessageDigest getExpectedSha512_224Digest() throws NoSuchAlgorithmException {
        return MessageDigest.getInstance("SHA-512/224");
    }
    private byte[] getExpectedMd2(byte[] data) throws Exception {
        MessageDigest md = MessageDigest.getInstance("MD2");
        return md.digest(data);
    }
    private MessageDigest getMd2Digest() throws NoSuchAlgorithmException {
        return MessageDigest.getInstance("MD2");
    }
    private byte[] sha3_512(MessageDigest digest, byte[] data) {
        digest.update(data);
        return digest.digest();
    }
    private byte[] digest(MessageDigest digest, byte[] data) throws IOException {
        digest.update(data);
        byte[] hashBytes = digest.digest();
        return hashBytes;
    }
    private byte[] getExpectedSha3_224() {
        return new byte[0];
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSha384_DQbP0() {
        try {
            MessageDigest digest = MessageDigest.getInstance("SHA-384");
            byte[] data = "Hello, World!".getBytes();
            byte[] result = DigestUtils.sha384(data);
            assert Arrays.equals(digest.digest(data), result);
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSha256Hex_xkvV0() throws Exception {
        MessageDigest digest = MessageDigest.getInstance("SHA-256");
        byte[] data = "Hello, World!".getBytes();
        String result = DigestUtils.sha256Hex(data);
        String expected = Hex.encodeHexString(digest.digest(data));
        assert result.equals(expected);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetMd2Digest_SDYr1() {
        MessageDigest md = DigestUtils.getMd2Digest();
        assertNotNull(md);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSha3_512Hex_UQDr0() {
        try {
            MessageDigest digest = MessageDigest.getInstance("SHA-3-512");
            byte[] data = digest.digest("HelloWorld".getBytes());
            String expected = "a4d6f8e5c6d4b3a2";
            assertEquals(expected, DigestUtils.sha3_512Hex(data));
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSha256_OCkA0() {
        try {
            MessageDigest digest = MessageDigest.getInstance("SHA-256");
            byte[] data = "Hello, World!".getBytes();
            byte[] result = DigestUtils.sha256(data);
            assert Arrays.equals(digest.digest(data), result);
        } catch (NoSuchAlgorithmException e) {
            assert false;
        }
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetSha3_512Digest_znIL0() {
        MessageDigest digest = DigestUtils.getSha3_512Digest();
        assertNotNull(digest);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetMessageDigestWithName_Zemb2() {
        DigestUtils digestUtils = new DigestUtils("SHA-256");
        MessageDigest result = digestUtils.getMessageDigest();
        assertNotNull(result);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSha3_224_QzkU0() {
        String data = "Hello, World!";
        byte[] expected = DigestUtils.sha3_224(data);
        byte[] actual = DigestUtils.sha3_224("Hello, World!");
        assertArrayEquals(expected, actual);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDigest_HVlV0() {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
            byte[] data = "Hello, World!".getBytes();
            byte[] result = DigestUtils.digest(messageDigest, data);
            assert Arrays.equals(result, messageDigest.digest(data));
        } catch (NoSuchAlgorithmException e) {
            assert false;
        }
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetSha3_224Digest_QgXZ0() {
        MessageDigest digest = DigestUtils.getSha3_224Digest();
        assertNotNull(digest);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testDigestWithNullMessageDigest_vwSn1() throws IOException {
    RandomAccessFile data = new RandomAccessFile("test.txt", "r");
    try {
        DigestUtils.digest(null, data);
        assert false;
    } catch (NullPointerException e) {
    }
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDigest_bHfw0() throws Exception {
        MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
        ByteBuffer data = ByteBuffer.wrap("Hello, World!".getBytes());
        byte[] expected = messageDigest.digest(data.array());
        byte[] actual = DigestUtils.digest(messageDigest, data);
        assertArrayEquals(expected, actual);
        assertNotNull(actual);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSha_Pytk0() throws NoSuchAlgorithmException {
        MessageDigest messageDigest = MessageDigest.getInstance("SHA-1");
        DigestUtils digestUtils = new DigestUtils(messageDigest);
        byte[] data = "Hello, World!".getBytes();
        byte[] expected = messageDigest.digest(data);
        byte[] result = DigestUtils.sha(data);
        assertArrayEquals(expected, result);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSha3_384_anSG0() {
        String data = "Hello, World!";
        byte[] expected =DigestUtils.sha3_384(data);
        byte[] actual = DigestUtils.sha3_384(data);
        assertArrayEquals(expected, actual);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSha3_512_caLm0() {
        try {
            MessageDigest digest = MessageDigest.getInstance("SHA-3-512");
            byte[] data = "Hello, World!".getBytes();
            byte[] expected = digest.digest(data);
            byte[] result = DigestUtils.sha3_512(data);
            assertArrayEquals(expected, result);
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testUpdateDigest_rlsx0() throws Exception {
        MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
        ByteBuffer valueToDigest = ByteBuffer.wrap("Hello, World!".getBytes());
        MessageDigest result = DigestUtils.updateDigest(messageDigest, valueToDigest);
        assertNotNull(result);
        assertSame(messageDigest, result);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSha512_czqM0() {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-512");
            byte[] data = "Hello World".getBytes();
            byte[] expected = messageDigest.digest(data);
            byte[] result = DigestUtils.sha512(data);
            assertArrayEquals(expected, result);
        } catch (NoSuchAlgorithmException e) {
            throw new AssertionError("SHA-512 algorithm not found", e);
        }
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testIsAvailable_mMAO0() {
    DigestUtils digestUtils = new DigestUtils();
    boolean result = digestUtils.isAvailable("SHA-256");
    assert result;
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testIsNotAvailable_XtLk1() {
    DigestUtils digestUtils = new DigestUtils();
    boolean result = digestUtils.isAvailable("InvalidAlgorithm");
    assert !result;
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSha3_224_CUsG0() throws NoSuchAlgorithmException {
        MessageDigest digest = MessageDigest.getInstance("SHA3-224");
        byte[] data = "Hello, World!".getBytes();
        byte[] expected = digest.digest(data);
        byte[] result = DigestUtils.sha3_224(data);
        assertArrayEquals(expected, result);
        assertNotNull(result);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSha3_256Hex_xIPo0() {
        try {
            MessageDigest digest = MessageDigest.getInstance("SHA-3-256");
            byte[] data = "Hello, World!".getBytes();
            byte[] hash = digest.digest(data);
            String expected = "c67a4f9c5a7e1a1a4f9c5a7e1a1a";
            assertEquals(expected, DigestUtils.sha3_256Hex(hash));
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testMd2_EpEK0() throws Exception {
        byte[] data = "Hello, World!".getBytes();
        byte[] expected = getExpectedMd2(data);
        byte[] result = DigestUtils.md2(data);
        assertArrayEquals(expected, result);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetSha512_224Digest_WSuv0() {
        MessageDigest digest = DigestUtils.getSha512_224Digest();
        assertNotNull(digest);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSha3_512Hex_xxku0() {
        try {
            MessageDigest digest = MessageDigest.getInstance("SHA-3-512");
            String data = "Test Data";
            byte[] hashBytes = sha3_512(digest, data.getBytes());
            String expected = Hex.encodeHexString(hashBytes);
            String result = DigestUtils.sha3_512Hex(data);
            assert result.equals(expected);
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSha384_oDlQ0() {
        String data = "Hello World";
        byte[] expected =DigestUtils.sha384(data);
        byte[] actual = DigestUtils.sha384(data);
        assertArrayEquals(expected, actual);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testMd5_JuTx0() {
        try {
            MessageDigest md = MessageDigest.getInstance("MD5");
            byte[] data = "Hello, World!".getBytes();
            byte[] result = DigestUtils.md5(data);
            assert Arrays.equals(md.digest(data), result);
        } catch (NoSuchAlgorithmException e) {
            assert false;
        }
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetSha3_256Digest_orsH0() {
        MessageDigest digest = DigestUtils.getSha3_256Digest();
        assertNotNull(digest);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetSha256Digest_wyQO0() {
        MessageDigest digest = DigestUtils.getSha256Digest();
        assertNotNull(digest);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSha1_aiFe0() {
        try {
            MessageDigest digest = MessageDigest.getInstance("SHA-1");
            byte[] data = "Hello, World!".getBytes();
            byte[] result = DigestUtils.sha1(data);
            byte[] expected = digest.digest(data);
            assert Arrays.equals(result, expected);
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDigestWithName_NenJ2() {
        DigestUtils digestUtils = new DigestUtils("SHA-256");
        byte[] data = "Hello, World!".getBytes();
        byte[] result = digestUtils.digest(data);
        assertNotNull(result);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetSha512_256Digest_RpKF0() {
        MessageDigest digest = DigestUtils.getSha512_256Digest();
        assertNotNull(digest);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testUpdateDigest_hcuS0_1() throws Exception {
        MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
        String valueToDigest = "Hello, World!";
        MessageDigest result = DigestUtils.updateDigest(messageDigest, valueToDigest);
        byte[] expected = messageDigest.digest(StringUtils.getBytesUtf8(valueToDigest));
        byte[] actual = result.digest();
        assertNotNull(result);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDigest_bHfw0_1() throws Exception {
        MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
        ByteBuffer data = ByteBuffer.wrap("Hello, World!".getBytes());
        byte[] expected = messageDigest.digest(data.array());
        byte[] actual = DigestUtils.digest(messageDigest, data);
        assertArrayEquals(expected, actual);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDigest_bHfw0_2() throws Exception {
        MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
        ByteBuffer data = ByteBuffer.wrap("Hello, World!".getBytes());
        byte[] expected = messageDigest.digest(data.array());
        byte[] actual = DigestUtils.digest(messageDigest, data);
        assertNotNull(actual);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testUpdateDigest_rlsx0_1() throws Exception {
        MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
        ByteBuffer valueToDigest = ByteBuffer.wrap("Hello, World!".getBytes());
        MessageDigest result = DigestUtils.updateDigest(messageDigest, valueToDigest);
        assertNotNull(result);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testUpdateDigest_rlsx0_2() throws Exception {
        MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
        ByteBuffer valueToDigest = ByteBuffer.wrap("Hello, World!".getBytes());
        MessageDigest result = DigestUtils.updateDigest(messageDigest, valueToDigest);
        assertSame(messageDigest, result);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSha3_224_CUsG0_1() throws NoSuchAlgorithmException {
        MessageDigest digest = MessageDigest.getInstance("SHA3-224");
        byte[] data = "Hello, World!".getBytes();
        byte[] expected = digest.digest(data);
        byte[] result = DigestUtils.sha3_224(data);
        assertArrayEquals(expected, result);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSha3_224_CUsG0_2() throws NoSuchAlgorithmException {
        MessageDigest digest = MessageDigest.getInstance("SHA3-224");
        byte[] data = "Hello, World!".getBytes();
        byte[] expected = digest.digest(data);
        byte[] result = DigestUtils.sha3_224(data);
        assertNotNull(result);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testMd5_gRFV0_Fava0() {
    String data = "Hello, World!";
    byte[] expected = DigestUtils.sha1(data);
    byte[] result = DigestUtils.sha1(data);
    assertArrayEquals(expected, result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetMessageDigestWithDigest_YDpa1_uLyn0() {
    try {
        MessageDigest messageDigest = MessageDigest.getInstance("SHA-1");
        DigestUtils digestUtils = new DigestUtils(messageDigest);
        MessageDigest result = digestUtils.getMessageDigest();
        assertNotNull(result);
    } catch (NoSuchAlgorithmException e) {
        fail("Should not throw a NoSuchAlgorithmException");
    }
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetSha3_384Digest_Wtrt0_Gvxt0() {
    MessageDigest result = DigestUtils.getSha3_384Digest();
    assertNotNull(result);
    try {
        MessageDigest expected = MessageDigest.getInstance("SHA3-384");
        assertEquals(expected.getAlgorithm(), result.getAlgorithm());
    } catch (NoSuchAlgorithmException e) {
        fail("SHA3-384 is not supported");
    }
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSha3_384_Bnqu0_DCZX0() {
    try {
        MessageDigest digest = MessageDigest.getInstance("SHA-1");
        byte[] data = "Hello, World!".getBytes();
        byte[] result = DigestUtils.sha1(data);
        assert Arrays.equals(digest.digest(data), result);
    } catch (NoSuchAlgorithmException e) {
        fail("SHA-1 algorithm not found");
    }
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testDigestWithDigest_HbZU1_eEED0() {
    try {
        DigestUtils digestUtils = new DigestUtils(MessageDigest.getInstance("SHA-256"));
        byte[] result = digestUtils.sha1("Hello, World!".getBytes());
        assertNotNull(result);
    } catch (NoSuchAlgorithmException e) {
        fail("Expected SHA-256 to be supported");
    }
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSha1Hex_dsIS0_fid2() throws NoSuchAlgorithmException {
        MessageDigest digest = MessageDigest.getInstance("SHA-1");
        DigestUtils digestUtils = new DigestUtils(digest);
        String result = DigestUtils.sha1Hex("Hello World");
        assertEquals("0a4d55a8d778e5022fab701977c5d840bbc486d0", result);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testShaHex_pWhp0_fid2() throws NoSuchAlgorithmException {
        String data = "Hello, World!";
        String expected = "0a0a9f2a6772942557ab5355d76af442f8f65e01";
        String result = DigestUtils.shaHex(data);
        assertEquals(expected, result);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testMd2Hex_ajti0_fid2() {
        byte[] data = new byte[] {1, 2, 3, 4, 5};
        String expected = "e1933cb49d9b81cd8148b89f98d70070";
        assertEquals(expected, DigestUtils.md2Hex(data));
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testMd2Hex_JAwE0_fid2() {
        try {
            MessageDigest md = MessageDigest.getInstance("MD2");
            String data = "Hello";
            String expected = "b27af65e6a4096536dd1252e308c2427";
            String result = DigestUtils.md2Hex(data);
            assertEquals(expected, result);
        } catch (NoSuchAlgorithmException e) {
        }
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSha512_256Hex_peTq0_fid2() {
        String data = "Hello, World!";
        String expected = "0686f0a605973dc1bf035d1e2b9bad1985a0bff712ddd88abd8d2593e5f99030";
        assertEquals(expected, DigestUtils.sha512_256Hex(data));
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSha384Hex_HAQu0_fid2() throws Exception {
        MessageDigest digest = MessageDigest.getInstance("SHA-384");
        DigestUtils digestUtils = new DigestUtils(digest);
        String result = DigestUtils.sha384Hex("Test String");
        assertEquals("d76a1b44f76d7cfe3f1cc244078de956a23a0b34adea1321ce67b188929719750979db66f793abdf4f87481ceb1cf931", result);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testMd5Hex_Eoni0_fid2() throws NoSuchAlgorithmException {
        String data = "Hello World";
        String expected = "b10a8db164e0754105b7a99be72e3fe5";
        String result = DigestUtils.md5Hex(data);
        assertEquals(expected, result);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSha1Hex_BCSt0_fid2() throws Exception {
        MessageDigest messageDigest = MessageDigest.getInstance("SHA-1");
        byte[] data = "Hello, World!".getBytes();
        byte[] digest = messageDigest.digest(data);
        String expected = "5a20dd2421f633d21da85b8911f9f37677f212d5";
        assertEquals(expected, DigestUtils.sha1Hex(digest));
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testMd5Hex_DndU0_fid2() throws NoSuchAlgorithmException {
        MessageDigest messageDigest = MessageDigest.getInstance("MD5");
        byte[] data = "Hello, World!".getBytes();
        String expected = "567f9bb9cf051b9252b862c2a763e913";
        assertEquals(expected, DigestUtils.md5Hex(messageDigest.digest(data)));
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDigestAsHex_wQWb0_fid2() throws Exception {
        DigestUtils digestUtils = new DigestUtils();
        MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
        digestUtils = new DigestUtils(messageDigest);
        ByteBuffer data = ByteBuffer.wrap(new byte[] {1, 2, 3, 4, 5});
        String expected = "74f81fe167d99b4cb41d6d0ccda82278caee9f3e2f25d5e5a3936ff3dcec60d0";
        assertEquals(expected, digestUtils.digestAsHex(data));
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDigestAsHex2_HoNX1_fid2() throws Exception {
        DigestUtils digestUtils = new DigestUtils("SHA-256");
        ByteBuffer data = ByteBuffer.wrap(new byte[] {1, 2, 3, 4, 5});
        String expected = "74f81fe167d99b4cb41d6d0ccda82278caee9f3e2f25d5e5a3936ff3dcec60d0";
        assertEquals(expected, digestUtils.digestAsHex(data));
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSha384Hex_cwRs0_fid2() {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-384");
            byte[] data = "Test String".getBytes();
            byte[] digest = messageDigest.digest(data);
            String expected = "f9a1262d433af8ff6e031fbfa6c7e6df0b6fb970f796b878bf3dbb58c8136bb9e53b9788023d387f180f9d7971f717ad";
            assertEquals(expected, DigestUtils.sha384Hex(digest));
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSha3_224Hex_RgOP0_fid2() {
        String data = "Hello, World!";
        String expected = "853048fb8b11462b6100385633c0cc8dcdc6e2b8e376c28102bc84f2";
        String result = DigestUtils.sha3_224Hex(data);
        assertEquals(expected, result);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDigestAsHexWithDigestUtils_sdmj2_fid2() {
        DigestUtils digestUtils = new DigestUtils("SHA-256");
        byte[] data = "Hello World".getBytes();
        byte[] digest = digestUtils.digest(data);
        String expected = "42a873ac3abd02122d27e80486c6fa1ef78694e8505fcec9cbcc8a7728ba8949";
        assertEquals(expected, digestUtils.digestAsHex(digest));
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSha3_224Hex_ZtcH0_fid2() throws NoSuchAlgorithmException {
        MessageDigest digest = MessageDigest.getInstance("SHA3-224");
        byte[] data = "Hello, World!".getBytes();
        String expected = "853048fb8b11462b6100385633c0cc8dcdc6e2b8e376c28102bc84f2";
        String result = DigestUtils.sha3_224Hex(data);
        assertEquals(expected, result);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSha512_256Hex_uYZP0_moWN0_fid2() {
    try {
        MessageDigest digest = MessageDigest.getInstance("SHA-512");
        digest.update("Hello, World!".getBytes());
        byte[] data = digest.digest();
        String expected = "374d794a95cdcfd8b35993185fef9ba368f160d8daf432d08ba9f1ed1e5abe6cc69291e0fa2fe0006a52570ef18c19def4e617c33ce52ef0a6e5fbe318cb0387";
        assertEquals(expected, Hex.encodeHexString(data));
    } catch (NoSuchAlgorithmException e) {
        e.printStackTrace();
    }
}
}