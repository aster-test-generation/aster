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
    public void testDecode_byteArray_FImA0() throws DecoderException {
        byte[] input = new byte[]{65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90};
        byte[] output = new PercentCodec().decode(input);
        assertArrayEquals(input, output);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDecode_string_YFJB1() throws DecoderException {
        String input = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        byte[] output = new PercentCodec().decode(input.getBytes());
        assertArrayEquals(input.getBytes(), output);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncode_byteArray_dozM0() throws EncoderException {
        byte[] bytes = new byte[]{1, 2, 3, 4, 5};
        PercentCodec codec = new PercentCodec();
        Object encoded = codec.encode(bytes);
        assertEquals(bytes, encoded);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncode_nonByteArray_HnIK1() throws EncoderException {
        String str = "hello";
        PercentCodec codec = new PercentCodec();
        byte[] encoded = codec.encode(str.getBytes());
        assertArrayEquals(str.getBytes(), encoded);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncode_null_DKyB2() throws EncoderException {
        PercentCodec codec = new PercentCodec();
        Object encoded = codec.encode(null);
        assertNull(encoded);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncode1_aVcZ0() throws EncoderException {
        PercentCodec percentCodec = new PercentCodec();
        byte[] bytes = new byte[]{1, 2, 3, 4, 5};
        byte[] expected = new byte[]{1, 2, 3, 4, 5};
        byte[] actual = percentCodec.encode(bytes);
        assertArrayEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncode_null_GVay0_UQaD0() {
        PercentCodec percentCodec = new PercentCodec();
        byte[] bytes = null;
        byte[] expected = null;
        try {
            byte[] actual = percentCodec.encode(bytes);
            assertArrayEquals(expected, actual);
        } catch (EncoderException e) {
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncode_empty_MSoM1_rvWq0() {
        PercentCodec percentCodec = new PercentCodec();
        byte[] bytes = new byte[0];
        byte[] expected = new byte[0];
        try {
            byte[] actual = percentCodec.encode(bytes);
            assertArrayEquals(expected, actual);
        } catch (EncoderException e) {
            e.printStackTrace();
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncode_noEncoding_PDBG2_YTry1() {
        PercentCodec percentCodec = new PercentCodec();
        byte[] bytes = new byte[]{1, 2, 3};
        byte[] expected = new byte[]{1, 2, 3};
        try {
            byte[] actual = percentCodec.encode(bytes);
            assertArrayEquals(expected, actual);
        } catch (EncoderException e) {
            e.printStackTrace();
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncode_withEncoding_VdQV3_drgL0() {
        PercentCodec percentCodec = new PercentCodec();
        byte[] bytes = new byte[]{1, 2, 3, 4, 5, 6};
        byte[] expected = new byte[]{1, 2, 3, 4, 5, 6};
        try {
            byte[] actual = percentCodec.encode(bytes);
            assertArrayEquals(expected, actual);
        } catch (EncoderException e) {
            e.printStackTrace();
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncode_withPlusForSpaceAndNoEncoding_mUKc5_xOgy0() {
        PercentCodec percentCodec = new PercentCodec(new byte[]{32}, true);
        byte[] bytes = new byte[]{1, 2, 3, 4, 5, 6};
        byte[] expected = new byte[]{1, 2, 3, 4, 5, 6};
        try {
            byte[] actual = percentCodec.encode(bytes);
            assertArrayEquals(expected, actual);
        } catch (EncoderException e) {
            fail("Unexpected EncoderException thrown");
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeNull_xUYk0_STSI1() {
        PercentCodec percentCodec = new PercentCodec();
        byte[] input = null;
        byte[] expectedOutput = null;
        try {
            byte[] actualOutput = percentCodec.encode(input);
            assertEquals(expectedOutput, actualOutput);
        } catch (EncoderException e) {
            e.printStackTrace();
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeEmpty_ErRB1_Olxa0() throws EncoderException {
        PercentCodec percentCodec = new PercentCodec();
        byte[] input = new byte[0];
        byte[] expectedOutput = new byte[0];
        byte[] actualOutput = percentCodec.encode(input);
        assertArrayEquals(expectedOutput, actualOutput);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeNoEncodingNeeded_sjQT2_NnAj0() {
        PercentCodec percentCodec = new PercentCodec();
        byte[] input = new byte[]{1, 2, 3, 4, 5};
        byte[] expectedOutput = new byte[]{1, 2, 3, 4, 5};
        try {
            byte[] actualOutput = percentCodec.encode(input);
            assertArrayEquals(expectedOutput, actualOutput);
        } catch (EncoderException e) {
            fail("EncoderException should not be thrown");
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeSpaceInInput_KKNJ4_FJaM0() {
        PercentCodec percentCodec = new PercentCodec();
        byte[] input = new byte[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        byte[] expectedOutput = new byte[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        try {
            byte[] actualOutput = percentCodec.encode(input);
            assertArrayEquals(expectedOutput, actualOutput);
        } catch (EncoderException e) {
            e.printStackTrace();
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncode_NullInput_ALwF0_ZNMm0() {
        PercentCodec codec = new PercentCodec();
        try {
            assertNull(codec.encode(null));
        } catch (EncoderException e) {
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncode_EmptyInput_ZNtc1_uPdv1() {
        PercentCodec codec = new PercentCodec();
        try {
            assertEquals(0, codec.encode(new byte[0]).length);
        } catch (EncoderException e) {
            e.printStackTrace();
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncode_null_Xmfr0_SSYK6() {
        PercentCodec codec = new PercentCodec();
        byte[] bytes = null;
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncode_empty_umGi1_ztyM0() {
        PercentCodec codec = new PercentCodec();
        byte[] bytes = new byte[0];
        try {
            assertEquals(0, codec.encode(bytes).length);
        } catch (EncoderException e) {
            e.printStackTrace();
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncode_asciiChars_PbZT2_ICoS1() {
        PercentCodec codec = new PercentCodec();
        byte[] bytes = new byte[]{65, 66, 67};
        try {
            assertEquals(3, codec.encode(bytes).length);
        } catch (EncoderException e) {
            e.printStackTrace();
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncode_nonAsciiChars_ZwJK3_dziR1() {
        PercentCodec codec = new PercentCodec();
        byte[] bytes = new byte[]{-65, -66, -67};
        try {
            assertEquals(9, codec.encode(bytes).length);
        } catch (EncoderException e) {
            e.printStackTrace();
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncode_plusForSpace_zclx5_ywNg0() {
        PercentCodec codec = new PercentCodec(new byte[]{32}, true);
        byte[] bytes = new byte[]{32};
        try {
            assertEquals(3, codec.encode(bytes).length);
        } catch (EncoderException e) {
            e.printStackTrace();
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncode_null_cnEe0_vUkM1() {
        PercentCodec codec = new PercentCodec();
        try {
            byte[] result = codec.encode(null);
            assertNull(result);
        } catch (EncoderException e) {
            e.printStackTrace();
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncode_empty_MjWg1_JUAr0() {
        PercentCodec codec = new PercentCodec();
        try {
            byte[] result = codec.encode(new byte[0]);
            assertEquals(0, result.length);
        } catch (EncoderException e) {
            e.printStackTrace();
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncode_noEncoding_IQKl2_bKmW0() {
        PercentCodec codec = new PercentCodec();
        byte[] bytes = new byte[]{1, 2, 3, 4, 5};
        byte[] result;
        try {
            result = codec.encode(bytes);
        } catch (EncoderException e) {
            e.printStackTrace();
            return;
        }
        assertEquals(bytes.length, result.length);
        for (int i = 0; i < bytes.length; i++) {
            assertEquals(bytes[i], result[i]);
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncode_NullInput_hiyS0_LsSJ1() {
        PercentCodec percentCodec = new PercentCodec();
        try {
            byte[] result = percentCodec.encode(null);
            assertNull(result);
        } catch (EncoderException e) {
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncode_EncodedInput_UDJr3_Cmeg0() {
        PercentCodec percentCodec = new PercentCodec();
        byte[] input = new byte[]{1, 2, 3, 4, 5};
        byte[] expected = new byte[]{1, 2, 3, 4, 5};
        try {
            byte[] result = percentCodec.encode(input);
            assertEquals(expected.length, result.length);
            for (int i = 0; i < expected.length; i++) {
                assertEquals(expected[i], result[i]);
            }
        } catch (EncoderException e) {
            e.printStackTrace();
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncode_noEncoding_Dtyr2_RjBo1() {
        PercentCodec percentCodec = new PercentCodec();
        byte[] bytes = new byte[]{65, 66, 67};
        byte[] expected = new byte[]{65, 66, 67};
        try {
            byte[] actual = percentCodec.encode(bytes);
            assertArrayEquals(expected, actual);
        } catch (EncoderException e) {
            e.printStackTrace();
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncode_withAlwaysEncodeChars_obOL5_ZITF0() {
        PercentCodec percentCodec = new PercentCodec(new byte[]{65, 66, 67}, true);
        byte[] bytes = new byte[]{65, 66, 67, 68, 69, 70, 71, 72};
        byte[] expected = new byte[]{65, 66, 67, 68, 69, 70, 71, 72, 73};
        try {
            byte[] actual = percentCodec.encode(bytes);
        } catch (EncoderException e) {
            e.printStackTrace();
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncode1_Bwoj0_gpdn0() {
        PercentCodec percentCodec = new PercentCodec();
        byte[] bytes = new byte[]{0x00, 0x01, 0x02, 0x03, 0x04, 0x05, 0x06, 0x07, 0x08, 0x09, 0x0A, 0x0B, 0x0C, 0x0D, 0x0E, 0x0F};
        byte[] expected = new byte[]{0x00, 0x01, 0x02, 0x03, 0x04, 0x05, 0x06, 0x07, 0x08, 0x09, 0x0A, 0x0B, 0x0C, 0x0D, 0x0E, 0x0F};
        byte[] actual;
        try {
            actual = percentCodec.encode(bytes);
        } catch (EncoderException e) {
            e.printStackTrace();
            actual = null;
        }
        assertArrayEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDecodeWithNullInput_goLO0_zEEb0() {
        PercentCodec percentCodec = new PercentCodec();
        byte[] input = null;
        byte[] expectedOutput = null;
        try {
            byte[] actualOutput = percentCodec.decode(input);
            assertEquals(expectedOutput, actualOutput);
        } catch (DecoderException e) {
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDecodeWithEmptyInput_jFby1_aGDy0() {
        PercentCodec percentCodec = new PercentCodec();
        byte[] input = new byte[0];
        byte[] expectedOutput = new byte[0];
        try {
            byte[] actualOutput = percentCodec.decode(input);
            assertArrayEquals(expectedOutput, actualOutput);
        } catch (DecoderException e) {
            e.printStackTrace();
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDecodeWithValidInput_sbXR2_KBdv0() {
        PercentCodec percentCodec = new PercentCodec();
        byte[] input = new byte[]{65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90};
        byte[] expectedOutput = new byte[]{65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90};
        try {
            byte[] actualOutput = percentCodec.decode(input);
            assertArrayEquals(expectedOutput, actualOutput);
        } catch (DecoderException e) {
            fail("Unexpected exception thrown: " + e.getMessage());
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDecodeWithInvalidInput_mbHn3_JXfW0() {
        PercentCodec percentCodec = new PercentCodec();
        byte[] input = new byte[]{65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 91};
        byte[] expectedOutput = new byte[]{65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 91};
        byte[] actualOutput = null;
        try {
            actualOutput = percentCodec.decode(input);
        } catch (DecoderException e) {
            e.printStackTrace();
        }
        assertArrayEquals(expectedOutput, actualOutput);
    }
}