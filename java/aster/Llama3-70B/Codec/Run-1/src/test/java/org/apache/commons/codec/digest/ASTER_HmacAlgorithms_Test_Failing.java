/**
 * Generated by Aster
 */
package org.apache.commons.codec.digest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

public class Aster_HmacAlgorithms_Test_Failing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetName_HMAC_MD5_KryP0() {
        HmacAlgorithms hmacAlgorithms = HmacAlgorithms.HMAC_MD5;
        assertEquals("HMAC_MD5", hmacAlgorithms.getName());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetName_HMAC_SHA_1_MuxR1() {
        HmacAlgorithms hmacAlgorithms = HmacAlgorithms.HMAC_SHA_1;
        assertEquals("HMAC_SHA_1", hmacAlgorithms.getName());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetName_HMAC_SHA_224_VkBK2() {
        HmacAlgorithms hmacAlgorithms = HmacAlgorithms.HMAC_SHA_224;
        assertEquals("HMAC_SHA_224", hmacAlgorithms.getName());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetName_HMAC_SHA_256_DkzQ3() {
        HmacAlgorithms hmacAlgorithms = HmacAlgorithms.HMAC_SHA_256;
        assertEquals("HMAC_SHA_256", hmacAlgorithms.getName());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetName_HMAC_SHA_384_OmGa4() {
        HmacAlgorithms hmacAlgorithms = HmacAlgorithms.HMAC_SHA_384;
        assertEquals("HMAC_SHA_384", hmacAlgorithms.getName());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetName_HMAC_SHA_512_BGAP5() {
        HmacAlgorithms hmacAlgorithms = HmacAlgorithms.HMAC_SHA_512;
        assertEquals("HMAC_SHA_512", hmacAlgorithms.getName());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testToString_HMAC_MD5_CaNp0() {
        HmacAlgorithms hmacAlgorithms = HmacAlgorithms.HMAC_MD5;
        assertEquals("HMAC_MD5", hmacAlgorithms.toString());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testToString_HMAC_SHA_1_aPgV1() {
        HmacAlgorithms hmacAlgorithms = HmacAlgorithms.HMAC_SHA_1;
        assertEquals("HMAC_SHA_1", hmacAlgorithms.toString());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testToString_HMAC_SHA_224_BzjD2() {
        HmacAlgorithms hmacAlgorithms = HmacAlgorithms.HMAC_SHA_224;
        assertEquals("HMAC_SHA_224", hmacAlgorithms.toString());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testToString_HMAC_SHA_256_PplJ3() {
        HmacAlgorithms hmacAlgorithms = HmacAlgorithms.HMAC_SHA_256;
        assertEquals("HMAC_SHA_256", hmacAlgorithms.toString());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testToString_HMAC_SHA_384_rrhI4() {
        HmacAlgorithms hmacAlgorithms = HmacAlgorithms.HMAC_SHA_384;
        assertEquals("HMAC_SHA_384", hmacAlgorithms.toString());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testToString_HMAC_SHA_512_AkXs5() {
        HmacAlgorithms hmacAlgorithms = HmacAlgorithms.HMAC_SHA_512;
        assertEquals("HMAC_SHA_512", hmacAlgorithms.toString());
    }
}