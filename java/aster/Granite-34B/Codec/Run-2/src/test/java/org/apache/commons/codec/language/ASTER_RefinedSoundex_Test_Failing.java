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

public class Aster_RefinedSoundex_Test_Failing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testMappingCode_fFwP0() {
        RefinedSoundex refinedSoundex = new RefinedSoundex("mapping");
        char result = refinedSoundex.getMappingCode('c');
        assertEquals('m', result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSoundex_String_1_RgLg0() {
        RefinedSoundex refinedSoundex = new RefinedSoundex();
        String result = refinedSoundex.soundex("string");
        assertEquals("st462", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSoundex_String_2_Axhy1() {
        RefinedSoundex refinedSoundex = new RefinedSoundex();
        String result = refinedSoundex.soundex("st462");
        assertEquals("st462", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncode_gidm0() {
        RefinedSoundex refinedSoundex = new RefinedSoundex();
        String actual = refinedSoundex.encode("test");
        assertEquals("expected", actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeWithMapping_sYds1() {
        RefinedSoundex refinedSoundex = new RefinedSoundex("mapping");
        String actual = refinedSoundex.encode("test");
        assertEquals("expected", actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeWithCharMapping_aJks2() {
        RefinedSoundex refinedSoundex = new RefinedSoundex(new char[]{'a', 'b', 'c'});
        String actual = refinedSoundex.encode("test");
        assertEquals("expected", actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSoundex_String_2_Axhy1_fid1() {
        RefinedSoundex refinedSoundex = new RefinedSoundex();
        String result = refinedSoundex.soundex("S36");
        assertEquals("S36", result);
    }
}