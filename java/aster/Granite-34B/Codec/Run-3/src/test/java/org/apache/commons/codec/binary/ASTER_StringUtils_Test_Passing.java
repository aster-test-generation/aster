/**
 * Generated by Aster
 */
package org.apache.commons.codec.binary;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_StringUtils_Test_Passing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testgetBytesIso8859_1_aufe0() throws Exception {
        String str = "Hello World";
        byte[] expected = {72, 101, 108, 108, 111, 32, 87, 111, 114, 108, 100};
        assertArrayEquals(expected, StringUtils.getBytesIso8859_1(str));
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testNewStringUtf16Le_gJId0_1() throws Exception {
    byte[] bytes = new byte[0];
    String result = StringUtils.newStringUtf16Le(bytes);
    bytes = new byte[]{0, 65};
    result = StringUtils.newStringUtf16Le(bytes);
    bytes = new byte[]{0, 65, 0, 66};
    result = StringUtils.newStringUtf16Le(bytes);
    assertEquals("", result);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testNewStringUtf16Le_gJId0_2() throws Exception {
    byte[] bytes = new byte[0];
    String result = StringUtils.newStringUtf16Le(bytes);
    bytes = new byte[]{0, 65};
    result = StringUtils.newStringUtf16Le(bytes);
    bytes = new byte[]{0, 65, 0, 66};
    result = StringUtils.newStringUtf16Le(bytes);
    assertEquals("A", result);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testNewStringUtf16Le_gJId0_3() throws Exception {
    byte[] bytes = new byte[0];
    String result = StringUtils.newStringUtf16Le(bytes);
    bytes = new byte[]{0, 65};
    result = StringUtils.newStringUtf16Le(bytes);
    bytes = new byte[]{0, 65, 0, 66};
    result = StringUtils.newStringUtf16Le(bytes);
    assertEquals("AB", result);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testNewStringUtf8_CgvQ0_1() throws Exception {
        byte[] bytes1 = null;
        String expected1 = null;
        String actual1 = StringUtils.newStringUtf8(bytes1);
        byte[] bytes2 = "Hello, World!".getBytes(StandardCharsets.UTF_8);
        String expected2 = "Hello, World!";
        String actual2 = StringUtils.newStringUtf8(bytes2);
        assertEquals(expected1, actual1);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testNewStringUtf8_CgvQ0_2() throws Exception {
        byte[] bytes1 = null;
        String expected1 = null;
        String actual1 = StringUtils.newStringUtf8(bytes1);
        byte[] bytes2 = "Hello, World!".getBytes(StandardCharsets.UTF_8);
        String expected2 = "Hello, World!";
        String actual2 = StringUtils.newStringUtf8(bytes2);
        assertEquals(expected2, actual2);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testNewStringUtf16Be_nIVb0() throws Exception {
        byte[] bytes = new byte[] {0, 1, 2, 3};
        String expected = new String(bytes, StandardCharsets.UTF_16BE);
        String actual = StringUtils.newStringUtf16Be(bytes);
        assertEquals(expected, actual);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void test_getByteBufferUtf8_null_qNeE0() throws Exception {
        final ByteBuffer result = StringUtils.getByteBufferUtf8(null);
        assertNotNull(result);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void test_getByteBufferUtf8_empty_ZZRd1() throws Exception {
        final ByteBuffer result = StringUtils.getByteBufferUtf8("");
        assertEquals(0, result.remaining());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void test_getByteBufferUtf8_hello_pDNU2() throws Exception {
        final ByteBuffer result = StringUtils.getByteBufferUtf8("hello");
        assertEquals("hello", StandardCharsets.UTF_8.decode(result).toString());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testNewStringUsAscii_pXLR0() throws Exception {
        byte[] bytes = new byte[] { 65, 66, 67 };
        String expected = "ABC";
        String actual = StringUtils.newStringUsAscii(bytes);
        assertEquals(expected, actual);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testNewStringUsAsciiWithEmptyArray_kRqs1() throws Exception {
        byte[] bytes = new byte[0];
        String expected = "";
        String actual = StringUtils.newStringUsAscii(bytes);
        assertEquals(expected, actual);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testNewStringUsAsciiWithNullArray_llvH2() throws Exception {
        byte[] bytes = null;
        String expected = "";
        String actual = StringUtils.newStringUsAscii(bytes);
        assertEquals(expected, actual);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testNewStringWithValidInput_cJzC0() throws Exception {
        String result = StringUtils.newString(new byte[] { 65, 66, 67 }, "UTF-8");
        assertEquals("ABC", result);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testNewStringWithNullInput_UQvd1() throws Exception {
        String result = StringUtils.newString(null, "UTF-8");
        assertEquals(null, result);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testNewStringWithUnsupportedEncoding_CRlg2_1() throws Exception {
        UnsupportedEncodingException e = assertThrows(UnsupportedEncodingException.class,
                () -> StringUtils.newString(new byte[] { 65, 66, 67 }, "NOT_EXISTS_ENCODING"));}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void getBytesUsAscii_emptyString_returnsEmptyArray_wJbL0() throws Exception {
        String string = "";
        byte[] expected = new byte[0];
        byte[] actual = StringUtils.getBytesUsAscii(string);
        assertArrayEquals(expected, actual);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void getBytesUsAscii_nonEmptyStrings_returnsExpectedArray_eTec1_1() throws Exception {
        String string1 = "Hello";
        byte[] expected1 = {72, 101, 108, 108, 111};
        byte[] actual1 = StringUtils.getBytesUsAscii(string1);
        String string2 = "World";
        byte[] expected2 = {87, 111, 114, 108, 100};
        byte[] actual2 = StringUtils.getBytesUsAscii(string2);
        assertArrayEquals(expected1, actual1);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void getBytesUsAscii_nonEmptyStrings_returnsExpectedArray_eTec1_2() throws Exception {
        String string1 = "Hello";
        byte[] expected1 = {72, 101, 108, 108, 111};
        byte[] actual1 = StringUtils.getBytesUsAscii(string1);
        String string2 = "World";
        byte[] expected2 = {87, 111, 114, 108, 100};
        byte[] actual2 = StringUtils.getBytesUsAscii(string2);
        assertArrayEquals(expected2, actual2);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testgetBytesUnchecked_Aiac0() throws Exception {
        String input = "Hello, World!";
        String charsetName = "UTF-8";
        byte[] expected = {72, 101, 108, 108, 111, 44, 32, 87, 111, 114, 108, 100, 33};
        byte[] actual = StringUtils.getBytesUnchecked(input, charsetName);
        assertArrayEquals(expected, actual);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testgetBytesUncheckedWithNullString_HOMO1() throws Exception {
        String input = null;
        String charsetName = "UTF-8";
        byte[] expected = null;
        byte[] actual = StringUtils.getBytesUnchecked(input, charsetName);
        assertArrayEquals(expected, actual);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testgetBytesUncheckedWithUnsupportedCharset_IASO2() throws Exception {
        String input = "Hello, World!";
        String charsetName = "ABC";
        byte[] expected = null;
        byte[] actual = StringUtils.getBytesUnchecked(input, charsetName);
        assertArrayEquals(expected, actual);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void getBytesUtf16_nullInput_returnsNull_LKXL0() throws Exception {
        byte[] result = StringUtils.getBytesUtf16(null);
        assertArrayEquals(null, result);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void getBytesUtf16_emptyInput_returnsEmptyArray_xGRV1() throws Exception {
        byte[] result = StringUtils.getBytesUtf16("");
        assertArrayEquals(new byte[0], result);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void getBytesUtf16_nonEmptyInput_returnsExpectedArray_ShSQ2() throws Exception {
        String input = "Hello, World!";
        byte[] expected = input.getBytes(StandardCharsets.UTF_16);
        byte[] result = StringUtils.getBytesUtf16(input);
        assertArrayEquals(expected, result);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEqualsWithSameObject_QJdW0() throws Exception {
        final CharSequence cs1 = "test";
        assertTrue(StringUtils.equals(cs1, cs1));
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEqualsWithNullObject_NIkL1_1() throws Exception {
        final CharSequence cs1 = "test";
        assertFalse(StringUtils.equals(cs1, null));}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEqualsWithNullObject_NIkL1_2() throws Exception {
        final CharSequence cs1 = "test";
        assertFalse(StringUtils.equals(null, cs1));}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEqualsWithSameString_wcys2() throws Exception {
        final String cs1 = "test";
        final String cs2 = "test";
        assertTrue(StringUtils.equals(cs1, cs2));
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEqualsWithDifferentString_CyNa3() throws Exception {
        final String cs1 = "test";
        final String cs2 = "TEST";
        assertFalse(StringUtils.equals(cs1, cs2));
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEqualsWithDifferentLength_ZQjV4() throws Exception {
        final String cs1 = "test";
        final String cs2 = "test1";
        assertFalse(StringUtils.equals(cs1, cs2));
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEqualsWithDifferentTypes_JhwO5() throws Exception {
        final String cs1 = "test";
        final StringBuilder cs2 = new StringBuilder("test");
        assertFalse(StringUtils.equals(cs1, cs2));
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEqualsWithEmptyStrings_UdZU6() throws Exception {
        final String cs1 = "";
        final String cs2 = "";
        assertTrue(StringUtils.equals(cs1, cs2));
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEqualsWithNullOrEmptyStrings_hdQX7_1() throws Exception {
        final String cs1 = null;
        final String cs2 = "";
        assertFalse(StringUtils.equals(cs1, cs2));}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEqualsWithNullOrEmptyStrings_hdQX7_2() throws Exception {
        final String cs1 = null;
        final String cs2 = "";
        assertFalse(StringUtils.equals(cs2, cs1));}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetBytesUtf16Le_CWrE0() throws Exception {
        String input = "Hello, World!";
        byte[] expected = { 0x48, 0x00, 0x65, 0x00, 0x6C, 0x00, 0x6C, 0x00, 0x6F, 0x00, 0x2C, 0x00, 0x20, 0x00, 0x57, 0x00, 0x6F, 0x00, 0x72, 0x00, 0x6C, 0x00, 0x64, 0x00, 0x21, 0x00 };
        assertArrayEquals(expected, StringUtils.getBytesUtf16Le(input));
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetBytesUtf16LeWithEmptyInput_blcs1() throws Exception {
        String input = "";
        byte[] expected = {};
        assertArrayEquals(expected, StringUtils.getBytesUtf16Le(input));
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetBytesUtf16LeWithNullInput_PDBA2() throws Exception {
        String input = null;
        byte[] expected = {};
        assertArrayEquals(expected, StringUtils.getBytesUtf16Le(input));
    }
}