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

public class Aster_StringUtils_Test_Failing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetBytesUtf16_fNMr0_1() {
        String string = null;
        byte[] expected = null;
        byte[] actual = StringUtils.getBytesUtf16(string);
        string = "";
        expected = new byte[0];
        actual = StringUtils.getBytesUtf16(string);
        string = "hello";
        expected = new byte[]{104, 101, 108, 108, 111};
        actual = StringUtils.getBytesUtf16(string);
        string = "";
        expected = new byte[]{-29, -127, -96, -29, -127, -95, -29, -127, -94, -29, -127, -93};
        actual = StringUtils.getBytesUtf16(string);
        assertArrayEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetBytesUtf16Le_CyKS0() {
        String string = "Hello World!";
        byte[] expected = new byte[]{0x48, 0x65, 0x6c, 0x6c, 0x6f, 0x20, 0x57, 0x6f, 0x72, 0x6c, 0x64, 0x21};
        byte[] actual = StringUtils.getBytesUtf16Le(string);
        assertArrayEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testNewStringUtf16Le_nGqD0() {
        byte[] bytes = new byte[]{0x61, 0x62, 0x63, 0x64, 0x65, 0x66, 0x67, 0x68, 0x69, 0x6a, 0x6b, 0x6c, 0x6d, 0x6e, 0x6f, 0x70, 0x71, 0x72, 0x73, 0x74, 0x75, 0x76, 0x77, 0x78, 0x79, 0x7a};
        String expected = "abcdefghijklmnopqrstuvwxyz";
        String actual = StringUtils.newStringUtf16Le(bytes);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEquals_NullArguments_fbom0_1() {
        assertFalse(StringUtils.equals(null, null));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testNewStringIso8859_1_OkKI0() {
        byte[] bytes = new byte[]{1, 2, 3, 4, 5};
        String expected = "12345";
        String actual = StringUtils.newStringIso8859_1(bytes);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testNewString_UnsupportedCharset_YMYu1() {
        String charsetName = "invalid_charset";
        byte[] bytes = new byte[]{0x00, 0x01, 0x02, 0x03};
        try {
            StringUtils.newString(bytes, charsetName);
            fail("Expected IllegalStateException");
        } catch (IllegalStateException e) {
            assertEquals(charsetName + ": " + e.getMessage(), e.getMessage());
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testNewString_ValidCharset_pvqV2() {
        String charsetName = "UTF-8";
        byte[] bytes = new byte[]{0x00, 0x01, 0x02, 0x03};
        String result = StringUtils.newString(bytes, charsetName);
        assertEquals("00010203", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testNewString_NullCharset_tWQy4() {
        String charsetName = null;
        byte[] bytes = new byte[]{0x00, 0x01, 0x02, 0x03};
        try {
            StringUtils.newString(bytes, charsetName);
            fail("Expected IllegalStateException");
        } catch (IllegalStateException e) {
            assertEquals("null: " + e.getMessage(), e.getMessage());
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testNewString_EmptyCharset_iZqZ6() {
        String charsetName = "";
        byte[] bytes = new byte[]{0x00, 0x01, 0x02, 0x03};
        try {
            StringUtils.newString(bytes, charsetName);
            fail("Expected IllegalStateException");
        } catch (IllegalStateException e) {
            assertEquals(charsetName + ": " + e.getMessage(), e.getMessage());
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testNewString_NullBytesAndCharset_awpX7() {
        String charsetName = null;
        byte[] bytes = null;
        try {
            StringUtils.newString(bytes, charsetName);
            fail("Expected IllegalStateException");
        } catch (IllegalStateException e) {
            assertEquals("null: " + e.getMessage(), e.getMessage());
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testNewString_NullBytesAndEmptyCharset_Seme8() {
        String charsetName = "";
        byte[] bytes = null;
        try {
            StringUtils.newString(bytes, charsetName);
            fail("Expected IllegalStateException");
        } catch (IllegalStateException e) {
            assertEquals(charsetName + ": " + e.getMessage(), e.getMessage());
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testNewString_EmptyBytesAndNullCharset_FTKR9() {
        String charsetName = null;
        byte[] bytes = new byte[]{};
        try {
            StringUtils.newString(bytes, charsetName);
            fail("Expected IllegalStateException");
        } catch (IllegalStateException e) {
            assertEquals("null: " + e.getMessage(), e.getMessage());
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetBytesUnchecked_UnsupportedEncodingException_ZifF1() {
        String string = "hello";
        String charsetName = "invalid_charset";
        byte[] expected = null;
        try {
            StringUtils.getBytesUnchecked(string, charsetName);
            fail("Expected UnsupportedEncodingException");
        } catch (IllegalStateException e) {
            assertEquals("invalid_charset: java.io.UnsupportedEncodingException", e.getMessage());
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testNewString_InvalidCharset_yiBz3_fid1() {
        String charsetName = "invalid_charset";
        byte[] bytes = new byte[]{0x00, 0x01, 0x02, 0x03};
        try {
            StringUtils.newString(bytes, charsetName);
            fail("Expected IllegalStateException");
        } catch (IllegalStateException e) {
            assertEquals("java.io.UnsupportedEncodingException: invalid_charset", e.getMessage());
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testNewString_EmptyCharset_iZqZ6_fid1() {
        String charsetName = "";
        byte[] bytes = new byte[]{0x00, 0x01, 0x02, 0x03};
        try {
            StringUtils.newString(bytes, charsetName);
            fail("Expected IllegalStateException");
        } catch (IllegalStateException e) {
            assertEquals("UnsupportedEncodingException", e.getMessage());
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testNewString_NullBytesAndCharset_awpX7_fid1() {
        String charsetName = null;
        byte[] bytes = null;
        try {
            StringUtils.newString(bytes, charsetName);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            assertEquals("null: " + e.getMessage(), e.getMessage());
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testNewString_NullBytesAndEmptyCharset_Seme8_fid1() {
        String charsetName = "";
        byte[] bytes = null;
        try {
            StringUtils.newString(bytes, charsetName);
            fail("Expected IllegalStateException");
        } catch (IllegalStateException e) {
            assertEquals("US-ASCII", e.getMessage());
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetBytesUtf16_fNMr0() {
        String string = null;
        byte[] expected = null;
        byte[] actual = StringUtils.getBytesUtf16(string);
        assertArrayEquals(expected, actual);
        string = "";
        expected = new byte[0];
        actual = StringUtils.getBytesUtf16(string);
        assertArrayEquals(expected, actual);
        string = "hello";
        expected = new byte[]{104, 101, 108, 108, 111};
        actual = StringUtils.getBytesUtf16(string);
        assertArrayEquals(expected, actual);
        string = "";
        expected = new byte[]{-29, -127, -96, -29, -127, -95, -29, -127, -94, -29, -127, -93};
        actual = StringUtils.getBytesUtf16(string);
        assertArrayEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEquals_NullArguments_fbom0() {
        assertFalse(StringUtils.equals(null, null));
        assertFalse(StringUtils.equals("", null));
        assertFalse(StringUtils.equals(null, ""));
    }
}