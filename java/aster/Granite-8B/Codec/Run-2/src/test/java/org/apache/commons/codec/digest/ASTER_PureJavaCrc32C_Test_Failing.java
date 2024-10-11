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

public class Aster_PureJavaCrc32C_Test_Failing {
    PureJavaCrc32C crc32c = new PureJavaCrc32C();

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetValue_gGbs0_RjBc0() {
        PureJavaCrc32C crc32c = new PureJavaCrc32C();
        crc32c.update((byte) 1);
        crc32c.update((byte) 2);
        crc32c.update((byte) 3);
        assertEquals(0x31c31c31L, crc32c.getValue());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testUpdateWithSingleByte_OhFA1_fid2() {
        PureJavaCrc32C crc32c = new PureJavaCrc32C();
        byte[] singleByte = new byte[1];
        singleByte[0] = 1;
        crc32c.update(singleByte, 0, 1);
        assertEquals(4294967295L, crc32c.getValue());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testUpdate_brkD0_hXAi0() {
        PureJavaCrc32C crc32c = new PureJavaCrc32C();
        crc32c.update(123);
        assertEquals(29741, crc32c.getValue());
    }
}