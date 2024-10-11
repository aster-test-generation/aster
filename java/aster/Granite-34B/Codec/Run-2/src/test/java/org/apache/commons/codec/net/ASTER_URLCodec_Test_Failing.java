/**
 * Generated by Aster
 */
package org.apache.commons.codec.net;

import java.io.UnsupportedEncodingException;
import java.util.concurrent.TimeUnit;
import org.apache.commons.codec.DecoderException;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_URLCodec_Test_Failing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDecodeWithInvalidInput_WaKl2() {
        URLCodec codec = new URLCodec("UTF-8");
        try {
            codec.decode("Hello%20 worl");
            fail("DecoderException expected");
        } catch (DecoderException e) {
            assertTrue(true);
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeEmptycharset_FQPq3() throws UnsupportedEncodingException {
        URLCodec urlCodec = new URLCodec();
        String encodedString = urlCodec.encode("Hello World", "");
        assertEquals("Hello%20World", encodedString);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeWithByteArray_ylbe1_KSqf0() {
        URLCodec urlCodec = new URLCodec();
        byte[] input = new byte[]{1, 2, 3};
        byte[] result = urlCodec.encode(input);
        Assertions.assertArrayEquals(new byte[]{65, 81, 73, 68}, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void test_getEncoding_2_CXcW1_fid1() {
        URLCodec urlCodec = new URLCodec();
        assertEquals(null, urlCodec.getEncoding());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetDefaultCharsetWithNoArgConstructor_IEsM1_fid1() {
        URLCodec urlCodec = new URLCodec();
        assertEquals(null, urlCodec.getDefaultCharset());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeWithCharset_nkvp0_fid1() throws Exception {
        final String charset = "UTF-8";
        final String str = "Hello World";
        final URLCodec codec = new URLCodec(charset);
        final String encoded = codec.encode(str);
        assertEquals("Hello%20World", encoded);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeWithoutCharset_lZTX1_fid1() throws Exception {
        final String str = "Hello World";
        final URLCodec codec = new URLCodec();
        final String encoded = codec.encode(str);
        assertEquals("Hello%20World", encoded);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeWithCharset_DZCw0_fid1() throws UnsupportedEncodingException {
        URLCodec urlCodec = new URLCodec("UTF-8");
        String encodedString = urlCodec.encode("Hello World", "UTF-8");
        assertEquals("Hello%20World", encodedString);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeWithoutCharset_tjJZ1_fid1() throws UnsupportedEncodingException {
        URLCodec urlCodec = new URLCodec();
        String encodedString = urlCodec.encode("Hello World", "US-ASCII");
        assertEquals("Hello%20World", encodedString);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeInvalidcharset_VmPu4_fid1() {
        URLCodec urlCodec = new URLCodec();
        try {
            urlCodec.encode("Hello World", "Invalid-Charset");
        } catch (UnsupportedEncodingException e) {
            assertEquals("Invalid charset name: Invalid-Charset", e.getMessage());
        }
    }
}