/**
 * Generated by Aster
 */
package org.apache.commons.codec.digest;

import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_MurmurHash3_Test_Passing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHash32x86_Zyer0() {
        byte[] data = new byte[0];
        int expected = MurmurHash3.hash32x86(data, 0, data.length, 0);
        int actual = MurmurHash3.hash32x86(data);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHash32_1_ccGO0() {
        byte[] data = new byte[0];
        int length = 0;
        int seed = 0;
        int expected = 0;
        int actual = MurmurHash3.hash32(data, length, seed);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHash128x64_OuxN0() {
        byte[] data = new byte[10];
        int offset = 0;
        int length = 10;
        int seed = 123;
        long[] result = MurmurHash3.hash128x64(data, offset, length, seed);
        assertTrue(result.length == 2);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHash128_vqDj0() {
        byte[] data = new byte[10];
        int offset = 0;
        int length = 10;
        int seed = 123;
        long[] result = MurmurHash3.hash128(data, offset, length, seed);
        assertTrue(result.length == 2);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHash64WithOffsetLengthAndSeed_GulG3() {
        byte[] data = new byte[0];
        int offset = 0;
        int length = 0;
        int seed = 0;
        long expected = 0;
        long actual = MurmurHash3.hash64(data, offset, length, seed);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHash64WithSeed_AUbA1() {
        byte[] data = new byte[0];
        int offset = 0;
        int length = 0;
        int seed = 0;
        long expected = 0L;
        long actual = MurmurHash3.hash64(data, offset, length, seed);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHash128x64_qtZn0() {
        byte[] data = new byte[0];
        int offset = 0;
        int length = 0;
        int seed = 0;
        long[] expected = new long[2];
        long[] actual = MurmurHash3.hash128x64(data, offset, length, seed);
        assertArrayEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHash64_iWPI0() {
        byte[] data = new byte[10];
        int offset = 0;
        int length = 10;
        int seed = 123;
        long expected = MurmurHash3.hash64(data, offset, length, seed);
        long actual = MurmurHash3.hash64(data, offset, length, seed);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHash64WithSeed_RQMe1_hHrG0() {
        byte[] data = new byte[0];
        int seed = 0;
        long expected = 0;
        long actual = MurmurHash3.hash64(data, 0, data.length, seed);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    void testHash32_iCRA0_fid1() {
        byte[] data = new byte[0];
        int expected = 0;
        int actual = MurmurHash3.hash32(data);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    void testHash32WithOffsetAndLength_SYwM2_fid1() {
        byte[] data = new byte[10];
        int offset = 2;
        int length = 5;
        int expected = 415870660;
        int actual = MurmurHash3.hash32(data, offset, length);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    void testHash32WithOffsetLengthAndSeed_QDGM3_fid1() {
        byte[] data = new byte[10];
        int offset = 2;
        int length = 5;
        int seed = 123;
        int expected = 346574048;
        int actual = MurmurHash3.hash32(data, offset, length, seed);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHash32_gfrb0_fid1() {
        long data = 1234567890;
        int seed = 123;
        int expectedHash = 1519243725;
        int actualHash = MurmurHash3.hash32(data, seed);
        assertEquals(expectedHash, actualHash);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHash32_hdMM0_fid1() {
        byte[] data = new byte[10];
        int offset = 0;
        int length = 10;
        int seed = 123;
        int expected = -37924533; // Replace with the expected hash value
        int actual = MurmurHash3.hash32(data, offset, length, seed);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHash32_DRWW0_fid1() {
        byte[] data = new byte[10];
        int offset = 0;
        int length = 10;
        int seed = 123;
        int expected = -37924533; // Replace with the expected value
        int actual = MurmurHash3.hash32(data, offset, length, seed);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHash32_bcGD0_2_fid1() {
        int hash = MurmurHash3.hash32(0L, 0L, 0);
        hash = MurmurHash3.hash32(1L, 2L, 3);
        hash = MurmurHash3.hash32(Long.MAX_VALUE, Long.MIN_VALUE, 1);
        assertEquals(-1999679262, hash);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHash32x86_CxoU0_fid1() {
        byte[] data = new byte[10];
        int offset = 0;
        int length = 10;
        int seed = 123;
        int expected = -37924533; // Replace with the expected hash value
        int actual = MurmurHash3.hash32x86(data, offset, length, seed);
        assertEquals(expected, actual);
    }
}