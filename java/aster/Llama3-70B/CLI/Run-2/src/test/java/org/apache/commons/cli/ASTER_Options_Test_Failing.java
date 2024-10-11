/**
 * Generated by Aster
 */
package org.apache.commons.cli;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

import java.util.List;
import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

public class Aster_Options_Test_Failing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testToString_qDry0() {
        Options options = new Options();
        String expected = "[ Options: [ short [] ] [ long null ]]";
        assertEquals(expected, options.toString());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetOptionGroup_qtbk0() {
        Options options = new Options();
        Option option = new Option("option", "longOption", true, "description");
        OptionGroup optionGroup = options.getOptionGroup(option);
        assertNotNull(optionGroup);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAddOption_CbuR0_2() {
        Options options = new Options();
        options.addOption("opt", "description");
        Option option = options.getOption("opt");
        assertEquals("opt", option.getLongOpt());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAddOption_withLongOpt_zflA0_KaFU0_5() {
        Options options = new Options();
        options.addOption("o", "option description");
        Option opt = options.getOption("o");
        assertFalse(options.getRequiredOptions().isEmpty());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAddOption_withoutOptionalArg_DVto3_rpNP0_3() {
        Options options = new Options();
        Option opt = Option.builder("o").build();
        options.addOption("o", "description");
        assertFalse(((List<?>) options.getRequiredOptions()).isEmpty());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAddOption_BIHf0_QwLk0_2() {
        Options options = new Options();
        options.addOption("opt", true, "description");
        Option option = options.getOption("opt");
        assertEquals("opt", option.getLongOpt());
    }
}