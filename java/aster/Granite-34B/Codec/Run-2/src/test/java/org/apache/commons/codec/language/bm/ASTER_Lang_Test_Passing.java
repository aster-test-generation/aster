/**
 * Generated by Aster
 */
package org.apache.commons.codec.language.bm;

import java.util.HashSet;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_Lang_Test_Passing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void guessLanguages_withNoLanguages_returnsNoLanguages_uhwt0() {
        final String input = "This is a test";
        final String text = input.toLowerCase(Locale.ENGLISH);
        final Set<String> langs = new HashSet<>();
        final Languages.LanguageSet ls = Languages.LanguageSet.from(langs);
        assertEquals(Languages.NO_LANGUAGES, ls);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGuessLanguage_OneLanguage_IoPU0_YXoY0() {
        Lang lang = Lang.instance(NameType.ASHKENAZI);
        String text = "This is a sample text";
        String result = lang.guessLanguage(text);
        String expected = "german";
        org.junit.jupiter.api.Assertions.assertEquals(expected, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGuessLanguage_MultipleLanguages_XOpn1_tLbW0() {
        Lang lang = Lang.instance(NameType.ASHKENAZI);
        String text = "This is a sample text in English and Hindi";
        String result = lang.guessLanguage(text);
        String expected = "german";
        org.junit.jupiter.api.Assertions.assertEquals(expected, result);
    }
}