/**
 * Generated by Aster
 */
package org.apache.commons.codec.language.bm;
import java.util.HashSet;
import java.util.Set;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import java.util.HashSet;
import java.util.Set;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_Languages_Test_Failing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetInstanceWithValidResourceName_mCFi0_1() {
        final String languagesResourceName = "validResourceName";
        final Languages languages = Languages.getInstance(languagesResourceName);
        final Set<String> expectedLanguages = new HashSet<>();
        assertNotNull(languages);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetInstanceWithValidResourceName_mCFi0_2() {
        final String languagesResourceName = "validResourceName";
        final Languages languages = Languages.getInstance(languagesResourceName);
        final Set<String> expectedLanguages = new HashSet<>();
        assertEquals(expectedLanguages, languages.getLanguages());}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetInstanceWithCommentedResourceName_uJtO4_1() {
        final String languagesResourceName = "commentedResourceName";
        final Languages languages = Languages.getInstance(languagesResourceName);
        final Set<String> expectedLanguages = new HashSet<>();
        assertNotNull(languages);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetInstanceWithCommentedResourceName_uJtO4_2() {
        final String languagesResourceName = "commentedResourceName";
        final Languages languages = Languages.getInstance(languagesResourceName);
        final Set<String> expectedLanguages = new HashSet<>();
        assertEquals(expectedLanguages, languages.getLanguages());}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetInstanceWithExtendedCommentedResourceName_TDjq5_1() {
        final String languagesResourceName = "extendedCommentedResourceName";
        final Languages languages = Languages.getInstance(languagesResourceName);
        final Set<String> expectedLanguages = new HashSet<>();
        assertNotNull(languages);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetInstanceWithExtendedCommentedResourceName_TDjq5_2() {
        final String languagesResourceName = "extendedCommentedResourceName";
        final Languages languages = Languages.getInstance(languagesResourceName);
        final Set<String> expectedLanguages = new HashSet<>();
        assertEquals(expectedLanguages, languages.getLanguages());}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetLanguages_lySP0_CNxs0() {
    Languages languages = Languages.getInstance("languagesResourceName");
    Set<String> actual = languages.getLanguages();
    assertNotNull(actual);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetInstanceWithNullResourceName_aOLQ1_fid1() {
        final String languagesResourceName = null;
        try {
            Languages.getInstance(languagesResourceName);
            assert false;
        } catch (NullPointerException e) {
            assertEquals("languageResourceName cannot be null", e.getMessage());
        }
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetInstanceWithInvalidResourceName_ymVc3_Gffq0_fid1() {
    final String languagesResourceName = "invalidResourceName";
    try {
        Languages.getInstance(languagesResourceName);
        assert false;
    } catch (Exception e) {
        assertEquals("Resource not found", e.getMessage());
    }
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetInstanceWithValidResourceName_mCFi0() {
        final String languagesResourceName = "validResourceName";
        final Languages languages = Languages.getInstance(languagesResourceName);
        assertNotNull(languages);
        final Set<String> expectedLanguages = new HashSet<>();
        assertEquals(expectedLanguages, languages.getLanguages());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetInstanceWithCommentedResourceName_uJtO4() {
        final String languagesResourceName = "commentedResourceName";
        final Languages languages = Languages.getInstance(languagesResourceName);
        assertNotNull(languages);
        final Set<String> expectedLanguages = new HashSet<>();
        assertEquals(expectedLanguages, languages.getLanguages());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetInstanceWithExtendedCommentedResourceName_TDjq5() {
        final String languagesResourceName = "extendedCommentedResourceName";
        final Languages languages = Languages.getInstance(languagesResourceName);
        assertNotNull(languages);
        final Set<String> expectedLanguages = new HashSet<>();
        assertEquals(expectedLanguages, languages.getLanguages());
    }
}