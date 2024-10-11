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
    public void testEncodeWithD_lPHy0() {
        PhoneticEngine engine = new PhoneticEngine(NameType.GENERIC, RuleType.APPROX, true, 10);
        String input = "d'Artagnan";
        String expected = "(Artagnan)-(dArtagnan)";
        String actual = engine.encode(input, LanguageSet.from(new HashSet<String>(Arrays.asList("fr"))));
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeWithPrefix_LhRE1() {
        PhoneticEngine engine = new PhoneticEngine(NameType.GENERIC, RuleType.APPROX, true, 10);
        String input = "de la Vega";
        String expected = "(de la Vega)-(dela Vega)";
        String actual = engine.encode(input, LanguageSet.from(new HashSet<String>(Arrays.asList("es"))));
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeWithSephardic_qkik2() {
        PhoneticEngine engine = new PhoneticEngine(NameType.SEPHARDIC, RuleType.APPROX, true, 10);
        String input = "David";
        String expected = "David";
        String actual = engine.encode(input, LanguageSet.from(new HashSet<String>(Arrays.asList("es"))));
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeWithAshkenazi_laFc3() {
        PhoneticEngine engine = new PhoneticEngine(NameType.ASHKENAZI, RuleType.APPROX, true, 10);
        String input = "David";
        String expected = "David";
        String actual = engine.encode(input, LanguageSet.from(new HashSet<String>(Arrays.asList("he"))));
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeWithGeneric_fLaG4() {
        PhoneticEngine engine = new PhoneticEngine(NameType.GENERIC, RuleType.APPROX, true, 10);
        String input = "David";
        String expected = "David";
        String actual = engine.encode(input, LanguageSet.from(new HashSet<String>(Arrays.asList("en"))));
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeWithEmptyInput_RLtV6() {
        PhoneticEngine engine = new PhoneticEngine(NameType.GENERIC, RuleType.APPROX, true, 10);
        String input = "";
        String expected = "";
        String actual = engine.encode(input, LanguageSet.from(new HashSet<String>(Arrays.asList("en"))));
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeWithNullInput_kVct7() {
        PhoneticEngine engine = new PhoneticEngine(NameType.GENERIC, RuleType.APPROX, true, 10);
        String input = null;
        String expected = null;
        String actual = engine.encode(input, LanguageSet.from(new HashSet<String>(Arrays.asList("en"))));
        assertEquals(expected, actual);
    }
}