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

public class Aster_OptionGroup_Test_Passing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetRequired_YKKI0() {
        OptionGroup optionGroup = new OptionGroup();
        optionGroup.setRequired(true);
        assertTrue(optionGroup.isRequired());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetNames_tjNI0() {
        OptionGroup optionGroup = new OptionGroup();
        Collection<String> names = optionGroup.getNames();
        assertNotNull(names);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetOptions_sLsr0() {
        OptionGroup optionGroup = new OptionGroup();
        Collection<Option> options = optionGroup.getOptions();
        assertNotNull(options);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetSelected_uLDY0() {
        OptionGroup optionGroup = new OptionGroup();
        String selected = optionGroup.getSelected();
        assertNull(selected);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAddOption_EiIJ0() {
        OptionGroup optionGroup = new OptionGroup();
        Option option = new Option("option", "longOption", true, "description");
        optionGroup.addOption(option);
        assertEquals(option, optionGroup.getOptions().iterator().next());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testToString_EmptyOptionGroup_kVdf0() {
        OptionGroup optionGroup = new OptionGroup();
        assertEquals("[]", optionGroup.toString());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testToString_EulT0_oDCJ0() {
        OptionGroup optionGroup = new OptionGroup();
        Option option1 = new Option("o1", "option1", false, "desc1");
        Option option2 = new Option("o2", "option2", false, "desc2");
        optionGroup.addOption(option1);
        optionGroup.addOption(option2);
        String expected = "[-o1 desc1, -o2 desc2]";
        assertEquals(expected, optionGroup.toString());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetSelectedNewOption_vrcm1_RNlo0() {
        OptionGroup optionGroup = new OptionGroup();
        Option option = new Option("option", "description");
        try {
            optionGroup.setSelected(option);
            assertEquals(option.getKey(), optionGroup.getSelected());
        } catch (AlreadySelectedException e) {
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetSelectedSameOption_zzTJ2_fhXJ0() {
        OptionGroup optionGroup = new OptionGroup();
        Option option = new Option("option", "description");
        try {
            optionGroup.setSelected(option);
        } catch (AlreadySelectedException e) {
        }
        try {
            optionGroup.setSelected(option);
        } catch (AlreadySelectedException e) {
        }
        assertEquals(option.getKey(), optionGroup.getSelected());
    }
}