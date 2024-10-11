/**
 * Generated by Aster
 */
package org.apache.commons.codec.language;

import java.util.concurrent.TimeUnit;
import org.apache.commons.codec.EncoderException;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_Soundex_Test_Passing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDifference_Yjyv0() throws Exception {
        Soundex soundex = new Soundex("mapping");
        assertEquals(1, soundex.difference("abc", "def"));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDifference2_knog1() throws Exception {
        Soundex soundex = new Soundex("mapping", true);
        assertEquals(2, soundex.difference("abc", "def"));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDifference3_uOnI2() throws Exception {
        Soundex soundex = new Soundex(new char[]{'a', 'b', 'c'});
        assertEquals(3, soundex.difference("abc", "abc"));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeValidString_ZSZi0() throws Exception {
        Soundex soundex = new Soundex();
        Object result = soundex.encode("Smith");
        assert result instanceof String;
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeInvalidParameter_zLLn1() throws Exception {
        Soundex soundex = new Soundex();
        try {
            soundex.encode(123);
            assert false;
        } catch (EncoderException e) {
            assert true;
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetMaxLength_hOJc0() throws Exception {
        Soundex soundex = new Soundex();
        assertEquals(0, soundex.getMaxLength());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetMaxLengthWithMapping_IhLs1() throws Exception {
        Soundex soundex = new Soundex("mapping");
        assertEquals(0, soundex.getMaxLength());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetMaxLengthWithSpecialCaseHW_tYrc2() throws Exception {
        Soundex soundex = new Soundex("mapping", true);
        assertEquals(0, soundex.getMaxLength());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetMaxLengthWithCharArrayMapping_rROn3() throws Exception {
        Soundex soundex = new Soundex(new char[]{'m', 'a', 'p', 'p', 'i', 'n', 'g'});
        assertEquals(0, soundex.getMaxLength());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncode_jEAe0() throws Exception {
        Soundex soundex = new Soundex();
        String result = soundex.encode("Smith");
        assertEquals("S530", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetMaxLength_oFje0() throws Exception {
        Soundex soundex = new Soundex();
        soundex.setMaxLength(5);
        assertEquals(5, soundex.getMaxLength());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetMaxLengthWithMapping_qNZO1() throws Exception {
        Soundex soundex = new Soundex();
        soundex.setMaxLength(7);
        assertEquals(7, soundex.getMaxLength());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetMaxLengthWithSpecialCaseHW_iuGc2() throws Exception {
        Soundex soundex = new Soundex("", true);
        soundex.setMaxLength(3);
        assertEquals(3, soundex.getMaxLength());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetMaxLengthWithCharArrayMapping_EuCo3() throws Exception {
        Soundex soundex = new Soundex(new char[]{});
        soundex.setMaxLength(9);
        assertEquals(9, soundex.getMaxLength());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSoundexNull_hStP0() throws Exception {
        Soundex soundex = new Soundex();
        assertEquals(null, soundex.soundex(null));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSoundexEmptyString_Dwnn1() throws Exception {
        Soundex soundex = new Soundex();
        assertEquals("", soundex.soundex(""));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSoundexSingleCharacter_MabS2() throws Exception {
        Soundex soundex = new Soundex();
        assertEquals("0", soundex.soundex("A"));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSoundexTwoCharacters_wYUt3() throws Exception {
        Soundex soundex = new Soundex();
        assertEquals("A0", soundex.soundex("Ab"));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSoundexThreeCharacters_CigC4() throws Exception {
        Soundex soundex = new Soundex();
        assertEquals("A100", soundex.soundex("Abr"));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSoundexFourCharacters_ZNJr5() throws Exception {
        Soundex soundex = new Soundex();
        assertEquals("A110", soundex.soundex("Abra"));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSoundexFiveCharacters_VgQO6() throws Exception {
        Soundex soundex = new Soundex();
        assertEquals("A1100", soundex.soundex("Abrah"));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSoundexSixCharacters_WMfX7() throws Exception {
        Soundex soundex = new Soundex();
        assertEquals("A1100", soundex.soundex("Abrahm"));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSoundexSevenCharacters_psTg8() throws Exception {
        Soundex soundex = new Soundex();
        assertEquals("A1100", soundex.soundex("Abraham"));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSoundexEightCharacters_WvPl9() throws Exception {
        Soundex soundex = new Soundex();
        assertEquals("A1100", soundex.soundex("Abraham1"));
    }
}