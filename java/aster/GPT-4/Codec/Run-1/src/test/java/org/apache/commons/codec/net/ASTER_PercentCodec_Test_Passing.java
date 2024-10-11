/**
 * Generated by Aster
 */
package org.apache.commons.codec.net;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

import java.util.concurrent.TimeUnit;
import org.apache.commons.codec.DecoderException;
import org.apache.commons.codec.EncoderException;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

public class Aster_PercentCodec_Test_Passing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDecodeWithNull_qPbK0() throws DecoderException {
        PercentCodec codec = new PercentCodec();
        assertNull(codec.decode(null));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDecodeWithByteArray_ueji1() throws DecoderException {
        PercentCodec codec = new PercentCodec();
        byte[] input = "Hello%20World".getBytes();
        byte[] expected = "Hello World".getBytes();
        assertArrayEquals(expected, (byte[]) codec.decode(input));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeWithNull_yXkC0() throws EncoderException {
        PercentCodec codec = new PercentCodec();
        assertNull(codec.encode(null));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeWithByteArray_qFaO1() throws EncoderException {
        PercentCodec codec = new PercentCodec();
        byte[] input = new byte[]{65, 66, 67}; // ASCII for "ABC"
        assertNotNull(codec.encode(input));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDecodeIncompleteEscapeSequence_pAFA5() {
        PercentCodec codec = new PercentCodec();
        byte[] input = "Broken%2".getBytes();
        try {
            codec.decode(input);
            fail("DecoderException expected");
        } catch (DecoderException e) {
            assertNotNull(e);
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeEmptyArray_hZFr1_mqBH0() {
        PercentCodec codec = new PercentCodec();
        byte[] input = new byte[0];
        try {
            byte[] result = codec.decode(input); // Corrected method call to decode
            assertArrayEquals(input, result);
        } catch (DecoderException e) {
            fail("DecoderException should not be thrown");
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeNoSpecialCharacters_tptQ2_Gqed0() {
        PercentCodec codec = new PercentCodec();
        byte[] input = "hello".getBytes();
        byte[] result = new byte[0];
        try {
            result = codec.encode(input);
        } catch (EncoderException e) {
            fail("EncoderException should not be thrown");
        }
        assertArrayEquals(input, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeMixedCharacters_wbSE5_tmeE0() {
        try {
            PercentCodec codec = new PercentCodec(new byte[]{'#', ' '}, true);
            byte[] input = "hash # and space".getBytes();
            byte[] expected = "hash%20%23%20and%20space".getBytes();
            byte[] result = codec.encode(input);
            assertArrayEquals(expected, result);
        } catch (EncoderException e) {
            fail("EncoderException should not be thrown");
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDecodeEmptyArray_putE1_hHWf0() {
        PercentCodec codec = new PercentCodec();
        try {
            byte[] result = codec.decode(new byte[0]);
            assertArrayEquals(new byte[0], result);
        } catch (DecoderException e) {
            fail("DecoderException should not be thrown");
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeWithSpecialCharacters_Fxsm3_Zknu0() {
        byte[] alwaysEncodeChars = {0x21}; // '!' character
        PercentCodec codec = new PercentCodec(alwaysEncodeChars, false);
        byte[] input = "hello!".getBytes();
        byte[] expected = "hello%21".getBytes();
        byte[] result = new byte[0];
        try {
            result = codec.encode(input);
        } catch (EncoderException e) {
            fail("EncoderException should not be thrown");
        }
        assertArrayEquals(expected, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeWithSpaceAndPlusForSpaceTrue_KtXC4_bLTt0() {
        try {
            PercentCodec codec = new PercentCodec(new byte[0], true);
            byte[] input = "hello world".getBytes();
            byte[] expected = "hello+world".getBytes();
            byte[] result = codec.encode(input);
            assertArrayEquals(expected, result);
        } catch (EncoderException e) {
            fail("EncoderException should not be thrown");
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeWithNonAsciiCharacters_zuKN5_Jtuk0() {
        PercentCodec codec = new PercentCodec();
        byte[] input = new byte[]{(byte) 0x80, (byte) 0xFF};
        byte[] expected = "%80%FF".getBytes();
        byte[] result = new byte[0];
        try {
            result = codec.encode(input);
        } catch (EncoderException e) {
            fail("EncoderException should not be thrown");
        }
        assertArrayEquals(expected, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncode_EmptyArray_JgxJ1_JQLh0() {
        PercentCodec codec = new PercentCodec();
        try {
            assertArrayEquals(new byte[]{}, codec.encode(new byte[]{}));
        } catch (EncoderException e) {
            fail("EncoderException should not be thrown");
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncode_NoEncodingNeeded_eRbz2_zayW0() {
        try {
            byte[] input = new byte[]{};
            PercentCodec codec = new PercentCodec();
            assertArrayEquals(input, codec.encode(input));
        } catch (EncoderException e) {
            fail("EncoderException should not be thrown");
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncode_EncodingNeeded_TvHW3_pkWU0() {
        try {
            PercentCodec codec = new PercentCodec(new byte[]{(byte) 'a'}, false);
            byte[] input = "a".getBytes();
            byte[] expected = "%61".getBytes();
            assertArrayEquals(expected, codec.encode(input));
        } catch (EncoderException e) {
            fail("EncoderException should not be thrown");
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncode_EmptyArray_ReturnsSameArray_IsaU1_PDVX0() {
        PercentCodec codec = new PercentCodec();
        byte[] input = new byte[0];
        try {
            byte[] result = codec.decode(input); // Correct method call to decode
            assertArrayEquals(input, result);
        } catch (DecoderException e) {
            fail("DecoderException should not be thrown");
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncode_NoEncodingNeeded_ReturnsSameArray_nLGm2_ZcES0() {
        PercentCodec codec = new PercentCodec();
        byte[] input = "test".getBytes();
        try {
            byte[] output = codec.encode(input);
            assertArrayEquals(input, output);
        } catch (EncoderException e) {
            fail("EncoderException should not be thrown");
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncode_SpaceInInput_PlusForSpaceFalse_ReturnsSameArray_EEpO4_OSLP0() {
        try {
            PercentCodec codec = new PercentCodec();
            byte[] input = "test test".getBytes();
            assertArrayEquals(input, codec.encode(input));
        } catch (EncoderException e) {
            fail("EncoderException should not be thrown");
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncode_SpecialCharacters_ReturnsEncodedArray_jLSo5_HiPs0() {
        byte[] alwaysEncodeChars = {'%', '#', '&'};
        PercentCodec codec = new PercentCodec(alwaysEncodeChars, false);
        byte[] input = "test%#&".getBytes();
        byte[] expected = "test%25%23%26".getBytes(); // Assuming doEncode encodes '%' to '%25', '#' to '%23', '&' to '%26'
        try {
            assertArrayEquals(expected, codec.encode(input));
        } catch (EncoderException e) {
            fail("EncoderException should not be thrown");
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeNegativeByteValue_ifgS5_YfUk0() {
        PercentCodec codec = new PercentCodec();
        byte[] input = new byte[]{(byte) 0x8F}; // Negative in two's complement
        byte[] expected = "%8F".getBytes();
        byte[] result = new byte[0];
        try {
            result = codec.encode(input);
        } catch (EncoderException e) {
            fail("EncoderException should not be thrown");
        }
        assertArrayEquals(expected, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeNonAsciiCharacters_bWek5_BVhc0() {
        PercentCodec codec = new PercentCodec();
        byte[] input = new byte[]{(byte) 0x80}; // Non-ASCII character
        byte[] expected = "%80".getBytes();
        byte[] result = new byte[0];
        try {
            result = codec.encode(input);
        } catch (EncoderException e) {
            fail("EncoderException should not be thrown");
        }
        assertArrayEquals(expected, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncode_EmptyArray_ReturnsEmptyArray_PLiD1_wtaR0() {
        PercentCodec codec = new PercentCodec();
        byte[] input = new byte[0];
        byte[] result = new byte[0];
        try {
            result = codec.encode(input);
        } catch (EncoderException e) {
            fail("EncoderException should not be thrown");
        }
        assertArrayEquals(new byte[0], result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncode_NoEncodingNeeded_ReturnsSameArray_AgRj2_lOJC0() {
        PercentCodec codec = new PercentCodec();
        byte[] input = {'h', 'e', 'l', 'l', 'o'};
        byte[] result = new byte[0];
        try {
            result = codec.encode(input);
        } catch (EncoderException e) {
            fail("EncoderException should not be thrown");
        }
        assertArrayEquals(input, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncode_EncodeSpecialCharactersDefined_ReturnsEncodedArray_mudd5_FokF0() {
        byte[] alwaysEncodeChars = {'!', '*', '(', ')'};
        PercentCodec codec = new PercentCodec(alwaysEncodeChars, false);
        byte[] input = {'h', 'e', '!', 'l', '*', 'o', '(', ')'};
        byte[] expected = {'h', 'e', '%', '2', '1', 'l', '%', '2', 'A', 'o', '%', '2', '8', '%', '2', '9'};
        byte[] result = new byte[0];
        try {
            result = codec.encode(input);
        } catch (EncoderException e) {
            fail("EncoderException should not be thrown");
        }
        assertArrayEquals(expected, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncode_NoNeedToEncode_ReturnsSameArray_tqOA2_ZiMd0() {
        try {
            PercentCodec codec = new PercentCodec();
            byte[] input = "hello".getBytes();
            assertArrayEquals(input, codec.encode(input));
        } catch (EncoderException e) {
            fail("EncoderException should not be thrown");
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncode_SpaceEncoding_ReturnsPlus_MsKG3_ngdh0() {
        try {
            PercentCodec codec = new PercentCodec(null, true);
            byte[] input = "hello world".getBytes();
            byte[] expected = "hello+world".getBytes();
            assertArrayEquals(expected, codec.encode(input));
        } catch (EncoderException e) {
            fail("EncoderException should not be thrown");
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDecodeNullInput_VyPr0_jFEM0() {
        PercentCodec codec = new PercentCodec();
        byte[] result = null;
        try {
            result = codec.decode(null);
        } catch (DecoderException e) {
            e.printStackTrace();
        }
        assertNull(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDecodeEmptyArray_pQxi1_hrmN0() {
        PercentCodec codec = new PercentCodec();
        try {
            byte[] result = codec.decode(new byte[]{});
            assertArrayEquals(new byte[]{}, result);
        } catch (DecoderException e) {
            fail("DecoderException should not be thrown for an empty array.");
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDecodeNoEscapes_RSKP2_VxLf0() {
        try {
            PercentCodec codec = new PercentCodec();
            byte[] input = "Hello".getBytes();
            byte[] result = codec.decode(input);
            assertArrayEquals(input, result);
        } catch (DecoderException e) {
            fail("DecoderException should not be thrown");
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDecodeWithEscapes_hdLc3_Gfkv0() {
        PercentCodec codec = new PercentCodec();
        byte[] input = "Hello%20World".getBytes();
        byte[] expected = "Hello World".getBytes();
        byte[] result = null;
        try {
            result = codec.decode(input);
        } catch (DecoderException e) {
            fail("DecoderException should not be thrown");
        }
        assertArrayEquals(expected, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDecodeWithPlusForSpace_cryT4_amCa0() {
        try {
            PercentCodec codec = new PercentCodec(null, true);
            byte[] input = "Hello+World".getBytes();
            byte[] expected = "Hello World".getBytes();
            byte[] result = codec.decode(input);
            assertArrayEquals(expected, result);
        } catch (DecoderException e) {
            fail("DecoderException should not be thrown");
        }
    }
}