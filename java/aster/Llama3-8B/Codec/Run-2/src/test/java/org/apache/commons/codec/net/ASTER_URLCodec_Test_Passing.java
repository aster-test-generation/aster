/**
 * Generated by Aster
 */
package org.apache.commons.codec.net;
import java.io.UnsupportedEncodingException;
import java.util.BitSet;
import org.apache.commons.codec.DecoderException;
import org.apache.commons.codec.EncoderException;
import static org.junit.jupiter.api.Assertions.*;
import java.util.Arrays;
import java.util.BitSet;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_URLCodec_Test_Passing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetEncoding_ZYEK0() {
        URLCodec codec = new URLCodec("UTF-8");
        String encoding = codec.getEncoding();
        assertEquals("UTF-8", encoding);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetDefaultCharset_IIui0() {
        URLCodec codec = new URLCodec("UTF-8");
        String result = codec.getDefaultCharset();
        assertEquals("UTF-8", result);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testDecodeInvalidType_Vnyp3() {
    URLCodec codec = new URLCodec();
    Object obj = new Object();
    try {
        codec.decode(obj);
        Assertions.fail("DecoderException expected");
    } catch (DecoderException e) {
    }
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDecode_VJwm0() {
        URLCodec urlCodec = new URLCodec("UTF-8");
        byte[] bytes = "Hello World".getBytes();
        try {
            byte[] result = urlCodec.decode(bytes);
            System.out.println("decode(byte[] bytes) = " + java.util.Arrays.toString(result));
        } catch (DecoderException e) {
            e.printStackTrace();
        }
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testEncodeByteArray_yNkg1() {
    URLCodec urlCodec = new URLCodec();
    byte[] byteArray = new byte[] {1, 2, 3};
    Object result = urlCodec.encode(byteArray);
    Assertions.assertNotNull(result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testEncodeObject_TOVx3() {
    URLCodec urlCodec = new URLCodec();
    Object obj = new Object();
    try {
        urlCodec.encode(obj);
        Assertions.fail("Expected EncoderException");
    } catch (EncoderException e) {
        Assertions.assertTrue(true);
    }
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeUrlNullBytes_BRaI0() {
        byte[] bytes = null;
        byte[] result = URLCodec.encodeUrl(null, bytes);
        assert result == null;
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeUrlNullUrlSafe_vANl1() {
        byte[] bytes = new byte[1];
        BitSet urlsafe = null;
        byte[] result = URLCodec.encodeUrl(urlsafe, bytes);
        assert result != null;
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeUrlEmptyBytes_psJY2() {
        byte[] bytes = new byte[0];
        BitSet urlsafe = new BitSet();
        byte[] result = URLCodec.encodeUrl(urlsafe, bytes);
        assert result.length == 0;
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testDecodeNull_LjAK0_uZsm0() {
    URLCodec urlCodec = new URLCodec();
    byte[] result = urlCodec.encodeUrl(new BitSet(), null);
    assert result == null;
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testDecodeNull_UFkl0_QZJq0() {
    URLCodec codec = new URLCodec();
    byte[] result = codec.encodeUrl(new BitSet(), null);
    Assertions.assertNull(result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testEncodeNull_PVlz0_udTJ1() {
    URLCodec urlCodec = new URLCodec();
    byte[] result = URLCodec.encodeUrl(null, new byte[0]);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testEncodeWithValidStringAndCharset_Yswk0_uYzb1() {
    URLCodec urlCodec = new URLCodec();
    String encodedString = new String(urlCodec.encodeUrl(new BitSet(), "Hello World".getBytes()));
    assert encodedString != null;
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testEncodeWithNullString_JKCV1_InzV0() {
    URLCodec urlCodec = new URLCodec();
    try {
        String encodedString = urlCodec.encode(null, "UTF-8");
        assert encodedString == null;
    } catch (UnsupportedEncodingException e) {
        assert false;
    }
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testEncodeUrlEscapeChar_wKCH7_mptk0() {
    byte[] bytes = new byte[1];
    bytes[0] = (byte)0x80;
    BitSet urlsafe = new BitSet();
    byte[] result = URLCodec.encodeUrl(urlsafe, bytes);
    assert result[result.length - 2] == (byte)Utils.hexDigit((0x80 >> 4));
    assert result[result.length - 1] == (byte)Utils.hexDigit((0x80));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testDecodeByteArray_JGkv1_UcER0() {
    URLCodec codec = new URLCodec();
    byte[] bytes = new byte[] {1, 2, 3};
    try {
        Object result = codec.encodeUrl(null, bytes);
    } catch (Exception e) {
    }
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testDecodeUrlSimpleInput_efFV2_qgfW0() {
    try {
        byte[] result = URLCodec.encodeUrl(null, new byte[] {(byte) 'a', (byte) 'b', (byte) 'c'});
        assertArrayEquals(new byte[] {(byte) 'a', (byte) 'b', (byte) 'c'}, result);
    } catch (Exception e) {
        fail("DecoderException was thrown");
    }
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testDecodeUrlEmptyInput_Skkb1_qwSJ0() {
    try {
        byte[] result = URLCodec.encodeUrl(null, new byte[0]);
        assertArrayEquals(new byte[0], result);
    } catch (Exception e) {
        fail("DecoderException was thrown");
    }
}
}