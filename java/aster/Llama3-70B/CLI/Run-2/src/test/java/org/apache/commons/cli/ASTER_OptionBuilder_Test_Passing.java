/**
 * Generated by Aster
 */
package org.apache.commons.cli;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

public class Aster_OptionBuilder_Test_Passing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testWithType_WDhB0() {
        Class<?> newType = Object.class;
        OptionBuilder optionBuilder = OptionBuilder.withType(newType);
        assertNotNull(optionBuilder);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHasArg_sameInstance_fkwR6() {
        OptionBuilder optionBuilder = OptionBuilder.hasArg(true);
        OptionBuilder sameOptionBuilder = OptionBuilder.hasArg(true);
        assertSame(optionBuilder, sameOptionBuilder);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCreate_hczD0() {
        Option option = OptionBuilder.create('a');
        assertEquals("a", option.getOpt());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testWithValueSeparator6_Fdht5() {
        OptionBuilder.withValueSeparator(',');
        assertNotNull(OptionBuilder.withValueSeparator(','));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testWithValueSeparator7_Othb6() {
        OptionBuilder.withValueSeparator(';');
        assertNotNull(OptionBuilder.withValueSeparator(';'));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testWithValueSeparator8_ONId7() {
        OptionBuilder.withValueSeparator(':');
        assertNotNull(OptionBuilder.withValueSeparator(':'));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testWithValueSeparator9_pSCQ8() {
        OptionBuilder.withValueSeparator('.');
        assertNotNull(OptionBuilder.withValueSeparator('.'));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testWithValueSeparator10_EenI9() {
        OptionBuilder.withValueSeparator(' ');
        assertNotNull(OptionBuilder.withValueSeparator(' '));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHasArg_true_nOSr0_kEer0() {
        OptionBuilder optionBuilder = OptionBuilder.hasArg(true);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHasArg_default_FAcY2_TRGv0() {
        OptionBuilder optionBuilder = OptionBuilder.isRequired(true);
        optionBuilder = OptionBuilder.hasArg();
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHasArg_multipleCalls_kOOx3_qsfl0() {
        OptionBuilder optionBuilder = OptionBuilder.hasArg(true);
        optionBuilder = OptionBuilder.hasArg(false);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsRequired_bkEG0_jhQm0() {
        OptionBuilder result = OptionBuilder.isRequired(true);
        assertNotNull(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsRequiredFalse_XxCw1_VYXo0() {
        OptionBuilder result = OptionBuilder.isRequired(false);
        assertNotNull(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsRequiredFalseChaining_DuiV3_QBlI0() {
        OptionBuilder result = OptionBuilder.isRequired(false).hasArg();
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsRequiredTrueMultipleCalls_twCu4_XXRv0() {
        OptionBuilder result = OptionBuilder.isRequired(true).isRequired(true);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsRequiredFalseMultipleCalls_hasV5_Ialq0() {
        OptionBuilder result = OptionBuilder.isRequired(false).isRequired(false);
    }
}