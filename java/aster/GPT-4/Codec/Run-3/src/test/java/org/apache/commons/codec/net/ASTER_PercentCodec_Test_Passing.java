/**
 * Generated by Aster
 */
package org.apache.commons.codec.net;

import java.util.concurrent.TimeUnit;
import org.apache.commons.codec.DecoderException;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_PercentCodec_Test_Passing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDecodeWithNullInput_vnUH0() throws DecoderException {
        PercentCodec codec = new PercentCodec();
        assertNull(codec.decode(null));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDecodeWithByteArray_LcYY1() throws DecoderException {
        PercentCodec codec = new PercentCodec();
        byte[] input = "Hello%20World".getBytes();
        byte[] expected = "Hello World".getBytes();
        assertArrayEquals(expected, (byte[]) codec.decode(input));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeWithNullInput_KVzV0() throws Exception {
        PercentCodec percentCodec = new PercentCodec();
        Object result = percentCodec.encode(null);
        assertNull(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeWithByteArray_uUXv1_1() throws Exception {
        PercentCodec percentCodec = new PercentCodec();
        byte[] input = "test".getBytes();
        Object result = percentCodec.encode(input);
        assertNotNull(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeWithByteArray_uUXv1_2() throws Exception {
        PercentCodec percentCodec = new PercentCodec();
        byte[] input = "test".getBytes();
        Object result = percentCodec.encode(input);
        assertTrue(result instanceof byte[]);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeNullInput_iJgL0() throws Exception {
        PercentCodec codec = new PercentCodec();
        byte[] result = codec.encode(null);
        assertNull(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeEmptyArray_ztrm1() throws Exception {
        PercentCodec codec = new PercentCodec();
        byte[] input = new byte[0];
        byte[] result = codec.encode(input);
        assertArrayEquals(new byte[0], result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeNoSpecialChars_UPup2() throws Exception {
        PercentCodec codec = new PercentCodec();
        byte[] input = "hello".getBytes();
        byte[] result = codec.encode(input);
        assertArrayEquals("hello".getBytes(), result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeSpaceWhenPlusForSpaceTrue_TSwq3() throws Exception {
        PercentCodec codec = new PercentCodec(null, true);
        byte[] input = "hello world".getBytes();
        byte[] expected = "hello+world".getBytes();
        byte[] result = codec.encode(input);
        assertArrayEquals(expected, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeSpecialChars_sJGC4() throws Exception {
        byte[] alwaysEncodeChars = {0x20}; // space character
        PercentCodec codec = new PercentCodec(alwaysEncodeChars, false);
        byte[] input = "hello world".getBytes();
        byte[] expected = "hello%20world".getBytes();
        byte[] result = codec.encode(input);
        assertArrayEquals(expected, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeAllCharsSpecial_MTet5() throws Exception {
        byte[] alwaysEncodeChars = "hello world".getBytes();
        PercentCodec codec = new PercentCodec(alwaysEncodeChars, false);
        byte[] input = "hello world".getBytes();
        byte[] expected = "%68%65%6C%6C%6F%20%77%6F%72%6C%64".getBytes();
        byte[] result = codec.encode(input);
        assertArrayEquals(expected, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncode_NoEncodingNeeded_ReturnsSameArray_JHsT2() throws Exception {
        PercentCodec codec = new PercentCodec();
        byte[] input = {'h', 'e', 'l', 'l', 'o'}; // ASCII characters not in alwaysEncodeChars
        byte[] result = codec.encode(input);
        assertArrayEquals(input, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncode_SpacesAndPlusForSpace_ReturnsEncodedSpaces_OMyT3() throws Exception {
        PercentCodec codec = new PercentCodec(null, true);
        byte[] input = {'h', 'e', 'l', 'l', 'o', ' '};
        byte[] expected = {'h', 'e', 'l', 'l', 'o', '+'};
        byte[] result = codec.encode(input);
        assertArrayEquals(expected, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncode_MixedInput_EncodesCorrectly_jvWc5() throws Exception {
        byte[] alwaysEncodeChars = {' '};
        PercentCodec codec = new PercentCodec(alwaysEncodeChars, false);
        byte[] input = {'h', 'e', 'l', 'l', 'o', ' ', 'w', 'o', 'r', 'l', 'd'};
        byte[] expected = {'h', 'e', 'l', 'l', 'o', '%', '2', '0', 'w', 'o', 'r', 'l', 'd'};
        byte[] result = codec.encode(input);
        assertArrayEquals(expected, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeNonAsciiCharacters_SQIi3() throws Exception {
        PercentCodec codec = new PercentCodec();
        byte[] input = new byte[]{(byte) 0x80, (byte) 0xFF};
        byte[] expected = new byte[]{'%', '8', '0', '%', 'F', 'F'};
        byte[] result = codec.encode(input);
        assertArrayEquals(expected, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeEmptyArray_jtZS1() throws Exception {
        PercentCodec codec = new PercentCodec();
        byte[] input = new byte[0];
        byte[] result = codec.encode(input);
        assertArrayEquals(input, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeNoNeedToEncode_IAlF2() throws Exception {
        PercentCodec codec = new PercentCodec();
        byte[] input = "abc".getBytes();
        byte[] result = codec.encode(input);
        assertArrayEquals(input, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeSpacesWithPlusForSpaceTrue_DSsE3() throws Exception {
        PercentCodec codec = new PercentCodec(null, true);
        byte[] input = "a b".getBytes();
        byte[] expected = "a+b".getBytes();
        byte[] result = codec.encode(input);
        assertArrayEquals(expected, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeSpecialCharacters_ECRg4() throws Exception {
        byte[] alwaysEncodeChars = {(byte) '!', (byte) '#', (byte) '$'};
        PercentCodec codec = new PercentCodec(alwaysEncodeChars, false);
        byte[] input = "a!b#c$d".getBytes();
        byte[] expected = "a%21b%23c%24d".getBytes();
        byte[] result = codec.encode(input);
        assertArrayEquals(expected, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeAllCharacters_LOKV5() throws Exception {
        byte[] alwaysEncodeChars = new byte[256];
        for (int i = 0; i < 256; i++) {
            alwaysEncodeChars[i] = (byte) i;
        }
        PercentCodec codec = new PercentCodec(alwaysEncodeChars, false);
        byte[] input = "abc".getBytes();
        byte[] expected = "%61%62%63".getBytes();
        byte[] result = codec.encode(input);
        assertArrayEquals(expected, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncode_NoSpecialCharacters_ReturnsSameArray_LnOZ2() throws Exception {
        PercentCodec codec = new PercentCodec();
        byte[] input = "hello".getBytes();
        byte[] result = codec.encode(input);
        assertArrayEquals(input, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncode_ContainsSpace_PlusForSpaceTrue_ReturnsModifiedArray_hwyz3() throws Exception {
        PercentCodec codec = new PercentCodec(new byte[]{}, true);
        byte[] input = "hello world".getBytes();
        byte[] expected = "hello+world".getBytes();
        byte[] result = codec.encode(input);
        assertArrayEquals(expected, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncode_ContainsSpace_PlusForSpaceFalse_ReturnsSameArray_Orit4() throws Exception {
        PercentCodec codec = new PercentCodec(new byte[]{}, false);
        byte[] input = "hello world".getBytes();
        byte[] result = codec.encode(input);
        assertArrayEquals(input, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncode_SpecialCharacters_ReturnsEncodedArray_aoph5() throws Exception {
        PercentCodec codec = new PercentCodec(new byte[]{' '}, false);
        byte[] input = "hello world!".getBytes();
        byte[] expected = "hello%20world!".getBytes();
        byte[] result = codec.encode(input);
        assertArrayEquals(expected, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeNullInput_Njao0() throws Exception {
        PercentCodec codec = new PercentCodec();
        assertNull(codec.encode(null));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeEmptyArray_EclV1() throws Exception {
        PercentCodec codec = new PercentCodec();
        assertArrayEquals(new byte[]{}, codec.encode(new byte[]{}));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeNoNeedToEncode_XZVX2() throws Exception {
        PercentCodec codec = new PercentCodec();
        byte[] input = "abc".getBytes();
        assertArrayEquals(input, codec.encode(input));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeSpacesWithPlusForSpaceTrue_wrbR3() throws Exception {
        PercentCodec codec = new PercentCodec(null, true);
        byte[] input = "a b c".getBytes();
        byte[] expected = "a+b+c".getBytes();
        assertArrayEquals(expected, codec.encode(input));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeSpecialCharacters_tAJi4() throws Exception {
        PercentCodec codec = new PercentCodec();
        byte[] input = "a%b".getBytes();
        byte[] expected = {'a', '%', '2', '5', 'b'};
        assertArrayEquals(expected, codec.encode(input));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeNonAsciiCharacters_FMMD5() throws Exception {
        PercentCodec codec = new PercentCodec();
        byte[] input = {(byte) 0x8F};
        byte[] expected = {'%', '8', 'F'};
        assertArrayEquals(expected, codec.encode(input));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDecodeSimpleString_KveX1() throws Exception {
        PercentCodec codec = new PercentCodec();
        assertArrayEquals("Hello".getBytes(), codec.decode("Hello".getBytes()));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDecodePercentEncodedString_KUiP2() throws Exception {
        PercentCodec codec = new PercentCodec();
        assertArrayEquals("Hello World".getBytes(), codec.decode("Hello%20World".getBytes()));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDecodePlusForSpace_pthm3() throws Exception {
        PercentCodec codec = new PercentCodec(null, true);
        assertArrayEquals("Hello World".getBytes(), codec.decode("Hello+World".getBytes()));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDecodeComplexPercentEncodedString_wRBB4() throws Exception {
        PercentCodec codec = new PercentCodec();
        assertArrayEquals("A B C".getBytes(), codec.decode("A%20B%20C".getBytes()));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDecodeInvalidPercentEncoding_KPEs5() throws Exception {
        PercentCodec codec = new PercentCodec();
        try {
            codec.decode("Invalid%GZ".getBytes());
        } catch (DecoderException e) {
            assertArrayEquals("Invalid percent decoding: ".getBytes(), e.getMessage().getBytes());
        }
    }
}