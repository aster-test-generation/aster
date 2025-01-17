/**
 * Generated by Aster
 */
package org.apache.commons.codec.language;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

import java.util.concurrent.TimeUnit;
import org.apache.commons.codec.EncoderException;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

public class Aster_Caverphone2_Test_Failing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncode1_cFMK0_fid2() {
        Caverphone2 caverphone2 = new Caverphone2();
        String result = caverphone2.encode("hello");
        assertEquals("H3llo", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncode3_qZmc2_fid2() {
        Caverphone2 caverphone2 = new Caverphone2();
        String result = caverphone2.encode("aeiou");
        assertEquals("A3iou", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncode4_Waua3_fid2() {
        Caverphone2 caverphone2 = new Caverphone2();
        String result = caverphone2.encode("bcdfghjklmnpqrstvwxyz");
        assertEquals("B2cdfghjklmnpqrstvwxyz", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncode5_dxzk4_fid2() {
        Caverphone2 caverphone2 = new Caverphone2();
        String result = caverphone2.encode("aeioubcdfghjklmnpqrstvwxyz");
        assertEquals("A3iouB2cdfghjklmnpqrstvwxyz", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncode6_xoQq5_fid2() {
        Caverphone2 caverphone2 = new Caverphone2();
        String result = caverphone2.encode("1234567890");
        assertEquals("1234567890", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncode7_HTeW6_fid2() {
        Caverphone2 caverphone2 = new Caverphone2();
        String result = caverphone2.encode("!@#$%^&*()_+-=");
        assertEquals("!@#$%^&*()_+-=", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsEncodeEqual_NWYf0_1_fid2() throws EncoderException {
        Caverphone2 caverphone2 = new Caverphone2();
        String str1 = "hello";
        String str2 = "world";
        String str3 = "hello";
        String str4 = "world";
        String str5 = "hello";
        String str6 = "world";
        String str7 = "hello";
        String str8 = "world";
        String str9 = "hello";
        String str10 = "world";
        assertTrue(caverphone2.isEncodeEqual(str1, str2));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsEncodeEqual_NWYf0_2_fid2() throws EncoderException {
        Caverphone2 caverphone2 = new Caverphone2();
        String str1 = "hello";
        String str2 = "world";
        String str3 = "hello";
        String str4 = "world";
        String str5 = "hello";
        String str6 = "world";
        String str7 = "hello";
        String str8 = "world";
        String str9 = "hello";
        String str10 = "world";
        assertTrue(caverphone2.isEncodeEqual(str3, str4));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsEncodeEqual_NWYf0_3_fid2() throws EncoderException {
        Caverphone2 caverphone2 = new Caverphone2();
        String str1 = "hello";
        String str2 = "world";
        String str3 = "hello";
        String str4 = "world";
        String str5 = "hello";
        String str6 = "world";
        String str7 = "hello";
        String str8 = "world";
        String str9 = "hello";
        String str10 = "world";
        assertTrue(caverphone2.isEncodeEqual(str5, str6));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsEncodeEqual_NWYf0_4_fid2() throws EncoderException {
        Caverphone2 caverphone2 = new Caverphone2();
        String str1 = "hello";
        String str2 = "world";
        String str3 = "hello";
        String str4 = "world";
        String str5 = "hello";
        String str6 = "world";
        String str7 = "hello";
        String str8 = "world";
        String str9 = "hello";
        String str10 = "world";
        assertTrue(caverphone2.isEncodeEqual(str7, str8));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsEncodeEqual_NWYf0_5_fid2() throws EncoderException {
        Caverphone2 caverphone2 = new Caverphone2();
        String str1 = "hello";
        String str2 = "world";
        String str3 = "hello";
        String str4 = "world";
        String str5 = "hello";
        String str6 = "world";
        String str7 = "hello";
        String str8 = "world";
        String str9 = "hello";
        String str10 = "world";
        assertTrue(caverphone2.isEncodeEqual(str9, str10));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsEncodeEqual_NWYf0_6_fid2() throws EncoderException {
        Caverphone2 caverphone2 = new Caverphone2();
        String str1 = "hello";
        String str2 = "world";
        String str3 = "hello";
        String str4 = "world";
        String str5 = "hello";
        String str6 = "world";
        String str7 = "hello";
        String str8 = "world";
        String str9 = "hello";
        String str10 = "world";
        assertFalse(caverphone2.isEncodeEqual(str1, str3));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsEncodeEqual_NWYf0_7_fid2() throws EncoderException {
        Caverphone2 caverphone2 = new Caverphone2();
        String str1 = "hello";
        String str2 = "world";
        String str3 = "hello";
        String str4 = "world";
        String str5 = "hello";
        String str6 = "world";
        String str7 = "hello";
        String str8 = "world";
        String str9 = "hello";
        String str10 = "world";
        assertFalse(caverphone2.isEncodeEqual(str1, str5));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsEncodeEqual_NWYf0_8_fid2() throws EncoderException {
        Caverphone2 caverphone2 = new Caverphone2();
        String str1 = "hello";
        String str2 = "world";
        String str3 = "hello";
        String str4 = "world";
        String str5 = "hello";
        String str6 = "world";
        String str7 = "hello";
        String str8 = "world";
        String str9 = "hello";
        String str10 = "world";
        assertFalse(caverphone2.isEncodeEqual(str1, str7));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsEncodeEqual_NWYf0_9_fid2() throws EncoderException {
        Caverphone2 caverphone2 = new Caverphone2();
        String str1 = "hello";
        String str2 = "world";
        String str3 = "hello";
        String str4 = "world";
        String str5 = "hello";
        String str6 = "world";
        String str7 = "hello";
        String str8 = "world";
        String str9 = "hello";
        String str10 = "world";
        assertFalse(caverphone2.isEncodeEqual(str1, str9));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsEncodeEqual_NWYf0_10_fid2() throws EncoderException {
        Caverphone2 caverphone2 = new Caverphone2();
        String str1 = "hello";
        String str2 = "world";
        String str3 = "hello";
        String str4 = "world";
        String str5 = "hello";
        String str6 = "world";
        String str7 = "hello";
        String str8 = "world";
        String str9 = "hello";
        String str10 = "world";
        assertFalse(caverphone2.isEncodeEqual(str2, str4));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsEncodeEqual_NWYf0_11() throws EncoderException {
        Caverphone2 caverphone2 = new Caverphone2();
        String str1 = "hello";
        String str2 = "world";
        String str3 = "hello";
        String str4 = "world";
        String str5 = "hello";
        String str6 = "world";
        String str7 = "hello";
        String str8 = "world";
        String str9 = "hello";
        String str10 = "world";
        assertFalse(caverphone2.isEncodeEqual(str2, str6));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsEncodeEqual_NWYf0_12() throws EncoderException {
        Caverphone2 caverphone2 = new Caverphone2();
        String str1 = "hello";
        String str2 = "world";
        String str3 = "hello";
        String str4 = "world";
        String str5 = "hello";
        String str6 = "world";
        String str7 = "hello";
        String str8 = "world";
        String str9 = "hello";
        String str10 = "world";
        assertFalse(caverphone2.isEncodeEqual(str2, str8));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsEncodeEqual_NWYf0_13() throws EncoderException {
        Caverphone2 caverphone2 = new Caverphone2();
        String str1 = "hello";
        String str2 = "world";
        String str3 = "hello";
        String str4 = "world";
        String str5 = "hello";
        String str6 = "world";
        String str7 = "hello";
        String str8 = "world";
        String str9 = "hello";
        String str10 = "world";
        assertFalse(caverphone2.isEncodeEqual(str2, str10));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsEncodeEqual_NWYf0_14() throws EncoderException {
        Caverphone2 caverphone2 = new Caverphone2();
        String str1 = "hello";
        String str2 = "world";
        String str3 = "hello";
        String str4 = "world";
        String str5 = "hello";
        String str6 = "world";
        String str7 = "hello";
        String str8 = "world";
        String str9 = "hello";
        String str10 = "world";
        assertFalse(caverphone2.isEncodeEqual(str3, str5));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsEncodeEqual_NWYf0_15() throws EncoderException {
        Caverphone2 caverphone2 = new Caverphone2();
        String str1 = "hello";
        String str2 = "world";
        String str3 = "hello";
        String str4 = "world";
        String str5 = "hello";
        String str6 = "world";
        String str7 = "hello";
        String str8 = "world";
        String str9 = "hello";
        String str10 = "world";
        assertFalse(caverphone2.isEncodeEqual(str3, str7));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsEncodeEqual_NWYf0_16() throws EncoderException {
        Caverphone2 caverphone2 = new Caverphone2();
        String str1 = "hello";
        String str2 = "world";
        String str3 = "hello";
        String str4 = "world";
        String str5 = "hello";
        String str6 = "world";
        String str7 = "hello";
        String str8 = "world";
        String str9 = "hello";
        String str10 = "world";
        assertFalse(caverphone2.isEncodeEqual(str3, str9));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsEncodeEqual_NWYf0_17() throws EncoderException {
        Caverphone2 caverphone2 = new Caverphone2();
        String str1 = "hello";
        String str2 = "world";
        String str3 = "hello";
        String str4 = "world";
        String str5 = "hello";
        String str6 = "world";
        String str7 = "hello";
        String str8 = "world";
        String str9 = "hello";
        String str10 = "world";
        assertFalse(caverphone2.isEncodeEqual(str4, str6));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsEncodeEqual_NWYf0_18() throws EncoderException {
        Caverphone2 caverphone2 = new Caverphone2();
        String str1 = "hello";
        String str2 = "world";
        String str3 = "hello";
        String str4 = "world";
        String str5 = "hello";
        String str6 = "world";
        String str7 = "hello";
        String str8 = "world";
        String str9 = "hello";
        String str10 = "world";
        assertFalse(caverphone2.isEncodeEqual(str4, str8));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsEncodeEqual_NWYf0_19() throws EncoderException {
        Caverphone2 caverphone2 = new Caverphone2();
        String str1 = "hello";
        String str2 = "world";
        String str3 = "hello";
        String str4 = "world";
        String str5 = "hello";
        String str6 = "world";
        String str7 = "hello";
        String str8 = "world";
        String str9 = "hello";
        String str10 = "world";
        assertFalse(caverphone2.isEncodeEqual(str4, str10));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsEncodeEqual_NWYf0_20() throws EncoderException {
        Caverphone2 caverphone2 = new Caverphone2();
        String str1 = "hello";
        String str2 = "world";
        String str3 = "hello";
        String str4 = "world";
        String str5 = "hello";
        String str6 = "world";
        String str7 = "hello";
        String str8 = "world";
        String str9 = "hello";
        String str10 = "world";
        assertFalse(caverphone2.isEncodeEqual(str5, str7));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsEncodeEqual_NWYf0_21() throws EncoderException {
        Caverphone2 caverphone2 = new Caverphone2();
        String str1 = "hello";
        String str2 = "world";
        String str3 = "hello";
        String str4 = "world";
        String str5 = "hello";
        String str6 = "world";
        String str7 = "hello";
        String str8 = "world";
        String str9 = "hello";
        String str10 = "world";
        assertFalse(caverphone2.isEncodeEqual(str5, str9));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsEncodeEqual_NWYf0_22() throws EncoderException {
        Caverphone2 caverphone2 = new Caverphone2();
        String str1 = "hello";
        String str2 = "world";
        String str3 = "hello";
        String str4 = "world";
        String str5 = "hello";
        String str6 = "world";
        String str7 = "hello";
        String str8 = "world";
        String str9 = "hello";
        String str10 = "world";
        assertFalse(caverphone2.isEncodeEqual(str6, str8));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsEncodeEqual_NWYf0_23() throws EncoderException {
        Caverphone2 caverphone2 = new Caverphone2();
        String str1 = "hello";
        String str2 = "world";
        String str3 = "hello";
        String str4 = "world";
        String str5 = "hello";
        String str6 = "world";
        String str7 = "hello";
        String str8 = "world";
        String str9 = "hello";
        String str10 = "world";
        assertFalse(caverphone2.isEncodeEqual(str6, str10));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsEncodeEqual_NWYf0_24() throws EncoderException {
        Caverphone2 caverphone2 = new Caverphone2();
        String str1 = "hello";
        String str2 = "world";
        String str3 = "hello";
        String str4 = "world";
        String str5 = "hello";
        String str6 = "world";
        String str7 = "hello";
        String str8 = "world";
        String str9 = "hello";
        String str10 = "world";
        assertFalse(caverphone2.isEncodeEqual(str7, str9));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsEncodeEqual_NWYf0_25() throws EncoderException {
        Caverphone2 caverphone2 = new Caverphone2();
        String str1 = "hello";
        String str2 = "world";
        String str3 = "hello";
        String str4 = "world";
        String str5 = "hello";
        String str6 = "world";
        String str7 = "hello";
        String str8 = "world";
        String str9 = "hello";
        String str10 = "world";
        assertFalse(caverphone2.isEncodeEqual(str8, str10));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncode_String_wSHA0() throws EncoderException {
        Caverphone2 caverphone = new Caverphone2();
        String input = "hello";
        String expectedOutput = "H3110";
        String actualOutput = caverphone.encode(input);
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncode_Null_lyIS2() throws EncoderException {
        Caverphone2 caverphone = new Caverphone2();
        String input = null;
        String expectedOutput = null;
        String actualOutput = caverphone.encode(input);
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncode_EmptyString_bIrP3() throws EncoderException {
        Caverphone2 caverphone = new Caverphone2();
        String input = "";
        String expectedOutput = "";
        String actualOutput = caverphone.encode(input);
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncode_NonAlphanumeric_aqMk5() throws EncoderException {
        Caverphone2 caverphone = new Caverphone2();
        String input = "!@#$%^&*()_+";
        String expectedOutput = "!@#$%^&*()_+";
        String actualOutput = caverphone.encode(input);
        assertEquals(expectedOutput, actualOutput);
    }
}