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

public class Aster_B64_Test_Passing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testB64from24bit_1_DrKe0() {
        byte b2 = 0x01;
        byte b1 = 0x02;
        byte b0 = 0x03;
        int outLen = 4;
        StringBuilder buffer = new StringBuilder();
        B64.b64from24bit(b2, b1, b0, outLen, buffer);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testB64from24bit_2_ZlEg1() {
        byte b2 = 0x04;
        byte b1 = 0x05;
        byte b0 = 0x06;
        int outLen = 4;
        StringBuilder buffer = new StringBuilder();
        B64.b64from24bit(b2, b1, b0, outLen, buffer);
        assertEquals("4I./", buffer.toString());
    }
}