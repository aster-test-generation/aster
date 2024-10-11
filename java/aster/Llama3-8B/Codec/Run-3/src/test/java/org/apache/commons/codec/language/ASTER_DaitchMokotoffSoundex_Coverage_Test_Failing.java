/**
 * Generated by Aster
 */
package org.apache.commons.codec.language;

import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_DaitchMokotoffSoundex_Coverage_Test_Failing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testNullSource_gktj0() {
        DaitchMokotoffSoundex soundex = new DaitchMokotoffSoundex();
        String result = soundex.soundex(null);
        assertNull(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSoundexWithWhitespace_AjNj0_fid1() {
        DaitchMokotoffSoundex soundex = new DaitchMokotoffSoundex(true);
        String result = soundex.soundex("John Smith");
        assertEquals("J532", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSoundexWithFolding_pZla2_fid1() {
        DaitchMokotoffSoundex soundex = new DaitchMokotoffSoundex(true);
        String result = soundex.soundex("Koch");
        assertEquals("K000", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSoundexWithoutFolding_eyDI3_fid1() {
        DaitchMokotoffSoundex soundex = new DaitchMokotoffSoundex(false);
        String result = soundex.soundex("Koch");
        assertEquals("K000", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEmptySource_BmSP1() {
        DaitchMokotoffSoundex soundex = new DaitchMokotoffSoundex();
        String result = soundex.soundex("");
        assertEquals("", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSingleCharacterSource_OzrC3_fid1() {
        DaitchMokotoffSoundex soundex = new DaitchMokotoffSoundex();
        String result = soundex.soundex("a");
        assertEquals("A000", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testMultipleCharacterSource_dMzs4_fid1() {
        DaitchMokotoffSoundex soundex = new DaitchMokotoffSoundex();
        String result = soundex.soundex("John");
        assertEquals("J540", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testMultipleCharacterSourceWithWhitespace_bTPQ5_fid1() {
        DaitchMokotoffSoundex soundex = new DaitchMokotoffSoundex();
        String result = soundex.soundex("John Smith");
        assertEquals("J540|S351", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testMultipleCharacterSourceWithNullRules_vuCA6_fid1() {
        DaitchMokotoffSoundex soundex = new DaitchMokotoffSoundex();
        String result = soundex.soundex("xyz");
        assertEquals("X000", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testMultipleCharacterSourceWithMultipleReplacements_xevn7_fid1() {
        DaitchMokotoffSoundex soundex = new DaitchMokotoffSoundex();
        String result = soundex.soundex("mn");
        assertEquals("M500", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testMultipleCharacterSourceWithForceReplacement_avLE8_fid1() {
        DaitchMokotoffSoundex soundex = new DaitchMokotoffSoundex();
        String result = soundex.soundex("nm");
        assertEquals("N500", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testMultipleCharacterSourceWithBranching_GWDz9_fid1() {
        DaitchMokotoffSoundex soundex = new DaitchMokotoffSoundex(true);
        String result = soundex.soundex("mn");
        assertEquals("M50|N50", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testMultipleCharacterSourceWithBranchingAndForceReplacement_uiWR10_fid1() {
        DaitchMokotoffSoundex soundex = new DaitchMokotoffSoundex(true);
        String result = soundex.soundex("nm");
        assertEquals("N50|M50", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSoundexMultipleCharacterSource_PJxI4_fid1() {
        DaitchMokotoffSoundex soundex = new DaitchMokotoffSoundex();
        String result = soundex.soundex("John");
        assertEquals("J5000", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSoundexMultipleCharacterSourceWithMAndN_uswW5_fid1() {
        DaitchMokotoffSoundex soundex = new DaitchMokotoffSoundex();
        String result = soundex.soundex("Mann");
        assertEquals("M500", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSoundexMultipleCharacterSourceWithBranching_eVXd6_fid1() {
        DaitchMokotoffSoundex soundex = new DaitchMokotoffSoundex(true);
        String result = soundex.soundex("Johns");
        assertEquals("J5200", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSoundexMultipleCharacterSourceWithNoBranching_rvxm7_fid1() {
        DaitchMokotoffSoundex soundex = new DaitchMokotoffSoundex(false);
        String result = soundex.soundex("Johns");
        assertEquals("J5200", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSoundexMultipleCharacterSourceWithFolding_chZo8_fid1() {
        DaitchMokotoffSoundex soundex = new DaitchMokotoffSoundex(true);
        String result = soundex.soundex("Koch");
        assertEquals("K200", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSoundexMultipleCharacterSourceWithRules_sBXs10_fid1() {
        DaitchMokotoffSoundex soundex = new DaitchMokotoffSoundex();
        String result = soundex.soundex("Koch");
        assertEquals("K200", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSoundexMultipleCharacterSourceWithNoFolding_hxYH9_Vfgs0_fid3() {
        DaitchMokotoffSoundex soundex = new DaitchMokotoffSoundex(false);
        String result = soundex.encode("Koch");
        assertEquals("K000", result);
    }
}