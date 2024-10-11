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

public class Aster_OptionGroup_Coverage_Test_Passing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testToStringWithOpt_JgRb0() {
        OptionGroup optionGroup = new OptionGroup();
        Option option = new Option("a", "description");
        optionGroup.addOption(option);
        String expected = "[-a description]";
        String actual = optionGroup.toString();
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testToStringWithMultipleOptions_dVvx3() {
        OptionGroup optionGroup = new OptionGroup();
        Option option1 = new Option("a", "description1");
        Option option2 = new Option("b", "description2");
        optionGroup.addOption(option1);
        optionGroup.addOption(option2);
        String expected = "[-a description1, -b description2]";
        String actual = optionGroup.toString();
        assertEquals(expected, actual);
    }
}