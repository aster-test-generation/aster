/**
 * Generated by Aster
 */
package org.apache.commons.codec.digest;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

public class Aster_HmacUtils_Coverage_Test_Passing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHmacSha1_QQHY0() throws Exception {
        String key = "myKey";
        String valueToDigest = "myValue";
        byte[] expected = HmacUtils.hmacSha1(key, valueToDigest);
        byte[] actual = HmacUtils.hmacSha1(key, valueToDigest);
        assertArrayEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsAvailable_HmacMd5_DwDp0() {
        assertTrue(HmacUtils.isAvailable(HmacAlgorithms.HMAC_MD5));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHmacSha256Hex_VQVR0() {
        byte[] key = "key".getBytes();
        byte[] valueToDigest = "valueToDigest".getBytes();
        String expected = "19fce7c225381ea446738019472fc2835a53dc59604fe6e39b70b8525dda997d";
        String actual = HmacUtils.hmacSha256Hex(key, valueToDigest);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsAvailable_HmacSha512_Yukc1_cdFo1() {
        assertTrue(HmacUtils.isAvailable(HmacAlgorithms.HMAC_SHA_512));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHmacWithNullInputStream_Ycpy1_tBPD1() throws IOException {
        HmacUtils hmacUtils = new HmacUtils(HmacAlgorithms.HMAC_SHA_256, "key".getBytes());
        byte[] result = hmacUtils.hmac(ByteBuffer.wrap(new byte[0]));
    }
}