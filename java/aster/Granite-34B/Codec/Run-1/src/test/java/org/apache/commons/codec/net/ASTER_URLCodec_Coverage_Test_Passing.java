/**
 * Generated by Aster
 */
package org.apache.commons.codec.net;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

import java.io.UnsupportedEncodingException;
import java.util.concurrent.TimeUnit;
import org.apache.commons.codec.DecoderException;
import org.apache.commons.codec.EncoderException;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

public class Aster_URLCodec_Coverage_Test_Passing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDecodeWithUnsupportedEncodingException_LCeI0() throws DecoderException {
        URLCodec urlCodec = new URLCodec("UTF-8");
        String actual = urlCodec.decode("test");
        assertEquals("test", actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeUrlWithNegativeValue_lKsE0() {
        URLCodec codec = new URLCodec();
        byte[] bytes = new byte[]{-1};
        byte[] expected = new byte[]{(byte) '%', 'F', 'F'};
        assertArrayEquals(expected, codec.encodeUrl(null, bytes));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeWithNull_PFaM0() throws UnsupportedEncodingException {
        URLCodec urlCodec = new URLCodec();
        assertEquals(null, urlCodec.encode(null, "UTF-8"));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeWithEmpty_uqDN1() throws UnsupportedEncodingException {
        URLCodec urlCodec = new URLCodec();
        assertEquals("", urlCodec.encode("", "UTF-8"));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeWithNull_oIAV0() throws org.apache.commons.codec.EncoderException {
        URLCodec urlCodec = new URLCodec();
        Object obj = null;
        Object result = urlCodec.encode(obj);
        assert result == null;
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeWithByteArray_Isec1() throws org.apache.commons.codec.EncoderException {
        URLCodec urlCodec = new URLCodec();
        Object obj = new byte[]{1, 2, 3};
        Object result = urlCodec.encode(obj);
        assert result != null;
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeWithString_ZGcS2() throws org.apache.commons.codec.EncoderException {
        URLCodec urlCodec = new URLCodec();
        Object obj = "hello";
        Object result = urlCodec.encode(obj);
        assert result != null;
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeWithUnsupportedType_cDXM3() throws org.apache.commons.codec.EncoderException {
        URLCodec urlCodec = new URLCodec();
        Object obj = new Object();
        try {
            urlCodec.encode(obj);
        } catch (EncoderException e) {
            assert e.getMessage().equals("Objects of type java.lang.Object cannot be URL encoded");
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDecodeWithNull_LvuI0() throws DecoderException {
        URLCodec urlCodec = new URLCodec();
        Object obj = null;
        Object result = urlCodec.decode(obj);
        Assertions.assertNull(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDecodeWithByteArray_fjTX1() throws DecoderException {
        URLCodec urlCodec = new URLCodec();
        Object obj = new byte[0];
        Object result = urlCodec.decode(obj);
        byte[] expected = new byte[0];
        Assertions.assertArrayEquals(expected, (byte[]) result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDecodeWithUnsupportedType_PYVS3() throws DecoderException {
        URLCodec urlCodec = new URLCodec();
        Object obj = new Object();
        try {
            Object result = urlCodec.decode(obj);
            Assertions.fail("DecoderException expected");
        } catch (DecoderException e) {
            Assertions.assertEquals("Objects of type " + obj.getClass().getName() + " cannot be URL decoded", e.getMessage());
        }
    }
}