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

public class Aster_DaitchMokotoffSoundex_Test_Failing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSoundex_qmyf0_fid1() {
        DaitchMokotoffSoundex soundex = new DaitchMokotoffSoundex();
        String result = soundex.soundex("John");
        assertEquals("J500", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSoundexWithMultipleBranches_KFGE1_fid1() {
        DaitchMokotoffSoundex soundex = new DaitchMokotoffSoundex();
        String result = soundex.soundex("John Doe");
        assertEquals("J500|D000", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSoundexWithSpecialRule_KiDC2_fid1() {
        DaitchMokotoffSoundex soundex = new DaitchMokotoffSoundex();
        String result = soundex.soundex("Mary-Ann");
        assertEquals("M650|A500", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSoundex_NClg0_fid1() {
        DaitchMokotoffSoundex soundex = new DaitchMokotoffSoundex();
        String input = "John Doe";
        String expected = "J530";
        String actual = soundex.soundex(input);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSoundexWithSpecialCharacters_KHBB2_fid1() {
        DaitchMokotoffSoundex soundex = new DaitchMokotoffSoundex();
        String input = "John Doe!";
        String expected = "J530";
        String actual = soundex.soundex(input);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSoundexWithFolding_amDB5_fid1() {
        DaitchMokotoffSoundex soundex = new DaitchMokotoffSoundex(true);
        String input = "John Doe";
        String expected = "J530";
        String actual = soundex.soundex(input);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncode_String_DEoL0_fid1() {
        DaitchMokotoffSoundex soundex = new DaitchMokotoffSoundex();
        String input = "DaitchMokotoff";
        String expected = "D300";
        String actual = soundex.encode(input);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncode_Boolean_fcuv1_fid1() {
        DaitchMokotoffSoundex soundex = new DaitchMokotoffSoundex(true);
        String input = "DaitchMokotoff";
        String expected = "D300";
        String actual = soundex.encode(input);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncode_oYSU0_fid1() {
        DaitchMokotoffSoundex soundex = new DaitchMokotoffSoundex();
        String result = soundex.encode("John");
        assertEquals("J500", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeWithBranching_ZEYE1_fid1() {
        DaitchMokotoffSoundex soundex = new DaitchMokotoffSoundex(true);
        String result = soundex.encode("John");
        assertEquals("J500", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSoundexWithMultipleReplacements_RhHZ3_ncSF0_fid1() {
        DaitchMokotoffSoundex soundex = new DaitchMokotoffSoundex();
        String input = "John Doe";
        String expected = "J530|J531";
        String actual = soundex.encode(input);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSoundexWithFoldingAndBranching_AGZo6_gntd0_fid1() {
        DaitchMokotoffSoundex soundex = new DaitchMokotoffSoundex(true);
        String input = "John Doe";
        String expected = "J530|J531";
        String actual = soundex.encode(input);
        assertEquals(expected, actual);
    }
}