/**
 * Generated by Aster
 */
package org.apache.commons.codec.net;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

import java.nio.charset.Charset;
import java.util.concurrent.TimeUnit;
import org.apache.commons.codec.CodecPolicy;
import org.apache.commons.codec.DecoderException;
import org.apache.commons.codec.EncoderException;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

public class Aster_BCodec_Coverage_Test_Passing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeText_WithNullText_JBue0() throws EncoderException {
        BCodec bCodec = new BCodec();
        String result = bCodec.encodeText(null, "UTF-8");
        assert result == null;
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeText_WithNonNullText_hbyn1() throws EncoderException {
        BCodec bCodec = new BCodec();
        String result = bCodec.encodeText("Hello World", "UTF-8");
        assert result != null;
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeNull_RsJt0() throws EncoderException {
        BCodec bCodec = new BCodec();
        Object result = bCodec.encode(null);
        assert result == null;
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncode_SupportedCharset_aPDg0() throws EncoderException {
        BCodec bCodec = new BCodec("UTF-8");
        String strSource = "Hello World";
        String sourceCharset = "UTF-8";
        String encodedString = bCodec.encode(strSource, sourceCharset);
        assertNotNull(encodedString);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetCharset_withCharset_MZmK0() {
        BCodec bCodec = new BCodec(Charset.forName("UTF-8"));
        Charset charset = bCodec.getCharset();
        assertNotNull(charset);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetCharset_withCharsetAndPolicy_ECCb1() {
        BCodec bCodec = new BCodec(Charset.forName("UTF-8"), CodecPolicy.STRICT);
        Charset charset = bCodec.getCharset();
        assertNotNull(charset);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetCharset_withCharsetString_tMRw2() {
        BCodec bCodec = new BCodec("UTF-8");
        Charset charset = bCodec.getCharset();
        assertNotNull(charset);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetCharset_withNoArgs_arAS3() {
        BCodec bCodec = new BCodec();
        Charset charset = bCodec.getCharset();
        assertNotNull(charset);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDecodeNullValue_HySB0() throws DecoderException {
        BCodec bCodec = new BCodec();
        Object result = bCodec.decode(null);
        assert result == null;
    }

    @Test
    public void testEncodeNonStringObject_yFIr2_SKkF0() {
        BCodec bCodec = new BCodec();
        Object value = new Object();
        try {
            bCodec.encodeText((String) value, Charset.defaultCharset());
            assert false;
        } catch (ClassCastException e) {
        } catch (EncoderException e) {
            assert false;
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncode_quCh0_fid1() throws EncoderException {
        BCodec bCodec = new BCodec("UTF-8");
        String strSource = "Hello World";
        String expected = "=?UTF-8?B?SGVsbG8gV29ybGQ=?=";
        String actual = bCodec.encode(strSource);
        assertEquals(expected, actual);
    }
}