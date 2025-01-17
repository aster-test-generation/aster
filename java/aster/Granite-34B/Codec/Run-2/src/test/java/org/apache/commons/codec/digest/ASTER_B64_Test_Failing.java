/**
 * Generated by Aster
 */
package org.apache.commons.codec.digest;

import java.util.Random;
import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_B64_Test_Failing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetRandomSaltWithNegativeNum_excw2() {
        String salt = B64.getRandomSalt(-1);
        assertEquals("", salt);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetRandomSaltWithNegativeLength_oXYb2() {
        final int num = -10;
        Random random = new Random();
        String salt = B64.getRandomSalt(num, random);
        assertEquals(0, salt.length());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testB64from24bit2_IrFa1() {
        byte b2 = 0;
        byte b1 = 0;
        byte b0 = 1;
        int outLen = 1;
        StringBuilder buffer = new StringBuilder();
        B64.b64from24bit(b2, b1, b0, outLen, buffer);
        assertEquals("A", buffer.toString());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetRandomSaltWithNumGreaterThan32_oYXe4() {
        String salt = B64.getRandomSalt(33);
        assertEquals(32, salt.length());
    }
}