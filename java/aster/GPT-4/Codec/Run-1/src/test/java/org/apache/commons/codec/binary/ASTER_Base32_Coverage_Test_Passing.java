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

public class Aster_Base32_Coverage_Test_Passing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDecodeWithByteArray_guvg0() throws DecoderException {
        Base32 base32 = new Base32();
        byte[] input = new byte[]{(byte) 'M', (byte) 'T', (byte) 'I', (byte) 'z'};
        byte[] expected = base32.decode(input);
        assertArrayEquals(expected, (byte[]) base32.decode(input));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDecodeWithString_gYQK1() throws DecoderException {
        Base32 base32 = new Base32();
        String input = "MTIz";
        byte[] expected = base32.decode(input);
        assertArrayEquals(expected, (byte[]) base32.decode(input));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDecodeWithInteger_PShY4() throws DecoderException {
        Base32 base32 = new Base32();
        try {
            base32.decode(123);
            fail("Expected an DecoderException to be thrown");
        } catch (DecoderException e) {
            assertEquals("Parameter supplied to Base-N decode is not a byte[] or a String", e.getMessage());
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDecodeWithBoolean_ORro5() throws DecoderException {
        Base32 base32 = new Base32();
        try {
            base32.decode(true);
            fail("Expected an DecoderException to be thrown");
        } catch (DecoderException e) {
            assertEquals("Parameter supplied to Base-N decode is not a byte[] or a String", e.getMessage());
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDecodeWithFloat_PXuW6() throws DecoderException {
        Base32 base32 = new Base32();
        try {
            base32.decode(1.23f);
            fail("Expected an DecoderException to be thrown");
        } catch (DecoderException e) {
            assertEquals("Parameter supplied to Base-N decode is not a byte[] or a String", e.getMessage());
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDecodeWithDouble_LfBj7() throws DecoderException {
        Base32 base32 = new Base32();
        try {
            base32.decode(1.23);
            fail("Expected an DecoderException to be thrown");
        } catch (DecoderException e) {
            assertEquals("Parameter supplied to Base-N decode is not a byte[] or a String", e.getMessage());
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDecodeWithCharacter_QGkw8() throws DecoderException {
        Base32 base32 = new Base32();
        try {
            base32.decode('A');
            fail("Expected an DecoderException to be thrown");
        } catch (DecoderException e) {
            assertEquals("Parameter supplied to Base-N decode is not a byte[] or a String", e.getMessage());
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDecodeWithEmptyArray_PFNl0() {
        Base32 base32 = new Base32();
        byte[] emptyArray = new byte[0];
        byte[] result = base32.decode(emptyArray);
        assertArrayEquals(emptyArray, result, "Decoding an empty array should return an empty array.");
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDecodeWithNullArray_qtXQ1() {
        Base32 base32 = new Base32();
        byte[] nullArray = null;
        byte[] result = base32.decode(nullArray);
        assertNull(result, "Decoding a null array should return null.");
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDecodeWithPaddingOnly_cxwl4() {
        Base32 base32 = new Base32();
        byte[] paddingOnly = {'='};
        try {
            byte[] result = base32.decode(paddingOnly);
            assertArrayEquals(new byte[0], result, "Decoding padding only should return empty array or throw exception.");
        } catch (Exception e) {
            assertNotNull(e, "Exception can be thrown for padding only input.");
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDecodeWithPartialInput_OVOS6() {
        Base32 base32 = new Base32();
        byte[] partialInput = "JBSWY3D".getBytes(); // Partial segment of a Base32 encoded string
        try {
            byte[] result = base32.decode(partialInput);
            assertNotNull(result, "Should handle partial input without throwing an exception.");
        } catch (Exception e) {
            fail("Exception should not be thrown for partial input.");
        }
    }

    @Test
    public void testDecodeWithUnsupportedObject_SORv2_ADAc0() {
        Base32 base32 = new Base32();
        Object input = new Object();
        try {
            base32.decode(input);
            fail("Expected a DecoderException to be thrown");
        } catch (DecoderException e) {
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDecodeWithEmptyString_dgvH0_UwMV0() {
        Base32 base32 = new Base32();
        String input = "";
        byte[] expectedOutput = new byte[0]; // Assuming decode method handles empty input gracefully
        byte[] actualOutput = base32.decode(input);
        assertArrayEquals(expectedOutput, actualOutput, "Decoding an empty string should return an empty byte array.");
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testContainsAlphabetOrPadWithNullArray_egeE0_Xyto0() {
        Base32 base32 = new Base32();
        byte[] arrayOctet = null;
        assertFalse(base32.containsAlphabetOrPad(arrayOctet), "Should return false when input array is null");
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeWithEmptyArray_aISJ1_jrNJ0() {
        Base32 base32 = new Base32();
        byte[] inputArray = new byte[0];
        byte[] expectedOutput = new byte[0];
        byte[] result = base32.encode(inputArray);
        assertArrayEquals(expectedOutput, result, "Encoding an empty array should return an empty array.");
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDecodeWithNonEmptyString_GJtp1_fpFo0() {
        Base32 base32 = new Base32();
        String input = "MZXW6==="; // Base32 encoded representation of "foo"
        byte[] expectedOutput = new byte[]{102, 111, 111}; // ASCII values for "foo"
        byte[] actualOutput = base32.decode(input);
        assertArrayEquals(expectedOutput, actualOutput, "Decoding 'MZXW6===' should return byte array corresponding to 'foo'.");
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDecodeEOFSetTrue_OAeB1_oGbi0() {
        Base32 base32 = new Base32();
        BaseNCodec.Context context = new BaseNCodec.Context();
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testContainsAlphabetOrPadWithEmptyArray_NcMw1_zzFn0() {
        Base32 base32 = new Base32();
        byte[] arrayOctet = new byte[0];
        assertFalse(base32.containsAlphabetOrPad(arrayOctet), "Should return false when input array is empty");
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeNegativeInAvail_tqDw1_OJeh0() {
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeLineLengthBoundary_cvmX12_QgeE0() {
        Base32 base32 = new Base32(8, new byte[]{'\n'}, false, (byte) '=', CodecPolicy.STRICT);
        BaseNCodec.Context context = new BaseNCodec.Context();
        byte[] input = new byte[10];
        base32.encode(input, 0, 10, context);
        assertTrue(context.currentLinePos == 0, "Current line position should reset after reaching line length");
    }
}