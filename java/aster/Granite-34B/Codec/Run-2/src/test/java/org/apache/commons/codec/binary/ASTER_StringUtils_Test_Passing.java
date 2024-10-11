/**
 * Generated by Aster
 */
package org.apache.commons.codec.binary;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_StringUtils_Test_Passing {
    private static String newString(final byte[] bytes, final Charset charset) {
        return bytes == null ? null : new String(bytes, charset);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testNewStringUtf8_mlzP0() {
        byte[] bytes = new byte[]{0, 1, 2, 3};
        String expected = new String(bytes, StandardCharsets.UTF_8);
        String actual = StringUtils.newStringUtf8(bytes);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testNewStringUtf8Null_SxLF1() {
        byte[] bytes = null;
        String expected = null;
        String actual = StringUtils.newStringUtf8(bytes);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testNewStringUtf16_hMSq0() {
        byte[] bytes = new byte[0];
        String expected = newString(bytes, StandardCharsets.UTF_16);
        String actual = StringUtils.newStringUtf16(bytes);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetByteBufferUtf8_JamF0() {
        String input = "Hello, World!";
        ByteBuffer expected = ByteBuffer.wrap(input.getBytes(StandardCharsets.UTF_8));
        ByteBuffer actual = StringUtils.getByteBufferUtf8(input);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testgetBytesIso8859_1_HiZE0() {
        String input = "Hello, World!";
        byte[] expected = {72, 101, 108, 108, 111, 44, 32, 87, 111, 114, 108, 100, 33};
        byte[] actual = StringUtils.getBytesIso8859_1(input);
        assertArrayEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testgetBytesIso8859_1WithNullInput_NzdJ1() {
        String input = null;
        byte[] expected = null;
        byte[] actual = StringUtils.getBytesIso8859_1(input);
        assertArrayEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetBytesUtf16WithNullInput_zDfC1() {
        String input = null;
        byte[] expected = null;
        byte[] actual = StringUtils.getBytesUtf16(input);
        assertArrayEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testgetBytesUtf16Le_null_aefN0() {
        byte[] expected = null;
        byte[] actual = StringUtils.getBytesUtf16Le(null);
        assertArrayEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testgetBytesUtf16Le_empty_dDRh1() {
        byte[] expected = new byte[0];
        byte[] actual = StringUtils.getBytesUtf16Le("");
        assertArrayEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testgetBytesUtf16Le_hello_zVDV2() {
        byte[] expected = new byte[]{0x68, 0x00, 0x65, 0x00, 0x6C, 0x00, 0x6C, 0x00, 0x6F, 0x00};
        byte[] actual = StringUtils.getBytesUtf16Le("hello");
        assertArrayEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testNewStringIso8859_1_mzHV0() {
        byte[] bytes = new byte[0];
        String expected = newString(bytes, StandardCharsets.ISO_8859_1);
        String actual = StringUtils.newStringIso8859_1(bytes);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testNewStringUtf16Be_vumH0() {
        byte[] bytes = new byte[0];
        String expected = newString(bytes, StandardCharsets.UTF_16BE);
        String actual = StringUtils.newStringUtf16Be(bytes);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void getBytesUsAscii_nullInput_returnsNull_sWlm0() {
        byte[] result = StringUtils.getBytesUsAscii(null);
        assertNull(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void getBytesUsAscii_emptyInput_returnsEmptyArray_bKty1_1() {
        byte[] result = StringUtils.getBytesUsAscii("");
        assertNotNull(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void getBytesUsAscii_emptyInput_returnsEmptyArray_bKty1_2() {
        byte[] result = StringUtils.getBytesUsAscii("");
        assertEquals(0, result.length);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void getBytesUsAscii_nonEmptyInput_returnsCorrectByteArray_TFIk2() {
        String input = "Hello, World!";
        byte[] expected = input.getBytes(StandardCharsets.US_ASCII);
        byte[] result = StringUtils.getBytesUsAscii(input);
        assertArrayEquals(expected, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetBytesUtf8_BcTw0() {
        String input = "Hello, World!";
        byte[] expected = {72, 101, 108, 108, 111, 44, 32, 87, 111, 114, 108, 100, 33};
        byte[] actual = StringUtils.getBytesUtf8(input);
        assertArrayEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetBytesUtf8NullInput_CtCP1() {
        String input = null;
        byte[] expected = null;
        byte[] actual = StringUtils.getBytesUtf8(input);
        assertArrayEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testNewStringUsAscii_DWWc0() {
        byte[] bytes = new byte[]{65, 66, 67};
        String expected = new String(bytes, StandardCharsets.US_ASCII);
        String actual = StringUtils.newStringUsAscii(bytes);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testNewStringUsAsciiNull_oiDA1() {
        byte[] bytes = null;
        String expected = null;
        String actual = StringUtils.newStringUsAscii(bytes);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testNewStringUsAsciiEmpty_fgvN2() {
        byte[] bytes = new byte[0];
        String expected = new String(bytes, StandardCharsets.US_ASCII);
        String actual = StringUtils.newStringUsAscii(bytes);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testgetBytesUnchecked_nullString_DMzS0() {
        final String string = null;
        final String charsetName = "UTF-8";
        final byte[] expected = null;
        final byte[] actual = StringUtils.getBytesUnchecked(string, charsetName);
        assertArrayEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testgetBytesUnchecked_validString_nFGy1() {
        final String string = "Hello, World!";
        final String charsetName = "UTF-8";
        final byte[] expected = {72, 101, 108, 108, 111, 44, 32, 87, 111, 114, 108, 100, 33};
        final byte[] actual = StringUtils.getBytesUnchecked(string, charsetName);
        assertArrayEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testgetBytesUnchecked_unsupportedEncoding_eMgH2() {
        final String string = "Hello, World!";
        final String charsetName = "InvalidEncoding";
        try {
            StringUtils.getBytesUnchecked(string, charsetName);
            fail("Expected IllegalStateException");
        } catch (final IllegalStateException e) {
        }
    }

    @Test
    public void testNewStringWithInvalidInput_FESK1_aXhy1() {
        Assertions.assertThrows(
        IllegalStateException.class,
        () -> StringUtils.newString(new byte[]{0, 1, 2}, "invalid-charset"));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testNewStringUtf16Le_uFyq0_fid1() {
        byte[] bytes = new byte[]{0x48, 0x65, 0x6C, 0x6C, 0x6F};
        String expected = "效汬�";
        String actual = StringUtils.newStringUtf16Le(bytes);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testNewStringWithValidInput_jyrC0_fid1() {
        String result = StringUtils.newString(new byte[]{0, 1, 2}, "UTF-8");
        assertEquals("{ }", "{\u0000\u0001\u0002}", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void getBytesUsAscii_emptyInput_returnsEmptyArray_bKty1() {
        byte[] result = StringUtils.getBytesUsAscii("");
        assertNotNull(result);
        assertEquals(0, result.length);
    }
}