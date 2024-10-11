/**
 * Generated by Aster
 */
package org.apache.commons.codec.net;

import java.nio.charset.Charset;
import java.util.concurrent.TimeUnit;
import org.apache.commons.codec.CodecPolicy;
import org.apache.commons.codec.DecoderException;
import org.apache.commons.codec.EncoderException;
import org.apache.commons.codec.binary.Base64;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_BCodec_Test_Passing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsStrictDecodingWithStrictPolicy_ZzhU0() {
        BCodec bCodec = new BCodec(Charset.defaultCharset(), CodecPolicy.STRICT);
        assertEquals(true, bCodec.isStrictDecoding());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsStrictDecodingWithLenientPolicy_WuKo1() {
        BCodec bCodec = new BCodec(Charset.defaultCharset(), CodecPolicy.LENIENT);
        assertEquals(false, bCodec.isStrictDecoding());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDoDecoding_bytes_is_null_QEcv0() {
        BCodec bCodec = new BCodec(Charset.defaultCharset(), CodecPolicy.STRICT);
        byte[] actual = bCodec.doDecoding(null);
        assertNull(actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDecodeWithNull_iLtw2() throws DecoderException {
        BCodec bCodec = new BCodec("UTF-8");
        Object value = null;
        String expected = null;
        assertEquals(expected, bCodec.decode(value));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeWithInvalidObject_WKRG2() {
        BCodec bCodec = new BCodec("UTF-8");
        Object input = new Object();
        try {
            bCodec.encode(input);
        } catch (EncoderException e) {
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncode_QQla0() throws EncoderException {
        BCodec bCodec = new BCodec(Charset.defaultCharset(), CodecPolicy.STRICT);
        assertEquals("=?UTF-8?B?c291cmNl?=", bCodec.encode("source", Charset.defaultCharset()));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncode2_SBYr1() throws EncoderException {
        BCodec bCodec = new BCodec(Charset.defaultCharset());
        assertEquals("=?UTF-8?B?c291cmNl?=", bCodec.encode("source", Charset.defaultCharset()));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncode4_mbtP3() throws EncoderException {
        BCodec bCodec = new BCodec();
        assertEquals("=?UTF-8?B?c291cmNl?=", bCodec.encode("source", Charset.defaultCharset()));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDoEncoding_HiXf0() {
        BCodec bCodec = new BCodec(Charset.defaultCharset(), CodecPolicy.STRICT);
        byte[] bytes = new byte[]{0, 1, 2, 3};
        byte[] expected = Base64.encodeBase64(bytes);
        assertArrayEquals(expected, bCodec.doEncoding(bytes));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDoEncoding2_HGkI1() {
        BCodec bCodec = new BCodec(Charset.defaultCharset());
        byte[] bytes = new byte[]{0, 1, 2, 3};
        byte[] expected = Base64.encodeBase64(bytes);
        assertArrayEquals(expected, bCodec.doEncoding(bytes));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDoEncoding3_KRTk2() {
        BCodec bCodec = new BCodec("UTF-8");
        byte[] bytes = new byte[]{0, 1, 2, 3};
        byte[] expected = Base64.encodeBase64(bytes);
        assertArrayEquals(expected, bCodec.doEncoding(bytes));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDoEncoding4_wLGF3() {
        BCodec bCodec = new BCodec();
        byte[] bytes = new byte[]{0, 1, 2, 3};
        byte[] expected = Base64.encodeBase64(bytes);
        assertArrayEquals(expected, bCodec.doEncoding(bytes));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetEncoding_RXsn0() {
        BCodec bCodec = new BCodec(Charset.defaultCharset(), CodecPolicy.STRICT);
        assertEquals("B", bCodec.getEncoding());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetEncodingWithCharset_zsOi1() {
        BCodec bCodec = new BCodec(Charset.defaultCharset());
        assertEquals("B", bCodec.getEncoding());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetEncodingWithCharsetName_cADv2() {
        BCodec bCodec = new BCodec("UTF-8");
        assertEquals("B", bCodec.getEncoding());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetEncodingDefault_XYKb3() {
        BCodec bCodec = new BCodec();
        assertEquals("B", bCodec.getEncoding());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetEncodingWithCharsetAndPolicy_uHUs4() {
        BCodec bCodec = new BCodec(Charset.defaultCharset(), CodecPolicy.LENIENT);
        assertEquals("B", bCodec.getEncoding());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeWithNull_wDtS1_UEQu0() {
        BCodec bCodec = new BCodec("UTF-8");
        Object input = null;
        Object encodedValue = null;
        try {
            encodedValue = bCodec.encode(input);
        } catch (EncoderException e) {
        }
    }
}