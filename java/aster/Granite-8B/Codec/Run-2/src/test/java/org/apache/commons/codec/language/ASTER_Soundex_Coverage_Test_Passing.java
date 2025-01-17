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
import static org.junit.jupiter.api.Assertions.fail;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_Soundex_Coverage_Test_Passing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeWithNonStringObject_YekX0() throws org.apache.commons.codec.EncoderException {
        Soundex soundex = new Soundex();
        Object obj = new Object();
        try {
            soundex.encode(obj);
            Assertions.fail("Expected EncoderException to be thrown");
        } catch (EncoderException e) {
            Assertions.assertEquals("Parameter supplied to Soundex encode is not of type java.lang.String", e.getMessage());
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeWithValidStringObject_RQOm2() throws org.apache.commons.codec.EncoderException {
        Soundex soundex = new Soundex();
        String input = "Hello";
        String expectedOutput = "H400";
        String actualOutput = soundex.encode(input);
        Assertions.assertEquals(expectedOutput, actualOutput);
    }
}