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

public class Aster_DaitchMokotoffSoundex_Test_Passing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSoundex_pvAW0() {
        DaitchMokotoffSoundex soundex = new DaitchMokotoffSoundex();
        String source = "John";
        String expected = "160000|460000";
        String actual = soundex.soundex(source);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSoundex_OneLetterName_FeUQ0() {
        DaitchMokotoffSoundex soundex = new DaitchMokotoffSoundex();
        String actual = soundex.soundex("A");
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSoundex_TwoLetterName_oDbf1() {
        DaitchMokotoffSoundex soundex = new DaitchMokotoffSoundex();
        String actual = soundex.soundex("AB");
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSoundex_ThreeLetterName_eOcU2() {
        DaitchMokotoffSoundex soundex = new DaitchMokotoffSoundex();
        String actual = soundex.soundex("ABC");
        assertEquals("074000|075000", actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeWithString_jChU0() throws EncoderException {
        DaitchMokotoffSoundex soundex = new DaitchMokotoffSoundex();
        String input = "example";
        String expected = soundex.encode(input);
        assertEquals("054678", expected);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeWithNonStringObject_RbRY1() {
        DaitchMokotoffSoundex soundex = new DaitchMokotoffSoundex();
        Object input = new Object();
        try {
            soundex.encode(input);
        } catch (EncoderException e) {
            assertEquals("Parameter supplied to DaitchMokotoffSoundex encode is not of type java.lang.String", e.getMessage());
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeWithEmptyInput_EROP3() {
        DaitchMokotoffSoundex soundex = new DaitchMokotoffSoundex();
        String input = "";
        String expected = soundex.encode(input);
        assertEquals("000000", expected);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeWithInvalidInput_rWid4() {
        DaitchMokotoffSoundex soundex = new DaitchMokotoffSoundex();
        String input = "12345";
        String expected = soundex.encode(input);
        assertEquals("000000", expected);
    }
}