/**
 * Generated by Aster
 */
package org.apache.commons.codec.binary;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

public class Aster_StringUtils_Test_Passing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testNewStringUtf8_ycpK0_4() {
        byte[] bytes = null;
        String result = StringUtils.newStringUtf8(bytes);
        bytes = new byte[0];
        result = StringUtils.newStringUtf8(bytes);
        bytes = new byte[]{65, 66, 67};
        result = StringUtils.newStringUtf8(bytes);
        bytes = new byte[]{-1, -2, -3};
        result = StringUtils.newStringUtf8(bytes);
        bytes = new byte[]{-1, -2, -3, -4};
        result = StringUtils.newStringUtf8(bytes);
        bytes = new byte[]{-17, -65, -67};
        result = StringUtils.newStringUtf8(bytes);
        assertNotEquals("ABC", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetBytesIso8859_1_xsOO0_1() {
        assertNull(StringUtils.getBytesIso8859_1(null));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetBytesIso8859_1_xsOO0_2() {
        assertArrayEquals(new byte[0], StringUtils.getBytesIso8859_1(""));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetBytesIso8859_1_xsOO0_3() {
        assertArrayEquals(new byte[]{65, 66, 67}, StringUtils.getBytesIso8859_1("ABC"));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testNewStringUtf16_AHSJ0_3() {
        byte[] bytes = null;
        String result = StringUtils.newStringUtf16(bytes);
        bytes = new byte[0];
        result = StringUtils.newStringUtf16(bytes);
        bytes = "hello".getBytes(StandardCharsets.UTF_16);
        result = StringUtils.newStringUtf16(bytes);
        assertEquals("hello", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEquals_NullNull_xRWd0() {
        assertTrue(StringUtils.equals(null, null));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEquals_NullString_vNox1() {
        assertFalse(StringUtils.equals(null, ""));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEquals_StringNull_cUSx2() {
        assertFalse(StringUtils.equals("", null));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEquals_EmptyEmpty_EzsQ3() {
        assertTrue(StringUtils.equals("", ""));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEquals_StringString_zlbw4() {
        assertTrue(StringUtils.equals("abc", "abc"));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEquals_DifferentLength_bKfg5() {
        assertFalse(StringUtils.equals("abc", "abcd"));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEquals_DifferentContent_cNCq6() {
        assertFalse(StringUtils.equals("abc", "def"));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testNewString_nullBytes_HaVY0() {
        byte[] bytes = null;
        String charsetName = "UTF-8";
        String result = StringUtils.newString(bytes, charsetName);
        assertNull(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testNewString_unsupportedEncodingException_RqWN1() {
        byte[] bytes = new byte[]{1, 2, 3};
        String charsetName = "invalid_charset";
        try {
            StringUtils.newString(bytes, charsetName);
            fail("Expected IllegalStateException");
        } catch (IllegalStateException e) {
            assertEquals("invalid_charset: java.io.UnsupportedEncodingException: invalid_charset", e.getMessage());
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetBytesUnchecked_nullString_tTFa0() {
        String string = null;
        String charsetName = "UTF-8";
        byte[] expected = null;
        byte[] actual = StringUtils.getBytesUnchecked(string, charsetName);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testNewStringUtf16BeWithNullBytes_Wkmh1() {
        byte[] bytes = null;
        String expected = null;
        String actual = StringUtils.newStringUtf16Be(bytes);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testNewStringUtf16BeWithEmptyBytes_FzMr2() {
        byte[] bytes = new byte[0];
        String expected = "";
        String actual = StringUtils.newStringUtf16Be(bytes);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testNewStringUsAscii_ZKuK0() {
        byte[] bytes = new byte[]{65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90};
        String expected = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String actual = StringUtils.newStringUsAscii(bytes);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEquals_DifferentTypes_VSkA7_nDFv0() {
        assertFalse(StringUtils.equals("abc", "123"));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEquals_DifferentTypes_VSkA7_HHtX1() {
        assertFalse(StringUtils.equals("abc", String.valueOf(123)));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testNewString_ckSm1_wwwp0() {
        byte[] bytes = new byte[]{65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90};
        Charset charset = StandardCharsets.US_ASCII;
        String expected = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String actual = StringUtils.newStringUsAscii(bytes);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testNewStringUtf8_ycpK0_3_fid1() {
        byte[] bytes = null;
        String result = StringUtils.newStringUtf8(bytes);
        bytes = new byte[0];
        result = StringUtils.newStringUtf8(bytes);
        bytes = new byte[]{65, 66, 67};
        result = StringUtils.newStringUtf8(bytes);
        bytes = new byte[]{-1, -2, -3};
        result = StringUtils.newStringUtf8(bytes);
        bytes = new byte[]{-1, -2, -3, -4};
        result = StringUtils.newStringUtf8(bytes);
        bytes = new byte[]{-17, -65, -67};
        result = StringUtils.newStringUtf8(bytes);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetBytesIso8859_1_xsOO0() {
        assertNull(StringUtils.getBytesIso8859_1(null));
        assertArrayEquals(new byte[0], StringUtils.getBytesIso8859_1(""));
        assertArrayEquals(new byte[]{65, 66, 67}, StringUtils.getBytesIso8859_1("ABC"));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testNewStringUtf16_AHSJ0() {
        byte[] bytes = null;
        String result = StringUtils.newStringUtf16(bytes);
        assertNull(result);
        bytes = new byte[0];
        result = StringUtils.newStringUtf16(bytes);
        assertEquals("", result);
        bytes = "hello".getBytes(StandardCharsets.UTF_16);
        result = StringUtils.newStringUtf16(bytes);
        assertEquals("hello", result);
    }
}