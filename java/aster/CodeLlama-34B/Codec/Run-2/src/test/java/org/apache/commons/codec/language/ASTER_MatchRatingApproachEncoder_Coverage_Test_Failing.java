/**
 * Generated by Aster
 */
package org.apache.commons.codec.language;

import java.util.concurrent.TimeUnit;
import org.apache.commons.codec.EncoderException;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_MatchRatingApproachEncoder_Coverage_Test_Failing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeWithNullObject_JUmE2() throws org.apache.commons.codec.EncoderException {
        MatchRatingApproachEncoder encoder = new MatchRatingApproachEncoder();
        assertThrows(EncoderException.class, () -> encoder.encode(null));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testRemoveAccents_positive_Ggjj0() {
        MatchRatingApproachEncoder encoder = new MatchRatingApproachEncoder();
        String accentedWord = "accnted";
        String expected = "accented";
        String actual = encoder.removeAccents(accentedWord);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeWithStringObject_JtGm1() throws org.apache.commons.codec.EncoderException {
        MatchRatingApproachEncoder encoder = new MatchRatingApproachEncoder();
        String input = "test";
        String expected = "test";
        String actual = encoder.encode(input);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsEncodeEquals_MinRatingGreaterThanCount_ntme10_fid1() {
        MatchRatingApproachEncoder encoder = new MatchRatingApproachEncoder();
        assertFalse(encoder.isEncodeEquals("John", "Jones"));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeNameWithoutVowels_VyBM3() {
        MatchRatingApproachEncoder encoder = new MatchRatingApproachEncoder();
        assertEquals("", encoder.encode("bcdf"));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeNameWithDoubleConsonants_UQIl4() {
        MatchRatingApproachEncoder encoder = new MatchRatingApproachEncoder();
        assertEquals("", encoder.encode("bbcdf"));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeNameWithVowelsAndDoubleConsonantsAndSpecialChars_chMz6() {
        MatchRatingApproachEncoder encoder = new MatchRatingApproachEncoder();
        assertEquals("", encoder.encode("bbcdf!@#$%^&*()_+"));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeNameWithVowelsAndDoubleConsonantsAndSpecialCharsAndNumbers_pyJL7() {
        MatchRatingApproachEncoder encoder = new MatchRatingApproachEncoder();
        assertEquals("", encoder.encode("bbcdf!@#$%^&*()_+1234567890"));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeNameWithVowelsAndDoubleConsonantsAndSpecialCharsAndNumbersAndWhitespaceAndNewline_GjHb9() {
        MatchRatingApproachEncoder encoder = new MatchRatingApproachEncoder();
        assertEquals("", encoder.encode("bbcdf!@#$%^&*()_+1234567890 \n"));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeNameWithVowelsAndDoubleConsonantsAndSpecialCharsAndNumbersAndWhitespaceAndNewlineAndTab_vssd10() {
        MatchRatingApproachEncoder encoder = new MatchRatingApproachEncoder();
        assertEquals("", encoder.encode("bbcdf!@#$%^&*()_+1234567890 \n\t"));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeNameWithVowelsAndDoubleConsonantsAndSpecialCharsAndNumbersAndWhitespaceAndNewlineAndTabAndBackslash_cayC11() {
        MatchRatingApproachEncoder encoder = new MatchRatingApproachEncoder();
        assertEquals("", encoder.encode("bbcdf!@#$%^&*()_+1234567890 \n\t\\"));
    }
}