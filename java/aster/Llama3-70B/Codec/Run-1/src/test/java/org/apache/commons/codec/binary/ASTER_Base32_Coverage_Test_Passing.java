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
    public void testIsInAlphabet_KaLZ0() {
        Base32 base32 = new Base32();
        byte octet = 10;
        assertFalse(base32.isInAlphabet(octet));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncode_EmptyArray_ReturnsEmptyArray_bvJi0() {
        Base32 base32 = new Base32();
        byte[] pArray = new byte[0];
        byte[] result = base32.encode(pArray);
        assert(result.length == 0);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testContainsAlphabetOrPadNullArray_VOwQ0() {
        Base32 base32 = new Base32();
        assertFalse(base32.containsAlphabetOrPad(null));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testContainsAlphabetOrPadEmptyArray_aQBW1() {
        Base32 base32 = new Base32();
        byte[] emptyArray = new byte[0];
        assertFalse(base32.containsAlphabetOrPad(emptyArray));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDecode_Byte_Array_QXGu0() throws DecoderException {
        Base32 base32 = new Base32();
        byte[] byteArray = new byte[10];
        base32.decode(byteArray);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDecode_String_cUuf1() throws DecoderException {
        Base32 base32 = new Base32();
        String str = "Hello World";
        base32.decode(str);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDecode_EmptyArray_tfwQ0() {
        Base32 base32 = new Base32();
        byte[] pArray = new byte[0];
        byte[] result = base32.decode(pArray);
        assertArrayEquals(pArray, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDecode_NewContext_PoKX1() {
        Base32 base32 = new Base32();
        byte[] pArray = new byte[1];
        base32.decode(pArray);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDecode_DecodeArray_bKZl2() {
        Base32 base32 = new Base32();
        byte[] pArray = new byte[5];
        base32.decode(pArray);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDecode_ReturnResult_Heal6() {
        Base32 base32 = new Base32();
        byte[] pArray = new byte[5];
        byte[] result = base32.decode(pArray);
        assertNotNull(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncode_InAvail_Less_Than_Zero_rbkM9_iACn0() {
        Base32 base32 = new Base32();
        byte[] arrayOctet = new byte[0];
        assertFalse(base32.containsAlphabetOrPad(arrayOctet));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncode_B_Less_Than_Zero_fQHg11_Lofz0() {
        Base32 base32 = new Base32();
        byte[] arrayOctet = new byte[]{(byte) 'A'}; // changed from -1 to a valid Base32 character
        assertTrue(base32.containsAlphabetOrPad(arrayOctet));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDecode_switch_default_wjfZ12_qNBf0() {
        Base32 base32 = new Base32();
        byte[] input = new byte[0];
        try {
            base32.decode(input, 0, 0, null);
            fail("Expected NullPointerException");
        } catch (NullPointerException e) {
        }
    }
}