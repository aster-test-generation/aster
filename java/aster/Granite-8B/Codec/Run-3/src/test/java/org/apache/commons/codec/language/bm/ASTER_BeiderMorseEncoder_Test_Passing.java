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
    public void testIsConcat_HJQS0() throws Exception {
        BeiderMorseEncoder encoder = new BeiderMorseEncoder();
        boolean result = encoder.isConcat();
        assertTrue(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetRuleType_AyVf0() throws Exception {
        BeiderMorseEncoder beiderMorseEncoder = new BeiderMorseEncoder();
        RuleType ruleType = beiderMorseEncoder.getRuleType();
        assertNotNull(ruleType);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetNameType_vZNS0() throws Exception {
        BeiderMorseEncoder beiderMorseEncoder = new BeiderMorseEncoder();
        NameType nameType = beiderMorseEncoder.getNameType();
        assertNotNull(nameType);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetNameType_bjRt0() throws Exception {
        BeiderMorseEncoder beiderMorseEncoder = new BeiderMorseEncoder();
        beiderMorseEncoder.setNameType(NameType.ASHKENAZI);
        assertEquals(NameType.ASHKENAZI, beiderMorseEncoder.getNameType());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetNameTypeGeneric_eQbB1() throws Exception {
        BeiderMorseEncoder beiderMorseEncoder = new BeiderMorseEncoder();
        beiderMorseEncoder.setNameType(NameType.GENERIC);
        assertEquals(NameType.GENERIC, beiderMorseEncoder.getNameType());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetNameTypeSephardic_xZmK2() throws Exception {
        BeiderMorseEncoder beiderMorseEncoder = new BeiderMorseEncoder();
        beiderMorseEncoder.setNameType(NameType.SEPHARDIC);
        assertEquals(NameType.SEPHARDIC, beiderMorseEncoder.getNameType());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncode_HcEL0() throws Exception {
        BeiderMorseEncoder encoder = new BeiderMorseEncoder();
        String source = "Hello, World!";
        String expected = ".... . .-.. .-.. ---  .-- --- .-. .-.. -..";
        String actual = encoder.encode(source);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeWithNullSource_bHgO1() throws Exception {
        BeiderMorseEncoder encoder = new BeiderMorseEncoder();
        String source = null;
        String expected = null;
        String actual = encoder.encode(source);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncode_lvAp0() throws Exception {
        BeiderMorseEncoder encoder = new BeiderMorseEncoder();
        String input = "Hello, World!";
        String expectedOutput = ".... . .-.. .-.. ---  .-- --- .-. .-.. -..";
        assertEquals(expectedOutput, encoder.encode(input));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeWithInvalidInput_sQhX1() throws Exception {
        BeiderMorseEncoder encoder = new BeiderMorseEncoder();
        Object invalidInput = 123;
        try {
            encoder.encode(invalidInput);
        } catch (EncoderException e) {
            assertEquals("BeiderMorseEncoder encode parameter is not of type String", e.getMessage());
        }
    }
}