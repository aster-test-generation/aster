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

public class Aster_OptionGroup_Coverage_Test_Failing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testToString_withBothOptAndLongOpt_gLZD2_fid1() {
        OptionGroup optionGroup = new OptionGroup();
        Option option1 = new Option("o", "longOption", true, "description");
        optionGroup.addOption(option1);
        assertEquals("[-o --longOption description]", optionGroup.toString());
    }
}