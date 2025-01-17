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

public class Aster_DaitchMokotoffSoundex_Coverage_Test_Passing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeWithNonStringObject_TePC0() throws org.apache.commons.codec.EncoderException {
        DaitchMokotoffSoundex daitchMokotoffSoundex = new DaitchMokotoffSoundex();
        try {
            daitchMokotoffSoundex.encode(new Object());
        } catch (EncoderException e) {
            assertEquals("Parameter supplied to DaitchMokotoffSoundex encode is not of type java.lang.String", e.getMessage());
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeWithStringObject_BqtH1() throws org.apache.commons.codec.EncoderException {
        DaitchMokotoffSoundex daitchMokotoffSoundex = new DaitchMokotoffSoundex();
        String encodedString = daitchMokotoffSoundex.encode("test");
        assertEquals("343000", encodedString);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSoundex_WithWhitespace_LkWd0() {
        DaitchMokotoffSoundex soundex = new DaitchMokotoffSoundex();
        String source = "John  smith";
        String expected = "J515|S530";
        String actual = soundex.soundex(source);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSoundex_WithForce_oeun2() {
        DaitchMokotoffSoundex soundex = new DaitchMokotoffSoundex();
        String source = "John  smith";
        String expected = "164630|464630";
        String actual = soundex.soundex(source);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSoundex_withWhitespace_OEsE0() {
        DaitchMokotoffSoundex soundex = new DaitchMokotoffSoundex();
        String source = "John  smith";
        String expected = "J515|J515";
        String actual = soundex.soundex(source);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSoundex_withBranching_kZXQ1() {
        DaitchMokotoffSoundex soundex = new DaitchMokotoffSoundex();
        String source = "Jones";
        String expected = "J500|J520";
        String actual = soundex.soundex(source);
    }
}