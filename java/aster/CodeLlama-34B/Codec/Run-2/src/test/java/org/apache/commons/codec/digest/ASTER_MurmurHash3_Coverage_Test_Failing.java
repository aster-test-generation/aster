/**
 * Generated by Aster
 */
package org.apache.commons.codec.digest;

import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_MurmurHash3_Coverage_Test_Failing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHash128_1_jExM0() {
        String data = "Hello World!";
        long[] expected = new long[]{123456789, 987654321};
        long[] actual = MurmurHash3.hash128(data);
        assertArrayEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHash128_2_dIKT1() {
        String data = "";
        long[] expected = new long[]{0, 0};
        long[] actual = MurmurHash3.hash128(data);
        assertArrayEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHash32_MZpq0() {
        byte[] data = new byte[10];
        int seed = 123456789;
        int expected = 123456789;
        int actual = MurmurHash3.hash32(data, 0, data.length, seed);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHash32_CnIf0() {
        byte[] data = new byte[10];
        int length = 10;
        int seed = 12345;
        int expected = 12345;
        int actual = MurmurHash3.hash32(data, length, seed);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHash128x641_fGuC0() {
        byte[] data = new byte[16];
        int offset = 0;
        int length = 16;
        int seed = 0;
        long[] expected = new long[]{0, 0};
        long[] actual = MurmurHash3.hash128x64(data, offset, length, seed);
        assertArrayEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHash128x642_hHrM1() {
        byte[] data = new byte[16];
        int offset = 0;
        int length = 16;
        int seed = 1;
        long[] expected = new long[]{0, 1};
        long[] actual = MurmurHash3.hash128x64(data, offset, length, seed);
        assertArrayEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHash128x643_NMmg2() {
        byte[] data = new byte[16];
        int offset = 0;
        int length = 16;
        int seed = 2;
        long[] expected = new long[]{0, 2};
        long[] actual = MurmurHash3.hash128x64(data, offset, length, seed);
        assertArrayEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHash32_MZpq0_fid1() {
        byte[] data = new byte[10];
        int seed = 490484255;
        int expected = 490484255;
        int actual = MurmurHash3.hash32(data, 0, data.length, seed);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHash32_CnIf0_fid1() {
        byte[] data = new byte[10];
        int length = 10;
        int seed = -990502881;
        int expected = -990502881;
        int actual = MurmurHash3.hash32(data, length, seed);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHash64_NzAV0_SCDB0() {
        byte[] data = new byte[10];
        long expectedResult = 123456789; // define expectedResult
        long result = MurmurHash3.hash64(data, 0, data.length, MurmurHash3.DEFAULT_SEED);
        assertEquals(expectedResult, result);
    }
}