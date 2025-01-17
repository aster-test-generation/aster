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

public class Aster_MatchRatingApproachEncoder_Test_Failing {
    @Test
    @Timeout(value = 5, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testLeftToRightThenRightToLeftProcessing2_XPsW1() {
        MatchRatingApproachEncoder encoder = new MatchRatingApproachEncoder();
        String name1 = "abc";
        String name2 = "abcd";
        int result = encoder.leftToRightThenRightToLeftProcessing(name1, name2);
        Assertions.assertEquals(1, result);
    }

    @Test
    @Timeout(value = 5, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testLeftToRightThenRightToLeftProcessing3_zuPm2() {
        MatchRatingApproachEncoder encoder = new MatchRatingApproachEncoder();
        String name1 = "abcd";
        String name2 = "abc";
        int result = encoder.leftToRightThenRightToLeftProcessing(name1, name2);
        Assertions.assertEquals(1, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetFirst3Last3ForNameWithMoreThan6Characters_YADR0() {
        MatchRatingApproachEncoder encoder = new MatchRatingApproachEncoder();
        String result = encoder.getFirst3Last3("abcefgg");
        assertEquals("abcefg", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testLeftToRightThenRightToLeftProcessing1_DMiO0() {
        MatchRatingApproachEncoder encoder = new MatchRatingApproachEncoder();
        String name1 = "abc";
        String name2 = "abc";
        int result = encoder.leftToRightThenRightToLeftProcessing(name1, name2);
        Assertions.assertEquals(0, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testLeftToRightThenRightToLeftProcessing4_Glvw3_fid1() {
        MatchRatingApproachEncoder encoder = new MatchRatingApproachEncoder();
        String name1 = "abcde";
        String name2 = "abc";
        int result = encoder.leftToRightThenRightToLeftProcessing(name1, name2);
        Assertions.assertEquals(2, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testLeftToRightThenRightToLeftProcessing5_Qhde4_fid1() {
        MatchRatingApproachEncoder encoder = new MatchRatingApproachEncoder();
        String name1 = "abc";
        String name2 = "abcde";
        int result = encoder.leftToRightThenRightToLeftProcessing(name1, name2);
        Assertions.assertEquals(2, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testRemoveVowels_bbvW0_fid1() {
        MatchRatingApproachEncoder encoder = new MatchRatingApproachEncoder();
        String result = encoder.removeVowels("Hello World");
        Assertions.assertEquals("Hll Wrld", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsEncodeEqualsDifferentLength_eWmu7_fid1() {
        MatchRatingApproachEncoder encoder = new MatchRatingApproachEncoder();
        boolean result = encoder.isEncodeEquals("test", "tseta");
        Assertions.assertFalse(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsEncodeEqualsDifferentLengthAfterProcessing_ggZb9_fid1() {
        MatchRatingApproachEncoder encoder = new MatchRatingApproachEncoder();
        boolean result = encoder.isEncodeEquals("tst", "tsta");
        Assertions.assertFalse(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testRemoveDoubleConsonants1_Snhy0_fid1() {
        MatchRatingApproachEncoder encoder = new MatchRatingApproachEncoder();
        String result = encoder.removeDoubleConsonants("Hello World");
        Assertions.assertEquals("HELLOWORLD", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testRemoveDoubleConsonants2_OcCR1() {
        MatchRatingApproachEncoder encoder = new MatchRatingApproachEncoder();
        String result = encoder.removeDoubleConsonants("Aa");
        Assertions.assertEquals("A", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testRemoveDoubleConsonants3_kSQX2_fid1() {
        MatchRatingApproachEncoder encoder = new MatchRatingApproachEncoder();
        String result = encoder.removeDoubleConsonants("Bbb");
        Assertions.assertEquals("B", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testRemoveAccentsAccentuatedInput_HPCe3_fid1() {
        MatchRatingApproachEncoder encoder = new MatchRatingApproachEncoder();
        String result = encoder.removeAccents("nave");
        Assertions.assertEquals("nive", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetFirst3Last3ForNameWithMoreThan6Characters_YADR0_fid1() {
        MatchRatingApproachEncoder encoder = new MatchRatingApproachEncoder();
        String result = encoder.getFirst3Last3("abcdefg");
        assertEquals("abcdef", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeValidString_cmvS4_fid1() {
        MatchRatingApproachEncoder encoder = new MatchRatingApproachEncoder();
        String result = encoder.encode("hello");
        assertEquals("hll", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeStringWithVowels_YwXE5() {
        MatchRatingApproachEncoder encoder = new MatchRatingApproachEncoder();
        String result = encoder.encode("aeiou");
        assertEquals("", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeStringWithDoubleConsonants_WnpX6_fid1() {
        MatchRatingApproachEncoder encoder = new MatchRatingApproachEncoder();
        String result = encoder.encode("bbcc");
        assertEquals("bcc", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeStringWithVowelsAndDoubleConsonants_vtCl7_fid1() {
        MatchRatingApproachEncoder encoder = new MatchRatingApproachEncoder();
        String result = encoder.encode("aeiobbcc");
        assertEquals("bbcc", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeStringWithAllCharacters_DtOa8_fid1() {
        MatchRatingApproachEncoder encoder = new MatchRatingApproachEncoder();
        String result = encoder.encode("aeioubbcc");
        assertEquals("bbcc", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeValidString_Fyii0_nSRY0() {
        MatchRatingApproachEncoder encoder = new MatchRatingApproachEncoder();
        String validString = "test";
        try {
            String result = encoder.encode(validString);
            assertEquals("test", result);
        } catch (Exception e) {
            fail("No exception should be thrown");
        }
    }
}