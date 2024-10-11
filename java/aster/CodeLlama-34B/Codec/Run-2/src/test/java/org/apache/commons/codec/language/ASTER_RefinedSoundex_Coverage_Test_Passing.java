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
import static org.junit.jupiter.api.Assertions.fail;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_RefinedSoundex_Coverage_Test_Passing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetMappingCode_indexOutOfBounds_vxxP53() {
        RefinedSoundex refinedSoundex = new RefinedSoundex();
        char c = 'Z';
        char result = refinedSoundex.getMappingCode(c);
        assertEquals(53, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeWithNonStringObject_WdLT0() throws org.apache.commons.codec.EncoderException {
        RefinedSoundex refinedSoundex = new RefinedSoundex();
        try {
            refinedSoundex.encode(new Object());
            fail("Expected EncoderException to be thrown");
        } catch (EncoderException e) {
            assertEquals("Parameter supplied to RefinedSoundex encode is not of type java.lang.String", e.getMessage());
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeWithValidString_TqqW2() throws org.apache.commons.codec.EncoderException {
        RefinedSoundex refinedSoundex = new RefinedSoundex();
        String input = "hello";
        String expectedOutput = "H070";
        assertEquals(expectedOutput, refinedSoundex.encode(input));
    }
}