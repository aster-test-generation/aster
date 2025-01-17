/**
 * Generated by Aster
 */
package org.apache.commons.codec.digest;

import java.security.SecureRandom;
import java.util.Random;
import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_B64_Test_Passing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void getRandomSaltTest_jZPy0_1() {
        int num = 10;
        SecureRandom random = new SecureRandom();
        String salt = B64.getRandomSalt(num, random);
        assertNotNull(salt);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void getRandomSaltTest_jZPy0_2() {
        int num = 10;
        SecureRandom random = new SecureRandom();
        String salt = B64.getRandomSalt(num, random);
        assertTrue(salt.length() == num);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testRandomSaltWithSmallNumber_WXYP0() {
        Random random = new Random();
        int num = 5;
        String salt = B64.getRandomSalt(num, random);
        assertEquals(5, salt.length());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testRandomSaltWithLargeNumber_RTYz1() {
        Random random = new Random();
        int num = 100;
        String salt = B64.getRandomSalt(num, random);
        assertEquals(100, salt.length());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testB64from24bit1_hSfC0() {
        StringBuilder buffer = new StringBuilder();
        B64.b64from24bit((byte) 0, (byte) 0, (byte) 0, 4, buffer);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testB64from24bit2_JIMd1() {
        StringBuilder buffer = new StringBuilder();
        B64.b64from24bit((byte) 255, (byte) 255, (byte) 255, 4, buffer);
    }
}