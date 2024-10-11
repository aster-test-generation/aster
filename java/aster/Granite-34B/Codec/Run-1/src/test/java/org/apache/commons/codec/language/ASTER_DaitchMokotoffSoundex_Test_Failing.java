/**
 * Generated by Aster
 */
package org.apache.commons.codec.language;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

import java.util.concurrent.TimeUnit;
import org.apache.commons.codec.EncoderException;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

public class Aster_DaitchMokotoffSoundex_Test_Failing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSoundexWithNullSource_PKzG1() {
        DaitchMokotoffSoundex soundex = new DaitchMokotoffSoundex();
        String source = null;
        String expected = null;
        String actual = soundex.soundex(source);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSoundex_pvAW0_fid1() {
        DaitchMokotoffSoundex soundex = new DaitchMokotoffSoundex();
        String source = "John";
        String expected = "J500";
        String actual = soundex.soundex(source);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSoundexWithEmptySource_sOMp2() {
        DaitchMokotoffSoundex soundex = new DaitchMokotoffSoundex();
        String source = "";
        String expected = "";
        String actual = soundex.soundex(source);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSoundex_OneLetterName_FeUQ0_fid1() {
        DaitchMokotoffSoundex soundex = new DaitchMokotoffSoundex();
        String actual = soundex.soundex("A");
        assertEquals("A000", actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSoundex_TwoLetterName_oDbf1_fid1() {
        DaitchMokotoffSoundex soundex = new DaitchMokotoffSoundex();
        String actual = soundex.soundex("AB");
        assertEquals("AB200", actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSoundex_ThreeLetterName_eOcU2_fid1() {
        DaitchMokotoffSoundex soundex = new DaitchMokotoffSoundex();
        String actual = soundex.soundex("ABC");
        assertEquals("ABC100", actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeWithString_jChU0_fid1() throws EncoderException {
        DaitchMokotoffSoundex soundex = new DaitchMokotoffSoundex();
        String input = "example";
        String expected = soundex.encode(input);
        assertEquals("expectedSoundexCode", expected);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeWithEmptyInput_EROP3_fid1() {
        DaitchMokotoffSoundex soundex = new DaitchMokotoffSoundex();
        String input = "";
        String expected = soundex.encode(input);
        assertEquals("0000", expected);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeWithInvalidInput_rWid4_fid1() {
        DaitchMokotoffSoundex soundex = new DaitchMokotoffSoundex();
        String input = "12345";
        String expected = soundex.encode(input);
        assertEquals("0000", expected);
    }
}