/**
 * Generated by Aster
 */
package org.apache.commons.codec.net;
import java.nio.charset.Charset;
import java.nio.charset.UnsupportedCharsetException;
import org.apache.commons.codec.DecoderException;
import org.apache.commons.codec.EncoderException;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.mockito.Mockito.when;
import static org.mockito.Mockito.when;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_QCodec_Coverage_Test_Passing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDoDecodingWithNull_GPfw0() throws org.apache.commons.codec.DecoderException {
        QCodec qCodec = new QCodec();
        byte[] bytes = null;
        assert qCodec.doDecoding(bytes) == null;
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDoDecodingWithNoUnderscores_YSKu1() throws org.apache.commons.codec.DecoderException {
        QCodec qCodec = new QCodec();
        byte[] bytes = "test".getBytes();
        assert qCodec.doDecoding(bytes).equals(QuotedPrintableCodec.decodeQuotedPrintable(bytes));
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDecodeWithNull_zgtu0() throws org.apache.commons.codec.DecoderException {
        QCodec qCodec = new QCodec();
        Object actual = qCodec.decode(null);
        Object expected = null;
        assert actual == expected;
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDecodeWithString_UMTU1() throws org.apache.commons.codec.DecoderException {
        QCodec qCodec = new QCodec();
        Object actual = qCodec.decode("test");
        Object expected = "test";
        assert actual.equals(expected);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDecodeWithNonStringObject_vESC2() throws org.apache.commons.codec.DecoderException {
        QCodec qCodec = new QCodec();
        Object actual = qCodec.decode(new Object());
        Object expected = null;
        assert actual == expected;
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDecodeWithInvalidString_tVnx3() throws org.apache.commons.codec.DecoderException {
        QCodec qCodec = new QCodec();
        Object actual = qCodec.decode("test$");
        Object expected = null;
        assert actual == expected;
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDecodeWithEmptyObject_UrfP4() throws org.apache.commons.codec.DecoderException {
        QCodec qCodec = new QCodec();
        Object actual = qCodec.decode("");
        Object expected = null;
        assert actual == expected;
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void encode_null_kysf0() throws EncoderException {
    QCodec qCodec = new QCodec();
    Object actual = qCodec.encode(null);
    Object expected = null;
    assertEquals(expected, actual);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void encode_string_KtYp1() throws EncoderException {
    QCodec qCodec = new QCodec();
    Object actual = qCodec.encode("hello");
    Object expected = "hello";
    assertEquals(expected, actual);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void encode_object_dkrh2() throws EncoderException {
    QCodec qCodec = new QCodec();
    Object obj = new Object();
    try {
        qCodec.encode(obj);
        fail("Expected EncoderException");
    } catch (EncoderException e) {
        assertEquals("Objects of type " + obj.getClass().getName() + " cannot be encoded using Q codec", e.getMessage());
    }
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void encode_charset_sUGw3() throws EncoderException {
    QCodec qCodec = new QCodec(Charset.defaultCharset());
    Object actual = qCodec.encode("hello");
    Object expected = "hello";
    assertEquals(expected, actual);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void encode_charsetName_ZDgg4() throws EncoderException {
    QCodec qCodec = new QCodec("UTF-8");
    Object actual = qCodec.encode("hello");
    Object expected = "hello";
    assertEquals(expected, actual);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void encode_UnsupportedCharsetException_null_hZbQ1() throws org.apache.commons.codec.EncoderException {
    QCodec qCodec = new QCodec();
    String sourceStr = "test";
    String sourceCharset = "test";
    UnsupportedCharsetException unsupportedCharsetException = new UnsupportedCharsetException("test");
    when(qCodec.encode(sourceStr, sourceCharset)).thenThrow(unsupportedCharsetException);
    try {
        qCodec.encode(sourceStr, sourceCharset);
        fail("Expected exception: EncoderException");
    } catch (EncoderException e) {
        assertEquals(unsupportedCharsetException.getMessage(), e.getMessage());
        assertEquals(unsupportedCharsetException, e.getCause());
    }
}
}