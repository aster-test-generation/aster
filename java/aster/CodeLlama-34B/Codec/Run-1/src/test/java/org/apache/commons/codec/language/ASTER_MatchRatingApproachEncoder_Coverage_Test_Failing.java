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

public class Aster_MatchRatingApproachEncoder_Coverage_Test_Failing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testRemoveAccents_negative_JyqP1() {
        MatchRatingApproachEncoder encoder = new MatchRatingApproachEncoder();
        String accentedWord = "accentedWord";
        String expected = "accentedWord";
        String actual = encoder.removeAccents(accentedWord);
        assertNotEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncode_StringObject_SuEv1() throws org.apache.commons.codec.EncoderException {
        MatchRatingApproachEncoder encoder = new MatchRatingApproachEncoder();
        String input = "test";
        Object output = encoder.encode(input);
        assertEquals(input, output);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeNameWithVowels_mDzp3_fid1() {
        MatchRatingApproachEncoder encoder = new MatchRatingApproachEncoder();
        String encoded = encoder.encode("John Doe");
        assertEquals("Jhn D", encoded);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeNameWithDoubleConsonants_wsZq4_fid1() {
        MatchRatingApproachEncoder encoder = new MatchRatingApproachEncoder();
        String encoded = encoder.encode("Johh Doh");
        assertEquals("Jh Dh", encoded);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsEncodeEquals_CountGreaterThanMinRating_zmHU8_fid1() {
        MatchRatingApproachEncoder encoder = new MatchRatingApproachEncoder();
        assertTrue(encoder.isEncodeEquals("John", "Smith"));
    }
}