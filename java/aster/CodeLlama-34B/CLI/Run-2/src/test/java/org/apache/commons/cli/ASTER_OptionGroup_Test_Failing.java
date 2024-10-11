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

public class Aster_OptionGroup_Test_Failing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetNamesWithNullOption_kogL4() {
        OptionGroup optionGroup = new OptionGroup();
        Option option = null;
        optionGroup.addOption(option);
        Collection<String> names = optionGroup.getNames();
        assertEquals(0, names.size());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetNamesWithEmptyOption_fnho5() {
        OptionGroup optionGroup = new OptionGroup();
        Option option = new Option("", "value");
        optionGroup.addOption(option);
        Collection<String> names = optionGroup.getNames();
        assertEquals(1, names.size());
        assertTrue(names.contains(""));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetNamesWithEmptyName_IhWS7() {
        OptionGroup optionGroup = new OptionGroup();
        Option option = new Option("", "value");
        optionGroup.addOption(option);
        Collection<String> names = optionGroup.getNames();
        assertEquals(1, names.size());
        assertTrue(names.contains("value"));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetOptions_nullOption_kjgt3() {
        OptionGroup optionGroup = new OptionGroup();
        Option option = null;
        optionGroup.addOption(option);
        Collection<Option> options = optionGroup.getOptions();
        assertEquals(1, options.size());
        assertTrue(options.contains(option));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetNamesWithEmptyOption_fnho5_fid1() {
        OptionGroup optionGroup = new OptionGroup();
        Option option = new Option("", "value");
        optionGroup.addOption(option);
        Collection<String> names = optionGroup.getNames();
        assertEquals(0, names.size());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetNamesWithNullName_YFwC6_fid1() {
        OptionGroup optionGroup = new OptionGroup();
        Option option = new Option(null, "value");
        optionGroup.addOption(option);
        Collection<String> names = optionGroup.getNames();
        assertEquals(0, names.size());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetNamesWithNullValue_LUBs8_fid1() {
        OptionGroup optionGroup = new OptionGroup();
        Option option = new Option("name", null);
        optionGroup.addOption(option);
        Collection<String> names = optionGroup.getNames();
        assertEquals(0, names.size());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetNamesWithEmptyValue_tAAv9_fid1() {
        OptionGroup optionGroup = new OptionGroup();
        Option option = new Option("name", "");
        optionGroup.addOption(option);
        Collection<String> names = optionGroup.getNames();
        assertEquals(0, names.size());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetNamesWithNullNameAndValue_OFNb10() {
        OptionGroup optionGroup = new OptionGroup();
        Option option = new Option(null, null);
        optionGroup.addOption(option);
        Collection<String> names = optionGroup.getNames();
        assertEquals(0, names.size());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetOptions_nullOption_kjgt3_fid1() {
        OptionGroup optionGroup = new OptionGroup();
        Option option = null;
        optionGroup.addOption(option);
        Collection<Option> options = optionGroup.getOptions();
        assertEquals(0, options.size());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetOptions_nullKey_AsCI7_fid1() {
        OptionGroup optionGroup = new OptionGroup();
        Option option = new Option(null, "Option 1");
        optionGroup.addOption(option);
        Collection<Option> options = optionGroup.getOptions();
        assertEquals(0, options.size());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetOptions_nullValue_VdXI8_fid1() {
        OptionGroup optionGroup = new OptionGroup();
        Option option = new Option("option1", null);
        optionGroup.addOption(option);
        Collection<Option> options = optionGroup.getOptions();
        assertEquals(0, options.size());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetOptions_nullKeyAndValue_jTBO9_fid1() {
        OptionGroup optionGroup = new OptionGroup();
        Option option = new Option(null, null);
        optionGroup.addOption(option);
        Collection<Option> options = optionGroup.getOptions();
        assertEquals(0, options.size());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetOptions_invalidKey_Pmrf10() {
        OptionGroup optionGroup = new OptionGroup();
        Option option = new Option("invalid_key", "Option 1");
        optionGroup.addOption(option);
        Collection<Option> options = optionGroup.getOptions();
        assertEquals(0, options.size());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsRequired_NullOptionGroup_WJEQ7_fid1() {
        OptionGroup optionGroup = null;
        assertFalse(optionGroup.isRequired());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetSelected_default_XExG0_fid1() {
        OptionGroup optionGroup = new OptionGroup();
        String selected = optionGroup.getSelected();
        assertEquals("", selected);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testToString_singleOption_Sozj1_fid1() {
        OptionGroup optionGroup = new OptionGroup();
        Option option = new Option("a", "alpha");
        optionGroup.addOption(option);
        String expected = "[a]";
        String actual = optionGroup.toString();
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testToString_multipleOptions_WjkX2_fid1() {
        OptionGroup optionGroup = new OptionGroup();
        Option option1 = new Option("a", "alpha");
        Option option2 = new Option("b", "beta");
        optionGroup.addOption(option1);
        optionGroup.addOption(option2);
        String expected = "[a, b]";
        String actual = optionGroup.toString();
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testToString_optionWithDescription_Zmct3_EOdQ0_fid1() {
        OptionGroup optionGroup = new OptionGroup();
        Option option = new Option("a", "alpha", true, "This is a description");
        optionGroup.addOption(option);
        String expected = "[a: This is a description]";
        String actual = optionGroup.toString();
        assertEquals(expected, actual);
    }
}