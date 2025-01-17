/**
 * Generated by Aster
 */
package org.apache.commons.codec.language;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

import java.util.concurrent.TimeUnit;
import org.apache.commons.codec.EncoderException;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

public class Aster_MatchRatingApproachEncoder_Test_Passing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testLeftToRightThenRightToLeftProcessing_QoXY0() {
        MatchRatingApproachEncoder encoder = new MatchRatingApproachEncoder();
        String name1 = "John";
        String name3 = "Jane";
        int result = encoder.leftToRightThenRightToLeftProcessing(name1, name3);
        assertEquals(3, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testLeftToRightThenRightToLeftProcessingWithEmptyNames_tKJq1() {
        MatchRatingApproachEncoder encoder = new MatchRatingApproachEncoder();
        String name1 = "";
        String name2 = "";
        int result = encoder.leftToRightThenRightToLeftProcessing(name1, name2);
        assertEquals(6, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testLeftToRightThenRightToLeftProcessingWithSimilarNamesButDifferentCase_YcUu5() {
        MatchRatingApproachEncoder encoder = new MatchRatingApproachEncoder();
        String name1 = "John";
        String name2 = "jane";
        int result = encoder.leftToRightThenRightToLeftProcessing(name1, name2);
        assertEquals(2, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testRemoveVowels_HqiE0() {
        MatchRatingApproachEncoder encoder = new MatchRatingApproachEncoder();
        String name = "John";
        String expected = "John";
        String actual = encoder.removeVowels(name);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testRemoveVowels_WithVowels_yOJS1() {
        MatchRatingApproachEncoder encoder = new MatchRatingApproachEncoder();
        String name = "Johan";
        String expected = "Johan";
        String actual = encoder.removeVowels(name);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testRemoveVowels_WithFirstLetterAsVowel_UNrk3() {
        MatchRatingApproachEncoder encoder = new MatchRatingApproachEncoder();
        String name = "Anna";
        String expected = "Anna";
        String actual = encoder.removeVowels(name);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsEncodeEquals_1_kwUf0() {
        MatchRatingApproachEncoder encoder = new MatchRatingApproachEncoder();
        boolean actual = encoder.isEncodeEquals("name1", "name2");
        boolean expected = true;
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testRemoveDoubleConsonants_bivJ0() {
        MatchRatingApproachEncoder encoder = new MatchRatingApproachEncoder();
        String name = "John";
        String expected = "JOHN";
        assertEquals(expected, encoder.removeDoubleConsonants(name));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testRemoveDoubleConsonantsWithNoDoubleConsonants_TGEo1() {
        MatchRatingApproachEncoder encoder = new MatchRatingApproachEncoder();
        String name = "Johnny";
        String expected = "JOHNY";
        assertEquals(expected, encoder.removeDoubleConsonants(name));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testRemoveAccents_1_RJey0() {
        MatchRatingApproachEncoder m = new MatchRatingApproachEncoder();
        String input = "";
        String expected = "";
        assertEquals(expected, m.removeAccents(input));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testRemoveAccents_14_ILpc13() {
        MatchRatingApproachEncoder m = new MatchRatingApproachEncoder();
        String input = "a";
        String expected = "a";
        assertEquals(expected, m.removeAccents(input));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCleanName_HNgp0() {
        MatchRatingApproachEncoder encoder = new MatchRatingApproachEncoder();
        String name = "John-Doe";
        String expected = "JOHNDOE";
        assertEquals(expected, encoder.cleanName(name));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCleanNameWithAccents_VSek1() {
        MatchRatingApproachEncoder encoder = new MatchRatingApproachEncoder();
        String name = "Jos";
        String expected = "JOS";
        assertEquals(expected, encoder.cleanName(name));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void getMinRating_sumLengthIs4_returns5_JHYy0() {
        MatchRatingApproachEncoder encoder = new MatchRatingApproachEncoder();
        int actual = encoder.getMinRating(4);
        assertEquals(5, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void getMinRating_sumLengthIs7_returns4_gvXl1() {
        MatchRatingApproachEncoder encoder = new MatchRatingApproachEncoder();
        int actual = encoder.getMinRating(7);
        assertEquals(4, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void getMinRating_sumLengthIs11_returns3_OFai2() {
        MatchRatingApproachEncoder encoder = new MatchRatingApproachEncoder();
        int actual = encoder.getMinRating(11);
        assertEquals(3, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void getMinRating_sumLengthIs12_returns2_fwta3() {
        MatchRatingApproachEncoder encoder = new MatchRatingApproachEncoder();
        int actual = encoder.getMinRating(12);
        assertEquals(2, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void getMinRating_sumLengthIsMoreThan12_returns1_VjFz4() {
        MatchRatingApproachEncoder encoder = new MatchRatingApproachEncoder();
        int actual = encoder.getMinRating(13);
        assertEquals(1, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void getMinRating_sumLengthIsZero_returns5_rieK5() {
        MatchRatingApproachEncoder encoder = new MatchRatingApproachEncoder();
        int actual = encoder.getMinRating(0);
        assertEquals(5, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void getMinRating_sumLengthIsNegative_returns5_sxto6() {
        MatchRatingApproachEncoder encoder = new MatchRatingApproachEncoder();
        int actual = encoder.getMinRating(-1);
        assertEquals(5, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    void testIsVowel_returnsTrueForAE_ygvr0() {
        MatchRatingApproachEncoder encoder = new MatchRatingApproachEncoder();
        boolean result = encoder.isVowel("A");
        assert result;
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    void testIsVowel_returnsTrueForOE_gtTH1() {
        MatchRatingApproachEncoder encoder = new MatchRatingApproachEncoder();
        boolean result = encoder.isVowel("O");
        assert result;
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    void testIsVowel_returnsTrueForIE_nmTS2() {
        MatchRatingApproachEncoder encoder = new MatchRatingApproachEncoder();
        boolean result = encoder.isVowel("I");
        assert result;
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    void testIsVowel_returnsTrueForUE_ztYf3() {
        MatchRatingApproachEncoder encoder = new MatchRatingApproachEncoder();
        boolean result = encoder.isVowel("U");
        assert result;
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    void testIsVowel_returnsFalseForX_ZgBs4() {
        MatchRatingApproachEncoder encoder = new MatchRatingApproachEncoder();
        boolean result = encoder.isVowel("X");
        assert !result;
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    void testIsVowel_returnsFalseForEmptyInput_FaBa5() {
        MatchRatingApproachEncoder encoder = new MatchRatingApproachEncoder();
        boolean result = encoder.isVowel("");
        assert !result;
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void getFirst3Last3_nameLengthMoreThan6_returnFirst3Last3_rpRL0() {
        MatchRatingApproachEncoder encoder = new MatchRatingApproachEncoder();
        String name = "JohnDoe";
        String actual = encoder.getFirst3Last3(name);
        assertEquals("JohDoe", actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void getFirst3Last3_nameLengthLessThan6_returnName_xgRg1() {
        MatchRatingApproachEncoder encoder = new MatchRatingApproachEncoder();
        String name = "Jane";
        String actual = encoder.getFirst3Last3(name);
        assertEquals("Jane", actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncode_RKdR0() throws EncoderException {
        MatchRatingApproachEncoder encoder = new MatchRatingApproachEncoder();
        String input = "example";
        Object encoded = encoder.encode(input);
        assertEquals("EXMPL", encoded);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeWithNullInput_uTwW1() throws EncoderException {
        MatchRatingApproachEncoder encoder = new MatchRatingApproachEncoder();
        Object encoded = encoder.encode(null);
        assertEquals("", encoded);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeWithNullName_VJlK0() {
        MatchRatingApproachEncoder encoder = new MatchRatingApproachEncoder();
        String encodedName = encoder.encode(null);
        assertEquals("", encodedName);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeWithEmptyName_KGSe1() {
        MatchRatingApproachEncoder encoder = new MatchRatingApproachEncoder();
        String encodedName = encoder.encode("");
        assertEquals("", encodedName);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeWithSingleLetterName_ApMZ2() {
        MatchRatingApproachEncoder encoder = new MatchRatingApproachEncoder();
        String encodedName = encoder.encode("A");
        assertEquals("", encodedName);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeWithCleanedName_cYRd3() {
        MatchRatingApproachEncoder encoder = new MatchRatingApproachEncoder();
        String encodedName = encoder.encode("John");
        assertEquals("JHN", encodedName);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeWithAllStepsAndCoverage_PlEG8_1() {
        MatchRatingApproachEncoder encoder = new MatchRatingApproachEncoder();
        String encodedName = encoder.encode("John");
        encodedName = encoder.encode("Doe");
        encodedName = encoder.encode("Jane");
        encodedName = encoder.encode("Jones");
        encodedName = encoder.encode("Jones");
        encodedName = encoder.encode("Jones");
        encodedName = encoder.encode("Jones");
        encodedName = encoder.encode("Jones");
        encodedName = encoder.encode("Jones");
        encodedName = encoder.encode("Jones");
        assertEquals("JNS", encodedName);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeWithAllStepsAndCoverage_PlEG8_2() {
        MatchRatingApproachEncoder encoder = new MatchRatingApproachEncoder();
        String encodedName = encoder.encode("John");
        encodedName = encoder.encode("Doe");
        encodedName = encoder.encode("Jane");
        encodedName = encoder.encode("Jones");
        encodedName = encoder.encode("Jones");
        encodedName = encoder.encode("Jones");
        encodedName = encoder.encode("Jones");
        encodedName = encoder.encode("Jones");
        encodedName = encoder.encode("Jones");
        encodedName = encoder.encode("Jones");
    }
}