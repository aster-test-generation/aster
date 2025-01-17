/**
 * Generated by Aster
 */
package org.apache.commons.codec.language.bm;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

public class Aster_Languages_Test_Failing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetInstance_String_rGjI1() {
        Languages languages = Languages.getInstance("languages.properties");
        assertNotNull(languages);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetInstance_String_uzMk1_1() {
        Languages languages = Languages.getInstance("languages.txt");
        assertNotNull(languages);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetInstance_String_uzMk1_2() {
        Languages languages = Languages.getInstance("languages.txt");
        assertTrue(languages.getLanguages().contains("English"));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetLanguages_CVyg2() {
        Languages languages = Languages.getInstance("languages.txt");
        Set<String> expectedLanguages = new HashSet<>();
        expectedLanguages.add("English");
        expectedLanguages.add("Spanish");
        expectedLanguages.add("French");
        assertEquals(expectedLanguages, languages.getLanguages());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetInstance_String_uzMk1() {
        Languages languages = Languages.getInstance("languages.txt");
        assertNotNull(languages);
        assertTrue(languages.getLanguages().contains("English"));
    }
}