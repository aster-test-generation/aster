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
    public void testRemoveAccents_withNonAccentedCharacter_yDAN1() {
        MatchRatingApproachEncoder encoder = new MatchRatingApproachEncoder();
        String accentedWord = "a";
        String expected = "a";
        String actual = encoder.removeAccents(accentedWord);
        assert actual.equals(expected);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsEncodeEqualsNullName1_Mujs0() {
        MatchRatingApproachEncoder encoder = new MatchRatingApproachEncoder();
        assertFalse(encoder.isEncodeEquals(null, "testName2"));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsEncodeEqualsEmptyName1_fvYi1() {
        MatchRatingApproachEncoder encoder = new MatchRatingApproachEncoder();
        assertFalse(encoder.isEncodeEquals("", "testName2"));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsEncodeEqualsNullName2_ADVS2() {
        MatchRatingApproachEncoder encoder = new MatchRatingApproachEncoder();
        assertFalse(encoder.isEncodeEquals("testName1", null));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsEncodeEqualsSingleCharacterName_Ktlp3() {
        MatchRatingApproachEncoder encoder = new MatchRatingApproachEncoder();
        assertFalse(encoder.isEncodeEquals("a", "testName2"));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncode_WithStringObject_ReturnsEncodedString_SdOM1() throws EncoderException {
        MatchRatingApproachEncoder encoder = new MatchRatingApproachEncoder();
        Object result = encoder.encode("testString");
        assertNotNull(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeNull_ifJr0() {
        MatchRatingApproachEncoder encoder = new MatchRatingApproachEncoder();
        assertEquals("", encoder.encode(null));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeEmpty_MhYl1() {
        MatchRatingApproachEncoder encoder = new MatchRatingApproachEncoder();
        assertEquals("", encoder.encode(""));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeSingleCharacter_yChO2() {
        MatchRatingApproachEncoder encoder = new MatchRatingApproachEncoder();
        assertEquals("", encoder.encode("a"));
    }
}