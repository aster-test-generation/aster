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
    public void testHash128_xQEE0_1() {
        byte[] data = new byte[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16};
        int offset = 0;
        int length = 16;
        int seed = 1;
        long[] result = MurmurHash3.hash128(data, offset, length, seed);
        assertNotNull(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHash128_xQEE0_2() {
        byte[] data = new byte[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16};
        int offset = 0;
        int length = 16;
        int seed = 1;
        long[] result = MurmurHash3.hash128(data, offset, length, seed);
        assertEquals(2, result.length);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHash128_zWAZ0_1() {
        byte[] data = new byte[]{1, 2, 3, 4, 5};
        long[] result = MurmurHash3.hash128(data);
        assertNotNull(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHash128_zWAZ0_2() {
        byte[] data = new byte[]{1, 2, 3, 4, 5};
        long[] result = MurmurHash3.hash128(data);
        assertEquals(2, result.length);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHash32x86_vYow0() {
        byte[] data = new byte[]{1, 2, 3, 4, 5, 6, 7, 8};
        int offset = 0;
        int length = 8;
        int seed = 1;
        int result = MurmurHash3.hash32x86(data, offset, length, seed);
        assertNotEquals(0, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHash32_qwjJ0_fid1() {
        byte[] data = new byte[]{1, 2, 3, 4, 5};
        int length = data.length;
        int seed = 1;
        int result = MurmurHash3.hash32(data, length, seed);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHash32x86_SabR0_fid1() {
        byte[] data = new byte[]{1, 2, 3, 4, 5};
        int result = MurmurHash3.hash32x86(data);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHash64_dtPD0_fid1() {
        byte[] data = new byte[]{1, 2, 3, 4, 5};
        long result = MurmurHash3.hash64(data);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHash32_lnLv0_fid1() {
        byte[] data = new byte[]{1, 2, 3, 4, 5};
        int result = MurmurHash3.hash32(data);
        assertEquals(616850763, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHash128x64_Dppe0_fid1() {
        byte[] data = new byte[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15};
        int offset = 0;
        int length = 15;
        int seed = 123;
        long[] result = MurmurHash3.hash128x64(data, offset, length, seed);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHash128_cusK0_fid1() {
        byte[] data = new byte[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16};
        int offset = 0;
        int length = 16;
        int seed = 1;
        long[] expected = new long[]{1139667431443434368L, 1139667431443434368L};
        long[] actual = MurmurHash3.hash128(data, offset, length, seed);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHash64_1_VUnW0_fid1() {
        byte[] data = new byte[]{1, 2, 3, 4, 5, 6, 7, 8};
        long result = MurmurHash3.hash64(data, 0, 8, 1);
        assertEquals(3181400346070213731L, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHash64_2_ZyYJ1_fid1() {
        byte[] data = new byte[]{9, 10, 11, 12, 13, 14, 15, 16};
        long result = MurmurHash3.hash64(data, 0, 8, 2);
        assertEquals(-345986612833563346L, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHash64_1_piMV0_fid1() {
        byte[] data = new byte[]{1, 2, 3, 4, 5, 6, 7, 8};
        long result = MurmurHash3.hash64(data, 0, 8, 1);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHash64_2_jsHY1_fid1() {
        byte[] data = new byte[]{9, 10, 11, 12, 13, 14, 15, 16};
        long result = MurmurHash3.hash64(data, 0, 8, 2);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHash64_ERJr0_fid1() {
        byte[] data = new byte[]{1, 2, 3, 4, 5};
        long result = MurmurHash3.hash64(data, 0, data.length);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHash32_1_rEtF0_fid1() {
        byte[] data = new byte[]{1, 2, 3, 4, 5, 6, 7, 8};
        int offset = 0;
        int length = 8;
        int seed = 1;
        int result = MurmurHash3.hash32(data, offset, length, seed);
        assertEquals(2123270367, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHash32_2_uMtT1_fid1() {
        byte[] data = new byte[]{1, 2, 3, 4, 5, 6, 7};
        int offset = 0;
        int length = 7;
        int seed = 1;
        int result = MurmurHash3.hash32(data, offset, length, seed);
        assertEquals(-1789967182, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHash32_1_kTSQ0_fid1() {
        byte[] data = new byte[]{1, 2, 3, 4, 5, 6, 7, 8};
        int offset = 0;
        int length = 8;
        int seed = 1;
        int result = MurmurHash3.hash32(data, offset, length, seed);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHash32_2_lyXG1_fid1() {
        byte[] data = new byte[]{1, 2, 3, 4, 5, 6, 7};
        int offset = 0;
        int length = 7;
        int seed = 1;
        int result = MurmurHash3.hash32(data, offset, length, seed);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHash32_QSLt0_fid1() {
        long data = 123456789L;
        int seed = 42;
        int result = MurmurHash3.hash32(data, seed);
        assertEquals(-1781214700, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHash32x86_EmptyArray_KmRq1_fid1() {
        byte[] data = new byte[0];
        int offset = 0;
        int length = 0;
        int seed = 1;
        int result = MurmurHash3.hash32x86(data, offset, length, seed);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHash32_quZK0_fid1() {
        byte[] data = new byte[]{1, 2, 3, 4, 5};
        int length = data.length;
        int result = MurmurHash3.hash32(data, length);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHash32_qLkt0_zhni0_fid1() {
        byte[] data = new byte[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16};
        int length = 16;
        int result = MurmurHash3.hash32(data, length);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHash32_YBGr0_fid1() {
        byte[] data = new byte[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int length = data.length;
        int result = MurmurHash3.hash32(data, length);
        assertEquals(-1077423273, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHash32_AWxc0_kyLk0_fid1() {
        byte[] data = new byte[]{(byte) 0x12, (byte) 0x34, (byte) 0x56, (byte) 0x78, (byte) 0x90};
        int result = MurmurHash3.hash32(data, data.length);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHash32_gMio0_bTDP0_fid1() {
        int result = MurmurHash3.hash32(new byte[]{(byte) 123, (byte) 456, (byte) 789}, 3);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHash32_GHzq0_EZaE0_fid1() {
        byte[] data = new byte[]{(byte) 123, (byte) 456, (byte) 789};
        int result = MurmurHash3.hash32(data, data.length);
        assertEquals(-1490401277, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHash128_xQEE0() {
        byte[] data = new byte[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16};
        int offset = 0;
        int length = 16;
        int seed = 1;
        long[] result = MurmurHash3.hash128(data, offset, length, seed);
        assertNotNull(result);
        assertEquals(2, result.length);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHash128_zWAZ0() {
        byte[] data = new byte[]{1, 2, 3, 4, 5};
        long[] result = MurmurHash3.hash128(data);
        assertNotNull(result);
        assertEquals(2, result.length);
    }
}