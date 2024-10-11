/**
 * Generated by Aster
 */
package org.apache.commons.codec.net;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.concurrent.TimeUnit;
import org.apache.commons.codec.DecoderException;
import org.apache.commons.codec.EncoderException;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

public class Aster_QuotedPrintableCodec_Coverage_Test_Passing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeByteArray_egoh1() throws EncoderException {
        QuotedPrintableCodec codec = new QuotedPrintableCodec();
        byte[] input = "Hello, World!".getBytes(StandardCharsets.UTF_8);
        byte[] expectedOutput = "Hello, World!".getBytes(StandardCharsets.UTF_8);
        assertTrue(Arrays.equals(expectedOutput, (byte[]) codec.encode(input)));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeString_jhTQ2() throws EncoderException {
        QuotedPrintableCodec codec = new QuotedPrintableCodec();
        String input = "Hello, World!";
        String expectedOutput = "Hello, World!";
        assertEquals(expectedOutput, (String) codec.encode(input));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeUnsupportedType_gRKY3() throws org.apache.commons.codec.EncoderException {
        QuotedPrintableCodec codec = new QuotedPrintableCodec();
        Integer input = 123;
        try {
            codec.encode(input);
            assertTrue(false);
        } catch (EncoderException e) {
            assertTrue(true);
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeWithCharset_MBxN4() throws EncoderException {
        QuotedPrintableCodec codec = new QuotedPrintableCodec(StandardCharsets.UTF_8);
        String input = "Hello, World!";
        String expectedOutput = "Hello, World!";
        assertEquals(expectedOutput, (String) codec.encode(input));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeWithStrictMode_vKbD5() throws EncoderException {
        QuotedPrintableCodec codec = new QuotedPrintableCodec(true);
        String input = "Hello, World!";
        String expectedOutput = "Hello, World!";
        assertEquals(expectedOutput, (String) codec.encode(input));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDecodeNull_TGEm0() throws DecoderException {
        QuotedPrintableCodec codec = new QuotedPrintableCodec();
        Object obj = null;
        Object result = codec.decode(obj);
        assertNull(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDecodeByteArray_htwh1() throws DecoderException {
        QuotedPrintableCodec codec = new QuotedPrintableCodec();
        byte[] bytes = new byte[]{1, 2, 3, 4, 5};
        Object result = codec.decode(bytes);
        assertArrayEquals(bytes, (byte[]) result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDecodeString_vWVI2() throws DecoderException {
        QuotedPrintableCodec codec = new QuotedPrintableCodec();
        String str = "hello world";
        Object result = codec.decode(str);
        assertEquals(str, (String) result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDecodeInvalidType_Izzg3() throws org.apache.commons.codec.DecoderException {
        QuotedPrintableCodec codec = new QuotedPrintableCodec();
        Object obj = new Object();
        try {
            codec.decode(obj);
            fail("Expected DecoderException");
        } catch (DecoderException e) {
            assertEquals("Objects of type java.lang.Object cannot be quoted-printable decoded", e.getMessage());
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDecodeNullStrict_zlRH4() throws DecoderException {
        QuotedPrintableCodec codec = new QuotedPrintableCodec(true);
        Object obj = null;
        Object result = codec.decode(obj);
        assertNull(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDecodeByteArrayStrict_sayJ5() throws DecoderException {
        QuotedPrintableCodec codec = new QuotedPrintableCodec(true);
        byte[] bytes = new byte[]{1, 2, 3, 4, 5};
        Object result = codec.decode(bytes);
        assertArrayEquals(bytes, (byte[]) result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDecodeStringStrict_ikuT6() throws DecoderException {
        QuotedPrintableCodec codec = new QuotedPrintableCodec(true);
        String str = "hello world";
        Object result = codec.decode(str);
        assertEquals(str, (String) result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDecodeInvalidTypeStrict_TKoc7() throws org.apache.commons.codec.DecoderException {
        QuotedPrintableCodec codec = new QuotedPrintableCodec(true);
        Object obj = new Object();
        try {
            codec.decode(obj);
            fail("Expected DecoderException");
        } catch (DecoderException e) {
            assertEquals("Objects of type java.lang.Object cannot be quoted-printable decoded", e.getMessage());
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeQuotedPrintable_oDgG0_pcBA0() {
        QuotedPrintableCodec codec = new QuotedPrintableCodec(true);
        byte[] bytes = "Hello World!".getBytes();
        byte[] encoded = codec.encode(bytes);
        Assertions.assertEquals("Hello World!", new String(encoded));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeQuotedPrintableWithNonStrictMode_LDSq5_RSgR0() {
        QuotedPrintableCodec codec = new QuotedPrintableCodec(false);
        byte[] bytes = "Hello World!".getBytes();
        byte[] encoded = codec.encode(bytes);
        Assertions.assertEquals("Hello World!", new String(encoded));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeQuotedPrintableWithNonPrintableCharacters_NvIc2_iVwI0() {
        QuotedPrintableCodec codec = new QuotedPrintableCodec(true);
        byte[] bytes = "Hello\u0000World!".getBytes();
        byte[] encoded = codec.encode(bytes);
        Assertions.assertEquals("Hello=00World!", new String(encoded));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeQuotedPrintableWithNullBytes_AmPM6_KVrh0() {
        QuotedPrintableCodec codec = new QuotedPrintableCodec(true);
        byte[] bytes = null;
        byte[] encoded = codec.encode(bytes);
        Assertions.assertEquals(null, encoded);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDecodeNullSourceStr_zdcj0_qMmM0() throws UnsupportedEncodingException, DecoderException {
        QuotedPrintableCodec codec = new QuotedPrintableCodec();
        try {
            assertNull(codec.decode(null, "UTF-8"));
        } catch (DecoderException e) {
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDecodeEmptySourceStr_qsZf1_UcWB0() throws UnsupportedEncodingException {
        QuotedPrintableCodec codec = new QuotedPrintableCodec();
        try {
            assertEquals("", codec.decode("", "UTF-8"));
        } catch (DecoderException e) {
            e.printStackTrace();
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDecodeValidCharset_FtLL3_ilcq0() throws UnsupportedEncodingException, DecoderException {
        QuotedPrintableCodec codec = new QuotedPrintableCodec();
        assertEquals("test", codec.decode("test", "UTF-8"));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDecodeWithNonStrictMode_rqOw5_IGBL0() throws UnsupportedEncodingException, DecoderException {
        QuotedPrintableCodec codec = new QuotedPrintableCodec(false);
        assertEquals("test", codec.decode("test", "UTF-8"));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDecodeWithStrictMode_aOxG4_lLWL0() throws UnsupportedEncodingException, DecoderException {
        QuotedPrintableCodec codec = new QuotedPrintableCodec(true);
        assertEquals("test", codec.decode("test", "UTF-8"));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDecodeWithCharset_JDFB6_lqLO0() throws UnsupportedEncodingException, DecoderException {
        QuotedPrintableCodec codec = new QuotedPrintableCodec(Charset.forName("UTF-8"));
        assertEquals("test", codec.decode("test", "UTF-8"));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDecodeWithCharsetName_dnQo7_tBto0() throws UnsupportedEncodingException, DecoderException {
        QuotedPrintableCodec codec = new QuotedPrintableCodec("UTF-8");
        assertEquals("test", codec.decode("test", "UTF-8"));
    }
}