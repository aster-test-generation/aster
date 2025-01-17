/**
 * Generated by Aster
 */
package org.apache.commons.codec.net;
import java.io.UnsupportedEncodingException;
import java.util.BitSet;
import org.apache.commons.codec.DecoderException;
import static org.junit.jupiter.api.Assertions.*;
import java.util.BitSet;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_URLCodec_Test_Passing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testDecode_cyWU0() throws DecoderException, UnsupportedEncodingException {
    URLCodec urlCodec = new URLCodec();
    String result = urlCodec.decode("Hello%20World", "UTF-8");
    assert "Hello World".equals(result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testDecodeNull_bAUQ1() throws DecoderException, UnsupportedEncodingException {
    URLCodec urlCodec = new URLCodec("UTF-8");
    String result = urlCodec.decode(null, "UTF-8");
    assert result == null;
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetDefaultCharset_withCharset_pwIO0() {
    URLCodec urlCodec = new URLCodec("UTF-8");
    assertEquals("UTF-8", urlCodec.getDefaultCharset());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetDefaultCharset_withoutCharset_mswW1() {
    URLCodec urlCodec = new URLCodec();
    assertEquals("UTF-8", urlCodec.getDefaultCharset());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetEncoding_withCharset_DdWU0() {
    URLCodec urlCodec = new URLCodec("UTF-8");
    assertEquals("UTF-8", urlCodec.getEncoding());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetEncoding_withoutCharset_KZyk1() {
    URLCodec urlCodec = new URLCodec();
    assertEquals("UTF-8", urlCodec.getEncoding());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testDecode_RLYY0() throws DecoderException {
    URLCodec urlCodec = new URLCodec("UTF-8");
    byte[] bytes = "Hello%20World".getBytes();
    byte[] result = urlCodec.decode(bytes);
    assertArrayEquals("Hello World".getBytes(), result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testEncode_FZcb0_1() throws UnsupportedEncodingException {
    URLCodec urlCodec = new URLCodec("UTF-8");
    String result = urlCodec.encode("Hello World", "UTF-8");
    assertNotNull(result);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testEncode_FZcb0_2() throws UnsupportedEncodingException {
    URLCodec urlCodec = new URLCodec("UTF-8");
    String result = urlCodec.encode("Hello World", "UTF-8");
    assertEquals("Hello+World", result);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testEncodeNull_lTdo1() throws UnsupportedEncodingException {
    URLCodec urlCodec = new URLCodec();
    String result = urlCodec.encode(null, "UTF-8");
    assertNull(result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testEncodeByteArray_bLlq1() {
    URLCodec urlCodec = new URLCodec("UTF-8");
    byte[] bytes = "Hello World".getBytes();
    Object result = urlCodec.encode(bytes);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testEncodeUrlNullBytes_CyBz0() {
    byte[] result = URLCodec.encodeUrl(null, null);
    assertNull(result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testEncodeUrlNullUrlSafe_rWwd1() {
    URLCodec urlCodec = new URLCodec();
    BitSet urlsafe = null;
    byte[] bytes = "Hello World".getBytes();
    byte[] result = URLCodec.encodeUrl(urlsafe, bytes);
    assertNotNull(result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testEncodeUrlUrlSafe_RyuA3() {
    BitSet urlsafe = new BitSet();
    urlsafe.set('a');
    byte[] bytes = "a".getBytes();
    byte[] result = URLCodec.encodeUrl(urlsafe, bytes);
    assertArrayEquals("a".getBytes(), result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testEncodeUrlNotUrlSafe_cfUK4() {
    BitSet urlsafe = new BitSet();
    byte[] bytes = "a".getBytes();
    byte[] result = URLCodec.encodeUrl(urlsafe, bytes);
    assertArrayEquals("%61".getBytes(), result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testEncodeUrlEmptyBytes_csag5() {
    BitSet urlsafe = new BitSet();
    byte[] bytes = new byte[0];
    byte[] result = URLCodec.encodeUrl(urlsafe, bytes);
    assertArrayEquals(new byte[0], result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testEncodeUrlNullCharset_SIWB6() {
    URLCodec urlCodec = new URLCodec();
    BitSet urlsafe = new BitSet();
    byte[] bytes = "Hello World".getBytes();
    byte[] result = URLCodec.encodeUrl(urlsafe, bytes);
    assertNotNull(result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testDecodeByteArray_sVaV1_EKPr0() {
    URLCodec codec = new URLCodec("UTF-8");
    byte[] bytes = "Hello%20World".getBytes();
    try {
        byte[] result = codec.decode(bytes);
        assertEquals("Hello World", new String(result));
    } catch (DecoderException e) {
        fail("DecoderException should not be thrown");
    }
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testEncodeNull_STgB0_sHkM0() {
    URLCodec urlCodec = new URLCodec();
    BitSet urlsafe = null;
    byte[] bytes = null;
    byte[] result = URLCodec.encodeUrl(urlsafe, bytes);
    assertNull(result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testDecode_KFkv0_wRRv0() {
    URLCodec urlCodec = new URLCodec();
    try {
        String result = urlCodec.decode("Hello%20World");
        assertEquals("Hello World", result);
    } catch (DecoderException e) {
        fail("DecoderException was thrown");
    }
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testDecode_KFkv0_hmhM1() throws DecoderException {
    URLCodec urlCodec = new URLCodec();
    String result = urlCodec.decode("Hello%20World");
    assertEquals("Hello World", result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testDecodeUrlPlus_LjVl1_IFiE0() {
    URLCodec urlCodec = new URLCodec();
    byte[] bytes = "+".getBytes();
    try {
        byte[] result = URLCodec.decodeUrl(bytes);
        assertArrayEquals(" ".getBytes(), result);
    } catch (DecoderException e) {
        fail("DecoderException was thrown");
    }
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testDecodeUrlNormalChar_BQPU3_FCkA0() {
    URLCodec urlCodec = new URLCodec();
    byte[] bytes = "abc".getBytes();
    try {
        byte[] result = URLCodec.encodeUrl(null, bytes);
        assertArrayEquals("abc".getBytes(), result);
    } catch (Exception e) {
        fail("Exception should not be thrown");
    }
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testEncode_VTUd0_gZhb0() {
    URLCodec urlCodec = new URLCodec();
    byte[] bytes = "https://www.example.com".getBytes();
    byte[] result = URLCodec.encodeUrl(null, bytes);
    assertNotNull(result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testDecodeString_KXQF2_RiMy0() {
    URLCodec codec = new URLCodec();
    try {
        String result = (String) codec.decode("Hello%20World");
        assertEquals("Hello World", result);
    } catch (DecoderException e) {
        fail("DecoderException should not be thrown");
    }
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testDecodeUrlNull_RPhu0_FBRU1() throws DecoderException {
    byte[] result = URLCodec.decodeUrl(null);
    assertNull(result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testEncode_FZcb0() throws UnsupportedEncodingException {
    URLCodec urlCodec = new URLCodec("UTF-8");
    String result = urlCodec.encode("Hello World", "UTF-8");
    assertNotNull(result);
    assertEquals("Hello+World", result);
}
}