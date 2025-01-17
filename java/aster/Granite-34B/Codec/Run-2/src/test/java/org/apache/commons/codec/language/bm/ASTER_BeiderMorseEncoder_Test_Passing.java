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

public class Aster_BeiderMorseEncoder_Test_Passing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetRuleType_SdUA0() {
        BeiderMorseEncoder encoder = new BeiderMorseEncoder();
        assertEquals(RuleType.class, encoder.getRuleType().getClass());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetRuleTypeCoverage_PaTg1() {
        BeiderMorseEncoder encoder = new BeiderMorseEncoder();
        encoder.getRuleType();
        encoder.getRuleType();
        encoder.getRuleType();
        encoder.getRuleType();
        encoder.getRuleType();
        encoder.getRuleType();
        encoder.getRuleType();
        encoder.getRuleType();
        encoder.getRuleType();
        encoder.getRuleType();
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetNameType_nLKg0() {
        BeiderMorseEncoder beiderMorseEncoder = new BeiderMorseEncoder();
        beiderMorseEncoder.setNameType(NameType.ASHKENAZI);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetNameTypeWithGenericNameType_FwTP1() {
        BeiderMorseEncoder beiderMorseEncoder = new BeiderMorseEncoder();
        beiderMorseEncoder.setNameType(NameType.GENERIC);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetNameTypeWithSephardicNameType_iqDu2() {
        BeiderMorseEncoder beiderMorseEncoder = new BeiderMorseEncoder();
        beiderMorseEncoder.setNameType(NameType.SEPHARDIC);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetRuleType_APPROX_SxjR0() {
        BeiderMorseEncoder encoder = new BeiderMorseEncoder();
        encoder.setRuleType(RuleType.APPROX);
        assertEquals(RuleType.APPROX, encoder.getRuleType());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetRuleType_EXACT_noth1() {
        BeiderMorseEncoder encoder = new BeiderMorseEncoder();
        encoder.setRuleType(RuleType.EXACT);
        assertEquals(RuleType.EXACT, encoder.getRuleType());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    void setConcatTest_JCCR0() {
        BeiderMorseEncoder beiderMorseEncoder = new BeiderMorseEncoder();
        beiderMorseEncoder.setConcat(true);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    void setConcatTest_YGnE1() {
        BeiderMorseEncoder beiderMorseEncoder = new BeiderMorseEncoder();
        beiderMorseEncoder.setConcat(false);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void getNameTypeTest_mOOA0() {
        BeiderMorseEncoder encoder = new BeiderMorseEncoder();
        NameType nameType = encoder.getNameType();
        assertEquals(NameType.class, nameType.getClass());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeWithNullSource_kGLg0_wQsN0() {
        BeiderMorseEncoder encoder = new BeiderMorseEncoder();
        String encoded = null;
        try {
            encoded = encoder.encode(null);
        } catch (EncoderException e) {
            fail("Unexpected exception: " + e.getMessage());
        }
        assertEquals(null, encoded);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncode_HAMp0_fid2() throws EncoderException {
        BeiderMorseEncoder encoder = new BeiderMorseEncoder();
        String source = "Hello, World!";
        String expected = "YlYvYrlt|YlYvorlt|YlovYrlt|Ylovorlt|ilYvYrlt|ilYvorlt|ilovYrlt|ilovorlt|ilovurlt|iloworlt|xilovorlt|xilovurlt|xiloworlt";
        assertEquals(expected, encoder.encode(source));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeWithNumbers_myVl1_fid2() throws EncoderException {
        BeiderMorseEncoder encoder = new BeiderMorseEncoder();
        String source = "12345";
        String expected = "";
        assertEquals(expected, encoder.encode(source));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void getNameTypeTest_withNullNameType_znHY3_fid2() {
        BeiderMorseEncoder encoder = new BeiderMorseEncoder();
        NameType nameType = null;
        assertNull(nameType);
    }
}