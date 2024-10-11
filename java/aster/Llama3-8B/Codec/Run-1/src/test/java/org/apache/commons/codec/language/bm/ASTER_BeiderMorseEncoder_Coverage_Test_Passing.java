/**
 * Generated by Aster
 */
package org.apache.commons.codec.language.bm;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

import java.util.concurrent.TimeUnit;
import org.apache.commons.codec.EncoderException;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

public class Aster_BeiderMorseEncoder_Coverage_Test_Passing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeNullSource_snxv0() throws EncoderException {
        BeiderMorseEncoder encoder = new BeiderMorseEncoder();
        String result = encoder.encode(null);
        assertEquals(null, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeNonNullSource_YLRt1() throws EncoderException {
        BeiderMorseEncoder encoder = new BeiderMorseEncoder();
        String source = "Hello";
        String result = encoder.encode(source);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeNonStringInput_YLWV0() throws EncoderException {
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
    public void testEncodeStringInput_ZSdT1() throws EncoderException {
        BeiderMorseEncoder encoder = new BeiderMorseEncoder();
        String source = "Hello";
        Object result = encoder.encode(source);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetRuleType_APPROX_Ljpl0_sZzf0() {
        BeiderMorseEncoder encoder = new BeiderMorseEncoder();
        encoder.setRuleType(RuleType.APPROX);
        assertEquals(RuleType.APPROX, encoder.getRuleType());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetConcatMaxPhonemes_sCUZ3_MrEk0_1() {
        BeiderMorseEncoder encoder = new BeiderMorseEncoder();
        encoder.setConcat(true);
        PhoneticEngine engine = new PhoneticEngine(encoder.getNameType(), encoder.getRuleType(), true, 10);
        assertEquals(encoder.getNameType(), engine.getNameType());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetConcatMaxPhonemes_sCUZ3_MrEk0_2() {
        BeiderMorseEncoder encoder = new BeiderMorseEncoder();
        encoder.setConcat(true);
        PhoneticEngine engine = new PhoneticEngine(encoder.getNameType(), encoder.getRuleType(), true, 10);
        assertEquals(encoder.getRuleType(), engine.getRuleType());
    }
}