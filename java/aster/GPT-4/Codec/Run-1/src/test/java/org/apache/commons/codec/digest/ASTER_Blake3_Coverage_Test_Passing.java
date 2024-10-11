/**
 * Generated by Aster
 */
package org.apache.commons.codec.digest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

public class Aster_Blake3_Coverage_Test_Passing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDoFinalizeWithZeroBytes_dYMY1_txWb0_1() {
        byte[] result = Blake3.hash(new byte[0]);
        assertNotNull(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDoFinalizeWithZeroBytes_dYMY1_txWb32_2() {
        byte[] result = Blake3.hash(new byte[32]);
        assertEquals(32, result.length);
    }
}