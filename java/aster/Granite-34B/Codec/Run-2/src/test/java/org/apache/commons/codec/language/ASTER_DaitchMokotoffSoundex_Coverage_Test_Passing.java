/**
 * Generated by Aster
 */
package org.apache.commons.codec.language;

import java.util.concurrent.TimeUnit;
import org.apache.commons.codec.EncoderException;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_DaitchMokotoffSoundex_Coverage_Test_Passing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeWithNonStringObject_ifHW0() throws org.apache.commons.codec.EncoderException {
        DaitchMokotoffSoundex dms = new DaitchMokotoffSoundex();
        try {
            dms.encode(new Object());
        } catch (EncoderException e) {
            assertEquals("Parameter supplied to DaitchMokotoffSoundex encode is not of type java.lang.String", e.getMessage());
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeWithStringObject_Civm1() throws org.apache.commons.codec.EncoderException {
        DaitchMokotoffSoundex dms = new DaitchMokotoffSoundex();
        assertEquals("794000", dms.encode("Wirtz"));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSoundex_WithWhitespace_Qyqn0() {
        DaitchMokotoffSoundex soundex = new DaitchMokotoffSoundex();
        String source = "Jones ";
        String expected = "J500";
        String actual = soundex.soundex(source);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSoundex_WithNoRules_ZmoY2() {
        DaitchMokotoffSoundex soundex = new DaitchMokotoffSoundex();
        String source = "A";
        String expected = "000000";
        String actual = soundex.soundex(source);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSoundex_WithBranching_wuZJ3() {
        DaitchMokotoffSoundex soundex = new DaitchMokotoffSoundex();
        String source = "An";
        String expected = "060000";
        String actual = soundex.soundex(source);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSoundex_WithNoForce_opcp5() {
        DaitchMokotoffSoundex soundex = new DaitchMokotoffSoundex();
        String source = "An";
        String expected = "A200|A200";
        String actual = soundex.soundex(source);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSoundex_WithMultipleReplacementsAndBranching_ReturnsCorrectResult_ypZY4() {
        DaitchMokotoffSoundex soundex = new DaitchMokotoffSoundex();
        String result = soundex.soundex("mn");
        Assertions.assertEquals("660000", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSoundex_WithMultipleReplacementsAndNoBranching_ReturnsCorrectResult_xwDs5() {
        DaitchMokotoffSoundex soundex = new DaitchMokotoffSoundex();
        String result = soundex.soundex("mn");
    }
}