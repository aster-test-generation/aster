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

public class Aster_XXHash32_Coverage_Test_Passing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testUpdate_withSmallInput_coveringGetIntMethod_eXZj0() {
        XXHash32 xxHash32 = new XXHash32(0); // create an object with seed 0
        byte[] input = new byte[]{0x01, 0x02, 0x03, 0x04, 0x05, 0x06, 0x07, 0x08};
        xxHash32.update(input, 0, input.length);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testUpdate_withPositiveInteger_WbwY0() {
        XXHash32 xxHash32 = new XXHash32();
        xxHash32.update(123);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testUpdate_withNegativeInteger_wTTM1() {
        XXHash32 xxHash32 = new XXHash32();
        xxHash32.update(-123);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testUpdate_withZero_BLAS2() {
        XXHash32 xxHash32 = new XXHash32();
        xxHash32.update(0);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testUpdate_State0_klLI0() {
        XXHash32 xxHash32 = new XXHash32(1);
        byte[] b = new byte[16];
        xxHash32.update(b, 0, 16);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetValue_Default_ENZC9() {
        XXHash32 xxHash32 = new XXHash32();
        assertEquals(46947589, xxHash32.getValue());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetValue_WhileLoop_Buffer_aGfx4_kToM0() {
        XXHash32 xxHash32 = new XXHash32(1);
        xxHash32.update(1);
        xxHash32.update(2);
        xxHash32.update(3);
        xxHash32.update(4);
        xxHash32.update(5);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetValue_StateUpdatedTrue_RotateLeftState0_1_lttg6_lIVe1() {
        XXHash32 xxHash32 = new XXHash32(1);
        xxHash32.update(10);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetValue_ForLoop_IntBuffer_BJyK2_XzzU0() {
        XXHash32 xxHash32 = new XXHash32(1);
        byte[] buffer = new byte[8];
        buffer[0] = 1;
        buffer[1] = 2;
        buffer[2] = 3;
        buffer[3] = 4;
        buffer[4] = 5;
        buffer[5] = 6;
        buffer[6] = 7;
        buffer[7] = 8;
        for (int i = 0; i < 8; i++) {
            xxHash32.update(buffer[i]);
        }
        assertEquals(1227495065, xxHash32.getValue());
    }
}