/**
 * Generated by Aster
 */
package org.apache.commons.cli;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

public class Aster_OptionBuilder_Coverage_Test_Failing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testWithType_DJEW0() {
        Object newType = "String";
        OptionBuilder optionBuilder = OptionBuilder.withType(newType);
        OptionBuilder result = optionBuilder.withType((Class<?>) newType);
        assertEquals(optionBuilder, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testWithLongOptInstance_ZJIb1_XJBM0() {
        String newLongopt = "testLongopt";
        OptionBuilder result = OptionBuilder.withLongOpt(newLongopt).isRequired(true);
        assertEquals(result.isRequired(), true);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testWithValueSeparator_mxmH0_qoIU0() {
        char sep = ',';
        OptionBuilder withValueSeparator = OptionBuilder.withValueSeparator(sep);
        assertEquals(sep, OptionBuilder.isRequired(true));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHasArgTrue_CKHL0_Fynx0() {
        OptionBuilder.hasArg(true);
        assertEquals(true, OptionBuilder.isRequired());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testWithValueSeparator_ZHoR0_nCeu1() {
        OptionBuilder optionBuilder = OptionBuilder.withValueSeparator();
        assertEquals(true, OptionBuilder.isRequired());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHasOptionalArg_fnUe0_YYos0() {
        OptionBuilder.hasOptionalArg();
        assertEquals(true, OptionBuilder.isRequired());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHasArgFalse_EPuD1_ihce0() {
        OptionBuilder.hasArg(false);
        assertEquals(false, OptionBuilder.isRequired());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testWithValueSeparatorInstance_ILIV1_tsvN0() {
        char sep = '-';
        OptionBuilder withValueSeparator = OptionBuilder.withValueSeparator(sep);
        assertEquals(true, withValueSeparator.isRequired());
    }
}