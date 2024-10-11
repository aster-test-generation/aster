/**
 * Generated by Aster
 */
package org.apache.commons.codec.digest;

import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_Blake3_Test_Passing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testInitHash_lkLG0() throws Exception {
        Blake3 blake3 = Blake3.initHash();
        assertNotNull(blake3);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testInitKeyDerivationFunction_egPm0_1() throws Exception {
        byte[] kdfContext = new byte[]{1, 2, 3, 4, 5};
        Blake3 blake3 = Blake3.initKeyDerivationFunction(kdfContext);
        assertNotNull(blake3);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testInitKeyedHashValidKey_GVsQ0() throws Exception {
        byte[] key = new byte[32];
        Blake3 blake3 = Blake3.initKeyedHash(key);
        assertNotNull(blake3);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testInitKeyedHashValidKey_dTiA0() throws Exception {
        byte[] key = new byte[32];
        for (int i = 0; i < 32; i++) {
            key[i] = (byte) i;
        }
        Blake3 blake3 = Blake3.initKeyedHash(key);
        assertNotNull(blake3);
    }
}