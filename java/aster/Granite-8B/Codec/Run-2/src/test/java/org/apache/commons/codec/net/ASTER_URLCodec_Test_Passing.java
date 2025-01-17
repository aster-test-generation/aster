/**
 * Generated by Aster
 */
package org.apache.commons.codec.net;

import java.util.concurrent.TimeUnit;
import org.apache.commons.codec.DecoderException;
import org.apache.commons.codec.EncoderException;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_URLCodec_Test_Passing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testgetEncoding_xVBK0() {
        URLCodec urlCodec = new URLCodec("UTF-8");
        assertEquals("UTF-8", urlCodec.getEncoding());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testgetEncoding2_cOcF1() {
        URLCodec urlCodec = new URLCodec();
        assertNull(null);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetDefaultCharset_CILM0() {
        URLCodec urlCodec = new URLCodec("UTF-8");
        assertEquals("UTF-8", urlCodec.getDefaultCharset());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDecodeUrl16_Jmhg15() {
        byte[] bytes = new byte[]{37, 48, 66};
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDecodeWithInvalidObject_vwZI3() {
        URLCodec codec = new URLCodec();
        Object input = new Object();
        try {
            codec.decode(input);
            Assertions.fail("DecoderException expected");
        } catch (DecoderException e) {
            Assertions.assertEquals("Objects of type " + input.getClass().getName() + " cannot be URL decoded", e.getMessage());
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeUnsupportedType_JVZW3() {
        URLCodec urlCodec = new URLCodec();
        Object input = new Object();
        try {
            urlCodec.encode(input);
        } catch (EncoderException e) {
            assertEquals("Objects of type " + input.getClass().getName() + " cannot be URL encoded", e.getMessage());
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeUrl_NullInput_OxWn0() {
        final byte[] input = null;
        final byte[] expected = null;
        final byte[] actual = URLCodec.encodeUrl(null, input);
        assertArrayEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeUrl_EmptyInput_GpIR1() {
        final byte[] input = new byte[0];
        final byte[] expected = new byte[0];
        final byte[] actual = URLCodec.encodeUrl(null, input);
        assertArrayEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDecodeWithValidString_owxQ1_oUiq0() {
        URLCodec codec = new URLCodec();
        String inputString = "Hello%20World";
        String expectedString = "Hello World";
        String decodedString = null;
        try {
            decodedString = codec.decode(inputString);
        } catch (DecoderException e) {
            e.printStackTrace();
        }
        assertEquals(expectedString, decodedString);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDecodeUrl1_CdWH0_vHSN0() {
        byte[] bytes = new byte[]{65, 66, 67};
        byte[] expected = new byte[]{65, 66, 67};
        byte[] actual;
        try {
            actual = URLCodec.decodeUrl(bytes);
        } catch (DecoderException e) {
            throw new RuntimeException(e);
        }
        assertArrayEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDecodeUrl2_UZka1_zpyt0() {
        byte[] bytes = new byte[]{43};
        byte[] expected = new byte[]{32};
        byte[] actual;
        try {
            actual = URLCodec.decodeUrl(bytes);
        } catch (DecoderException e) {
            throw new RuntimeException(e);
        }
        assertArrayEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDecodeUrl12_ggOD11_oKuu0() {
        byte[] bytes = new byte[]{37, 48, 55};
        byte[] expected = new byte[]{7};
        byte[] actual = null;
        try {
            actual = URLCodec.decodeUrl(bytes);
        } catch (DecoderException e) {
            e.printStackTrace();
        }
        assertArrayEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDecodeUrl13_qadi12_iMqb0() {
        byte[] bytes = new byte[]{37, 48, 56};
        byte[] expected = new byte[]{8};
        byte[] actual = null;
        try {
            actual = URLCodec.decodeUrl(bytes);
        } catch (DecoderException e) {
            e.printStackTrace();
        }
        assertArrayEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDecodeUrl15_Cvla14_EKBC0() {
        byte[] bytes = new byte[]{37, 48, 65};
        byte[] expected = new byte[]{10};
        byte[] actual;
        try {
            actual = URLCodec.decodeUrl(bytes);
        } catch (DecoderException e) {
            throw new RuntimeException(e);
        }
        assertArrayEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDecodeWithByteArray_uTGm1_cEOU0() throws DecoderException {
        URLCodec codec = new URLCodec();
        byte[] input = "Hello World".getBytes();
        Object result = codec.decode(input);
        Assertions.assertEquals("Hello World", new String((byte[]) result));
    }
}