/**
 * Generated by Aster
 */
package org.apache.commons.codec.net;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;
import org.apache.commons.codec.DecoderException;
import org.apache.commons.codec.EncoderException;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_BCodec_Coverage_Test_Passing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeWithNull_pVsm0() throws org.apache.commons.codec.EncoderException {
        BCodec bCodec = new BCodec();
        Object result = bCodec.encode(null);
        Assertions.assertNull(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeWithString_lwbO1() throws org.apache.commons.codec.EncoderException {
        BCodec bCodec = new BCodec();
        String value = "Hello, World!";
        Object result = bCodec.encode(value);
        Assertions.assertNotNull(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeWithNonStringObject_MXDy2() throws org.apache.commons.codec.EncoderException {
        BCodec bCodec = new BCodec();
        Object value = new Object();
        try {
            bCodec.encode(value);
            Assertions.fail("Expected EncoderException");
        } catch (EncoderException e) {
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeWithUnsupportedType_kRfT3() throws org.apache.commons.codec.EncoderException {
        BCodec bCodec = new BCodec();
        Object value = new ArrayList<>();
        try {
            bCodec.encode(value);
            Assertions.fail("Expected EncoderException");
        } catch (EncoderException e) {
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDecodeWithNull_bKSv0() throws org.apache.commons.codec.DecoderException {
        BCodec bCodec = new BCodec();
        Object result = bCodec.decode(null);
        assertEquals(null, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDecodeWithNonString_uFhW2() throws org.apache.commons.codec.DecoderException {
        BCodec bCodec = new BCodec();
        Object input = new Object();
        try {
            bCodec.decode(input);
            fail("DecoderException expected");
        } catch (DecoderException e) {
            assertEquals("Objects of type " + input.getClass().getName() + " cannot be decoded using BCodec", e.getMessage());
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDecodeWithUnsupportedEncodingException_HbKw1_fid2() throws DecoderException {
        BCodec bCodec = new BCodec();
        String value = "example";
        try {
            bCodec.decode(value);
            fail("Expected DecoderException");
        } catch (DecoderException e) {
            assertFalse(e.getMessage().contains("Unsupported encoding"));
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeWithSupportedCharset_iAYE0_fid2() throws EncoderException {
        BCodec bCodec = new BCodec("UTF-8");
        String encodedString = bCodec.encode("Hello, World!", "UTF-8");
    }
}