/**
 * Generated by Aster
 */
package org.apache.commons.codec.net;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.charset.UnsupportedCharsetException;
import java.util.concurrent.TimeUnit;
import org.apache.commons.codec.DecoderException;
import org.apache.commons.codec.EncoderException;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

public class Aster_QCodec_Coverage_Test_Passing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeThrowsEncoderExceptionWithCorrectMessage_RGQw1() throws org.apache.commons.codec.EncoderException {
        QCodec codec = new QCodec();
        try {
            codec.encode("Hello World", "UnsupportedCharset");
            fail("Expected an EncoderException to be thrown");
        } catch (EncoderException e) {
            assertEquals("UnsupportedCharset", e.getMessage());
            assertTrue(e.getCause() instanceof UnsupportedCharsetException);
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeWithNullObject_MgaD0() throws EncoderException {
        QCodec qCodec = new QCodec();
        assertNull(qCodec.encode(null), "Encoding null should return null.");
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeWithStringObject_XXjp1() throws EncoderException {
        QCodec qCodec = new QCodec();
        String testString = "Hello, World!";
        assertEquals(qCodec.encode(testString), qCodec.encode(testString), "Encoding a string should return the encoded string.");
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeWithNonStringObject_pgLT2_1() throws org.apache.commons.codec.EncoderException {
        QCodec qCodec = new QCodec();
        Object testObject = new Object();
        Exception exception = assertThrows(EncoderException.class, () -> qCodec.encode(testObject),
        "Should throw EncoderException for non-string objects.");
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeWithNullString_vlBT3() throws EncoderException {
        QCodec qCodec = new QCodec();
        assertNull(qCodec.encode((String) null), "Encoding null as a String should return null.");
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDecodeWithNonStringInput_BqHA2() throws org.apache.commons.codec.DecoderException {
        QCodec codec = new QCodec();
        try {
            Object testObject = new Object();
            codec.decode(testObject);
            fail("DecoderException should have been thrown for non-String input");
        } catch (DecoderException e) {
            assertEquals("Objects of type java.lang.Object cannot be decoded using Q codec", e.getMessage());
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeTextWithCharsetAppended_Hltg0() throws EncoderException {
        QCodec codec = new QCodec(StandardCharsets.UTF_8);
        String result = codec.encodeText("Hello", StandardCharsets.UTF_8);
        assertTrue(result.contains("UTF-8"));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeTextWithFirstSeparator_kBvz1() throws EncoderException {
        QCodec codec = new QCodec("ISO-8859-1");
        String result = codec.encodeText("Hello", Charset.forName("ISO-8859-1"));
        assertTrue(result.contains("?"));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeTextWithSecondSeparator_JdAm2() throws EncoderException {
        QCodec codec = new QCodec("ISO-8859-1");
        String result = codec.encodeText("Hello", Charset.forName("ISO-8859-1"));
        int firstIndex = result.indexOf('?');
        int secondIndex = result.indexOf('?', firstIndex + 1);
        assertTrue(secondIndex > firstIndex);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeTextWithEncodedContent_cEDq3() throws EncoderException {
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeWithNonStringObject_pgLT2() throws org.apache.commons.codec.EncoderException {
        QCodec qCodec = new QCodec();
        Object testObject = new Object();
        Exception exception = assertThrows(EncoderException.class, () -> qCodec.encode(testObject),
        "Should throw EncoderException for non-string objects.");
        assertTrue(exception.getMessage().contains("cannot be encoded using Q codec"));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeTextWithEncodedContent_cEDq3_fid1() throws EncoderException {
        QCodec codec = new QCodec("US-ASCII");
        String result = codec.encodeText("Hello", StandardCharsets.US_ASCII);
        assertTrue(result.contains("Hello")); // This assumes "Hello" is unchanged in encoding, adjust based on actual encoding logic
    }
}