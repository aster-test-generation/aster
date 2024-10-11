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

public class Aster_OptionBuilder_Coverage_Test_Passing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testWithType_YQNU0() {
        Object newType = String.class;
        OptionBuilder result = OptionBuilder.withType(newType);
        assertNotNull(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHasArgs_ReturnInstance_fNBo1() {
        OptionBuilder optionBuilder = OptionBuilder.hasArgs();
        assertNotNull(optionBuilder);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testWithType_ReturnsSameInstance_lkMs1() {
        Class<?> newType = Integer.class;
        OptionBuilder instance = OptionBuilder.withType(newType);
        OptionBuilder sameInstance = OptionBuilder.withType(newType);
        assertSame(instance, sameInstance);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testWithDescription_ReturnsInstance_wNWd1_VYIU0() {
        OptionBuilder result = OptionBuilder.isRequired(true);
        assertSame(result, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHasOptionalArgs_optionalArg_anIS1_hUJT0() {
        OptionBuilder optionBuilder = OptionBuilder.hasOptionalArgs();
        assertNotNull(optionBuilder);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testWithDescription_SetDescription_IXMr0_qGvW0() {
        String newDescription = "New Description";
        OptionBuilder result = OptionBuilder.withDescription(newDescription);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHasOptionalArg_argCount_FHGx0_MPYF0() {
        OptionBuilder optionBuilder = OptionBuilder.hasOptionalArg();
        assertNotNull(optionBuilder);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHasOptionalArgs_returnInstance_EiMW2_Llgv0_2() {
        OptionBuilder optionBuilder = OptionBuilder.hasOptionalArgs();
        assertTrue(optionBuilder instanceof OptionBuilder);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsRequired_ReturnsInstance_OMEX1_ReGl0_1() {
        OptionBuilder result = OptionBuilder.isRequired(true);
        assertNotNull(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsRequired_ReturnsInstance_OMEX1_ReGl0_2() {
        OptionBuilder result = OptionBuilder.isRequired(true);
        assertTrue(result instanceof OptionBuilder);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsRequired_SetRequired_cPJf1_BGKZ0() {
        OptionBuilder optionBuilder = OptionBuilder.hasOptionalArgs(2);
        assertNotNull(optionBuilder);
        OptionBuilder.isRequired(true);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsRequired_SetRequired_cPJf1_xLUz1_1() {
        OptionBuilder optionBuilder = OptionBuilder.hasOptionalArgs(2);
        OptionBuilder isRequiredOptionBuilder = OptionBuilder.isRequired(true);
        assertNotNull(optionBuilder);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsRequired_SetRequired_cPJf1_xLUz1_2() {
        OptionBuilder optionBuilder = OptionBuilder.hasOptionalArgs(2);
        OptionBuilder isRequiredOptionBuilder = OptionBuilder.isRequired(true);
        assertNotNull(isRequiredOptionBuilder);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCreate_WithNonNullLongOption_ReturnsOption_peuc3_ibro1() throws java.lang.IllegalArgumentException {
        OptionBuilder optionBuilder = OptionBuilder.hasArg();
        optionBuilder = optionBuilder.withLongOpt("longopt");
        Option option = optionBuilder.create();
        assertNotNull(option);
    }
}