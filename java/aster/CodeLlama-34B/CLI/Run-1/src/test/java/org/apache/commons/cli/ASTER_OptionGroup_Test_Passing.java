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
    public void testGetNames_emptyMap_Havj0() {
        OptionGroup optionGroup = new OptionGroup();
        Collection<String> names = optionGroup.getNames();
        assertTrue(names.isEmpty());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetOptions_empty_emgu0() {
        OptionGroup optionGroup = new OptionGroup();
        Collection<Option> options = optionGroup.getOptions();
        assertTrue(options.isEmpty());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetOptions_nonEmpty_cKOd1_1() {
        OptionGroup optionGroup = new OptionGroup();
        Option option1 = new Option("option1", "Option 1");
        Option option2 = new Option("option2", "Option 2");
        optionGroup.addOption(option1);
        optionGroup.addOption(option2);
        Collection<Option> options = optionGroup.getOptions();
        assertEquals(2, options.size());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetOptions_nonEmpty_cKOd1_2() {
        OptionGroup optionGroup = new OptionGroup();
        Option option1 = new Option("option1", "Option 1");
        Option option2 = new Option("option2", "Option 2");
        optionGroup.addOption(option1);
        optionGroup.addOption(option2);
        Collection<Option> options = optionGroup.getOptions();
        assertTrue(options.contains(option1));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetOptions_nonEmpty_cKOd1_3() {
        OptionGroup optionGroup = new OptionGroup();
        Option option1 = new Option("option1", "Option 1");
        Option option2 = new Option("option2", "Option 2");
        optionGroup.addOption(option1);
        optionGroup.addOption(option2);
        Collection<Option> options = optionGroup.getOptions();
        assertTrue(options.contains(option2));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsRequired_True_znRK0() {
        OptionGroup optionGroup = new OptionGroup();
        optionGroup.setRequired(true);
        assertTrue(optionGroup.isRequired());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsRequired_False_cExI1() {
        OptionGroup optionGroup = new OptionGroup();
        optionGroup.setRequired(false);
        assertFalse(optionGroup.isRequired());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsRequired_NullOptionGroup_akUB7() {
        OptionGroup optionGroup = null;
        assertNull(optionGroup);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsRequired_NonBooleanOptionGroupNameAndEmptyValue_EGYG28() {
        OptionGroup optionGroup = new OptionGroup();
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetSelected_xqnt0() {
        OptionGroup optionGroup = new OptionGroup();
        String selected = optionGroup.getSelected();
        assertNull(selected);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetSelectedWithNoOptions_hXME3() {
        OptionGroup optionGroup = new OptionGroup();
        String selected = optionGroup.getSelected();
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testToString_empty_cwQt0() {
        OptionGroup optionGroup = new OptionGroup();
        String expected = "[]";
        String actual = optionGroup.toString();
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testToString_singleOption_FIGa1() {
        OptionGroup optionGroup = new OptionGroup();
        Option option = new Option("a", "alpha");
        optionGroup.addOption(option);
        String expected = "[a]";
        String actual = optionGroup.toString();
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testToString_multipleOptions_tMlV2() {
        OptionGroup optionGroup = new OptionGroup();
        Option option1 = new Option("a", "alpha");
        Option option2 = new Option("b", "beta");
        optionGroup.addOption(option1);
        optionGroup.addOption(option2);
        String expected = "[-a alpha, -b beta]";
        String actual = optionGroup.toString();
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetNames_nonEmptyMap_CZqB1_ECIS0_1() {
        OptionGroup optionGroup = new OptionGroup();
        optionGroup.addOption(Option.builder("option1").hasArg(true).build());
        optionGroup.addOption(Option.builder("option2").hasArg(true).build());
        Collection<String> names = optionGroup.getNames();
        assertEquals(2, names.size());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetNames_nonEmptyMap_CZqB1_ECIS0_2() {
        OptionGroup optionGroup = new OptionGroup();
        optionGroup.addOption(Option.builder("option1").hasArg(true).build());
        optionGroup.addOption(Option.builder("option2").hasArg(true).build());
        Collection<String> names = optionGroup.getNames();
        assertTrue(names.contains("option1"));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetNames_nonEmptyMap_CZqB1_ECIS0_3() {
        OptionGroup optionGroup = new OptionGroup();
        optionGroup.addOption(Option.builder("option1").hasArg(true).build());
        optionGroup.addOption(Option.builder("option2").hasArg(true).build());
        Collection<String> names = optionGroup.getNames();
        assertTrue(names.contains("option2"));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testToString_optionWithDescription_JPUr3_AqOa0() {
        OptionGroup optionGroup = new OptionGroup();
        Option option = new Option("a", "alpha", true, "This is a description");
        optionGroup.addOption(option);
        String expected = "[-a This is a description]";
        String actual = optionGroup.toString();
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetSelectedNull_TWAk0_Yaza0() {
        OptionGroup optionGroup = new OptionGroup();
        try {
            optionGroup.setSelected(null);
            assertNull(optionGroup.getSelected());
        } catch (AlreadySelectedException e) {
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetSelectedAlreadySelected_Zszx2_TuLI0() {
        OptionGroup optionGroup = new OptionGroup();
        Option option1 = new Option("option1", "description1");
        Option option2 = new Option("option2", "description2");
        try {
            optionGroup.setSelected(option1);
            optionGroup.setSelected(option2);
            fail("Expected AlreadySelectedException");
        } catch (AlreadySelectedException e) {
            assertEquals(option2, e.getOption());
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetSelectedWithMixedOptions6_rqsQ13_OGTq0() {
        OptionGroup optionGroup = new OptionGroup();
        optionGroup.addOption(Option.builder("option1").build());
        optionGroup.addOption(Option.builder("option2").build());
        optionGroup.addOption(Option.builder("option3").build());
        optionGroup.addOption(Option.builder("option4").build());
        String selected = optionGroup.getSelected();
        assertNull(selected);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetOptions_nonEmpty_cKOd1() {
        OptionGroup optionGroup = new OptionGroup();
        Option option1 = new Option("option1", "Option 1");
        Option option2 = new Option("option2", "Option 2");
        optionGroup.addOption(option1);
        optionGroup.addOption(option2);
        Collection<Option> options = optionGroup.getOptions();
        assertEquals(2, options.size());
        assertTrue(options.contains(option1));
        assertTrue(options.contains(option2));
    }
}