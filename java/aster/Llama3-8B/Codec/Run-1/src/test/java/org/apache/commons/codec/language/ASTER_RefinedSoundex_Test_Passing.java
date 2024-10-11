/**
 * Generated by Aster
 */
package org.apache.commons.codec.language;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

import java.util.concurrent.TimeUnit;
import org.apache.commons.codec.EncoderException;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

public class Aster_RefinedSoundex_Test_Passing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSoundexNull_KSdL0() {
        RefinedSoundex soundex = new RefinedSoundex();
        String result = soundex.soundex(null);
        Assertions.assertNull(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSoundexEmpty_ftwo1() {
        RefinedSoundex soundex = new RefinedSoundex();
        String result = soundex.soundex("");
        Assertions.assertEquals("", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeNonString_woYz1() {
        RefinedSoundex soundex = new RefinedSoundex();
        try {
            soundex.encode(123);
            Assertions.fail("Expected EncoderException");
        } catch (EncoderException e) {
            Assertions.assertTrue(true);
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSoundexSingleChar_Dtps2_fid1() {
        RefinedSoundex soundex = new RefinedSoundex();
        String result = soundex.soundex("a");
        Assertions.assertEquals("A0", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSoundexMultipleChars_oVVy3_fid1() {
        RefinedSoundex soundex = new RefinedSoundex();
        String result = soundex.soundex("smith");
        Assertions.assertEquals("S38060", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSoundexConsecutiveSameChars_sDCc4_fid1() {
        RefinedSoundex soundex = new RefinedSoundex();
        String result = soundex.soundex("mississippi");
        Assertions.assertEquals("M80303010", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSoundexConsecutiveDifferentChars_PDRY5_fid1() {
        RefinedSoundex soundex = new RefinedSoundex();
        String result = soundex.soundex("smithson");
        Assertions.assertEquals("S38060308", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeString_gQnk0_fid1() {
        RefinedSoundex soundex = new RefinedSoundex();
        Object result = soundex.encode("Hello");
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncode_EqwH0_fid1() {
        RefinedSoundex soundex = new RefinedSoundex();
        String result = soundex.encode("John");
        assertEquals("J408", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncode2_XXIa1_fid1() {
        RefinedSoundex soundex = new RefinedSoundex();
        String result = soundex.encode("Smith");
        assertEquals("S38060", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDifference2_gYMY1_vWPB0() {
        RefinedSoundex soundex = new RefinedSoundex();
        try {
            assertEquals('0', soundex.getMappingCode('a'));
        } catch (Exception e) {
            fail("Unexpected exception");
        }
    }
}