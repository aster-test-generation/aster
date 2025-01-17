/**
 * Generated by Aster
 */
package org.apache.commons.codec.language;

import java.util.concurrent.TimeUnit;
import org.apache.commons.codec.EncoderException;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_RefinedSoundex_Coverage_Test_Passing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeWithNonStringObject_dUgv0() throws org.apache.commons.codec.EncoderException {
        RefinedSoundex refinedSoundex = new RefinedSoundex();
        Object obj = new Object();
        try {
            refinedSoundex.encode(obj);
        } catch (EncoderException e) {
        }
    }
}