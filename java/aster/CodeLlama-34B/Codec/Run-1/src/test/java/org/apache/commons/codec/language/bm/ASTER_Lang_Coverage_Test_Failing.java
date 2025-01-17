/**
 * Generated by Aster
 */
package org.apache.commons.codec.language.bm;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

public class Aster_Lang_Coverage_Test_Failing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testLoadFromResource_MalformedLine_lozU0() {
        String languageRulesResourceName = "test_resource";
        Languages languages = Languages.getInstance("test_languages");
        try {
            Lang.loadFromResource(languageRulesResourceName, languages);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            assertEquals("Malformed line 'test_line' in language resource 'test_resource'", e.getMessage());
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testLoadFromResource_InvalidLanguage_NsHY1() {
        String languageRulesResourceName = "test_resource";
        Languages languages = Languages.getInstance("test_languages");
        try {
            Lang.loadFromResource(languageRulesResourceName, languages);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            assertEquals("Invalid language 'test_language' in language resource 'test_resource'", e.getMessage());
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGuessLanguage_MultipleLanguages_HbuE1_lTOJ0() {
        Lang lang = Lang.loadFromResource("languageRulesResourceName", Languages.getInstance("languagesResourceName"));
        String text = "Hello World, ";
        String expected = Languages.ANY;
        String actual = lang.guessLanguage(text);
        assertEquals(expected, actual);
    }
}