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

public class Aster_MatchRatingApproachEncoder_Coverage_Test_Passing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testRemoveAccents_negative_dUDX1() {
        MatchRatingApproachEncoder encoder = new MatchRatingApproachEncoder();
        String accentedWord = "accented";
        String expected = "accented";
        String actual = encoder.removeAccents(accentedWord);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeWithNonStringObject_lsRK0() throws org.apache.commons.codec.EncoderException {
        MatchRatingApproachEncoder encoder = new MatchRatingApproachEncoder();
        assertThrows(EncoderException.class, () -> encoder.encode(new Object()));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsEncodeEquals_NullName1_ihyo0() {
        MatchRatingApproachEncoder encoder = new MatchRatingApproachEncoder();
        assertFalse(encoder.isEncodeEquals(null, "Smith"));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsEncodeEquals_EmptyName1_MIOM1() {
        MatchRatingApproachEncoder encoder = new MatchRatingApproachEncoder();
        assertFalse(encoder.isEncodeEquals("", "Smith"));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsEncodeEquals_NullName2_iyjV3() {
        MatchRatingApproachEncoder encoder = new MatchRatingApproachEncoder();
        assertFalse(encoder.isEncodeEquals("John", null));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsEncodeEquals_EmptyName2_YYHD4() {
        MatchRatingApproachEncoder encoder = new MatchRatingApproachEncoder();
        assertFalse(encoder.isEncodeEquals("John", ""));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsEncodeEquals_Length1Name1_duzs6() {
        MatchRatingApproachEncoder encoder = new MatchRatingApproachEncoder();
        assertFalse(encoder.isEncodeEquals("J", "Smith"));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsEncodeEquals_Length1Name2_uedw7() {
        MatchRatingApproachEncoder encoder = new MatchRatingApproachEncoder();
        assertFalse(encoder.isEncodeEquals("John", "S"));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsEncodeEquals_LengthDiffGreaterThan3_qciR8() {
        MatchRatingApproachEncoder encoder = new MatchRatingApproachEncoder();
        assertFalse(encoder.isEncodeEquals("John", "Smith"));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsEncodeEquals_LengthDiffLessThan3_QEzf9() {
        MatchRatingApproachEncoder encoder = new MatchRatingApproachEncoder();
        assertTrue(encoder.isEncodeEquals("John", "Jones"));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeNull_OUdc0() {
        MatchRatingApproachEncoder encoder = new MatchRatingApproachEncoder();
        assertEquals("", encoder.encode(null));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeEmpty_ismh1() {
        MatchRatingApproachEncoder encoder = new MatchRatingApproachEncoder();
        assertEquals("", encoder.encode(""));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeSingleChar_ticb2() {
        MatchRatingApproachEncoder encoder = new MatchRatingApproachEncoder();
        assertEquals("", encoder.encode("a"));
    }
}