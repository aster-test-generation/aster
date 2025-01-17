/**
 * Generated by Aster
 */
package org.apache.commons.codec.language;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

import java.util.concurrent.TimeUnit;
import org.apache.commons.codec.EncoderException;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

public class Aster_Soundex_Test_Passing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSoundex_nullInput_ajka0() {
        Soundex soundex = new Soundex();
        assertNull(soundex.soundex(null));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSoundex_emptyInput_fNfR1() {
        Soundex soundex = new Soundex();
        assertEquals("", soundex.soundex(""));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetMaxLength_default_khIQ0() {
        Soundex soundex = new Soundex();
        int maxLength = soundex.getMaxLength();
        assertEquals(4, maxLength);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetMaxLength_invalidMapping_VYsl3() {
        Soundex soundex = new Soundex(new char[]{'A', 'B', 'C', 'D', 'E'});
        int maxLength = soundex.getMaxLength();
        assertEquals(4, maxLength);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncode_String_ZVyA0() {
        Soundex soundex = new Soundex();
        String input = "Hello";
        String expected = "H400";
        String actual = soundex.encode(input);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetMaxLength1_XMgc0() {
        Soundex soundex = new Soundex();
        soundex.setMaxLength(10);
        assertEquals(10, soundex.getMaxLength());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetMaxLength4_NsCW3() {
        Soundex soundex = new Soundex(new char[]{'a', 'b', 'c'});
        soundex.setMaxLength(10);
        assertEquals(10, soundex.getMaxLength());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncode_emptyString_gAbv0() {
        Soundex soundex = new Soundex();
        assertEquals("", soundex.encode(""));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetMaxLength_specialCaseHW_uMaB1_mkqn0() {
        Soundex soundex = new Soundex("HW", true);
        int maxLength = soundex.getMaxLength();
        assertEquals(4, maxLength);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetMaxLength2_VezC1_zHtV0() {
        Soundex soundex = new Soundex("abc");
        soundex.setMaxLength(10);
        assertEquals(10, soundex.getMaxLength());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetMaxLength3_YeCr2_Ccsz0() {
        Soundex soundex = new Soundex("abc", true);
        soundex.setMaxLength(10);
        assertEquals(10, soundex.getMaxLength());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSoundex_singleCharacterInput_Oemp2_fid1() {
        Soundex soundex = new Soundex();
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSoundex_differentDigits_DnlH5_fid1() {
        Soundex soundex = new Soundex();
        assertEquals("A120", soundex.soundex("ABC"));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetMaxLength_customMapping_zxnm2_fid1() {
        Soundex soundex = new Soundex(new char[]{'A', 'B', 'C', 'D', 'E'});
        int maxLength = soundex.getMaxLength();
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDifference1_dfGs0_fid1() throws EncoderException {
        Soundex soundex = new Soundex();
        int result = soundex.difference("hello", "world");
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDifference5_iFxC0() throws EncoderException {
        Soundex soundex = new Soundex();
        int result = soundex.difference("hello", "world");
        assertEquals(0, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSoundex_differentDigits_specialCaseHW_rbkO6_BifB0_fid1() {
        Soundex soundex = new Soundex("HW", true);
    }
}