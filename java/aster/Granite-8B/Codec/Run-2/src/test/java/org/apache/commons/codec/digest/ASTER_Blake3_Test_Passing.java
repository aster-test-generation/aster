/**
 * Generated by Aster
 */
package org.apache.commons.codec.digest;

import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_Blake3_Test_Passing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    void testKeyedHash_uYGb0() {
        byte[] key = new byte[32];
        byte[] data = new byte[32];
        byte[] result = Blake3.keyedHash(key, data);
        assertEquals(32, result.length);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    void testKeyedHashWithEmptyData_xjMl2() {
        byte[] key = new byte[32];
        byte[] data = new byte[0];
        byte[] result = Blake3.keyedHash(key, data);
        assertEquals(32, result.length);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testInitKeyedHashWithKeyLengthNot32Bytes_ICEP1() {
        byte[] key = new byte[31];
        try {
            Blake3.initKeyedHash(key);
        } catch (IllegalArgumentException e) {
            assertEquals("Blake3 keys must be 32 bytes", e.getMessage());
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testInitKeyedHashWithNullKey_xZzT2() {
        try {
            Blake3.initKeyedHash(null);
        } catch (NullPointerException e) {
            assertNull(e.getMessage());
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testInitKeyedHashWithNullKey_KkSK0_1() {
        Exception exception =
        assertThrows(
        NullPointerException.class,
        () -> Blake3.initKeyedHash(null));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testInitKeyedHashWithInvalidKeyLength_kBlW1_1() {
        Exception exception =
        assertThrows(
        IllegalArgumentException.class,
        () -> Blake3.initKeyedHash(new byte[1]));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    void testInitKeyDerivationFunction_lzRE0() {
        byte[] kdfContext = new byte[16];
        Blake3 blake3 = Blake3.initKeyDerivationFunction(kdfContext);
        assert blake3 != null;
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    void testInitKeyDerivationFunctionWithNullContext_sAjb1() {
        byte[] kdfContext = null;
        assertThrows(NullPointerException.class, () -> Blake3.initKeyDerivationFunction(kdfContext));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testInitKeyedHashWithInvalidKeyLength_kBlW1() {
        Exception exception =
        assertThrows(
        IllegalArgumentException.class,
        () -> Blake3.initKeyedHash(new byte[1]));
        assertEquals("Blake3 keys must be 32 bytes", exception.getMessage());
    }
}