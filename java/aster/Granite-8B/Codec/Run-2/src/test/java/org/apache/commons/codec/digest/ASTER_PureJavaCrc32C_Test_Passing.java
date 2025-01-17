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

public class Aster_PureJavaCrc32C_Test_Passing {
    PureJavaCrc32C crc32c = new PureJavaCrc32C();

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testUpdateWithEmptyArray_QhkD0() {
        PureJavaCrc32C crc32c = new PureJavaCrc32C();
        byte[] emptyArray = new byte[0];
        crc32c.update(emptyArray, 0, 0);
        assertEquals(0, crc32c.getValue());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testUpdateWithSingleByte_OhFA1() {
        PureJavaCrc32C crc32c = new PureJavaCrc32C();
        byte[] singleByte = new byte[1];
        singleByte[0] = 1;
        crc32c.update(singleByte, 0, 1);
        assertEquals(2685849682L, crc32c.getValue());
    }
}