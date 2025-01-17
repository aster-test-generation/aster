/**
 * Generated by Aster
 */
package org.apache.commons.codec.digest;

import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_XXHash32_Test_Passing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testUpdate_BjMS0() throws Exception {
        XXHash32 xxHash32 = new XXHash32();
        byte[] oneByte = new byte[1];
        xxHash32.update(0x12);
        byte[] expected = new byte[]{(byte) 0x12};
        assertArrayEquals(expected, oneByte);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetValue_XTGU0() throws Exception {
        XXHash32 xxHash32 = new XXHash32();
        long result = xxHash32.getValue();
        System.out.println(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetValueWithSeed_LzJy1() throws Exception {
        XXHash32 xxHash32 = new XXHash32(123);
        long result = xxHash32.getValue();
        System.out.println(result);
    }
}