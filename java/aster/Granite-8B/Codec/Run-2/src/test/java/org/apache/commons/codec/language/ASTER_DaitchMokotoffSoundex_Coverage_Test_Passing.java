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
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_DaitchMokotoffSoundex_Coverage_Test_Passing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeWithValidStringObject_NCKC2() throws org.apache.commons.codec.EncoderException {
        DaitchMokotoffSoundex soundex = new DaitchMokotoffSoundex();
        String inputString = "Hello";
        String encodedString = soundex.encode(inputString);
        Assertions.assertEquals("580000", encodedString);
    }
}