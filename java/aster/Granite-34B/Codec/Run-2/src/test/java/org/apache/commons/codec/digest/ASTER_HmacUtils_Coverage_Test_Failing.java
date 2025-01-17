/**
 * Generated by Aster
 */
package org.apache.commons.codec.digest;

import java.security.NoSuchAlgorithmException;
import java.util.concurrent.TimeUnit;
import javax.crypto.Mac;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_HmacUtils_Coverage_Test_Failing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void test_getHmacSha256_0_IFvI0() throws Exception {
        byte[] key = null;
        Mac result = HmacUtils.getHmacSha256(key);
        assertEquals(null, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void hmacSha1_test1_ODBB0() {
        String key = "key";
        String valueToDigest = "valueToDigest";
        byte[] expected = new byte[]{1, 2, 3};
        byte[] actual = HmacUtils.hmacSha1(key, valueToDigest);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void hmacSha384Hex_test1_PEEU0() {
        byte[] key = new byte[0];
        byte[] valueToDigest = new byte[0];
        HmacUtils hmacUtils = new HmacUtils(HmacAlgorithms.HMAC_SHA_384, key);
        String result = hmacUtils.hmacHex(valueToDigest);
        assertEquals("", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsAvailable3_cGMv2_TtPM0() throws NoSuchAlgorithmException {
        String name = "hmac";
        Mac mac = Mac.getInstance(name);
        boolean actual = HmacUtils.isAvailable(name);
        assertTrue(actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsAvailable2_gENH1_fid2() {
        String name = "hmac";
        boolean actual = HmacUtils.isAvailable(name);
        assertTrue(actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void hmacSha512Hex_test1_sEQg0_fid2() {
        byte[] key = new byte[]{0x0b, 0x0b, 0x0b, 0x0b, 0x0b, 0x0b, 0x0b, 0x0b, 0x0b, 0x0b, 0x0b, 0x0b, 0x0b, 0x0b, 0x0b, 0x0b};
        byte[] valueToDigest = new byte[]{0x48, 0x69, 0x20, 0x54, 0x68, 0x65, 0x72, 0x65};
        String expected = "87aa7c01d19b729b2a5b737a30388f97";
        String actual = HmacUtils.hmacSha512Hex(key, valueToDigest);
        assertEquals(expected, actual);
    }
}