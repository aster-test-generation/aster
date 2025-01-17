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
    private OptionGroup optionGroup;

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetRequired_swBk0() {
        OptionGroup optionGroup = new OptionGroup();
        optionGroup.setRequired(true);
        assertTrue(optionGroup.isRequired());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetNames_KfyS0_1() {
        OptionGroup optionGroup = new OptionGroup();
        Collection<String> actualNames = optionGroup.getNames();
        assertNotNull(actualNames);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetNames_KfyS0_2() {
        OptionGroup optionGroup = new OptionGroup();
        Collection<String> actualNames = optionGroup.getNames();
        assertTrue(actualNames.isEmpty());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testToString1_iSeN0() {
        OptionGroup optionGroup = new OptionGroup();
        String actual = optionGroup.toString();
        String expected = "[]";
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetSelected_JNLE4() {
        OptionGroup group = new OptionGroup();
        Option option = new Option("o", "long", true, "description");
        group.addOption(option);
        String selected = group.getSelected();
        assertNull(selected);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetSelected_EHyG0_amqc0() {
        OptionGroup optionGroup = new OptionGroup();
        Option option1 = new Option("option1", "longOption1", true, "description1");
        Option option2 = new Option("option2", "longOption2", true, "description2");
        try {
            optionGroup.setSelected(option1);
        } catch (AlreadySelectedException e) {
            e.printStackTrace();
        }
        assertEquals(option1.getKey(), optionGroup.getSelected());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void setUp_aXNC0() {
        optionGroup = new OptionGroup();
    }
}