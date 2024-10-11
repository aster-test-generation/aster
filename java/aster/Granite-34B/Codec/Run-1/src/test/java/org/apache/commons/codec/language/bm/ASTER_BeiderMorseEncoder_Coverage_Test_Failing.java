/**
 * Generated by Aster
 */
package org.apache.commons.codec.language.bm;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

import java.util.concurrent.TimeUnit;
import org.apache.commons.codec.EncoderException;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

public class Aster_BeiderMorseEncoder_Coverage_Test_Failing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeWithValidInput_kgPY1_fid1() throws org.apache.commons.codec.EncoderException {
        BeiderMorseEncoder encoder = new BeiderMorseEncoder();
        String encodedString = encoder.encode("Hello");
        assertEquals(".... . .-.. .-.. ---  .-- --- .-. .-.. -..", encodedString);
    }
}