/**
 * Generated by Aster
 */
package org.apache.commons.codec.language.bm;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

public class Aster_Lang_Coverage_Test_Failing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGuessLanguages_RetainAllLanguages_MUUT0_kNiH0_1() {
        Lang lang = Lang.loadFromResource("languageRulesResourceName", Languages.getInstance("languagesResourceName"));
        String input = "some text that matches a rule";
        Languages.LanguageSet result = lang.guessLanguages(input);
        assertNotNull(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGuessLanguages_RetainAllLanguages_MUUT0_kNiH0_2() {
        Lang lang = Lang.loadFromResource("languageRulesResourceName", Languages.getInstance("languagesResourceName"));
        String input = "some text that matches a rule";
        Languages.LanguageSet result = lang.guessLanguages(input);
        assertEquals(Languages.ANY_LANGUAGE, result.getAny());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGuessLanguages_RemoveAllLanguages_bFAW1_oIWA0_1() {
        Lang lang = Lang.loadFromResource("languageRulesResourceName", Languages.getInstance("NameType"));
        String input = "some text that does not match any rule";
        Languages.LanguageSet result = lang.guessLanguages(input);
        assertNotNull(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGuessLanguages_RemoveAllLanguages_bFAW1_oIWA0_2() {
        Lang lang = Lang.loadFromResource("languageRulesResourceName", Languages.getInstance("NameType"));
        String input = "some text that does not match any rule";
        Languages.LanguageSet result = lang.guessLanguages(input);
        assertEquals(Languages.NO_LANGUAGES, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGuessLanguageMultiLanguage_ACqy1_Hkbd0() {
        Lang lang = Lang.loadFromResource("languageRulesResourceName", Languages.getInstance("NameType"));
        String result = lang.guessLanguage("some other text");
        assertEquals(Languages.ANY, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGuessLanguages_ReturnAnyLanguage_Efya2_VYMF0_1() {
        Lang lang = Lang.loadFromResource("languageRulesResourceName", Languages.getInstance("languagesResourceName"));
        String input = "some text that matches a rule but acceptOnMatch is false";
        Languages.LanguageSet result = lang.guessLanguages(input);
        assertNotNull(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGuessLanguages_ReturnAnyLanguage_Efya2_VYMF0_2() {
        Lang lang = Lang.loadFromResource("languageRulesResourceName", Languages.getInstance("languagesResourceName"));
        String input = "some text that matches a rule but acceptOnMatch is false";
        Languages.LanguageSet result = lang.guessLanguages(input);
        assertEquals(Languages.ANY_LANGUAGE, result.getAny());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testLoadFromResource_MalformedLine2_CEjV1_tHOP0() {
        String languageRulesResourceName = "testResource";
        Languages languages = Languages.getInstance("testResource");
        String rawLine = "pattern lang1+lang2"; // only 2 parts
        Lang lang = Lang.loadFromResource(languageRulesResourceName, languages);
        try {
            Lang.loadFromResource(languageRulesResourceName, languages);
            fail("Expected MalformedLineException");
        } catch (IllegalArgumentException e) {
            assertEquals("Malformed line 'pattern lang1+lang2' in language resource 'testResource'", e.getMessage());
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGuessLanguageSingleton_yHMV0_hIys0() {
        Lang lang = Lang.loadFromResource("some_resource_name", Languages.getInstance("some_resource_name"));
        assertEquals(Languages.ANY, lang.guessLanguage("some text"));
    }
}