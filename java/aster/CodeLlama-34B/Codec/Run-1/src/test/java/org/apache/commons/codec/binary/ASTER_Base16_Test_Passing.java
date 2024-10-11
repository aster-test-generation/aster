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
    public void testDecode_UpperCase_Strict_zWXp2() {
        Base16 base16 = new Base16(false, CodecPolicy.STRICT);
        byte[] expected = new byte[]{0x01, 0x02, 0x03, 0x04, 0x05, 0x06, 0x07, 0x08, 0x09, 0x0A, 0x0B, 0x0C, 0x0D, 0x0E, 0x0F};
        byte[] actual = base16.decode("0102030405060708090A0B0C0D0E0F");
        assertArrayEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDecode_UpperCase_Lenient_zulY3() {
        Base16 base16 = new Base16(false, CodecPolicy.LENIENT);
        byte[] expected = new byte[]{0x01, 0x02, 0x03, 0x04, 0x05, 0x06, 0x07, 0x08, 0x09, 0x0A, 0x0B, 0x0C, 0x0D, 0x0E, 0x0F};
        byte[] actual = base16.decode("0102030405060708090A0B0C0D0E0F");
        assertArrayEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeAsString_upperCase_strictDecodingPolicy_BigE1() {
        Base16 base16 = new Base16(false, CodecPolicy.STRICT);
        byte[] input = new byte[]{0x01, 0x02, 0x03, 0x04, 0x05, 0x06, 0x07, 0x08, 0x09, 0x0A, 0x0B, 0x0C, 0x0D, 0x0E, 0x0F, 0x10};
        String expected = "0102030405060708090A0B0C0D0E0F10";
        String actual = base16.encodeAsString(input);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeAsString_upperCase_lenientDecodingPolicy_COUh3() {
        Base16 base16 = new Base16(false, CodecPolicy.LENIENT);
        byte[] input = new byte[]{0x01, 0x02, 0x03, 0x04, 0x05, 0x06, 0x07, 0x08, 0x09, 0x0A, 0x0B, 0x0C, 0x0D, 0x0E, 0x0F, 0x10};
        String expected = "0102030405060708090A0B0C0D0E0F10";
        String actual = base16.encodeAsString(input);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeAsString_nullInput_abxh4() {
        Base16 base16 = new Base16();
        String actual = base16.encodeAsString(null);
        assertNull(actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeAsString_emptyInput_NvKS5() {
        Base16 base16 = new Base16();
        String actual = base16.encodeAsString(new byte[0]);
        assertEquals("", actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsInAlphabet_QCjS0_2() {
        Base16 base16 = new Base16(true, CodecPolicy.STRICT);
        assertFalse(base16.isInAlphabet("GHIJKLMNOPQRSTUVWXYZ"));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsInAlphabet_QCjS0_3() {
        Base16 base16 = new Base16(true, CodecPolicy.STRICT);
        assertFalse(base16.isInAlphabet("abcdefghijklmnopqrstuvwxyz"));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testToLength_nullArray_GtjV0() {
        byte[] array = null;
        int expectedLength = 0;
        int actualLength = Base16.toLength(array);
        assertEquals(expectedLength, actualLength);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testToLength_nonNullArray_gQjx1() {
        byte[] array = new byte[10];
        int expectedLength = 10;
        int actualLength = Base16.toLength(array);
        assertEquals(expectedLength, actualLength);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncode_nonByteArray_ibGp3() throws EncoderException {
        Base16 base16 = new Base16(true);
        assertThrows(EncoderException.class, () -> base16.encode("hello"));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeEmptyArray_PbvL0() {
        Base16 base16 = new Base16();
        byte[] input = new byte[0];
        byte[] output = base16.encode(input);
        assertEquals(0, output.length);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsInAlphabet_LowerCase_False_LTXi1() {
        Base16 base16 = new Base16(true);
        byte[] arrayOctet = new byte[]{10, 20, 30, 40, 50};
        boolean allowWSPad = false;
        assertFalse(base16.isInAlphabet(arrayOctet, allowWSPad));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsInAlphabet_UpperCase_False_pvXB3() {
        Base16 base16 = new Base16(false);
        byte[] arrayOctet = new byte[]{10, 20, 30, 40, 50};
        boolean allowWSPad = false;
        assertFalse(base16.isInAlphabet(arrayOctet, allowWSPad));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeToString_LowerCase_Strict_rujx0() {
        Base16 base16 = new Base16(true, CodecPolicy.STRICT);
        byte[] input = new byte[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        String expected = "0102030405060708090a";
        String actual = base16.encodeToString(input);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeToString_UpperCase_Lenient_QDMF1() {
        Base16 base16 = new Base16(false, CodecPolicy.LENIENT);
        byte[] input = new byte[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        String expected = "0102030405060708090A";
        String actual = base16.encodeToString(input);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsWhiteSpace_lowerCase_strict_cCxW0_1() {
        Base16 base16 = new Base16(true, CodecPolicy.STRICT);
        assertTrue(base16.isWhiteSpace((byte) ' '));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsWhiteSpace_lowerCase_strict_cCxW0_2() {
        Base16 base16 = new Base16(true, CodecPolicy.STRICT);
        assertTrue(base16.isWhiteSpace((byte) '\t'));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsWhiteSpace_lowerCase_strict_cCxW0_3() {
        Base16 base16 = new Base16(true, CodecPolicy.STRICT);
        assertTrue(base16.isWhiteSpace((byte) '\n'));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsWhiteSpace_lowerCase_strict_cCxW0_4() {
        Base16 base16 = new Base16(true, CodecPolicy.STRICT);
        assertTrue(base16.isWhiteSpace((byte) '\r'));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsWhiteSpace_lowerCase_strict_cCxW0_5() {
        Base16 base16 = new Base16(true, CodecPolicy.STRICT);
        assertTrue(base16.isWhiteSpace((byte) '\f'));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsWhiteSpace_lowerCase_strict_cCxW0_6() {
        Base16 base16 = new Base16(true, CodecPolicy.STRICT);
        assertFalse(base16.isWhiteSpace((byte) 'a'));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsWhiteSpace_lowerCase_strict_cCxW0_7() {
        Base16 base16 = new Base16(true, CodecPolicy.STRICT);
        assertFalse(base16.isWhiteSpace((byte) 'A'));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsWhiteSpace_lowerCase_strict_cCxW0_8() {
        Base16 base16 = new Base16(true, CodecPolicy.STRICT);
        assertFalse(base16.isWhiteSpace((byte) '0'));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsWhiteSpace_lowerCase_strict_cCxW0_9() {
        Base16 base16 = new Base16(true, CodecPolicy.STRICT);
        assertFalse(base16.isWhiteSpace((byte) '9'));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsWhiteSpace_lowerCase_strict_cCxW0_10() {
        Base16 base16 = new Base16(true, CodecPolicy.STRICT);
        assertFalse(base16.isWhiteSpace((byte) '+'));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsWhiteSpace_lowerCase_strict_cCxW0_11() {
        Base16 base16 = new Base16(true, CodecPolicy.STRICT);
        assertFalse(base16.isWhiteSpace((byte) '/'));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsWhiteSpace_lowerCase_strict_cCxW0_12() {
        Base16 base16 = new Base16(true, CodecPolicy.STRICT);
        assertFalse(base16.isWhiteSpace((byte) '='));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsWhiteSpace_upperCase_strict_hoNK1_1() {
        Base16 base16 = new Base16(false, CodecPolicy.STRICT);
        assertTrue(base16.isWhiteSpace((byte) ' '));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsWhiteSpace_upperCase_strict_hoNK1_2() {
        Base16 base16 = new Base16(false, CodecPolicy.STRICT);
        assertTrue(base16.isWhiteSpace((byte) '\t'));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsWhiteSpace_upperCase_strict_hoNK1_3() {
        Base16 base16 = new Base16(false, CodecPolicy.STRICT);
        assertTrue(base16.isWhiteSpace((byte) '\n'));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsWhiteSpace_upperCase_strict_hoNK1_4() {
        Base16 base16 = new Base16(false, CodecPolicy.STRICT);
        assertTrue(base16.isWhiteSpace((byte) '\r'));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsWhiteSpace_upperCase_strict_hoNK1_5() {
        Base16 base16 = new Base16(false, CodecPolicy.STRICT);
        assertTrue(base16.isWhiteSpace((byte) '\f'));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsWhiteSpace_upperCase_strict_hoNK1_6() {
        Base16 base16 = new Base16(false, CodecPolicy.STRICT);
        assertFalse(base16.isWhiteSpace((byte) 'a'));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsWhiteSpace_upperCase_strict_hoNK1_7() {
        Base16 base16 = new Base16(false, CodecPolicy.STRICT);
        assertFalse(base16.isWhiteSpace((byte) 'A'));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsWhiteSpace_upperCase_strict_hoNK1_8() {
        Base16 base16 = new Base16(false, CodecPolicy.STRICT);
        assertFalse(base16.isWhiteSpace((byte) '0'));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsWhiteSpace_upperCase_strict_hoNK1_9() {
        Base16 base16 = new Base16(false, CodecPolicy.STRICT);
        assertFalse(base16.isWhiteSpace((byte) '9'));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsWhiteSpace_upperCase_strict_hoNK1_10() {
        Base16 base16 = new Base16(false, CodecPolicy.STRICT);
        assertFalse(base16.isWhiteSpace((byte) '+'));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsWhiteSpace_upperCase_strict_hoNK1_11() {
        Base16 base16 = new Base16(false, CodecPolicy.STRICT);
        assertFalse(base16.isWhiteSpace((byte) '/'));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsWhiteSpace_upperCase_strict_hoNK1_12() {
        Base16 base16 = new Base16(false, CodecPolicy.STRICT);
        assertFalse(base16.isWhiteSpace((byte) '='));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsWhiteSpace_lowerCase_lenient_GDQS2_1() {
        Base16 base16 = new Base16(true, CodecPolicy.LENIENT);
        assertTrue(base16.isWhiteSpace((byte) ' '));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsWhiteSpace_lowerCase_lenient_GDQS2_2() {
        Base16 base16 = new Base16(true, CodecPolicy.LENIENT);
        assertTrue(base16.isWhiteSpace((byte) '\t'));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsWhiteSpace_lowerCase_lenient_GDQS2_3() {
        Base16 base16 = new Base16(true, CodecPolicy.LENIENT);
        assertTrue(base16.isWhiteSpace((byte) '\n'));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsWhiteSpace_lowerCase_lenient_GDQS2_4() {
        Base16 base16 = new Base16(true, CodecPolicy.LENIENT);
        assertTrue(base16.isWhiteSpace((byte) '\r'));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsWhiteSpace_lowerCase_lenient_GDQS2_5() {
        Base16 base16 = new Base16(true, CodecPolicy.LENIENT);
        assertTrue(base16.isWhiteSpace((byte) '\f'));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsWhiteSpace_lowerCase_lenient_GDQS2_6() {
        Base16 base16 = new Base16(true, CodecPolicy.LENIENT);
        assertFalse(base16.isWhiteSpace((byte) 'a'));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsWhiteSpace_lowerCase_lenient_GDQS2_7() {
        Base16 base16 = new Base16(true, CodecPolicy.LENIENT);
        assertFalse(base16.isWhiteSpace((byte) 'A'));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsWhiteSpace_lowerCase_lenient_GDQS2_8() {
        Base16 base16 = new Base16(true, CodecPolicy.LENIENT);
        assertFalse(base16.isWhiteSpace((byte) '0'));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsWhiteSpace_lowerCase_lenient_GDQS2_9() {
        Base16 base16 = new Base16(true, CodecPolicy.LENIENT);
        assertFalse(base16.isWhiteSpace((byte) '9'));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsWhiteSpace_lowerCase_lenient_GDQS2_10() {
        Base16 base16 = new Base16(true, CodecPolicy.LENIENT);
        assertFalse(base16.isWhiteSpace((byte) '+'));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsWhiteSpace_lowerCase_lenient_GDQS2_11() {
        Base16 base16 = new Base16(true, CodecPolicy.LENIENT);
        assertFalse(base16.isWhiteSpace((byte) '/'));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsWhiteSpace_lowerCase_lenient_GDQS2_12() {
        Base16 base16 = new Base16(true, CodecPolicy.LENIENT);
        assertFalse(base16.isWhiteSpace((byte) '='));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsStrictDecoding_StrictPolicy_uSxz0() {
        Base16 base16 = new Base16(true, CodecPolicy.STRICT);
        assertTrue(base16.isStrictDecoding());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDecodeString_nAhV1() throws DecoderException {
        Base16 base16 = new Base16(true, CodecPolicy.STRICT);
        String input = "01020304";
        byte[] expectedOutput = new byte[]{0x01, 0x02, 0x03, 0x04};
        byte[] actualOutput = base16.decode(input);
        assertArrayEquals(expectedOutput, actualOutput);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDecodeEmptyByteArray_WbmE3() throws DecoderException {
        Base16 base16 = new Base16(true, CodecPolicy.STRICT);
        byte[] input = new byte[0];
        byte[] expectedOutput = new byte[0];
        byte[] actualOutput = base16.decode(input);
        assertArrayEquals(expectedOutput, actualOutput);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDecodeEmptyString_Fnxf4() throws DecoderException {
        Base16 base16 = new Base16(true, CodecPolicy.STRICT);
        String input = "";
        byte[] expectedOutput = new byte[0];
        byte[] actualOutput = base16.decode(input);
        assertArrayEquals(expectedOutput, actualOutput);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncode_EmptyArray_GDsF0() {
        Base16 base16 = new Base16(true, CodecPolicy.STRICT);
        byte[] input = new byte[0];
        byte[] output = base16.encode(input, 0, input.length);
        assertEquals(0, output.length);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncode_MixOfPositiveAndNegativeNumbersAndZeroes_NWnj2_1() {
        Base16 base16 = new Base16(true, CodecPolicy.STRICT);
        byte[] input = new byte[]{1, -2, 3, -4, 5, -6, 7, -8, 9, -10};
        byte[] output = base16.encode(input, 0, input.length);
        assertEquals(20, output.length);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetCodecPolicy_strict_IljU0() {
        Base16 base16 = new Base16(true, CodecPolicy.STRICT);
        assertEquals(CodecPolicy.STRICT, base16.getCodecPolicy());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetCodecPolicy_lenient_dvCm1() {
        Base16 base16 = new Base16(true, CodecPolicy.LENIENT);
        assertEquals(CodecPolicy.LENIENT, base16.getCodecPolicy());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDecode_EmptyArray_qBxq0() {
        Base16 base16 = new Base16(true, CodecPolicy.STRICT);
        byte[] input = new byte[0];
        byte[] output = base16.decode(input);
        assertEquals(0, output.length);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetChunkSeparator_wLAB0_1() {
        Base16 base16 = new Base16();
        byte[] chunkSeparator = base16.getChunkSeparator();
        base16 = new Base16(true);
        chunkSeparator = base16.getChunkSeparator();
        base16 = new Base16(true, CodecPolicy.STRICT);
        chunkSeparator = base16.getChunkSeparator();
        base16 = new Base16(true, CodecPolicy.LENIENT);
        chunkSeparator = base16.getChunkSeparator();
        assertEquals(2, chunkSeparator.length);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testContainsAlphabetOrPad_NoAlphabetOrPad_uPQe4() {
        Base16 base16 = new Base16(true, CodecPolicy.STRICT);
        byte[] arrayOctet = new byte[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        assertFalse(base16.containsAlphabetOrPad(arrayOctet));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testReadResults1_WgtG0_oOSe0() {
        Base16 base16 = new Base16(true, CodecPolicy.STRICT);
        byte[] b = new byte[10];
        int bPos = 0;
        int bAvail = 10;
        int len = base16.readResults(b, bPos, bAvail, new Base16.Context());
        assertEquals(0, len);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncode_byteArray_upperCase_VLlN1_eUVs0() throws EncoderException {
        Base16 base16 = new Base16(false);
        byte[] input = new byte[]{0x01, 0x02, 0x03, 0x04, 0x05, 0x06, 0x07, 0x08, 0x09, 0x0a, 0x0b, 0x0c, 0x0d, 0x0e, 0x0f};
        String expected = "0102030405060708090A0B0C0D0E0F";
        String actual = base16.encodeAsString(input);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsWhiteSpace_lowerCase_strict_cCxW0() {
        Base16 base16 = new Base16(true, CodecPolicy.STRICT);
        assertTrue(base16.isWhiteSpace((byte) ' '));
        assertTrue(base16.isWhiteSpace((byte) '\t'));
        assertTrue(base16.isWhiteSpace((byte) '\n'));
        assertTrue(base16.isWhiteSpace((byte) '\r'));
        assertTrue(base16.isWhiteSpace((byte) '\f'));
        assertFalse(base16.isWhiteSpace((byte) 'a'));
        assertFalse(base16.isWhiteSpace((byte) 'A'));
        assertFalse(base16.isWhiteSpace((byte) '0'));
        assertFalse(base16.isWhiteSpace((byte) '9'));
        assertFalse(base16.isWhiteSpace((byte) '+'));
        assertFalse(base16.isWhiteSpace((byte) '/'));
        assertFalse(base16.isWhiteSpace((byte) '='));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsWhiteSpace_upperCase_strict_hoNK1() {
        Base16 base16 = new Base16(false, CodecPolicy.STRICT);
        assertTrue(base16.isWhiteSpace((byte) ' '));
        assertTrue(base16.isWhiteSpace((byte) '\t'));
        assertTrue(base16.isWhiteSpace((byte) '\n'));
        assertTrue(base16.isWhiteSpace((byte) '\r'));
        assertTrue(base16.isWhiteSpace((byte) '\f'));
        assertFalse(base16.isWhiteSpace((byte) 'a'));
        assertFalse(base16.isWhiteSpace((byte) 'A'));
        assertFalse(base16.isWhiteSpace((byte) '0'));
        assertFalse(base16.isWhiteSpace((byte) '9'));
        assertFalse(base16.isWhiteSpace((byte) '+'));
        assertFalse(base16.isWhiteSpace((byte) '/'));
        assertFalse(base16.isWhiteSpace((byte) '='));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsWhiteSpace_lowerCase_lenient_GDQS2() {
        Base16 base16 = new Base16(true, CodecPolicy.LENIENT);
        assertTrue(base16.isWhiteSpace((byte) ' '));
        assertTrue(base16.isWhiteSpace((byte) '\t'));
        assertTrue(base16.isWhiteSpace((byte) '\n'));
        assertTrue(base16.isWhiteSpace((byte) '\r'));
        assertTrue(base16.isWhiteSpace((byte) '\f'));
        assertFalse(base16.isWhiteSpace((byte) 'a'));
        assertFalse(base16.isWhiteSpace((byte) 'A'));
        assertFalse(base16.isWhiteSpace((byte) '0'));
        assertFalse(base16.isWhiteSpace((byte) '9'));
        assertFalse(base16.isWhiteSpace((byte) '+'));
        assertFalse(base16.isWhiteSpace((byte) '/'));
        assertFalse(base16.isWhiteSpace((byte) '='));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeAsString_lowerCase_strictDecodingPolicy_Hyaz0_fid2() {
        Base16 base16 = new Base16(true, CodecPolicy.STRICT);
        byte[] input = new byte[]{0x01, 0x02, 0x03, 0x04, 0x05, 0x06, 0x07, 0x08, 0x09, 0x0A, 0x0B, 0x0C, 0x0D, 0x0E, 0x0F, 0x10};
        String expected = "0102030405060708090a0b0c0d0e0f10";
        String actual = base16.encodeAsString(input);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeAsString_lowerCase_lenientDecodingPolicy_tlGe2_fid2() {
        Base16 base16 = new Base16(true, CodecPolicy.LENIENT);
        byte[] input = new byte[]{0x01, 0x02, 0x03, 0x04, 0x05, 0x06, 0x07, 0x08, 0x09, 0x0A, 0x0B, 0x0C, 0x0D, 0x0E, 0x0F, 0x10};
        String expected = "0102030405060708090a0b0c0d0e0f10";
        String actual = base16.encodeAsString(input);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsInAlphabet_QCjS0_1_fid2() {
        Base16 base16 = new Base16(true, CodecPolicy.STRICT);
        assertFalse(base16.isInAlphabet("0123456789ABCDEF"));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsInAlphabet_QCjS0_4_fid2() {
        Base16 base16 = new Base16(true, CodecPolicy.STRICT);
    }
}