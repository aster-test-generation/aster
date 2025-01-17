/**
 * Generated by Aster
 */
package org.apache.commons.codec.language;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

import java.util.concurrent.TimeUnit;
import org.apache.commons.codec.EncoderException;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

public class Aster_Metaphone_Coverage_Test_Failing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeWithStringInput_vulv1() throws EncoderException {
        Metaphone metaphone = new Metaphone();
        String input = "example";
        String expected = "AMPL"; // Assuming 'metaphone' method returns "AMPL" for "example"
        assertEquals(expected, metaphone.encode(input));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeWithNullInput_gxpX2_PXVk0() {
        Metaphone metaphone = new Metaphone();
        try {
            metaphone.encode(null);
            fail("Expected an IllegalArgumentException to be thrown");
        } catch (IllegalArgumentException e) {
            assertEquals("Parameter supplied to Metaphone encode is null", e.getMessage());
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeWithNullInput_gxpX2_PXVk0_fid2() {
        Metaphone metaphone = new Metaphone();
        try {
            metaphone.encode(null);
            fail("Expected an IllegalArgumentException to be thrown");
        } catch (IllegalArgumentException e) {
            assertEquals("Parameter supplied to Metaphone encode is not of type java.lang.String", e.getMessage());
        }
    }
}