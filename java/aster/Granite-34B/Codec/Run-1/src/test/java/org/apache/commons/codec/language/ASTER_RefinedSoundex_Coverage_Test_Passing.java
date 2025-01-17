/**
 * Generated by Aster
 */
package org.apache.commons.codec.language;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

import java.util.concurrent.TimeUnit;
import org.apache.commons.codec.EncoderException;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

public class Aster_RefinedSoundex_Coverage_Test_Passing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeWithNonStringObject_NBUM0() throws org.apache.commons.codec.EncoderException {
        RefinedSoundex refinedSoundex = new RefinedSoundex();
        Object obj = new Object();
        try {
            refinedSoundex.encode(obj);
        } catch (EncoderException e) {
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeWithStringObject_Aknw1() throws org.apache.commons.codec.EncoderException {
        RefinedSoundex refinedSoundex = new RefinedSoundex();
        Object obj = "test";
        Object result = refinedSoundex.encode(obj);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testMappingCodeWithInvalidInput_eKEk0() {
        RefinedSoundex soundex = new RefinedSoundex();
        char result = soundex.getMappingCode('1');
        assertEquals(0, result);
    }
}