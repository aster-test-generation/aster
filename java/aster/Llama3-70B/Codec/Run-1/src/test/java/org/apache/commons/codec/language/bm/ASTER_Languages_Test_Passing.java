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

public class Aster_Languages_Test_Passing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetInstance_NameType_IyeV0() {
        Languages languages = Languages.getInstance(NameType.ASHKENAZI);
        assertNotNull(languages);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetInstance_withValidResourceName_HJsM0_1() {
        String languagesResourceName = "valid_resource_name";
        try {
            Languages languages = Languages.getInstance(languagesResourceName);
            assertNull(languages);
        } catch (IllegalArgumentException e) {
            // Expected
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetInstance_withInvalidResourceName_CosE1() {
        String languagesResourceName = "invalid_resource_name";
        try {
            Languages.getInstance(languagesResourceName);
            fail("Expected exception not thrown");
        } catch (Exception e) {
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetInstance_withNullResourceName_pVax3() {
        String languagesResourceName = null;
        try {
            Languages.getInstance(languagesResourceName);
            fail("Expected exception not thrown");
        } catch (Exception e) {
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetInstance_withResourceNameHavingExtendedComment_QEln4_1() {
        String languagesResourceName = "resource_name_with_extended_comment";
        try {
            Languages languages = Languages.getInstance(languagesResourceName);
            assertNull(languages);
        } catch (IllegalArgumentException e) {
            // expected
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetInstance_withResourceNameHavingExtendedComment_QEln4_2() {
        String languagesResourceName = "resource_name_with_extended_comment";
        try {
            Languages languages = Languages.getInstance(languagesResourceName);
            assertNull(languages);
        } catch (IllegalArgumentException e) {
            // Expected
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetInstance_withResourceNameHavingEmptyLines_RJcV5_1() {
        String languagesResourceName = "resource_name_with_empty_lines";
        try {
            Languages languages = Languages.getInstance(languagesResourceName);
            fail("Expected getInstance to throw an exception, but it did not");
        } catch (IllegalArgumentException e) {
            assertNotNull(e.getMessage());
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetInstance_withResourceNameHavingEmptyLines_RJcV5_2() {
        String languagesResourceName = "resource_name_with_empty_lines";
        try {
            Languages languages = Languages.getInstance(languagesResourceName);
            fail("Expected getInstance to throw an exception, but it did not");
        } catch (IllegalArgumentException e) {
            assertEquals("Unable to resolve required resource: resource_name_with_empty_lines", e.getMessage());
        }
    }
}