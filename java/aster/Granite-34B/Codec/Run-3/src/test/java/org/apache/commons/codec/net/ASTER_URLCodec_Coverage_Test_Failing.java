/**
 * Generated by Aster
 */
package org.apache.commons.codec.net;
import java.util.BitSet;
import org.apache.commons.codec.DecoderException;
import org.apache.commons.codec.EncoderException;
import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.BitSet;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_URLCodec_Coverage_Test_Failing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeWithUnsupportedEncoding_Hapv1() throws EncoderException {
        URLCodec codec = new URLCodec("random");
        assertEquals(null, codec.encode("random"));
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testEncodeByteArray_NObR0() throws org.apache.commons.codec.EncoderException {
		URLCodec urlCodec = new URLCodec();
		byte[] bytes = new byte[] { 0, 1, 2, 3 };
		assertEquals("00010203", urlCodec.encode(bytes));
	}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testEncodeString_cpWl1() throws org.apache.commons.codec.EncoderException {
		URLCodec urlCodec = new URLCodec();
		assertEquals("Hello%20World", urlCodec.encode("Hello World"));
	}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void encodeUrl_null_urlsafe_kUii1() {
	BitSet urlsafe = null;
	byte[] bytes = new byte[] { 1, 2, 3 };
	byte[] actual = URLCodec.encodeUrl(urlsafe, bytes);
	byte[] expected = new byte[] { 1, 2, 3 };
	assertEquals(expected, actual);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void decode_obj_is_not_instance_of_byte_array_or_string_vXLX5() throws org.apache.commons.codec.DecoderException{
	URLCodec codec = new URLCodec();
	Object obj = 123;
	try {
		Object actual = codec.decode(obj);
	} catch (DecoderException e) {
		assertEquals("Exception message mismatch","Objects of type java.lang.Integer cannot be URL decoded",e.getMessage());
	}
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void encodeUrl_negative_byte_bKFq2_ewmQ0() {
	BitSet urlsafe = new BitSet();
	byte[] bytes = new byte[] { -1, 2, 3 };
	byte[] actual = URLCodec.encodeUrl(urlsafe, bytes);
	byte[] expected = new byte[] { (byte) 255, 2, 3 };
	assertEquals(expected, actual);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void decode_obj_is_byte_array_CObH1_qnaX0() throws org.apache.commons.codec.DecoderException{
	URLCodec codec = new URLCodec();
	byte[] obj = {1,2,3};
	Object expected =new URLCodec().decode(obj);
	Object actual = codec.decode(obj);
	Assertions.assertEquals(expected,actual);
}
}