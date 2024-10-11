/**
 * Generated by Aster
 */
package org.apache.commons.codec.binary;

import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_StringUtils_Test_Passing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testNewStringUtf8_jgCH0() {
        byte[] bytes = new byte[]{104, 101, 108, 108, 111};
        String expected = "hello";
        String actual = StringUtils.newStringUtf8(bytes);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testNewStringUtf8WithNullBytes_QLNc1() {
        byte[] bytes = null;
        String expected = null;
        String actual = StringUtils.newStringUtf8(bytes);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testNewStringUtf8WithEmptyBytes_kIPI2() {
        byte[] bytes = new byte[0];
        String expected = "";
        String actual = StringUtils.newStringUtf8(bytes);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetBytesUtf16LeWithNullString_JGNH1() {
        String string = null;
        byte[] expected = null;
        byte[] actual = StringUtils.getBytesUtf16Le(string);
        assertArrayEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetBytesUtf16LeWithEmptyString_tsaC2() {
        String string = "";
        byte[] expected = new byte[]{};
        byte[] actual = StringUtils.getBytesUtf16Le(string);
        assertArrayEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testNewStringUtf16LeWithNullBytes_KccQ1() {
        byte[] bytes = null;
        String expected = null;
        String actual = StringUtils.newStringUtf16Le(bytes);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testNewStringUtf16LeWithEmptyBytes_nyiu2() {
        byte[] bytes = new byte[0];
        String expected = "";
        String actual = StringUtils.newStringUtf16Le(bytes);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEquals_NullArguments_fbom0_2() {
        assertFalse(StringUtils.equals("", null));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEquals_NullArguments_fbom0_3() {
        assertFalse(StringUtils.equals(null, ""));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEquals_EmptyStrings_QLGm1() {
        assertTrue(StringUtils.equals("", ""));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEquals_SameString_Wmrd2() {
        String str = "hello";
        assertTrue(StringUtils.equals(str, str));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEquals_DifferentStrings_HfKx3() {
        String str1 = "hello";
        String str2 = "world";
        assertFalse(StringUtils.equals(str1, str2));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEquals_DifferentLengths_CTmM4() {
        String str1 = "hello";
        String str2 = "hello world";
        assertFalse(StringUtils.equals(str1, str2));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEquals_DifferentCharacters_givM5() {
        String str1 = "hello";
        String str2 = "goodbye";
        assertFalse(StringUtils.equals(str1, str2));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEquals_DifferentCases_csZR6() {
        String str1 = "hello";
        String str2 = "Hello";
        assertFalse(StringUtils.equals(str1, str2));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEquals_NullAndNonEmptyString_bBaI8_1() {
        assertFalse(StringUtils.equals(null, "hello"));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEquals_NullAndNonEmptyString_bBaI8_2() {
        assertFalse(StringUtils.equals("hello", null));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEquals_EmptyStringAndNonEmptyString_iWwr9_1() {
        assertFalse(StringUtils.equals("", "hello"));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEquals_EmptyStringAndNonEmptyString_iWwr9_2() {
        assertFalse(StringUtils.equals("hello", ""));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetBytesUtf16Be_eBra0() {
        String string = "Hello, World!";
        byte[] expected = new byte[]{0x00, 0x48, 0x00, 0x65, 0x00, 0x6C, 0x00, 0x6C, 0x00, 0x6F, 0x00, 0x2C, 0x00, 0x20, 0x00, 0x57, 0x00, 0x6F, 0x00, 0x72, 0x00, 0x6C, 0x00, 0x64, 0x00, 0x21};
        byte[] actual = StringUtils.getBytesUtf16Be(string);
        assertArrayEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testNewStringIso8859_1WithNullBytes_QEce1() {
        byte[] bytes = null;
        String expected = null;
        String actual = StringUtils.newStringIso8859_1(bytes);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testNewStringIso8859_1WithEmptyBytes_ZMhU2() {
        byte[] bytes = new byte[]{};
        String expected = "";
        String actual = StringUtils.newStringIso8859_1(bytes);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testNewString_NullBytes_zCEY0() {
        String result = StringUtils.newString(null, "UTF-8");
        assertNull(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testNewString_EmptyBytes_Nszc5() {
        String charsetName = "UTF-8";
        byte[] bytes = new byte[]{};
        String result = StringUtils.newString(bytes, charsetName);
        assertEquals("", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetBytesUnchecked_NullString_oIEG0() {
        String string = null;
        String charsetName = "UTF-8";
        byte[] expected = null;
        byte[] actual = StringUtils.getBytesUnchecked(string, charsetName);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetBytesUnchecked_ValidString_ydOB2() {
        String string = "hello";
        String charsetName = "UTF-8";
        byte[] expected = new byte[]{104, 101, 108, 108, 111};
        byte[] actual = StringUtils.getBytesUnchecked(string, charsetName);
        assertArrayEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testNewStringUsAscii_uldF0() {
        byte[] bytes = new byte[]{65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90};
        String expected = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String actual = StringUtils.newStringUsAscii(bytes);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testNewStringUsAsciiWithEmptyBytes_vdGq1() {
        byte[] bytes = new byte[]{};
        String expected = "";
        String actual = StringUtils.newStringUsAscii(bytes);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testNewStringUsAsciiWithNullBytes_TCcZ2() {
        byte[] bytes = null;
        String expected = null;
        String actual = StringUtils.newStringUsAscii(bytes);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testNewStringUtf8WithInvalidCharset_YDiE3_Ujft0() {
        byte[] bytes = new byte[]{104, 101, 108, 108, 111};
        String expected = "hello";
        String actual = StringUtils.newStringUsAscii(bytes);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testNewStringUtf16LeWithInvalidBytes_dyNO4_PtCg0() {
        byte[] bytes = new byte[]{0x61, 0x62, 0x63, 0x64, 0x65, 0x66, 0x67, 0x68, 0x69, 0x6a, 0x6b, 0x6c, 0x6d, 0x6e, 0x6f, 0x70, 0x71, 0x72, 0x73, 0x74, 0x75, 0x76, 0x77, 0x78, 0x79, 0x7a};
        String expected = "abcdefghijklmnopqrstuvwxyz";
        String actual = StringUtils.newStringUsAscii(bytes);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetBytesUtf16LeWithNonUtf16LeString_HqAl3_fid1() {
        String string = "Hello World!";
        byte[] expected = new byte[]{0x48, 0x65, 0x6c, 0x6c, 0x6f, 0x20, 0x57, 0x6f, 0x72, 0x6c, 0x64, 0x21};
        byte[] actual = StringUtils.getBytesUtf16Le(string);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testNewStringUtf16Le_nGqD0_fid1() {
        byte[] bytes = new byte[]{0x61, 0x62, 0x63, 0x64, 0x65, 0x66, 0x67, 0x68, 0x69, 0x6a, 0x6b, 0x6c, 0x6d, 0x6e, 0x6f, 0x70, 0x71, 0x72, 0x73, 0x74, 0x75, 0x76, 0x77, 0x78, 0x79, 0x7a};
        String expected = "扡摣晥桧橩汫湭灯牱瑳癵硷穹";
        String actual = StringUtils.newStringUtf16Le(bytes);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEquals_NullArguments_fbom0_1_fid1() {
        assertTrue(StringUtils.equals(null, null));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testNewStringIso8859_1_OkKI0_fid1() {
        byte[] bytes = new byte[]{1, 2, 3, 4, 5};
        String expected = "";
        String actual = StringUtils.newStringIso8859_1(bytes);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testNewString_UnsupportedCharset_YMYu1_fid1() {
        String charsetName = "invalid_charset";
        byte[] bytes = new byte[]{0x00, 0x01, 0x02, 0x03};
        try {
            StringUtils.newString(bytes, charsetName);
            fail("Expected IllegalStateException");
        } catch (IllegalStateException e) {
            assertEquals("invalid_charset: java.io.UnsupportedEncodingException: invalid_charset", e.getMessage());
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testNewString_ValidCharset_pvqV2_fid1() {
        String charsetName = "UTF-8";
        byte[] bytes = new byte[]{0x00, 0x01, 0x02, 0x03};
        String result = StringUtils.newString(bytes, charsetName);
        assertEquals(" ", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetBytesUnchecked_UnsupportedEncodingException_ZifF1_fid1() {
        String string = "hello";
        String charsetName = "invalid_charset";
        byte[] expected = null;
        try {
            StringUtils.getBytesUnchecked(string, charsetName);
            fail("Expected UnsupportedEncodingException");
        } catch (IllegalStateException e) {
            assertEquals("invalid_charset: java.io.UnsupportedEncodingException: invalid_charset", e.getMessage());
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEquals_NullAndEmptyString_mVSP7() {
        assertFalse(StringUtils.equals(null, ""));
        assertFalse(StringUtils.equals("", null));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEquals_NullAndNonEmptyString_bBaI8() {
        assertFalse(StringUtils.equals(null, "hello"));
        assertFalse(StringUtils.equals("hello", null));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEquals_EmptyStringAndNonEmptyString_iWwr9() {
        assertFalse(StringUtils.equals("", "hello"));
        assertFalse(StringUtils.equals("hello", ""));
    }
}