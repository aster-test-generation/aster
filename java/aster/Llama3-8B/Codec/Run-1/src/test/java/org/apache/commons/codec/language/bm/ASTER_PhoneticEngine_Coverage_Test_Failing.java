/**
 * Generated by Aster
 */
package org.apache.commons.codec.language.bm;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

import java.util.Arrays;
import java.util.HashSet;
import java.util.concurrent.TimeUnit;
import org.apache.commons.codec.language.bm.Languages.LanguageSet;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

public class Aster_PhoneticEngine_Coverage_Test_Failing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncode_SephardicPrefix_TUif3_fwch0() {
        PhoneticEngine engine = new PhoneticEngine(NameType.SEPHARDIC, RuleType.RULES, true, 10);
        String input = "Rabbi John";
        String expected = "(John)";
        assertEquals(expected, engine.encode(input, Languages.LanguageSet.from(new HashSet<>(Arrays.asList("en")))));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncode_GenericPrefix_ZWxF2_bnIE0() {
        PhoneticEngine engine = new PhoneticEngine(NameType.GENERIC, RuleType.RULES, true, 10);
        String input = "Mr. John";
        String expected = "(John)-Mr John";
        assertEquals(expected, engine.encode(input, LanguageSet.from(new HashSet<String>(Arrays.asList("en")))));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncode_GenericNoPrefix_HgxW5_aGaE0() {
        PhoneticEngine engine = new PhoneticEngine(NameType.GENERIC, RuleType.RULES, true, 10);
        String input = "John";
        String expected = "(John)";
        assertEquals(expected, engine.encode(input, LanguageSet.from(new HashSet<String>(Arrays.asList("en")))));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncode_SephardicNoPrefix_QCpF6_fIzo0() {
        PhoneticEngine engine = new PhoneticEngine(NameType.SEPHARDIC, RuleType.RULES, true, 10);
        String input = "John";
        String expected = "(John)";
        assertEquals(expected, engine.encode(input, Languages.LanguageSet.from(new HashSet<>(Arrays.asList("en")))));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncode_NoConcatenate_pLHK9_kkuh0() {
        PhoneticEngine engine = new PhoneticEngine(NameType.GENERIC, RuleType.RULES, false, 10);
        String input = "John Paul";
        String expected = "(John)-(Paul)";
        assertEquals(expected, engine.encode(input, Languages.LanguageSet.from(new HashSet<>(Arrays.asList("en")))));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncode_Concatenate_dQnT8_AGtr0() {
        PhoneticEngine engine = new PhoneticEngine(NameType.GENERIC, RuleType.RULES, true, 10);
        String input = "John Paul";
        String expected = "(John)-(Paul)";
        assertEquals(expected, engine.encode(input, Languages.LanguageSet.from(new HashSet<>(Arrays.asList("en")))));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncode_EmptyInput_jeuu11_cvel0() {
        PhoneticEngine engine = new PhoneticEngine(NameType.GENERIC, RuleType.RULES, true, 10);
        String input = "";
        String expected = "";
        assertEquals(expected, engine.encode(input, Languages.LanguageSet.from(new HashSet<>(Arrays.asList("en")))));
    }
}