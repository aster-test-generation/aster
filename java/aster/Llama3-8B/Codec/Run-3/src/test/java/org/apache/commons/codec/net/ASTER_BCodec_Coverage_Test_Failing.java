/**
 * Generated by Aster
 */
package org.apache.commons.codec.net;

import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.util.concurrent.TimeUnit;
import org.apache.commons.codec.CodecPolicy;
import org.apache.commons.codec.DecoderException;
import org.apache.commons.codec.EncoderException;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_BCodec_Coverage_Test_Failing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testValidInput_SAtm2() {
        BCodec codec = new BCodec(Charset.forName("UTF-8"), CodecPolicy.STRICT);
        byte[] bytes = "Hello, World!".getBytes();
        byte[] result = codec.doDecoding(bytes);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDecodeString_nxeu2() throws DecoderException {
        BCodec codec = new BCodec(Charset.forName("UTF-8"));
        String value = "Hello, World!";
        Object result = codec.decode(value);
        assertNotNull(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeWithUnsupportedCharset_crCV0() throws EncoderException {
        BCodec codec = new BCodec(Charset.forName("UTF-8"), CodecPolicy.STRICT);
        String strSource = "Hello, World!";
        String sourceCharset = "UnsupportedCharset";
        try {
            String result = codec.encode(strSource, sourceCharset);
            fail("Expected UnsupportedCharsetException");
        } catch (EncoderException e) {
            assertEquals("Unsupported charset: UnsupportedCharset", e.getMessage());
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeWithEncoderException_OvDl1() throws EncoderException {
        BCodec codec = new BCodec(Charset.forName("UTF-8"), CodecPolicy.STRICT);
        String strSource = "Hello, World!";
        String sourceCharset = "UTF-8";
        EncoderException e = new EncoderException("Test EncoderException");
        try {
            String result = codec.encode(strSource, sourceCharset);
            fail("Expected EncoderException");
        } catch (EncoderException ex) {
            assertEquals("Test EncoderException", ex.getMessage());
            assertEquals(e, ex.getCause());
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDecodeWithUnsupportedEncodingException_xWxO0_mYIE0() throws DecoderException {
        BCodec codec = new BCodec(Charset.forName("UTF-8"), CodecPolicy.STRICT);
        String value = "test";
        try {
            byte[] bytes = value.getBytes();
            String result = codec.encode(new String(bytes), "ISO-8859-1");
            fail("DecoderException expected");
        } catch (EncoderException e) {
            assertEquals("Unsupported encoding: ISO-8859-1", e.getMessage());
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDecodeWithIllegalArgumentException_WCZc1_CqTE0() throws DecoderException {
        BCodec codec = new BCodec(Charset.forName("UTF-8"), CodecPolicy.STRICT);
        String value = "test";
        try {
            byte[] bytes = value.getBytes("ISO-8859-1");
            String result = codec.decode(new String(bytes, "ISO-8859-1"));
            fail("DecoderException expected");
        } catch (DecoderException | UnsupportedEncodingException e) {
            assertEquals("Invalid input: ISO-8859-1", e.getMessage());
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDecodeWithUnsupportedEncodingException_xWxO0_mYIE0_fid2() throws DecoderException {
        BCodec codec = new BCodec(Charset.forName("UTF-8"), CodecPolicy.STRICT);
        String value = "test";
        try {
            byte[] bytes = value.getBytes();
            codec.encode(new String(bytes), "ISO-8859-1");
            fail("DecoderException not thrown");
        } catch (EncoderException e) {
            assertEquals("Unsupported encoding: ISO-8859-1", e.getMessage());
        }
    }
}