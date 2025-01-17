/**
 * Generated by Aster
 */
package org.apache.commons.cli;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

import java.util.Collection;
import java.util.List;
import java.util.concurrent.TimeUnit;


import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

public class Aster_Options_Test_Passing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHelpOptionsReturnsEmptyListWhenNoOptionsAdded_TCbg0() {
        Options options = new Options();
        assertTrue(options.helpOptions().isEmpty());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAddRequiredOption_BDyG0() {
        Options options = new Options();
        options.addRequiredOption("a", "alpha", true, "Alpha option");
        assertTrue(options.hasOption("a"));
        assertTrue(options.getOption("a").isRequired());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAddOptionWithLongOption_nQLI0() {
        Options options = new Options();
        Option opt = new Option("o", "longOption", true, "Option with long option");
        options.addOption(opt);
        assertTrue(options.hasLongOption("longOption"));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAddOptionRequired_fjTM1() {
        Options options = new Options();
        Option opt = new Option("o", "longOption", true, "Required option");
        opt.setRequired(true);
        options.addOption(opt);
        assertTrue(options.getRequiredOptions().contains("o"));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAddOptionWithoutLongOption_bZbT2() {
        Options options = new Options();
        Option opt = new Option("o", false, "Option without long option");
        options.addOption(opt);
        assertFalse(options.hasLongOption("o"));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAddOptionCheckShortOption_xakV3() {
        Options options = new Options();
        Option opt = new Option("o", "Option with short option");
        options.addOption(opt);
        assertTrue(options.hasShortOption("o"));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetOptionGroupsReturnsEmptyCollectionWhenNoOptionGroupsAdded_agVN0() {
        Options options = new Options();
        assertTrue(options.getOptionGroups().isEmpty());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAddOption_MJNY0() {
        Options options = new Options();
        String opt = "o";
        String longOpt = "option";
        boolean hasArg = true;
        String description = "This is a test option";
        options.addOption(opt, longOpt, hasArg, description);
        assertTrue(options.hasOption(opt));
        assertTrue(options.hasLongOption(longOpt));
        assertNotNull(options.getOption(opt));
        assertEquals(description, options.getOption(opt).getDescription());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAddOptionsWithNoDuplicates_mnvl0() {
        Options options1 = new Options();
        options1.addOption("opt1", "longOpt1", true, "description1");
        options1.addOption("opt2", "longOpt2", true, "description2");
        Options options2 = new Options();
        options2.addOption("opt3", "longOpt3", true, "description3");
        options2.addOption("opt4", "longOpt4", true, "description4");
        options1.addOptions(options2);
        assertTrue(options1.hasOption("opt3"));
        assertTrue(options1.hasOption("opt4"));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAddOptionsWithDuplicates_OFKC1() {
        Options options1 = new Options();
        options1.addOption("opt1", "longOpt1", true, "description1");
        Options options2 = new Options();
        options2.addOption("opt1", "longOpt1", true, "description1");
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            options1.addOptions(options2);
        });
        assertEquals("Duplicate key: opt1", exception.getMessage());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAddOptionsWithOptionGroups_yDKJ2() {
        Options options1 = new Options();
        OptionGroup group1 = new OptionGroup();
        group1.addOption(new Option("opt1", "longOpt1", true, "description1"));
        options1.addOptionGroup(group1);
        Options options2 = new Options();
        OptionGroup group2 = new OptionGroup();
        group2.addOption(new Option("opt2", "longOpt2", true, "description2"));
        options2.addOptionGroup(group2);
        options1.addOptions(options2);
        assertTrue(options1.getOptionGroup(new Option("opt2", "longOpt2", true, "description2")) != null);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAddOptionGroup_WithRequiredGroup_wXhT0() {
        Options options = new Options();
        OptionGroup group = new OptionGroup();
        group.setRequired(true);
        Option option = new Option("key", "description");
        group.addOption(option);
        options.addOptionGroup(group);
        assertTrue(options.getRequiredOptions().contains(group));
        assertFalse(option.isRequired());
        assertEquals(group, options.getOptionGroup(option));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAddOptionGroup_WithNonRequiredGroup_BCzx1() {
        Options options = new Options();
        OptionGroup group = new OptionGroup();
        group.setRequired(false);
        Option option = new Option("key", "description");
        group.addOption(option);
        options.addOptionGroup(group);
        assertFalse(options.getRequiredOptions().contains(group));
        assertFalse(option.isRequired());
        assertEquals(group, options.getOptionGroup(option));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAddOptionGroup_WithMultipleOptions_GmYT2() {
        Options options = new Options();
        OptionGroup group = new OptionGroup();
        group.setRequired(true);
        Option option1 = new Option("key1", "description1");
        Option option2 = new Option("key2", "description2");
        group.addOption(option1).addOption(option2);
        options.addOptionGroup(group);
        assertTrue(options.getRequiredOptions().contains(group));
        assertFalse(option1.isRequired());
        assertFalse(option2.isRequired());
        assertEquals(group, options.getOptionGroup(option1));
        assertEquals(group, options.getOptionGroup(option2));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAddOption_DPXa0() {
        Options options = new Options();
        String opt = "verbose";
        boolean hasArg = false;
        String description = "Enables verbose mode";
        Options result = options.addOption(opt, hasArg, description);
        Option addedOption = result.getOption(opt);
        assertNotNull(addedOption);
        assertEquals(opt, addedOption.getOpt());
        assertEquals(description, addedOption.getDescription());
        assertEquals(hasArg, addedOption.hasArg());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHasOptionWithNonExistingOption_vvgP2() {
        Options options = new Options();
        assertFalse(options.hasOption("--nonexistent"));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAddOption_TZVQ0() {
        Options options = new Options();
        String opt = "verbose";
        String description = "Enables verbose mode";
        options.addOption(opt, description);
        assertTrue(options.hasOption(opt));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAddRequiredOption_BDyG0_1() {
        Options options = new Options();
        options.addRequiredOption("a", "alpha", true, "Alpha option");
        assertTrue(options.hasOption("a"));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAddRequiredOption_BDyG0_2() {
        Options options = new Options();
        options.addRequiredOption("a", "alpha", true, "Alpha option");
        assertTrue(options.getOption("a").isRequired());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAddOption_MJNY0_1() {
        Options options = new Options();
        String opt = "o";
        String longOpt = "option";
        boolean hasArg = true;
        String description = "This is a test option";
        options.addOption(opt, longOpt, hasArg, description);
        assertTrue(options.hasOption(opt));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAddOption_MJNY0_2() {
        Options options = new Options();
        String opt = "o";
        String longOpt = "option";
        boolean hasArg = true;
        String description = "This is a test option";
        options.addOption(opt, longOpt, hasArg, description);
        assertTrue(options.hasLongOption(longOpt));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAddOption_MJNY0_3() {
        Options options = new Options();
        String opt = "o";
        String longOpt = "option";
        boolean hasArg = true;
        String description = "This is a test option";
        options.addOption(opt, longOpt, hasArg, description);
        assertNotNull(options.getOption(opt));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAddOption_MJNY0_4() {
        Options options = new Options();
        String opt = "o";
        String longOpt = "option";
        boolean hasArg = true;
        String description = "This is a test option";
        options.addOption(opt, longOpt, hasArg, description);
        assertEquals(description, options.getOption(opt).getDescription());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAddOptionsWithNoDuplicates_mnvl0_1() {
        Options options1 = new Options();
        options1.addOption("opt1", "longOpt1", true, "description1");
        options1.addOption("opt2", "longOpt2", true, "description2");
        Options options2 = new Options();
        options2.addOption("opt3", "longOpt3", true, "description3");
        options2.addOption("opt4", "longOpt4", true, "description4");
        options1.addOptions(options2);
        assertTrue(options1.hasOption("opt3"));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAddOptionsWithNoDuplicates_mnvl0_2() {
        Options options1 = new Options();
        options1.addOption("opt1", "longOpt1", true, "description1");
        options1.addOption("opt2", "longOpt2", true, "description2");
        Options options2 = new Options();
        options2.addOption("opt3", "longOpt3", true, "description3");
        options2.addOption("opt4", "longOpt4", true, "description4");
        options1.addOptions(options2);
        assertTrue(options1.hasOption("opt4"));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAddOptionsWithDuplicates_OFKC1_1() {
        Options options1 = new Options();
        options1.addOption("opt1", "longOpt1", true, "description1");
        Options options2 = new Options();
        options2.addOption("opt1", "longOpt1", true, "description1");
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            options1.addOptions(options2);
        });
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAddOptionGroup_WithRequiredGroup_wXhT0_1() {
        Options options = new Options();
        OptionGroup group = new OptionGroup();
        group.setRequired(true);
        Option option = new Option("key", "description");
        group.addOption(option);
        options.addOptionGroup(group);
        assertTrue(options.getRequiredOptions().contains(group));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAddOptionGroup_WithRequiredGroup_wXhT0_2() {
        Options options = new Options();
        OptionGroup group = new OptionGroup();
        group.setRequired(true);
        Option option = new Option("key", "description");
        group.addOption(option);
        options.addOptionGroup(group);
        assertFalse(option.isRequired());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAddOptionGroup_WithRequiredGroup_wXhT0_3() {
        Options options = new Options();
        OptionGroup group = new OptionGroup();
        group.setRequired(true);
        Option option = new Option("key", "description");
        group.addOption(option);
        options.addOptionGroup(group);
        assertEquals(group, options.getOptionGroup(option));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAddOptionGroup_WithNonRequiredGroup_BCzx1_1() {
        Options options = new Options();
        OptionGroup group = new OptionGroup();
        group.setRequired(false);
        Option option = new Option("key", "description");
        group.addOption(option);
        options.addOptionGroup(group);
        assertFalse(options.getRequiredOptions().contains(group));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAddOptionGroup_WithNonRequiredGroup_BCzx1_2() {
        Options options = new Options();
        OptionGroup group = new OptionGroup();
        group.setRequired(false);
        Option option = new Option("key", "description");
        group.addOption(option);
        options.addOptionGroup(group);
        assertFalse(option.isRequired());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAddOptionGroup_WithNonRequiredGroup_BCzx1_3() {
        Options options = new Options();
        OptionGroup group = new OptionGroup();
        group.setRequired(false);
        Option option = new Option("key", "description");
        group.addOption(option);
        options.addOptionGroup(group);
        assertEquals(group, options.getOptionGroup(option));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAddOptionGroup_WithMultipleOptions_GmYT2_1() {
        Options options = new Options();
        OptionGroup group = new OptionGroup();
        group.setRequired(true);
        Option option1 = new Option("key1", "description1");
        Option option2 = new Option("key2", "description2");
        group.addOption(option1).addOption(option2);
        options.addOptionGroup(group);
        assertTrue(options.getRequiredOptions().contains(group));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAddOptionGroup_WithMultipleOptions_GmYT2_2() {
        Options options = new Options();
        OptionGroup group = new OptionGroup();
        group.setRequired(true);
        Option option1 = new Option("key1", "description1");
        Option option2 = new Option("key2", "description2");
        group.addOption(option1).addOption(option2);
        options.addOptionGroup(group);
        assertFalse(option1.isRequired());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAddOptionGroup_WithMultipleOptions_GmYT2_3() {
        Options options = new Options();
        OptionGroup group = new OptionGroup();
        group.setRequired(true);
        Option option1 = new Option("key1", "description1");
        Option option2 = new Option("key2", "description2");
        group.addOption(option1).addOption(option2);
        options.addOptionGroup(group);
        assertFalse(option2.isRequired());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAddOptionGroup_WithMultipleOptions_GmYT2_4() {
        Options options = new Options();
        OptionGroup group = new OptionGroup();
        group.setRequired(true);
        Option option1 = new Option("key1", "description1");
        Option option2 = new Option("key2", "description2");
        group.addOption(option1).addOption(option2);
        options.addOptionGroup(group);
        assertEquals(group, options.getOptionGroup(option1));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAddOptionGroup_WithMultipleOptions_GmYT2_5() {
        Options options = new Options();
        OptionGroup group = new OptionGroup();
        group.setRequired(true);
        Option option1 = new Option("key1", "description1");
        Option option2 = new Option("key2", "description2");
        group.addOption(option1).addOption(option2);
        options.addOptionGroup(group);
        assertEquals(group, options.getOptionGroup(option2));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAddOption_DPXa0_1() {
        Options options = new Options();
        String opt = "verbose";
        boolean hasArg = false;
        String description = "Enables verbose mode";
        Options result = options.addOption(opt, hasArg, description);
        Option addedOption = result.getOption(opt);
        assertNotNull(addedOption);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAddOption_DPXa0_2() {
        Options options = new Options();
        String opt = "verbose";
        boolean hasArg = false;
        String description = "Enables verbose mode";
        Options result = options.addOption(opt, hasArg, description);
        Option addedOption = result.getOption(opt);
        assertEquals(opt, addedOption.getOpt());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAddOption_DPXa0_3() {
        Options options = new Options();
        String opt = "verbose";
        boolean hasArg = false;
        String description = "Enables verbose mode";
        Options result = options.addOption(opt, hasArg, description);
        Option addedOption = result.getOption(opt);
        assertEquals(description, addedOption.getDescription());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAddOption_DPXa0_4() {
        Options options = new Options();
        String opt = "verbose";
        boolean hasArg = false;
        String description = "Enables verbose mode";
        Options result = options.addOption(opt, hasArg, description);
        Option addedOption = result.getOption(opt);
        assertEquals(hasArg, addedOption.hasArg());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetMatchingOptions_NoMatch_ayxs2_LWgR0() {
        Options options = new Options();
        options.addOption("optionOne", "Description for optionOne");
        options.addOption("optionTwo", "Description for optionTwo");
        List<String> result = options.getMatchingOptions("nonexistent");
        assertTrue(result.isEmpty());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetMatchingOptions_EmptyInput_jbmN3_nted0() {
        Options options = new Options();
        options.addOption("option", "description");
        List<String> result = options.getMatchingOptions("");
        assertTrue(result.isEmpty());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetOptionWithShortOption_CCyz0_RXVM0() {
        Options options = new Options();
        Option expectedOption = new Option("a", null, false, "some description"); // Assuming Option constructor requires these parameters
        options.addOption("a", "some description");
        Option result = options.getOption("a");
        assertEquals(expectedOption, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetOptionWithLongOption_nVrQ1_DGmr0() {
        Options options = new Options();
        Option expectedOption = new Option("option", null, false, "Some description"); // Assuming Option constructor with parameters exists
        options.addOption("option", "Some description"); // Assuming addOption method exists and works as expected
        Option result = options.getOption("option");
        assertEquals(expectedOption, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetOptionsReturnsUnmodifiableCollection_ucgW0_FjkV0() {
        Options options = new Options();
        Collection<Option> result = options.getOptions();
        assertThrows(UnsupportedOperationException.class, () -> result.add(new Option("dummy", "Dummy option")));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testToString_wTMK0_FTlo0() {
        Options options = new Options();
        String expected = options.toString();
        assertEquals(expected, options.toString());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetOptionGroupWithExistingKey_kQzx0_rFjr0() {
        Options options = new Options();
        Option option = new Option("opt", "This is a test option");
        OptionGroup expectedGroup = new OptionGroup();
        expectedGroup.addOption(option);
        options.addOptionGroup(expectedGroup);
        OptionGroup actualGroup = options.getOptionGroup(option);
        assertEquals(expectedGroup, actualGroup);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHasShortOptionWithExistingOption_XaRi0_KOgO0() {
        Options options = new Options();
        options.addOption("a", "test description"); // Correct way to add an option
        boolean result = options.hasShortOption("a");
        assertTrue(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetRequiredOptionsReturnsUnmodifiableList_ouyd0_PvMB0() {
        Options options = new Options();
        List<?> result = options.getRequiredOptions();
        assertThrows(UnsupportedOperationException.class, () -> result.add(null));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHasOptionWithExistingShortOption_RFHH0_cGjp0() {
        Options options = new Options();
        options.addOption("a", "test option");
        assertTrue(options.hasOption("a"));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHasOptionWithExistingLongOption_CYpz1_rYrI0() {
        Options options = new Options();
        options.addOption("option", "Test option");
        assertTrue(options.hasOption("option"));
    }
}