/**
 * Generated by Aster
 */
package org.apache.commons.codec.net;

import java.nio.charset.Charset;
import java.util.concurrent.TimeUnit;
import org.apache.commons.codec.CodecPolicy;
import org.apache.commons.codec.DecoderException;
import org.apache.commons.codec.EncoderException;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_BCodec_Coverage_Test_Failing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncode_ThrowsEncoderException_aRAF1() throws org.apache.commons.codec.EncoderException {
        try {
            BCodec bCodec = new BCodec("UTF-8");
            bCodec.encode("Hello", "InvalidCharset");
            assert false; // should not reach here
        } catch (EncoderException e) {
            assertEquals("java.nio.charset.UnsupportedCharsetException: InvalidCharset", e.getMessage());
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDecodeString_FBHM1() throws DecoderException {
        BCodec bCodec = new BCodec();
        String value = "testString";
        Object result = bCodec.decode(value);
        assert result.equals(value);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDecodeStringWithCharset_QkpK3() throws DecoderException {
        BCodec bCodec = new BCodec("UTF-8");
        String value = "testString";
        Object result = bCodec.decode(value);
        assert result.equals(value);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDecodeStringWithCharsetAndPolicy_nOLE4() throws DecoderException {
        BCodec bCodec = new BCodec(Charset.forName("UTF-8"), CodecPolicy.STRICT);
        String value = "testString";
        Object result = bCodec.decode(value);
        assert result.equals(value);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeString_UeRm1() throws EncoderException {
        BCodec bCodec = new BCodec();
        String value = "Hello World";
        Object result = bCodec.encode(value);
        assert result.equals(value);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeStringWithCharset_gSLm3() throws EncoderException {
        BCodec bCodec = new BCodec("UTF-8");
        String value = "Hello World";
        Object result = bCodec.encode(value);
        assert result.equals(value);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeStringWithCharsetAndPolicy_FYzz4() throws EncoderException {
        BCodec bCodec = new BCodec(Charset.forName("UTF-8"), CodecPolicy.STRICT);
        String value = "Hello World";
        Object result = bCodec.encode(value);
        assert result.equals(value);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDoDecodingValidInput_JnJz1_uNJW0() {
        Charset charset = Charset.forName("UTF-8");
        BCodec bCodec = new BCodec(charset, CodecPolicy.STRICT);
        byte[] input = "Hello, World!".getBytes();
        byte[] result = bCodec.doDecoding(input);
        assertNotNull(result);
    }
}