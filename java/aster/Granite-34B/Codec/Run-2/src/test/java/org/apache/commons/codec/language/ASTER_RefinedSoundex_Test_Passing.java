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

public class Aster_RefinedSoundex_Test_Passing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeWithString_fGaQ0() throws EncoderException {
        RefinedSoundex soundex = new RefinedSoundex();
        String input = "Hello";
        Object expected = soundex.soundex(input);
        Object actual = soundex.encode(input);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeWithNonStringObject_STlb1() {
        RefinedSoundex soundex = new RefinedSoundex();
        Object obj = 123;
        try {
            soundex.encode(obj);
        } catch (EncoderException e) {
            assertEquals("Parameter supplied to RefinedSoundex encode is not of type java.lang.String", e.getMessage());
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDifference_nncg0() throws EncoderException {
        RefinedSoundex refinedSoundex = new RefinedSoundex();
        String s1 = "example";
        String s2 = "example";
        int expected = SoundexUtils.difference(refinedSoundex, s1, s2);
        int actual = refinedSoundex.difference(s1, s2);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDifferenceWithMapping_ySWx1() throws EncoderException {
        String mapping = "mapping";
        RefinedSoundex refinedSoundex = new RefinedSoundex(mapping);
        String s1 = "example";
        String s2 = "example";
        int expected = SoundexUtils.difference(refinedSoundex, s1, s2);
        int actual = refinedSoundex.difference(s1, s2);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDifferenceWithCharMapping_agVq2() throws EncoderException {
        char[] mapping = {'a', 'b', 'c'};
        RefinedSoundex refinedSoundex = new RefinedSoundex(mapping);
        String s1 = "example";
        String s2 = "example";
        int expected = SoundexUtils.difference(refinedSoundex, s1, s2);
        int actual = refinedSoundex.difference(s1, s2);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testMappingCodeWithInvalidInput_Gadl1() {
        RefinedSoundex refinedSoundex = new RefinedSoundex("mapping");
        char result = refinedSoundex.getMappingCode('1');
        assertEquals(0, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testMappingCodeWithIndexOutOFBound_slRA2() {
        RefinedSoundex refinedSoundex = new RefinedSoundex("mapping");
        char result = refinedSoundex.getMappingCode('Z');
        assertEquals(0, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testMappingCodeWithEmptyMapping_sYne3() {
        RefinedSoundex refinedSoundex = new RefinedSoundex("");
        char result = refinedSoundex.getMappingCode('c');
        assertEquals(0, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testMappingCode_fFwP0_fid1() {
        RefinedSoundex refinedSoundex = new RefinedSoundex("mapping");
        char result = refinedSoundex.getMappingCode('c');
        assertEquals('p', result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSoundex_String_1_RgLg0_fid1() {
        RefinedSoundex refinedSoundex = new RefinedSoundex();
        String result = refinedSoundex.soundex("string");
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncode_gidm0_fid1() {
        RefinedSoundex refinedSoundex = new RefinedSoundex();
        String actual = refinedSoundex.encode("test");
        assertEquals("T6036", actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeWithMapping_sYds1_fid1() {
        RefinedSoundex refinedSoundex = new RefinedSoundex("mapping");
        String actual = refinedSoundex.encode("test");
        assertEquals("Ti", actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeWithCharMapping_aJks2_fid1() {
        RefinedSoundex refinedSoundex = new RefinedSoundex(new char[]{'a', 'b', 'c'});
        String actual = refinedSoundex.encode("test");
        assertEquals("T", actual);
    }
}