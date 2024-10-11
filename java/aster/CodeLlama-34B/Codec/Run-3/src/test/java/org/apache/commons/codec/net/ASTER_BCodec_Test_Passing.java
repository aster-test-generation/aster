/**
 * Generated by Aster
 */
package org.apache.commons.codec.net;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import org.apache.commons.codec.CodecPolicy;
import org.apache.commons.codec.DecoderException;
import org.apache.commons.codec.EncoderException;
import org.apache.commons.codec.binary.Base64;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_BCodec_Test_Passing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetEncoding1_FjKD0() throws Exception {
BCodec bCodec = new BCodec();
String encoding = bCodec.getEncoding();
assertEquals("B", encoding);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetEncoding2_Xuvy1() throws Exception {
BCodec bCodec = new BCodec(StandardCharsets.UTF_8);
String encoding = bCodec.getEncoding();
assertEquals("B", encoding);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetEncoding3_ZNcC2() throws Exception {
BCodec bCodec = new BCodec(StandardCharsets.UTF_8.name());
String encoding = bCodec.getEncoding();
assertEquals("B", encoding);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testDoEncoding_null_sYwm0() throws Exception {
    BCodec bCodec = new BCodec();
    byte[] bytes = null;
    byte[] encodedBytes = bCodec.doEncoding(bytes);
    assertNull(encodedBytes);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testDoEncoding_nonNull_mWOc1_1() throws Exception {
    BCodec bCodec = new BCodec(StandardCharsets.UTF_8, CodecPolicy.STRICT);
    byte[] bytes = "Hello, World!".getBytes(StandardCharsets.UTF_8);
    byte[] encodedBytes = bCodec.doEncoding(bytes);
    assertNotNull(encodedBytes);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testDoEncoding_nonNull_mWOc1_2() throws Exception {
    BCodec bCodec = new BCodec(StandardCharsets.UTF_8, CodecPolicy.STRICT);
    byte[] bytes = "Hello, World!".getBytes(StandardCharsets.UTF_8);
    byte[] encodedBytes = bCodec.doEncoding(bytes);
    assertEquals(Base64.encodeBase64(bytes), encodedBytes);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testDecode_String_fXSJ0() throws Exception {
    BCodec bCodec = new BCodec(Charset.forName("UTF-8"), CodecPolicy.STRICT);
    String input = "Hello, World!";
    Object output = bCodec.decode(input);
    assertEquals(input, output);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testDecode_Charset_jAaD1() throws Exception {
    BCodec bCodec = new BCodec(Charset.forName("UTF-8"));
    String input = "Hello, World!";
    Object output = bCodec.decode(input);
    assertEquals(input, output);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testIsStrictDecoding_StrictPolicy_hpfK0() throws Exception {
    BCodec bCodec = new BCodec(StandardCharsets.UTF_8, CodecPolicy.STRICT);
    assertTrue(bCodec.isStrictDecoding());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testIsStrictDecoding_LenientPolicy_kkGe1() throws Exception {
    BCodec bCodec = new BCodec(StandardCharsets.UTF_8, CodecPolicy.LENIENT);
    assertFalse(bCodec.isStrictDecoding());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testIsStrictDecoding_NullDecodingPolicy_GpHY2() throws Exception {
    BCodec bCodec = new BCodec(StandardCharsets.UTF_8, null);
    assertFalse(bCodec.isStrictDecoding());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testIsStrictDecoding_NullBCodecObject_jafi3() throws Exception {
    BCodec bCodec = null;
    assertFalse(bCodec.isStrictDecoding());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testEncode_String_DFKF0() throws Exception {
    BCodec bCodec = new BCodec();
    String input = "Hello, World!";
    String expected = "SGVsbG8sIFdvcmxkIQ==";
    String actual = bCodec.encode(input);
    assertEquals(expected, actual);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testEncode_String_Lenient_HDfE1() throws Exception {
    BCodec bCodec = new BCodec(StandardCharsets.UTF_8, CodecPolicy.LENIENT);
    String input = "Hello, World!";
    String expected = "SGVsbG8sIFdvcmxkIQ==";
    String actual = bCodec.encode(input);
    assertEquals(expected, actual);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testEncode_String_Strict_kUky2() throws Exception {
    BCodec bCodec = new BCodec(StandardCharsets.UTF_8, CodecPolicy.STRICT);
    String input = "Hello, World!";
    String expected = "SGVsbG8sIFdvcmxkIQ==";
    String actual = bCodec.encode(input);
    assertEquals(expected, actual);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testDecode_strict_zpZw0() throws DecoderException {
    BCodec bCodec = new BCodec(StandardCharsets.UTF_8, CodecPolicy.STRICT);
    String value = "hello";
    String expected = "hello";
    String actual = bCodec.decode(value);
    assertEquals(expected, actual);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testDecode_lenient_BWPf1() throws DecoderException {
    BCodec bCodec = new BCodec(StandardCharsets.UTF_8, CodecPolicy.LENIENT);
    String value = "hello";
    String expected = "hello";
    String actual = bCodec.decode(value);
    assertEquals(expected, actual);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testDecode_null_vqMr2() throws DecoderException {
    BCodec bCodec = new BCodec(StandardCharsets.UTF_8, CodecPolicy.STRICT);
    String value = null;
    String expected = null;
    String actual = bCodec.decode(value);
    assertEquals(expected, actual);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testDecode_empty_xHhT3() throws DecoderException {
    BCodec bCodec = new BCodec(StandardCharsets.UTF_8, CodecPolicy.STRICT);
    String value = "";
    String expected = "";
    String actual = bCodec.decode(value);
    assertEquals(expected, actual);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testDoDecoding_null_aoXz0() throws Exception {
    BCodec bCodec = new BCodec();
    byte[] bytes = null;
    byte[] result = bCodec.doDecoding(bytes);
    assertNull(result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testDoDecoding_empty_wFBr1() throws Exception {
    BCodec bCodec = new BCodec();
    byte[] bytes = new byte[0];
    byte[] result = bCodec.doDecoding(bytes);
    assertEquals(0, result.length);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testDoDecoding_nonEmpty_bqWW2_1() throws Exception {
    BCodec bCodec = new BCodec();
    byte[] bytes = new byte[] { 1, 2, 3, 4, 5 };
    byte[] result = bCodec.doDecoding(bytes);
    assertEquals(5, result.length);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testDoDecoding_nonEmpty_bqWW2_2() throws Exception {
    BCodec bCodec = new BCodec();
    byte[] bytes = new byte[] { 1, 2, 3, 4, 5 };
    byte[] result = bCodec.doDecoding(bytes);
    assertEquals(1, result[0]);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testDoDecoding_nonEmpty_bqWW2_3() throws Exception {
    BCodec bCodec = new BCodec();
    byte[] bytes = new byte[] { 1, 2, 3, 4, 5 };
    byte[] result = bCodec.doDecoding(bytes);
    assertEquals(2, result[1]);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testDoDecoding_nonEmpty_bqWW2_4() throws Exception {
    BCodec bCodec = new BCodec();
    byte[] bytes = new byte[] { 1, 2, 3, 4, 5 };
    byte[] result = bCodec.doDecoding(bytes);
    assertEquals(3, result[2]);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testDoDecoding_nonEmpty_bqWW2_5() throws Exception {
    BCodec bCodec = new BCodec();
    byte[] bytes = new byte[] { 1, 2, 3, 4, 5 };
    byte[] result = bCodec.doDecoding(bytes);
    assertEquals(4, result[3]);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testDoDecoding_nonEmpty_bqWW2_6() throws Exception {
    BCodec bCodec = new BCodec();
    byte[] bytes = new byte[] { 1, 2, 3, 4, 5 };
    byte[] result = bCodec.doDecoding(bytes);
    assertEquals(5, result[4]);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testDoDecoding_withChunkSeparator_ejWE3_1() throws Exception {
    BCodec bCodec = new BCodec(StandardCharsets.UTF_8, CodecPolicy.LENIENT);
    byte[] bytes = new byte[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
    byte[] result = bCodec.doDecoding(bytes);
    assertEquals(10, result.length);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testDoDecoding_withChunkSeparator_ejWE3_2() throws Exception {
    BCodec bCodec = new BCodec(StandardCharsets.UTF_8, CodecPolicy.LENIENT);
    byte[] bytes = new byte[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
    byte[] result = bCodec.doDecoding(bytes);
    assertEquals(1, result[0]);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testDoDecoding_withChunkSeparator_ejWE3_3() throws Exception {
    BCodec bCodec = new BCodec(StandardCharsets.UTF_8, CodecPolicy.LENIENT);
    byte[] bytes = new byte[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
    byte[] result = bCodec.doDecoding(bytes);
    assertEquals(2, result[1]);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testDoDecoding_withChunkSeparator_ejWE3_4() throws Exception {
    BCodec bCodec = new BCodec(StandardCharsets.UTF_8, CodecPolicy.LENIENT);
    byte[] bytes = new byte[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
    byte[] result = bCodec.doDecoding(bytes);
    assertEquals(3, result[2]);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testDoDecoding_withChunkSeparator_ejWE3_5() throws Exception {
    BCodec bCodec = new BCodec(StandardCharsets.UTF_8, CodecPolicy.LENIENT);
    byte[] bytes = new byte[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
    byte[] result = bCodec.doDecoding(bytes);
    assertEquals(4, result[3]);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testDoDecoding_withChunkSeparator_ejWE3_6() throws Exception {
    BCodec bCodec = new BCodec(StandardCharsets.UTF_8, CodecPolicy.LENIENT);
    byte[] bytes = new byte[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
    byte[] result = bCodec.doDecoding(bytes);
    assertEquals(5, result[4]);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testDoDecoding_withChunkSeparator_ejWE3_7() throws Exception {
    BCodec bCodec = new BCodec(StandardCharsets.UTF_8, CodecPolicy.LENIENT);
    byte[] bytes = new byte[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
    byte[] result = bCodec.doDecoding(bytes);
    assertEquals(6, result[5]);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testDoDecoding_withChunkSeparator_ejWE3_8() throws Exception {
    BCodec bCodec = new BCodec(StandardCharsets.UTF_8, CodecPolicy.LENIENT);
    byte[] bytes = new byte[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
    byte[] result = bCodec.doDecoding(bytes);
    assertEquals(7, result[6]);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testDoDecoding_withChunkSeparator_ejWE3_9() throws Exception {
    BCodec bCodec = new BCodec(StandardCharsets.UTF_8, CodecPolicy.LENIENT);
    byte[] bytes = new byte[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
    byte[] result = bCodec.doDecoding(bytes);
    assertEquals(8, result[7]);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testDoDecoding_withChunkSeparator_ejWE3_10() throws Exception {
    BCodec bCodec = new BCodec(StandardCharsets.UTF_8, CodecPolicy.LENIENT);
    byte[] bytes = new byte[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
    byte[] result = bCodec.doDecoding(bytes);
    assertEquals(9, result[8]);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testDoDecoding_withChunkSeparator_ejWE3_11() throws Exception {
    BCodec bCodec = new BCodec(StandardCharsets.UTF_8, CodecPolicy.LENIENT);
    byte[] bytes = new byte[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
    byte[] result = bCodec.doDecoding(bytes);
    assertEquals(10, result[9]);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testDoDecoding_withChunkSeparatorAndPadding_uWRP4_1() throws Exception {
    BCodec bCodec = new BCodec(StandardCharsets.UTF_8, CodecPolicy.LENIENT);
    byte[] bytes = new byte[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12 };
    byte[] result = bCodec.doDecoding(bytes);
    assertEquals(12, result.length);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testDoDecoding_withChunkSeparatorAndPadding_uWRP4_2() throws Exception {
    BCodec bCodec = new BCodec(StandardCharsets.UTF_8, CodecPolicy.LENIENT);
    byte[] bytes = new byte[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12 };
    byte[] result = bCodec.doDecoding(bytes);
    assertEquals(1, result[0]);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testDoDecoding_withChunkSeparatorAndPadding_uWRP4_3() throws Exception {
    BCodec bCodec = new BCodec(StandardCharsets.UTF_8, CodecPolicy.LENIENT);
    byte[] bytes = new byte[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12 };
    byte[] result = bCodec.doDecoding(bytes);
    assertEquals(2, result[1]);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testDoDecoding_withChunkSeparatorAndPadding_uWRP4_4() throws Exception {
    BCodec bCodec = new BCodec(StandardCharsets.UTF_8, CodecPolicy.LENIENT);
    byte[] bytes = new byte[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12 };
    byte[] result = bCodec.doDecoding(bytes);
    assertEquals(3, result[2]);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testDoDecoding_withChunkSeparatorAndPadding_uWRP4_5() throws Exception {
    BCodec bCodec = new BCodec(StandardCharsets.UTF_8, CodecPolicy.LENIENT);
    byte[] bytes = new byte[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12 };
    byte[] result = bCodec.doDecoding(bytes);
    assertEquals(4, result[3]);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testDoDecoding_withChunkSeparatorAndPadding_uWRP4_6() throws Exception {
    BCodec bCodec = new BCodec(StandardCharsets.UTF_8, CodecPolicy.LENIENT);
    byte[] bytes = new byte[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12 };
    byte[] result = bCodec.doDecoding(bytes);
    assertEquals(5, result[4]);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testDoDecoding_withChunkSeparatorAndPadding_uWRP4_7() throws Exception {
    BCodec bCodec = new BCodec(StandardCharsets.UTF_8, CodecPolicy.LENIENT);
    byte[] bytes = new byte[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12 };
    byte[] result = bCodec.doDecoding(bytes);
    assertEquals(6, result[5]);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testDoDecoding_withChunkSeparatorAndPadding_uWRP4_8() throws Exception {
    BCodec bCodec = new BCodec(StandardCharsets.UTF_8, CodecPolicy.LENIENT);
    byte[] bytes = new byte[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12 };
    byte[] result = bCodec.doDecoding(bytes);
    assertEquals(7, result[6]);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testDoDecoding_withChunkSeparatorAndPadding_uWRP4_9() throws Exception {
    BCodec bCodec = new BCodec(StandardCharsets.UTF_8, CodecPolicy.LENIENT);
    byte[] bytes = new byte[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12 };
    byte[] result = bCodec.doDecoding(bytes);
    assertEquals(8, result[7]);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testDoDecoding_withChunkSeparatorAndPadding_uWRP4_10() throws Exception {
    BCodec bCodec = new BCodec(StandardCharsets.UTF_8, CodecPolicy.LENIENT);
    byte[] bytes = new byte[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12 };
    byte[] result = bCodec.doDecoding(bytes);
    assertEquals(9, result[8]);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testDoDecoding_withChunkSeparatorAndPadding_uWRP4_11() throws Exception {
    BCodec bCodec = new BCodec(StandardCharsets.UTF_8, CodecPolicy.LENIENT);
    byte[] bytes = new byte[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12 };
    byte[] result = bCodec.doDecoding(bytes);
    assertEquals(10, result[9]);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testDoDecoding_withChunkSeparatorAndPadding_uWRP4_12() throws Exception {
    BCodec bCodec = new BCodec(StandardCharsets.UTF_8, CodecPolicy.LENIENT);
    byte[] bytes = new byte[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12 };
    byte[] result = bCodec.doDecoding(bytes);
    assertEquals(11, result[10]);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testDoDecoding_withChunkSeparatorAndPadding_uWRP4_13() throws Exception {
    BCodec bCodec = new BCodec(StandardCharsets.UTF_8, CodecPolicy.LENIENT);
    byte[] bytes = new byte[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12 };
    byte[] result = bCodec.doDecoding(bytes);
    assertEquals(12, result[11]);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testEncode_strSourceNull_JSRQ0() throws Exception {
    BCodec bCodec = new BCodec();
    String strSource = null;
    Charset sourceCharset = StandardCharsets.UTF_8;
    String expected = "";
    String actual = bCodec.encode(strSource, sourceCharset);
    assertEquals(expected, actual);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testEncode_sourceCharsetNull_sdHE1() throws Exception {
    BCodec bCodec = new BCodec();
    String strSource = "Hello, World!";
    Charset sourceCharset = null;
    String expected = "Hello, World!";
    String actual = bCodec.encode(strSource, sourceCharset);
    assertEquals(expected, actual);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testEncode_strSourceEmpty_xMbM2() throws Exception {
    BCodec bCodec = new BCodec();
    String strSource = "";
    Charset sourceCharset = StandardCharsets.UTF_8;
    String expected = "";
    String actual = bCodec.encode(strSource, sourceCharset);
    assertEquals(expected, actual);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testEncode_sourceCharsetEmpty_ezDv3() throws Exception {
    BCodec bCodec = new BCodec();
    String strSource = "Hello, World!";
    Charset sourceCharset = Charset.forName("");
    String expected = "Hello, World!";
    String actual = bCodec.encode(strSource, sourceCharset);
    assertEquals(expected, actual);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testEncode_strSourceNonEmpty_ncjW4() throws Exception {
    BCodec bCodec = new BCodec();
    String strSource = "Hello, World!";
    Charset sourceCharset = StandardCharsets.UTF_8;
    String expected = "SGVsbG8sIFdvcmxkIQ==";
    String actual = bCodec.encode(strSource, sourceCharset);
    assertEquals(expected, actual);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testEncode_sourceCharsetNonEmpty_wwRp5() throws Exception {
    BCodec bCodec = new BCodec();
    String strSource = "Hello, World!";
    Charset sourceCharset = Charset.forName("UTF-16");
    String expected = "SGVsbG8sIFdvcmxkIQ==";
    String actual = bCodec.encode(strSource, sourceCharset);
    assertEquals(expected, actual);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testEncode_strSource_STRICT_IalC0() throws EncoderException {
    BCodec bCodec = new BCodec(StandardCharsets.UTF_8, CodecPolicy.STRICT);
    String strSource = "Hello, World!";
    String expected = "SGVsbG8sIFdvcmxkIQ==";
    String actual = bCodec.encode(strSource);
    assertEquals(expected, actual);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testEncode_strSource_LENIENT_Chsu1() throws EncoderException {
    BCodec bCodec = new BCodec(StandardCharsets.UTF_8, CodecPolicy.LENIENT);
    String strSource = "Hello, World!";
    String expected = "SGVsbG8sIFdvcmxkIQ==";
    String actual = bCodec.encode(strSource);
    assertEquals(expected, actual);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testEncode_strSource_null_VtCB2() throws EncoderException {
    BCodec bCodec = new BCodec(StandardCharsets.UTF_8, CodecPolicy.STRICT);
    String strSource = null;
    String expected = null;
    String actual = bCodec.encode(strSource);
    assertEquals(expected, actual);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testEncode_strSource_empty_YqnJ3() throws EncoderException {
    BCodec bCodec = new BCodec(StandardCharsets.UTF_8, CodecPolicy.STRICT);
    String strSource = "";
    String expected = "";
    String actual = bCodec.encode(strSource);
    assertEquals(expected, actual);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testEncode_strSource_invalidCharset_RSLf4() throws EncoderException {
    BCodec bCodec = new BCodec(StandardCharsets.UTF_8, CodecPolicy.STRICT);
    String strSource = "Hello, World!";
    String expected = "SGVsbG8sIFdvcmxkIQ==";
    String actual = bCodec.encode(strSource, StandardCharsets.US_ASCII);
    assertEquals(expected, actual);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testEncode_strSource_nullCharset_Nxdz7() throws EncoderException {
    BCodec bCodec = new BCodec(StandardCharsets.UTF_8, CodecPolicy.STRICT);
    String strSource = "Hello, World!";
    String expected = "SGVsbG8sIFdvcmxkIQ==";
    String actual = bCodec.encode(strSource, (Charset) null);
    assertEquals(expected, actual);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testEncode_strSource_sourceCharset_STRICT_zoZV0() throws EncoderException {
    BCodec bCodec = new BCodec(StandardCharsets.UTF_8, CodecPolicy.STRICT);
    String strSource = "Hello, World!";
    String sourceCharset = "UTF-8";
    String expected = "SGVsbG8sIFdvcmxkIQ==";
    String actual = bCodec.encode(strSource, sourceCharset);
    assertEquals(expected, actual);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testEncode_strSource_sourceCharset_LENIENT_EJil1() throws EncoderException {
    BCodec bCodec = new BCodec(StandardCharsets.UTF_8, CodecPolicy.LENIENT);
    String strSource = "Hello, World!";
    String sourceCharset = "UTF-8";
    String expected = "SGVsbG8sIFdvcmxkIQ==";
    String actual = bCodec.encode(strSource, sourceCharset);
    assertEquals(expected, actual);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testEncode_strSource_sourceCharset_null_bOsu2() throws EncoderException {
    BCodec bCodec = new BCodec(StandardCharsets.UTF_8, CodecPolicy.STRICT);
    String strSource = null;
    String sourceCharset = "UTF-8";
    String expected = null;
    String actual = bCodec.encode(strSource, sourceCharset);
    assertEquals(expected, actual);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testEncode_strSource_sourceCharset_empty_Icyt3() throws EncoderException {
    BCodec bCodec = new BCodec(StandardCharsets.UTF_8, CodecPolicy.STRICT);
    String strSource = "";
    String sourceCharset = "UTF-8";
    String expected = "";
    String actual = bCodec.encode(strSource, sourceCharset);
    assertEquals(expected, actual);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testEncode_strSource_sourceCharset_invalidCharset_oPvq4() throws EncoderException {
    BCodec bCodec = new BCodec(StandardCharsets.UTF_8, CodecPolicy.STRICT);
    String strSource = "Hello, World!";
    String sourceCharset = "invalid_charset";
    String expected = "SGVsbG8sIFdvcmxkIQ==";
    String actual = bCodec.encode(strSource, sourceCharset);
    assertEquals(expected, actual);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testEncode_strSource_sourceCharset_invalidSourceCharset_AZoa5() throws EncoderException {
    BCodec bCodec = new BCodec(StandardCharsets.UTF_8, CodecPolicy.STRICT);
    String strSource = "Hello, World!";
    String sourceCharset = "UTF-16";
    String expected = "SGVsbG8sIFdvcmxkIQ==";
    String actual = bCodec.encode(strSource, sourceCharset);
    assertEquals(expected, actual);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testEncode_strSource_sourceCharset_invalidSourceCharset_LENIENT_zicK6() throws EncoderException {
    BCodec bCodec = new BCodec(StandardCharsets.UTF_8, CodecPolicy.LENIENT);
    String strSource = "Hello, World!";
    String sourceCharset = "UTF-16";
    String expected = "SGVsbG8sIFdvcmxkIQ==";
    String actual = bCodec.encode(strSource, sourceCharset);
    assertEquals(expected, actual);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testEncode_strSource_sourceCharset_invalidSourceCharset_STRICT_zaHv7() throws EncoderException {
    BCodec bCodec = new BCodec(StandardCharsets.UTF_8, CodecPolicy.STRICT);
    String strSource = "Hello, World!";
    String sourceCharset = "UTF-16";
    String expected = "SGVsbG8sIFdvcmxkIQ==";
}
}