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

public class Aster_Soundex_Coverage_Test_Passing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeWithNonStringObject_ycoe0() throws org.apache.commons.codec.EncoderException {
        Soundex soundex = new Soundex();
        Object obj = new Object();
        try {
            soundex.encode(obj);
        } catch (EncoderException e) {
            assertEquals("Parameter supplied to Soundex encode is not of type java.lang.String", e.getMessage());
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeWithStringObject_YRZS1() throws org.apache.commons.codec.EncoderException {
        Soundex soundex = new Soundex();
        Object obj = "Hello";
        try {
            soundex.encode(obj);
        } catch (EncoderException e) {
            fail("Unexpected exception thrown");
        }
    }
}