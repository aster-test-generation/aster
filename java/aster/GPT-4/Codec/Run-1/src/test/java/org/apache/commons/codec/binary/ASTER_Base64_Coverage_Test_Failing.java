/**
 * Generated by Aster
 */
package org.apache.commons.codec.binary;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

import java.math.BigInteger;
import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

public class Aster_Base64_Coverage_Test_Failing {
    private static final byte[] CHUNK_SEPARATOR = {'\r', '\n'};

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetCodecPolicy_DefaultPolicy_egtG2() {
        Base64 base64 = new Base64();
        assertNull(base64.getCodecPolicy()); // Assuming default constructor does not set a decodingPolicy
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testToIntegerBytesWithZero_kjMr0() {
        BigInteger bigInt = new BigInteger("0");
        byte[] expected = new byte[1];
        assertArrayEquals(expected, Base64.toIntegerBytes(bigInt));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testToIntegerBytesWithBitLengthNotMultipleOfEight_raNf3() {
        BigInteger bigInt = new BigInteger("128");
        byte[] expected = {0, -128};
        assertArrayEquals(expected, Base64.toIntegerBytes(bigInt));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testToIntegerBytesWithNegativeNumber_qkHw4() {
        BigInteger bigInt = new BigInteger("-1");
        byte[] expected = {-1};
        assertArrayEquals(expected, Base64.toIntegerBytes(bigInt));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testToIntegerBytesWithLargeNumber_jcjv5() {
        BigInteger bigInt = new BigInteger("12345678901234567890");
        byte[] expected = {0, -111, 73, -106, 27, -4, -46, 2, -46};
        assertArrayEquals(expected, Base64.toIntegerBytes(bigInt));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testToIntegerBytesWithLeadingZeroByte_hAhc6() {
        BigInteger bigInt = new BigInteger("65536");
        byte[] expected = {0, 1, 0, 0};
        assertArrayEquals(expected, Base64.toIntegerBytes(bigInt));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testToIntegerBytesWithExactByteBoundary_vCMM8() {
        BigInteger bigInt = new BigInteger("255");
        byte[] expected = {0, -1};
        assertArrayEquals(expected, Base64.toIntegerBytes(bigInt));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testToIntegerBytesWithNegativeExactByteBoundary_qHce10() {
        BigInteger bigInt = new BigInteger("-256");
        byte[] expected = {-1, 0};
        assertArrayEquals(expected, Base64.toIntegerBytes(bigInt));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testToIntegerBytesWithNegativeOneBitOverByteBoundary_VWgT11() {
        BigInteger bigInt = new BigInteger("-257");
        byte[] expected = {-1, -2};
        assertArrayEquals(expected, Base64.toIntegerBytes(bigInt));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testToIntegerBytesWithPaddingRequired_sJnP12() {
        BigInteger bigInt = new BigInteger("1024");
        byte[] expected = {0, 4, 0};
        assertArrayEquals(expected, Base64.toIntegerBytes(bigInt));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCreatePositiveCapacityWithNegativeInput_wcwr0_tqcS0_1() {
        int negativeCapacity = -1;
        try {
            new Base64(negativeCapacity);
            fail("Expected an IllegalArgumentException to be thrown");
        } catch (IllegalArgumentException e) {
            assertNotNull(e);
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCreatePositiveCapacityWithOverflow_RYcg1_kctf0_1() {
        int overflowCapacity = Integer.MAX_VALUE + 1; // This will overflow to -2147483648
        OutOfMemoryError thrown = assertThrows(
        OutOfMemoryError.class,
        () -> new Base64(overflowCapacity)
        );
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testToIntegerBytesWithNegativeOneBitOverByteBoundary_VWgT11_fid1() {
        BigInteger bigInt = new BigInteger("-257");
        byte[] expected = {-1, -1};
        assertArrayEquals(expected, Base64.toIntegerBytes(bigInt));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsInAlphabetWithEmptyArray_vzjy0_bmSH0_fid3() {
        Base64 base64 = new Base64();
        byte[] emptyArray = new byte[0];
        boolean result = base64.containsAlphabetOrPad(emptyArray);
        assertTrue(result, "Empty array should return true");
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCreatePositiveCapacityWithNegativeInput_wcwr0_tqcS0_1_fid3() {
        int negativeCapacity = -1;
        IllegalArgumentException thrown = assertThrows(
        IllegalArgumentException.class,
        () -> new Base64(negativeCapacity)
        );
    }
}