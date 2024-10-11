/**
 * Generated by Aster
 */
package org.apache.commons.codec.language;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

public class Aster_DoubleMetaphone_Test_Failing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetMaxCodeLen_NROa0() {
        DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        int expected = 0; // Replace with the expected value
        int actual = doubleMetaphone.getMaxCodeLen();
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testcharAtWithValidIndex_cpue0() {
        DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        String value = "example";
        int index = 3;
        char expected = 'a';
        char actual = doubleMetaphone.charAt(value, index);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void test_doubleMetaphone_0_WXNX0() {
        DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        String value = "value";
        boolean alternate = true;
        String expected = "expected";
        String actual = doubleMetaphone.doubleMetaphone(value, alternate);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void test_doubleMetaphone_1_YVga1() {
        DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        String value = "value";
        boolean alternate = false;
        String expected = "expected";
        String actual = doubleMetaphone.doubleMetaphone(value, alternate);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDoubleMetaphone_NdOc1() {
        String value = "test";
        boolean alternate = true;
        String expected = "primary";
        String actual = new DoubleMetaphone().doubleMetaphone(value, alternate);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDoubleMetaphoneWithEmptyInput_cQnK4() {
        String value = "";
        boolean alternate = true;
        String expected = "";
        String actual = new DoubleMetaphone().doubleMetaphone(value, alternate);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDoubleMetaphoneWithInvalidInput_Ypkn5() {
        String value = "invalid";
        boolean alternate = true;
        String expected = "";
        String actual = new DoubleMetaphone().doubleMetaphone(value, alternate);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDoubleMetaphone_HpEZ0() {
        DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        String value = "test";
        boolean alternate = true;
        String expected = "KNT";
        String actual = doubleMetaphone.doubleMetaphone(value, alternate);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDoubleMetaphone2_fraF1() {
        DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        String value = "test";
        boolean alternate = false;
        String expected = "KNT";
        String actual = doubleMetaphone.doubleMetaphone(value, alternate);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void test_doubleMetaphone_4_EWBv4() {
        DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        String value = "AE";
        boolean alternate = true;
        String expected = "E";
        String actual = doubleMetaphone.doubleMetaphone(value, alternate);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void test_doubleMetaphone_5_xjbG5() {
        DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        String value = "AE";
        boolean alternate = false;
        String expected = "E";
        String actual = doubleMetaphone.doubleMetaphone(value, alternate);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void test_doubleMetaphone_6_GgSW6() {
        DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        String value = "AX";
        boolean alternate = true;
        String expected = "A";
        String actual = doubleMetaphone.doubleMetaphone(value, alternate);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void test_doubleMetaphone_7_VwFM7() {
        DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        String value = "AX";
        boolean alternate = false;
        String expected = "A";
        String actual = doubleMetaphone.doubleMetaphone(value, alternate);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void test_doubleMetaphone_001_UNIe0() {
        String value = "value";
        boolean alternate = true;
        String expected = "expected";
        String actual = new DoubleMetaphone().doubleMetaphone(value, alternate);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void test_doubleMetaphone_001_mgos0() {
        String value = "DoubleMetaphone";
        DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        String actual = doubleMetaphone.doubleMetaphone(value, false);
        String expected = "DTLMNTFNS";
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void test_doubleMetaphone_002_CXJB1() {
        String value = "DoubleMetaphone";
        DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        String actual = doubleMetaphone.doubleMetaphone(value, true);
        String expected = "DTLMNTFNS";
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void test_doubleMetaphone_003_YGbw2() {
        String value = "McCormick";
        DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        String actual = doubleMetaphone.doubleMetaphone(value, false);
        String expected = "MKSFTK";
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void test_doubleMetaphone_004_fdXy3() {
        String value = "McCormick";
        DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        String actual = doubleMetaphone.doubleMetaphone(value, true);
        String expected = "MKSFTK";
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void test_doubleMetaphone_006_nOPH5() {
        String value = "Jackson";
        DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        String actual = doubleMetaphone.doubleMetaphone(value, true);
        String expected = "JKSN";
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void test_doubleMetaphone_008_VoKE7() {
        String value = "Jones";
        DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        String actual = doubleMetaphone.doubleMetaphone(value, true);
        String expected = "JNS";
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void test_doubleMetaphone_009_rSfO8() {
        String value = "Jacobs";
        DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        String actual = doubleMetaphone.doubleMetaphone(value, false);
        String expected = "JKS";
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void test_doubleMetaphone_010_yygq9() {
        String value = "Jacobs";
        DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        String actual = doubleMetaphone.doubleMetaphone(value, true);
        String expected = "JKS";
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void test_doubleMetaphone_011_VKEL10() {
        String value = "Jacquemet";
        DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        String actual = doubleMetaphone.doubleMetaphone(value, false);
        String expected = "JKSM";
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDoubleMetaphone_dZly0() {
        DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        String value = "test";
        boolean alternate = true;
        String expected = "K";
        String actual = doubleMetaphone.doubleMetaphone(value, alternate);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDoubleMetaphone2_TBCJ1() {
        DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        String value = "test";
        boolean alternate = false;
        String expected = "K";
        String actual = doubleMetaphone.doubleMetaphone(value, alternate);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void test_doubleMetaphone_String_boolean_9_nyPT8() {
        DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        String value = "E";
        boolean alternate = true;
        String expected = "E";
        String actual = doubleMetaphone.doubleMetaphone(value, alternate);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void test_doubleMetaphone_String_boolean_10_TvGx9() {
        DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        String value = "E";
        boolean alternate = false;
        String expected = "E";
        String actual = doubleMetaphone.doubleMetaphone(value, alternate);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDoubleMetaphoneWithMultipleLetterInput_hJYi3() {
        DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        String result = doubleMetaphone.doubleMetaphone("APPLE", false);
        assertEquals("ALF", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDoubleMetaphoneWithAlternatingInput_VGBY4() {
        DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        String result = doubleMetaphone.doubleMetaphone("APPLE", true);
        assertEquals("ALF", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDoubleMetaphoneWithSlavoGermanicInput_PkfM5() {
        DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        String result = doubleMetaphone.doubleMetaphone("JOS\u00C7A", false);
        assertEquals("JOSSA", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDoubleMetaphoneWithNonSlavoGermanicInput_XCGS6() {
        DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        String result = doubleMetaphone.doubleMetaphone("JOSE", false);
        assertEquals("JOSA", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void test_doubleMetaphone_0_NwnE0() {
        String value = "";
        boolean alternate = false;
        String expected = "";
        DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        String actual = doubleMetaphone.doubleMetaphone(value, alternate);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void test_doubleMetaphone_3_kINY3() {
        String value = "AX";
        boolean alternate = false;
        String expected = "AX";
        DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        String actual = doubleMetaphone.doubleMetaphone(value, alternate);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void test_doubleMetaphone_4_iCKA4() {
        String value = "AX";
        boolean alternate = true;
        String expected = "AX";
        DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        String actual = doubleMetaphone.doubleMetaphone(value, alternate);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void test_doubleMetaphone_5_pKhj5() {
        String value = "O";
        boolean alternate = false;
        String expected = "O";
        DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        String actual = doubleMetaphone.doubleMetaphone(value, alternate);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void test_doubleMetaphone_6_rgdj6() {
        String value = "OO";
        boolean alternate = false;
        String expected = "O";
        DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        String actual = doubleMetaphone.doubleMetaphone(value, alternate);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void test_doubleMetaphone_7_VNUj7() {
        String value = "OA";
        boolean alternate = false;
        String expected = "O";
        DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        String actual = doubleMetaphone.doubleMetaphone(value, alternate);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void test_doubleMetaphone_0_VEYF0() {
        DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        String value = "";
        boolean alternate = false;
        String expected = "";
        String actual = doubleMetaphone.doubleMetaphone(value, alternate);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void test_doubleMetaphone_6_yhJi6() {
        DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        String value = "AX";
        boolean alternate = false;
        String expected = "AX";
        String actual = doubleMetaphone.doubleMetaphone(value, alternate);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void test_doubleMetaphone_7_EQqQ7() {
        DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        String value = "AX";
        boolean alternate = true;
        String expected = "AX";
        String actual = doubleMetaphone.doubleMetaphone(value, alternate);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDoubleMetaphone_OOZL2_1() {
        DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        String value = "smith";
        boolean alternate = false;
        String expectedResult = "SKMT";
        value = "schmidt";
        alternate = false;
        expectedResult = "SKMT";
        assertEquals(expectedResult, doubleMetaphone.doubleMetaphone(value, alternate));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void test1_koOG0() {
        DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        String value = "test";
        boolean alternate = true;
        String expected = "t3st";
        String actual = doubleMetaphone.doubleMetaphone(value, alternate);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void test2_jolu1() {
        DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        String value = "test";
        boolean alternate = false;
        String expected = "t3st";
        String actual = doubleMetaphone.doubleMetaphone(value, alternate);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testContainsWithValidInput_uoGm0() {
        String value = "example";
        int start = 0;
        int length = 7;
        String[] criteria = {"ex", "ampl", "e"};
        assertTrue(DoubleMetaphone.contains(value, start, length, criteria));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testContainsWithNegativeLength_mHKS4() {
        String value = "example";
        int start = 0;
        int length = -1;
        String[] criteria = {"ex", "ampl", "e"};
        assertFalse(DoubleMetaphone.contains(value, start, length, criteria));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDoubleMetaphone_rdHO0() {
        DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        assertEquals("Expected result", doubleMetaphone.doubleMetaphone("input"), "Actual result");
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDoubleMetaphoneWithNullInput_BSuy1() {
        DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        assertEquals("Expected result", doubleMetaphone.doubleMetaphone(null), "Actual result");
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDoubleMetaphoneWithEmptyInput_ntXS2() {
        DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        assertEquals("Expected result", doubleMetaphone.doubleMetaphone(""), "Actual result");
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDoubleMetaphoneWithOnlySpecialCharactersInput_ZsnU4() {
        DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        assertEquals("Expected result", doubleMetaphone.doubleMetaphone("!@#$%^&*()"), "Actual result");
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDoubleMetaphoneWithOnlyNumericInput_uzQZ5() {
        DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        assertEquals("Expected result", doubleMetaphone.doubleMetaphone("1234567890"), "Actual result");
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDoubleMetaphoneWithOnlyNumericAndSpecialCharactersInput_ADIo6() {
        DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        assertEquals("Expected result", doubleMetaphone.doubleMetaphone("!@#$%^&*()1234567890"), "Actual result");
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    void encode_multipleLetters_returnsCorrectEncoding_wcRs3() {
        DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        String encoded = doubleMetaphone.encode("APPLE");
        org.junit.jupiter.api.Assertions.assertEquals("ALFKP", encoded);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    void encode_multipleWords_returnsCorrectEncoding_WyUI4() {
        DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        String encoded = doubleMetaphone.encode("APPLE BANANA");
        org.junit.jupiter.api.Assertions.assertEquals("ALFKP BANAN", encoded);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    void encode_numbers_returnsCorrectEncoding_RkBu5() {
        DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        String encoded = doubleMetaphone.encode("12345");
        org.junit.jupiter.api.Assertions.assertEquals("12345", encoded);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void test_doubleMetaphone_String_boolean_001_ImZv0_gIza0() {
        String value = "DoubleMetaphone";
        boolean alternate = true;
        String expected = "DTLMNTF";
        DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        String actual = doubleMetaphone.doubleMetaphone(value, alternate);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void test_doubleMetaphone_String_boolean_002_fTCs1_qgmC0() {
        String value = "DoubleMetaphone";
        boolean alternate = false;
        String expected = "DTLMNTF";
        DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        String actual = doubleMetaphone.doubleMetaphone(value, alternate);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDoubleMetaphoneWithEmptyInput_cQnK4_fid1() {
        String value = "";
        boolean alternate = true;
        String expected = "";
        String actual = new DoubleMetaphone().doubleMetaphone(value, alternate);
        assertNull(expected);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void test_doubleMetaphone_0_NwnE0_fid1() {
        String value = "";
        boolean alternate = false;
        String expected = "";
        DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        String actual = doubleMetaphone.doubleMetaphone(value, alternate);
        assertNull(expected);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    void encode_numbers_returnsCorrectEncoding_RkBu5_fid1() {
        DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        String encoded = doubleMetaphone.encode("");
        org.junit.jupiter.api.Assertions.assertEquals("", encoded);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDoubleMetaphone_OOZL2() {
        DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        String value = "smith";
        boolean alternate = false;
        String expectedResult = "SKMT";
        assertEquals(expectedResult, doubleMetaphone.doubleMetaphone(value, alternate));
        value = "schmidt";
        alternate = false;
        expectedResult = "SKMT";
        assertEquals(expectedResult, doubleMetaphone.doubleMetaphone(value, alternate));
    }
}