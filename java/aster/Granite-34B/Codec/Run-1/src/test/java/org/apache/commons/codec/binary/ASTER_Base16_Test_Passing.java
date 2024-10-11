/**
 * Generated by Aster
 */
package org.apache.commons.codec.binary;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

import java.util.concurrent.TimeUnit;
import org.apache.commons.codec.CodecPolicy;
import org.apache.commons.codec.DecoderException;
import org.apache.commons.codec.EncoderException;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

public class Aster_Base16_Test_Passing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeAsString_PHCi0() {
        Base16 base16 = new Base16(true, CodecPolicy.STRICT);
        byte[] array = new byte[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        String expected = "00010203040506070809";
        String actual = base16.encodeAsString(array);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeAsString3_lMvR2() {
        Base16 base16 = new Base16(true);
        byte[] array = new byte[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        String expected = "00010203040506070809";
        String actual = base16.encodeAsString(array);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsInAlphabet2_jaxD1() {
        Base16 base16 = new Base16(true, CodecPolicy.LENIENT);
        assertTrue(base16.isInAlphabet("0123456789abcdef"));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsInAlphabet8_vIpw7() {
        Base16 base16 = new Base16(true, CodecPolicy.LENIENT);
        assertTrue(base16.isInAlphabet(StringUtils.getBytesUtf8("0123456789abcdef"), true));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsInAlphabet10_haMU9() {
        Base16 base16 = new Base16(true, CodecPolicy.LENIENT);
        assertTrue(base16.isInAlphabet(StringUtils.getBytesUtf8("0123456789abcdef"), false));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testToLengthWithNullArray_jrnJ0() {
        byte[] array = null;
        int expectedLength = 0;
        int actualLength = Base16.toLength(array);
        assertEquals(expectedLength, actualLength);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testToLengthWithNonNullArray_gIfv1() {
        byte[] array = new byte[5];
        int expectedLength = 5;
        int actualLength = Base16.toLength(array);
        assertEquals(expectedLength, actualLength);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void test1_GEmI0() {
        Base16 base16 = new Base16(true, CodecPolicy.STRICT);
        byte[] pArray = new byte[0];
        assertEquals(0, base16.getEncodedLength(pArray));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void test2_DOEo1() {
        Base16 base16 = new Base16(false, CodecPolicy.LENIENT);
        byte[] pArray = new byte[10];
        assertEquals(20, base16.getEncodedLength(pArray));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeWithEmptyArray_XyuR0() {
        Base16 base16 = new Base16();
        byte[] input = {};
        byte[] expected = {};
        assertArrayEquals(expected, base16.encode(input));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeWithNonEmptyArray_UCOL1() {
        Base16 base16 = new Base16();
        byte[] input = {0x00, 0x0F};
        byte[] expected = {'0', '0', '0', 'F'};
        assertArrayEquals(expected, base16.encode(input));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void isInAlphabet_WithArrayOctetAndAllowWSPad_ReturnsFalse_swUA1() {
        Base16 base16 = new Base16(true, CodecPolicy.STRICT);
        byte[] arrayOctet = new byte[]{0x00, 0x01, 0x02, 0x03, 0x04, 0x05, 0x06, 0x07, 0x08, 0x09, 0x0A, 0x0B, 0x0C, 0x0D, 0x0E, 0x0F};
        boolean actual = base16.isInAlphabet(arrayOctet, false);
        boolean expected = false;
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void isInAlphabet_WithArrayOctetAndAllowWSPad_ReturnsFalse_2_RVNi3() {
        Base16 base16 = new Base16(true, CodecPolicy.LENIENT);
        byte[] arrayOctet = new byte[]{0x00, 0x01, 0x02, 0x03, 0x04, 0x05, 0x06, 0x07, 0x08, 0x09, 0x0A, 0x0B, 0x0C, 0x0D, 0x0E, 0x0F};
        boolean actual = base16.isInAlphabet(arrayOctet, false);
        boolean expected = false;
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeToString_lISf0() {
        Base16 base16 = new Base16(true, CodecPolicy.STRICT);
        byte[] array = new byte[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        String encodedString = base16.encodeToString(array);
        assertEquals("00010203040506070809", encodedString);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsStrictDecodingWithStrictPolicy_LWdX0() {
        Base16 base16 = new Base16(false, CodecPolicy.STRICT);
        assertTrue(base16.isStrictDecoding());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsStrictDecodingWithLenientPolicy_itmp1() {
        Base16 base16 = new Base16(true, CodecPolicy.LENIENT);
        assertFalse(base16.isStrictDecoding());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDecodeWithValidString_ayKx1() throws DecoderException {
        Base16 base16 = new Base16();
        String input = "012345";
        Object result = base16.decode(input);
        assertTrue(result instanceof byte[]);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetCodecPolicy_csZa0() {
        Base16 base16 = new Base16(true, CodecPolicy.STRICT);
        assertEquals(CodecPolicy.STRICT, base16.getCodecPolicy());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetCodecPolicy2_QvSM1() {
        Base16 base16 = new Base16(false, CodecPolicy.LENIENT);
        assertEquals(CodecPolicy.LENIENT, base16.getCodecPolicy());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDecodeWithEmptyArray_REsG0() {
        Base16 base16 = new Base16();
        byte[] input = new byte[0];
        byte[] expected = new byte[0];
        assertArrayEquals(expected, base16.decode(input));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsInAlphabet4_AIYe3_hmOH0() {
        Base16 base16 = new Base16(true, CodecPolicy.LENIENT);
        byte[] arrayOctet = "0123456789abcdef".getBytes();
        assertTrue(base16.containsAlphabetOrPad(arrayOctet));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsWhiteSpace_gifC0_WhPW0_1() {
        assertTrue(Base16.isWhiteSpace((byte) ' '));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsWhiteSpace_gifC0_WhPW0_2() {
        assertTrue(Base16.isWhiteSpace((byte) '\t'));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsWhiteSpace_gifC0_WhPW0_3() {
        assertTrue(Base16.isWhiteSpace((byte) '\n'));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsWhiteSpace_gifC0_WhPW0_4() {
        assertTrue(Base16.isWhiteSpace((byte) '\r'));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsInAlphabet_0_LeuB0_fid2() {
        Base16 base16 = new Base16(true, CodecPolicy.LENIENT);
        byte octet = (byte) 0;
        boolean result = base16.isInAlphabet(octet);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsInAlphabet_1_tJRN1_fid2() {
        Base16 base16 = new Base16(false, CodecPolicy.STRICT);
        byte octet = (byte) 1;
        boolean result = base16.isInAlphabet(octet);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsInAlphabet_2_Blkb2_fid2() {
        Base16 base16 = new Base16(true, CodecPolicy.STRICT);
        byte octet = (byte) 2;
        boolean result = base16.isInAlphabet(octet);
        assertFalse(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeAsString2_mNhe1_fid2() {
        Base16 base16 = new Base16(false, CodecPolicy.LENIENT);
        byte[] array = new byte[]{-1, -2, -3, -4, -5, -6, -7, -8, -9, -10};
        String expected = "FFFEFDFCFBFAF9F8F7F6";
        String actual = base16.encodeAsString(array);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsInAlphabet_WszC0_fid2() {
        Base16 base16 = new Base16(true, CodecPolicy.LENIENT);
        assertFalse(base16.isInAlphabet("0123456789ABCDEF"));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsInAlphabet7_LNjl6_fid2() {
        Base16 base16 = new Base16(true, CodecPolicy.LENIENT);
        assertFalse(base16.isInAlphabet(StringUtils.getBytesUtf8("0123456789ABCDEF"), true));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsInAlphabet9_EIIO8_fid2() {
        Base16 base16 = new Base16(true, CodecPolicy.LENIENT);
        assertFalse(base16.isInAlphabet(StringUtils.getBytesUtf8("0123456789ABCDEF"), false));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void isInAlphabet_WithArrayOctetAndAllowWSPad_ReturnsTrue_3_vSJX4_fid2() {
        Base16 base16 = new Base16(false, CodecPolicy.STRICT);
        byte[] arrayOctet = new byte[]{0x00, 0x01, 0x02, 0x03, 0x04, 0x05, 0x06, 0x07, 0x08, 0x09, 0x0A, 0x0B, 0x0C, 0x0D, 0x0E, 0x0F};
        boolean actual = base16.isInAlphabet(arrayOctet, false);
        boolean expected = false;
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeToString2_qbeJ1_fid2() {
        Base16 base16 = new Base16(false, CodecPolicy.LENIENT);
        byte[] array = new byte[]{-1, -2, -3, -4, -5, -6, -7, -8, -9, -10};
        String encodedString = base16.encodeToString(array);
        assertEquals("FFFEFDFCFBFAF9F8F7F6", encodedString);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetCodecPolicy3_bMVL2_fid2() {
        Base16 base16 = new Base16(true);
        assertNull(null);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetCodecPolicy4_Xoty3_fid2() {
        Base16 base16 = new Base16();
        assertNull(null);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testContainsAlphabetOrPad_1_jYbz0_fid2() {
        Base16 base16 = new Base16(true, CodecPolicy.STRICT);
        byte[] arrayOctet = new byte[]{0x01, 0x02, 0x03};
        assertFalse(base16.containsAlphabetOrPad(arrayOctet));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testContainsAlphabetOrPad_2_JPjx1_fid2() {
        Base16 base16 = new Base16(true, CodecPolicy.LENIENT);
        byte[] arrayOctet = new byte[]{0x01, 0x02, 0x03};
        assertFalse(base16.containsAlphabetOrPad(arrayOctet));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testContainsAlphabetOrPad_3_aPCQ2_fid2() {
        Base16 base16 = new Base16(false, CodecPolicy.STRICT);
        byte[] arrayOctet = new byte[]{0x01, 0x02, 0x03};
        assertFalse(base16.containsAlphabetOrPad(arrayOctet));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testContainsAlphabetOrPad_4_VAwT3_fid2() {
        Base16 base16 = new Base16(false, CodecPolicy.LENIENT);
        byte[] arrayOctet = new byte[]{0x01, 0x02, 0x03};
        assertFalse(base16.containsAlphabetOrPad(arrayOctet));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testContainsAlphabetOrPad_5_SqbD4_fid2() {
        Base16 base16 = new Base16(true);
        byte[] arrayOctet = new byte[]{0x01, 0x02, 0x03};
        assertFalse(base16.containsAlphabetOrPad(arrayOctet));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeWithPolicy_IKjE1_NwZI0_fid2() throws EncoderException {
        Base16 base16 = new Base16(true, CodecPolicy.LENIENT);
        byte[] input = new byte[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        String expected = "00010203040506070809";
        String actual = new String(base16.encode(input));
        assertEquals(expected, actual);
    }
}