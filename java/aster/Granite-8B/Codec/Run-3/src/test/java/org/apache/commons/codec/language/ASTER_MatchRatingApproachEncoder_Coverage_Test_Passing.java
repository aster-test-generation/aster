/**
 * Generated by Aster
 */
package org.apache.commons.codec.language;

import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_MatchRatingApproachEncoder_Coverage_Test_Passing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testRemoveAccentsWithNullInput_LjsR0() {
        MatchRatingApproachEncoder encoder = new MatchRatingApproachEncoder();
        String result = encoder.removeAccents(null);
        assertEquals(null, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testRemoveAccentsWithEmptyInput_HCQf1() {
        MatchRatingApproachEncoder encoder = new MatchRatingApproachEncoder();
        String result = encoder.removeAccents("");
        assertEquals("", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testRemoveAccentsWithNonAccentedInput_KRxk3() {
        MatchRatingApproachEncoder encoder = new MatchRatingApproachEncoder();
        String input = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        String expected = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        String result = encoder.removeAccents(input);
        assertEquals(expected, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    void testEncodeNull_upGP0() {
        MatchRatingApproachEncoder encoder = new MatchRatingApproachEncoder();
        assertEquals("", encoder.encode(null));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    void testEncodeEmpty_vvVa1() {
        MatchRatingApproachEncoder encoder = new MatchRatingApproachEncoder();
        assertEquals("", encoder.encode(""));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    void testEncodeSingleChar_SUTB3() {
        MatchRatingApproachEncoder encoder = new MatchRatingApproachEncoder();
        assertEquals("", encoder.encode("a"));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testNullName1_NLPS0() {
        MatchRatingApproachEncoder encoder = new MatchRatingApproachEncoder();
        boolean result = encoder.isEncodeEquals(null, "name2");
        assertTrue(!result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testNullName2_Puah1() {
        MatchRatingApproachEncoder encoder = new MatchRatingApproachEncoder();
        boolean result = encoder.isEncodeEquals("name1", null);
        assertTrue(!result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEmptyName1_jiaa2() {
        MatchRatingApproachEncoder encoder = new MatchRatingApproachEncoder();
        boolean result = encoder.isEncodeEquals("", "name2");
        assertTrue(!result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEmptyName2_gDlw3() {
        MatchRatingApproachEncoder encoder = new MatchRatingApproachEncoder();
        boolean result = encoder.isEncodeEquals("name1", "");
        assertTrue(!result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testName1LengthOne_gZnn4() {
        MatchRatingApproachEncoder encoder = new MatchRatingApproachEncoder();
        boolean result = encoder.isEncodeEquals("a", "name2");
        assertTrue(!result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testName2LengthOne_SumB5() {
        MatchRatingApproachEncoder encoder = new MatchRatingApproachEncoder();
        boolean result = encoder.isEncodeEquals("name1", "a");
        assertTrue(!result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testName1AndName2Equal_kUxt6() {
        MatchRatingApproachEncoder encoder = new MatchRatingApproachEncoder();
        boolean result = encoder.isEncodeEquals("name1", "name1");
        assertTrue(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testLeftToRightThenRightToLeftProcessingWithEmptyNames_Kpse6() {
        MatchRatingApproachEncoder encoder = new MatchRatingApproachEncoder();
        assertEquals(6, encoder.leftToRightThenRightToLeftProcessing("", ""));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testLeftToRightThenRightToLeftProcessingWithSingleLetterNames_QOif1_fid1() {
        MatchRatingApproachEncoder encoder = new MatchRatingApproachEncoder();
        assertEquals(6, encoder.leftToRightThenRightToLeftProcessing("a", "a"));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testLeftToRightThenRightToLeftProcessingWithNamesOfDifferentSizes_WaAs2_fid1() {
        MatchRatingApproachEncoder encoder = new MatchRatingApproachEncoder();
        assertEquals(5, encoder.leftToRightThenRightToLeftProcessing("abc", "abcd"));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testLeftToRightThenRightToLeftProcessingWithNamesOfSameSize_cXTt3_fid1() {
        MatchRatingApproachEncoder encoder = new MatchRatingApproachEncoder();
        assertEquals(6, encoder.leftToRightThenRightToLeftProcessing("abcd", "abcd"));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testLeftToRightThenRightToLeftProcessingWithNamesOfDifferentSizesAndPartialMatch_QwlX4_fid1() {
        MatchRatingApproachEncoder encoder = new MatchRatingApproachEncoder();
        assertEquals(5, encoder.leftToRightThenRightToLeftProcessing("abcd", "abcde"));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testLeftToRightThenRightToLeftProcessingWithNamesOfDifferentSizesAndPartialMatchInReverse_YaxA5_fid1() {
        MatchRatingApproachEncoder encoder = new MatchRatingApproachEncoder();
        assertEquals(5, encoder.leftToRightThenRightToLeftProcessing("abcde", "abcd"));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testLeftToRightThenRightToLeftProcessingWithNamesOfDifferentSizesAndCompleteMatchInReverse_xRNe6_fid1() {
        MatchRatingApproachEncoder encoder = new MatchRatingApproachEncoder();
        assertEquals(2, encoder.leftToRightThenRightToLeftProcessing("abcde", "edcba"));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    void testEncodeMultipleChars_ZNbo4_fid1() {
        MatchRatingApproachEncoder encoder = new MatchRatingApproachEncoder();
        assertEquals("AB", encoder.encode("AB"));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testName1AndName2Different_atKC7_fid1() {
        MatchRatingApproachEncoder encoder = new MatchRatingApproachEncoder();
        boolean result = encoder.isEncodeEquals("name1", "name2");
        assertFalse(!result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testName1AndName2DifferentAfterRemovingVowels_SEqa9_fid1() {
        MatchRatingApproachEncoder encoder = new MatchRatingApproachEncoder();
        boolean result = encoder.isEncodeEquals("name1a", "name2a");
        assertFalse(!result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testName1AndName2DifferentAfterRemovingDoubleConsonants_uHme10_fid1() {
        MatchRatingApproachEncoder encoder = new MatchRatingApproachEncoder();
        boolean result = encoder.isEncodeEquals("name1aa", "name2aa");
        assertFalse(!result);
    }
}