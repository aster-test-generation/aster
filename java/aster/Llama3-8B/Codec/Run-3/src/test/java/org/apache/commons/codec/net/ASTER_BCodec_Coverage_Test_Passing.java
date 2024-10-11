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

public class Aster_BCodec_Coverage_Test_Passing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testNullInput_SxNV0() {
        BCodec codec = new BCodec(Charset.forName("UTF-8"), CodecPolicy.STRICT);
        byte[] result = codec.doDecoding(null);
        assertNull(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEmptyInput_ERyV1() {
        BCodec codec = new BCodec(Charset.forName("UTF-8"), CodecPolicy.STRICT);
        byte[] bytes = new byte[0];
        byte[] result = codec.doDecoding(bytes);
        assertArrayEquals(new byte[0], result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDecodeNull_ltKx0() throws DecoderException {
        BCodec codec = new BCodec(Charset.forName("UTF-8"));
        Object result = codec.decode(null);
        assertNull(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDecodeNonString_FKWT1() throws DecoderException {
        BCodec codec = new BCodec(Charset.forName("UTF-8"));
        Object value = new Object();
        try {
            codec.decode(value);
            fail("DecoderException expected");
        } catch (DecoderException e) {
            assertEquals("Objects of type " + Object.class.getName() + " cannot be decoded using BCodec", e.getMessage());
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDecodeNonStringWithCharset_tlrL3() throws DecoderException {
        BCodec codec = new BCodec(Charset.forName("UTF-8"), CodecPolicy.STRICT);
        Object value = new Object();
        try {
            codec.decode(value);
            fail("DecoderException expected");
        } catch (DecoderException e) {
            assertEquals("Objects of type " + Object.class.getName() + " cannot be decoded using BCodec", e.getMessage());
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testNullValue_jiTE0() throws org.apache.commons.codec.EncoderException {
        BCodec codec = new BCodec(Charset.forName("UTF-8"), CodecPolicy.STRICT);
        Object result = codec.encode(null);
        assertNull(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testNonStringValue_qBCM1() throws org.apache.commons.codec.EncoderException {
        BCodec codec = new BCodec(Charset.forName("UTF-8"), CodecPolicy.STRICT);
        Object value = new Integer(1);
        try {
            codec.encode(value);
            fail("Expected EncoderException");
        } catch (EncoderException e) {
            assertEquals("Objects of type " + value.getClass().getName() + " cannot be encoded using BCodec", e.getMessage());
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testStringValue_xaKS2() throws org.apache.commons.codec.EncoderException {
        BCodec codec = new BCodec(Charset.forName("UTF-8"), CodecPolicy.STRICT);
        String value = "Hello, World!";
        Object result = codec.encode(value);
        assertNotNull(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testStringValueWithLenientPolicy_cxWH3() throws org.apache.commons.codec.EncoderException {
        BCodec codec = new BCodec(Charset.forName("UTF-8"), CodecPolicy.LENIENT);
        String value = "Hello, World!";
        Object result = codec.encode(value);
        assertNotNull(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeWithUnsupportedCharset_crCV0_fid2() throws EncoderException {
        BCodec codec = new BCodec(Charset.forName("UTF-8"), CodecPolicy.STRICT);
        String strSource = "Hello, World!";
        String sourceCharset = "UnsupportedCharset";
        try {
            String result = codec.encode(strSource, sourceCharset);
            fail("Expected UnsupportedCharsetException");
        } catch (EncoderException e) {
            assertEquals("UnsupportedCharset", e.getMessage());
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDecodeWithIllegalArgumentException_WCZc1_CqTE0_fid2() throws DecoderException {
        BCodec codec = new BCodec(Charset.forName("UTF-8"), CodecPolicy.STRICT);
        String value = "test";
        try {
            byte[] bytes = value.getBytes("ISO-8859-1");
            String result = codec.decode(new String(bytes, "ISO-8859-1"));
            fail("DecoderException expected");
        } catch (DecoderException | UnsupportedEncodingException e) {
        }
    }
}