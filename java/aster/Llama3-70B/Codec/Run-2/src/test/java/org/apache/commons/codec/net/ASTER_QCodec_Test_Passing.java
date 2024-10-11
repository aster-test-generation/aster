/**
 * Generated by Aster
 */
package org.apache.commons.codec.net;
import java.nio.charset.Charset;
import org.apache.commons.codec.DecoderException;
import org.apache.commons.codec.EncoderException;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_QCodec_Test_Passing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSetEncodeBlanks_rYPp0() {
    QCodec qCodec = new QCodec("UTF-8");
    qCodec.setEncodeBlanks(true);
    assertTrue(qCodec.isEncodeBlanks());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSetEncodeBlanks2_FItY1() {
    QCodec qCodec = new QCodec(Charset.forName("UTF-8"));
    qCodec.setEncodeBlanks(false);
    assertFalse(qCodec.isEncodeBlanks());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSetEncodeBlanks3_VQpH2() {
    QCodec qCodec = new QCodec();
    qCodec.setEncodeBlanks(true);
    assertTrue(qCodec.isEncodeBlanks());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetEncoding1_udnW0() {
    QCodec qCodec = new QCodec(Charset.defaultCharset());
    assertEquals("Q", qCodec.getEncoding());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetEncoding2_iDDF1() {
    QCodec qCodec = new QCodec("UTF-8");
    assertEquals("Q", qCodec.getEncoding());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetEncoding3_vXkL2() {
    QCodec qCodec = new QCodec();
    assertEquals("Q", qCodec.getEncoding());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testDoEncodingNull_Qpsf0() {
    QCodec qCodec = new QCodec();
    byte[] result = qCodec.doEncoding(null);
    assertNull(result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testDoEncodingWithEncodeBlanks_fxwL2() {
    QCodec qCodec = new QCodec(Charset.forName("UTF-8"));
    qCodec.setEncodeBlanks(true);
    byte[] bytes = "Hello World".getBytes();
    byte[] result = qCodec.doEncoding(bytes);
    assertNotNull(result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testDoEncodingWithoutEncodeBlanks_WvAt3() {
    QCodec qCodec = new QCodec();
    byte[] bytes = "Hello World".getBytes();
    byte[] result = qCodec.doEncoding(bytes);
    assertNotNull(result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testDoEncodingWithSpecialChars_ieMp4() {
    QCodec qCodec = new QCodec("ISO-8859-1");
    byte[] bytes = "!@#$%^&*()".getBytes();
    byte[] result = qCodec.doEncoding(bytes);
    assertNotNull(result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testDoDecodingDecoderException_Ekyk6() {
    QCodec qCodec = new QCodec();
    byte[] bytes = "Hello=World".getBytes();
    try {
        qCodec.doDecoding(bytes);
        fail("DecoderException expected");
    } catch (DecoderException e) {
    }
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testEncodeNull_wfnE0_zOZs0() {
    QCodec qCodec = new QCodec();
    try {
        byte[] result = qCodec.doDecoding(null);
        assertNull(result);
    } catch (DecoderException e) {
    }
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testDecodeString_hsfA1_xElx0() {
    QCodec qCodec = new QCodec("UTF-8");
    String str = "Hello";
    try {
        byte[] result = qCodec.doDecoding(str.getBytes());
        assertEquals(str, new String(result));
    } catch (DecoderException e) {
        fail("DecoderException occurred");
    }
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testDoDecodingEmptyArray_crHI3_JXyq0() {
    QCodec qCodec = new QCodec();
    byte[] bytes = new byte[0];
    try {
        byte[] result = qCodec.doDecoding(bytes);
        assertArrayEquals(bytes, result);
    } catch (DecoderException e) {
        fail("DecoderException should not be thrown");
    }
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testDoDecodingSingleUnderscore_BXjF4_aJcd0() {
    QCodec qCodec = new QCodec("UTF-8");
    byte[] bytes = "_".getBytes();
    byte[] expectedResult = " ".getBytes();
    try {
        byte[] result = qCodec.doDecoding(bytes);
        assertArrayEquals(expectedResult, result);
    } catch (DecoderException e) {
        fail("DecoderException was thrown");
    }
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testDoDecodingNoUnderscores_CRRL1_eFmc0() {
    QCodec qCodec = new QCodec("UTF-8");
    byte[] bytes = "Hello World".getBytes();
    try {
        byte[] result = qCodec.doDecoding(bytes);
        assertArrayEquals(bytes, result);
    } catch (DecoderException e) {
        fail("DecoderException should not be thrown");
    }
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testDoDecodingWithUnderscores_PcYv2_JdeC0() {
    QCodec qCodec = new QCodec(Charset.forName("UTF-8"));
    byte[] bytes = "Hello_World".getBytes();
    byte[] expectedResult = "Hello World".getBytes();
    try {
        byte[] result = qCodec.doDecoding(bytes);
        assertArrayEquals(expectedResult, result);
    } catch (DecoderException e) {
        fail("DecoderException was thrown");
    }
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testDecodeNull_eTgb0_KKzz0() {
    QCodec qCodec = new QCodec();
    try {
        byte[] result = qCodec.doDecoding(null);
        assertNull(result);
    } catch (DecoderException e) {
        fail("DecoderException should not be thrown");
    }
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testDoDecodingNull_iGdC0_IHdF0() {
    QCodec qCodec = new QCodec();
    byte[] result = null;
    try {
        result = qCodec.doDecoding(null);
    } catch (DecoderException e) {
        fail("DecoderException was thrown");
    }
    assertNull(result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testDoDecodingNull_iGdC0_CkRy1() throws DecoderException {
    QCodec qCodec = new QCodec();
    byte[] result = qCodec.doDecoding(null);
    assertNull(result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testIsEncodeBlanks1_sJBi0_fid1() {
    QCodec qCodec = new QCodec(Charset.defaultCharset());
    boolean result = qCodec.isEncodeBlanks();
    assertFalse(result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testIsEncodeBlanks2_DvyL1_fid1() {
    QCodec qCodec = new QCodec("UTF-8");
    boolean result = qCodec.isEncodeBlanks();
    assertFalse(result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testIsEncodeBlanks3_aLmk2_fid1() {
    QCodec qCodec = new QCodec();
    boolean result = qCodec.isEncodeBlanks();
    assertFalse(result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testEncode_ssiw0_JRNk0_fid1() {
    QCodec qCodec = new QCodec("UTF-8");
    try {
        String result = qCodec.encode("Hello, World!", "UTF-8");
        assertEquals("=?UTF-8?Q?Hello, World!?=", result);
    } catch (EncoderException e) {
        fail("EncoderException should not be thrown");
    }
}
}