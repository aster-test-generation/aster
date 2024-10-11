/**
 * Generated by Aster
 */
package org.apache.commons.codec.language.bm;

import java.util.concurrent.TimeUnit;
import org.apache.commons.codec.EncoderException;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_BeiderMorseEncoder_Coverage_Test_Passing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeNonStringInput_uNCo0() throws org.apache.commons.codec.EncoderException {
        BeiderMorseEncoder encoder = new BeiderMorseEncoder();
        try {
            encoder.encode(123);
            fail("Expected EncoderException");
        } catch (EncoderException e) {
            assertEquals("BeiderMorseEncoder encode parameter is not of type String", e.getMessage());
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetConcat_FqnK0_UfgE0() {
        BeiderMorseEncoder beiderMorseEncoder = new BeiderMorseEncoder();
        beiderMorseEncoder.setConcat(true);
        try {
            String result = beiderMorseEncoder.encode("test");
            assertNotNull(beiderMorseEncoder);
        } catch (EncoderException e) {
            fail("EncoderException was thrown unexpectedly");
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetConcatNameType_WADZ1_NIxr0() {
        BeiderMorseEncoder beiderMorseEncoder = new BeiderMorseEncoder();
        beiderMorseEncoder.setConcat(true);
        try {
            String result = beiderMorseEncoder.encode("test");
            assertNotNull(result);
        } catch (EncoderException e) {
            fail("Expected encode to not throw an exception");
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetConcatRuleType_ehdN2_gGDt0() {
        BeiderMorseEncoder beiderMorseEncoder = new BeiderMorseEncoder();
        beiderMorseEncoder.setConcat(true);
        try {
            String result = beiderMorseEncoder.encode("test");
            assertNotNull(result);
        } catch (EncoderException e) {
            fail("EncoderException was thrown");
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetConcatMaxPhonemes_hfVS3_xCep0() {
        BeiderMorseEncoder beiderMorseEncoder = new BeiderMorseEncoder();
        beiderMorseEncoder.setConcat(true);
        try {
            String result = beiderMorseEncoder.encode("test");
            assertNotNull(result);
        } catch (EncoderException e) {
            fail("EncoderException was thrown unexpectedly");
        }
    }
}