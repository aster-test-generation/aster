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

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_BCodec_Coverage_Test_Passing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDoDecodingNullInput_ocXD0() {
        BCodec bCodec = new BCodec("UTF-8");
        byte[] result = bCodec.doDecoding(null);
        assertNull(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDecodeNull_Fqez0() throws DecoderException {
        BCodec bCodec = new BCodec();
        Object result = bCodec.decode(null);
        assert result == null;
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeNull_upsn0() throws EncoderException {
        BCodec bCodec = new BCodec();
        Object result = bCodec.encode(null);
        assert result == null;
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeNonStringObject_YMbW2_dIIa0() throws EncoderException {
        BCodec bCodec = new BCodec();
        Object value = new Object();
        try {
            bCodec.encode("strSource", "sourceCharset");
            assert false; // Should not reach this point
        } catch (EncoderException e) {
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncode_ThrowsEncoderException_aRAF1_fid2() throws org.apache.commons.codec.EncoderException {
        try {
            BCodec bCodec = new BCodec("UTF-8");
            bCodec.encode("Hello", "InvalidCharset");
            assert false; // should not reach here
        } catch (EncoderException e) {
            assertEquals("InvalidCharset", e.getMessage());
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDoDecodingValidInput_JnJz1_uNJW0_fid2() {
        Charset charset = Charset.forName("UTF-8");
        BCodec bCodec = new BCodec(charset, CodecPolicy.LENIENT);
        byte[] input = "SGVsbG8sIFdvcmxkIQ==".getBytes(); // "Hello, World!" in base64
        byte[] result = bCodec.doDecoding(input);
        assertNotNull(result);
    }
}