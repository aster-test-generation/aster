/**
 * Generated by Aster
 */
package org.apache.commons.codec.language.bm;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

public class Aster_Languages_Test_Failing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetInstanceWithLanguagesResourceName_OmoS3() {
        Languages languages = Languages.getInstance("languages.properties");
        assertNotNull(languages);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetInstanceWithValidLanguagesResourceName_XpGr1() {
        Languages.getInstance("valid_languages_resource_name");
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetInstanceWithInvalidLanguagesResourceName_FBjV4() {
        Languages.getInstance("invalid_languages_resource_name");
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetLanguages_uQgm5() {
        Languages.getInstance("valid_languages_resource_name").getLanguages();
    }
}