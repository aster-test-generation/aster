/**
 * Generated by Aster
 */
package org.apache.commons.codec.digest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

import java.util.Random;
import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

public class Aster_B64_Test_Failing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetRandomSaltWithNegativeInput_vGNP2_1() {
        assertEquals(0, B64.getRandomSalt(-1).length());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetRandomSaltWithNegativeInput_vGNP2_2() {
        assertEquals(0, B64.getRandomSalt(-20).length());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetRandomSaltWithNegativeInput_vGNP2_3() {
        assertEquals(0, B64.getRandomSalt(-32).length());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetRandomSaltWithInsufficientMemoryAndNegativeInput_nrzI7() {
        try {
            B64.getRandomSalt(-1024 * 1024 * 1024);
        } catch (OutOfMemoryError e) {
            assertEquals("Insufficient memory to generate salt", e.getMessage());
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetRandomSaltWithNegativeNum_QGJy1() {
        final int num = -10;
        Random random = new Random();
        String salt = B64.getRandomSalt(num, random);
        assertEquals("", salt);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testB64from24bitWithValues_Uocn1_fid1() {
        byte b2 = 1;
        byte b1 = 2;
        byte b0 = 3;
        int outLen = 4;
        StringBuilder buffer = new StringBuilder();
        B64.b64from24bit(b2, b1, b0, outLen, buffer);
        assertEquals("AQIDBAUGBwg=", buffer.toString());
    }
}