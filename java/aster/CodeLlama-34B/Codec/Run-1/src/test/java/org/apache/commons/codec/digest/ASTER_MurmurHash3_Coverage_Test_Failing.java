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

public class Aster_MurmurHash3_Coverage_Test_Failing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHash128_withValidData_lppv0() {
        String data = "Hello World";
        long[] expectedHash = {123456789, 987654321};
        long[] actualHash = MurmurHash3.hash128(data);
        assertEquals(expectedHash[0], actualHash[0]);
        assertEquals(expectedHash[1], actualHash[1]);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHash128_withEmptyData_hcPa1() {
        String data = "";
        long[] expectedHash = {0, 0};
        long[] actualHash = MurmurHash3.hash128(data);
        assertEquals(expectedHash[0], actualHash[0]);
        assertEquals(expectedHash[1], actualHash[1]);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHash128_withNullData_eFwE2() {
        String data = null;
        long[] expectedHash = {0, 0};
        long[] actualHash = MurmurHash3.hash128(data);
        assertEquals(expectedHash[0], actualHash[0]);
        assertEquals(expectedHash[1], actualHash[1]);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHash128x641_zklq0() {
        byte[] data = new byte[10];
        int offset = 0;
        int length = 10;
        int seed = 12345;
        long[] expected = new long[]{123456789, 987654321};
        long[] actual = MurmurHash3.hash128x64(data, offset, length, seed);
        assertArrayEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHash128_withNullData_eFwE2_1() {
        String data = null;
        long[] expectedHash = {0, 0};
        long[] actualHash = MurmurHash3.hash128(data);
        assertEquals(expectedHash[0], actualHash[0]);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHash128_withNullData_eFwE2_2() {
        String data = null;
        long[] expectedHash = {0, 0};
        long[] actualHash = MurmurHash3.hash128(data);
        assertEquals(expectedHash[1], actualHash[1]);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHash128_withValidData_lppv0_1() {
        String data = "Hello World";
        long[] expectedHash = {123456789, 987654321};
        long[] actualHash = MurmurHash3.hash128(data);
        assertEquals(expectedHash[0], actualHash[0]);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHash128_withValidData_lppv0_2() {
        String data = "Hello World";
        long[] expectedHash = {123456789, 987654321};
        long[] actualHash = MurmurHash3.hash128(data);
        assertEquals(expectedHash[1], actualHash[1]);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHash128_withEmptyData_hcPa1_1() {
        String data = "";
        long[] expectedHash = {0, 0};
        long[] actualHash = MurmurHash3.hash128(data);
        assertEquals(expectedHash[0], actualHash[0]);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHash128_withEmptyData_hcPa1_2() {
        String data = "";
        long[] expectedHash = {0, 0};
        long[] actualHash = MurmurHash3.hash128(data);
        assertEquals(expectedHash[1], actualHash[1]);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHash128x64_case1_UDQG0_cVKj0() {
        byte[] data = new byte[10];
        int offset = 0;
        int length = 10;
        int seed = 0;
        long[] result = MurmurHash3.hash128x64(data, offset, length, seed);
        long[] expectedResult = new long[2];
        expectedResult[0] = 144;
        expectedResult[1] = 22;
        assertArrayEquals(expectedResult, result);
    }
}