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
    public void testHash64_WTFY0() {
        byte[] data = new byte[]{1, 2, 3, 4, 5, 6, 7, 8};
        int length = 8;
        int seed = 0;
        long expected = -8596626768628775241L;
        long result = MurmurHash2.hash64(data, length, seed);
        assertEquals(expected, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHash64WithLessThan8Bytes_thRC1() {
        byte[] data = new byte[]{1, 2, 3, 4};
        int length = 4;
        int seed = 0;
        long expected = -550284462255016424L;
        long result = MurmurHash2.hash64(data, length, seed);
        assertEquals(expected, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHash64WithMoreThan8Bytes_WJHb2() {
        byte[] data = new byte[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int length = 10;
        int seed = 0;
        long expected = -5596927997962420379L;
        long result = MurmurHash2.hash64(data, length, seed);
        assertEquals(expected, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHash64WithSeed_sHQf3() {
        byte[] data = new byte[]{1, 2, 3, 4};
        int length = 4;
        int seed = 1234567890;
        long expected = -7029471905953122373L;
        long result = MurmurHash2.hash64(data, length, seed);
        assertEquals(expected, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHash64WithZeroLength_OGfW5() {
        byte[] data = new byte[]{1, 2, 3, 4};
        int length = 0;
        int seed = 0;
        long expected = 0L;
        long result = MurmurHash2.hash64(data, length, seed);
        assertEquals(expected, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHash64WithNegativeSeed_VOfE7() {
        byte[] data = new byte[]{1, 2, 3, 4};
        int length = 4;
        int seed = -1234567890;
        long expected = -1305801240519006184L;
        long result = MurmurHash2.hash64(data, length, seed);
        assertEquals(expected, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHash64WithLargeSeed_mcjJ8() {
        byte[] data = new byte[]{1, 2, 3, 4};
        int length = 4;
        int seed = 2147483647;
        long expected = -7651523938291099014L;
        long result = MurmurHash2.hash64(data, length, seed);
        assertEquals(expected, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHash64WithLargeData_NdiS9() {
        byte[] data = new byte[100];
        for (int i = 0; i < 100; i++) {
            data[i] = (byte) i;
        }
        int length = 100;
        int seed = 0;
        long expected = 7914939679349004272L;
        long result = MurmurHash2.hash64(data, length, seed);
        assertEquals(expected, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHash64WithLargeDataAndSeed_Lvpg10() {
        byte[] data = new byte[100];
        for (int i = 0; i < 100; i++) {
            data[i] = (byte) i;
        }
        int length = 100;
        int seed = 1234567890;
        long expected = 7339256170276422468L;
        long result = MurmurHash2.hash64(data, length, seed);
        assertEquals(expected, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHash32WithRemainingBytes_hXvP1_eqtl0() {
        byte[] data = new byte[]{(byte) 0x12, (byte) 0x34, (byte) 0x56, (byte) 0x78, (byte) 0x90};
        int length = 5;
        int seed = 0;
        long expected = 8121356675663308098L;
        long result = MurmurHash2.hash64(data, length, seed);
        assertEquals(expected, result);
    }
}