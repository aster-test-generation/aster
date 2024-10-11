/**
 * Generated by Aster
 */
package org.apache.commons.cli;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

import java.util.Collection;
import java.util.List;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

public class Aster_PosixParser_Test_Passing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHasLongOption_FzfA0() {
        Options options = new Options();
        options.hasLongOption("opt");
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetMatchingOptions_fEpq1() {
        Options options = new Options();
        options.getMatchingOptions("opt");
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetOption_PKHq2() {
        Options options = new Options();
        options.getOption("opt");
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetOptions_FFeP3() {
        Options options = new Options();
        options.getOptions();
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testToString_xCZR4() {
        Options options = new Options();
        options.toString();
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAddRequiredOption_mEaB5() {
        Options options = new Options();
        options.addRequiredOption("opt", "longOpt", true, "description");
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAddOption_ZeCE6() {
        Options options = new Options();
        options.addOption(new Option("opt", "longOpt", true, "description"));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAddOptions_XXcD7() {
        Options options = new Options();
        options.addOptions(new Options());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAddOptionGroup_ntxa8() {
        Options options = new Options();
        OptionGroup group = new OptionGroup();
        options.addOptionGroup(group);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHasShortOption_xxHa9() {
        Options options = new Options();
        options.hasShortOption("opt");
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAddOption1_LIte10() {
        Options options = new Options();
        options.addOption("opt", true, "description");
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAddOption2_YIUG11() {
        Options options = new Options();
        options.addOption("opt", "description");
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetRequiredOptions_WkVJ13() {
        Options options = new Options();
        options.getRequiredOptions();
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHasOption_xWeH14() {
        Options options = new Options();
        options.hasOption("opt");
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testFlatten_xprn16() throws ParseException {
        PosixParser posixParser = new PosixParser();
        Options options = new Options();
        posixParser.flatten(options, new String[]{"arg1", "arg2"}, false);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetMatchingOptions_WuJQ1() {
        Options options = new Options();
        List<String> result = options.getMatchingOptions("opt");
        assertTrue(result.isEmpty());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetOption_KkwD2() {
        Options options = new Options();
        Option result = options.getOption("opt");
        assertTrue(result == null);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetOptions_tYWp3() {
        Options options = new Options();
        Collection<Option> result = options.getOptions();
        assertTrue(result.isEmpty());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHasLongOption_MDxm0() {
        Options options = new Options();
        boolean result = options.hasLongOption("opt");
        assertEquals(false, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetOption_KOuv2() {
        Options options = new Options();
        Option result = options.getOption("opt");
        assertEquals(null, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testToString_jpBY4() {
        Options options = new Options();
        String result = options.toString();
        assertEquals("[ Options: [ short {} ] [ long {} ]", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHasLongOption_CGha0() {
        Options options = new Options();
        boolean result = options.hasLongOption("opt");
        assertFalse(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetOption_bCrX2() {
        Options options = new Options();
        Option result = options.getOption("opt");
        assertNull(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHasShortOption_NBlt5() {
        Options options = new Options();
        boolean result = options.hasShortOption("opt");
        assertFalse(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHasOption_kcIJ7() {
        Options options = new Options();
        boolean result = options.hasOption("opt");
        assertFalse(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testProcessProperties_YaJx0() throws ParseException {
        PosixParser posixParser = new PosixParser();
        Properties properties = new Properties();
        posixParser.processProperties(properties);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testProcessPropertiesWithNullProperties_OuQw1() throws ParseException {
        PosixParser posixParser = new PosixParser();
        Properties properties = null;
        posixParser.processProperties(properties);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testProcessPropertiesWithOptionGroup_GPqn2() throws ParseException {
        PosixParser posixParser = new PosixParser();
        Properties properties = new Properties();
        OptionGroup optionGroup = new OptionGroup();
        posixParser.processProperties(properties);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testProcessPropertiesWithOptionHasArg_lPDG5() throws ParseException {
        PosixParser posixParser = new PosixParser();
        Properties properties = new Properties();
        Option option = new Option("o", "option", true, "option description");
        posixParser.processProperties(properties);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testProcessPropertiesWithOptionNoArg_fZkl6() throws ParseException {
        PosixParser posixParser = new PosixParser();
        Properties properties = new Properties();
        Option option = new Option("o", "option", false, "option description");
        posixParser.processProperties(properties);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testOptionConstructor1_vUWd0() throws IllegalArgumentException {
        new Option("option", "longOption", true, "description");
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testOptionConstructor2_zpfd1() throws IllegalArgumentException {
        new Option("option", true, "description");
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testOptionConstructor3_ehLX2() throws IllegalArgumentException {
        new Option("option", "description");
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetArgs_oQMn3() throws ParseException {
        Option option = new Option("option", "description");
        assertEquals(-1, option.getArgs());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetDescription_zScg4() throws ParseException {
        Option option = new Option("option", "description");
        assertEquals("description", option.getDescription());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetArgName_reek5() throws ParseException {
        Option option = new Option("option", "description");
        option.setArgName("argName");
        assertEquals("argName", option.getArgName());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetLongOpt_FSfC6() throws ParseException {
        Option option = new Option("option", "description");
        assertNull(option.getLongOpt());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetRequired_rKRg7() throws ParseException {
        Option option = new Option("option", "description");
        option.setRequired(true);
        assertTrue(option.isRequired());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetValue_heGe8() throws ParseException {
        Option option = new Option("option", "description");
        assertEquals(null, option.getValue(0));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testBuilder_cbfK9() throws ParseException {
        Option.Builder builder = Option.builder("option");
        assertNotNull(builder);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetOptionalArg_ZFgt10() throws ParseException {
        Option option = new Option("option", "description");
        option.setOptionalArg(true);
        assertTrue(option.hasOptionalArg());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEquals_xlzA11() throws ParseException {
        Option option1 = new Option("option", "description");
        Option option2 = new Option("option", "description");
        assertTrue(option1.equals(option2));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testClone_mKQg13() throws CloneNotSupportedException {
        Option option = new Option("option", "description");
        Option clonedOption = (Option) option.clone();
        assertEquals(option, clonedOption);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetValueSeparator_UMbn15() throws ParseException {
        Option option = new Option("option", "description");
        assertEquals(0, option.getValueSeparator());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHasArgs_ftCk16() throws ParseException {
        Option option = new Option("option", "description");
        assertFalse(option.hasArgs());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetDescription_rGCo17() throws ParseException {
        Option option = new Option("option", "description");
        option.setDescription("newDescription");
        assertEquals("newDescription", option.getDescription());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEquals3_TuCx19() throws ParseException {
        Option option1 = new Option("option", "description");
        Object obj = new Object();
        assertFalse(option1.equals(obj));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEquals4_SQal20() throws ParseException {
        Option option1 = new Option("option", "description");
        Option option2 = null;
        assertFalse(option1.equals(option2));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testOptionGetArgs_vvoF3() throws ParseException {
        final Option option = new Option("option", "description");
        assertEquals(-1, option.getArgs());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testOptionGetDescription_tSPe4() throws ParseException {
        final Option option = new Option("option", "description");
        assertEquals("description", option.getDescription());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testOptionSetArgName_fjWK5() throws ParseException {
        final Option option = new Option("option", "description");
        option.setArgName("argName");
        assertEquals("argName", option.getArgName());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testOptionGetLongOpt_tZLl6() throws ParseException {
        final Option option = new Option("option", "description");
        assertNull(option.getLongOpt());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testOptionSetRequired_tHay7() throws ParseException {
        final Option option = new Option("option", "description");
        option.setRequired(true);
        assertTrue(option.isRequired());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testOptionBuilder_saiH9() throws ParseException {
        final Option option = Option.builder("option").build();
        assertNull(option.getLongOpt());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testOptionSetOptionalArg_Gtac10() throws ParseException {
        final Option option = new Option("option", "description");
        option.setOptionalArg(true);
        assertTrue(option.hasOptionalArg());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testOptionEquals_EExI11() throws ParseException {
        final Option option1 = new Option("option", "description");
        final Option option2 = new Option("option", "description");
        assertTrue(option1.equals(option2));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testOptionToString_utBQ12() throws ParseException {
        final Option option = new Option("option", "description");
        assertEquals("[ Option option :: description :: class java.lang.String ]", option.toString());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testOptionGetValueSeparator_RXUS14() throws ParseException {
        final Option option = new Option("option", "description");
        assertEquals(0, option.getValueSeparator());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testOptionHasArgs_cghi15() throws ParseException {
        final Option option = new Option("option", "description");
        assertFalse(option.hasArgs());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testOptionSetDescription_KDnX16() throws ParseException {
        final Option option = new Option("option", "description");
        option.setDescription("newDescription");
        assertEquals("newDescription", option.getDescription());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testOptionHashCode_zUsP20() throws ParseException {
        final Option option1 = new Option("option", "description");
        final Option option2 = new Option("option", "description");
        assertEquals(option1.hashCode(), option2.hashCode());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testOptionGetOpt_VBhd21() throws ParseException {
        final Option option = new Option("option", "description");
        assertEquals("option", option.getOpt());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testOptionHasValueSeparator_LHtM22() throws ParseException {
        final Option option = new Option("option", "description");
        assertFalse(option.hasValueSeparator());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testOptionSetType_HQfr23() throws ParseException {
        final Option option = new Option("option", "description");
        option.setType(String.class);
        assertEquals(String.class, option.getType());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetMatchingOptions_rSim1_1() throws ParseException {
        Options options = new Options();
        List<String> result = options.getMatchingOptions("opt");
        assertNotNull(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetMatchingOptions_rSim1_2() throws ParseException {
        Options options = new Options();
        List<String> result = options.getMatchingOptions("opt");
        assertEquals(0, result.size());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetOptions_msiw3_1() throws ParseException {
        Options options = new Options();
        Collection<Option> result = options.getOptions();
        assertNotNull(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetOptions_msiw3_2() throws ParseException {
        Options options = new Options();
        Collection<Option> result = options.getOptions();
        assertEquals(0, result.size());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testToString_AWbQ4() throws ParseException {
        Options options = new Options();
        String result = options.toString();
        assertNotNull(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAddOptions_JfrD9_1() throws ParseException {
        Options options = new Options();
        Options options2 = new Options();
        Options result = options.addOptions(options2);
        assertNotNull(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAddOptions_JfrD9_2() throws ParseException {
        Options options = new Options();
        Options options2 = new Options();
        Options result = options.addOptions(options2);
        assertEquals(options, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHasLongOption_vXXy0() throws ParseException {
        Options options = new Options();
        options.hasLongOption("longOption");
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetMatchingOptions_ACVG1() throws ParseException {
        Options options = new Options();
        options.getMatchingOptions("option");
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetOption_SBiT2() throws ParseException {
        Options options = new Options();
        options.getOption("option");
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAddRequiredOption_Tinu5() throws ParseException {
        Options options = new Options();
        options.addRequiredOption("option", "longOption", true, "description");
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAddOption_HHOR6() throws ParseException {
        Options options = new Options();
        options.addOption("option", "longOption", true, "description");
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHasShortOption_fUIy8() throws ParseException {
        Options options = new Options();
        options.hasShortOption("option");
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAddOption1_JPqS9() throws ParseException {
        Options options = new Options();
        options.addOption("option", true, "description");
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAddOptionGroup_eLiu11() throws ParseException {
        Options options = new Options();
        options.addOptionGroup(new OptionGroup());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHasOption_rzuy12() throws ParseException {
        Options options = new Options();
        options.hasOption("option");
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAddOption2_NYTd13() throws ParseException {
        Options options = new Options();
        options.addOption("option", "description");
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetArgs_msDQ15() throws ParseException {
        CommandLine commandLine = new CommandLine();
        commandLine.getArgs();
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetParsedOptionValue_BrNd16() throws ParseException {
        CommandLine commandLine = new CommandLine();
        commandLine.getParsedOptionValue("option", () -> null);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetOptions_MGed17() throws ParseException {
        CommandLine commandLine = new CommandLine();
        commandLine.getOptions();
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetOptionValue1_Gqsx19() throws ParseException {
        CommandLine commandLine = new CommandLine();
        commandLine.getOptionValue("option");
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetOptionValue2_CtpN20() throws ParseException {
        CommandLine commandLine = new CommandLine();
        commandLine.getOptionValue("option", () -> null);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetParsedOptionValue1_XGnq21() throws ParseException {
        CommandLine commandLine = new CommandLine();
        commandLine.getParsedOptionValue("option", null);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetOptionValue3_GDxk23() throws ParseException {
        CommandLine commandLine = new CommandLine();
        commandLine.getOptionValue("option", "defaultValue");
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetOptionProperties_xnpy25() throws ParseException {
        CommandLine commandLine = new CommandLine();
        commandLine.getOptionProperties("option");
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHasLongOption_cxsM0_1() throws ParseException {
        Options options = new Options();
        options.addOption("l", "longOption", false, "description");
        assertTrue(options.hasLongOption("longOption"));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHasLongOption_cxsM0_2() throws ParseException {
        Options options = new Options();
        options.addOption("l", "longOption", false, "description");
        assertFalse(options.hasLongOption("nonexistentOption"));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetMatchingOptions_zddo1_1() throws ParseException {
        Options options = new Options();
        options.addOption("l", "longOption", false, "description");
        options.addOption("s", "shortOption", false, "description");
        List<String> matchingOptions = options.getMatchingOptions("l");
        assertEquals(1, matchingOptions.size());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetMatchingOptions_zddo1_2() throws ParseException {
        Options options = new Options();
        options.addOption("l", "longOption", false, "description");
        options.addOption("s", "shortOption", false, "description");
        List<String> matchingOptions = options.getMatchingOptions("l");
        assertEquals("longOption", matchingOptions.get(0));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testParse_wEAK3() throws ParseException {
        PosixParser posixParser = new PosixParser();
        Options options = new Options();
        options.addOption("l", "longOption", false, "description");
        String[] arguments = {"-l", "value"};
        CommandLine commandLine = null;
        try {
            commandLine = posixParser.parse(options, arguments, null, false);
        } catch (ParseException e) {
            fail("Parse exception occurred");
        }
        assertNotNull(commandLine);
        assertTrue(commandLine.hasOption("l"));
        assertNull(commandLine.getOptionValue("l"));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetRequiredOptions_pjyt13_XLDP1_1() throws ParseException {
        Options options = new Options();
        List<Option> result = (List<Option>) options.getRequiredOptions();
        assertNotNull(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetRequiredOptions_pjyt13_XLDP1_2() throws ParseException {
        Options options = new Options();
        List<Option> result = (List<Option>) options.getRequiredOptions();
        assertEquals(0, result.size());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetMatchingOptions_rSim1() throws ParseException {
        Options options = new Options();
        List<String> result = options.getMatchingOptions("opt");
        assertNotNull(result);
        assertEquals(0, result.size());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetOptions_msiw3() throws ParseException {
        Options options = new Options();
        Collection<Option> result = options.getOptions();
        assertNotNull(result);
        assertEquals(0, result.size());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAddOptions_JfrD9() throws ParseException {
        Options options = new Options();
        Options options2 = new Options();
        Options result = options.addOptions(options2);
        assertNotNull(result);
        assertEquals(options, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHasLongOption_cxsM0() throws ParseException {
        Options options = new Options();
        options.addOption("l", "longOption", false, "description");
        assertTrue(options.hasLongOption("longOption"));
        assertFalse(options.hasLongOption("nonexistentOption"));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetMatchingOptions_zddo1() throws ParseException {
        Options options = new Options();
        options.addOption("l", "longOption", false, "description");
        options.addOption("s", "shortOption", false, "description");
        List<String> matchingOptions = options.getMatchingOptions("l");
        assertEquals(1, matchingOptions.size());
        assertEquals("longOption", matchingOptions.get(0));
    }
}