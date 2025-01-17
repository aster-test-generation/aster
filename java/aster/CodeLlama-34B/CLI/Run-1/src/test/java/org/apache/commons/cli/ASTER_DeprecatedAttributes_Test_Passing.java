/**
 * Generated by Aster
 */
package org.apache.commons.cli;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

public class Aster_DeprecatedAttributes_Test_Passing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetDescriptionWithNonEmptyInputType_fCsF13_XhVH0() {
        DeprecatedAttributes deprecatedAttributes = DeprecatedAttributes.builder().get();
        String description = deprecatedAttributes.getDescription();
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetDescriptionWithNonEmptyInputValue_MqDc18_STzq0() {
        DeprecatedAttributes deprecatedAttributes = DeprecatedAttributes.builder().get();
        String description = deprecatedAttributes.getDescription();
        assertEquals("", description);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testBuilder_bZcj0_kWLH0() {
        DeprecatedAttributes.Builder builder = DeprecatedAttributes.builder();
        assertNotNull(builder);
    }
}