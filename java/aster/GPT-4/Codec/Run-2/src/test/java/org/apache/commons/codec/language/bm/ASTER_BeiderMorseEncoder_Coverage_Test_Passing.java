/**
 * Generated by Aster
 */
package org.apache.commons.codec.language.bm;

import java.util.concurrent.TimeUnit;
import org.apache.commons.codec.EncoderException;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_BeiderMorseEncoder_Coverage_Test_Passing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeWithStringInput_Vptq1() throws EncoderException {
        BeiderMorseEncoder encoder = new BeiderMorseEncoder();
        String input = "testString";
        Object result = encoder.encode(input);
        assertNotNull(result); // Assumingnew BeiderMorseEncoder().encode(String) returns a non-null object for valid strings
    }
}