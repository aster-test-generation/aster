/**
 * Generated by Aster
 */
package org.apache.commons.codec.language.bm;

import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_Lang_Coverage_Test_Failing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGuessLanguages_RetainAllLanguages_VAzP0_Tner0_1() {
        Lang lang = Lang.loadFromResource("languageRulesResourceName", Languages.getInstance("NameType"));
        String input = "hello world";
        Languages.LanguageSet result = lang.guessLanguages(input);
        assertNotNull(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGuessLanguages_RetainAllLanguages_VAzP0_Tner0_2() {
        Lang lang = Lang.loadFromResource("languageRulesResourceName", Languages.getInstance("NameType"));
        String input = "hello world";
        Languages.LanguageSet result = lang.guessLanguages(input);
        assertEquals(Languages.ANY_LANGUAGE, result.getAny());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGuessLanguageSingleton_Skcb0_GjBu0() {
        Lang lang = Lang.loadFromResource("some_resource_name", Languages.getInstance("some_resource_name"));
        assertEquals(Languages.ANY, lang.guessLanguage("some text"));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGuessLanguages_RemoveLanguages_TSGt1_SAPi0_1() {
        Lang lang = Lang.loadFromResource("languageRulesResourceName", Languages.getInstance("languagesResourceName"));
        String input = "goodbye";
        Languages.LanguageSet result = lang.guessLanguages(input);
        assertNotNull(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGuessLanguages_RemoveLanguages_TSGt1_SAPi0_2() {
        Lang lang = Lang.loadFromResource("languageRulesResourceName", Languages.getInstance("languagesResourceName"));
        String input = "goodbye";
        Languages.LanguageSet result = lang.guessLanguages(input);
        assertEquals(Languages.ANY_LANGUAGE, result.getAny());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGuessLanguageMultipleLanguages_pBVc1_vbUD0() {
        Lang lang = Lang.loadFromResource("languageRulesResourceName", Languages.getInstance("languagesResourceName"));
        String result = lang.guessLanguage("some other text");
        assertEquals(Lang.class, lang.getClass());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGuessLanguages_NoLanguagesMatched_ZUki2_SIxg0_2() {
        Lang lang = Lang.loadFromResource("languageRulesResourceName", Languages.getInstance("nameType"));
        String input = "random text";
        Languages.LanguageSet result = lang.guessLanguages(input);
        assertEquals(Languages.ANY_LANGUAGE, result.getAny());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testLoadFromResource_IllegalArgumentException_cAAI1_Dahe0() {
        String languageRulesResourceName = "testResource";
        Languages languages = Languages.getInstance("languagesResourceName");
        String rawLine = "pattern langs"; // Malformed line with only 2 parts
        try {
            Lang.loadFromResource(languageRulesResourceName, languages);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            assertEquals("Malformed line '" + rawLine + "' in language resource '" + languageRulesResourceName + "'", e.getMessage());
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGuessLanguages_NoLanguagesMatched_ZUki2_SIxg0_1() {
        Lang lang = Lang.loadFromResource("languageRulesResourceName", Languages.getInstance("nameType"));
        String input = "random text";
        Languages.LanguageSet result = lang.guessLanguages(input);
        assertNotNull(result);
    }
}