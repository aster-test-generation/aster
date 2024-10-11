/**
 * Generated by Aster
 */
package org.apache.commons.codec.digest;

import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_HmacAlgorithms_Test_Passing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetName_HMAC_MD5_IJnE0() throws Exception {
        HmacAlgorithms hmacAlgorithms = HmacAlgorithms.HMAC_MD5;
        assertEquals("HMAC_MD5", hmacAlgorithms.getName());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetName_HMAC_SHA_1_kKHT1() throws Exception {
        HmacAlgorithms hmacAlgorithms = HmacAlgorithms.HMAC_SHA_1;
        assertEquals("HMAC_SHA_1", hmacAlgorithms.getName());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetName_HMAC_SHA_224_hPGY2() throws Exception {
        HmacAlgorithms hmacAlgorithms = HmacAlgorithms.HMAC_SHA_224;
        assertEquals("HMAC_SHA_224", hmacAlgorithms.getName());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetName_HMAC_SHA_256_rsUp3() throws Exception {
        HmacAlgorithms hmacAlgorithms = HmacAlgorithms.HMAC_SHA_256;
        assertEquals("HMAC_SHA_256", hmacAlgorithms.getName());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetName_HMAC_SHA_384_zbGC4() throws Exception {
        HmacAlgorithms hmacAlgorithms = HmacAlgorithms.HMAC_SHA_384;
        assertEquals("HMAC_SHA_384", hmacAlgorithms.getName());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetName_HMAC_SHA_512_seyV5() throws Exception {
        HmacAlgorithms hmacAlgorithms = HmacAlgorithms.HMAC_SHA_512;
        assertEquals("HMAC_SHA_512", hmacAlgorithms.getName());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testToString_HMAC_MD5_cFQz0() throws Exception {
        HmacAlgorithms hmacAlgorithms = HmacAlgorithms.HMAC_MD5;
        assertEquals("HMAC_MD5", hmacAlgorithms.toString());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testToString_HMAC_SHA_1_vIDo1() throws Exception {
        HmacAlgorithms hmacAlgorithms = HmacAlgorithms.HMAC_SHA_1;
        assertEquals("HMAC_SHA_1", hmacAlgorithms.toString());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testToString_HMAC_SHA_224_reia2() throws Exception {
        HmacAlgorithms hmacAlgorithms = HmacAlgorithms.HMAC_SHA_224;
        assertEquals("HMAC_SHA_224", hmacAlgorithms.toString());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testToString_HMAC_SHA_256_uJgq3() throws Exception {
        HmacAlgorithms hmacAlgorithms = HmacAlgorithms.HMAC_SHA_256;
        assertEquals("HMAC_SHA_256", hmacAlgorithms.toString());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testToString_HMAC_SHA_384_jhrZ4() throws Exception {
        HmacAlgorithms hmacAlgorithms = HmacAlgorithms.HMAC_SHA_384;
        assertEquals("HMAC_SHA_384", hmacAlgorithms.toString());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testToString_HMAC_SHA_512_kWto5() throws Exception {
        HmacAlgorithms hmacAlgorithms = HmacAlgorithms.HMAC_SHA_512;
        assertEquals("HMAC_SHA_512", hmacAlgorithms.toString());
    }
}