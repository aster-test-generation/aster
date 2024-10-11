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

public class Aster_MurmurHash2_Coverage_Test_Passing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHash32_1_mUpj0() {
        byte[] data = new byte[0];
        int length = 0;
        int seed = 0;
        int expected = 0;
        int actual = MurmurHash2.hash32(data, length, seed);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHash32_2_NAHk1() {
        byte[] data = new byte[1];
        int length = 1;
        int seed = 0;
        int expected = -380735811;
        int actual = MurmurHash2.hash32(data, length, seed);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHash32_3_sJOs2() {
        byte[] data = new byte[2];
        int length = 2;
        int seed = 0;
        int expected = -761340550;
        int actual = MurmurHash2.hash32(data, length, seed);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHash32_4_qTAA3() {
        byte[] data = new byte[3];
        int length = 3;
        int seed = 0;
        int expected = 1064395160;
        int actual = MurmurHash2.hash32(data, length, seed);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHash32_5_wSDV4() {
        byte[] data = new byte[4];
        int length = 4;
        int seed = 0;
        int expected = -1268141364;
        int actual = MurmurHash2.hash32(data, length, seed);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHash32_6_CVYW5() {
        byte[] data = new byte[5];
        int length = 5;
        int seed = 0;
        int expected = -1838993261;
        int actual = MurmurHash2.hash32(data, length, seed);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHash32_7_Fhxy6() {
        byte[] data = new byte[6];
        int length = 6;
        int seed = 0;
        int expected = -317700462;
        int actual = MurmurHash2.hash32(data, length, seed);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHash32_8_KtbA7() {
        byte[] data = new byte[7];
        int length = 7;
        int seed = 0;
        int expected = -1877209222;
        int actual = MurmurHash2.hash32(data, length, seed);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHash32_9_emzP8() {
        byte[] data = new byte[8];
        int length = 8;
        int seed = 0;
        int expected = -1817103684;
        int actual = MurmurHash2.hash32(data, length, seed);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHash32_10_EMIN9() {
        byte[] data = new byte[9];
        int length = 9;
        int seed = 0;
        int expected = -842849280;
        int actual = MurmurHash2.hash32(data, length, seed);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHash32_11_ZirT10() {
        byte[] data = new byte[10];
        int length = 10;
        int seed = 0;
        int expected = 649735486;
        int actual = MurmurHash2.hash32(data, length, seed);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHash32_12_kAty11() {
        byte[] data = new byte[11];
        int length = 11;
        int seed = 0;
        int expected = -367118875;
        int actual = MurmurHash2.hash32(data, length, seed);
        assertEquals(expected, actual);
    }
}