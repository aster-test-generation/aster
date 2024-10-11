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

public class Aster_OptionGroup_Coverage_Test_Passing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testToString_EmptyOptionGroup_VyMu0() {
        OptionGroup optionGroup = new OptionGroup();
        String result = optionGroup.toString();
        assertEquals("[]", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetSelectedNullOption_uafu0() throws AlreadySelectedException {
        OptionGroup optionGroup = new OptionGroup();
        optionGroup.setSelected(null);
        assertNull(optionGroup.getSelected());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetSelectedDifferentOptions_hSLE1() throws AlreadySelectedException {
        OptionGroup optionGroup = new OptionGroup();
        optionGroup.setSelected(new Option("option1", "longOption1", true, "description1"));
        Option option = new Option("option2", "longOption2", true, "description2");
        try {
            optionGroup.setSelected(option);
            fail("Expected AlreadySelectedException");
        } catch (AlreadySelectedException e) {
            assertEquals(optionGroup, e.getOptionGroup());
            assertEquals(option, e.getOption());
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetSelectedSameOption_ORSj2() throws AlreadySelectedException {
        OptionGroup optionGroup = new OptionGroup();
        Option option = new Option("option1", "longOption1", true, "description1");
        optionGroup.setSelected(option);
        assertEquals(option.getKey(), optionGroup.getSelected());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetSelectedSameOptionKey_nAsE3_pNYe0() throws AlreadySelectedException {
        OptionGroup optionGroup = new OptionGroup();
        Option option = new Option("option1", "longOption1", true, "description1");
        optionGroup.setSelected(option);
        assertEquals(option.getKey(), optionGroup.getSelected().toString());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetSelectedDifferentOptionKey_HITY5_FPDn0() throws org.apache.commons.cli.AlreadySelectedException {
        OptionGroup optionGroup = new OptionGroup();
        Option option = new Option("option1", "option1", false, "description");
        optionGroup.setSelected(option);
        try {
            optionGroup.setSelected(new Option("option2", "option2", false, "description"));
            fail("Expected AlreadySelectedException");
        } catch (AlreadySelectedException e) {
            assertEquals(optionGroup, e.getOptionGroup());
            assertEquals("option2", e.getOption().getKey());
        }
    }
}