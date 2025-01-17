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
    public void testHash128x64_case1_dqix0() {
        byte[] data = new byte[8];
        long[] expected = { /* expected result based on your implementation */ };
        assertArrayEquals(expected, MurmurHash3.hash128x64(data, 0, data.length, 0));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHash128x64_case2_dVZX1() {
        byte[] data = new byte[9];
        data[8] = 1; // to trigger k2 ^= data[index + 8] & 0xff;
        long[] expected = { /* expected result based on your implementation */ };
        assertArrayEquals(expected, MurmurHash3.hash128x64(data, 0, data.length, 0));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHash128x64_case3_LRkY2() {
        byte[] data = new byte[10];
        data[9] = 1; // to trigger k2 ^= ((long) data[index + 9] & 0xff) << 8;
        long[] expected = { /* expected result based on your implementation */ };
        assertArrayEquals(expected, MurmurHash3.hash128x64(data, 0, data.length, 0));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHash128x64_case4_OIjK3() {
        byte[] data = new byte[11];
        data[10] = 1; // to trigger k2 ^= ((long) data[index + 10] & 0xff) << 16;
        long[] expected = { /* expected result based on your implementation */ };
        assertArrayEquals(expected, MurmurHash3.hash128x64(data, 0, data.length, 0));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHash128x64_case5_FrUe4() {
        byte[] data = new byte[12];
        data[11] = 1; // to trigger k2 ^= ((long) data[index + 11] & 0xff) << 24;
        long[] expected = { /* expected result based on your implementation */ };
        assertArrayEquals(expected, MurmurHash3.hash128x64(data, 0, data.length, 0));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHash128x64_case6_PDKc5() {
        byte[] data = new byte[13];
        data[12] = 1; // to trigger k2 ^= ((long) data[index + 12] & 0xff) << 32;
        long[] expected = { /* expected result based on your implementation */ };
        assertArrayEquals(expected, MurmurHash3.hash128x64(data, 0, data.length, 0));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHash128x64_case7_qgeo6() {
        byte[] data = new byte[14];
        data[13] = 1; // to trigger k2 ^= ((long) data[index + 13] & 0xff) << 40;
        long[] expected = { /* expected result based on your implementation */ };
        assertArrayEquals(expected, MurmurHash3.hash128x64(data, 0, data.length, 0));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHash128x64_case8_twzb7() {
        byte[] data = new byte[15];
        data[14] = 1; // to trigger k2 ^= ((long) data[index + 14] & 0xff) << 48;
        long[] expected = { /* expected result based on your implementation */ };
        assertArrayEquals(expected, MurmurHash3.hash128x64(data, 0, data.length, 0));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHash128x64_case9_YHjO8() {
        byte[] data = new byte[16];
        data[15] = 1; // to trigger k2 *= C2; k2 = Long.rotateLeft(k2, R3); k2 *= C1; h2 ^= k2;
        long[] expected = { /* expected result based on your implementation */ };
        assertArrayEquals(expected, MurmurHash3.hash128x64(data, 0, data.length, 0));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHash128x64_case10_ssUV9() {
        byte[] data = new byte[17];
        data[16] = 1; // to trigger k1 ^= data[index] & 0xff;
        long[] expected = { /* expected result based on your implementation */ };
        assertArrayEquals(expected, MurmurHash3.hash128x64(data, 0, data.length, 0));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHash128x64_case11_roaG10() {
        byte[] data = new byte[18];
        data[17] = 1; // to trigger k1 ^= ((long) data[index + 1] & 0xff) << 8;
        long[] expected = { /* expected result based on your implementation */ };
        assertArrayEquals(expected, MurmurHash3.hash128x64(data, 0, data.length, 0));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHash128x64_case12_hrlw11() {
        byte[] data = new byte[19];
        data[18] = 1; // to trigger k1 ^= ((long) data[index + 2] & 0xff) << 16;
        long[] expected = { /* expected result based on your implementation */ };
        assertArrayEquals(expected, MurmurHash3.hash128x64(data, 0, data.length, 0));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHash128x64_case13_IMpg12() {
        byte[] data = new byte[20];
        data[19] = 1; // to trigger k1 ^= ((long) data[index + 3] & 0xff) << 24;
        long[] expected = { /* expected result based on your implementation */ };
        assertArrayEquals(expected, MurmurHash3.hash128x64(data, 0, data.length, 0));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHash128x64_case14_ychP13() {
        byte[] data = new byte[21];
        data[20] = 1; // to trigger k1 ^= ((long) data[index + 4] & 0xff) << 32;
        long[] expected = { /* expected result based on your implementation */ };
        assertArrayEquals(expected, MurmurHash3.hash128x64(data, 0, data.length, 0));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHash128x64_case15_VQjx14() {
        byte[] data = new byte[22];
        data[21] = 1; // to trigger k1 ^= ((long) data[index + 5] & 0xff) << 40;
        long[] expected = { /* expected result based on your implementation */ };
        assertArrayEquals(expected, MurmurHash3.hash128x64(data, 0, data.length, 0));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHash128x64_case16_bWJs15() {
        byte[] data = new byte[23];
        data[22] = 1; // to trigger k1 ^= ((long) data[index + 6] & 0xff) << 48;
        long[] expected = { /* expected result based on your implementation */ };
        assertArrayEquals(expected, MurmurHash3.hash128x64(data, 0, data.length, 0));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHash128x64_case17_nJoS16() {
        byte[] data = new byte[24];
        data[23] = 1; // to trigger k1 ^= ((long) data[index + 7] & 0xff) << 56;
        long[] expected = { /* expected result based on your implementation */ };
        assertArrayEquals(expected, MurmurHash3.hash128x64(data, 0, data.length, 0));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHash128x64_case18_RKco17() {
        byte[] data = new byte[25];
        data[24] = 1; // to trigger k1 *= C1; k1 = Long.rotateLeft(k1, R1); k1 *= C2; h1 ^= k1;
        long[] expected = { /* expected result based on your implementation */ };
        assertArrayEquals(expected, MurmurHash3.hash128x64(data, 0, data.length, 0));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHash128x64_case1_ZKrY0() {
        byte[] data = new byte[9];
        data[8] = 1; // k2 ^= data[index + 8] & 0xff;
        long[] expected = { /* expected hash values */ };
        assertArrayEquals(expected, MurmurHash3.hash128x64(data, 0, 9, 0));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHash128x64_case2_lGtD1() {
        byte[] data = new byte[10];
        data[9] = 1; // k2 ^= ((long) data[index + 9] & 0xff) << 8;
        long[] expected = { /* expected hash values */ };
        assertArrayEquals(expected, MurmurHash3.hash128x64(data, 0, 10, 0));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHash128x64_case3_dQlL2() {
        byte[] data = new byte[11];
        data[10] = 1; // k2 ^= ((long) data[index + 10] & 0xff) << 16;
        long[] expected = { /* expected hash values */ };
        assertArrayEquals(expected, MurmurHash3.hash128x64(data, 0, 11, 0));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHash128x64_case4_gujY3() {
        byte[] data = new byte[12];
        data[11] = 1; // k2 ^= ((long) data[index + 11] & 0xff) << 24;
        long[] expected = { /* expected hash values */ };
        assertArrayEquals(expected, MurmurHash3.hash128x64(data, 0, 12, 0));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHash128x64_case5_AqYI4() {
        byte[] data = new byte[13];
        data[12] = 1; // k2 ^= ((long) data[index + 12] & 0xff) << 32;
        long[] expected = { /* expected hash values */ };
        assertArrayEquals(expected, MurmurHash3.hash128x64(data, 0, 13, 0));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHash128x64_case6_EAKq5() {
        byte[] data = new byte[14];
        data[13] = 1; // k2 ^= ((long) data[index + 13] & 0xff) << 40;
        long[] expected = { /* expected hash values */ };
        assertArrayEquals(expected, MurmurHash3.hash128x64(data, 0, 14, 0));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHash128x64_case7_PZBT6() {
        byte[] data = new byte[15];
        data[14] = 1; // k2 ^= ((long) data[index + 14] & 0xff) << 48;
        long[] expected = { /* expected hash values */ };
        assertArrayEquals(expected, MurmurHash3.hash128x64(data, 0, 15, 0));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHash128x64_case8_ULds7() {
        byte[] data = new byte[16];
        data[15] = 1; // k2 *= C2; k2 = Long.rotateLeft(k2, R3); k2 *= C1; h2 ^= k2;
        long[] expected = { /* expected hash values */ };
        assertArrayEquals(expected, MurmurHash3.hash128x64(data, 0, 16, 0));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHash128x64_case9_Uarn8() {
        byte[] data = new byte[17];
        data[16] = 1; // k1 ^= data[index] & 0xff;
        long[] expected = { /* expected hash values */ };
        assertArrayEquals(expected, MurmurHash3.hash128x64(data, 0, 17, 0));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHash128x64_case10_AjMM9() {
        byte[] data = new byte[18];
        data[17] = 1; // k1 ^= ((long) data[index + 1] & 0xff) << 8;
        long[] expected = { /* expected hash values */ };
        assertArrayEquals(expected, MurmurHash3.hash128x64(data, 0, 18, 0));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHash128x64_case11_BOhc10() {
        byte[] data = new byte[19];
        data[18] = 1; // k1 ^= ((long) data[index + 2] & 0xff) << 16;
        long[] expected = { /* expected hash values */ };
        assertArrayEquals(expected, MurmurHash3.hash128x64(data, 0, 19, 0));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHash128x64_case12_pFat11() {
        byte[] data = new byte[20];
        data[19] = 1; // k1 ^= ((long) data[index + 3] & 0xff) << 24;
        long[] expected = { /* expected hash values */ };
        assertArrayEquals(expected, MurmurHash3.hash128x64(data, 0, 20, 0));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHash128x64_case13_DyTl12() {
        byte[] data = new byte[21];
        data[20] = 1; // k1 ^= ((long) data[index + 4] & 0xff) << 32;
        long[] expected = { /* expected hash values */ };
        assertArrayEquals(expected, MurmurHash3.hash128x64(data, 0, 21, 0));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHash128x64_case14_QIaO13() {
        byte[] data = new byte[22];
        data[21] = 1; // k1 ^= ((long) data[index + 5] & 0xff) << 40;
        long[] expected = { /* expected hash values */ };
        assertArrayEquals(expected, MurmurHash3.hash128x64(data, 0, 22, 0));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHash128x64_case15_mzvh14() {
        byte[] data = new byte[23];
        data[22] = 1; // k1 ^= ((long) data[index + 6] & 0xff) << 48;
        long[] expected = { /* expected hash values */ };
        assertArrayEquals(expected, MurmurHash3.hash128x64(data, 0, 23, 0));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHash128x64_case16_TCWV15() {
        byte[] data = new byte[24];
        data[23] = 1; // k1 ^= ((long) data[index + 7] & 0xff) << 56;
        long[] expected = { /* expected hash values */ };
        assertArrayEquals(expected, MurmurHash3.hash128x64(data, 0, 24, 0));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHash128x64_case17_vRij16() {
        byte[] data = new byte[25];
        data[24] = 1; // k1 *= C1; k1 = Long.rotateLeft(k1, R1); k1 *= C2; h1 ^= k1;
        long[] expected = { /* expected hash values */ };
        assertArrayEquals(expected, MurmurHash3.hash128x64(data, 0, 25, 0));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHash32x86_EmptyData_wpuP0() {
        byte[] data = new byte[0];
        int seed = -2059681780;
        int result = MurmurHash3.hash32x86(data, 0, 0, seed);
        assertEquals(seed, result); // Expected to be seed as no data to hash
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHash32x86_EmptyData_wpuP0_fid1() {
        byte[] data = new byte[0];
        int seed = 123;
        int result = MurmurHash3.hash32x86(data, 0, 0, seed);
        assertEquals(seed, result); // Expected to be seed as no data to hash
    }
}