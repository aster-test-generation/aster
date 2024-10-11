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
    public void testToStringWithOpt_pUdZ0_fid2() {
        OptionGroup optionGroup = new OptionGroup();
        Option option = new Option("a", "alpha", false, "Alpha");
        optionGroup.addOption(option);
        assertEquals("[a Alpha]", optionGroup.toString());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testToStringWithLongOpt_oDuK1_fid2() {
        OptionGroup optionGroup = new OptionGroup();
        Option option = new Option("a", "alpha", false, "Alpha");
        optionGroup.addOption(option);
        assertEquals("[--alpha Alpha]", optionGroup.toString());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testToStringWithBothOptAndLongOpt_ADuS2_fid2() {
        OptionGroup optionGroup = new OptionGroup();
        Option option = new Option("a", "alpha", false, "Alpha");
        optionGroup.addOption(option);
        assertEquals("[a, --alpha Alpha]", optionGroup.toString());
    }
}