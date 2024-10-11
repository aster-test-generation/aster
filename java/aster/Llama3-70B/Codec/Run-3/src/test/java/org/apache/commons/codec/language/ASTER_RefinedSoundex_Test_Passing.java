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

public class Aster_RefinedSoundex_Test_Passing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncode_String_lbbj0() throws Exception {
        RefinedSoundex soundex = new RefinedSoundex();
        String result = (String) soundex.encode("Hello");
        assertEquals("H400", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncode_eeqY0() throws Exception {
        RefinedSoundex soundex = new RefinedSoundex();
        String result = soundex.encode("Hello");
        assertEquals("H400", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncode_withMapping_PwBq1() throws Exception {
        RefinedSoundex soundex = new RefinedSoundex("01230120022455012623010202");
        String result = soundex.encode("Hello");
        assertEquals("H400", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncode_withCharArrayMapping_WRRd2() throws Exception {
        char[] mapping = "01230120022455012623010202".toCharArray();
        RefinedSoundex soundex = new RefinedSoundex(mapping);
        String result = soundex.encode("Hello");
        assertEquals("H400", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSoundexNull_bJuU0() throws Exception {
        RefinedSoundex refinedSoundex = new RefinedSoundex();
        assertNull(refinedSoundex.soundex(null));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSoundexEmpty_XVLo1() throws Exception {
        RefinedSoundex refinedSoundex = new RefinedSoundex();
        assertEquals("", refinedSoundex.soundex(""));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSoundexSingleCharacter_MeOR2() throws Exception {
        RefinedSoundex refinedSoundex = new RefinedSoundex();
        assertEquals("A", refinedSoundex.soundex("A"));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSoundexMultipleCharacters_eFLD3() throws Exception {
        RefinedSoundex refinedSoundex = new RefinedSoundex();
        assertEquals("A123", refinedSoundex.soundex("Apple"));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSoundexConsecutiveDuplicates_Akun4() throws Exception {
        RefinedSoundex refinedSoundex = new RefinedSoundex();
        assertEquals("A12", refinedSoundex.soundex("Aabbcc"));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSoundexNonConsecutiveDuplicates_tdfY5() throws Exception {
        RefinedSoundex refinedSoundex = new RefinedSoundex();
        assertEquals("A12", refinedSoundex.soundex("AbcaBc"));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetMappingCode_nonLetter_VlGI0() throws Exception {
        RefinedSoundex refinedSoundex = new RefinedSoundex();
        char result = refinedSoundex.getMappingCode('!');
        assert result == 0;
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetMappingCode_upperCaseLetter_Zlqd1() throws Exception {
        RefinedSoundex refinedSoundex = new RefinedSoundex("01230120022455012623010202".toCharArray());
        char result = refinedSoundex.getMappingCode('A');
        assert result == '0';
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetMappingCode_lowerCaseLetter_LqOf2() throws Exception {
        RefinedSoundex refinedSoundex = new RefinedSoundex("01230120022455012623010202".toCharArray());
        char result = refinedSoundex.getMappingCode('a');
        assert result == '0';
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDifference_YpBt0() throws Exception {
        RefinedSoundex refinedSoundex = new RefinedSoundex();
        try {
            int result = refinedSoundex.difference("hello", "hallo");
            assert result == 2;
        } catch (EncoderException e) {
            fail("EncoderException should not be thrown");
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDifference_WithMapping_tlpP1() throws Exception {
        char[] mapping = {'a', 'b', 'c'};
        RefinedSoundex refinedSoundex = new RefinedSoundex(mapping);
        try {
            int result = refinedSoundex.difference("hello", "hallo");
            assert result == 2;
        } catch (EncoderException e) {
            fail("EncoderException should not be thrown");
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDifference_WithStringMapping_JOmV2() throws Exception {
        RefinedSoundex refinedSoundex = new RefinedSoundex("abc");
        try {
            int result = refinedSoundex.difference("hello", "hallo");
            assert result == 2;
        } catch (EncoderException e) {
            fail("EncoderException should not be thrown");
        }
    }
}