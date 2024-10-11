/**
 * Generated by Aster
 */
package org.apache.commons.cli;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

import java.util.Collection;
import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

public class Aster_OptionGroup_Test {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetRequired_Vhgw1() {
        OptionGroup optionGroup = new OptionGroup();
        optionGroup.setRequired(true);
        assertEquals(true, optionGroup.isRequired());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetNames_dbKG0() {
        OptionGroup optionGroup = new OptionGroup();
        Collection<String> names = optionGroup.getNames();
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetOptions_hagt0() {
        OptionGroup optionGroup = new OptionGroup();
        Collection<Option> options = optionGroup.getOptions();
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetOptions_YcqJ1() {
        OptionGroup optionGroup = new OptionGroup();
        Collection<Option> options = optionGroup.getOptions();
        assert options != null;
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsRequired_IVac1() {
        OptionGroup optionGroup = new OptionGroup();
        boolean result = optionGroup.isRequired();
        assertEquals(false, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetSelected_GSLQ1() {
        OptionGroup optionGroup = new OptionGroup();
        String selected = optionGroup.getSelected();
        assertEquals("", selected);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testToString_EmptyOptions_aQQo0() {
        OptionGroup optionGroup = new OptionGroup();
        String result = optionGroup.toString();
        assert result.equals("[]");
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testToString_SingleOption_ASuR1() {
        OptionGroup optionGroup = new OptionGroup();
        optionGroup.getOptions().add(new Option("opt", "description"));
        String result = optionGroup.toString();
        assert result.equals("[-opt description]");
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testToString_MultipleOptions_iHKA2() {
        OptionGroup optionGroup = new OptionGroup();
        optionGroup.getOptions().add(new Option("opt1", "description1"));
        optionGroup.getOptions().add(new Option("opt2", "description2"));
        String result = optionGroup.toString();
        assert result.equals("[-opt1 description1, --opt2 description2]");
    }
}