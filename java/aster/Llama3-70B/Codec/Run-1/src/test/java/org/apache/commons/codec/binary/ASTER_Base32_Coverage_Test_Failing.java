/**
 * Generated by Aster
 */
package org.apache.commons.codec.binary;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

import java.util.concurrent.TimeUnit;
import org.apache.commons.codec.CodecPolicy;
import org.apache.commons.codec.DecoderException;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

public class Aster_Base32_Coverage_Test_Failing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDecode_KXYd0() {
        Base32 base32 = new Base32(76, new byte[]{'\r', '\n'}, true, (byte) '=', CodecPolicy.LENIENT);
        String input = "SGVsbG8gd29ybGQh";
        byte[] expected = new byte[]{72, 101, 108, 108, 111, 32, 119, 111, 114, 108, 100, 33};
        byte[] actual = base32.decode(input);
        assertArrayEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncode_NullArray_ThrowsNullPointerException_fKmd1() {
        Base32 base32 = new Base32();
        byte[] pArray = null;
        try {
            base32.encode(pArray);
            assert(false);
        } catch (NullPointerException e) {
            assert(true);
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDecode_Null_Object_AoMK3() throws DecoderException {
        Base32 base32 = new Base32();
        Object obj = null;
        base32.decode(obj);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDecode_ExceptionHandling_oyzn8() {
        Base32 base32 = new Base32();
        byte[] pArray = null;
        try {
            base32.decode(pArray);
            fail("Expected NullPointerException");
        } catch (NullPointerException e) {
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsInAlphabet_KaLZ0_fid1() {
        Base32 base32 = new Base32();
        byte octet = 10;
        assertTrue(base32.isInAlphabet(octet));
    }
}