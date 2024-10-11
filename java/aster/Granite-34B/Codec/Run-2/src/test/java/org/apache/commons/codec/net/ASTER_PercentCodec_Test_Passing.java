/**
 * Generated by Aster
 */
package org.apache.commons.codec.net;

import java.util.concurrent.TimeUnit;
import org.apache.commons.codec.DecoderException;
import org.apache.commons.codec.EncoderException;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_PercentCodec_Test_Passing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDecode1_SjQI1() throws DecoderException {
        PercentCodec percentCodec = new PercentCodec();
        byte[] bytes = new byte[0];
        Object result = percentCodec.decode(bytes);
        assertNull(null);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDecode2_ygSe2() throws DecoderException {
        PercentCodec percentCodec = new PercentCodec();
        Object obj = new Object();
        try {
            percentCodec.decode(obj);
        } catch (DecoderException e) {
            assertEquals("Objects of type " + obj.getClass().getName() + " cannot be Percent decoded", e.getMessage());
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeWithNoEncoding_VtNL0_2() throws EncoderException {
        final byte[] bytes = new byte[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        PercentCodec percentCodec = new PercentCodec();
        byte[] result = percentCodec.encode(bytes);
        assertEquals(result.length, bytes.length);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeWithEncoding_gnhj1_2() throws EncoderException {
        final byte[] bytes = new byte[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 32};
        PercentCodec percentCodec = new PercentCodec();
        byte[] result = percentCodec.encode(bytes);
        assertFalse(result.length > bytes.length);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeWithPlusForSpace_rLQf2_1() throws EncoderException {
        final byte[] bytes = new byte[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 32};
        PercentCodec percentCodec = new PercentCodec(null, true);
        byte[] result = percentCodec.encode(bytes);
        assertNotEquals(result, bytes);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeWithPlusForSpace_rLQf2_2() throws EncoderException {
        final byte[] bytes = new byte[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 32};
        PercentCodec percentCodec = new PercentCodec(null, true);
        byte[] result = percentCodec.encode(bytes);
        assertFalse(result.length > bytes.length);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeWithAlwaysEncodeChars_nIFf3_1() throws EncoderException {
        final byte[] bytes = new byte[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 32};
        PercentCodec percentCodec = new PercentCodec(new byte[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 32}, false);
        byte[] result = percentCodec.encode(bytes);
        assertNotEquals(result, bytes);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeWithAlwaysEncodeChars_nIFf3_2() throws EncoderException {
        final byte[] bytes = new byte[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 32};
        PercentCodec percentCodec = new PercentCodec(new byte[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 32}, false);
        byte[] result = percentCodec.encode(bytes);
        assertTrue(result.length > bytes.length);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeWithNullInput_jmnG4() throws EncoderException {
        PercentCodec percentCodec = new PercentCodec();
        byte[] result = percentCodec.encode(null);
        assertEquals(result, null);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeWithNullInput_HiBY4_Bwxy0() {
        PercentCodec codec = new PercentCodec();
        byte[] input = null;
        byte[] expected = null;
        try {
            assertArrayEquals(expected, codec.encode(input));
        } catch (EncoderException e) {
            fail("Exception not expected");
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeWithPlusForSpace_yijO1_hVbU0() {
        PercentCodec codec = new PercentCodec(null, true);
        byte[] input = "This is a test".getBytes();
        byte[] expected = "This+is+a+test".getBytes();
        try {
            assertArrayEquals(expected, codec.encode(input));
        } catch (EncoderException e) {
            fail("Unexpected exception: " + e.getMessage());
        }
    }

    @Test
    public void testEncodeWithPlusForSpace_dpVy1_hfkD0_1() {
        PercentCodec percentCodec = new PercentCodec(new byte[0], true);
        byte[] bytes = "hello world".getBytes();
        byte[] expected = "hello+world".getBytes();
        assertDoesNotThrow(() -> {
            try {
                assertArrayEquals(expected, percentCodec.encode(bytes));
            } catch (EncoderException e) {
                fail("Unexpected exception: " + e.getMessage());
            }
        });
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeWithNoEncoding_Pgvb0_lDNK0() {
        PercentCodec codec = new PercentCodec();
        byte[] input = "This is a test".getBytes();
        byte[] expected = input;
        try {
            assertArrayEquals(expected, codec.encode(input));
        } catch (EncoderException e) {
            fail("Unexpected exception: " + e.getMessage());
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeWithEmptyInput_MefW5_TFmz0_1() {
        PercentCodec percentCodec = new PercentCodec();
        byte[] bytes = new byte[0];
        byte[] expected = new byte[0];
        assertDoesNotThrow(() -> assertArrayEquals(expected, percentCodec.encode(bytes)));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeWithNoEncoding_ShRu0_XGKB0() {
        PercentCodec percentCodec = new PercentCodec();
        byte[] input = "This is a test".getBytes();
        byte[] expected = "This is a test".getBytes();
        try {
            assertArrayEquals(expected, percentCodec.encode(input));
        } catch (EncoderException e) {
            fail("Exception not expected");
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeWithNoEncoding_ejhd0_vFGU0_1() {
        PercentCodec percentCodec = new PercentCodec();
        byte[] bytes = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        byte[] expected = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        assertDoesNotThrow(() -> assertArrayEquals(expected, percentCodec.encode(bytes)));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeWithNullInput_xbIw4_KUFZ0() {
        PercentCodec percentCodec = new PercentCodec();
        byte[] input = null;
        byte[] expected = null;
        try {
            assertArrayEquals(expected, percentCodec.encode(input));
        } catch (EncoderException e) {
            e.printStackTrace();
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeWithPlusForSpace_Nikm2_Yngp0() {
        PercentCodec percentCodec = new PercentCodec(null, true);
        byte[] input = "This is a test".getBytes();
        byte[] expected = "This+is+a+test".getBytes();
        try {
            assertArrayEquals(expected, percentCodec.encode(input));
        } catch (EncoderException e) {
            fail("Unexpected exception: " + e.getMessage());
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDecodeWithOneEscapeChar_UdQi1_FANd0() {
        PercentCodec percentCodec = new PercentCodec();
        byte[] bytes = new byte[]{'a', '%', '2', '0', 'b'};
        byte[] expected = new byte[]{'a', ' ', 'b'};
        try {
            assertArrayEquals(expected, percentCodec.decode(bytes));
        } catch (DecoderException e) {
            fail("An unexpected exception was thrown");
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDecodeWithPlusForSpace_VPBR3_PNrO0() {
        PercentCodec percentCodec = new PercentCodec(null, true);
        byte[] bytes = new byte[]{'a', '+', 'b'};
        byte[] expected = new byte[]{'a', ' ', 'b'};
        try {
            assertArrayEquals(expected, percentCodec.decode(bytes));
        } catch (DecoderException e) {
            fail("DecoderException should not be thrown");
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDecodeWithTwoEscapeChars_ysFx2_UTtD0() {
        PercentCodec percentCodec = new PercentCodec();
        byte[] bytes = new byte[]{'a', '%', '2', '0', '%', '2', '0', 'b'};
        byte[] expected = new byte[]{'a', ' ', ' ', 'b'};
        try {
            assertArrayEquals(expected, percentCodec.decode(bytes));
        } catch (DecoderException e) {
            fail("Exception not expected");
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeWithNeedToEncode_GXBl2_GlOq0() {
        PercentCodec codec = new PercentCodec();
        byte[] bytes = new byte[]{0, 1, 2, 3, 4, 5, 32, 33};
        byte[] expected = new byte[]{0, 1, 2, 3, 4, 5, 32, 33};
        byte[] result = null;
        try {
            result = codec.encode(bytes);
        } catch (EncoderException e) {
            e.printStackTrace();
        }
        assertArrayEquals(expected, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeWithAlwaysEncodeChars_nIFf3() throws EncoderException {
        final byte[] bytes = new byte[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 32};
        PercentCodec percentCodec = new PercentCodec(new byte[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 32}, false);
        byte[] result = percentCodec.encode(bytes);
        assertNotEquals(result, bytes);
        assertTrue(result.length > bytes.length);
    }
}