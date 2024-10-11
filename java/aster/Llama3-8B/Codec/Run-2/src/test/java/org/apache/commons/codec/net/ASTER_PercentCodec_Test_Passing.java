/**
 * Generated by Aster
 */
package org.apache.commons.codec.net;
import org.apache.commons.codec.DecoderException;
import org.apache.commons.codec.EncoderException;
import static org.junit.jupiter.api.Assertions.*;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_PercentCodec_Test_Passing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeObject_qWbW2() {
        PercentCodec codec = new PercentCodec();
        Object obj = new Object();
        try {
            codec.encode(obj);
            fail("Expected EncoderException");
        } catch (EncoderException e) {
        }
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDecodeNonByteArray_TkOX2() {
        PercentCodec codec = new PercentCodec();
        Object obj = new Object();
        try {
            codec.decode(obj);
            fail("Expected DecoderException");
        } catch (DecoderException e) {
        }
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testDecodeNull_DEkx0() {
    PercentCodec codec = new PercentCodec();
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testEncodeByteArray_EMOv1_nrEC0() {
    byte[] bytes = new byte[] {1, 2, 3};
    PercentCodec codec = new PercentCodec();
    try {
        byte[] result = codec.encode(bytes);
    } catch (EncoderException e) {
        fail("EncoderException was expected");
    }
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testDecodeNull_fejh0_mgSU0() {
    PercentCodec codec = new PercentCodec();
    byte[] obj = null;
    try {
        byte[] result = codec.decode(obj);
        assertEquals(null, result);
    } catch (DecoderException e) {
        fail("DecoderException was expected");
    }
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testEncodeNull_CfIV0_AYtW0() {
    PercentCodec codec = new PercentCodec();
    try {
        byte[] result = codec.decode(null);
        assert result == null;
    } catch (DecoderException e) {
    }
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testEncodeSingleByte_KqQu2_cfpu0() {
    PercentCodec codec = new PercentCodec();
    byte[] bytes = new byte[] {(byte) 65};
    try {
        byte[] result = codec.encode(bytes);
        assert Arrays.equals(result, bytes);
    } catch (EncoderException e) {
        fail("EncoderException was thrown unexpectedly");
    }
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testEncodeMultiByte_LmQi3_keOD0() {
    PercentCodec codec = new PercentCodec();
    byte[] bytes = new byte[] {(byte) 65, (byte) 66, (byte) 67};
    try {
        byte[] result = codec.encode(bytes);
        assert Arrays.equals(result, bytes);
    } catch (EncoderException e) {
        fail("EncoderException was thrown unexpectedly");
    }
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testEncodeNull_RvMr0_Xnql0() {
    PercentCodec codec = new PercentCodec();
    try {
        byte[] result = codec.decode(null);
        Assertions.assertNull(result);
    } catch (DecoderException e) {
        Assertions.fail("DecoderException was expected to be thrown");
    }
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testEncodeEmpty_Udew1_ECEo0() {
    PercentCodec codec = new PercentCodec();
    byte[] bytes = new byte[0];
    try {
        byte[] result = codec.encode(bytes);
        assert result == bytes;
    } catch (EncoderException e) {
        fail("EncoderException was thrown unexpectedly");
    }
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testEncodeAscii_XHZN2_GZeP0() {
    PercentCodec codec = new PercentCodec();
    byte[] bytes = "hello".getBytes();
    try {
        byte[] result = codec.encode(bytes);
        Assertions.assertArrayEquals(bytes, result);
    } catch (EncoderException e) {
        throw new AssertionError("EncoderException occurred", e);
    }
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testEncodeNonAscii_CMrT3_fvvG1() {
    PercentCodec codec = new PercentCodec();
    byte[] bytes = "hello world".getBytes();
    try {
        byte[] result = codec.encode(bytes);
        Assertions.assertArrayEquals(bytes, result);
    } catch (EncoderException e) {
        fail("EncoderException was thrown");
    }
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testEncodeSingleByte_JXfU2_DRtK0() {
    PercentCodec codec = new PercentCodec();
    try {
        byte[] result = codec.encode(new byte[] {(byte) 0x20});
        Assertions.assertArrayEquals(new byte[] {(byte) 0x20}, result);
    } catch (EncoderException e) {
        fail("EncoderException was thrown but not expected");
    }
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testEncodeEmpty_bzxW1_FuWa0() {
    PercentCodec codec = new PercentCodec();
    try {
        byte[] result = codec.encode(new byte[0]);
        Assertions.assertArrayEquals(new byte[0], result);
    } catch (EncoderException e) {
        fail("EncoderException was thrown unexpectedly");
    }
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testEncodeMultipleBytes_jgRo3_ZTzM0() {
    PercentCodec codec = new PercentCodec();
    try {
        byte[] result = codec.decode(new byte[] {(byte) 0x20, (byte) 0x20, (byte) 0x20});
        Assertions.assertArrayEquals(new byte[] {(byte) 0x20, (byte) 0x20, (byte) 0x20}, result);
    } catch (DecoderException e) {
        fail("DecoderException was thrown but not expected");
    }
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testEncodeWithSpace_tGeA4_OuZI0() {
    PercentCodec codec = new PercentCodec(new byte[] {(byte) 0x20}, true);
    try {
        byte[] result = codec.encode(new byte[] {(byte) 0x20});
    } catch (EncoderException e) {
        fail("EncoderException was thrown");
    }
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testEncodeEncode_OHxZ2_kDiz0() {
    PercentCodec codec = new PercentCodec(new byte[] {'a', 'b'}, true);
    byte[] bytes = "Hello World".getBytes();
    try {
        byte[] result = codec.decode(bytes);
        Assertions.assertArrayEquals(new byte[] {'H', 'e', 'l', 'l', 'o', ' ', 'W', 'o', 'r', 'l', 'd'}, result);
    } catch (DecoderException e) {
        fail("DecoderException was thrown");
    }
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testEncodeEncodePlusForSpace_IZCx4_JYKx0() {
    PercentCodec codec = new PercentCodec(new byte[] {'a', 'b'}, false);
    byte[] bytes = "Hello World".getBytes();
    try {
        byte[] result = codec.decode(bytes);
        Assertions.assertArrayEquals(new byte[] {'H', 'e', 'l', 'l', 'o', ' ', 'W', 'o', 'r', 'l', 'd'}, result);
    } catch (DecoderException e) {
        fail("DecoderException was thrown but not expected");
    }
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testEncodeNoEncode_Zmkm2_JwGV0() {
    PercentCodec codec = new PercentCodec();
    byte[] bytes = new byte[] { 'a', 'b', 'c' };
    try {
        byte[] result = codec.encode(bytes);
        assert Arrays.equals(result, bytes);
    } catch (EncoderException e) {
        fail("EncoderException was thrown");
    }
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testEncodeEmpty_fbKF1_GOJn0() {
    PercentCodec codec = new PercentCodec();
    try {
        byte[] result = codec.encode(new byte[0]);
        assert result.length == 0;
    } catch (EncoderException e) {
        fail("EncoderException was thrown but not expected");
    }
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testEncodeEncode_yKlG3_JqRq0() {
    PercentCodec codec = new PercentCodec(new byte[] { 'a', 'b' }, true);
    byte[] bytes = new byte[] { 'a', 'b', 'c' };
    try {
        byte[] result = codec.decode(bytes);
        assert Arrays.equals(result, new byte[] { 'a', 'b', 'c' });
    } catch (DecoderException e) {
        fail("DecoderException was thrown but not expected");
    }
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testEncodeSpaceNoEncode_xmWh5_cDki0() {
    PercentCodec codec = new PercentCodec();
    byte[] bytes = new byte[] { 'a', ' ', 'c' };
    try {
        byte[] result = codec.encode(bytes);
        assert Arrays.equals(result, bytes);
    } catch (EncoderException e) {
        fail("EncoderException was thrown unexpectedly");
    }
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testEncodeSpecialChar_ISMy5_YKMk0() {
    PercentCodec codec = new PercentCodec(new byte[] {(byte) 32, (byte) 33, (byte) 34}, true);
    byte[] bytes = new byte[] {(byte) 32, (byte) 33, (byte) 34};
    try {
        byte[] result = codec.decode(bytes);
        assert Arrays.equals(result, new byte[] {(byte) 32, (byte) 33, (byte) 34});
    } catch (DecoderException e) {
        fail("DecoderException was thrown");
    }
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testEncodeEmpty_Feva1_xrug0() {
    PercentCodec codec = new PercentCodec();
    byte[] bytes = new byte[0];
    try {
        byte[] result = codec.encode(bytes);
        assert Arrays.equals(result, bytes);
    } catch (EncoderException e) {
        fail("EncoderException was thrown unexpectedly");
    }
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testEncodeEmpty_Feva1_lkER1() throws EncoderException {
    PercentCodec codec = new PercentCodec();
    byte[] bytes = new byte[0];
    byte[] result = codec.encode(bytes);
    assert Arrays.equals(result, bytes);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testEncodeSingleByte_fuiR2_YmZw0() {
    PercentCodec codec = new PercentCodec();
    try {
        byte[] result = codec.encode(new byte[] {(byte) 65});
        assert Arrays.equals(result, new byte[] {(byte) 65});
    } catch (EncoderException e) {
        fail("EncoderException was thrown unexpectedly");
    }
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testEncodeMultipleBytes_COfo3_dKlt0() {
    PercentCodec codec = new PercentCodec();
    try {
        byte[] result = codec.encode(new byte[] {(byte) 65, (byte) 66, (byte) 67});
        assert Arrays.equals(result, new byte[] {(byte) 65, (byte) 66, (byte) 67});
    } catch (EncoderException e) {
        fail("EncoderException was thrown");
    }
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testDecodeSingleByte_RfUx2_Miiy0() {
    PercentCodec codec = new PercentCodec();
    byte[] bytes = new byte[] {(byte) 'a'};
    try {
        byte[] result = codec.decode(bytes);
        assertArrayEquals(new byte[] {(byte) 'a'}, result);
    } catch (DecoderException e) {
        fail("DecoderException was thrown");
    }
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testDecodeEmpty_lohA1_CzfK0() {
    PercentCodec codec = new PercentCodec();
    try {
        byte[] result = codec.decode(new byte[0]);
        assertArrayEquals(new byte[0], result);
    } catch (DecoderException e) {
        fail("DecoderException should not be thrown");
    }
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testDecodePlusForSpace_HyqO4_NCrl0() {
    PercentCodec codec = new PercentCodec(new byte[] {(byte) '+'}, true);
    byte[] bytes = new byte[] {(byte) '+'};
    try {
        byte[] result = codec.decode(bytes);
        assertArrayEquals(new byte[] {(byte) ' '}, result);
    } catch (DecoderException e) {
        fail("DecoderException was thrown");
    }
}
}