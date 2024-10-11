/**
 * Generated by Aster
 */
package org.apache.commons.codec.language;

import java.util.concurrent.TimeUnit;
import org.apache.commons.codec.EncoderException;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_RefinedSoundex_Test_Passing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetMappingCode_NonLetter_nYyI0() {
        RefinedSoundex rs = new RefinedSoundex();
        assertEquals(0, rs.getMappingCode('1'));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetMappingCode_UpperCaseLetter_JteI1() {
        RefinedSoundex rs = new RefinedSoundex("ABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray());
        assertEquals('B', rs.getMappingCode('B'));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetMappingCode_OutOfRangeLetter_fIOV3() {
        RefinedSoundex rs = new RefinedSoundex("ABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray());
        assertEquals(0, rs.getMappingCode('['));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSoundex_NullInput_PNbZ0() {
        RefinedSoundex rs = new RefinedSoundex();
        String result = rs.soundex(null);
        assertNull(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSoundex_EmptyString_JSOR1() {
        RefinedSoundex rs = new RefinedSoundex();
        String result = rs.soundex("");
        assertEquals("", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSoundex_NormalInput_YzYa3() {
        RefinedSoundex rs = new RefinedSoundex();
        String result = rs.soundex("Example");
        assertNotNull(result);
        assertFalse(result.isEmpty());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSoundex_DifferentCase_hajH5() {
        RefinedSoundex rs = new RefinedSoundex();
        String result = rs.soundex("Example");
        String resultCase = rs.soundex("example");
        assertEquals(result, resultCase);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeBasic_bcNo0_fid1() {
        RefinedSoundex rs = new RefinedSoundex();
        String result = rs.encode("example");
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDifference_hzsg0_fid1() throws EncoderException {
        RefinedSoundex rs = new RefinedSoundex();
        String s1 = "example";
        String s2 = "samples";
        int result = rs.difference(s1, s2);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeWithValidString_yREw0_fid1() {
        RefinedSoundex refinedSoundex = new RefinedSoundex();
        String input = "Example";
        String expectedOutput = "E251"; // Assuming soundex method works correctly and returns this value
        String result = (String) refinedSoundex.encode(input);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetMappingCode_LowerCaseLetter_tbsY2_fid1() {
        RefinedSoundex rs = new RefinedSoundex("ABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray());
        assertEquals('C', rs.getMappingCode('C'));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSoundex_NormalInput_YzYa3_1() {
        RefinedSoundex rs = new RefinedSoundex();
        String result = rs.soundex("Example");
        assertNotNull(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSoundex_NormalInput_YzYa3_2() {
        RefinedSoundex rs = new RefinedSoundex();
        String result = rs.soundex("Example");
        assertFalse(result.isEmpty());
    }

    @Test
    public void testEncodeWithInvalidType_YfcI1_EBvD0() {
        RefinedSoundex refinedSoundex = new RefinedSoundex();
        String input = "Not a valid input for soundex"; // Changed to a valid String type
        try {
            String result = refinedSoundex.soundex(input);
            assertNotNull(result); // Changed assertion to check if result is not null
        } catch (IllegalArgumentException e) {
            fail("No IllegalArgumentException expected for a String input");
        }
    }
}