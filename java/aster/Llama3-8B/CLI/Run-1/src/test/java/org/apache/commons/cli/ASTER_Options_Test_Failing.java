/**
 * Generated by Aster
 */
package org.apache.commons.cli;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

public class Aster_Options_Test_Failing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHasLongOption_Otep0() {
        Options options = new Options();
        assertTrue(options.hasLongOption("abc"));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHasLongOptionValidOption_GKcJ6() {
        Options options = new Options();
        assertTrue(options.hasLongOption("help"));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetOption_ARFI0() {
        Options options = new Options();
        Option option = options.getOption("test");
        assertNotNull(option);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testToString_vXcD1() {
        Options options = new Options();
        String result = options.toString();
        assertEquals("[ Options: [ short  ] [ long  ]]", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAddRequiredOption_iaJF1() {
        Options options = new Options();
        options.addRequiredOption("-a", "--alpha", true, "Alpha option");
        Option option = options.getOption("--alpha");
        assert option != null;
        assert option.isRequired();
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetOptionGroup_emBW0() {
        Options options = new Options();
        Option opt = new Option("option", "longOption", true, "description");
        OptionGroup optionGroup = options.getOptionGroup(opt);
        assertNotNull(optionGroup);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAddOptionWithNullOption_JjVu4() {
        Options options = new Options();
        options.addOption(null, "opt", true, "description");
        assertEquals(options.getOptions().size(), 0);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAddOptionWithNullLongOption_MxxC5() {
        Options options = new Options();
        options.addOption("o", null, true, "description");
        assertEquals(options.getOptions().size(), 0);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAddOptionsWithNoDuplicateKey_MFNR0() {
        Options options = new Options();
        Option opt = new Option("key", "description");
        options.addOption(opt);
        Options optionsToBeAdded = new Options();
        optionsToBeAdded.addOption(opt);
        options.addOptions(optionsToBeAdded);
        assertEquals(options, options);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAddOptionsWithOptionGroups_uhPo2() {
        Options options = new Options();
        Option opt = new Option("key", "description");
        options.addOption(opt);
        OptionGroup optionGroup = new OptionGroup();
        optionGroup.addOption(opt);
        Options optionsToBeAdded = new Options();
        optionsToBeAdded.addOptionGroup(optionGroup);
        options.addOptions(optionsToBeAdded);
        assertEquals(options, options);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHasOptionShortOption_Mper0() {
        Options options = new Options();
        boolean result = options.hasOption("-a");
        assertTrue(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHasOptionLongOption_tnGB1() {
        Options options = new Options();
        boolean result = options.hasOption("--abc");
        assertTrue(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetMatchingOptionsExactMatch_GHqd0_KFfX1() {
        Options options = new Options();
        options.addOption("foo", "foo description");
        List<String> result = options.getMatchingOptions("foo");
        List<String> expected = Collections.singletonList("foo");
        assertEquals(expected, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetMatchingOptionsPrefixMatch_jRAJ1_KhCZ0() {
        Options options = new Options();
        options.addOption("foo", "foo description");
        options.addOption("foobar", "foobar description");
        List<String> result = options.getMatchingOptions("fo");
        List<String> expected = new ArrayList<>();
        expected.add("foo");
        expected.add("foobar");
        assertEquals(expected, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testToStringWithShortOptions_swCN2_YVrW1() {
        Options options = new Options();
        options.addOption("s", "short");
        String result = options.toString();
        assertEquals("[ Options: [ s ] [ long  ]]", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testToStringWithLongOptions_AhrL3_dtQK1() {
        Options options = new Options();
        options.addOption("long", "long description", true, "long");
        String result = options.toString();
        assertEquals("[ Options: [  ] [ long ]]", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testToStringWithShortAndLongOptions_Cwrt4_QdCi0() {
        Options options = new Options();
        options.addOption("s", "short", false, "short");
        options.addOption("l", "long", false, "long");
        String result = options.toString();
        assertEquals("[ Options: [ s short ] [ l long ]]", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAddOptionGroupRequiredOptionGroup_naxT0_vBwu1() {
        Options options = new Options();
        OptionGroup group = new OptionGroup();
        group.setRequired(true);
        options.addOptionGroup(group);
        assertEquals(true, options.getOptions().stream().anyMatch(Option::isRequired));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetMatchingOptionsExactMatch_GHqd0_KFfX1_fid2() {
        Options options = new Options();
        options.addOption("foo", "foo description");
        List<String> result = options.getMatchingOptions("foo");
        List<String> expected = Collections.singletonList("foo");
        assertEquals(expected.size(), result.size());
        assertTrue(result.contains("foo"));
    }
}