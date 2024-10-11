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

public class Aster_Caverphone1_Test_Passing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncode1_YjhD0() {
        Caverphone1 caverphone1 = new Caverphone1();
        String result = caverphone1.encode("cough");
        assertEquals("KF1111", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncode2_EcAn1() {
        Caverphone1 caverphone1 = new Caverphone1();
        String result = caverphone1.encode("rough");
        assertEquals("RF1111", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncode3_yUry2() {
        Caverphone1 caverphone1 = new Caverphone1();
        String result = caverphone1.encode("tough");
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncode4_bqXu3() {
        Caverphone1 caverphone1 = new Caverphone1();
        String result = caverphone1.encode("enough");
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncode5_WjqK4() {
        Caverphone1 caverphone1 = new Caverphone1();
        String result = caverphone1.encode("gn");
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncode6_UZIT5() {
        Caverphone1 caverphone1 = new Caverphone1();
        String result = caverphone1.encode("mb");
        assertEquals("M11111", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncode7_cTmn6() {
        Caverphone1 caverphone1 = new Caverphone1();
        String result = caverphone1.encode("cq");
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncode8_xJsc7() {
        Caverphone1 caverphone1 = new Caverphone1();
        String result = caverphone1.encode("ci");
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncode10_PzLn9() {
        Caverphone1 caverphone1 = new Caverphone1();
        String result = caverphone1.encode("cy");
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncode11_WqGN10() {
        Caverphone1 caverphone1 = new Caverphone1();
        String result = caverphone1.encode("tch");
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncode12_PTWY11() {
        Caverphone1 caverphone1 = new Caverphone1();
        String result = caverphone1.encode("c");
        assertEquals("K11111", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncode13_RhxK1111112() {
        Caverphone1 caverphone1 = new Caverphone1();
        String result = caverphone1.encode("q");
        assertEquals("K11111", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncode14_rqEa13() {
        Caverphone1 caverphone1 = new Caverphone1();
        String result = caverphone1.encode("x");
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncode15_AYGr14() {
        Caverphone1 caverphone1 = new Caverphone1();
        String result = caverphone1.encode("v");
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncode16_EYZy15() {
        Caverphone1 caverphone1 = new Caverphone1();
        String result = caverphone1.encode("dg");
        assertEquals("K11111", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsEncodeEqual_equalStrings_mDIX0() throws EncoderException {
        Caverphone1 caverphone1 = new Caverphone1();
        String str1 = "hello";
        String str2 = "hello";
        assertTrue(caverphone1.isEncodeEqual(str1, str2));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsEncodeEqual_unequalStrings_iuuo1() throws EncoderException {
        Caverphone1 caverphone1 = new Caverphone1();
        String str1 = "hello";
        String str2 = "world";
        assertFalse(caverphone1.isEncodeEqual(str1, str2));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsEncodeEqual_nullString_nSxr2() throws EncoderException {
        Caverphone1 caverphone1 = new Caverphone1();
        String str1 = null;
        String str2 = "hello";
        assertFalse(caverphone1.isEncodeEqual(str1, str2));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsEncodeEqual_emptyString_jWNA3() throws EncoderException {
        Caverphone1 caverphone1 = new Caverphone1();
        String str1 = "";
        String str2 = "hello";
        assertFalse(caverphone1.isEncodeEqual(str1, str2));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsEncodeEqual_differentLengths_xccp4() throws EncoderException {
        Caverphone1 caverphone1 = new Caverphone1();
        String str1 = "hello";
        String str2 = "hello world";
        assertFalse(caverphone1.isEncodeEqual(str1, str2));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsEncodeEqual_differentCases_TUhS5() throws EncoderException {
        Caverphone1 caverphone1 = new Caverphone1();
        String str1 = "hello";
        String str2 = "Hello";
        assertTrue(caverphone1.isEncodeEqual(str1, str2));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsEncodeEqual_differentSpecialChars_LNqm6() throws EncoderException {
        Caverphone1 caverphone1 = new Caverphone1();
        String str1 = "hello";
        String str2 = "hllo";
        assertTrue(caverphone1.isEncodeEqual(str1, str2));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsEncodeEqual_differentWhitespace_ABHu8() throws EncoderException {
        Caverphone1 caverphone1 = new Caverphone1();
        String str1 = "hello";
        String str2 = "hello ";
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsEncodeEqual_differentNewlines_oGym9() throws EncoderException {
        Caverphone1 caverphone1 = new Caverphone1();
        String str1 = "hello";
        String str2 = "hello\n";
        assertTrue(caverphone1.isEncodeEqual(str1, str2));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsEncodeEqual_differentTabs_ZEvo10() throws EncoderException {
        Caverphone1 caverphone1 = new Caverphone1();
        String str1 = "hello";
        String str2 = "hello\t";
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsEncodeEqual_differentCarriageReturns_KGav11() throws EncoderException {
        Caverphone1 caverphone1 = new Caverphone1();
        String str1 = "hello";
        String str2 = "hello\r";
        assertTrue(caverphone1.isEncodeEqual(str1, str2));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncode_String_RPDF0() throws EncoderException {
        Caverphone1 caverphone = new Caverphone1();
        String input = "hello";
        String expected = "AL1111";
        String actual = caverphone.encode(input);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncode_NonString_djqa1() throws EncoderException {
        Caverphone1 caverphone = new Caverphone1();
        Object input = new Object();
        try {
            caverphone.encode(input);
            fail("Expected EncoderException");
        } catch (EncoderException e) {
            assertEquals("Parameter supplied to Caverphone encode is not of type java.lang.String", e.getMessage());
        }
    }
}