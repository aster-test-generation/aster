/**
 * Generated by Aster
 */
package org.apache.commons.codec.language.bm;

import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.fail;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_Languages_Test_Passing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetInstanceAshkenazi_rFhb0() throws Exception {
        Languages languages = Languages.getInstance(NameType.ASHKENAZI);
        assertNotNull(languages);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetInstanceSephardic_RrmB1() throws Exception {
        Languages languages = Languages.getInstance(NameType.SEPHARDIC);
        assertNotNull(languages);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetInstanceGeneric_sTEJ2() throws Exception {
        Languages languages = Languages.getInstance(NameType.GENERIC);
        assertNotNull(languages);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetInstanceWithNullResourceName_rcWu1() throws Exception {
        final String languagesResourceName = null;
        try {
            Languages.getInstance(languagesResourceName);
            fail("Expected NullPointerException");
        } catch (NullPointerException e) {
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetInstanceWithEmptyResourceName_hkaZ2() throws Exception {
        final String languagesResourceName = "";
        try {
            Languages.getInstance(languagesResourceName);
            fail("Expected NullPointerException");
        } catch (NullPointerException e) {
        }
    }
}