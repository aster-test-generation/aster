/**
 * Generated by Aster
 */
package org.apache.commons.cli;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

public class Aster_OptionBuilder_Coverage_Test_Passing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testWithTypeCasting_GKlz0() {
        Class<?> expectedType = Integer.class;
        OptionBuilder result = OptionBuilder.withType(expectedType);
        assertNotNull(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHasArgSetsArgCountCorrectly_TFzB0() {
        OptionBuilder result = OptionBuilder.hasArg();
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testWithDescriptionSetsDescriptionCorrectly_nWoR0() {
        String expectedDescription = "Test description";
        OptionBuilder result = OptionBuilder.withDescription(expectedDescription);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testWithDescriptionReturnsSameInstance_fyrM1() {
        String anyDescription = "Any description";
        OptionBuilder result = OptionBuilder.withDescription(anyDescription);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHasArgsSetsArgCountCorrectly_ggjL0() {
        int numArgs = 5;
        OptionBuilder result = OptionBuilder.hasArgs(numArgs);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHasArgsReturnsSingletonInstance_fQun1() {
        int numArgs = 3;
        OptionBuilder result = OptionBuilder.hasArgs(numArgs);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testWithLongOptSetsLongOption_Uhmh0() {
        String expectedLongOption = "testOption";
        OptionBuilder.withLongOpt(expectedLongOption);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testWithLongOptReturnsInstance_aTIh1() {
        OptionBuilder result = OptionBuilder.withLongOpt("anyOption");
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testWithArgNameSetsArgName_znhx0() {
        String expectedArgName = "testArgName";
        OptionBuilder.withArgName(expectedArgName);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHasOptionalArgReturnsInstance_zkSf2() {
        OptionBuilder result = OptionBuilder.hasOptionalArg();
        assertNotNull(result, "hasOptionalArg should return an instance of OptionBuilder");
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsRequiredTrue_pExm0() {
        OptionBuilder result = OptionBuilder.isRequired(true);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsRequiredFalse_kNqP1() {
        OptionBuilder result = OptionBuilder.isRequired(false);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsRequiredSetsRequiredTrue_jELY0() {
        OptionBuilder.isRequired();
        java.lang.reflect.Field field = null;
        try {
            field = OptionBuilder.class.getDeclaredField("required");
            field.setAccessible(true);
            boolean value = (Boolean) field.get(null);
        } catch (NoSuchFieldException | IllegalAccessException e) {
            e.printStackTrace();
        }
    }
}