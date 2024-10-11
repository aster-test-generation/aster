/**
 * Generated by Aster
 */
package org.apache.commons.codec.language;

import java.util.concurrent.TimeUnit;
import org.apache.commons.codec.EncoderException;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_MatchRatingApproachEncoder_Test_Passing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testRemoveVowels1_UWGm0() throws Exception {
        MatchRatingApproachEncoder encoder = new MatchRatingApproachEncoder();
        String result = encoder.removeVowels("Hello World");
        Assertions.assertEquals("Hll Wrld", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testRemoveVowels2_NHYi1() throws Exception {
        MatchRatingApproachEncoder encoder = new MatchRatingApproachEncoder();
        String result = encoder.removeVowels("AEIOU");
        Assertions.assertEquals("", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCleanName_lUKA0() throws Exception {
        MatchRatingApproachEncoder encoder = new MatchRatingApproachEncoder();
        String result = encoder.cleanName("John Smith");
        Assertions.assertEquals("JOHNSMITH", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCleanNameWithSpecialChars_REWs1() throws Exception {
        MatchRatingApproachEncoder encoder = new MatchRatingApproachEncoder();
        String result = encoder.cleanName("Jhn Smit&h");
        Assertions.assertEquals("JOHNSMITH", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testRemoveDoubleConsonants1_YoLy0() throws Exception {
        MatchRatingApproachEncoder encoder = new MatchRatingApproachEncoder();
        String result = encoder.removeDoubleConsonants("Hello World");
        Assertions.assertEquals("Helo Wrld", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testRemoveDoubleConsonants2_JmfO1() throws Exception {
        MatchRatingApproachEncoder encoder = new MatchRatingApproachEncoder();
        String result = encoder.removeDoubleConsonants("Goodbye");
        Assertions.assertEquals("Goodby", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testRemoveDoubleConsonants3_Misb2() throws Exception {
        MatchRatingApproachEncoder encoder = new MatchRatingApproachEncoder();
        String result = encoder.removeDoubleConsonants("Double Consonants");
        Assertions.assertEquals("Dbl Cnsnts", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetFirst3Last3ForNameWithMoreThan6Characters_gBhv0() throws Exception {
        MatchRatingApproachEncoder encoder = new MatchRatingApproachEncoder();
        String result = encoder.getFirst3Last3("abcdefg");
        assertEquals("abcdef", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetFirst3Last3ForNameWithLessThan6Characters_UDsG1() throws Exception {
        MatchRatingApproachEncoder encoder = new MatchRatingApproachEncoder();
        String result = encoder.getFirst3Last3("abc");
        assertEquals("abc", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testRemoveAccentsNullInput_JvBZ0() throws Exception {
        MatchRatingApproachEncoder encoder = new MatchRatingApproachEncoder();
        String result = encoder.removeAccents(null);
        assertEquals(null, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testRemoveAccentsEmptyInput_euhX1() throws Exception {
        MatchRatingApproachEncoder encoder = new MatchRatingApproachEncoder();
        String result = encoder.removeAccents("");
        assertEquals("", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testRemoveAccentsNoAccents_KgTK2() throws Exception {
        MatchRatingApproachEncoder encoder = new MatchRatingApproachEncoder();
        String result = encoder.removeAccents("Hello");
        assertEquals("Hello", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testRemoveAccentsWithAccents_AvXQ3() throws Exception {
        MatchRatingApproachEncoder encoder = new MatchRatingApproachEncoder();
        String result = encoder.removeAccents("Hll");
        assertEquals("Hello", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeValidString_Cafb0() throws Exception {
        MatchRatingApproachEncoder encoder = new MatchRatingApproachEncoder();
        Object result = encoder.encode("testString");
        assertEquals(Object.class, result.getClass());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeInvalidObject_Vsfs1() throws Exception {
        MatchRatingApproachEncoder encoder = new MatchRatingApproachEncoder();
        try {
            encoder.encode(new Integer(1));
            fail("Expected EncoderException");
        } catch (EncoderException e) {
            assertEquals("Parameter supplied to Match Rating Approach encoder is not of type java.lang.String", e.getMessage());
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetMinRatingForSumLengthLessThan4_Hpnb0() throws Exception {
        MatchRatingApproachEncoder encoder = new MatchRatingApproachEncoder();
        int sumLength = 3;
        int result = encoder.getMinRating(sumLength);
        assertEquals(5, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetMinRatingForSumLengthBetween4And7_XkLk1() throws Exception {
        MatchRatingApproachEncoder encoder = new MatchRatingApproachEncoder();
        int sumLength = 6;
        int result = encoder.getMinRating(sumLength);
        assertEquals(4, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetMinRatingForSumLengthBetween7And11_isnI2() throws Exception {
        MatchRatingApproachEncoder encoder = new MatchRatingApproachEncoder();
        int sumLength = 9;
        int result = encoder.getMinRating(sumLength);
        assertEquals(3, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetMinRatingForSumLengthEqualTo12_PmUg3() throws Exception {
        MatchRatingApproachEncoder encoder = new MatchRatingApproachEncoder();
        int sumLength = 12;
        int result = encoder.getMinRating(sumLength);
        assertEquals(2, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetMinRatingForSumLengthGreaterThan12_wmCM4() throws Exception {
        MatchRatingApproachEncoder encoder = new MatchRatingApproachEncoder();
        int sumLength = 15;
        int result = encoder.getMinRating(sumLength);
        assertEquals(1, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testLeftToRightThenRightToLeftProcessing1_xEdp0() throws Exception {
        MatchRatingApproachEncoder encoder = new MatchRatingApproachEncoder();
        String name1 = "abc";
        String name2 = "abc";
        int result = encoder.leftToRightThenRightToLeftProcessing(name1, name2);
        Assertions.assertEquals(0, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testLeftToRightThenRightToLeftProcessing2_JmcF1() throws Exception {
        MatchRatingApproachEncoder encoder = new MatchRatingApproachEncoder();
        String name1 = "abc";
        String name2 = "abcd";
        int result = encoder.leftToRightThenRightToLeftProcessing(name1, name2);
        Assertions.assertEquals(1, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testLeftToRightThenRightToLeftProcessing3_Krte2() throws Exception {
        MatchRatingApproachEncoder encoder = new MatchRatingApproachEncoder();
        String name1 = "abcd";
        String name2 = "abc";
        int result = encoder.leftToRightThenRightToLeftProcessing(name1, name2);
        Assertions.assertEquals(1, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testLeftToRightThenRightToLeftProcessing4_RpqT3() throws Exception {
        MatchRatingApproachEncoder encoder = new MatchRatingApproachEncoder();
        String name1 = "abc";
        String name2 = "def";
        int result = encoder.leftToRightThenRightToLeftProcessing(name1, name2);
        Assertions.assertEquals(6, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testLeftToRightThenRightToLeftProcessing5_jJPD4() throws Exception {
        MatchRatingApproachEncoder encoder = new MatchRatingApproachEncoder();
        String name1 = "abcdef";
        String name2 = "abc";
        int result = encoder.leftToRightThenRightToLeftProcessing(name1, name2);
        Assertions.assertEquals(3, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testLeftToRightThenRightToLeftProcessing6_uIKZ5() throws Exception {
        MatchRatingApproachEncoder encoder = new MatchRatingApproachEncoder();
        String name1 = "abc";
        String name2 = "abcdef";
        int result = encoder.leftToRightThenRightToLeftProcessing(name1, name2);
        Assertions.assertEquals(3, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeNull_LUkC0() throws Exception {
        MatchRatingApproachEncoder encoder = new MatchRatingApproachEncoder();
        String result = encoder.encode(null);
        assertEquals("", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeEmpty_SaDd1() throws Exception {
        MatchRatingApproachEncoder encoder = new MatchRatingApproachEncoder();
        String result = encoder.encode("");
        assertEquals("", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeSingleCharacter_wXtm2() throws Exception {
        MatchRatingApproachEncoder encoder = new MatchRatingApproachEncoder();
        String result = encoder.encode("a");
        assertEquals("", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeValidName_mWGA4() throws Exception {
        MatchRatingApproachEncoder encoder = new MatchRatingApproachEncoder();
        String result = encoder.encode("JohnDoe");
        assertEquals("JhnDoe", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeNameWithVowels_Gdxg5() throws Exception {
        MatchRatingApproachEncoder encoder = new MatchRatingApproachEncoder();
        String result = encoder.encode("Ava");
        assertEquals("V", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeNameWithDoubleConsonants_GMLh6() throws Exception {
        MatchRatingApproachEncoder encoder = new MatchRatingApproachEncoder();
        String result = encoder.encode("Bobb");
        assertEquals("Bb", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeNameWithVowelsAndDoubleConsonants_TmLN7() throws Exception {
        MatchRatingApproachEncoder encoder = new MatchRatingApproachEncoder();
        String result = encoder.encode("AvaBobb");
        assertEquals("Vb", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeNameWithOnlyConsonants_PWOG8() throws Exception {
        MatchRatingApproachEncoder encoder = new MatchRatingApproachEncoder();
        String result = encoder.encode("Bt");
        assertEquals("Bt", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsEncodeEqualsNull_FgpX0() throws Exception {
        MatchRatingApproachEncoder encoder = new MatchRatingApproachEncoder();
        boolean result = encoder.isEncodeEquals(null, "test");
        Assertions.assertFalse(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsEncodeEqualsEmpty_rULt1() throws Exception {
        MatchRatingApproachEncoder encoder = new MatchRatingApproachEncoder();
        boolean result = encoder.isEncodeEquals("", "test");
        Assertions.assertFalse(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsEncodeEqualsOneChar_eqnb3() throws Exception {
        MatchRatingApproachEncoder encoder = new MatchRatingApproachEncoder();
        boolean result = encoder.isEncodeEquals("a", "test");
        Assertions.assertFalse(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsEncodeEqualsEqual_zNmz4() throws Exception {
        MatchRatingApproachEncoder encoder = new MatchRatingApproachEncoder();
        boolean result = encoder.isEncodeEquals("test", "test");
        Assertions.assertTrue(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsEncodeEqualsDifferentLength_Pfqq5() throws Exception {
        MatchRatingApproachEncoder encoder = new MatchRatingApproachEncoder();
        boolean result = encoder.isEncodeEquals("test", "testing");
        Assertions.assertFalse(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsEncodeEqualsSameLength_vBiK6() throws Exception {
        MatchRatingApproachEncoder encoder = new MatchRatingApproachEncoder();
        boolean result = encoder.isEncodeEquals("test", "tset");
        Assertions.assertFalse(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsEncodeEqualsSameLengthAfterProcessing_pbSk7() throws Exception {
        MatchRatingApproachEncoder encoder = new MatchRatingApproachEncoder();
        boolean result = encoder.isEncodeEquals("tst", "tst");
        Assertions.assertTrue(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsEncodeEqualsDifferentLengthAfterProcessing_lzbj8() throws Exception {
        MatchRatingApproachEncoder encoder = new MatchRatingApproachEncoder();
        boolean result = encoder.isEncodeEquals("tst", "tstt");
        Assertions.assertFalse(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsEncodeEqualsSameLengthAfterRemovingVowels_Clxp9() throws Exception {
        MatchRatingApproachEncoder encoder = new MatchRatingApproachEncoder();
        boolean result = encoder.isEncodeEquals("tst", "tst");
        Assertions.assertFalse(result);
    }
}