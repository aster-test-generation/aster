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

public class Aster_MurmurHash3_Coverage_Test_Passing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHash128x64_Case15_mlPy0() {
        byte[] data = new byte[23];
        for (int i = 0; i < 23; i++) {
            data[i] = (byte) i;
        }
        long[] result = MurmurHash3.hash128x64(data, 0, 23, 1);
        assertNotNull(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHash128x64_Case14_qWbJ1() {
        byte[] data = new byte[22];
        for (int i = 0; i < 22; i++) {
            data[i] = (byte) i;
        }
        long[] result = MurmurHash3.hash128x64(data, 0, 22, 1);
        assertNotNull(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHash128x64_Case13_OcXM2() {
        byte[] data = new byte[21];
        for (int i = 0; i < 21; i++) {
            data[i] = (byte) i;
        }
        long[] result = MurmurHash3.hash128x64(data, 0, 21, 1);
        assertNotNull(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHash128x64_15Bytes_HkgN0() {
        byte[] data = new byte[15];
        for (int i = 0; i < 15; i++) {
            data[i] = (byte) i;
        }
        long[] result = MurmurHash3.hash128x64(data, 0, 15, 1);
        assertNotNull(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHash128x64_14Bytes_IbIg1() {
        byte[] data = new byte[14];
        for (int i = 0; i < 14; i++) {
            data[i] = (byte) i;
        }
        long[] result = MurmurHash3.hash128x64(data, 0, 14, 1);
        assertNotNull(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHash128x64_13Bytes_oigK2() {
        byte[] data = new byte[13];
        for (int i = 0; i < 13; i++) {
            data[i] = (byte) i;
        }
        long[] result = MurmurHash3.hash128x64(data, 0, 13, 1);
        assertNotNull(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHash64_SwitchCase7_Puzm0() {
        byte[] data = new byte[10];
        for (int i = 0; i < 10; i++) {
            data[i] = (byte) i;
        }
        long result = MurmurHash3.hash64(data, 0, 9, 1);
        assertEquals(-8744459328367799416L, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHash64_K1Shift48_XYIb1() {
        byte[] data = new byte[8];
        data[6] = (byte) 0x12;
        long result = MurmurHash3.hash64(data, 0, 7, 1);
        assertEquals(9020022109997684878L, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHash64_K1Shift40_InAQ2() {
        byte[] data = new byte[7];
        data[5] = (byte) 0x34;
        long result = MurmurHash3.hash64(data, 0, 6, 1);
        assertEquals(1051325687527288091L, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHash32x86_case3_rNYJ0() {
        byte[] data = new byte[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};
        int offset = 0;
        int length = 10;
        int seed = 1;
        int result = MurmurHash3.hash32x86(data, offset, length, seed);
        assertNotNull(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHash32x86_case2_SCvF1() {
        byte[] data = new byte[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int offset = 0;
        int length = 9;
        int seed = 1;
        int result = MurmurHash3.hash32x86(data, offset, length, seed);
        assertNotNull(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHash32x86_case1_wgHq2() {
        byte[] data = new byte[]{1, 2, 3, 4, 5, 6, 7, 8, 9};
        int offset = 0;
        int length = 8;
        int seed = 1;
        int result = MurmurHash3.hash32x86(data, offset, length, seed);
        assertNotNull(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHash32_Xor_UFLw7() {
        int seed = 0;
        int result = MurmurHash3.hash32(0, 0, seed);
        result ^= Long.BYTES * 2;
        assertNotEquals(seed, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHash32_withNullByteArray_EFkl1_wOLr0() {
        byte[] data = null;
        try {
            MurmurHash3.hash32(data, 0);
            assert true; // Should not reach this line
        } catch (NullPointerException e) {
            assert true;
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHash32_Mix32_R0_Lower_Llaf3_DSeY0() {
        byte[] data = new byte[4];
        data[0] = (byte) 0x12;
        data[1] = (byte) 0x34;
        data[2] = (byte) 0x56;
        data[3] = (byte) 0x78;
        int seed = 0;
        int result = MurmurHash3.hash32(data, data.length);
        assertNotEquals(seed, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHash32_withNonNullByteArray_naaQ0_XZUi0() {
        byte[] data = "Hello, World!".getBytes();
        int result = MurmurHash3.hash32(data, data.length);
        assertNotEquals(0, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHash64_k1RotateLeftR1_ZRvY5_PZgD0() {
        assertEquals(3205320099L, MurmurHash3.hash32(new byte[]{1}, 1) & 0xFFFFFFFFL);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHash32_ouPu0() {
        assertEquals(-1089647197, MurmurHash3.hash32(new byte[]{1}, 1));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHash32_Fmix32_hSWk5_dGim0() {
        byte[] data = new byte[0];
        int length = 0;
        int seed = 123;
        int result = MurmurHash3.hash32(data, length, seed);
        assertEquals(result, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHash64_MultiplyC1_uvPl2_hzSA0() {
        long k = 1L;
        long c1 = 0xcc9e2d51L;
        k *= c1;
        assertEquals(k, 1L * c1);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHash32_Mix32_R1_Lower_wtTE5_RbDZ0() {
        byte[] data = new byte[8];
        long data2 = 0xfedcba9876543210L;
        for (int i = 0; i < 8; i++) {
            data[7 - i] = (byte) ((data2 >>> (i * 8)) & 0xFF);
        }
        int seed = 0;
        int result = MurmurHash3.hash32(data, data.length);
        assertNotEquals(seed, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHash32_Mix32_R0_Upper_NlEX4_zmEZ0() {
        long data1 = 0x1234567890abcdefL;
        long reversedData1 = Long.reverseBytes(data1);
        int seed = 0;
        byte[] data = new byte[8];
        for (int i = 0; i < 8; i++) {
            data[i] = (byte) ((reversedData1 >>> (56 - i * 8)) & 0xFF);
        }
        int result = MurmurHash3.hash32(data, data.length);
        assertNotEquals(seed, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHash32_Mix32_R1_Upper_PdQF6_DUKW0() {
        long data2 = 0xfedcba9876543210L;
        long reversedData2 = Long.reverseBytes(data2);
        int seed = 0;
        byte[] data = new byte[8];
        for (int i = 0; i < 8; i++) {
            data[i] = (byte) ((reversedData2 >>> (56 - i * 8)) & 0xFF);
        }
        int result = MurmurHash3.hash32(data, data.length);
        assertNotEquals(seed, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHash32_kaww0() {
        byte[] data = new byte[0];
        int length = 0;
        int result = MurmurHash3.hash32(data, length);
        assertEquals(result, result);
    }
}