/**
 * Generated by Aster
 */
package org.apache.commons.codec.net;
import java.io.UnsupportedEncodingException;
import org.apache.commons.codec.DecoderException;
import org.apache.commons.codec.EncoderException;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_URLCodec_Test_Passing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetDefaultCharset_yvMb0() throws Exception {
        URLCodec urlCodec = new URLCodec();
        assertEquals("UTF-8", urlCodec.getDefaultCharset());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetDefaultCharsetWithCharset_eXxg1() throws Exception {
        URLCodec urlCodec = new URLCodec("UTF-8");
        assertEquals("UTF-8", urlCodec.getDefaultCharset());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testDecodeWithCharset_JlDb0() throws Exception {
    URLCodec urlCodec = new URLCodec("UTF-8");
    String result = urlCodec.decode("encodedString");
    assertEquals("decodedString", result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testDecodeWithoutCharset_BmiQ1() throws Exception {
    URLCodec urlCodec = new URLCodec();
    String result = urlCodec.decode("encodedString");
    assertEquals("decodedString", result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDecode_XMUd0() throws DecoderException {
        URLCodec urlCodec = new URLCodec("UTF-8");
        byte[] bytes = "Hello World".getBytes();
        byte[] expected = "Hello+World".getBytes();
        assertArrayEquals(expected, urlCodec.decode(bytes));
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDecodeWithNull_ziQl1_1() throws Exception {
        URLCodec urlCodec = new URLCodec("UTF-8");
        byte[] bytes = null;
        DecoderException exception = assertThrows(DecoderException.class, () -> urlCodec.decode(bytes));}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncode_zojQ0() throws EncoderException {
        final String str = "https://www.example.com/?q=test";
        final String expected = "https%3A%2F%2Fwww.example.com%2F%3Fq%3Dtest";
        final URLCodec codec = new URLCodec();
        final String actual = codec.encode(str);
        assertEquals(expected, actual);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeWithCharset_Lomo1() throws EncoderException {
        final String str = "https://www.example.com/?q=test";
        final String charset = "UTF-8";
        final String expected = "https%3A%2F%2Fwww.example.com%2F%3Fq%3Dtest";
        final URLCodec codec = new URLCodec(charset);
        final String actual = codec.encode(str);
        assertEquals(expected, actual);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testEncodeWithNull_rzdM0() throws Exception {
    Object obj = null;
    Object expected = null;
    Object actual = new URLCodec().encode(obj);
    assertEquals(expected, actual);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testEncodeWithString_eCMb2() throws Exception {
    Object obj = "test";
    Object expected = "test";
    Object actual = new URLCodec().encode(obj);
    assertEquals(expected, actual);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testEncodeWithCharset_xekS4() throws Exception {
    Object obj = "test";
    Object expected = "test";
    Object actual = new URLCodec("UTF-8").encode(obj);
    assertEquals(expected, actual);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeWithCharset_lZuP0() throws UnsupportedEncodingException {
        URLCodec urlCodec = new URLCodec("UTF-8");
        String str = "Hello, World!";
        String encodedStr = urlCodec.encode(str, "UTF-8");
        assertEquals("Hello%2C%20World%21", encodedStr);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeWithoutCharset_lfbu1() throws UnsupportedEncodingException {
        URLCodec urlCodec = new URLCodec();
        String str = "Hello, World!";
        String encodedStr = urlCodec.encode(str, "UTF-8");
        assertEquals("Hello%2C%20World%21", encodedStr);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeNullString_ZLaT2() throws Exception {
        URLCodec urlCodec = new URLCodec();
        String str = null;
        String encodedStr = urlCodec.encode(str, "UTF-8");
        assertNull(encodedStr);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDecodeWithByteArray_TQqe1() throws Exception {
        URLCodec urlCodec = new URLCodec();
        byte[] input = "Hello, World!".getBytes();
        Object decoded = urlCodec.decode(input);
        assertEquals("Hello, World!", decoded);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDecodeWithString_oQlA2() throws Exception {
        URLCodec urlCodec = new URLCodec();
        String input = "Hello%2C+World!";
        Object decoded = urlCodec.decode(input);
        assertEquals("Hello, World!", decoded);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDecodeWithInvalidInput_sqCl3_1() throws Exception {
        URLCodec urlCodec = new URLCodec();
        Object input = 123;
        DecoderException exception = assertThrows(DecoderException.class, () -> urlCodec.decode(input));}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDecodeWithCharset_FOnN4() throws Exception {
        URLCodec urlCodec = new URLCodec("UTF-8");
        String input = "Hello%2C+World!";
        Object decoded = urlCodec.decode(input);
        assertEquals("Hello, World!", decoded);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void test_getEncoding_withParam_OPvh0() throws Exception {
        URLCodec urlCodec = new URLCodec("UTF-8");
        assertEquals("UTF-8", urlCodec.getEncoding());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void test_getEncoding_withoutParam_VuaU1() throws Exception {
        URLCodec urlCodec = new URLCodec();
        assertEquals(null, urlCodec.getEncoding());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void test_getEncoding_afterSet_NUps2() throws Exception {
        URLCodec urlCodec = new URLCodec();
        urlCodec.charset = "UTF-8";
        assertEquals("UTF-8", urlCodec.getEncoding());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void test_getEncoding_afterChange_BFVS3() throws Exception {
        URLCodec urlCodec = new URLCodec("UTF-8");
        urlCodec.charset = "UTF-16";
        assertEquals("UTF-16", urlCodec.getEncoding());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void test_getEncoding_afterNull_AoNS4() throws Exception {
        URLCodec urlCodec = new URLCodec("UTF-8");
        urlCodec.charset = null;
        assertEquals(null, urlCodec.getEncoding());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void test_getEncoding_afterEmpty_tGpl5() throws Exception {
        URLCodec urlCodec = new URLCodec("UTF-8");
        urlCodec.charset = "";
        assertEquals("", urlCodec.getEncoding());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void test_getEncoding_afterTab_OpBr7() throws Exception {
        URLCodec urlCodec = new URLCodec("UTF-8");
        urlCodec.charset = "\t";
        assertEquals("\t", urlCodec.getEncoding());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void test_getEncoding_afterNewline_AWKS8() throws Exception {
        URLCodec urlCodec = new URLCodec("UTF-8");
        urlCodec.charset = "\n";
        assertEquals("\n", urlCodec.getEncoding());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void test_getEncoding_afterCarriageReturn_GgWU9() throws Exception {
        URLCodec urlCodec = new URLCodec("UTF-8");
        urlCodec.charset = "\r";
        assertEquals("\r", urlCodec.getEncoding());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDecode_KWVA0() throws DecoderException, UnsupportedEncodingException {
        URLCodec urlCodec = new URLCodec("UTF-8");
        String str = "Hello World!";
        String decodedStr = urlCodec.decode(str, "UTF-8");
        assertEquals("Hello World!", decodedStr);
    }
}