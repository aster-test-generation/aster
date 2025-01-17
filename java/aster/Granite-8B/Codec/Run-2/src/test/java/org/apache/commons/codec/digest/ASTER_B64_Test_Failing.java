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
    public void testRandomSaltWithNegativeNumber_sJpJ2() {
        Random random = new Random();
        int num = -1;
        String salt = B64.getRandomSalt(num, random);
        assertEquals(0, salt.length());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testB64from24bit1_hSfC0_fid1() {
        StringBuilder buffer = new StringBuilder();
        B64.b64from24bit((byte) 0, (byte) 0, (byte) 0, 4, buffer);
        assertEquals("AAA=", buffer.toString());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testB64from24bit2_JIMd1_fid1() {
        StringBuilder buffer = new StringBuilder();
        B64.b64from24bit((byte) 255, (byte) 255, (byte) 255, 4, buffer);
        assertEquals("/w==", buffer.toString());
    }
}