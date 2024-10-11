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
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_B64_Test_Passing {
    private static final char[] B64T_ARRAY = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/".toCharArray();

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetRandomSaltWithValidLength_zbCR0_1() {
        int length = 16;
        String result = B64.getRandomSalt(length);
        assertNotNull(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetRandomSaltWithValidLength_zbCR0_2() {
        int length = 16;
        String result = B64.getRandomSalt(length);
        assertEquals(length, result.length());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testB64from24bit_AllZeros_jceK0() {
        StringBuilder buffer = new StringBuilder();
        B64.b64from24bit((byte) 0, (byte) 0, (byte) 0, 4, buffer);
        assertEquals("....", buffer.toString());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testB64from24bit_MaxValues_Hryk1() {
        StringBuilder buffer = new StringBuilder();
        B64.b64from24bit((byte) -1, (byte) -1, (byte) -1, 4, buffer);
        assertEquals("zzzz", buffer.toString());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetRandomSaltLength_xqvr0() {
        int length = 8;
        Random random = new Random();
        String result = B64.getRandomSalt(length, random);
        assertEquals(length, result.length());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetRandomSaltConsistency_HeFC1() {
        int length = 10;
        Random random = new Random(123);
        String result1 = B64.getRandomSalt(length, random);
        random = new Random(123);
        String result2 = B64.getRandomSalt(length, random);
        assertEquals(result1, result2);
    }
}