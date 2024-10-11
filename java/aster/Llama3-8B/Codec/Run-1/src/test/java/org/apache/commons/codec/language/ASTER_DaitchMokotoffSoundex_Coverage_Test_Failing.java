/**
 * Generated by Aster
 */
package org.apache.commons.codec.language;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

public class Aster_DaitchMokotoffSoundex_Coverage_Test_Failing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testNullSource_Ccwe0() {
        DaitchMokotoffSoundex soundex = new DaitchMokotoffSoundex();
        String result = soundex.soundex(null);
        assertNull(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testNullSource_ZBeJ0() {
        DaitchMokotoffSoundex soundex = new DaitchMokotoffSoundex();
        String result = soundex.soundex(null);
        assert result == null;
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testNoRules_QDxi2() {
        DaitchMokotoffSoundex soundex = new DaitchMokotoffSoundex();
        String source = "xyz";
        String result = soundex.soundex(source);
        assert result == "X000";
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSingleReplacement_fTJu3() {
        DaitchMokotoffSoundex soundex = new DaitchMokotoffSoundex();
        String source = "John";
        String result = soundex.soundex(source);
        assert result == "J000";
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testMultipleReplacements_YcQm4() {
        DaitchMokotoffSoundex soundex = new DaitchMokotoffSoundex();
        String source = "Johns";
        String result = soundex.soundex(source);
        assert result == "J000";
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testBranching_WEWf5() {
        DaitchMokotoffSoundex soundex = new DaitchMokotoffSoundex(true);
        String source = "Mann";
        String result = soundex.soundex(source);
        assert result == "M000";
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testForceReplacement_ySdg6() {
        DaitchMokotoffSoundex soundex = new DaitchMokotoffSoundex();
        String source = "mn";
        String result = soundex.soundex(source);
        assert result == "M000";
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testForceReplacement2_tHgz7() {
        DaitchMokotoffSoundex soundex = new DaitchMokotoffSoundex();
        String source = "nm";
        String result = soundex.soundex(source);
        assert result == "M000";
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testMultipleBranches_xUGM8() {
        DaitchMokotoffSoundex soundex = new DaitchMokotoffSoundex(true);
        String source = "Manning";
        String result = soundex.soundex(source);
        assert result == "M000|N000";
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSoundexWithWhitespace_SFTR0_fid1() {
        DaitchMokotoffSoundex soundex = new DaitchMokotoffSoundex();
        String result = soundex.soundex("John Smith");
        assertEquals("J540", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSoundexWithFolding_aRPF1_fid1() {
        DaitchMokotoffSoundex soundex = new DaitchMokotoffSoundex(true);
        String result = soundex.soundex("Koch");
        assertEquals("K000", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSoundexWithNonAlphaCharacters_aNXY2_fid1() {
        DaitchMokotoffSoundex soundex = new DaitchMokotoffSoundex();
        String result = soundex.soundex("John$Smith");
        assertEquals("J540", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSoundexWithNonAlphaCharactersAndFolding_Bxus3_fid1() {
        DaitchMokotoffSoundex soundex = new DaitchMokotoffSoundex(true);
        String result = soundex.soundex("Koch+");
        assertEquals("K000", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEmptySource_sVxt1() {
        DaitchMokotoffSoundex soundex = new DaitchMokotoffSoundex();
        String result = soundex.soundex("");
        assertEquals("", result);
    }
}