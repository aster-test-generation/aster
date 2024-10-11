/**
 * Generated by Aster
 */
package org.apache.commons.codec.net;
import org.apache.commons.codec.DecoderException;
import org.apache.commons.codec.EncoderException;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_PercentCodec_Coverage_Test_Passing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testNullInput_McnV0() throws org.apache.commons.codec.DecoderException {
        PercentCodec codec = new PercentCodec(new byte[0], false);
        Object result = codec.decode(null);
        assertNull(result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testNonByteArrayInput_BABN1() throws org.apache.commons.codec.DecoderException {
        PercentCodec codec = new PercentCodec(new byte[0], false);
        try {
            codec.decode("test");
            fail("Expected DecoderException");
        } catch (DecoderException e) {
        }
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeNull_PIFZ0() throws org.apache.commons.codec.EncoderException {
        PercentCodec percentCodec = new PercentCodec(new byte[0], false);
        Object result = percentCodec.encode(null);
        assertNull(result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeByteArray_fVUd2() throws org.apache.commons.codec.EncoderException {
        PercentCodec percentCodec = new PercentCodec(new byte[0], false);
        byte[] byteArray = new byte[] {1, 2, 3};
        Object result = percentCodec.encode(byteArray);
        assertNotNull(result);
}

@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeWithUnencodedBytes_YXBI0() throws org.apache.commons.codec.EncoderException {
        PercentCodec codec = new PercentCodec();
        byte[] bytes = "Hello World".getBytes();
        byte[] result = codec.encode(bytes);
        assertArrayEquals(bytes, result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeWithEncodedBytes_qFQw1() throws org.apache.commons.codec.EncoderException {
        PercentCodec codec = new PercentCodec();
        byte[] bytes = "Hello World!".getBytes();
        byte[] result = codec.encode(bytes);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeNullInput_akke0() throws org.apache.commons.codec.EncoderException {
        PercentCodec codec = new PercentCodec();
        byte[] result = codec.encode(null);
        assertArrayEquals(null, result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeEmptyInput_fkvf1() throws org.apache.commons.codec.EncoderException {
        PercentCodec codec = new PercentCodec();
        byte[] result = codec.encode(new byte[0]);
        assertArrayEquals(new byte[0], result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeNonSpaceInput_pdrM2() throws org.apache.commons.codec.EncoderException {
        PercentCodec codec = new PercentCodec();
        byte[] input = "hello".getBytes();
        byte[] result = codec.encode(input);
        assertArrayEquals(input, result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeSpaceInput_sCiU3_1() throws org.apache.commons.codec.EncoderException {
        PercentCodec codec = new PercentCodec();
        byte[] input = "hello world".getBytes();
        byte[] result = codec.encode(input);
        for (byte b : result) {
            if (b == ' ') {
                break;
            }
        }
        assertFalse(result.length > input.length);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeSpaceInput_sCiU3_3() throws org.apache.commons.codec.EncoderException {
        PercentCodec codec = new PercentCodec();
        byte[] input = "hello world".getBytes();
        byte[] result = codec.encode(input);
        for (byte b : result) {
            if (b == ' ') {
                break;
            }
        }
                assertFalse(result[result.length - 1] == '2');}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDecodeWithEscapeCharAndTwoDigits_maOu1() throws org.apache.commons.codec.DecoderException {
        PercentCodec codec = new PercentCodec(new byte[] { '%' }, true);
        byte[] bytes = codec.decode(new byte[] { (byte) '%', (byte) '1', (byte) '2' });
        byte[] expected = new byte[] { (byte) 0x12 };
        assertArrayEquals(expected, bytes);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDecodeWithPlusForSpace_uDxk3() throws org.apache.commons.codec.DecoderException {
        PercentCodec codec = new PercentCodec(new byte[] { '%' }, true);
        byte[] bytes = codec.decode(new byte[] { (byte) '+' });
        byte[] expected = new byte[] { (byte) ' ' };
        assertArrayEquals(expected, bytes);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDecodeWithNonEscapeChar_XBda4() throws org.apache.commons.codec.DecoderException {
        PercentCodec codec = new PercentCodec(new byte[] { '%' }, true);
        byte[] bytes = codec.decode(new byte[] { (byte) 'a' });
        byte[] expected = new byte[] { (byte) 'a' };
        assertArrayEquals(expected, bytes);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDecodeWithNullInput_ESQW5() throws org.apache.commons.codec.DecoderException {
        PercentCodec codec = new PercentCodec(new byte[] { '%' }, true);
        byte[] bytes = codec.decode(null);
        byte[] expected = null;
        assertArrayEquals(expected, bytes);
    }
}