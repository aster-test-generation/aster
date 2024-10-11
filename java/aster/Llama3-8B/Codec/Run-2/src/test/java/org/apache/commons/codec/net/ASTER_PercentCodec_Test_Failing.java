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
public class Aster_PercentCodec_Test_Failing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testEncodeNull_DuFl0_TUXw0() {
    PercentCodec codec = new PercentCodec();
    try {
        byte[] result = codec.decode(null);
        fail();
    } catch (DecoderException e) {
        assertEquals("Cannot decode null", e.getMessage());
    }
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testDecodeByteArray_QJSL1_nAam0() {
    PercentCodec codec = new PercentCodec();
    byte[] bytes = new byte[] {1, 2, 3};
    try {
        byte[] result = codec.decode(bytes);
        assertEquals(bytes, result);
    } catch (DecoderException e) {
        fail("DecoderException was thrown but not expected");
    }
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testEncodeSpace_fMSJ5_HUbs0() {
    PercentCodec codec = new PercentCodec(new byte[] {(byte) 0x20, (byte) 0x21}, true);
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
public void testEncodeWithNonEncodedChars_pCva5_IApV0() {
    PercentCodec codec = new PercentCodec();
    try {
        byte[] result = codec.encode(new byte[] {(byte) 0x20, (byte) 0x21, (byte) 0x22});
        Assertions.assertArrayEquals(new byte[] {(byte) 0x20, (byte) 0x25, (byte) 0x21, (byte) 0x25, (byte) 0x22}, result);
    } catch (EncoderException e) {
        fail("EncoderException was thrown");
    }
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testEncodeEncodePlusForSpaceAndSpace_iIhc5_QIcm0() {
    PercentCodec codec = new PercentCodec(new byte[] {'a', 'b'}, false);
    byte[] bytes = "Hello World".getBytes();
    try {
        byte[] result = codec.encode(bytes);
        Assertions.assertArrayEquals(new byte[] {(byte) 'H', (byte) '2', (byte) '0', (byte) '+', (byte) 'W', (byte) '2', (byte) '0'}, result);
    } catch (EncoderException e) {
        fail("EncoderException was thrown");
    }
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testEncodeSpaceEncode_vCaO4_AiWf0() {
    PercentCodec codec = new PercentCodec(new byte[] { 'a', 'b' }, true);
    byte[] bytes = new byte[] { 'a', ' ', 'c' };
    try {
        byte[] result = codec.decode(bytes);
        assert Arrays.equals(result, new byte[] { 'a', '+' });
    } catch (DecoderException e) {
        fail("DecoderException was thrown but not expected");
    }
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testEncodeSpace_RXKI4_hpeO0() {
    PercentCodec codec = new PercentCodec(new byte[] {(byte) 32}, true);
    byte[] bytes = new byte[] {(byte) 32};
    try {
        byte[] result = codec.decode(bytes);
        assert Arrays.equals(result, new byte[] {'+'});
    } catch (DecoderException e) {
        fail("DecoderException was thrown");
    }
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testEncodeNonAscii_vIvC3_IelZ0() {
    PercentCodec codec = new PercentCodec();
    byte[] bytes = "hello".getBytes();
    bytes[0] = (byte) 0x80;
    try {
        byte[] result = codec.encode(bytes);
        Assertions.assertArrayEquals(new byte[] { (byte) 0x25, (byte) 0x68, (byte) 0x65, (byte) 0x6c, (byte) 0x6c, (byte) 0x6f }, result);
    } catch (EncoderException e) {
        fail("EncoderException was thrown");
    }
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testEncodeSpace_iRBs4_aZrT0() {
    PercentCodec codec = new PercentCodec(new byte[] { (byte) 0x20 }, true);
    byte[] bytes = "hello world".getBytes();
    try {
        byte[] result = codec.decode(bytes);
        Assertions.assertArrayEquals(new byte[] { (byte) 0x68, (byte) 0x65, (byte) 0x6c, (byte) 0x6c, (byte) 0x20, (byte) 0x25, (byte) 0x20, (byte) 0x77, (byte) 0x6f, (byte) 0x72, (byte) 0x6c, (byte) 0x64 }, result);
    } catch (DecoderException e) {
        fail("DecoderException was thrown");
    }
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testEncodeAlwaysEncodeChars_ARDQ5_hyYq0() {
    PercentCodec codec = new PercentCodec(new byte[] { (byte) 0x20, (byte) 0x7F }, true);
    byte[] bytes = "hello".getBytes();
    bytes[0] = (byte) 0x20;
    try {
        byte[] result = codec.encode(bytes);
        Assertions.assertArrayEquals(new byte[] { (byte) 0x25, (byte) 0x20, (byte) 0x68, (byte) 0x65, (byte) 0x6c, (byte) 0x6c }, result);
    } catch (EncoderException e) {
        fail("EncoderException was thrown but not expected");
    }
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testEncodeWithAlwaysEncodeChars_Wbrk5_bVSG0() {
    PercentCodec codec = new PercentCodec(new byte[] {(byte) 65, (byte) 66}, true);
    try {
        byte[] result = codec.encode(new byte[] {(byte) 65});
        assert Arrays.equals(result, new byte[] {(byte) '%', (byte) '4', (byte) '7'});
    } catch (EncoderException e) {
        fail("EncoderException was thrown, but it should not be");
    }
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testEncodeSpecialChar_yjPe5_myvm0() {
    PercentCodec codec = new PercentCodec(new byte[] {(byte) 65, (byte) 66, (byte) 67}, true);
    byte[] bytes = new byte[] {(byte) 123};
    try {
        byte[] result = codec.decode(bytes);
        assert Arrays.equals(result, new byte[] {(byte) 65, (byte) 66, (byte) 67});
    } catch (DecoderException e) {
        fail("DecoderException was thrown");
    }
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testDecodeNull_DEkx0_fid1() {
    PercentCodec codec = new PercentCodec();
    assertThrows(DecoderException.class, () -> codec.decode(null));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testEncodeNull_DuFl0_TUXw0_fid1() {
    PercentCodec codec = new PercentCodec();
    try {
        byte[] result = codec.decode(null);
        fail("DecoderException expected");
    } catch (DecoderException e) {
        assertEquals("DecoderException", e.getMessage());
    }
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testEncodeWithSpace_tGeA4_OuZI0_fid1() {
    PercentCodec codec = new PercentCodec(new byte[] {(byte) 0x20}, true);
    try {
        byte[] result = codec.encode(new byte[] {(byte) 0x20});
        Assertions.assertArrayEquals(new byte[] {(byte) 0x25, (byte) 0x20, (byte) 0x25}, result);
    } catch (EncoderException e) {
        fail("EncoderException was thrown");
    }
}
}