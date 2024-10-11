/**
 * Generated by Aster
 */
package org.apache.commons.codec.net;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

import java.util.concurrent.TimeUnit;
import org.apache.commons.codec.DecoderException;
import org.apache.commons.codec.EncoderException;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

public class Aster_BCodec_Coverage_Test_Failing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeWithString_Gqeh1() throws EncoderException {
        BCodec bCodec = new BCodec();
        Object value = "test";
        Object result = bCodec.encode(value);
        Assertions.assertEquals(result, "test");
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDecodeWithString_ZesT1() throws org.apache.commons.codec.DecoderException {
        BCodec bCodec = new BCodec();
        Object value = "value";
        Object actual = bCodec.decode(value);
        Assertions.assertEquals("value", actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDecodeWithEmptyValue_FIZD3() throws org.apache.commons.codec.DecoderException {
        BCodec bCodec = new BCodec();
        Object value = "";
        Object actual = bCodec.decode(value);
        Assertions.assertEquals("", actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDecodeWithInvalidValue_zJJT4() throws org.apache.commons.codec.DecoderException {
        BCodec bCodec = new BCodec();
        Object value = "invalid";
        try {
            bCodec.decode(value);
            Assertions.fail("DecoderException expected");
        } catch (DecoderException e) {
            Assertions.assertEquals("Objects of type " + value.getClass().getName() + " cannot be decoded using BCodec", e.getMessage());
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncode_yMin0() throws EncoderException {
        BCodec bCodec = new BCodec();
        String strSource = "source";
        String sourceCharset = "charset";
        assertEquals("result", bCodec.encode(strSource, sourceCharset));
    }
}