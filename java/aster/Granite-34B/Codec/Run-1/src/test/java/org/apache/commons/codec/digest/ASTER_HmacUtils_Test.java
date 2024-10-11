/**
 * Generated by Aster
 */
package org.apache.commons.codec.digest;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.concurrent.TimeUnit;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

public class Aster_HmacUtils_Test {
    {
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHmacHexWithDifferentValuesToDigest_YGOt2() {
        HmacUtils hmacUtils = new HmacUtils(HmacAlgorithms.HMAC_SHA_256, "key");
        String result1 = hmacUtils.hmacHex("value1");
        String result2 = hmacUtils.hmacHex("value2");
        assertNotEquals(result1, result2);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void test_getHmacSha384_with_byte_array_parameter_NhmE0() {
        byte[] key = new byte[10];
        Mac mac = HmacUtils.getHmacSha384(key);
        assertNotNull(mac);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsAvailable_nddQ0() {
        HmacAlgorithms name1 = HmacAlgorithms.HMAC_SHA_256;
        boolean expected1 = true;
        boolean actual1 = HmacUtils.isAvailable(name1);
        assertEquals(expected1, actual1);
        HmacAlgorithms name2 = HmacAlgorithms.HMAC_MD5;
        boolean expected2 = false;
        boolean actual2 = HmacUtils.isAvailable(name2);
        assertEquals(expected2, actual2);
        HmacAlgorithms name3 = null;
        boolean expected3 = false;
        boolean actual3 = HmacUtils.isAvailable(name3);
        assertEquals(expected3, actual3);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHmac_wCCy0() {
        HmacUtils hmacUtils = new HmacUtils(HmacAlgorithms.HMAC_SHA_256, "key");
        byte[] hmac = hmacUtils.hmac("valueToDigest");
        byte[] expected = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31};
        assertArrayEquals(expected, hmac);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHmacSha384_SncY0() {
        byte[] expected = { /* expected result */ };
        byte[] actual = HmacUtils.hmacSha384("key", "valueToDigest");
        assertArrayEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testUpdateHmacWithNullMac_qrcs1() {
        Mac mac = null;
        byte[] valueToDigest = new byte[10];
        Mac updatedMac = HmacUtils.updateHmac(mac, valueToDigest);
        assertEquals(mac, updatedMac);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testUpdateHmacWithBothNull_kEpb3() {
        Mac mac = null;
        byte[] valueToDigest = null;
        Mac updatedMac = HmacUtils.updateHmac(mac, valueToDigest);
        assertEquals(mac, updatedMac);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHmacMd5Hex_qYyc0() {
        String key = "key";
        String valueToDigest = "valueToDigest";
        String expected = "expected";
        String actual = HmacUtils.hmacMd5Hex(key, valueToDigest);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHmacMd5HexCoverage_CXcW1() {
        String key = "key";
        String valueToDigest = "valueToDigest";
        HmacUtils.hmacMd5Hex(key, valueToDigest);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void getHmacSha1Test_vPuP0() {
        byte[] key = new byte[0];
        Mac hmacSha1 = HmacUtils.getHmacSha1(key);
        assertNotNull(hmacSha1);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void getHmacSha1Test2_nTmg1() {
        byte[] key = new byte[1];
        Mac hmacSha1 = HmacUtils.getHmacSha1(key);
        assertNotNull(hmacSha1);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void getHmacSha1Test3_Wbjf2() {
        byte[] key = new byte[2];
        Mac hmacSha1 = HmacUtils.getHmacSha1(key);
        assertNotNull(hmacSha1);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHmacSha384Hex_FZUR0() {
        String key = "my_key";
        String valueToDigest = "my_value";
        String expected = "expected_result";
        String actual = HmacUtils.hmacSha384Hex(key, valueToDigest);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHmacSha384HexWithEmptyKey_IvZi1() {
        String key = "";
        String valueToDigest = "my_value";
        String expected = "expected_result";
        String actual = HmacUtils.hmacSha384Hex(key, valueToDigest);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHmacSha384HexWithEmptyValue_ClaX2() {
        String key = "my_key";
        String valueToDigest = "";
        String expected = "expected_result";
        String actual = HmacUtils.hmacSha384Hex(key, valueToDigest);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHmacSha384HexWithNullKey_FyJB3() {
        String key = null;
        String valueToDigest = "my_value";
        String expected = "expected_result";
        String actual = HmacUtils.hmacSha384Hex(key, valueToDigest);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHmacSha384HexWithNullValue_PiiN4() {
        String key = "my_key";
        String valueToDigest = null;
        String expected = "expected_result";
        String actual = HmacUtils.hmacSha384Hex(key, valueToDigest);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHmacSha384HexWithNullKeyAndValue_CKKx5() {
        String key = null;
        String valueToDigest = null;
        String expected = "expected_result";
        String actual = HmacUtils.hmacSha384Hex(key, valueToDigest);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void test_getHmacSha512_with_null_parameter_MzEy1() {
        final byte[] key = null;
        final Mac mac = HmacUtils.getHmacSha512(key);
        assertNotNull(mac);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void test_getHmacSha512_with_empty_byte_array_parameter_MzXB2() {
        final byte[] key = new byte[]{};
        final Mac mac = HmacUtils.getHmacSha512(key);
        assertNotNull(mac);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHmacSha1Hex_MLLY0() {
        String expected = "5f45a9d90f7b0d40d32835cdef4d315f";
        String actual = HmacUtils.hmacSha1Hex("key".getBytes(), "valueToDigest".getBytes());
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHmacSha1HexWithDifferentKeys_yVfN1() {
        String expected1 = "5f45a9d90f7b0d40d32835cdef4d315f";
        String actual1 = HmacUtils.hmacSha1Hex("key1".getBytes(), "valueToDigest".getBytes());
        assertEquals(expected1, actual1);
        String expected2 = "a1b2c3d4e5f6a7b8c9d0e1f2a3b4c5d6";
        String actual2 = HmacUtils.hmacSha1Hex("key2".getBytes(), "valueToDigest".getBytes());
        assertEquals(expected2, actual2);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHmacSha1HexWithDifferentValuesToDigest_aPKr2() {
        String expected1 = "5f45a9d90f7b0d40d32835cdef4d315f";
        String actual1 = HmacUtils.hmacSha1Hex("key".getBytes(), "value1ToDigest".getBytes());
        assertEquals(expected1, actual1);
        String expected2 = "a1b2c3d4e5f6a7b8c9d0e1f2a3b4c5d6";
        String actual2 = HmacUtils.hmacSha1Hex("key".getBytes(), "value2ToDigest".getBytes());
        assertEquals(expected2, actual2);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHmacSha1HexWithDifferentKeysAndValuesToDigest_qNFz3() {
        String expected1 = "5f45a9d90f7b0d40d32835cdef4d315f";
        String actual1 = HmacUtils.hmacSha1Hex("key1".getBytes(), "value1ToDigest".getBytes());
        assertEquals(expected1, actual1);
        String expected2 = "a1b2c3d4e5f6a7b8c9d0e1f2a3b4c5d6";
        String actual2 = HmacUtils.hmacSha1Hex("key2".getBytes(), "value2ToDigest".getBytes());
        assertEquals(expected2, actual2);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHmacSha1HexWithEmptyKey_MbUv4() {
        String expected = "9c61e1a83f0e4f62f493a7f1f0e0f9f9";
        String actual = HmacUtils.hmacSha1Hex("".getBytes(), "valueToDigest".getBytes());
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHmacSha1HexWithEmptyValueToDigest_Ahpo5() {
        String expected = "fbdb1d1b18aa6c08324b7d64b71fb763";
        String actual = HmacUtils.hmacSha1Hex("key".getBytes(), "".getBytes());
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHmacMd5Hex_lKLC0() {
        byte[] key = new byte[]{0x0b, 0x0b, 0x0b, 0x0b, 0x0b, 0x0b, 0x0b, 0x0b, 0x0b, 0x0b, 0x0b, 0x0b, 0x0b, 0x0b, 0x0b, 0x0b};
        byte[] valueToDigest = "Hi There".getBytes();
        String expected = "9294727a3638bb1c13f48ef8158bf039";
        String actual = HmacUtils.hmacMd5Hex(key, valueToDigest);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHmacSha1Hex_Ibii0() {
        String key = "key";
        String valueToDigest = "valueToDigest";
        String expected = new HmacUtils(HmacAlgorithms.HMAC_SHA_1, key).hmacHex(valueToDigest);
        String actual = HmacUtils.hmacSha1Hex(key, valueToDigest);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHmacSha256Hex_HsGG0() {
        byte[] key = new byte[]{0x0b, 0x0b, 0x0b, 0x0b, 0x0b, 0x0b, 0x0b, 0x0b, 0x0b, 0x0b, 0x0b, 0x0b, 0x0b, 0x0b, 0x0b, 0x0b};
        byte[] valueToDigest = new byte[]{0x48, 0x69, 0x20, 0x54, 0x68, 0x65, 0x72, 0x65};
        String expected = "b0344c61d8db38535ca8afceaf0bf12b881dc200c9833da726e9376c2e32cff7";
        String actual = HmacUtils.hmacSha256Hex(key, valueToDigest);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void test1_MUQp0() {
        HmacAlgorithms algorithm = HmacAlgorithms.HMAC_MD5;
        byte[] key = new byte[0];
        Mac mac = HmacUtils.getInitializedMac(algorithm, key);
        assertNotNull(mac);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void test2_tIgO1() {
        HmacAlgorithms algorithm = HmacAlgorithms.HMAC_SHA_1;
        byte[] key = new byte[0];
        Mac mac = HmacUtils.getInitializedMac(algorithm, key);
        assertNotNull(mac);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void test3_XGpS2() {
        HmacAlgorithms algorithm = HmacAlgorithms.HMAC_SHA_224;
        byte[] key = new byte[0];
        Mac mac = HmacUtils.getInitializedMac(algorithm, key);
        assertNotNull(mac);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void test4_XMID3() {
        HmacAlgorithms algorithm = HmacAlgorithms.HMAC_SHA_256;
        byte[] key = new byte[0];
        Mac mac = HmacUtils.getInitializedMac(algorithm, key);
        assertNotNull(mac);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void test5_zElN4() {
        HmacAlgorithms algorithm = HmacAlgorithms.HMAC_SHA_384;
        byte[] key = new byte[0];
        Mac mac = HmacUtils.getInitializedMac(algorithm, key);
        assertNotNull(mac);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void test6_GCps5() {
        HmacAlgorithms algorithm = HmacAlgorithms.HMAC_SHA_512;
        byte[] key = new byte[0];
        Mac mac = HmacUtils.getInitializedMac(algorithm, key);
        assertNotNull(mac);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHmacSha512Hex_nullKey_LkWI1() {
        assertEquals("e3b0c44298fc1c149afbf4c8996fb92427ae41e4649b934ca495991b7852b855", HmacUtils.hmacSha512Hex(null, "valueToDigest"));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHmacSha512Hex_emptyKey_XpMq3() {
        assertEquals("e3b0c44298fc1c149afbf4c8996fb92427ae41e4649b934ca495991b7852b855", HmacUtils.hmacSha512Hex("", "valueToDigest"));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHmacSha256_1_wfQZ0() {
        byte[] hmac = HmacUtils.hmacSha256("key", "valueToDigest");
        byte[] expected = {0x01, 0x02, 0x03};
        Assertions.assertArrayEquals(expected, hmac);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHmacSha256_2_jLBt1() {
        byte[] hmac = HmacUtils.hmacSha256("key", "valueToDigest");
        byte[] expected = {0x04, 0x05, 0x06};
        Assertions.assertArrayEquals(expected, hmac);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHmacSha256_3_QePu2() {
        byte[] hmac = HmacUtils.hmacSha256("key", "valueToDigest");
        byte[] expected = {0x07, 0x08, 0x09};
        Assertions.assertArrayEquals(expected, hmac);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHmacSha384Hex_OvmA0() throws IOException {
        String expected = "3a854166ac5d9f023f54d517d0b39db8442c3e86";
        String actual = HmacUtils.hmacSha384Hex("key".getBytes(), "value".getBytes());
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHmacMd5_hKjM0() {
        byte[] result1 = HmacUtils.hmacMd5("key1", "value1");
        byte[] expected1 = {0x01, 0x02, 0x03}; // Replace with the expected result
        Assertions.assertArrayEquals(expected1, result1);
        byte[] result2 = HmacUtils.hmacMd5("key2", "value2");
        byte[] expected2 = {0x04, 0x05, 0x06}; // Replace with the expected result
        Assertions.assertArrayEquals(expected2, result2);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void test_getHmacMd5_with_null_parameter_jUht1() {
        byte[] key = null;
        Mac mac = HmacUtils.getHmacMd5(key);
        assertNotNull(mac);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void test_getHmacMd5_with_empty_byte_array_parameter_aevY2() {
        byte[] key = new byte[0];
        Mac mac = HmacUtils.getHmacMd5(key);
        assertNotNull(mac);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHmacSha256Hex_PWBi0() {
        String key = "key";
        String valueToDigest = "valueToDigest";
        String expected = "expected";
        String actual = HmacUtils.hmacSha256Hex(key, valueToDigest);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHmacSha256HexWithEmptyKey_BJng1() {
        String key = "";
        String valueToDigest = "valueToDigest";
        String expected = "expected";
        String actual = HmacUtils.hmacSha256Hex(key, valueToDigest);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHmacSha256HexWithEmptyValueToDigest_IEPU2() {
        String key = "key";
        String valueToDigest = "";
        String expected = "expected";
        String actual = HmacUtils.hmacSha256Hex(key, valueToDigest);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHmacSha256HexWithEmptyKeyAndValueToDigest_WnfN3() {
        String key = "";
        String valueToDigest = "";
        String expected = "expected";
        String actual = HmacUtils.hmacSha256Hex(key, valueToDigest);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void getInitializedMac_with_HMAC_SHA_1_and_key_should_return_NotNull_Mac_instance_aHXa0() {
        String algorithm = "HMAC_SHA_1";
        byte[] key = new byte[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15};
        Mac mac = HmacUtils.getInitializedMac(algorithm, key);
        assertNotNull(mac);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void getInitializedMac_with_HMAC_SHA_256_and_key_should_return_NotNull_Mac_instance_Adgz1() {
        String algorithm = "HMAC_SHA_256";
        byte[] key = new byte[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15};
        Mac mac = HmacUtils.getInitializedMac(algorithm, key);
        assertNotNull(mac);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testUpdateHmacWithNullInputStream_PNOJ2() throws Exception {
        Mac mac = Mac.getInstance("HmacSHA256");
        mac.init(new SecretKeySpec("key".getBytes(), "HmacSHA256"));
        InputStream valueToDigest = null;
        IOException exception = assertThrows(IOException.class, () -> HmacUtils.updateHmac(mac, valueToDigest));
        assertEquals("InputStream must not be null", exception.getMessage());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHmacSha512HexWithEmptyKey_XmOh1() {
        byte[] key = new byte[0];
        byte[] valueToDigest = "Hello, World!".getBytes();
        String expected = "f1d63d63a0c4d04e0f5d9f2d3f4d7d8d0a0a3d8d0a0a3d8d0a0a3d8d0a0a3d8d";
        String actual = HmacUtils.hmacSha512Hex(key, valueToDigest);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHmacSha512HexWithEmptyKeyAndValueToDigest_DDMT3() {
        byte[] key = new byte[0];
        byte[] valueToDigest = new byte[0];
        String expected = "f1d63d63a0c4d04e0f5d9f2d3f4d7d8d0a0a3d8d0a0a3d8d0a0a3d8d0a0a3d8d";
        String actual = HmacUtils.hmacSha512Hex(key, valueToDigest);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHmacHex_mWSk0() {
        HmacUtils hmacUtils = new HmacUtils("algorithm", new byte[]{0x00, 0x01, 0x02});
        ByteBuffer valueToDigest = ByteBuffer.allocate(10);
        assertEquals("expected", hmacUtils.hmacHex(valueToDigest));
    }
}