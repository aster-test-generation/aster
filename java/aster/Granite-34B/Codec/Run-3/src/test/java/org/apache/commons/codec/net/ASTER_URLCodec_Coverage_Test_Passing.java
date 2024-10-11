/**
 * Generated by Aster
 */
package org.apache.commons.codec.net;
import java.io.UnsupportedEncodingException;
import java.util.BitSet;
import org.apache.commons.codec.DecoderException;
import org.apache.commons.codec.EncoderException;
import static org.junit.jupiter.api.Assertions.*;
import java.util.BitSet;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_URLCodec_Coverage_Test_Passing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testDecodeWithStrNull_vIAB0() throws DecoderException, UnsupportedEncodingException {
		URLCodec urlCodec = new URLCodec();
		String actual = urlCodec.decode(null, "UTF-8");
		Assertions.assertNull(actual);
	}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testDecodeWithStrNotNull_WWeQ1() throws DecoderException, UnsupportedEncodingException {
		URLCodec urlCodec = new URLCodec();
		String actual = urlCodec.decode("test", "UTF-8");
		Assertions.assertNotNull(actual);
	}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeWithEmpty_TzGi2() throws EncoderException {
        URLCodec codec = new URLCodec();
        assertEquals("", codec.encode(""));
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeWithDefaultCharset_kZRZ3() throws EncoderException {
        URLCodec codec = new URLCodec();
        assertEquals("test", codec.encode("test"));
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDecodeWithUnsupportedEncoding_bxIN1() throws DecoderException {
        URLCodec urlCodec = new URLCodec();
        String str = "hello";
        try {
            urlCodec.decode(str, "unsupported-encoding");
            fail("DecoderException expected");
        } catch (UnsupportedEncodingException e) {
            assertEquals("unsupported-encoding", e.getMessage());
        }
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDecodeWithEmptycharset_XFWN2() throws DecoderException {
        URLCodec urlCodec = new URLCodec();
        String str = "hello";
        try {
            urlCodec.decode(str, "");
            fail("DecoderException expected");
        } catch (UnsupportedEncodingException e) {
            assertEquals("", e.getMessage());
        }
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void encodeUrl_null_bytes_mXAw0() throws Exception {
	byte[] bytes = null;
	byte[] actual = URLCodec.encodeUrl(null, bytes);
	byte[] expected = null;
	assertEquals(expected, actual);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void decode_obj_is_null_DCQf0_pAXN0() throws org.apache.commons.codec.DecoderException{
	URLCodec codec = new URLCodec();
	Object obj = null;
	Object expected = null;
	Object actual = codec.decode(obj);
	Assertions.assertEquals(expected, actual);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void decode_obj_is_string_nwqF2_ygSO0() throws org.apache.commons.codec.DecoderException{
	URLCodec codec = new URLCodec();
	String obj = "Hello";
	Object expected =new URLCodec().decode(obj);
	Object actual = codec.decode(obj);
	Assertions.assertEquals(expected, actual);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void decode_obj_is_not_null_string_lAKc4_kTUV0() throws org.apache.commons.codec.DecoderException{
	URLCodec codec = new URLCodec();
	String obj = null;
	Object expected = null;
	Object actual = codec.decode(obj);
	assertEquals(expected, actual);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDecodeWithValidInput_TpnT3_cjRE0() throws DecoderException, UnsupportedEncodingException {
        URLCodec urlCodec = new URLCodec();
        String str = "hello";
        String decodedString = urlCodec.decode(str, "UTF-8");
        assertEquals("hello", decodedString);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testEncodeByteArray_NObR0_fid2() throws org.apache.commons.codec.EncoderException {
		URLCodec urlCodec = new URLCodec();
		byte[] bytes = new byte[] { 0, 1, 2, 3 };
	}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testEncodeString_cpWl1_fid2() throws org.apache.commons.codec.EncoderException {
		URLCodec urlCodec = new URLCodec();
	}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void decode_obj_is_not_instance_of_byte_array_or_string_vXLX5_fid2() throws org.apache.commons.codec.DecoderException{
	URLCodec codec = new URLCodec();
	Object obj = 123;
	try {
		Object actual = codec.decode(obj);
	} catch (DecoderException e) {
	}
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void encodeUrl_negative_byte_bKFq2_ewmQ0_fid2() throws Exception {
	BitSet urlsafe = new BitSet();
	byte[] bytes = new byte[] { -1, 2, 3 };
	byte[] actual = URLCodec.encodeUrl(urlsafe, bytes);
	byte[] expected = new byte[] { (byte) 255, 2, 3 };
}
}