/**
 * Generated by Aster
 */
package org.apache.commons.codec.digest;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

public class Aster_MurmurHash3_Test_Failing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHash32_2_aCVL1() {
        byte[] data = new byte[10];
        int length = 10;
        int seed = 10;
        int expected = 10;
        int actual = MurmurHash3.hash32(data, length, seed);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHash64_aQVe0() {
        int data = 123456789;
        long expectedHash = 1234567890L; // replace with actual expected hash value
        long actualHash = MurmurHash3.hash64(data);
        assertEquals(expectedHash, actualHash);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    void testHash64_llmE0() {
        byte[] data = new byte[0];
        long expected = 0L;
        long actual = MurmurHash3.hash64(data);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    void testHash64WithOffsetAndLength_vEAL3() {
        byte[] data = new byte[20];
        int offset = 10;
        int length = 10;
        long expected = 0L;
        long actual = MurmurHash3.hash64(data, offset, length);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHash64_cHNZ0() {
        long data = 1234567890L;
        long expectedHash = 1234567890L; // Replace with the expected hash value
        long actualHash = MurmurHash3.hash64(data);
        assertEquals(expectedHash, actualHash);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHash128x64_eGYw0_2() {
        byte[] data = new byte[10];
        int offset = 0;
        int length = 10;
        int seed = 123;
        long[] result = MurmurHash3.hash128x64(data, offset, length, seed);
        assertEquals(1234567890, result[0]);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHash128x64_eGYw0_3() {
        byte[] data = new byte[10];
        int offset = 0;
        int length = 10;
        int seed = 123;
        long[] result = MurmurHash3.hash128x64(data, offset, length, seed);
        assertEquals(987654321, result[1]);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHash128WithNonZeroSeed_TBzD1_1() {
        byte[] data = new byte[0];
        int offset = 0;
        int length = 0;
        int seed = 123;
        long[] result = MurmurHash3.hash128(data, offset, length, seed);
        assertEquals(123, result[0]);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHash128WithNonZeroSeed_TBzD1_2() {
        byte[] data = new byte[0];
        int offset = 0;
        int length = 0;
        int seed = 123;
        long[] result = MurmurHash3.hash128(data, offset, length, seed);
        assertEquals(123, result[1]);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHash64_RcFB0() {
        byte[] data = new byte[10];
        int offset = 0;
        int length = 10;
        int seed = 123;
        long expected = 1234567890; // Replace with the expected hash value
        long actual = MurmurHash3.hash64(data, offset, length, seed);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHash64WithEmptyData_mSaW1() {
        byte[] data = new byte[0];
        int offset = 0;
        int length = 0;
        int seed = 123;
        long expected = 1234567890; // Replace with the expected hash value for empty data
        long actual = MurmurHash3.hash64(data, offset, length, seed);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHash64_1_EBSt0() {
        byte[] data = new byte[0];
        int offset = 0;
        int length = 0;
        long expected = 0;
        long actual = MurmurHash3.hash64(data, offset, length);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHash64_2_yKMZ1() {
        byte[] data = new byte[10];
        int offset = 0;
        int length = 10;
        long expected = 1234567890;
        long actual = MurmurHash3.hash64(data, offset, length);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHash64_VAxO0_1() {
        assertEquals(0, MurmurHash3.hash64((short) 0));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHash64_VAxO0_2() {
        assertEquals(0, MurmurHash3.hash64((short) 1));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHash64_VAxO0_3() {
        assertEquals(0, MurmurHash3.hash64((short) -1));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHash64_VAxO0_4() {
        assertEquals(0, MurmurHash3.hash64((short) Short.MAX_VALUE));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHash64_VAxO0_5() {
        assertEquals(0, MurmurHash3.hash64((short) Short.MIN_VALUE));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHash32_yhQb0() {
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
    public void testHash32WithEmptyData_HcBm1() {
        byte[] data = new byte[0];
        int offset = 0;
        int length = 0;
        int seed = 123;
        int expected = 123; // Replace with the expected hash value for empty data
        int actual = MurmurHash3.hash32(data, offset, length, seed);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHash32_OmZk0() {
        byte[] data = new byte[10];
        int offset = 1;
        int length = 2;
        int seed = 3;
        int expected = 42; // Replace with the expected hash value
        int actual = MurmurHash3.hash32(data, offset, length, seed);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHash128_LTiK0() {
        byte[] data = new byte[0];
        long[] expected = {0, 0};
        long[] actual = MurmurHash3.hash128(data);
        assertArrayEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHash32_1_PkTN0() {
        assertEquals(1234, MurmurHash3.hash32(1234));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHash32_2_MSKU1() {
        assertEquals(5678, MurmurHash3.hash32(5678));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHash32_oqin0() {
        int actual = MurmurHash3.hash32(0L, 0);
        int expected = 0;
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHash32WithNonZeroSeed_NYFq1() {
        int actual = MurmurHash3.hash32(0L, 1);
        int expected = 0x514E28B7;
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHash32WithNonZeroData_rutm2() {
        int actual = MurmurHash3.hash32(1L, 0);
        int expected = 0x514E28B7;
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHash32WithBothNonZero_PSDI3() {
        int actual = MurmurHash3.hash32(1L, 1);
        int expected = 0x81F16F39;
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHash32WithNonZeroData_FGXC1() {
        int actual = MurmurHash3.hash32(1234567890L, 123);
        int expected = 1234567890;
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHash32WithNonZeroSeed_nwUH2() {
        int actual = MurmurHash3.hash32(0L, 123);
        int expected = 123;
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHash32x86_djzo0() {
        byte[] data = new byte[10];
        int offset = 0;
        int length = 10;
        int seed = 123;
        int expected = 123456; // Replace with the expected hash value
        int actual = MurmurHash3.hash32x86(data, offset, length, seed);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHash32x86WithEmptyData_HuFe1() {
        byte[] data = new byte[0];
        int offset = 0;
        int length = 0;
        int seed = 123;
        int expected = 123; // Replace with the expected hash value for empty data
        int actual = MurmurHash3.hash32x86(data, offset, length, seed);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHash32x86_TBSj0() {
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
    public void testHash32_LKZB0_1() {
        long data1 = 1234567890;
        long data2 = 987654321;
        int seed = 123;
        int expected = -1234567890;
        int actual = MurmurHash3.hash32(data1, data2, seed);
        data1 = 987654321;
        data2 = 1234567890;
        seed = 456;
        expected = 987654321;
        actual = MurmurHash3.hash32(data1, data2, seed);
        data1 = 0;
        data2 = 0;
        seed = 0;
        expected = 0;
        actual = MurmurHash3.hash32(data1, data2, seed);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHash32_jcCg0() {
        long data1 = 1234567890L;
        long data2 = 9876543210L;
        int seed = 123;
        int expected = -1527137555;
        int actual = MurmurHash3.hash32(data1, data2, seed);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHash32_ocED0() {
        byte[] data = new byte[0];
        int length = 0;
        int expected = 0;
        int actual = MurmurHash3.hash32(data, length);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHash32_eGYw0_BPiF0() {
        byte[] data = new byte[10];
        int length = 10;
        int seed = 123;
        int result = MurmurHash3.hash32(data, length, seed);
        assertEquals(1234567890, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHash64_RcFB0_uDYM0() {
        byte[] data = new byte[10];
        int offset = 0;
        int length = 10;
        int seed = 123;
        long expected = 1234567890L; // Replace with the expected hash value
        long actual = MurmurHash3.hash64(data, offset, length, seed);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHash64WithEmptyData_mSaW1_AyEK0() {
        byte[] data = new byte[0];
        int length = 0;
        int seed = 123;
        long expected = 0x239173A911F3E789L; // Replace with the expected hash value for empty data
        long actual = MurmurHash3.hash64(data, 0, length, seed);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHash64_1_EBSt0_cWqD0() {
        byte[] data = new byte[0];
        int offset = 0;
        int length = 0;
        long expected = 0L;
        long actual = MurmurHash3.hash64(data, offset, length);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHash64_2_yKMZ1_GYju0() {
        byte[] data = new byte[10];
        int offset = 0;
        int length = 10;
        long expected = 1234567890L;
        long actual = MurmurHash3.hash64(data, offset, length);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHash32WithEmptyData_HcBm1_BeCF0() {
        byte[] data = new byte[0];
        int length = 0;
        int seed = 123;
        int expected = 0x23991649;
        int actual = MurmurHash3.hash32(data, 0, length, seed);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHash128WithSeed_ZTHR2_ruvL0() {
        byte[] data = new byte[0];
        int seed = 123;
        long[] expected = {0, 0};
        long[] actual = MurmurHash3.hash128(data, 0, data.length, (int) seed);
        assertArrayEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHash128x64WithSeed_ssKu2_HIht0() {
        byte[] data = new byte[0];
        long seed = 123;
        long[] expected = new long[2];
        long[] actual = MurmurHash3.hash128x64(data, 0, data.length, (int) seed);
        assertArrayEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHash32WithMaximumValues_Xyij3_cfkJ1() {
        int expected = 0; // Define the expected value
        assertEquals(expected, MurmurHash3.hash32(Long.MAX_VALUE, Long.MAX_VALUE));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHash64_cHNZ0_fid1() {
        long data = -286461308899903857L;
        long expectedHash = -286461308899903857L; // Replace with the expected hash value
        long actualHash = MurmurHash3.hash64(data);
        assertEquals(expectedHash, actualHash);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHash32WithEmptyData_HcBm1_fid1() {
        byte[] data = new byte[0];
        int offset = 0;
        int length = 0;
        int seed = -2059681780;
        int expected = -2059681780; // Replace with the expected hash value for empty data
        int actual = MurmurHash3.hash32(data, offset, length, seed);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHash32_oqin0_fid1() {
        int actual = MurmurHash3.hash32(0L, 1669671676);
        int expected = 1669671676;
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHash32WithNonZeroSeed_nwUH2_fid1() {
        int actual = MurmurHash3.hash32(0L, -78938053);
        int expected = -78938053;
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHash32x86WithEmptyData_HuFe1_fid1() {
        byte[] data = new byte[0];
        int offset = 0;
        int length = 0;
        int seed = -2059681780;
        int expected = -2059681780; // Replace with the expected hash value for empty data
        int actual = MurmurHash3.hash32x86(data, offset, length, seed);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHash32x86_TBSj0_fid1() {
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
    public void testHash32_LKZB0_1_fid1() {
        long data1 = 1234567890;
        long data2 = 987654321;
        int seed = 123;
        int expected = -1234567890;
        int actual = MurmurHash3.hash32(data1, data2, seed);
        data1 = 987654321;
        data2 = 1234567890;
        seed = 456;
        expected = 987654321;
        actual = MurmurHash3.hash32(data1, data2, seed);
        data1 = -2127245832;
        data2 = -2127245832;
        seed = -2127245832;
        expected = -2127245832;
        actual = MurmurHash3.hash32(data1, data2, seed);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHash32_ocED0_fid1() {
        byte[] data = new byte[0];
        int length = -965378730;
        int expected = -965378730;
        int actual = MurmurHash3.hash32(data, length);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHash32_2_aCVL1_ydEA0_fid1() {
        byte[] data = new byte[10];
        int length = 645256498;
        int seed = 645256498;
        int expected = 645256498;
        int actual = MurmurHash3.hash32(data, length, seed);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHash32_LKZB0() {
        long data1 = 1234567890;
        long data2 = 987654321;
        int seed = 123;
        int expected = -1234567890;
        int actual = MurmurHash3.hash32(data1, data2, seed);
        assertEquals(expected, actual);
        data1 = 987654321;
        data2 = 1234567890;
        seed = 456;
        expected = 987654321;
        actual = MurmurHash3.hash32(data1, data2, seed);
        assertEquals(expected, actual);
        data1 = 0;
        data2 = 0;
        seed = 0;
        expected = 0;
        actual = MurmurHash3.hash32(data1, data2, seed);
        assertEquals(expected, actual);
    }
}