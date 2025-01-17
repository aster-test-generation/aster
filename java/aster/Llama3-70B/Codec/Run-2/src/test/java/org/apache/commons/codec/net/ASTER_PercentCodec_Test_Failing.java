/**
 * Generated by Aster
 */
package org.apache.commons.codec.net;
import org.apache.commons.codec.EncoderException;
import static org.junit.jupiter.api.Assertions.*;
import java.util.Arrays;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_PercentCodec_Test_Failing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testEncodeWithNonAsciiChar_vrAy5_hlXL0() {
    PercentCodec codec = new PercentCodec();
    byte[] bytes = "Hello".getBytes();
    byte[] result = null;
    try {
        result = codec.encode(bytes);
    } catch (EncoderException e) {
        fail("EncoderException should not be thrown");
    }
    assertNotNull(result);
    assertFalse(Arrays.equals(bytes, result));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testEncodeWithNonAsciiChar_KjBr4_WsME0() {
    PercentCodec codec = new PercentCodec();
    byte[] bytes = "HelloWorld".getBytes();
    byte[] result = null;
    try {
        result = codec.encode(bytes);
    } catch (EncoderException e) {
        fail("EncoderException should not be thrown");
    }
    assertNotNull(result);
    assertFalse(Arrays.equals(bytes, result));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testEncodeWithEncoderException_BfqK5() {
    PercentCodec codec = new PercentCodec();
    byte[] bytes = new byte[] {0, 0};
    try {
        codec.encode(bytes);
        fail("Expected EncoderException");
    } catch (EncoderException e) {
    }
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testDecodeEscape_UHPu3_pFzL0_fid1() {
    PercentCodec codec = new PercentCodec();
    byte[] input = "he%20llo".getBytes();
    byte[] result = new byte[0];
    try {
        result = codec.encode(input);
    } catch (EncoderException e) {
    }
    assertArrayEquals("hello".getBytes(), result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testDecodePlusForSpace_FKYz4_iROU0_fid1() {
    PercentCodec codec = new PercentCodec(new byte[0], true);
    byte[] input = "he+llo".getBytes();
    byte[] result = new byte[0];
    try {
        result = codec.encode(input);
    } catch (EncoderException e) {
    }
    assertArrayEquals("he%2Bllo".getBytes(), result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testEncodeWithPlusForSpace_TscZ3_aWIt0_fid1() {
    PercentCodec codec = new PercentCodec(new byte[] {' '}, true);
    byte[] bytes = "Hello+World".getBytes();
    byte[] result = null;
    try {
        result = codec.encode(bytes);
    } catch (EncoderException e) {
        fail("EncoderException should not be thrown");
    }
    assertNotNull(result);
    assertNotEquals(bytes, result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testEncodeWithAsciiChar_VqdI4_JGKc0_fid1() {
    PercentCodec codec = new PercentCodec();
    byte[] bytes = "Hello123".getBytes();
    byte[] result = null;
    try {
        result = codec.encode(bytes);
    } catch (EncoderException e) {
        fail("EncoderException was thrown");
    }
    assertNotNull(result);
    assertNotEquals(bytes, result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testEncodeWithNonAsciiChar_vrAy5_hlXL0_fid1() {
    PercentCodec codec = new PercentCodec();
    byte[] bytes = "Hello".getBytes();
    byte[] result = null;
    try {
        result = codec.encode(bytes);
    } catch (EncoderException e) {
        fail("EncoderException should not be thrown");
    }
    assertNotNull(result);
    assertNotEquals(bytes, result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testEncodeWithNonAsciiChar_KjBr4_WsME0_fid1() {
    PercentCodec codec = new PercentCodec();
    byte[] bytes = "HelloWorld".getBytes();
    byte[] result = null;
    try {
        result = codec.encode(bytes);
    } catch (EncoderException e) {
        fail("EncoderException should not be thrown");
    }
    assertNotNull(result);
    assertNotEquals(bytes, result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testEncodeWithAlwaysEncodeChars_JVtm2_YaBD0_fid1() {
    byte[] alwaysEncodeChars = new byte[256];
    alwaysEncodeChars['a'] = 1;
    PercentCodec codec = new PercentCodec(alwaysEncodeChars, false);
    byte[] bytes = "aHelloWorld".getBytes();
    byte[] result = null;
    try {
        result = codec.encode(bytes);
    } catch (EncoderException e) {
        fail("EncoderException should not be thrown");
    }
    assertNotNull(result);
    assertNotEquals(bytes, result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testEncodeWithAlwaysEncodeChars_WtnE2_XyWk0_fid1() {
    byte[] alwaysEncodeChars = new byte[256];
    alwaysEncodeChars['a'] = 1;
    PercentCodec codec = new PercentCodec(alwaysEncodeChars, false);
    byte[] bytes = "HelloaWorld".getBytes();
    try {
        byte[] result = codec.encode(bytes);
        assertNotNull(result);
        assertNotEquals(bytes, result);
    } catch (EncoderException e) {
        fail("EncoderException should not be thrown");
    }
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testEncodeWithEncoding_wWZt2_uFwe0_fid1() {
    PercentCodec pc = new PercentCodec(new byte[] {'a', 'b', 'c'}, true);
    byte[] bytes = "Hello World".getBytes();
    byte[] result = new byte[0];
    try {
        result = pc.encode(bytes);
        assertEquals("%20", new String(result, 5, 3));
    } catch (EncoderException e) {
    }
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testEncodeWithContainsSpace_RNxf5_tVnw0_fid1() {
    PercentCodec pc = new PercentCodec(new byte[] {'a', 'b', 'c'}, true);
    byte[] bytes = "Hello World".getBytes();
    byte[] result = null;
    try {
        result = pc.encode(bytes);
        assertTrue(Arrays.toString(result).contains("+"));
    } catch (EncoderException e) {
        fail("EncoderException should not be thrown");
    }
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testEncodeWithContainsSpace_QcPO5_UGCg0_fid1() {
    PercentCodec codec = new PercentCodec(new byte[256], true);
    byte[] bytes = "Hello World".getBytes();
    byte[] result = null;
    try {
        result = codec.encode(bytes);
    } catch (EncoderException e) {
        fail("EncoderException should not be thrown");
    }
    assertTrue(result.length > bytes.length);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testEncodeWithAlwaysEncodeChars_IkER3_PrsE0_fid1() {
    byte[] alwaysEncodeChars = new byte[256];
    alwaysEncodeChars['a'] = 1;
    PercentCodec codec = new PercentCodec(alwaysEncodeChars, false);
    byte[] bytes = "HelloaWorld".getBytes();
    byte[] result = null;
    try {
        result = codec.encode(bytes);
    } catch (EncoderException e) {
        fail("EncoderException should not be thrown");
    }
    assertEquals("%61", new String(result, 5, 3));
}
}