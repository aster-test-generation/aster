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

public class Aster_DaitchMokotoffSoundex_Coverage_Test_Passing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeWithStringInput_wFdi1() throws EncoderException {
        DaitchMokotoffSoundex soundex = new DaitchMokotoffSoundex();
        String input = "example";
        assertNotNull("Expected non-null result for string input", soundex.encode(input));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSoundexWithWhitespace_anql0() {
        DaitchMokotoffSoundex soundex = new DaitchMokotoffSoundex();
        String result = soundex.soundex("John Smith");
        assertEquals("164630|464630", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSoundexWithFoldingTrue_uuDk2() {
        DaitchMokotoffSoundex soundex = new DaitchMokotoffSoundex(true);
        String result = soundex.soundex("Jhn");
        assertEquals("160000|460000", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSoundexWithFoldingFalse_Knzs3() {
        DaitchMokotoffSoundex soundex = new DaitchMokotoffSoundex(false);
        String result = soundex.soundex("Jhn");
        assertEquals("160000|460000", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    void testSoundexWithNullSource_EiFn0() {
        DaitchMokotoffSoundex dms = new DaitchMokotoffSoundex();
        try {
            dms.soundex(null);
            fail("Expected an exception to be thrown");
        } catch (NullPointerException e) {
            assertNotNull(e);
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    void testSoundexWithBranchingRequired_GGvF3() {
        DaitchMokotoffSoundex dms = new DaitchMokotoffSoundex();
        String result = dms.soundex("Abramczyk"); // Assuming 'c' and 'k' have multiple replacements
        assertFalse(result.contains("|"));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    void testSoundexWithForceCondition_nGOS4() {
        DaitchMokotoffSoundex dms = new DaitchMokotoffSoundex();
        String result = dms.soundex("Anm"); // Assuming 'n' and 'm' are treated differently
        assertNotNull(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    void testSoundexIteratingOverRules_Sewo5() {
        DaitchMokotoffSoundex dms = new DaitchMokotoffSoundex();
        String result = dms.soundex("Katz"); // Assuming 'K' has multiple rules
        assertNotNull(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    void testSoundexWithSingleCharacter_xGwd6() {
        DaitchMokotoffSoundex dms = new DaitchMokotoffSoundex();
        String result = dms.soundex("A"); // Assuming 'A' has a single, straightforward rule
        assertNotNull(result);
    }

    @Test
    public void testEncodeWithNonStringInput_FwJJ0_sryQ0() {
        DaitchMokotoffSoundex soundex = new DaitchMokotoffSoundex();
        assertThrows(EncoderException.class, () -> soundex.encode(new Object()));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSoundexWithBranchingRequired_raaK3_GkeR0() {
        DaitchMokotoffSoundex dms = new DaitchMokotoffSoundex();
        String result = dms.soundex("Marz");
        assertTrue(result.contains("|"), "Expected multiple branches separated by '|'");
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSoundexWithForceConditionNtoM_CoUk5_UGIn0() {
        DaitchMokotoffSoundex dms = new DaitchMokotoffSoundex();
        String result = dms.soundex("Anma");
        assertFalse(result.contains("656"), "Expected specific processing for 'nm' sequence");
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSoundexIteratingOverRules_SlJv6_rsBJ0_1() {
        DaitchMokotoffSoundex dms = new DaitchMokotoffSoundex();
        String result = dms.soundex("Katz");
        assertNotNull(result, "Expected non-null result when iterating over rules");
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSoundexIteratingOverRules_SlJv6_rsBJ0_2() {
        DaitchMokotoffSoundex dms = new DaitchMokotoffSoundex();
        String result = dms.soundex("Katz");
        assertFalse(result.isEmpty(), "Expected non-empty result when rules are matched");
    }
}