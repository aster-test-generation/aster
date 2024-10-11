/**
 * Generated by Aster
 */
package org.apache.commons.cli;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

import java.util.Collection;
import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

public class Aster_OptionGroup_Test_Passing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetRequiredTrue_cwsx0() {
        OptionGroup optionGroup = new OptionGroup();
        optionGroup.setRequired(true);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetRequiredFalse_SBNY1() {
        OptionGroup optionGroup = new OptionGroup();
        optionGroup.setRequired(false);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetNames_nvzs0_1() {
        OptionGroup optionGroup = new OptionGroup();
        Collection<String> names = optionGroup.getNames();
        assertNotNull(names);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetNamesWithEmptyMap_HBHK1_2() {
        OptionGroup optionGroup = new OptionGroup();
        Collection<String> names = optionGroup.getNames();
        assertTrue(names.size() == 0);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    void testOptionGroupRequired_aNwt0() {
        OptionGroup optionGroup = new OptionGroup();
        optionGroup.setRequired(true);
        boolean result = optionGroup.isRequired();
        assert result == true;
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    void testOptionGroupNotRequired_cnHR1() {
        OptionGroup optionGroup = new OptionGroup();
        optionGroup.setRequired(false);
        boolean result = optionGroup.isRequired();
        assert result == false;
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetSelected_lGIR0() {
        OptionGroup optionGroup = new OptionGroup();
        optionGroup.getSelected();
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetSelectedWithCoverage_RtUb1() {
        OptionGroup optionGroup = new OptionGroup();
        optionGroup.getSelected();
        optionGroup.getSelected();
        optionGroup.getSelected();
        optionGroup.getSelected();
        optionGroup.getSelected();
        optionGroup.getSelected();
        optionGroup.getSelected();
        optionGroup.getSelected();
        optionGroup.getSelected();
        optionGroup.getSelected();
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testToStringWithNoOptions_oOuB0() {
        OptionGroup group = new OptionGroup();
        assertEquals("[]", group.toString());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testToStringWithOneOption_wSES1() {
        OptionGroup group = new OptionGroup();
        Option option = new Option("f", "file", false, "description");
        group.addOption(option);
        assertEquals("[-f description]", group.toString());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testToStringWithTwoOptions_NBeH2() {
        OptionGroup group = new OptionGroup();
        Option option1 = new Option("f", "file", false, "description");
        Option option2 = new Option("d", "dir", false, "description");
        group.addOption(option1);
        group.addOption(option2);
        assertEquals("[-f description, -d description]", group.toString());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testToStringWithDescriptionOnly_BCkR4() {
        OptionGroup group = new OptionGroup();
        Option option = new Option(null, "file", false, "description");
        group.addOption(option);
        assertEquals("[--file description]", group.toString());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAddOption_jsnU0() {
        OptionGroup optionGroup = new OptionGroup();
        Option option = new Option("option", "longOption", true, "description");
        optionGroup.addOption(option);
        assertEquals(1, optionGroup.getOptions().size());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAddOptionWithNoArg_tCxI1() {
        OptionGroup optionGroup = new OptionGroup();
        Option option = new Option("option", true, "description");
        optionGroup.addOption(option);
        assertEquals(1, optionGroup.getOptions().size());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAddOptionWithNoLongOption_XFuB2() {
        OptionGroup optionGroup = new OptionGroup();
        Option option = new Option("option", "description");
        optionGroup.addOption(option);
        assertEquals(1, optionGroup.getOptions().size());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetSelected_OptionWithoutSelectedOption_JpwF1_CfoL0() {
        OptionGroup optionGroup = new OptionGroup();
        Option option = new Option("option", "description");
        try {
            optionGroup.setSelected(option);
        } catch (AlreadySelectedException e) {
            fail("Unexpected exception: " + e.getMessage());
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetNamesWithEmptyMap_HBHK1() {
        OptionGroup optionGroup = new OptionGroup();
        Collection<String> names = optionGroup.getNames();
        assertNotNull(names);
        assertTrue(names.size() == 0);
    }
}