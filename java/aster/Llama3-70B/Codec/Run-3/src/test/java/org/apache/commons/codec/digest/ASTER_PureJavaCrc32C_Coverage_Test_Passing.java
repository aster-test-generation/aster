/**
 * Generated by Aster
 */
package org.apache.commons.codec.digest;

import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_PureJavaCrc32C_Coverage_Test_Passing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testUpdate_crcIsNonZero_bIsNonZero_KZhF1_rPyg0() {
        PureJavaCrc32C crc32C = new PureJavaCrc32C();
        crc32C.update(10); // Initialize crc with default value
    }
}