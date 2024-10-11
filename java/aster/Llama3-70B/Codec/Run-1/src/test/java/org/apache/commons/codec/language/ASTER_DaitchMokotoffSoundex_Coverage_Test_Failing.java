/**
 * Generated by Aster
 */
package org.apache.commons.codec.language;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

public class Aster_DaitchMokotoffSoundex_Coverage_Test_Failing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSoundex_Whitespace_Wdhs0_fid1() {
        DaitchMokotoffSoundex soundex = new DaitchMokotoffSoundex();
        String result = soundex.soundex("Hello World");
        assertEquals("H436|W463", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSoundex_NoRules_CplO1() {
        DaitchMokotoffSoundex soundex = new DaitchMokotoffSoundex();
        String result = soundex.soundex("xyz");
        assertEquals("", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSoundex_MultipleRules_iimp2_fid1() {
        DaitchMokotoffSoundex soundex = new DaitchMokotoffSoundex();
        String result = soundex.soundex("abc");
        assertEquals("A120|B120|C120", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSoundex_BranchingRequired_zAQZ3_fid1() {
        DaitchMokotoffSoundex soundex = new DaitchMokotoffSoundex();
        String result = soundex.soundex("mnemonic");
        assertEquals("M55|N55", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSoundex_ForceReplacement_EdZm4_fid1() {
        DaitchMokotoffSoundex soundex = new DaitchMokotoffSoundex();
        String result = soundex.soundex("mannheim");
        assertEquals("M500|N500", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSoundex_SingleCharacter_XGyO5_fid1() {
        DaitchMokotoffSoundex soundex = new DaitchMokotoffSoundex();
        String result = soundex.soundex("a");
        assertEquals("A000", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSoundex_EmptyString_gEfu6() {
        DaitchMokotoffSoundex soundex = new DaitchMokotoffSoundex();
        String result = soundex.soundex("");
        assertEquals("", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSoundex_Whitespace_JkFK0_fid1() {
        DaitchMokotoffSoundex soundex = new DaitchMokotoffSoundex();
        String result = soundex.soundex("Hello World");
        assertEquals("h536|l536", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSoundex_MultipleRules_uhhl2_fid1() {
        DaitchMokotoffSoundex soundex = new DaitchMokotoffSoundex();
        String result = soundex.soundex("abc");
        assertEquals("a12|b12|c12", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSoundex_BranchingRequired_kDEk3_fid1() {
        DaitchMokotoffSoundex soundex = new DaitchMokotoffSoundex();
        String result = soundex.soundex("abcd");
        assertEquals("a12|b12|c12|d12", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSoundex_ForceReplacement_ccie4_fid1() {
        DaitchMokotoffSoundex soundex = new DaitchMokotoffSoundex();
        String result = soundex.soundex("mn");
        assertEquals("m5|n5", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSoundex_SingleCharacter_rvgD5() {
        DaitchMokotoffSoundex soundex = new DaitchMokotoffSoundex();
        String result = soundex.soundex("a");
        assertEquals("a", result);
    }
}