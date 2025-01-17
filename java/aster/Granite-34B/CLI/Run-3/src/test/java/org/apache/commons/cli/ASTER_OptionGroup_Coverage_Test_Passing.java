/**
 * Generated by Aster
 */
package org.apache.commons.cli;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

import java.util.Collection;
import java.util.HashSet;
import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

public class Aster_OptionGroup_Coverage_Test_Passing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void test_getNames_vWjU0() {
        OptionGroup optionGroup = new OptionGroup();
        Collection<String> expected = new HashSet<>();
        Collection<String> actual = optionGroup.getNames();
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testToStringWithOpt_pUdZ0() {
        OptionGroup optionGroup = new OptionGroup();
        Option option = new Option("a", "alpha", false, "Alpha");
        optionGroup.addOption(option);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testToStringWithBothOptAndLongOpt_ADuS2() {
        OptionGroup optionGroup = new OptionGroup();
        Option option = new Option("a", "alpha", false, "Alpha");
        optionGroup.addOption(option);
        assertEquals("[-a Alpha]", optionGroup.toString());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetSelectedWithOptionNull_kxYT0() throws org.apache.commons.cli.AlreadySelectedException {
        OptionGroup optionGroup = new OptionGroup();
        optionGroup.setSelected(null);
        Assertions.assertNull(optionGroup.getSelected());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetSelectedWithOptionNotNullAndSelectedNull_bJvh1() throws org.apache.commons.cli.AlreadySelectedException {
        OptionGroup optionGroup = new OptionGroup();
        Option option = new Option("option", "longOption", true, "description");
        optionGroup.setSelected(option);
        Assertions.assertEquals("option", optionGroup.getSelected());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetSelectedWithOptionNotNullAndSelectedNotNullAndEquals_VCRL3() throws org.apache.commons.cli.AlreadySelectedException {
        OptionGroup optionGroup = new OptionGroup();
        Option option = new Option("option", "longOption", true, "description");
        optionGroup.setSelected(option);
        optionGroup.setSelected(option);
        Assertions.assertEquals("option", optionGroup.getSelected());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetSelectedWithOptionNotNullAndSelectedNotNullAndNotEquals_Dxjd2_KXCR0() throws org.apache.commons.cli.AlreadySelectedException {
        OptionGroup optionGroup = new OptionGroup();
        Option option1 = new Option("option1", "longOption1", true, "description1");
        Option option2 = new Option("option2", "longOption2", true, "description2");
        optionGroup.setSelected(option1);
        try {
            optionGroup.setSelected(option2);
            Assertions.fail("Expected AlreadySelectedException not thrown");
        } catch (AlreadySelectedException e) {
            Assertions.assertEquals(optionGroup, e.getOptionGroup());
            Assertions.assertEquals(option2, e.getOption());
        }
    }
}