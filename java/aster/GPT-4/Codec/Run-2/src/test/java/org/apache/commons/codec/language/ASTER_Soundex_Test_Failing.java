/**
 * Generated by Aster
 */
package org.apache.commons.codec.language;

import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_Soundex_Test_Failing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetMaxLength_DefaultConstructor_EUgg0() {
        Soundex soundex = new Soundex();
        assertEquals(0, soundex.getMaxLength());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSoundex_AllSilentMarkers_RHto2() {
        Soundex soundex = new Soundex("00000000000000000000000000");
        String result = soundex.soundex("AEIOU");
        assertEquals("0000", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSoundex_DifferentCaseLetters_iZUW7() {
        Soundex soundex = new Soundex("01230120022455012623010202");
        String result = soundex.soundex("JacksonJACKSON");
        assertEquals("J250", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSoundex_WithNumbers_efPl8() {
        Soundex soundex = new Soundex("01230120022455012623010202");
        String result = soundex.soundex("J4cks0n");
        assertEquals("J250", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSoundex_LongString_ssjp10() {
        Soundex soundex = new Soundex("01230120022455012623010202");
        String result = soundex.soundex("Pneumonoultramicroscopicsilicovolcanoconiosis");
        assertEquals("P525", result);
    }
}