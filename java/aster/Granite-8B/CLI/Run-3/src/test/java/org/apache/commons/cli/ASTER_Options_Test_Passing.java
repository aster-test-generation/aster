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
    Option option;
    private List<Object> requiredOpts = new ArrayList<>();
    private Map<String, Option> longOpts = new LinkedHashMap<>();
    private Map<String, Option> shortOpts = new LinkedHashMap<>();
    private Map<String, OptionGroup> optionGroups = new LinkedHashMap<>();
    Option option1;
    Option option2;

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHelpOptions_RQYZ0() throws Exception {
        Options options = new Options();
        List<Option> expected = new ArrayList<>(shortOpts.values());
        List<Option> actual = options.helpOptions();
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testToString_SHsO0() throws Exception {
        Options options = new Options();
        String expected = "[ Options: [ short [] ] [ long [] ]";
        assertEquals(expected, options.toString());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testOptionsGetOptions_ulit0() throws Exception {
        Options options = new Options();
        Collection<Option> actualOptions = options.getOptions();
        Collection<Option> expectedOptions = Collections.unmodifiableCollection(options.helpOptions());
        assertEquals(expectedOptions, actualOptions);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAddRequiredOption_FqkU0() throws Exception {
        Options options = new Options();
        Option option = new Option("o", "option", true, "description");
        option.setRequired(true);
        options.addOption(option);
        assertTrue(options.hasOption("o"));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testgetOptionGroups_YfwT0_1() throws Exception {
        Options options = new Options();
        Collection<OptionGroup> optionGroups = options.getOptionGroups();
        assertNotNull(optionGroups);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testgetOptionGroups_YfwT0_2() throws Exception {
        Options options = new Options();
        Collection<OptionGroup> optionGroups = options.getOptionGroups();
        assertFalse(optionGroups.isEmpty());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHasShortOption_OMRQ0() throws Exception {
        Options options = new Options();
        String opt = "opt";
        boolean expected = false;
        boolean actual = options.hasShortOption(opt);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    void testgetOptionGroup_DtLV0_1() throws Exception {
        Option option = new Option("o", "option", true, "description");
        Options options = new Options();
        OptionGroup optionGroup = options.getOptionGroup(option);
        Collection<String> names = optionGroup.getNames();
        Collection<Option> options1 = optionGroup.getOptions();
        String selected = optionGroup.getSelected();
        assertNotNull(optionGroup);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    void testgetOptionGroup_DtLV0_2() throws Exception {
        Option option = new Option("o", "option", true, "description");
        Options options = new Options();
        OptionGroup optionGroup = options.getOptionGroup(option);
        Collection<String> names = optionGroup.getNames();
        Collection<Option> options1 = optionGroup.getOptions();
        String selected = optionGroup.getSelected();
        assertNotNull(names);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    void testgetOptionGroup_DtLV0_3() throws Exception {
        Option option = new Option("o", "option", true, "description");
        Options options = new Options();
        OptionGroup optionGroup = options.getOptionGroup(option);
        Collection<String> names = optionGroup.getNames();
        Collection<Option> options1 = optionGroup.getOptions();
        String selected = optionGroup.getSelected();
        assertTrue(names.isEmpty());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    void testgetOptionGroup_DtLV0_4() throws Exception {
        Option option = new Option("o", "option", true, "description");
        Options options = new Options();
        OptionGroup optionGroup = options.getOptionGroup(option);
        Collection<String> names = optionGroup.getNames();
        Collection<Option> options1 = optionGroup.getOptions();
        String selected = optionGroup.getSelected();
        assertNotNull(options1);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    void testgetOptionGroup_DtLV0_5() throws Exception {
        Option option = new Option("o", "option", true, "description");
        Options options = new Options();
        OptionGroup optionGroup = options.getOptionGroup(option);
        Collection<String> names = optionGroup.getNames();
        Collection<Option> options1 = optionGroup.getOptions();
        String selected = optionGroup.getSelected();
        assertTrue(options1.isEmpty());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    void testgetOptionGroup_DtLV0_6() throws Exception {
        Option option = new Option("o", "option", true, "description");
        Options options = new Options();
        OptionGroup optionGroup = options.getOptionGroup(option);
        Collection<String> names = optionGroup.getNames();
        Collection<Option> options1 = optionGroup.getOptions();
        String selected = optionGroup.getSelected();
        assertEquals("", selected);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testgetOption_OnGY0() throws Exception {
        Options options = new Options();
        Option option = options.getOption("opt");
        assertNotNull(option);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testgetOptionWithNull_Gcyy1() throws Exception {
        Options options = new Options();
        Option option = options.getOption(null);
        assertNull(option);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testgetOptionWithEmpty_myEf2() throws Exception {
        Options options = new Options();
        Option option = options.getOption("");
        assertNull(option);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testgetOptionWithInvalidOption_hnDe3() throws Exception {
        Options options = new Options();
        try {
            options.getOption("invalid");
            fail("Expected IndexOutOfBoundsException");
        } catch (IndexOutOfBoundsException e) {
            assertTrue(e.getMessage().contains("Index: 0, Size: 0"));
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testgetOptionWithValidOption_nzot4() throws Exception {
        Options options = new Options();
        Option option = options.getOption("valid");
        assertNotNull(option);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testgetRequiredOptions_XSua0_1() throws Exception {
        Options options = new Options();
        List<?> requiredOptions = options.getRequiredOptions();
        assertNotNull(requiredOptions);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testgetRequiredOptions_XSua0_2() throws Exception {
        Options options = new Options();
        List<?> requiredOptions = options.getRequiredOptions();
        assertTrue(requiredOptions instanceof List<?>);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testgetRequiredOptions_XSua0_3() throws Exception {
        Options options = new Options();
        List<?> requiredOptions = options.getRequiredOptions();
        assertEquals(0, requiredOptions.size());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAddOption_CZgk0() throws Exception {
        Options options = new Options();
        options.addOption("o", "option", false, "description");
        assertTrue(options.hasOption("o"));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHasOptionWithShortOption_WzIS0() throws Exception {
        Options options = new Options();
        String opt = "shortOption";
        boolean result = options.hasOption(opt);
        assertTrue(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHasOptionWithLongOption_QPTm1() throws Exception {
        Options options = new Options();
        String opt = "longOption";
        boolean result = options.hasOption(opt);
        assertTrue(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHasOptionWithOptionThatDoesNotExist_zpVX2() throws Exception {
        Options options = new Options();
        String opt = "optionThatDoesNotExist";
        boolean result = options.hasOption(opt);
        assertTrue(!result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHasLongOption_EpbB0() throws Exception {
        Options options = new Options();
        String opt = "option";
        boolean expected = true;
        boolean actual = options.hasLongOption(opt);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHasLongOptionWithEmptyOption_Hdkw1() throws Exception {
        Options options = new Options();
        String opt = "";
        boolean expected = false;
        boolean actual = options.hasLongOption(opt);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHasLongOptionWithNullOption_FvWZ2() throws Exception {
        Options options = new Options();
        String opt = null;
        boolean expected = false;
        boolean actual = options.hasLongOption(opt);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHasLongOptionWithOptionThatDoesNotExist_FWLA3() throws Exception {
        Options options = new Options();
        String opt = "nonexistentOption";
        boolean expected = false;
        boolean actual = options.hasLongOption(opt);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAddOption_BIVi0_1() throws Exception {
        Options options = new Options();
        Option option = new Option("o", "option", true, "description");
        options.addOption(option);
        assertTrue(options.hasOption("o"));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAddOption_BIVi0_2() throws Exception {
        Options options = new Options();
        Option option = new Option("o", "option", true, "description");
        options.addOption(option);
        assertEquals("description", options.getOption("o").getDescription());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAddOptionWithLongOption_SflM1_1() throws Exception {
        Options options = new Options();
        Option option = new Option("o", "longOption", true, "description");
        options.addOption(option);
        assertTrue(options.hasLongOption("longOption"));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAddOptionWithLongOption_SflM1_2() throws Exception {
        Options options = new Options();
        Option option = new Option("o", "longOption", true, "description");
        options.addOption(option);
        assertEquals("description", options.getOption("longOption").getDescription());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAddOptionWithHasArg_vxUH2() throws Exception {
        Options options = new Options();
        Option option = new Option("o", "option", true, "description");
        options.addOption(option);
        assertTrue(options.getOption("o").hasArg());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAddOptionWithRequiredOption_wtXV5() throws Exception {
        Options options = new Options();
        Option option = new Option("o", "option", true, "description");
        options.addOption(option);
        assertTrue(options.getRequiredOptions().contains(option));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAddOptionWithDuplicateOption_ZocF6() throws Exception {
        Options options = new Options();
        Option option = new Option("o", "option", true, "description");
        options.addOption(option);
        options.addOption(option);
        assertEquals(1, options.getOptions().size());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAddOptionWithDuplicateLongOption_REBk7() throws Exception {
        Options options = new Options();
        Option option1 = new Option("o", "option", true, "description1");
        Option option2 = new Option("o", "option", true, "description2");
        options.addOption(option1);
        options.addOption(option2);
        assertEquals(1, options.getOptions().size());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAddOption_EXVh0() throws Exception {
        Options options = new Options();
        options.addOption("o", "option", true, "description");
        assertTrue(options.hasOption("o"));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAddOption2_kZio1() throws Exception {
        Options options = new Options();
        options.addOption("o", "option", true, "description");
        assertEquals("description", options.getOption("o").getDescription());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAddOption3_KfAj2() throws Exception {
        Options options = new Options();
        options.addOption("o", "option", true, "description");
        assertTrue(options.hasLongOption("option"));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAddOption4_JeTE3() throws Exception {
        Options options = new Options();
        options.addOption("o", "option", true, "description");
        assertEquals("option", options.getOption("o").getLongOpt());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAddOption5_zncZ4() throws Exception {
        Options options = new Options();
        options.addOption("o", "option", true, "description");
        assertEquals("o", options.getOption("o").getOpt());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAddOption6_SxVC5() throws Exception {
        Options options = new Options();
        options.addOption("o", "option", true, "description");
        assertTrue(options.getOption("o").hasArg());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAddOption7_wdtC6() throws Exception {
        Options options = new Options();
        options.addOption("o", "option", true, "description");
        assertEquals(1, options.getOptions().size());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAddOption8_zgLu7() throws Exception {
        Options options = new Options();
        options.addOption("o", "option", true, "description");
        assertEquals(1, options.getRequiredOptions().size());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAddOption9_BEry8() throws Exception {
        Options options = new Options();
        options.addOption("o", "option", true, "description");
        assertEquals(1, options.getMatchingOptions("o").size());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAddOption10_glCl9() throws Exception {
        Options options = new Options();
        options.addOption("o", "option", true, "description");
        assertEquals(1, options.getMatchingOptions("option").size());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAddOptions_CeCu0() throws Exception {
        Options options = new Options();
        Options options2 = new Options();
        options.addOptions(options2);
        assertEquals(options.getOptions(), options2.getOptions());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHasLongOption_vQNa1() throws Exception {
        Options options = new Options();
        String opt = "opt";
        boolean hasLongOption = options.hasLongOption(opt);
        assertFalse(hasLongOption);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetMatchingOptions_eSsq2_1() throws Exception {
        Options options = new Options();
        String opt = "opt";
        List<String> matchingOptions = options.getMatchingOptions(opt);
        assertNotNull(matchingOptions);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetMatchingOptions_eSsq2_2() throws Exception {
        Options options = new Options();
        String opt = "opt";
        List<String> matchingOptions = options.getMatchingOptions(opt);
        assertTrue(matchingOptions.isEmpty());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetOption_Nbnn3() throws Exception {
        Options options = new Options();
        String opt = "opt";
        Option option = options.getOption(opt);
        assertNotNull(option);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetOptions_kELZ4_1() throws Exception {
        Options options = new Options();
        Collection<Option> options2 = options.getOptions();
        assertNotNull(options2);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetOptions_kELZ4_2() throws Exception {
        Options options = new Options();
        Collection<Option> options2 = options.getOptions();
        assertTrue(options2.isEmpty());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHasShortOption_iAcA5() throws Exception {
        Options options = new Options();
        String opt = "opt";
        boolean hasShortOption = options.hasShortOption(opt);
        assertFalse(hasShortOption);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetRequiredOptions_zWUS6_2() throws Exception {
        Options options = new Options();
        List<?> requiredOptions = options.getRequiredOptions();
        assertTrue(requiredOptions.isEmpty());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHasOption_idvE7() throws Exception {
        Options options = new Options();
        String opt = "opt";
        boolean hasOption = options.hasOption(opt);
        assertFalse(hasOption);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testToString_SgmI10() throws Exception {
        Options options = new Options();
        String toString = options.toString();
        assertNotNull(toString);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void test1_omux0() throws Exception {
        Options options = new Options();
        String opt = "test";
        List<String> expected = Collections.singletonList("test");
        List<String> actual = options.getMatchingOptions(opt);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testOptionConstructor1_IQTf0() throws Exception {
        try {
            new Option("o", "long", true, "desc");
        } catch (IllegalArgumentException e) {
            fail("Exception should not be thrown");
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testOptionConstructor2_GeqL1() throws Exception {
        try {
            new Option("o", true, "desc");
        } catch (IllegalArgumentException e) {
            fail("Exception should not be thrown");
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testOptionConstructor3_zpyC2() throws Exception {
        try {
            new Option("o", "desc");
        } catch (IllegalArgumentException e) {
            fail("Exception should not be thrown");
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testOptionGetArgs_lxSW3() throws Exception {
        Option option = new Option("o", "long", true, "desc");
        assertEquals(1, option.getArgs());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testOptionGetDescription_UxDM4() throws Exception {
        Option option = new Option("o", "long", true, "desc");
        assertEquals("desc", option.getDescription());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testOptionSetArgName_lwkL5() throws Exception {
        Option option = new Option("o", "long", true, "desc");
        option.setArgName("arg");
        assertEquals("arg", option.getArgName());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testOptionGetLongOpt_asdo6() throws Exception {
        Option option = new Option("o", "long", true, "desc");
        assertEquals("long", option.getLongOpt());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testOptionSetRequired_uKHx7() throws Exception {
        Option option = new Option("o", "long", true, "desc");
        option.setRequired(false);
        assertFalse(option.isRequired());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testOptionGetValue_eocc8() throws Exception {
        Option option = new Option("o", "long", true, "desc");
        option.addValue("value");
        assertEquals("value", option.getValue(0));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testOptionBuilder_Rovt9() throws Exception {
        Option option = Option.builder("o").build();
        assertNotNull(option);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testOptionSetOptionalArg_hHBo10() throws Exception {
        Option option = new Option("o", "long", true, "desc");
        option.setOptionalArg(false);
        assertFalse(option.hasOptionalArg());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testOptionEquals_SxPR11() throws Exception {
        Option option1 = new Option("o", "long", true, "desc");
        Option option2 = new Option("o", "long", true, "desc");
        assertTrue(option1.equals(option2));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testOptionToString_caxL12() throws Exception {
        Option option = new Option("o", "long", true, "desc");
        assertEquals("-o, --long <arg> desc", option.toString());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testOptionClone_cvvE13() throws Exception {
        Option option = new Option("o", "long", true, "desc");
        Option clone = (Option) option.clone();
        assertEquals(option, clone);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testOptionGetValueSeparator_JUAL15() throws Exception {
        Option option = new Option("o", "long", true, "desc");
        assertEquals('=', option.getValueSeparator());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testOptionHasArgs_FELY16() throws Exception {
        Option option = new Option("o", "long", true, "desc");
        assertTrue(option.hasArgs());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testOptionSetDescription_Qmto17() throws Exception {
        Option option = new Option("o", "long", true, "desc");
        option.setDescription("new desc");
        assertEquals("new desc", option.getDescription());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testOptionGetDeprecated_Liin18() throws Exception {
        Option option = new Option("o", "long", true, "desc");
        DeprecatedAttributes deprecated = option.getDeprecated();
        assertNotNull(deprecated);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testOptionHashCode_xZIv19() throws Exception {
        Option option1 = new Option("o", "long", true, "desc");
        Option option2 = new Option("o", "long", true, "desc");
        assertEquals(option1.hashCode(), option2.hashCode());
    }
}