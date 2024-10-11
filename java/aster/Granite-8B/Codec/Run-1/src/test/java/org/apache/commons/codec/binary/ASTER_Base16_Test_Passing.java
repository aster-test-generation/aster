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
    public void testIsInAlphabetStrictPolicy_VYPy0_4() {
        Base16 base16 = new Base16(true, CodecPolicy.STRICT);
        assertFalse(base16.isInAlphabet((byte) 16));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsInAlphabetStrictPolicy_VYPy0_5() {
        Base16 base16 = new Base16(true, CodecPolicy.STRICT);
        assertFalse(base16.isInAlphabet((byte) -1));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsInAlphabetLowerCase_PVgr2_4() {
        Base16 base16 = new Base16(true);
        assertFalse(base16.isInAlphabet((byte) 16));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsInAlphabetLowerCase_PVgr2_5() {
        Base16 base16 = new Base16(true);
        assertFalse(base16.isInAlphabet((byte) -1));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeAsString_Nfql0() {
        Base16 base16 = new Base16();
        byte[] input = new byte[]{1, 2, 3};
        String expected = "010203";
        String actual = base16.encodeAsString(input);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeAsStringWithLowerCase_wxxP1() {
        Base16 base16 = new Base16(true);
        byte[] input = new byte[]{1, 2, 3};
        String expected = "010203";
        String actual = base16.encodeAsString(input);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeAsStringWithDecodingPolicy_dEPD2() {
        Base16 base16 = new Base16(false, CodecPolicy.LENIENT);
        byte[] input = new byte[]{1, 2, 3};
        String expected = "010203";
        String actual = base16.encodeAsString(input);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeAsStringWithLowerCaseAndDecodingPolicy_ncxm3() {
        Base16 base16 = new Base16(true, CodecPolicy.LENIENT);
        byte[] input = new byte[]{1, 2, 3};
        String expected = "010203";
        String actual = base16.encodeAsString(input);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsInAlphabet_kuVC0() {
        Base16 base16 = new Base16();
        boolean result = base16.isInAlphabet("0123456789ABCDEF");
        boolean expected = true;
        assertEquals(expected, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsInAlphabetWithDecodingPolicy_IwHZ1() {
        Base16 base16 = new Base16(true, CodecPolicy.LENIENT);
        boolean result = base16.isInAlphabet("0123456789abcdef");
        boolean expected = true;
        assertEquals(expected, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsInAlphabetWithInvalidInput_Ouxq4() {
        Base16 base16 = new Base16();
        boolean result = base16.isInAlphabet("!@#$%^&*()");
        boolean expected = false;
        assertEquals(expected, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsInAlphabetWithInvalidInputAndDecodingPolicy_nCDF5() {
        Base16 base16 = new Base16(true, CodecPolicy.LENIENT);
        boolean result = base16.isInAlphabet("!@#$%^&*()");
        boolean expected = false;
        assertEquals(expected, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsInAlphabetWithInvalidInputAndLowerCase_DQFg6() {
        Base16 base16 = new Base16(true);
        boolean result = base16.isInAlphabet("!@#$%^&*()");
        boolean expected = false;
        assertEquals(expected, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testToLengthWithNullArray_EURb0() {
        byte[] array = null;
        int expectedLength = 0;
        int actualLength = Base16.toLength(array);
        assertEquals(expectedLength, actualLength);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testToLengthWithNonNullArray_vcgt1() {
        byte[] array = new byte[10];
        int expectedLength = 10;
        int actualLength = Base16.toLength(array);
        assertEquals(expectedLength, actualLength);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetEncodedLength_jLxj0() {
        Base16 base16 = new Base16();
        byte[] pArray = new byte[10];
        long expected = (pArray.length + 1 - 1) / 1 * (long) 2;
        assertEquals(expected, base16.getEncodedLength(pArray));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetEncodedLength2_YoTY1() {
        Base16 base16 = new Base16();
        byte[] pArray = new byte[100];
        long expected = (pArray.length + 1 - 1) / 1 * (long) 2;
        assertEquals(expected, base16.getEncodedLength(pArray));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeEmptyArray_yMRM0() {
        byte[] input = new byte[0];
        byte[] expectedOutput = new byte[0];
        Base16 base16 = new Base16();
        byte[] actualOutput = base16.encode(input);
        assertArrayEquals(expectedOutput, actualOutput);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsInAlphabetWithStrictPolicy_XMfh0() {
        Base16 base16 = new Base16(false, CodecPolicy.STRICT);
        byte[] arrayOctet = new byte[]{0x30, 0x31, 0x32, 0x33, 0x34, 0x35, 0x36, 0x37, 0x38, 0x39, 0x41, 0x42, 0x43, 0x44, 0x45, 0x46};
        boolean result = base16.isInAlphabet(arrayOctet, false);
        assertTrue(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsInAlphabetWithLenientPolicy_IleV1() {
        Base16 base16 = new Base16(false, CodecPolicy.LENIENT);
        byte[] arrayOctet = new byte[]{0x30, 0x31, 0x32, 0x33, 0x34, 0x35, 0x36, 0x37, 0x38, 0x39, 0x41, 0x42, 0x43, 0x44, 0x45, 0x46};
        boolean result = base16.isInAlphabet(arrayOctet, false);
        assertTrue(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsInAlphabetWithLowerCase_VqIk2() {
        Base16 base16 = new Base16(true, CodecPolicy.STRICT);
        byte[] arrayOctet = new byte[]{0x30, 0x31, 0x32, 0x33, 0x34, 0x35, 0x36, 0x37, 0x38, 0x39, 0x61, 0x62, 0x63, 0x64, 0x65, 0x66};
        boolean result = base16.isInAlphabet(arrayOctet, false);
        assertTrue(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsInAlphabetWithWSPad_dMFB3() {
        Base16 base16 = new Base16(false, CodecPolicy.STRICT);
        byte[] arrayOctet = new byte[]{0x30, 0x31, 0x32, 0x33, 0x34, 0x35, 0x36, 0x37, 0x38, 0x39, 0x41, 0x42, 0x43, 0x44, 0x45, 0x46, 0x20};
        boolean result = base16.isInAlphabet(arrayOctet, true);
        assertTrue(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsInAlphabetWithInvalidOctet_NUAB4() {
        Base16 base16 = new Base16(false, CodecPolicy.STRICT);
        byte[] arrayOctet = new byte[]{0x30, 0x31, 0x32, 0x33, 0x34, 0x35, 0x36, 0x37, 0x38, 0x39, 0x41, 0x42, 0x43, 0x44, 0x45, 0x47};
        boolean result = base16.isInAlphabet(arrayOctet, false);
        assertFalse(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsInAlphabetWithInvalidOctetAndWSPad_dMgz5() {
        Base16 base16 = new Base16(false, CodecPolicy.STRICT);
        byte[] arrayOctet = new byte[]{0x30, 0x31, 0x32, 0x33, 0x34, 0x35, 0x36, 0x37, 0x38, 0x39, 0x41, 0x42, 0x43, 0x44, 0x45, 0x47, 0x20};
        boolean result = base16.isInAlphabet(arrayOctet, true);
        assertFalse(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsWhiteSpace_ekxu0() {
        Base16 base16 = new Base16();
        byte whitespace = ' ';
        assertTrue(Base16.isWhiteSpace(whitespace));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsWhiteSpaceWithNonWhitespace_Qvwb1() {
        Base16 base16 = new Base16();
        byte nonWhitespace = 'a';
        assertFalse(Base16.isWhiteSpace(nonWhitespace));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsWhiteSpaceWithTab_prxK2() {
        Base16 base16 = new Base16();
        byte tab = '\t';
        assertTrue(Base16.isWhiteSpace(tab));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsWhiteSpaceWithNewline_nSoJ3() {
        Base16 base16 = new Base16();
        byte newline = '\n';
        assertTrue(Base16.isWhiteSpace(newline));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsWhiteSpaceWithCarriageReturn_PShZ4() {
        Base16 base16 = new Base16();
        byte carriageReturn = '\r';
        assertTrue(Base16.isWhiteSpace(carriageReturn));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsWhiteSpaceWithFormFeed_mfFO5() {
        Base16 base16 = new Base16();
        byte formFeed = '\f';
        assertTrue(Base16.isWhiteSpace(formFeed));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsWhiteSpaceWithNull_NjNw6() {
        Base16 base16 = new Base16();
        byte nullByte = 0;
        assertFalse(Base16.isWhiteSpace(nullByte));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsWhiteSpaceWithMaxByte_vrBl7() {
        Base16 base16 = new Base16();
        byte maxByte = Byte.MAX_VALUE;
        assertFalse(Base16.isWhiteSpace(maxByte));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsWhiteSpaceWithMinByte_qxgU8() {
        Base16 base16 = new Base16();
        byte minByte = Byte.MIN_VALUE;
        assertFalse(Base16.isWhiteSpace(minByte));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsStrictDecodingWithStrictPolicy_ovaD0() {
        Base16 base16 = new Base16(true, CodecPolicy.STRICT);
        boolean result = base16.isStrictDecoding();
        assertTrue(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsStrictDecodingWithLenientPolicy_EuQP1() {
        Base16 base16 = new Base16(true, CodecPolicy.LENIENT);
        boolean result = base16.isStrictDecoding();
        assertFalse(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDecodeString_KdEv1() throws DecoderException {
        Base16 base16 = new Base16();
        String input = "61626364";
        byte[] expectedOutput = new byte[]{0x61, 0x62, 0x63, 0x64};
        byte[] actualOutput = base16.decode(input);
        assertArrayEquals(expectedOutput, actualOutput);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDecodeInvalidInput_plqP2() throws DecoderException {
        Base16 base16 = new Base16();
        try {
            base16.decode(123);
            fail("DecoderException expected");
        } catch (DecoderException e) {
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeWithEmptyArray_uCit0() {
        Base16 base16 = new Base16();
        byte[] input = new byte[0];
        byte[] output = base16.encode(input, 0, 0);
        assertArrayEquals(input, output);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetCodecPolicy_wmzT0_2() {
        Base16 base16 = new Base16(true, CodecPolicy.STRICT);
        base16 = new Base16(true, CodecPolicy.LENIENT);
        base16 = new Base16(false, CodecPolicy.STRICT);
        base16 = new Base16(false, CodecPolicy.LENIENT);
        assertEquals(CodecPolicy.LENIENT, base16.getCodecPolicy());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDecodeEmptyArray_OnGE0_1() {
        Base16 base16 = new Base16();
        byte[] result = base16.decode(new byte[0]);
        assertNotNull(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDecodeEmptyArray_OnGE0_2() {
        Base16 base16 = new Base16();
        byte[] result = base16.decode(new byte[0]);
        assertEquals(0, result.length);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetChunkSeparator_IPEr0() {
        byte[] expected = {0x0D, 0x0A};
        byte[] actual = Base16.getChunkSeparator();
        assertArrayEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testContainsAlphabetOrPadWithEmptyArray_dgAu0() {
        Base16 base16 = new Base16();
        byte[] arrayOctet = new byte[0];
        boolean result = base16.containsAlphabetOrPad(arrayOctet);
        assertFalse(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testContainsAlphabetOrPadWithArrayContainingUppercaseAlphabet_kxta3() {
        Base16 base16 = new Base16();
        byte[] arrayOctet = {'A'};
        boolean result = base16.containsAlphabetOrPad(arrayOctet);
        assertTrue(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testContainsAlphabetOrPadWithArrayContainingNonAlphabetCharacter_eubf4() {
        Base16 base16 = new Base16();
        byte[] arrayOctet = {'!'};
        boolean result = base16.containsAlphabetOrPad(arrayOctet);
        assertFalse(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testContainsAlphabetOrPadWithNullArray_EpZn6() {
        Base16 base16 = new Base16();
        byte[] arrayOctet = null;
        boolean result = base16.containsAlphabetOrPad(arrayOctet);
        assertFalse(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeWithStrictPolicy_GTlm0_iDiU0() throws EncoderException {
        Base16 base16 = new Base16(false, CodecPolicy.STRICT);
        byte[] input = {0, 1, 2, 3};
        String expectedOutput = "00010203";
        String actualOutput = base16.encodeAsString(input);
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeWithLenientPolicy_wQAg1_VTyi0() throws EncoderException {
        Base16 base16 = new Base16(false, CodecPolicy.LENIENT);
        byte[] input = {0, 1, 2, 3};
        String expectedOutput = "00010203";
        String actualOutput = base16.encodeAsString(input);
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetCodecPolicy_wmzT0() {
        Base16 base16 = new Base16(true, CodecPolicy.STRICT);
        assertEquals(CodecPolicy.STRICT, base16.getCodecPolicy());
        base16 = new Base16(true, CodecPolicy.LENIENT);
        assertEquals(CodecPolicy.LENIENT, base16.getCodecPolicy());
        base16 = new Base16(false, CodecPolicy.STRICT);
        assertEquals(CodecPolicy.STRICT, base16.getCodecPolicy());
        base16 = new Base16(false, CodecPolicy.LENIENT);
        assertEquals(CodecPolicy.LENIENT, base16.getCodecPolicy());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDecodeEmptyArray_OnGE0() {
        Base16 base16 = new Base16();
        byte[] result = base16.decode(new byte[0]);
        assertNotNull(result);
        assertEquals(0, result.length);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsInAlphabetStrictPolicy_VYPy0_1_fid2() {
        Base16 base16 = new Base16(true, CodecPolicy.STRICT);
        assertFalse(base16.isInAlphabet((byte) 0));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsInAlphabetStrictPolicy_VYPy0_2_fid2() {
        Base16 base16 = new Base16(true, CodecPolicy.STRICT);
        assertFalse(base16.isInAlphabet((byte) 9));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsInAlphabetStrictPolicy_VYPy0_3_fid2() {
        Base16 base16 = new Base16(true, CodecPolicy.STRICT);
        assertFalse(base16.isInAlphabet((byte) 15));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsInAlphabetLenientPolicy_RHRo1_1_fid2() {
        Base16 base16 = new Base16(true, CodecPolicy.LENIENT);
        assertFalse(base16.isInAlphabet((byte) 0));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsInAlphabetLenientPolicy_RHRo1_2_fid2() {
        Base16 base16 = new Base16(true, CodecPolicy.LENIENT);
        assertFalse(base16.isInAlphabet((byte) 9));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsInAlphabetLenientPolicy_RHRo1_3_fid2() {
        Base16 base16 = new Base16(true, CodecPolicy.LENIENT);
        assertFalse(base16.isInAlphabet((byte) 15));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsInAlphabetLenientPolicy_RHRo1_4_fid2() {
        Base16 base16 = new Base16(true, CodecPolicy.LENIENT);
        assertFalse(base16.isInAlphabet((byte) 16));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsInAlphabetLenientPolicy_RHRo1_5_fid2() {
        Base16 base16 = new Base16(true, CodecPolicy.LENIENT);
        assertFalse(base16.isInAlphabet((byte) -1));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsInAlphabetLowerCase_PVgr2_1_fid2() {
        Base16 base16 = new Base16(true);
        assertFalse(base16.isInAlphabet((byte) 0));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsInAlphabetLowerCase_PVgr2_2_fid2() {
        Base16 base16 = new Base16(true);
        assertFalse(base16.isInAlphabet((byte) 9));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsInAlphabetLowerCase_PVgr2_3_fid2() {
        Base16 base16 = new Base16(true);
        assertFalse(base16.isInAlphabet((byte) 15));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsInAlphabetWithLowerCase_OdwP2_fid2() {
        Base16 base16 = new Base16(true);
        boolean result = base16.isInAlphabet("0123456789ABCDEF");
        boolean expected = false;
        assertEquals(expected, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeToString_XGrU0_fid2() {
        Base16 base16 = new Base16();
        byte[] inputArray = {0, 1, 2, 3};
        String expectedOutput = "00010203";
        String actualOutput = base16.encodeToString(inputArray);
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeToStringWithLowerCase_XzGw1_fid2() {
        Base16 base16 = new Base16(true);
        byte[] inputArray = {0, 1, 2, 3};
        String expectedOutput = "00010203";
        String actualOutput = base16.encodeToString(inputArray);
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeToStringWithDecodingPolicy_PgER2_fid2() {
        Base16 base16 = new Base16(false, CodecPolicy.LENIENT);
        byte[] inputArray = {0, 1, 2, 3};
        String expectedOutput = "00010203";
        String actualOutput = base16.encodeToString(inputArray);
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetCodecPolicy_wmzT0_1_fid2() {
        Base16 base16 = new Base16(true, CodecPolicy.LENIENT);
        base16 = new Base16(true, CodecPolicy.LENIENT);
        base16 = new Base16(false, CodecPolicy.LENIENT);
        base16 = new Base16(false, CodecPolicy.LENIENT);
        assertEquals(CodecPolicy.LENIENT, base16.getCodecPolicy());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testContainsAlphabetOrPadWithArrayContainingLowercaseAlphabet_MPqq2_fid2() {
        Base16 base16 = new Base16();
        byte[] arrayOctet = {'a'};
        boolean result = base16.containsAlphabetOrPad(arrayOctet);
        assertFalse(result);
    }
}