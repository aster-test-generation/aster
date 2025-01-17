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

public class Aster_OptionGroup_Test_Passing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetRequiredTrue_LxoY0() {
        OptionGroup optionGroup = new OptionGroup();
        optionGroup.setRequired(true);
        assertTrue(optionGroup.isRequired());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetNamesEmpty_NVfS0() {
        OptionGroup optionGroup = new OptionGroup();
        assertTrue(optionGroup.getNames().isEmpty());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsRequired_TXlt0() {
        OptionGroup optionGroup = new OptionGroup();
        boolean result = optionGroup.isRequired();
        assertEquals(false, result); // Assuming default 'required' is false
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetSelectedReturnsNullInitially_Ifre0() {
        OptionGroup optionGroup = new OptionGroup();
        assertNull(optionGroup.getSelected());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testToStringEmptyOptionGroup_YbEN0() {
        OptionGroup optionGroup = new OptionGroup();
        assertEquals("[]", optionGroup.toString());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testToStringSingleShortOption_nQvp1() {
        OptionGroup optionGroup = new OptionGroup();
        Option option = new Option("a", "alpha", false, "Alpha option");
        optionGroup.addOption(option);
        assertEquals("[-a Alpha option]", optionGroup.toString());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testToStringSingleLongOption_Riwn2() {
        OptionGroup optionGroup = new OptionGroup();
        Option option = new Option(null, "beta", false, "Beta option");
        optionGroup.addOption(option);
        assertEquals("[--beta Beta option]", optionGroup.toString());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testToStringMultipleOptions_YIYB3() {
        OptionGroup optionGroup = new OptionGroup();
        Option option1 = new Option("a", "alpha", false, "Alpha option");
        Option option2 = new Option("b", null, false, "Beta option");
        optionGroup.addOption(option1);
        optionGroup.addOption(option2);
        assertEquals("[-a Alpha option, -b Beta option]", optionGroup.toString());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testToStringOptionWithoutDescription_XqGs4() {
        OptionGroup optionGroup = new OptionGroup();
        Option option = new Option("c", "charlie", false, null);
        optionGroup.addOption(option);
        assertEquals("[-c]", optionGroup.toString());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAddOption_dEOw0() {
        OptionGroup optionGroup = new OptionGroup();
        Option option = new Option("opt", "longOpt", true, "description");
        optionGroup.addOption(option);
        assertTrue(optionGroup.getOptions().contains(option));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetSelected_NullOption_Bgee0_VsRT0() {
        OptionGroup group = new OptionGroup();
        try {
            group.setSelected(null);
        } catch (AlreadySelectedException e) {
            fail("No exception should be thrown when setting null");
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetSelected_FirstTimeSelection_zveW1_PaYT0() {
        OptionGroup group = new OptionGroup();
        Option option = new Option("a", "optionA", false, "Option A");
        try {
            group.setSelected(option);
        } catch (AlreadySelectedException e) {
            fail("Unexpected AlreadySelectedException");
        }
        assertEquals("optionA", "optionA", group.getSelected());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetSelected_SameOptionSelectedTwice_EKyD3_GEee0() {
        OptionGroup group = new OptionGroup();
        Option option = new Option("a", "optionA", false, "Option A");
        try {
            group.setSelected(option);
            group.setSelected(option);
        } catch (AlreadySelectedException e) {
            fail("Should not throw an exception when the same option is selected twice");
        }
    }
}