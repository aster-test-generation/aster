/**
 * Generated by Aster
 */
package org.apache.commons.codec.digest;

import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_Blake3_Test_Failing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    void testKeyedHashWithEmptyKey_lsoY1() {
        byte[] key = new byte[0];
        byte[] data = new byte[64];
        byte[] result = Blake3.keyedHash(key, data);
        assertEquals(64, result.length);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    void testInitKeyDerivationFunctionNullContext_MOaC1() {
        byte[] kdfContext = null;
        Exception exception =
        assertThrows(
        NullPointerException.class, () -> Blake3.initKeyDerivationFunction(kdfContext));
        String expectedMessage = "kdfContext must not be null";
        String actualMessage = exception.getMessage();
        assert actualMessage.equals(expectedMessage);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    void testKeyedHash_uYGb0_fid1() {
        byte[] key = new byte[32];
        byte[] data = new byte[64];
        byte[] result = Blake3.keyedHash(key, data);
        assertEquals(64, result.length);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    void testKeyedHashWithEmptyData_xjMl2_fid1() {
        byte[] key = new byte[32];
        byte[] data = new byte[0];
        byte[] result = Blake3.keyedHash(key, data);
        assertEquals(64, result.length);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testInitKeyedHashWithNullKey_xZzT2_fid1() {
        try {
            Blake3.initKeyedHash(null);
        } catch (NullPointerException e) {
            assertEquals("key", e.getMessage());
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testInitKeyedHashWithNullKey_KkSK0() {
        Exception exception =
        assertThrows(
        NullPointerException.class,
        () -> Blake3.initKeyedHash(null));
        assertEquals("Blake3 keys must be 32 bytes", exception.getMessage());
    }
}