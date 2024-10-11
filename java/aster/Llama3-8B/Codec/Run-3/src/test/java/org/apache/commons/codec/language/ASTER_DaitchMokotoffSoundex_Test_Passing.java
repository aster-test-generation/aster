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

public class Aster_DaitchMokotoffSoundex_Test_Passing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSoundex_zvQn0() throws Exception {
        DaitchMokotoffSoundex soundex = new DaitchMokotoffSoundex();
        String result = soundex.soundex("Katz");
        assertEquals("K000", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSoundex2_AYkV1() throws Exception {
        DaitchMokotoffSoundex soundex = new DaitchMokotoffSoundex(true);
        String result = soundex.soundex("Kohn");
        assertEquals("K000", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSoundex3_AWVl2() throws Exception {
        DaitchMokotoffSoundex soundex = new DaitchMokotoffSoundex();
        String result = soundex.soundex("Smith");
        assertEquals("S531", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSoundex_rqPs0() throws Exception {
        DaitchMokotoffSoundex soundex = new DaitchMokotoffSoundex(true);
        String result = soundex.soundex("Katz");
        assertEquals("K000", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSoundex2_wJbL1() throws Exception {
        DaitchMokotoffSoundex soundex = new DaitchMokotoffSoundex(true);
        String result = soundex.soundex("Smith");
        assertEquals("S531", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSoundex3_VVlj2() throws Exception {
        DaitchMokotoffSoundex soundex = new DaitchMokotoffSoundex(true);
        String result = soundex.soundex("Doe");
        assertEquals("D000", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeString_eTOD0() throws Exception {
        DaitchMokotoffSoundex soundex = new DaitchMokotoffSoundex();
        String result = (String) soundex.encode("Katz");
        assertEquals("K000", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeNonString_IdSa1() throws Exception {
        DaitchMokotoffSoundex soundex = new DaitchMokotoffSoundex();
        try {
            soundex.encode(123);
            assertEquals(false, true);
        } catch (EncoderException e) {
            assertEquals("Parameter supplied to DaitchMokotoffSoundex encode is not of type java.lang.String", e.getMessage());
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeNull_sGDS0() throws Exception {
        DaitchMokotoffSoundex soundex = new DaitchMokotoffSoundex();
        String result = soundex.encode(null);
        assertEquals(null, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeValid_fLoN1() throws Exception {
        DaitchMokotoffSoundex soundex = new DaitchMokotoffSoundex();
        String result = soundex.encode("Smith");
        assertEquals("S530", result);
    }
}