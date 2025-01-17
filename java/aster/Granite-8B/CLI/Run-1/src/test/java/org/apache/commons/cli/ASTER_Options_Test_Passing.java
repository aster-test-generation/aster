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
    public void testOptionsGetOptions_zbuu0() {
        Options options = new Options();
        Collection<Option> actualOptions = options.getOptions();
        assertNotNull(actualOptions);
        assertTrue(actualOptions.isEmpty());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testgetOptionGroups_ndPU0() {
        Options options = new Options();
        Collection<OptionGroup> optionGroups = options.getOptionGroups();
        assertNotNull(optionGroups);
        assertTrue(optionGroups.isEmpty());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAddOption_GabS0() {
        Options options = new Options();
        Option option = new Option("o", "option", true, "description");
        options.addOption(option);
        assertEquals(1, options.getOptions().size());
        assertTrue(options.hasOption("o"));
        assertTrue(options.hasLongOption("option"));
        assertEquals("description", options.getOption("o").getDescription());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAddOptions_BJDd0() {
        Options options = new Options();
        Options options1 = new Options();
        Options result = options.addOptions(options1);
        assertEquals(result, options);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHasShortOption_gNKY0() {
        Options options = new Options();
        String opt = "test";
        boolean expected = false;
        boolean actual = options.hasShortOption(opt);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHasShortOptionWithNullOpt_wjut1() {
        Options options = new Options();
        String opt = null;
        boolean expected = false;
        boolean actual = options.hasShortOption(opt);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHasShortOptionWithEmptyOpt_WTTs2() {
        Options options = new Options();
        String opt = "";
        boolean expected = false;
        boolean actual = options.hasShortOption(opt);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAddOption_pEjp0() {
        Options options = new Options();
        options.addOption("o", "option", true, "description");
        assertTrue(options.hasOption("o"));
        assertEquals("description", options.getOption("o").getDescription());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testgetRequiredOptions_sHMF0() {
        Options options = new Options();
        List<?> requiredOptions = options.getRequiredOptions();
        assertNotNull(requiredOptions);
        assertTrue(requiredOptions.isEmpty());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHasOptionWithInvalidOption_aCeq2() {
        Options options = new Options();
        boolean result = options.hasOption("invalidOption");
        assertFalse(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAddOption_HZwY0() {
        Options options = new Options();
        options.addOption("o", "option", false, "description");
        assertTrue(options.hasOption("o"));
        assertEquals("description", options.getOption("o").getDescription());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testOptionsGetOptions_zbuu0_1() {
        Options options = new Options();
        Collection<Option> actualOptions = options.getOptions();
        assertNotNull(actualOptions);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testOptionsGetOptions_zbuu0_2() {
        Options options = new Options();
        Collection<Option> actualOptions = options.getOptions();
        assertTrue(actualOptions.isEmpty());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testgetOptionGroups_ndPU0_1() {
        Options options = new Options();
        Collection<OptionGroup> optionGroups = options.getOptionGroups();
        assertNotNull(optionGroups);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testgetOptionGroups_ndPU0_2() {
        Options options = new Options();
        Collection<OptionGroup> optionGroups = options.getOptionGroups();
        assertTrue(optionGroups.isEmpty());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAddOption_GabS0_1() {
        Options options = new Options();
        Option option = new Option("o", "option", true, "description");
        options.addOption(option);
        assertEquals(1, options.getOptions().size());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAddOption_GabS0_2() {
        Options options = new Options();
        Option option = new Option("o", "option", true, "description");
        options.addOption(option);
        assertTrue(options.hasOption("o"));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAddOption_GabS0_3() {
        Options options = new Options();
        Option option = new Option("o", "option", true, "description");
        options.addOption(option);
        assertTrue(options.hasLongOption("option"));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAddOption_GabS0_4() {
        Options options = new Options();
        Option option = new Option("o", "option", true, "description");
        options.addOption(option);
        assertEquals("description", options.getOption("o").getDescription());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAddOption_pEjp0_1() {
        Options options = new Options();
        options.addOption("o", "option", true, "description");
        assertTrue(options.hasOption("o"));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAddOption_pEjp0_2() {
        Options options = new Options();
        options.addOption("o", "option", true, "description");
        assertEquals("description", options.getOption("o").getDescription());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testgetRequiredOptions_sHMF0_1() {
        Options options = new Options();
        List<?> requiredOptions = options.getRequiredOptions();
        assertNotNull(requiredOptions);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testgetRequiredOptions_sHMF0_2() {
        Options options = new Options();
        List<?> requiredOptions = options.getRequiredOptions();
        assertTrue(requiredOptions.isEmpty());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAddOption_HZwY0_1() {
        Options options = new Options();
        options.addOption("o", "option", false, "description");
        assertTrue(options.hasOption("o"));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAddOption_HZwY0_2() {
        Options options = new Options();
        options.addOption("o", "option", false, "description");
        assertEquals("description", options.getOption("o").getDescription());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void test_getOption_with_long_option_xiFQ1_xgpD0() {
        Options options = new Options();
        Option option = new Option("l", "long", false, "long");
        options.addOption(option);
        Option result = options.getOption("long");
        assertEquals(option, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHasLongOption_oGZM0_fid2() {
        Options options = new Options();
        String opt = "option";
        boolean expected = false;
        boolean actual = options.hasLongOption(opt);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testToString_UKky0_fid2() {
        Options options = new Options();
        String expected = "[ Options: [ short {} ] [ long {} ]";
        assertEquals(expected, options.toString());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHasShortOptionWithOptThatExists_BuPq4_fid2() {
        Options options = new Options();
        String opt = "t";
        boolean expected = false;
        boolean actual = options.hasShortOption(opt);
        assertEquals(expected, actual);
    }
}