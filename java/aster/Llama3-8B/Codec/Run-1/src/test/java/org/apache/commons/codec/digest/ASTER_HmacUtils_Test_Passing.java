/**
 * Generated by Aster
 */
package org.apache.commons.codec.digest;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.concurrent.TimeUnit;
import javax.crypto.Mac;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

public class Aster_HmacUtils_Test_Passing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetHmacSha256_SzIk0() {
        byte[] key = new byte[]{1, 2, 3, 4, 5};
        Mac hmacSha256 = HmacUtils.getHmacSha256(key);
        assertNotNull(hmacSha256);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsAvailableHmacMd5_FIxe0() {
        boolean result = HmacUtils.isAvailable("HmacMD5");
        assert result;
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsAvailableHmacSha1_KNFV1() {
        boolean result = HmacUtils.isAvailable("HmacSHA1");
        assert result;
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsAvailableHmacSha224_sPcI2() {
        boolean result = HmacUtils.isAvailable("HmacSHA224");
        assert result;
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsAvailableHmacSha256_ifkw3() {
        boolean result = HmacUtils.isAvailable("HmacSHA256");
        assert result;
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsAvailableHmacSha384_HapW4() {
        boolean result = HmacUtils.isAvailable("HmacSHA384");
        assert result;
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsAvailableHmacSha512_UVVc5() {
        boolean result = HmacUtils.isAvailable("HmacSHA512");
        assert result;
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsAvailableInvalidAlgorithm_CBol6() {
        boolean result = HmacUtils.isAvailable("InvalidAlgorithm");
        assert !result;
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHmacSha512_Hobh0() {
        byte[] key = "key".getBytes();
        byte[] valueToDigest = "valueToDigest".getBytes();
        byte[] result = HmacUtils.hmacSha512(key, valueToDigest);
        assert result != null;
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHmacSha512_yuSD0() {
        String key = "testKey";
        String valueToDigest = "testValue";
        byte[] expected = HmacUtils.hmacSha512(key, valueToDigest);
        byte[] actual = HmacUtils.hmacSha512(key, valueToDigest);
        assert Arrays.equals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHmacHex_mAUg0() {
        HmacUtils hmacUtils = new HmacUtils(HmacAlgorithms.HMAC_SHA_256, "key".getBytes());
        String result = hmacUtils.hmacHex("valueToDigest".getBytes());
        assertEquals("19fce7c225381ea446738019472fc2835a53dc59604fe6e39b70b8525dda997d", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHmacHex_SYDD0() {
        HmacUtils hmacUtils = new HmacUtils(HmacAlgorithms.HMAC_SHA_256, "mykey".getBytes());
        String result = hmacUtils.hmacHex("Hello, World!");
        assertEquals("f32aa906ff6e5c3cc35f2e267cb12f28ae26302f98c234eba50e5d2953319a7c", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHmacSha384_gYTz0() {
        byte[] key = "key".getBytes();
        byte[] valueToDigest = "value".getBytes();
        byte[] expected = HmacUtils.hmacSha384(key, valueToDigest);
        byte[] actual = HmacUtils.hmacSha384(key, valueToDigest);
        assert Arrays.equals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsAvailable_HMAC_MD5_AgZs0() {
        boolean result = HmacUtils.isAvailable(HmacAlgorithms.HMAC_MD5);
        assert result;
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsAvailable_HMAC_SHA_1_mleV1() {
        boolean result = HmacUtils.isAvailable(HmacAlgorithms.HMAC_SHA_1);
        assert result;
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsAvailable_HMAC_SHA_224_QTDt2() {
        boolean result = HmacUtils.isAvailable(HmacAlgorithms.HMAC_SHA_224);
        assert result;
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsAvailable_HMAC_SHA_256_TqzV3() {
        boolean result = HmacUtils.isAvailable(HmacAlgorithms.HMAC_SHA_256);
        assert result;
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsAvailable_HMAC_SHA_384_LqJp4() {
        boolean result = HmacUtils.isAvailable(HmacAlgorithms.HMAC_SHA_384);
        assert result;
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsAvailable_HMAC_SHA_512_QDkd5() {
        boolean result = HmacUtils.isAvailable(HmacAlgorithms.HMAC_SHA_512);
        assert result;
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHmacSha256_VzSE0() {
        byte[] key = "key".getBytes();
        byte[] valueToDigest = "valueToDigest".getBytes();
        byte[] expected = HmacUtils.hmacSha256(key, valueToDigest);
        byte[] actual = HmacUtils.hmacSha256(key, valueToDigest);
        assert Arrays.equals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHmacMd5_TAxO0() {
        HmacUtils hmacUtils = new HmacUtils(HmacAlgorithms.HMAC_MD5, "myKey".getBytes());
        byte[] hmac = hmacUtils.hmac("valueToDigest");
        assertNotNull(hmac);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHmacSha1_xwoZ1() {
        HmacUtils hmacUtils = new HmacUtils(HmacAlgorithms.HMAC_SHA_1, "myKey".getBytes());
        byte[] hmac = hmacUtils.hmac("valueToDigest");
        assertNotNull(hmac);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHmacSha224_GTUD2() {
        HmacUtils hmacUtils = new HmacUtils(HmacAlgorithms.HMAC_SHA_224, "myKey".getBytes());
        byte[] hmac = hmacUtils.hmac("valueToDigest");
        assertNotNull(hmac);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHmacSha256_fXbr3() {
        HmacUtils hmacUtils = new HmacUtils(HmacAlgorithms.HMAC_SHA_256, "myKey".getBytes());
        byte[] hmac = hmacUtils.hmac("valueToDigest");
        assertNotNull(hmac);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHmacSha384_EqZU4() {
        HmacUtils hmacUtils = new HmacUtils(HmacAlgorithms.HMAC_SHA_384, "myKey".getBytes());
        byte[] hmac = hmacUtils.hmac("valueToDigest");
        assertNotNull(hmac);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHmacSha512_xDWd5() {
        HmacUtils hmacUtils = new HmacUtils(HmacAlgorithms.HMAC_SHA_512, "myKey".getBytes());
        byte[] hmac = hmacUtils.hmac("valueToDigest");
        assertNotNull(hmac);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHmacSha384_UAnq0() {
        String key = "testKey";
        String valueToDigest = "testValue";
        byte[] expectedResult = HmacUtils.hmacSha384(key, valueToDigest);
        byte[] actualResult = HmacUtils.hmacSha384(key, valueToDigest);
        assert Arrays.equals(expectedResult, actualResult);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHmacMd5Hex_ssHK0() {
        String key = "mykey";
        String valueToDigest = "myvalue";
        String expected = "f0b8d7a0f35f1df662ad928e7ac3aa1f";
        String actual = HmacUtils.hmacMd5Hex(key, valueToDigest);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetHmacSha1_WzkA0() {
        byte[] key = new byte[]{(byte) 0x01, (byte) 0x02, (byte) 0x03, (byte) 0x04};
        Mac hmac = HmacUtils.getHmacSha1(key);
        assertNotNull(hmac);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHmacSha384Hex_rNxO0() {
        String key = "myKey";
        String valueToDigest = "myValue";
        String expected = "fc83f5087956214a0c98831ae615c060345b21f3e9c6a36aaf7e34ad4e6bbfc116edaf6f120d0e7a7e73d31ed57b0012";
        String actual = HmacUtils.hmacSha384Hex(key, valueToDigest);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetHmacSha512_YUap0() {
        byte[] key = new byte[]{(byte) 0x01, (byte) 0x02, (byte) 0x03, (byte) 0x04};
        Mac hmac = HmacUtils.getHmacSha512(key);
        assertNotNull(hmac);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHmacSha1Hex_oJVx0() {
        String key = "mykey";
        byte[] valueToDigest = "myvalue".getBytes();
        String expected = "e54cd0b1d624548a5cde6926f53eafd6458a4b67"; // expected hash value
        String actual = HmacUtils.hmacSha1Hex(key.getBytes(), valueToDigest);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHmacMd5Hex_pzUf0() {
        byte[] key = "key".getBytes();
        byte[] valueToDigest = "value".getBytes();
        String result = HmacUtils.hmacMd5Hex(key, valueToDigest);
        assertEquals("01433efd5f16327ea4b31144572c67f6", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHmacSha1Hex_clLO0() {
        String key = "myKey";
        String valueToDigest = "myValue";
        String expected = "31fed10b28656038b112bc0783008a8b0c39ea4e";
        String actual = HmacUtils.hmacSha1Hex(key, valueToDigest);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHmacSha384Hex_EMXQ0() {
        String key = "key";
        byte[] keyBytes = key.getBytes();
        byte[] valueToDigest = "valueToDigest".getBytes();
        String expected = "06033628cccfbb7ed0b91f0aeeee422e566eee5f653993d775f37ce31db7f08b67f9267948b4aa2d6c2ca9d367c8939d";
        String actual = HmacUtils.hmacSha384Hex(keyBytes, valueToDigest);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHmacSha512Hex_BJQP0() {
        String key = "mykey";
        String valueToDigest = "myvalue";
        String expected = "a2cd0f8daeda188672614ef0b4eef92614b1916554437a2fb16735150a352ea45f5702f88eb480649c880dcebaf31d312dc8a99ea78bc1719715c09830042525";
        String result = HmacUtils.hmacSha512Hex(key, valueToDigest);
        assertEquals(expected, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHmacSha1_JGed0() {
        byte[] key = "key".getBytes();
        byte[] valueToDigest = "valueToDigest".getBytes();
        byte[] expected = HmacUtils.hmacSha1(key, valueToDigest);
        byte[] actual = HmacUtils.hmacSha1(key, valueToDigest);
        assertArrayEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHmacMd5_LBsC0() {
        String key = "mykey";
        String valueToDigest = "myvalue";
        byte[] expected = HmacUtils.hmacMd5(key, valueToDigest);
        byte[] actual = HmacUtils.hmacMd5(key, valueToDigest);
        assert Arrays.equals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetHmacMd5_rzel0() {
        byte[] key = "key".getBytes();
        Mac hmac = HmacUtils.getHmacMd5(key);
        assertNotNull(hmac);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHmacSha256Hex_bwAI0() {
        String key = "myKey";
        String valueToDigest = "myValue";
        String expectedResult = "bb7dc468984a17a1b2258e1041577bf145da345e80ffb61caa805faabec091e4";
        String actualResult = HmacUtils.hmacSha256Hex(key, valueToDigest);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetInitializedMacNullKey_RVWG1() {
        try {
            HmacUtils.getInitializedMac("HMAC_SHA_256", null);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHmacMd5_AOOs0() {
        byte[] key = "key".getBytes();
        byte[] valueToDigest = "valueToDigest".getBytes();
        byte[] expected = HmacUtils.hmacMd5(key, valueToDigest);
        byte[] actual = HmacUtils.hmacMd5(key, valueToDigest);
        assert Arrays.equals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHmacSha512Hex_dAHP0() {
        byte[] key = "key".getBytes();
        byte[] valueToDigest = "valueToDigest".getBytes();
        String result = HmacUtils.hmacSha512Hex(key, valueToDigest);
        Assertions.assertEquals("1b7a0dffd88f80d8499ba4f014ed94ccdc185564eddd9fac6cdca3efeea9f2f8ebb77cfa95e6d43d7c7f56cd693e4ab58e3d1d99b02ef51d0bc4659de86c4380", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHmacSha512Hex_ivAl0_bydn0() throws IOException {
        byte[] key = "key".getBytes();
        byte[] valueToDigest = "value".getBytes();
        HmacUtils hmacUtils = new HmacUtils(HmacAlgorithms.HMAC_SHA_512, key);
        String actual = hmacUtils.hmacHex(ByteBuffer.wrap(valueToDigest));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHmacHex3_ulnb2_LDpr0() throws IOException {
        HmacUtils hmacUtils = new HmacUtils(HmacAlgorithms.HMAC_SHA_256, "key".getBytes());
        ByteBuffer valueToDigest = ByteBuffer.wrap("valueToDigest".getBytes());
        String result = hmacUtils.hmacHex(valueToDigest);
        assertEquals("19fce7c225381ea446738019472fc2835a53dc59604fe6e39b70b8525dda997d", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHmacMd5_MAwx0_CnQF0() throws IOException {
        HmacUtils hmacUtils = new HmacUtils(HmacAlgorithms.HMAC_MD5, "key".getBytes());
        byte[] hmac = hmacUtils.hmac(ByteBuffer.wrap("valueToDigest".getBytes()));
        assert hmac.length > 0;
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHmacSha256_RjKA1_JAtz0() throws IOException {
        HmacUtils hmacUtils = new HmacUtils(HmacAlgorithms.HMAC_SHA_256, "key".getBytes());
        byte[] hmac = hmacUtils.hmac(ByteBuffer.wrap("valueToDigest".getBytes()));
        assert hmac.length > 0;
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetHmacSha384_kAWA0_CqMD0_1() {
        byte[] key = {(byte) 0x01, (byte) 0x02, (byte) 0x03, (byte) 0x04, (byte) 0x05};
        Mac hmac = HmacUtils.getHmacSha384(key);
        byte[] expectedMac = hmac.doFinal();
        assertEquals("HmacSHA384", hmac.getAlgorithm());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHmacSha256_RMPH0() {
        String key = "mykey";
        String valueToDigest = "myvalue";
        byte[] expected = HmacUtils.hmacSha256(key, valueToDigest);
        byte[] actual = HmacUtils.hmacSha256(key, valueToDigest);
        assert Arrays.equals(expected, actual);
    }
}