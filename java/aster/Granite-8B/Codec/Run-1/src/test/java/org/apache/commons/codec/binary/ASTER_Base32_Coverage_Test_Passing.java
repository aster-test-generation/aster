/**
 * Generated by Aster
 */
package org.apache.commons.codec.binary;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

import java.util.concurrent.TimeUnit;
import org.apache.commons.codec.DecoderException;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

public class Aster_Base32_Coverage_Test_Passing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeWithEmptyArray_fJHD0() {
        Base32 base32 = new Base32();
        byte[] input = {};
        byte[] expectedOutput = {};
        byte[] actualOutput = base32.encode(input);
        assertArrayEquals(expectedOutput, actualOutput);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDecodeByteArray1_syII0() throws DecoderException {
        Base32 base32 = new Base32();
        byte[] input = new byte[0];
        byte[] expected = new byte[0];
        byte[] actual = base32.decode(input);
        assertArrayEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testContainsAlphabetOrPadWithArrayOctetNull_aeWx0() {
        Base32 base32 = new Base32();
        boolean result = base32.containsAlphabetOrPad(null);
        assertFalse(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testContainsAlphabetOrPadWithArrayOctetEmpty_uKrp1() {
        Base32 base32 = new Base32();
        boolean result = base32.containsAlphabetOrPad(new byte[0]);
        assertFalse(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDecodeWithEmptyArray_mDDU0() {
        Base32 base32 = new Base32();
        byte[] pArray = new byte[0];
        byte[] result = base32.decode(pArray);
        assertTrue(BinaryCodec.isEmpty(result));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDecodeWithNonNullArray_DOSL1() {
        Base32 base32 = new Base32();
        byte[] pArray = new byte[10];
        byte[] result = base32.decode(pArray);
        assertTrue(result.length == 0);
    }
}