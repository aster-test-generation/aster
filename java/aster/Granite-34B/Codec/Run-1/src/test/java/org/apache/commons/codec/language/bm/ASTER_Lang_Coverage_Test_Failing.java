/**
 * Generated by Aster
 */
package org.apache.commons.codec.language.bm;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

public class Aster_Lang_Coverage_Test_Failing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGuessLanguageWithEmptyText_mHVG1_zGHA0() {
        Lang lang = Lang.loadFromResource("test-lang.xml", Languages.getInstance(NameType.GENERIC));
        String text = "";
        String result = lang.guessLanguage(text);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGuessLanguage_SjYN0_afMA0() {
        Lang lang = Lang.loadFromResource("language_resource_name", Languages.getInstance(NameType.GENERIC));
        String text = "This is a sample text";
        String result = lang.guessLanguage(text);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void test1_qWbp0_qOhE0() {
        Lang lang = Lang.loadFromResource("resource", Languages.getInstance(NameType.GENERIC));
        Languages.LanguageSet ls = lang.guessLanguages("input");
        assertEquals(Languages.ANY_LANGUAGE, ls);
    }
}