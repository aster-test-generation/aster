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
    public void testHelpOptionsWithEmptyShortOpts_lFVp1() {
        Options options = new Options();
        List<Option> helpOptions = options.helpOptions();
        assertEquals(0, helpOptions.size());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetMatchingOptions_EmptyString_ZvCJ0() {
        Options options = new Options();
        List<String> matchingOpts = options.getMatchingOptions("");
        assertEquals(0, matchingOpts.size());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetMatchingOptions_NoMatch_nSKN3() {
        Options options = new Options();
        List<String> matchingOpts = options.getMatchingOptions("--not-a-valid-option");
        assertEquals(0, matchingOpts.size());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetOptions_empty_GWct0() {
        Options options = new Options();
        Collection<Option> actual = options.getOptions();
        assertTrue(actual.isEmpty());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAddRequiredOptionWithShortAndLongOption_iVgb0() {
        Options options = new Options();
        options.addRequiredOption("a", "long-option", true, "description");
        assertTrue(options.hasOption("a"));
        assertTrue(options.hasOption("long-option"));
        assertTrue(options.getOption("a").isRequired());
        assertTrue(options.getOption("long-option").isRequired());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAddRequiredOptionWithShortOptionOnly_rwTe1() {
        Options options = new Options();
        options.addRequiredOption("a", null, true, "description");
        assertTrue(options.hasOption("a"));
        assertFalse(options.hasOption("long-option"));
        assertTrue(options.getOption("a").isRequired());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAddRequiredOptionWithLongOptionOnly_sTrB2() {
        Options options = new Options();
        options.addRequiredOption(null, "long-option", true, "description");
        assertFalse(options.hasOption("a"));
        assertTrue(options.hasOption("long-option"));
        assertTrue(options.getOption("long-option").isRequired());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAddOptionWithLongOpt_Xxfl0() {
        Options options = new Options();
        Option option = new Option("a", "long-opt", false, "description");
        options.addOption(option);
        assertEquals(option, options.getOption("a"));
        assertEquals(option, options.getOption("long-opt"));
        assertTrue(options.hasLongOption("long-opt"));
        assertTrue(options.hasOption("a"));
        assertTrue(options.hasOption("long-opt"));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAddOptionWithShortOpt_JcEO1() {
        Options options = new Options();
        Option option = new Option("a", false, "description");
        options.addOption(option);
        assertEquals(option, options.getOption("a"));
        assertTrue(options.hasShortOption("a"));
        assertTrue(options.hasOption("a"));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetOptionGroupNull_xhnK1() {
        Option option = new Option("test", "Test option");
        Options options = new Options();
        assertNull(options.getOptionGroup(option));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetOptionGroupShortNameNull_Ljgg5() {
        Option option = new Option("t", "Test option");
        Options options = new Options();
        assertNull(options.getOptionGroup(option));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetOptionGroups_empty_ZkOq0() {
        Options options = new Options();
        Collection<OptionGroup> optionGroups = options.getOptionGroups();
        assertTrue(optionGroups.isEmpty());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAddOption_ugZq0() {
        Options options = new Options();
        options.addOption("a", "long-option", true, "description");
        Option option = options.getOption("a");
        assertEquals("a", option.getOpt());
        assertEquals("long-option", option.getLongOpt());
        assertTrue(option.hasArg());
        assertEquals("description", option.getDescription());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAddOptionNoLongOption_nBuO1() {
        Options options = new Options();
        options.addOption("a", null, true, "description");
        Option option = options.getOption("a");
        assertEquals("a", option.getOpt());
        assertNull(option.getLongOpt());
        assertTrue(option.hasArg());
        assertEquals("description", option.getDescription());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAddOptionNoShortOption_dtIi2() {
        Options options = new Options();
        options.addOption(null, "long-option", true, "description");
        Option option = options.getOption("long-option");
        assertNull(option.getOpt());
        assertEquals("long-option", option.getLongOpt());
        assertTrue(option.hasArg());
        assertEquals("description", option.getDescription());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAddOptionNoShortOrLongOption_MCJj3() {
        Options options = new Options();
        options.addOption(null, null, true, "description");
        Option option = options.getOption(null);
        assertNull(option.getOpt());
        assertNull(option.getLongOpt());
        assertTrue(option.hasArg());
        assertEquals("description", option.getDescription());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAddOptionRequiredArg_QMkH4() {
        Options options = new Options();
        options.addOption("a", "long-option", true, "description");
        Option option = options.getOption("a");
        assertTrue(option.hasArg());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAddOptionNoRequiredArg_FpRm5() {
        Options options = new Options();
        options.addOption("a", "long-option", false, "description");
        Option option = options.getOption("a");
        assertFalse(option.hasArg());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAddOptionDescription_mBIV6() {
        Options options = new Options();
        options.addOption("a", "long-option", true, "description");
        Option option = options.getOption("a");
        assertEquals("description", option.getDescription());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAddOptionNoDescription_Xyuk7() {
        Options options = new Options();
        options.addOption("a", "long-option", true, null);
        Option option = options.getOption("a");
        assertNull(option.getDescription());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAddOptions_emptyOptions_WTAN0() {
        Options options = new Options();
        Options newOptions = new Options();
        newOptions.addOptions(options);
        assertEquals(0, newOptions.getOptions().size());
        assertEquals(0, newOptions.getOptionGroups().size());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHasShortOption_InvalidShortOption_AUWR1() {
        Options options = new Options();
        String opt = "a";
        boolean result = options.hasShortOption(opt);
        assertFalse(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHasShortOption_NullShortOption_zfzL2() {
        Options options = new Options();
        String opt = null;
        boolean result = options.hasShortOption(opt);
        assertFalse(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHasShortOption_EmptyShortOption_NBVD3() {
        Options options = new Options();
        String opt = "";
        boolean result = options.hasShortOption(opt);
        assertFalse(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetRequiredOptions_empty_eOQm0() {
        Options options = new Options();
        List<?> requiredOptions = options.getRequiredOptions();
        assertTrue(requiredOptions.isEmpty());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHasOptionWithEmptyOption_Qurh3() {
        Options options = new Options();
        String emptyOption = "";
        assertFalse(options.hasOption(emptyOption));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHasOptionWithNullOption_noTZ4() {
        Options options = new Options();
        String nullOption = null;
        assertFalse(options.hasOption(nullOption));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAddRequiredOptionWithShortAndLongOption_iVgb0_1() {
        Options options = new Options();
        options.addRequiredOption("a", "long-option", true, "description");
        assertTrue(options.hasOption("a"));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAddRequiredOptionWithShortAndLongOption_iVgb0_2() {
        Options options = new Options();
        options.addRequiredOption("a", "long-option", true, "description");
        assertTrue(options.hasOption("long-option"));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAddRequiredOptionWithShortAndLongOption_iVgb0_3() {
        Options options = new Options();
        options.addRequiredOption("a", "long-option", true, "description");
        assertTrue(options.getOption("a").isRequired());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAddRequiredOptionWithShortAndLongOption_iVgb0_4() {
        Options options = new Options();
        options.addRequiredOption("a", "long-option", true, "description");
        assertTrue(options.getOption("long-option").isRequired());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAddRequiredOptionWithShortOptionOnly_rwTe1_1() {
        Options options = new Options();
        options.addRequiredOption("a", null, true, "description");
        assertTrue(options.hasOption("a"));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAddRequiredOptionWithShortOptionOnly_rwTe1_2() {
        Options options = new Options();
        options.addRequiredOption("a", null, true, "description");
        assertFalse(options.hasOption("long-option"));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAddRequiredOptionWithShortOptionOnly_rwTe1_3() {
        Options options = new Options();
        options.addRequiredOption("a", null, true, "description");
        assertTrue(options.getOption("a").isRequired());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAddRequiredOptionWithLongOptionOnly_sTrB2_1() {
        Options options = new Options();
        options.addRequiredOption(null, "long-option", true, "description");
        assertFalse(options.hasOption("a"));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAddRequiredOptionWithLongOptionOnly_sTrB2_2() {
        Options options = new Options();
        options.addRequiredOption(null, "long-option", true, "description");
        assertTrue(options.hasOption("long-option"));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAddRequiredOptionWithLongOptionOnly_sTrB2_3() {
        Options options = new Options();
        options.addRequiredOption(null, "long-option", true, "description");
        assertTrue(options.getOption("long-option").isRequired());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAddRequiredOptionWithNoOption_iGVK3_1() {
        Options options = new Options();
        options.addRequiredOption(null, null, true, "description");
        assertFalse(options.hasOption("a"));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAddRequiredOptionWithNoOption_iGVK3_2() {
        Options options = new Options();
        options.addRequiredOption(null, null, true, "description");
        assertFalse(options.hasOption("long-option"));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAddRequiredOptionWithShortAndLongOptionButNotRequired_LJiT4_1() {
        Options options = new Options();
        options.addRequiredOption("a", "long-option", false, "description");
        assertTrue(options.hasOption("a"));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAddRequiredOptionWithShortAndLongOptionButNotRequired_LJiT4_2() {
        Options options = new Options();
        options.addRequiredOption("a", "long-option", false, "description");
        assertTrue(options.hasOption("long-option"));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAddRequiredOptionWithShortOptionOnlyButNotRequired_BCTw5_1() {
        Options options = new Options();
        options.addRequiredOption("a", null, false, "description");
        assertTrue(options.hasOption("a"));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAddRequiredOptionWithShortOptionOnlyButNotRequired_BCTw5_2() {
        Options options = new Options();
        options.addRequiredOption("a", null, false, "description");
        assertFalse(options.hasOption("long-option"));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAddRequiredOptionWithLongOptionOnlyButNotRequired_lAsz6_1() {
        Options options = new Options();
        options.addRequiredOption(null, "long-option", false, "description");
        assertFalse(options.hasOption("a"));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAddRequiredOptionWithLongOptionOnlyButNotRequired_lAsz6_2() {
        Options options = new Options();
        options.addRequiredOption(null, "long-option", false, "description");
        assertTrue(options.hasOption("long-option"));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAddRequiredOptionWithNoOptionButNotRequired_ZvgN7_1() {
        Options options = new Options();
        options.addRequiredOption(null, null, false, "description");
        assertFalse(options.hasOption("a"));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAddRequiredOptionWithNoOptionButNotRequired_ZvgN7_2() {
        Options options = new Options();
        options.addRequiredOption(null, null, false, "description");
        assertFalse(options.hasOption("long-option"));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAddOptionWithLongOpt_Xxfl0_1() {
        Options options = new Options();
        Option option = new Option("a", "long-opt", false, "description");
        options.addOption(option);
        assertEquals(option, options.getOption("a"));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAddOptionWithLongOpt_Xxfl0_2() {
        Options options = new Options();
        Option option = new Option("a", "long-opt", false, "description");
        options.addOption(option);
        assertEquals(option, options.getOption("long-opt"));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAddOptionWithLongOpt_Xxfl0_3() {
        Options options = new Options();
        Option option = new Option("a", "long-opt", false, "description");
        options.addOption(option);
        assertTrue(options.hasLongOption("long-opt"));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAddOptionWithLongOpt_Xxfl0_4() {
        Options options = new Options();
        Option option = new Option("a", "long-opt", false, "description");
        options.addOption(option);
        assertTrue(options.hasOption("a"));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAddOptionWithLongOpt_Xxfl0_5() {
        Options options = new Options();
        Option option = new Option("a", "long-opt", false, "description");
        options.addOption(option);
        assertTrue(options.hasOption("long-opt"));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAddOptionWithShortOpt_JcEO1_1() {
        Options options = new Options();
        Option option = new Option("a", false, "description");
        options.addOption(option);
        assertEquals(option, options.getOption("a"));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAddOptionWithShortOpt_JcEO1_2() {
        Options options = new Options();
        Option option = new Option("a", false, "description");
        options.addOption(option);
        assertTrue(options.hasShortOption("a"));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAddOptionWithShortOpt_JcEO1_3() {
        Options options = new Options();
        Option option = new Option("a", false, "description");
        options.addOption(option);
        assertTrue(options.hasOption("a"));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAddOption_ugZq0_1() {
        Options options = new Options();
        options.addOption("a", "long-option", true, "description");
        Option option = options.getOption("a");
        assertEquals("a", option.getOpt());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAddOption_ugZq0_2() {
        Options options = new Options();
        options.addOption("a", "long-option", true, "description");
        Option option = options.getOption("a");
        assertEquals("long-option", option.getLongOpt());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAddOptionNoLongOption_nBuO1_1() {
        Options options = new Options();
        options.addOption("a", null, true, "description");
        Option option = options.getOption("a");
        assertEquals("a", option.getOpt());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAddOptionNoLongOption_nBuO1_2() {
        Options options = new Options();
        options.addOption("a", null, true, "description");
        Option option = options.getOption("a");
        assertNull(option.getLongOpt());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAddOptionNoLongOption_nBuO1_3() {
        Options options = new Options();
        options.addOption("a", null, true, "description");
        Option option = options.getOption("a");
        assertTrue(option.hasArg());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAddOptionNoLongOption_nBuO1_4() {
        Options options = new Options();
        options.addOption("a", null, true, "description");
        Option option = options.getOption("a");
        assertEquals("description", option.getDescription());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAddOptionNoShortOption_dtIi2_1() {
        Options options = new Options();
        options.addOption(null, "long-option", true, "description");
        Option option = options.getOption("long-option");
        assertNull(option.getOpt());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAddOptionNoShortOption_dtIi2_2() {
        Options options = new Options();
        options.addOption(null, "long-option", true, "description");
        Option option = options.getOption("long-option");
        assertEquals("long-option", option.getLongOpt());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAddOptionNoShortOption_dtIi2_3() {
        Options options = new Options();
        options.addOption(null, "long-option", true, "description");
        Option option = options.getOption("long-option");
        assertTrue(option.hasArg());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAddOptionNoShortOption_dtIi2_4() {
        Options options = new Options();
        options.addOption(null, "long-option", true, "description");
        Option option = options.getOption("long-option");
        assertEquals("description", option.getDescription());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAddOptionNoShortOrLongOption_MCJj3_1() {
        Options options = new Options();
        options.addOption(null, null, true, "description");
        Option option = options.getOption(null);
        assertNull(option.getOpt());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAddOptionNoShortOrLongOption_MCJj3_2() {
        Options options = new Options();
        options.addOption(null, null, true, "description");
        Option option = options.getOption(null);
        assertNull(option.getLongOpt());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAddOptionNoShortOrLongOption_MCJj3_3() {
        Options options = new Options();
        options.addOption(null, null, true, "description");
        Option option = options.getOption(null);
        assertTrue(option.hasArg());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAddOptionNoShortOrLongOption_MCJj3_4() {
        Options options = new Options();
        options.addOption(null, null, true, "description");
        Option option = options.getOption(null);
        assertEquals("description", option.getDescription());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAddOptions_emptyOptions_WTAN0_1() {
        Options options = new Options();
        Options newOptions = new Options();
        newOptions.addOptions(options);
        assertEquals(0, newOptions.getOptions().size());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAddOptions_emptyOptions_WTAN0_2() {
        Options options = new Options();
        Options newOptions = new Options();
        newOptions.addOptions(options);
        assertEquals(0, newOptions.getOptionGroups().size());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAddOptions_duplicateKey_JTjE1_1() {
        Options options = new Options();
        Option option = new Option("key", "value");
        options.addOption(option);
        Options newOptions = new Options();
        newOptions.addOption(option);
        assertEquals(1, newOptions.getOptions().size());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAddOptions_duplicateKey_JTjE1_3() {
        Options options = new Options();
        Option option = new Option("key", "value");
        options.addOption(option);
        Options newOptions = new Options();
        newOptions.addOption(option);
        assertEquals(option, newOptions.getOption("key"));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAddOptionWithNullOption_YJwG2_3() {
        Options options = new Options();
        options.addOption(null, true, "description");
        assertFalse(options.hasLongOption(null));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAddOptionWithNullOption_YJwG2_5() {
        Options options = new Options();
        options.addOption(null, true, "description");
        assertEquals(0, options.getRequiredOptions().size());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetOptionGroup_mYQs0_IvEt0() {
        Option option = new Option("test", "Test option");
        OptionGroup optionGroup = new OptionGroup();
        optionGroup.addOption(option);
        Options options = new Options();
        options.addOptionGroup(optionGroup);
        assertEquals(optionGroup, options.getOptionGroup(option));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetOptionGroupShortName_BDSh4_ZysP0() {
        Option option = new Option("t", "Test option");
        OptionGroup optionGroup = new OptionGroup();
        optionGroup.addOption(option);
        Options options = new Options();
        options.addOptionGroup(optionGroup);
        assertEquals(optionGroup, options.getOptionGroup(option));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetMatchingOptions_SingleMatch_kIcj1_1_fid2() {
        Options options = new Options();
        List<String> matchingOpts = options.getMatchingOptions("--help");
    }
}