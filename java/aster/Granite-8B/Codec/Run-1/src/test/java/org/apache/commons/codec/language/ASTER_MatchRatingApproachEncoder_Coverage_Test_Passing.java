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

public class Aster_MatchRatingApproachEncoder_Coverage_Test_Passing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testLeftToRightThenRightToLeftProcessingWithEmptyStrings_BbTU6() {
        MatchRatingApproachEncoder encoder = new MatchRatingApproachEncoder();
        assertEquals(6, encoder.leftToRightThenRightToLeftProcessing("", ""));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testLeftToRightThenRightToLeftProcessingWithSingleCharacterStrings_PfXR1() {
        MatchRatingApproachEncoder encoder = new MatchRatingApproachEncoder();
        assertEquals(6, encoder.leftToRightThenRightToLeftProcessing("a", "a"));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testLeftToRightThenRightToLeftProcessingWithLongerStrings_XHKo2() {
        MatchRatingApproachEncoder encoder = new MatchRatingApproachEncoder();
        assertEquals(0, encoder.leftToRightThenRightToLeftProcessing("abcdef", "cdefab"));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testLeftToRightThenRightToLeftProcessingWithDifferentStrings_zcfu3() {
        MatchRatingApproachEncoder encoder = new MatchRatingApproachEncoder();
        assertEquals(3, encoder.leftToRightThenRightToLeftProcessing("abc", "xyz"));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testRemoveAccentsWithNullInput_GGka0() {
        MatchRatingApproachEncoder encoder = new MatchRatingApproachEncoder();
        String result = encoder.removeAccents(null);
        assertEquals(null, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testRemoveAccentsWithEmptyInput_MCVd1() {
        MatchRatingApproachEncoder encoder = new MatchRatingApproachEncoder();
        String result = encoder.removeAccents("");
        assertEquals("", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testRemoveAccentsWithAccentedInput_CAbM2() {
        MatchRatingApproachEncoder encoder = new MatchRatingApproachEncoder();
        String input = "";
        String expected = "";
        String result = encoder.removeAccents(input);
        assertEquals(expected, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testRemoveAccentsWithNonAccentedInput_zmLH3() {
        MatchRatingApproachEncoder encoder = new MatchRatingApproachEncoder();
        String input = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        String expected = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        String result = encoder.removeAccents(input);
        assertEquals(expected, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeWithNonStringObject_GXJT0() throws org.apache.commons.codec.EncoderException {
        MatchRatingApproachEncoder encoder = new MatchRatingApproachEncoder();
        Object object = new Object();
        try {
            encoder.encode(object);
            fail("EncoderException expected");
        } catch (EncoderException e) {
            assertTrue(e.getMessage().contains("Parameter supplied to Match Rating Approach encoder is not of type java.lang.String"));
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeWithStringObject_dLTy1() throws org.apache.commons.codec.EncoderException {
        MatchRatingApproachEncoder encoder = new MatchRatingApproachEncoder();
        String input = "EXMPL";
        String output = encoder.encode(input);
        assertEquals("EXMPL", output);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeWithCleanedName_rKJR4() {
        MatchRatingApproachEncoder encoder = new MatchRatingApproachEncoder();
        String name = "A B C";
        String encodedName = encoder.encode(name);
        assertEquals("ABC", encodedName);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncode_lunH0() {
        MatchRatingApproachEncoder encoder = new MatchRatingApproachEncoder();
        String encodedName = encoder.encode("JJHN");
        assertEquals("JHN", encodedName);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncode2_CPhA1() {
        MatchRatingApproachEncoder encoder = new MatchRatingApproachEncoder();
        String encodedName = encoder.encode("JJNe");
        assertEquals("JN", encodedName);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncode4_WofB3() {
        MatchRatingApproachEncoder encoder = new MatchRatingApproachEncoder();
        String encodedName = encoder.encode("Jane Doe");
        assertEquals("JND", encodedName);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncode5_TNWq4() {
        MatchRatingApproachEncoder encoder = new MatchRatingApproachEncoder();
        String encodedName = encoder.encode("John Jane Doe");
        assertEquals("JHNJND", encodedName);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncode6_qYaM5() {
        MatchRatingApproachEncoder encoder = new MatchRatingApproachEncoder();
        String encodedName = encoder.encode("John Jane Doe");
    }
}