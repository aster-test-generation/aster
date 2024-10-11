/**
 * Generated by Aster
 */
package org.apache.commons.codec.language;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

public class Aster_RefinedSoundex_Test_Passing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSoundex_NullInput_jyng0() {
        RefinedSoundex rs = new RefinedSoundex();
        String result = rs.soundex(null);
        assertNull(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSoundex_EmptyString_pWdB1() {
        RefinedSoundex rs = new RefinedSoundex();
        String result = rs.soundex("");
        assertEquals("", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetMappingCode_NonLetter_zZWt0() {
        RefinedSoundex rs = new RefinedSoundex();
        char result = rs.getMappingCode('1');
        assertEquals(0, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetMappingCode_UppercaseLetter_JJJz1() {
        RefinedSoundex rs = new RefinedSoundex("ABCDEFGHIJKLMNOPQRSTUVWXYZ");
        char result = rs.getMappingCode('A');
        assertEquals('A', result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetMappingCode_LowercaseLetter_QUYd2() {
        RefinedSoundex rs = new RefinedSoundex("ABCDEFGHIJKLMNOPQRSTUVWXYZ");
        char result = rs.getMappingCode('a');
        assertEquals('A', result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetMappingCode_OutOfRangeLetter_Pkvg3() {
        RefinedSoundex rs = new RefinedSoundex("ABCDEFGHIJKLMNOPQRSTUVWXYZ");
        char result = rs.getMappingCode('@');
        assertEquals(0, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSoundex_ComplexString_YxBV5_fid1() {
        RefinedSoundex rs = new RefinedSoundex();
        String result = rs.soundex("Cabbage");
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeWithValidString_BCsK0_fid1() {
        RefinedSoundex refinedSoundex = new RefinedSoundex();
        String input = "Example";
        String expectedOutput = "E251"; // Assuming soundex method works correctly and this is the expected output
        String result = (String) refinedSoundex.encode(input);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeBasic_Vokx0_fid1() {
        RefinedSoundex rs = new RefinedSoundex();
        String result = rs.encode("example");
        assertEquals("E0508170", result);
    }
}