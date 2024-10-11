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

public class Aster_MurmurHash3_Test_Failing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHash64_fbFX0() {
        long data = 1234567890L;
        long expectedHash = 1234567890L; // Replace with the expected hash value
        long actualHash = MurmurHash3.hash64(data);
        assertEquals(expectedHash, actualHash);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHash64_tDXK0() {
        byte[] data = new byte[0];
        long expected = 0;
        long actual = MurmurHash3.hash64(data);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHash64WithOffsetAndLength_dCim2() {
        byte[] data = new byte[0];
        int offset = 0;
        int length = 0;
        long expected = 0;
        long actual = MurmurHash3.hash64(data, offset, length);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHash64_1_dpyZ0() {
        byte[] data = new byte[10];
        int offset = 1;
        int length = 10;
        int seed = 100;
        long expected = 1000;
        long actual = MurmurHash3.hash64(data, offset, length, seed);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    void testHash32_iCRA0() {
        byte[] data = new byte[0];
        int expected = 0;
        int actual = MurmurHash3.hash32(data);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    void testHash32WithSeed_LSsg1() {
        byte[] data = new byte[0];
        int seed = 123;
        int expected = 0;
        int actual = MurmurHash3.hash32(data, seed);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    void testHash32WithOffsetAndLength_SYwM2() {
        byte[] data = new byte[10];
        int offset = 2;
        int length = 5;
        int expected = 0;
        int actual = MurmurHash3.hash32(data, offset, length);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    void testHash32WithOffsetLengthAndSeed_QDGM3() {
        byte[] data = new byte[10];
        int offset = 2;
        int length = 5;
        int seed = 123;
        int expected = 0;
        int actual = MurmurHash3.hash32(data, offset, length, seed);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHash64_QFMz0() {
        byte[] data = new byte[0];
        int offset = 0;
        int length = 0;
        long expected = 0L;
        long actual = MurmurHash3.hash64(data, offset, length);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHash32_gfrb0() {
        long data = 1234567890;
        int seed = 123;
        int expectedHash = -152382156;
        int actualHash = MurmurHash3.hash32(data, seed);
        assertEquals(expectedHash, actualHash);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHash128x64WithOffsetAndLength_Fcbg1() {
        byte[] data = new byte[10];
        int offset = 2;
        int length = 5;
        int seed = 123;
        long[] expected = new long[2];
        long[] actual = MurmurHash3.hash128x64(data, offset, length, seed);
        assertArrayEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHash128x64WithSeed_oIpF2() {
        byte[] data = new byte[10];
        int offset = 0;
        int length = 10;
        int seed = 456;
        long[] expected = new long[2];
        long[] actual = MurmurHash3.hash128x64(data, offset, length, seed);
        assertArrayEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHash32_hdMM0() {
        byte[] data = new byte[10];
        int offset = 0;
        int length = 10;
        int seed = 123;
        int expected = 12345; // Replace with the expected hash value
        int actual = MurmurHash3.hash32(data, offset, length, seed);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHash32_DRWW0() {
        byte[] data = new byte[10];
        int offset = 0;
        int length = 10;
        int seed = 123;
        int expected = 12345; // Replace with the expected value
        int actual = MurmurHash3.hash32(data, offset, length, seed);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHash32WithEmptyData_ETeJ1() {
        byte[] data = new byte[0];
        int offset = 0;
        int length = 0;
        int seed = 123;
        int expected = 123; // Replace with the expected hash value
        int actual = MurmurHash3.hash32(data, offset, length, seed);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHash32x86_GlqI0() {
        byte[] data = new byte[10];
        int offset = 0;
        int length = 10;
        int seed = 123;
        int actual = MurmurHash3.hash32x86(data, offset, length, seed);
        int expected = 0; // Replace with expected value
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHash32_bcGD0_1() {
        int hash = MurmurHash3.hash32(0L, 0L, 0);
        hash = MurmurHash3.hash32(1L, 2L, 3);
        hash = MurmurHash3.hash32(Long.MAX_VALUE, Long.MIN_VALUE, 1);
        assertEquals(0, hash);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHash32_bcGD0_2() {
        int hash = MurmurHash3.hash32(0L, 0L, 0);
        hash = MurmurHash3.hash32(1L, 2L, 3);
        hash = MurmurHash3.hash32(Long.MAX_VALUE, Long.MIN_VALUE, 1);
        assertEquals(-1001470531, hash);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHash32_bcGD0_3() {
        int hash = MurmurHash3.hash32(0L, 0L, 0);
        hash = MurmurHash3.hash32(1L, 2L, 3);
        hash = MurmurHash3.hash32(Long.MAX_VALUE, Long.MIN_VALUE, 1);
        assertEquals(1502905217, hash);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHash32x86_CxoU0() {
        byte[] data = new byte[10];
        int offset = 0;
        int length = 10;
        int seed = 123;
        int expected = 12345; // Replace with the expected hash value
        int actual = MurmurHash3.hash32x86(data, offset, length, seed);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHash128_jRTb0() {
        byte[] data = new byte[0];
        long[] expected = {0, 0};
        long[] actual = MurmurHash3.hash128(data);
        assertArrayEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHash32_TWAB0() {
        int actual = MurmurHash3.hash32(0L, 0);
        int expected = 0;
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHash32_1_kKiH1() {
        int actual = MurmurHash3.hash32(1L, 1);
        int expected = 1;
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHash32_2_PLeZ2() {
        int actual = MurmurHash3.hash32(2L, 2);
        int expected = 2;
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHash32_3_ijnA3() {
        int actual = MurmurHash3.hash32(3L, 3);
        int expected = 3;
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHash32_4_LFtN4() {
        int actual = MurmurHash3.hash32(4L, 4);
        int expected = 4;
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHash32_5_jOgB5() {
        int actual = MurmurHash3.hash32(5L, 5);
        int expected = 5;
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHash32_6_kqsl6() {
        int actual = MurmurHash3.hash32(6L, 6);
        int expected = 6;
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHash32_7_MdhA7() {
        int actual = MurmurHash3.hash32(7L, 7);
        int expected = 7;
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHash32_8_wkIm8() {
        int actual = MurmurHash3.hash32(8L, 8);
        int expected = 8;
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHash32_9_onBp9() {
        int actual = MurmurHash3.hash32(9L, 9);
        int expected = 9;
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHash32_10_uWPu10() {
        int actual = MurmurHash3.hash32(10L, 10);
        int expected = 10;
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHash128_wqAC0() {
        String data = "example";
        long[] expected = {1234567890, 987654321}; // Replace with actual expected values
        long[] actual = MurmurHash3.hash128(data);
        assertArrayEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHash128_withEmptyData_GHTM1() {
        String data = "";
        long[] expected = {0, 0}; // Replace with actual expected values
        long[] actual = MurmurHash3.hash128(data);
        assertArrayEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHash128_withNullData_dbOJ2() {
        String data = null;
        long[] expected = {0, 0}; // Replace with actual expected values
        long[] actual = MurmurHash3.hash128(data);
        assertArrayEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHash128_withLongData_VJtH3() {
        String data = "This is a long string that will be hashed";
        long[] expected = {1234567890, 987654321}; // Replace with actual expected values
        long[] actual = MurmurHash3.hash128(data);
        assertArrayEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHash128_withUnicodeData_njzt4() {
        String data = "These are some unicode characters:   ";
        long[] expected = {1234567890, 987654321}; // Replace with actual expected values
        long[] actual = MurmurHash3.hash128(data);
        assertArrayEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHash128WithSeed_UNxv2_KlvC0() {
        byte[] data = new byte[0];
        int seed = 123;
        long[] expected = {0, 0};
        long[] actual = MurmurHash3.hash128(data, 0, data.length, (int) seed);
        assertArrayEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHash64_fbFX0_fid1() {
        long data = -286461308899903857L;
        long expectedHash = -286461308899903857L; // Replace with the expected hash value
        long actualHash = MurmurHash3.hash64(data);
        assertEquals(expectedHash, actualHash);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHash64_1_dpyZ0_fid1() {
        byte[] data = new byte[10];
        int offset = 1;
        int length = 10;
        int seed = 100;
        long expected = -1000;
        long actual = MurmurHash3.hash64(data, offset, length, seed);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHash32WithEmptyData_ETeJ1_fid1() {
        byte[] data = new byte[0];
        int offset = 0;
        int length = 0;
        int seed = -2059681780;
        int expected = -2059681780; // Replace with the expected hash value
        int actual = MurmurHash3.hash32(data, offset, length, seed);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHash32x86_GlqI0_fid1() {
        byte[] data = new byte[10];
        int offset = -37924533;
        int length = 10;
        int seed = 123;
        int actual = MurmurHash3.hash32x86(data, offset, length, seed);
        int expected = -37924533; // Replace with expected value
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHash32_bcGD0_1_fid1() {
        int hash = MurmurHash3.hash32(0L, -1999679262L, -1999679262);
        hash = MurmurHash3.hash32(1L, 2L, 3);
        hash = MurmurHash3.hash32(Long.MAX_VALUE, Long.MIN_VALUE, 1);
        assertEquals(0, hash);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHash32_TWAB0_fid1() {
        int actual = MurmurHash3.hash32(0L, 1669671676);
        int expected = 1669671676;
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1971526657, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHash32_1_kKiH1_fid1() {
        int actual = MurmurHash3.hash32(1L, 1971526657);
        int expected = 1971526657;
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHash32_2_PLeZ2_fid1() {
        int actual = MurmurHash3.hash32(2L, -129463730);
        int expected = -129463730;
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHash32_3_ijnA3_fid1() {
        int actual = MurmurHash3.hash32(3L, 2097318433);
        int expected = 2097318433;
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHash32_4_LFtN4_fid1() {
        int actual = MurmurHash3.hash32(4L, 1753448348);
        int expected = 1753448348;
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHash32_5_jOgB5_fid1() {
        int actual = MurmurHash3.hash32(5L, -1551476814);
        int expected = -1551476814;
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHash32_6_kqsl6_fid1() {
        int actual = MurmurHash3.hash32(6L, 631941838);
        int expected = 631941838;
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHash32_7_MdhA7_fid1() {
        int actual = MurmurHash3.hash32(7L, -992916398);
        int expected = -992916398;
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHash32_8_wkIm8_fid1() {
        int actual = MurmurHash3.hash32(8L, 247906641);
        int expected = 247906641;
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHash32_9_onBp9_fid1() {
        int actual = MurmurHash3.hash32(9L, 1718311154);
        int expected = 1718311154;
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHash32_10_uWPu10_fid1() {
        int actual = MurmurHash3.hash32(10L, -1823381403);
        int expected = -1823381403;
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHash32_bcGD0() {
        int hash = MurmurHash3.hash32(0L, 0L, 0);
        assertEquals(0, hash);
        hash = MurmurHash3.hash32(1L, 2L, 3);
        assertEquals(-1001470531, hash);
        hash = MurmurHash3.hash32(Long.MAX_VALUE, Long.MIN_VALUE, 1);
        assertEquals(1502905217, hash);
    }
}