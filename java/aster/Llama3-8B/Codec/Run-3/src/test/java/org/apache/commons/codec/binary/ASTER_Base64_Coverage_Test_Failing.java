/**
 * Generated by Aster
 */
package org.apache.commons.codec.binary;

import java.math.BigInteger;
import java.util.concurrent.TimeUnit;
import org.apache.commons.codec.CodecPolicy;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_Base64_Coverage_Test_Failing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testToIntegerBytesBitLengthNotMultipleOf8_DKSK0() {
        BigInteger bigInt = new BigInteger("12345678901234567890123456789012345678901234567890");
        byte[] expectedBytes = new byte[]{(byte) 0x12, (byte) 0x34, (byte) 0x56, (byte) 0x78, (byte) 0x90, (byte) 0xA2, (byte) 0xC4, (byte) 0xE6};
        byte[] resultBytes = Base64.toIntegerBytes(bigInt);
        assertArrayEquals(expectedBytes, resultBytes);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testToIntegerBytesBitLengthMultipleOf8_GyIQ1() {
        BigInteger bigInt = new BigInteger("12345678901234567890123456789012345678901234567890");
        byte[] expectedBytes = new byte[]{(byte) 0x12, (byte) 0x34, (byte) 0x56, (byte) 0x78, (byte) 0x90};
        byte[] resultBytes = Base64.toIntegerBytes(bigInt);
        assertArrayEquals(expectedBytes, resultBytes);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testToIntegerBytesBitLengthNotMultipleOf8ButLengthPlusOneEqualBitLengthDividedBy8_phPN2() {
        BigInteger bigInt = new BigInteger("12345678901234567890123456789012345678901234567890");
        byte[] expectedBytes = new byte[]{(byte) 0x12, (byte) 0x34, (byte) 0x56, (byte) 0x78, (byte) 0x90, (byte) 0xA2};
        byte[] resultBytes = Base64.toIntegerBytes(bigInt);
        assertArrayEquals(expectedBytes, resultBytes);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsInAlphabet_nAjc0() {
        Base64 base64 = new Base64();
        assertTrue(base64.isInAlphabet((byte) 0));
        assertTrue(base64.isInAlphabet((byte) 25));
        assertFalse(base64.isInAlphabet((byte) -1));
        assertFalse(base64.isInAlphabet((byte) 26));
        assertTrue(base64.isInAlphabet((byte) 25));
        assertFalse(base64.isInAlphabet((byte) 26));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeImpossibleModulus_wSxF5_mzob0() {
        Base64 base64 = new Base64();
        try {
            base64.encode(new byte[0], 0, 0, null);
            fail("Expected IllegalStateException");
        } catch (IllegalStateException e) {
            assertEquals("Impossible modulus", e.getMessage());
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeLineLengthAndCurrentLinePos_cIlo9_auXL0() {
        Base64 base64 = new Base64();
        CodecPolicy policy = CodecPolicy.STRICT;
        base64 = new Base64(10, new byte[0], false, policy);
        byte[] buffer = new byte[0];
        base64.encode(buffer, 0, 0, null);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsInAlphabet_nAjc0_1_fid3() {
        Base64 base64 = new Base64();
        assertTrue(base64.isInAlphabet((byte) 0));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsInAlphabet_nAjc0_2_fid3() {
        Base64 base64 = new Base64();
        assertTrue(base64.isInAlphabet((byte) 25));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDecodeWithDecodeTable_Kelu0_LkPf0_1_fid3() {
        Base64 base64 = new Base64();
        byte[] input = new byte[]{(byte) 0x00, (byte) 0x01, (byte) 0x02};
        int inPos = 0;
        int inAvail = 3;
        assertEquals(true, base64.isBase64((byte) 0x00));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDecodeWithDecodeTable_Kelu0_LkPf0_2_fid3() {
        Base64 base64 = new Base64();
        byte[] input = new byte[]{(byte) 0x00, (byte) 0x01, (byte) 0x02};
        int inPos = 0;
        int inAvail = 3;
        assertEquals(true, base64.isBase64((byte) 0x01));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDecodeWithDecodeTable_Kelu0_LkPf0_3_fid3() {
        Base64 base64 = new Base64();
        byte[] input = new byte[]{(byte) 0x00, (byte) 0x01, (byte) 0x02};
        int inPos = 0;
        int inAvail = 3;
        assertEquals(true, base64.isBase64((byte) 0x02));
    }
}