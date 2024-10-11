/**
 * Generated by Aster
 */
package org.apache.commons.codec.language;

import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_MatchRatingApproachEncoder_Test_Failing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testRemoveVowelsWithVowelStartingName_MICx0_fid1() {
        MatchRatingApproachEncoder encoder = new MatchRatingApproachEncoder();
        String result = encoder.removeVowels("Alexander");
        assertEquals("Alxndr", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testRemoveVowelsWithConsonantStartingName_GDUp1_fid1() {
        MatchRatingApproachEncoder encoder = new MatchRatingApproachEncoder();
        String result = encoder.removeVowels("Christopher");
        assertEquals("C hrstphr", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCleanNameWithSpacesAndAccents_BqjU1_fid1() {
        MatchRatingApproachEncoder encoder = new MatchRatingApproachEncoder();
        String result = encoder.cleanName("Jos lvarez   ");
        assertEquals("JOSEALVAREZ", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testRemoveDoubleConsonants_AllDouble_kFjC0_fid1() {
        MatchRatingApproachEncoder encoder = new MatchRatingApproachEncoder();
        String result = encoder.removeDoubleConsonants("BBOOKK");
        assertEquals("BOK", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testRemoveDoubleConsonants_MixedDoubleSingle_ZNpH1_fid1() {
        MatchRatingApproachEncoder encoder = new MatchRatingApproachEncoder();
        String result = encoder.removeDoubleConsonants("BALLOON");
        assertEquals("BALON", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testRemoveAccentsWithAccentedCharacters_pzET0_fid1() {
        MatchRatingApproachEncoder encoder = new MatchRatingApproachEncoder();
        String result = encoder.removeAccents("Caf lve");
        assertEquals("Cafe Eleve", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsEncodeEqualsWithDifferentNames_lPWM5_fid1() {
        MatchRatingApproachEncoder encoder = new MatchRatingApproachEncoder();
        assertFalse(encoder.isEncodeEquals("John", "Jane"));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCompletelyDifferentNames_GaFm1_fid1() {
        MatchRatingApproachEncoder encoder = new MatchRatingApproachEncoder();
        String name1 = "John";
        String name2 = "Doe";
        int result = encoder.leftToRightThenRightToLeftProcessing(name1, name2);
        assertEquals(4, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testNamesWithDifferentLengths_IcBC3_fid1() {
        MatchRatingApproachEncoder encoder = new MatchRatingApproachEncoder();
        String name1 = "Sam";
        String name2 = "Samantha";
        int result = encoder.leftToRightThenRightToLeftProcessing(name1, name2);
        assertEquals(3, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testNamesWithCaseDifference_ikrQ4_fid1() {
        MatchRatingApproachEncoder encoder = new MatchRatingApproachEncoder();
        String name1 = "case";
        String name2 = "CASE";
        int result = encoder.leftToRightThenRightToLeftProcessing(name1, name2);
        assertEquals(6, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncode_RemoveVowelsResultsInEmpty_CawB5() {
        MatchRatingApproachEncoder encoder = new MatchRatingApproachEncoder();
        String result = encoder.encode("AEIOU");
        assertEquals("", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncode_NormalName_JkdC6_fid1() {
        MatchRatingApproachEncoder encoder = new MatchRatingApproachEncoder();
        String result = encoder.encode("Christopher");
        assertEquals("CPHR", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncode_NameWithSpacesAndPunctuation_JtTS7_fid1() {
        MatchRatingApproachEncoder encoder = new MatchRatingApproachEncoder();
        String result = encoder.encode("John Doe-Smith!");
        assertEquals("JDSM", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncode_LongName_aVwH8_fid1() {
        MatchRatingApproachEncoder encoder = new MatchRatingApproachEncoder();
        String result = encoder.encode("Maximilianus");
        assertEquals("MXMLS", result);
    }
}