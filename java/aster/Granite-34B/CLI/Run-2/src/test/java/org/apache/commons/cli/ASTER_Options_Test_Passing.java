/**
 * Generated by Aster
 */
package org.apache.commons.cli;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

import java.util.Collection;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

public class Aster_Options_Test_Passing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void test4_ezsV3() {
        Options options = new Options();
        String opt = "opt";
        List<String> result = options.getMatchingOptions(opt);
        Assertions.assertNotNull(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testgetOptionsWithNoOptions_xCuq1() {
        Options options = new Options();
        Collection<Option> optionsList = options.getOptions();
        assertNotNull(optionsList);
        assertEquals(0, optionsList.size());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAddOption_iApN0() {
        Options options = new Options();
        Option option = new Option("a", "alpha", false, "This is a test option");
        options.addOption(option);
        assertNotNull(options.getOption("a"));
        assertEquals(options.getOption("a").getDescription(), "This is a test option");
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAddOptionWithLongOpt_KMwO1() {
        Options options = new Options();
        Option option = new Option("b", "beta", false, "This is another test option");
        options.addOption(option);
        assertNotNull(options.getOption("b"));
        assertEquals(options.getOption("b").getDescription(), "This is another test option");
        assertNotNull(options.getOption("beta"));
        assertEquals(options.getOption("beta").getDescription(), "This is another test option");
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAddRequiredOption_llMD2() {
        Options options = new Options();
        Option option = new Option("c", "charlie", false, "This is a required test option");
        option.setRequired(true);
        options.addOption(option);
        assertNotNull(options.getOption("c"));
        assertEquals(options.getOption("c").getDescription(), "This is a required test option");
        assertNotNull(options.getRequiredOptions());
        assertEquals(options.getRequiredOptions().size(), 1);
        assertEquals(options.getRequiredOptions().get(0), "c");
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAddOptionWithArgs_LbDD3() {
        Options options = new Options();
        Option option = new Option("d", "delta", true, "This is a test option with arguments");
        options.addOption(option);
        assertNotNull(options.getOption("d"));
        assertEquals(options.getOption("d").getDescription(), "This is a test option with arguments");
        assertEquals(options.getOption("d").getArgs(), 1);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetOptionGroup_bnPp0() {
        Options options = new Options();
        Option option = new Option("option", "longOption", true, "description");
        options.addOptionGroup(new OptionGroup().addOption(option));
        OptionGroup optionGroup = options.getOptionGroup(option);
        assertNotNull(optionGroup);
        assertEquals(option, optionGroup.getOptions().iterator().next());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetOptionGroups_Mrkm0() {
        Options options = new Options();
        Collection<OptionGroup> optionGroups = options.getOptionGroups();
        assertNotNull(optionGroups);
        assertTrue(optionGroups.isEmpty());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAddOption_DATe0() {
        Options options = new Options();
        options.addOption("opt", "longOpt", true, "description");
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAddOption_vAHH1() {
        Options options = new Options();
        options.addOption("opt", "longOpt", true, "description");
        assertEquals(true, options.hasLongOption("longOpt"));
        assertEquals(true, options.hasShortOption("opt"));
        assertEquals(true, options.hasOption("opt"));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAddOption_KTuS3() {
        Options options = new Options();
        options.addOption("opt", "longOpt", true, "description");
        Option option = options.getOption("opt");
        assertEquals("opt", option.getOpt());
        assertEquals("longOpt", option.getLongOpt());
        assertEquals(true, option.hasArg());
        assertEquals("description", option.getDescription());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAddOption_cQDK5() {
        Options options = new Options();
        options.addOption("opt", "longOpt", true, "description");
        assertEquals(false, options.hasLongOption("invalidLongOpt"));
        assertEquals(false, options.hasShortOption("invalidOpt"));
        assertEquals(false, options.hasOption("invalidOpt"));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAddOption_FZsW7() {
        Options options = new Options();
        options.addOption("opt", "longOpt", true, "description");
        Option option = options.getOption("invalidOpt");
        assertEquals(null, option);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAddOptions_ifYR0() {
        Options options1 = new Options();
        Options options2 = new Options();
        options2.addOption("opt", "longOpt", true, "description");
        options1.addOptions(options2);
        assertEquals(1, options1.getOptions().size());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAddOptionsWithDuplicateKey_RHDO1() {
        Options options1 = new Options();
        Options options2 = new Options();
        options2.addOption("opt", "longOpt", true, "description");
        options1.addOption("opt", "longOpt", true, "description");
        Exception exception = assertThrows(IllegalArgumentException.class, () -> options1.addOptions(options2));
        assertEquals("Duplicate key: opt", exception.getMessage());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAddOptionGroupWithRequired_dfxS1() {
        Options options = new Options();
        OptionGroup group = new OptionGroup();
        group.setRequired(true);
        options.addOptionGroup(group);
        assertEquals(1, options.getRequiredOptions().size());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAddOptionGroupWithOptions_BpOu2() {
        Options options = new Options();
        OptionGroup group = new OptionGroup();
        Option option = new Option("opt", "description");
        group.addOption(option);
        options.addOptionGroup(group);
        assertEquals(1, options.getOptions().size());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHasShortOptionWithEmptyOpt_NCIy2() {
        Options options = new Options();
        assertFalse(options.hasShortOption(""));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHasShortOptionWithInvalidOpt_xwAL4() {
        Options options = new Options();
        assertFalse(options.hasShortOption("invalid"));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAddOption_EcQA0() {
        Options options = new Options();
        options.addOption("opt", true, "description");
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAddOption_Chsz1() {
        Options options = new Options();
        options.addOption(null, true, "description");
        options.addOption("opt", false, "description");
        options.addOption("opt", true, null);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAddOption_vIbC2() {
        Options options = new Options();
        options.addOption("opt", true, "description");
        options.addOption("opt", false, "description");
        options.addOption("opt", true, null);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void test_getRequiredOptions_PtuY0() {
        Options options = new Options();
        List<?> requiredOptions = options.getRequiredOptions();
        assertTrue(requiredOptions.isEmpty());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void hasOptionTest2_uNTi1() {
        Options options = new Options();
        String opt = "opt";
        boolean result = options.hasOption(opt);
        Assertions.assertFalse(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAddOption_GYqh0() {
        Options options = new Options();
        options.addOption("opt", "description");
        assertEquals(1, options.getOptions().size());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAddOptionWithLongOpt_dnrL1() {
        Options options = new Options();
        options.addOption("opt", "longOpt", false, "description");
        assertEquals(1, options.getOptions().size());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAddOptionWithType_kEtM4() {
        Options options = new Options();
        options.addOption("opt", "longOpt", false, "description");
        assertEquals(String.class, options.getOption("opt").getType());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAddOptionWithHelp_GKKP6() {
        Options options = new Options();
        options.addOption("opt", "longOpt", false, "description");
        assertEquals("description", options.getOption("opt").getDescription());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHasLongOption_hQmi0_2() {
        Options options = new Options();
        assertFalse(options.hasLongOption("invalid"));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHasLongOption_hQmi0_3() {
        Options options = new Options();
        assertFalse(options.hasLongOption(null));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testgetOptions_Ungr0_1() {
        Options options = new Options();
        Collection<Option> optionsList = options.getOptions();
        assertNotNull(optionsList);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testgetOptionsWithNoOptions_xCuq1_2() {
        Options options = new Options();
        Collection<Option> optionsList = options.getOptions();
        assertEquals(0, optionsList.size());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAddRequiredOption_iaQH0_1() {
        Options options = new Options();
        options.addRequiredOption("opt", "longOpt", true, "description");
        assertEquals(true, options.hasLongOption("longOpt"));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAddRequiredOption_iaQH0_2() {
        Options options = new Options();
        options.addRequiredOption("opt", "longOpt", true, "description");
        assertEquals(true, options.hasShortOption("opt"));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAddRequiredOption_iaQH0_3() {
        Options options = new Options();
        options.addRequiredOption("opt", "longOpt", true, "description");
        assertEquals(true, options.hasOption("opt"));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAddRequiredOption_iaQH0_4() {
        Options options = new Options();
        options.addRequiredOption("opt", "longOpt", true, "description");
        assertEquals(true, options.hasOption("longOpt"));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAddRequiredOption_iaQH0_5() {
        Options options = new Options();
        options.addRequiredOption("opt", "longOpt", true, "description");
        assertEquals(true, options.getOption("opt").isRequired());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAddRequiredOption_iaQH0_6() {
        Options options = new Options();
        options.addRequiredOption("opt", "longOpt", true, "description");
        assertEquals(true, options.getOption("longOpt").isRequired());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAddRequiredOption_iaQH0_7() {
        Options options = new Options();
        options.addRequiredOption("opt", "longOpt", true, "description");
        assertEquals(true, options.getRequiredOptions().contains("opt"));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAddOption_iApN0_1() {
        Options options = new Options();
        Option option = new Option("a", "alpha", false, "This is a test option");
        options.addOption(option);
        assertNotNull(options.getOption("a"));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAddOption_iApN0_2() {
        Options options = new Options();
        Option option = new Option("a", "alpha", false, "This is a test option");
        options.addOption(option);
        assertEquals(options.getOption("a").getDescription(), "This is a test option");
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAddOptionWithLongOpt_KMwO1_1() {
        Options options = new Options();
        Option option = new Option("b", "beta", false, "This is another test option");
        options.addOption(option);
        assertNotNull(options.getOption("b"));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAddOptionWithLongOpt_KMwO1_2() {
        Options options = new Options();
        Option option = new Option("b", "beta", false, "This is another test option");
        options.addOption(option);
        assertEquals(options.getOption("b").getDescription(), "This is another test option");
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAddOptionWithLongOpt_KMwO1_3() {
        Options options = new Options();
        Option option = new Option("b", "beta", false, "This is another test option");
        options.addOption(option);
        assertNotNull(options.getOption("beta"));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAddOptionWithLongOpt_KMwO1_4() {
        Options options = new Options();
        Option option = new Option("b", "beta", false, "This is another test option");
        options.addOption(option);
        assertEquals(options.getOption("beta").getDescription(), "This is another test option");
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAddRequiredOption_llMD2_1() {
        Options options = new Options();
        Option option = new Option("c", "charlie", false, "This is a required test option");
        option.setRequired(true);
        options.addOption(option);
        assertNotNull(options.getOption("c"));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAddRequiredOption_llMD2_2() {
        Options options = new Options();
        Option option = new Option("c", "charlie", false, "This is a required test option");
        option.setRequired(true);
        options.addOption(option);
        assertEquals(options.getOption("c").getDescription(), "This is a required test option");
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAddRequiredOption_llMD2_3() {
        Options options = new Options();
        Option option = new Option("c", "charlie", false, "This is a required test option");
        option.setRequired(true);
        options.addOption(option);
        assertNotNull(options.getRequiredOptions());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAddRequiredOption_llMD2_4() {
        Options options = new Options();
        Option option = new Option("c", "charlie", false, "This is a required test option");
        option.setRequired(true);
        options.addOption(option);
        assertEquals(options.getRequiredOptions().size(), 1);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAddRequiredOption_llMD2_5() {
        Options options = new Options();
        Option option = new Option("c", "charlie", false, "This is a required test option");
        option.setRequired(true);
        options.addOption(option);
        assertEquals(options.getRequiredOptions().get(0), "c");
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAddOptionWithArgs_LbDD3_1() {
        Options options = new Options();
        Option option = new Option("d", "delta", true, "This is a test option with arguments");
        options.addOption(option);
        assertNotNull(options.getOption("d"));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAddOptionWithArgs_LbDD3_2() {
        Options options = new Options();
        Option option = new Option("d", "delta", true, "This is a test option with arguments");
        options.addOption(option);
        assertEquals(options.getOption("d").getDescription(), "This is a test option with arguments");
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAddOptionWithArgs_LbDD3_3() {
        Options options = new Options();
        Option option = new Option("d", "delta", true, "This is a test option with arguments");
        options.addOption(option);
        assertEquals(options.getOption("d").getArgs(), 1);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetOptionGroup_bnPp0_1() {
        Options options = new Options();
        Option option = new Option("option", "longOption", true, "description");
        options.addOptionGroup(new OptionGroup().addOption(option));
        OptionGroup optionGroup = options.getOptionGroup(option);
        assertNotNull(optionGroup);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetOptionGroup_bnPp0_2() {
        Options options = new Options();
        Option option = new Option("option", "longOption", true, "description");
        options.addOptionGroup(new OptionGroup().addOption(option));
        OptionGroup optionGroup = options.getOptionGroup(option);
        assertEquals(option, optionGroup.getOptions().iterator().next());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetOptionGroups_Mrkm0_1() {
        Options options = new Options();
        Collection<OptionGroup> optionGroups = options.getOptionGroups();
        assertNotNull(optionGroups);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetOptionGroups_Mrkm0_2() {
        Options options = new Options();
        Collection<OptionGroup> optionGroups = options.getOptionGroups();
        assertTrue(optionGroups.isEmpty());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetOptionGroupsWithOptionGroups_mTGi1_1() {
        Options options = new Options();
        OptionGroup optionGroup1 = new OptionGroup();
        OptionGroup optionGroup2 = new OptionGroup();
        options.addOptionGroup(optionGroup1);
        options.addOptionGroup(optionGroup2);
        Collection<OptionGroup> returnedOptionGroups = options.getOptionGroups();
        assertNotNull(returnedOptionGroups);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAddOption_vAHH1_1() {
        Options options = new Options();
        options.addOption("opt", "longOpt", true, "description");
        assertEquals(true, options.hasLongOption("longOpt"));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAddOption_vAHH1_2() {
        Options options = new Options();
        options.addOption("opt", "longOpt", true, "description");
        assertEquals(true, options.hasShortOption("opt"));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAddOption_vAHH1_3() {
        Options options = new Options();
        options.addOption("opt", "longOpt", true, "description");
        assertEquals(true, options.hasOption("opt"));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAddOption_RLDJ2_1() {
        Options options = new Options();
        options.addOption("opt", "longOpt", true, "description");
        assertEquals(1, options.getOptions().size());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAddOption_KTuS3_1() {
        Options options = new Options();
        options.addOption("opt", "longOpt", true, "description");
        Option option = options.getOption("opt");
        assertEquals("opt", option.getOpt());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAddOption_KTuS3_2() {
        Options options = new Options();
        options.addOption("opt", "longOpt", true, "description");
        Option option = options.getOption("opt");
        assertEquals("longOpt", option.getLongOpt());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAddOption_KTuS3_3() {
        Options options = new Options();
        options.addOption("opt", "longOpt", true, "description");
        Option option = options.getOption("opt");
        assertEquals(true, option.hasArg());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAddOption_KTuS3_4() {
        Options options = new Options();
        options.addOption("opt", "longOpt", true, "description");
        Option option = options.getOption("opt");
        assertEquals("description", option.getDescription());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAddOption_cQDK5_1() {
        Options options = new Options();
        options.addOption("opt", "longOpt", true, "description");
        assertEquals(false, options.hasLongOption("invalidLongOpt"));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAddOption_cQDK5_2() {
        Options options = new Options();
        options.addOption("opt", "longOpt", true, "description");
        assertEquals(false, options.hasShortOption("invalidOpt"));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAddOption_cQDK5_3() {
        Options options = new Options();
        options.addOption("opt", "longOpt", true, "description");
        assertEquals(false, options.hasOption("invalidOpt"));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAddOption_XwVp6_2() {
        Options options = new Options();
        options.addOption("opt", "longOpt", true, "description");
        assertEquals(0, options.getRequiredOptions().size());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAddOption_XwVp6_3() {
        Options options = new Options();
        options.addOption("opt", "longOpt", true, "description");
        assertEquals(0, options.getMatchingOptions("invalidOpt").size());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAddOptionsWithDuplicateKey_RHDO1_1() {
        Options options1 = new Options();
        Options options2 = new Options();
        options2.addOption("opt", "longOpt", true, "description");
        options1.addOption("opt", "longOpt", true, "description");
        Exception exception = assertThrows(IllegalArgumentException.class, () -> options1.addOptions(options2));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHasLongOption_hQmi0_1_fid2() {
        Options options = new Options();
        assertFalse(options.hasLongOption("test"));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testgetOptions_Ungr0_2_fid2() {
        Options options = new Options();
        Collection<Option> optionsList = options.getOptions();
        assertFalse(optionsList.size() > 0);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testgetOptionsWithMultipleOptions_eGgs2_2_fid2() {
        Options options = new Options();
        Collection<Option> optionsList = options.getOptions();
        assertFalse(optionsList.size() > 1);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testgetOptionsWithAllOptions_ImlY5_2_fid2() {
        Options options = new Options();
        Collection<Option> optionsList = options.getOptions();
        assertFalse(optionsList.size() == 3);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testgetOptionsWithHalfOptions_PvaW6_2_fid2() {
        Options options = new Options();
        Collection<Option> optionsList = options.getOptions();
        assertFalse(optionsList.size() == 1);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testToString_SYEJ0_fid2() {
        Options options = new Options();
        assertEquals("[ Options: [ short {} ] [ long {} ]", options.toString());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetOptionGroupsWithOptionGroups_mTGi1_0() {
        Options options = new Options();
        OptionGroup optionGroup1 = new OptionGroup();
        OptionGroup optionGroup0 = new OptionGroup();
        options.addOptionGroup(optionGroup1);
        options.addOptionGroup(optionGroup0);
        Collection<OptionGroup> returnedOptionGroups = options.getOptionGroups();
        assertEquals(0, returnedOptionGroups.size());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetOptionGroupsWithOptionGroups_mTGi1_3_fid2() {
        Options options = new Options();
        OptionGroup optionGroup1 = new OptionGroup();
        OptionGroup optionGroup2 = new OptionGroup();
        options.addOptionGroup(optionGroup1);
        options.addOptionGroup(optionGroup2);
        Collection<OptionGroup> returnedOptionGroups = options.getOptionGroups();
        assertFalse(returnedOptionGroups.contains(optionGroup1));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetOptionGroupsWithOptionGroups_mTGi1_4_fid2() {
        Options options = new Options();
        OptionGroup optionGroup1 = new OptionGroup();
        OptionGroup optionGroup2 = new OptionGroup();
        options.addOptionGroup(optionGroup1);
        options.addOptionGroup(optionGroup2);
        Collection<OptionGroup> returnedOptionGroups = options.getOptionGroups();
        assertFalse(returnedOptionGroups.contains(optionGroup2));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void test_getRequiredOptions_withRequiredOpts_eyvW1_uHnf0_2_fid2() {
        Options options = new Options();
        options.addOption("requiredOption1", "description");
        options.addOption("requiredOption2", "description");
        List<?> requiredOptions = options.getRequiredOptions();
        assertFalse(requiredOptions.contains("requiredOption1"));
    }
}