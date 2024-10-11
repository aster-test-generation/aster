/**
 * Generated by Aster
 */
package org.apache.commons.codec.digest;

import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_Blake3_Coverage_Test_Passing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDoFinalize_withSmallNrBytes_TAQM4_jxmk0() {
        Blake3 blake3 = Blake3.initKeyDerivationFunction(new byte[0]);
        byte[] expected = new byte[32]; // Blake3 hash is 32 bytes
    }
}