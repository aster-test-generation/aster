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
public void testDecode_tDEq0() throws DecoderException {
    URLCodec urlCodec = new URLCodec();
    String str = "https://www.example.com/path/to/resource?query=value";
    String expected = "https://www.example.com/path/to/resource?query=value";
    String actual = urlCodec.decode(str);
    assertEquals(expected, actual);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testEncodeByteArray_vqlw0() throws EncoderException {
    URLCodec urlCodec = new URLCodec();
    byte[] input = new byte[] { 1, 2, 3, 4, 5 };
    Object output = urlCodec.encode(input);
    assertEquals(input, output);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testEncodeString_TkeA1() throws EncoderException {
    URLCodec urlCodec = new URLCodec();
    String input = "hello world";
    Object output = urlCodec.encode(input);
    assertEquals(input, output);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testDecodeUrl_null_uKyG0() throws Exception {
    byte[] bytes = null;
    try {
        URLCodec.decodeUrl(bytes);
        fail("Expected NullPointerException");
    } catch (NullPointerException e) {
        assertEquals("Invalid URL encoding: ", e.getMessage());
    }
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testDecodeUrl_empty_bUwG1() throws Exception {
    byte[] bytes = new byte[0];
    byte[] result = URLCodec.decodeUrl(bytes);
    assertEquals(0, result.length);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testDecodeUrl_plus_gozO2_1() throws Exception {
    byte[] bytes = new byte[] { '+' };
    byte[] result = URLCodec.decodeUrl(bytes);
    assertEquals(1, result.length);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testDecodeUrl_plus_gozO2_2() throws Exception {
    byte[] bytes = new byte[] { '+' };
    byte[] result = URLCodec.decodeUrl(bytes);
    assertEquals(' ', result[0]);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testDecodeUrl_invalidUrlEncoding_AzHy4() throws Exception {
    byte[] bytes = new byte[] { 'a', 'b', 'c' };
    try {
        URLCodec.decodeUrl(bytes);
        fail("Expected DecoderException");
    } catch (DecoderException e) {
        assertEquals("Invalid URL encoding: ", e.getMessage());
    }
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testDecodeString_keym1() throws DecoderException {
    URLCodec urlCodec = new URLCodec();
    String input = "ABC";
    String expected = "ABC";
    String actual = urlCodec.decode(input);
    assertEquals(expected, actual);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testDecodeNull_IHVl2() throws DecoderException {
    URLCodec urlCodec = new URLCodec();
    Object input = null;
    Object expected = null;
    Object actual = urlCodec.decode(input);
    assertEquals(expected, actual);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetDefaultCharset_AzID0() throws Exception {
    URLCodec urlCodec = new URLCodec();
    String defaultCharset = urlCodec.getDefaultCharset();
    assertEquals("UTF-8", defaultCharset);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetDefaultCharsetWithCharset_KqwJ1() throws Exception {
    URLCodec urlCodec = new URLCodec("UTF-16");
    String defaultCharset = urlCodec.getDefaultCharset();
    assertEquals("UTF-16", defaultCharset);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetDefaultCharsetWithNullCharset_Mpod2() throws Exception {
    URLCodec urlCodec = new URLCodec(null);
    String defaultCharset = urlCodec.getDefaultCharset();
    assertEquals("UTF-8", defaultCharset);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetDefaultCharsetWithEmptyCharset_CEBp3() throws Exception {
    URLCodec urlCodec = new URLCodec("");
    String defaultCharset = urlCodec.getDefaultCharset();
    assertEquals("UTF-8", defaultCharset);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetDefaultCharsetWithInvalidCharset_ssEh4() throws Exception {
    URLCodec urlCodec = new URLCodec("invalid");
    String defaultCharset = urlCodec.getDefaultCharset();
    assertEquals("UTF-8", defaultCharset);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetDefaultCharsetWithNullURLCodec_GnXp5() throws Exception {
    URLCodec urlCodec = null;
    String defaultCharset = urlCodec.getDefaultCharset();
    assertEquals(null, defaultCharset);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetEncoding_DefaultCharset_tfxi0() throws Exception {
    URLCodec codec = new URLCodec();
    String encoding = codec.getEncoding();
    assertEquals("UTF-8", encoding);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetEncoding_CustomCharset_BGTS1() throws Exception {
    URLCodec codec = new URLCodec("ISO-8859-1");
    String encoding = codec.getEncoding();
    assertEquals("ISO-8859-1", encoding);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetEncoding_NullCharset_doLf2() throws Exception {
    URLCodec codec = new URLCodec(null);
    String encoding = codec.getEncoding();
    assertEquals("UTF-8", encoding);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetEncoding_EmptyCharset_eqes3() throws Exception {
    URLCodec codec = new URLCodec("");
    String encoding = codec.getEncoding();
    assertEquals("UTF-8", encoding);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetEncoding_InvalidCharset_xZOa4() throws Exception {
    URLCodec codec = new URLCodec("invalid");
    String encoding = codec.getEncoding();
    assertEquals("UTF-8", encoding);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetEncoding_CharsetWithSpaces_uWWz5() throws Exception {
    URLCodec codec = new URLCodec("UTF-8 ");
    String encoding = codec.getEncoding();
    assertEquals("UTF-8", encoding);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetEncoding_CharsetWithSpecialChars_ZTuq6() throws Exception {
    URLCodec codec = new URLCodec("UTF-8\u0000");
    String encoding = codec.getEncoding();
    assertEquals("UTF-8", encoding);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetEncoding_CharsetWithNonAsciiChars_qKzr7() throws Exception {
    URLCodec codec = new URLCodec("UTF-8\u00A0");
    String encoding = codec.getEncoding();
    assertEquals("UTF-8", encoding);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetEncoding_CharsetWithMultipleNonAsciiChars_ejiy8() throws Exception {
    URLCodec codec = new URLCodec("UTF-8\u00A0\u00A1");
    String encoding = codec.getEncoding();
    assertEquals("UTF-8", encoding);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testDecode_nullString_GBAU0() throws DecoderException, UnsupportedEncodingException {
    URLCodec urlCodec = new URLCodec();
    String result = urlCodec.decode(null, "UTF-8");
    assertNull(result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testDecode_emptyString_FEjW2() throws DecoderException, UnsupportedEncodingException {
    URLCodec urlCodec = new URLCodec();
    String result = urlCodec.decode("", "UTF-8");
    assertEquals("", result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testDecode_encodedString_rfXI3() throws DecoderException, UnsupportedEncodingException {
    URLCodec urlCodec = new URLCodec();
    String result = urlCodec.decode("%20", "UTF-8");
    assertEquals(" ", result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testDecode_mixedString_cvJV4() throws DecoderException, UnsupportedEncodingException {
    URLCodec urlCodec = new URLCodec();
    String result = urlCodec.decode("hello%20world", "UTF-8");
    assertEquals("hello world", result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testEncodeUrl_NullBytes_phFg0() throws Exception {
    byte[] bytes = null;
    byte[] expected = null;
    byte[] actual = URLCodec.encodeUrl(null, bytes);
    assertArrayEquals(expected, actual);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testEncodeUrl_EmptyBytes_KXPi1() throws Exception {
    byte[] bytes = new byte[0];
    byte[] expected = new byte[0];
    byte[] actual = URLCodec.encodeUrl(null, bytes);
    assertArrayEquals(expected, actual);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testEncodeUrl_UrlSafeBytes_yfwf2() throws Exception {
    byte[] bytes = new byte[] { 'a', 'b', 'c' };
    byte[] expected = new byte[] { 'a', 'b', 'c' };
    byte[] actual = URLCodec.encodeUrl(null, bytes);
    assertArrayEquals(expected, actual);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testEncodeUrl_NonUrlSafeBytes_XSTP3() throws Exception {
    byte[] bytes = new byte[] { 'a', 'b', 'c', ' ', 'd' };
    byte[] expected = new byte[] { 'a', 'b', 'c', '+', 'd' };
    byte[] actual = URLCodec.encodeUrl(null, bytes);
    assertArrayEquals(expected, actual);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testEncodeUrl_NonUrlSafeBytesWithEscapedChar_PgJP4() throws Exception {
    byte[] bytes = new byte[] { 'a', 'b', 'c', ' ', 'd', 'e' };
    byte[] expected = new byte[] { 'a', 'b', 'c', '+', 'd', 'e' };
    byte[] actual = URLCodec.encodeUrl(null, bytes);
    assertArrayEquals(expected, actual);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testEncodeUrl_NonUrlSafeBytesWithEscapedCharAndSpace_RljI5() throws Exception {
    byte[] bytes = new byte[] { 'a', 'b', 'c', ' ', 'd', 'e', ' ' };
    byte[] expected = new byte[] { 'a', 'b', 'c', '+', 'd', 'e', '+' };
    byte[] actual = URLCodec.encodeUrl(null, bytes);
    assertArrayEquals(expected, actual);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testEncodeUrl_NonUrlSafeBytesWithEscapedCharAndSpaceAndPlus_esze6() throws Exception {
    byte[] bytes = new byte[] { 'a', 'b', 'c', ' ', 'd', 'e', '+', ' ' };
    byte[] expected = new byte[] { 'a', 'b', 'c', '+', 'd', 'e', '+', '+' };
    byte[] actual = URLCodec.encodeUrl(null, bytes);
    assertArrayEquals(expected, actual);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testEncode_validString_fIIi1() throws EncoderException {
    URLCodec urlCodec = new URLCodec();
    String str = "Hello, World!";
    String expected = "Hello%2C%20World%21";
    assertEquals(expected, urlCodec.encode(str));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testEncode_emptyString_umCJ2() throws EncoderException {
    URLCodec urlCodec = new URLCodec();
    assertEquals("", urlCodec.encode(""));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testEncode_null_rIPV0() throws Exception {
    URLCodec urlCodec = new URLCodec();
    byte[] bytes = null;
    assertNull(urlCodec.encode(bytes));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testEncode_empty_DpOQ1() throws Exception {
    URLCodec urlCodec = new URLCodec();
    byte[] bytes = new byte[0];
    assertEquals(0, urlCodec.encode(bytes).length);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testEncode_nonEmpty_UqqC2() throws Exception {
    URLCodec urlCodec = new URLCodec();
    byte[] bytes = new byte[] { 1, 2, 3, 4, 5 };
    assertEquals(5, urlCodec.encode(bytes).length);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testEncode_charset_HBWB5() throws Exception {
    URLCodec urlCodec = new URLCodec("UTF-8");
    byte[] bytes = new byte[] { 1, 2, 3, 4, 5 };
    assertEquals(5, urlCodec.encode(bytes).length);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testEncode_charset_null_WDPh8() throws Exception {
    URLCodec urlCodec = new URLCodec("UTF-8");
    byte[] bytes = null;
    assertNull(urlCodec.encode(bytes));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testEncode_charset_empty_nGBs9() throws Exception {
    URLCodec urlCodec = new URLCodec("UTF-8");
    byte[] bytes = new byte[0];
    assertEquals(0, urlCodec.encode(bytes).length);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testEncode_xsey0() throws UnsupportedEncodingException {
    URLCodec urlCodec = new URLCodec();
    String str = "Hello, World!";
    String charsetName = "UTF-8";
    String expected = "Hello%2C%20World%21";
    String actual = urlCodec.encode(str, charsetName);
    assertEquals(expected, actual);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testEncodeWithEmptyString_Xmea2() throws UnsupportedEncodingException {
    URLCodec urlCodec = new URLCodec();
    String str = "";
    String charsetName = "UTF-8";
    String expected = "";
    String actual = urlCodec.encode(str, charsetName);
    assertEquals(expected, actual);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testEncodeWithInvalidCharsetName_ZIjU3() throws UnsupportedEncodingException {
    URLCodec urlCodec = new URLCodec();
    String str = "Hello, World!";
    String charsetName = "invalid_charset";
    String expected = null;
    String actual = urlCodec.encode(str, charsetName);
    assertEquals(expected, actual);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testDecode_emptyBytes_Awxy0() throws DecoderException {
    URLCodec urlCodec = new URLCodec();
    byte[] bytes = new byte[0];
    byte[] expected = new byte[0];
    byte[] actual = urlCodec.decode(bytes);
    assertArrayEquals(expected, actual);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testDecode_nullBytes_Ktsh1() throws DecoderException {
    URLCodec urlCodec = new URLCodec();
    byte[] bytes = null;
    byte[] expected = new byte[0];
    byte[] actual = urlCodec.decode(bytes);
    assertArrayEquals(expected, actual);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testDecode_validBytes_keKK2() throws DecoderException {
    URLCodec urlCodec = new URLCodec();
    byte[] bytes = new byte[] { 65, 66, 67, 68, 69 };
    byte[] expected = new byte[] { 65, 66, 67, 68, 69 };
    byte[] actual = urlCodec.decode(bytes);
    assertArrayEquals(expected, actual);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testDecode_validBytesWithCharset_qylz4() throws DecoderException {
    URLCodec urlCodec = new URLCodec("UTF-8");
    byte[] bytes = new byte[] { 65, 66, 67, 68, 69 };
    byte[] expected = new byte[] { 65, 66, 67, 68, 69 };
    byte[] actual = urlCodec.decode(bytes);
    assertArrayEquals(expected, actual);
}
}