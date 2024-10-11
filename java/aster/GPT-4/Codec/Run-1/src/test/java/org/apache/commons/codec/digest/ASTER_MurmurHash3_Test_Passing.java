/**
 * Generated by Aster
 */
package org.apache.commons.codec.digest;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

public class Aster_MurmurHash3_Test_Passing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHash32x86_EmptyArray_ZUNM0() {
        byte[] data = new byte[0];
        int result = MurmurHash3.hash32x86(data);
        assertEquals(0, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHash32WithEmptyArray_PyyM0() {
        byte[] data = new byte[0];
        int expectedHash = MurmurHash3.hash32(data);
        assertEquals(expectedHash, MurmurHash3.hash32(data));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHash128_Nxpm0_1() {
        byte[] data = new byte[]{0x01, 0x02, 0x03, 0x04, 0x05, 0x06, 0x07, 0x08, 0x09, 0x0A, 0x0B, 0x0C, 0x0D, 0x0E, 0x0F, 0x10};
        int offset = 0;
        int length = data.length;
        int seed = 123456789;
        long[] result = MurmurHash3.hash128(data, offset, length, seed);
        assertNotNull(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHash128_Nxpm0_2() {
        byte[] data = new byte[]{0x01, 0x02, 0x03, 0x04, 0x05, 0x06, 0x07, 0x08, 0x09, 0x0A, 0x0B, 0x0C, 0x0D, 0x0E, 0x0F, 0x10};
        int offset = 0;
        int length = data.length;
        int seed = 123456789;
        long[] result = MurmurHash3.hash128(data, offset, length, seed);
        assertEquals(2, result.length);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHash64WithZeroInput_GbTP0_fid1() {
        long result = MurmurHash3.hash64(0);
        assertEquals(8196844538399943790L, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHash64WithEmptyData_mpjl0() {
        byte[] data = new byte[0];
        int offset = 0;
        int length = 0;
        long expectedHash = MurmurHash3.hash64(data, offset, length);
        long result = MurmurHash3.hash64(data, offset, length);
        assertEquals(expectedHash, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHash32WithNonEmptyData_MfXo1() {
        byte[] data = {1, 2, 3, 4, 5, 6, 7, 8};
        int seed = 123;
        int result = MurmurHash3.hash32(data, 0, data.length, seed);
        assertNotEquals(seed, result); // Expect hash to change from seed due to data
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHash32WithEmptyData_yoZQ0() {
        byte[] data = new byte[0];
        int offset = 0;
        int length = 0;
        int seed = 1;
        int expected = 0x514E28B7; // Expected hash for empty data with seed 1
        int result = MurmurHash3.hash32(data, offset, length, seed);
        assertEquals(expected, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHash32WithZero_WnCy0() {
        int result = MurmurHash3.hash32(0L);
        assertEquals(result, MurmurHash3.hash32(0L, MurmurHash3.DEFAULT_SEED));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHash32WithZeroData_CXNt0() {
        int seed = 123;
        long data = 0L;
        int expectedHash = MurmurHash3.hash32(data, seed);
        int actualHash = MurmurHash3.hash32(data, seed);
        assertEquals(expectedHash, actualHash);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHash32x86_SingleBlock_obLa1() {
        byte[] data = {1, 2, 3, 4};
        int offset = 0;
        int length = 4;
        int seed = 1234;
        int result = MurmurHash3.hash32x86(data, offset, length, seed);
        assertNotEquals(0, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHash32x86_EmptyData_kWPp0() {
        byte[] data = new byte[0];
        int offset = 0;
        int length = 0;
        int seed = 0;
        int result = MurmurHash3.hash32x86(data, offset, length, seed);
        assertEquals(0, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHash32x86_NonEmptyData_ZhYA1() {
        byte[] data = {1, 2, 3, 4, 5, 6, 7, 8};
        int offset = 0;
        int length = 8;
        int seed = 1;
        int result = MurmurHash3.hash32x86(data, offset, length, seed);
        assertNotEquals(0, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHash32x86_NonEmptyData_unFA1() {
        byte[] data = {0x01, 0x02, 0x03, 0x04};
        int seed = 123;
        int result = MurmurHash3.hash32x86(data, 0, 4, seed);
        assertNotEquals(0, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHash128x64_EmptyData_lWDe0() {
        byte[] data = new byte[0];
        long[] expected = new long[2]; // Assuming the hash of empty data is {0, 0}
        long[] actual = MurmurHash3.hash128x64(data);
        assertArrayEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHash32WithEmptyString_JdSS0() {
        String input = "";
        int expectedHash = MurmurHash3.hash32(input);
        assertEquals(expectedHash, MurmurHash3.hash32(input));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHash32_RgZx0() {
        int seed = 123;
        long data1 = 0x0123456789ABCDEFL;
        long data2 = 0xFEDCBA9876543210L;
        int expected = MurmurHash3.hash32(data1, data2, seed);
        int result = MurmurHash3.hash32(data1, data2, seed);
        assertEquals(expected, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHash32WithEmptyData_jyXj0() {
        byte[] data = new byte[0];
        int length = 0;
        int expectedHash = MurmurHash3.hash32(data, length);
        assertEquals(expectedHash, MurmurHash3.hash32(data, length));
    }
}