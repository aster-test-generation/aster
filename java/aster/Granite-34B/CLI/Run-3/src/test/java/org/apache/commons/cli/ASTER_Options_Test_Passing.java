/**
 * Generated by Aster
 */
package org.apache.commons.cli;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

import java.util.*;
import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

public class Aster_Options_Test_Passing {
    Options options;
    private List<Object> requiredOpts = new ArrayList<>();
    private Map<String, Option> longOpts = new LinkedHashMap<>();

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testToString_uack0() throws Exception {
        Options options = new Options();
        assertEquals("[ Options: [ short [] ] [ long  ]", options.toString());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAddOption_zSCS0() throws Exception {
        Options options = new Options();
        options.addOption("opt", "longOpt", true, "description");
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void getOptionsTest_XlDU0() throws Exception {
        Options options = new Options();
        Collection<Option> expected = Collections.unmodifiableCollection(Arrays.asList(new Option("a", "b"), new Option("c", "d")));
        assertEquals(expected, options.getOptions());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHasLongOption_Gdmb0_1() throws Exception {
        Options options = new Options();
        assertTrue(options.hasLongOption("example-option"));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHasLongOption_Gdmb0_2() throws Exception {
        Options options = new Options();
        assertFalse(options.hasLongOption("non-existent-option"));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetOptionWithShortOption_qeUh0() throws Exception {
        Options options = new Options();
        Option option = options.getOption("a");
        assertEquals("Option 'a' is not found", option.getOpt());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetOptionWithLongOption_rybI1() throws Exception {
        Options options = new Options();
        Option option = options.getOption("long-option");
        assertEquals("long-option", option.getLongOpt());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    void testGetOptionGroups_GxCh0_1() throws Exception {
        Options options = new Options();
        Collection<OptionGroup> optionGroups = options.getOptionGroups();
        assertNotNull(optionGroups);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    void testGetOptionGroups_GxCh0_2() throws Exception {
        Options options = new Options();
        Collection<OptionGroup> optionGroups = options.getOptionGroups();
        assertTrue(optionGroups.isEmpty());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetOptionGroup_bcEq0_1() throws Exception {
        Options options = new Options();
        Option option = new Option("option", "description");
        options.addOptionGroup(new OptionGroup().addOption(option));
        OptionGroup optionGroup = options.getOptionGroup(option);
        assertNotNull(optionGroup);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetOptionGroupNull_vbOZ1() throws Exception {
        Options options = new Options();
        Option option = new Option("option", "description");
        OptionGroup optionGroup = options.getOptionGroup(option);
        assertNull(optionGroup);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    void testAddOptionGroup_ieeU0() throws Exception {
        Options options = new Options();
        OptionGroup group = new OptionGroup();
        options.addOptionGroup(group);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    void testAddOptionGroupWithRequired_lWXg1() throws Exception {
        Options options = new Options();
        OptionGroup group = new OptionGroup();
        group.setRequired(true);
        options.addOptionGroup(group);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAddOption_mNCK0() throws Exception {
        Options options = new Options();
        options.addOption("opt", "description");
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAddOptionWithLongOpt_ixjK1() throws Exception {
        Options options = new Options();
        options.addOption("opt", "longOpt", false, "description");
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAddOptionWithArgName_rdTg3() throws Exception {
        Options options = new Options();
        options.addOption("opt", "description", false, "argName");
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAddOption_VWRD0() throws Exception {
        Options options = new Options();
        options.addOption("opt", true, "description");
        assertEquals(1, options.getOptions().size());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAddOptionWithLongOpt_iVWE1() throws Exception {
        Options options = new Options();
        options.addOption("opt", "longOpt", true, "description");
        assertEquals(1, options.getOptions().size());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAddOptionWithOptionGroup_qAPp2() throws Exception {
        Options options = new Options();
        OptionGroup group = new OptionGroup();
        options.addOptionGroup(group);
        options.addOption("opt", true, "description");
        assertEquals(1, options.getOptions().size());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAddRequiredOption_dmkd0() throws Exception {
        Options options = new Options();
        options.addRequiredOption("opt", "longOpt", true, "description");
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAddRequiredOptionWithNullLongOpt_wYte1() throws Exception {
        Options options = new Options();
        options.addRequiredOption("opt", null, true, "description");
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAddRequiredOptionWithNullDescription_KfQP2() throws Exception {
        Options options = new Options();
        options.addRequiredOption("opt", "longOpt", true, null);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAddRequiredOptionWithEmptyDescription_bSKZ3() throws Exception {
        Options options = new Options();
        options.addRequiredOption("opt", "longOpt", true, "");
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAddRequiredOptionWithNullOpt_xzsx4() throws Exception {
        Options options = new Options();
        try {
            options.addRequiredOption(null, "longOpt", true, "description");
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAddRequiredOptionWithEmptyOpt_iEpk5() throws Exception {
        Options options = new Options();
        try {
            options.addRequiredOption("", "longOpt", true, "description");
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAddOptions_iDQm0() throws Exception {
        Options options = new Options();
        options.addOption("opt", "longOpt", true, "description");
        options.addOption("opt2", "longOpt2", false, "description2");
        Options options2 = new Options();
        options2.addOption("opt3", "longOpt3", true, "description3");
        options2.addOption("opt4", "longOpt4", false, "description4");
        options.addOptions(options2);
        assertEquals(4, options.getOptions().size());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAddOptionsWithOptionGroup_Supu1() throws Exception {
        Options options = new Options();
        OptionGroup group = new OptionGroup();
        group.addOption(new Option("opt", "longOpt", true, "description"));
        group.addOption(new Option("opt2", "longOpt2", false, "description2"));
        options.addOptionGroup(group);
        Options options2 = new Options();
        OptionGroup group2 = new OptionGroup();
        group2.addOption(new Option("opt3", "longOpt3", true, "description3"));
        group2.addOption(new Option("opt4", "longOpt4", false, "description4"));
        options2.addOptionGroup(group2);
        options.addOptions(options2);
        assertEquals(2, options.getOptionGroups().size());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAddOptionsWithDuplicateKey_KorE2() throws Exception {
        Options options = new Options();
        options.addOption("opt", "longOpt", true, "description");
        Options options2 = new Options();
        options2.addOption("opt", "longOpt2", false, "description2");
        try {
            options.addOptions(options2);
        } catch (IllegalArgumentException e) {
            assertEquals("Duplicate key: opt", e.getMessage());
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAddOption_ZInv0() throws Exception {
        Options options = new Options();
        Option option = new Option("option", "description");
        options.addOption(option);
        assertTrue(options.hasOption("option"));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAddOptionWithLongOpt_dgJb1() throws Exception {
        Options options = new Options();
        Option option = new Option("option", "longOption", false, "description");
        options.addOption(option);
        assertTrue(options.hasLongOption("longOption"));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAddOptionWithRequired_HdVN2() throws Exception {
        Options options = new Options();
        Option option = new Option("option", "description");
        option.setRequired(true);
        options.addOption(option);
        assertTrue(options.getRequiredOptions().contains("option"));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAddOptionWithArgs_LcUQ3() throws Exception {
        Options options = new Options();
        Option option = new Option("option", "description");
        option.setArgs(2);
        options.addOption(option);
        assertEquals(2, options.getOption("option").getArgs());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void test1_hlHX0() throws Exception {
        Options options = new Options();
        String opt = "opt";
        List<String> result = options.getMatchingOptions(opt);
        assertEquals(result.size(), 0);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void test2_ZLZr1() throws Exception {
        Options options = new Options();
        String opt = "opt";
        List<String> result = options.getMatchingOptions(opt);
        assertEquals(result.get(0), "opt");
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHasShortOption_zWrQ0() throws Exception {
        Options options = new Options();
        String opt = "opt";
        boolean result = options.hasShortOption(opt);
        assertTrue(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHasShortOption2_rqdr1() throws Exception {
        Options options = new Options();
        String opt = "opt";
        boolean result = options.hasShortOption(opt);
        assertFalse(result);
    }
}