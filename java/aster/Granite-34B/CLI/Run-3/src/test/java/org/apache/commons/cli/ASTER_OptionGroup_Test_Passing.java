/**
 * Generated by Aster
 */
package org.apache.commons.cli;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

public class Aster_OptionGroup_Test_Passing {
    private Map<String, Option> optionMap = new LinkedHashMap<>();
    OptionGroup optiongroup;
    private String selected;

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAddOption_zonG0() throws Exception {
        OptionGroup optionGroup = new OptionGroup();
        Option option = new Option("option", "longOption", true, "description");
        optionGroup.addOption(option);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetOptions_mFKi0() throws Exception {
        OptionGroup optionGroup = new OptionGroup();
        Collection<Option> options = optionGroup.getOptions();
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetSelected_oPFz0() throws AlreadySelectedException {
        OptionGroup optionGroup = new OptionGroup();
        Option option1 = new Option("option1", "description1");
        Option option2 = new Option("option2", "description2");
        optionGroup.setSelected(option1);
        optionGroup.setSelected(option2);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testToString_ukyV0() throws Exception {
        final OptionGroup group = new OptionGroup();
        assertEquals("[]", group.toString());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testToStringWithOption_ZiJn1() throws Exception {
        final OptionGroup group = new OptionGroup();
        final Option option = new Option("a", "alpha", false, "the alpha option");
        group.addOption(option);
        assertEquals("[a the alpha option]", group.toString());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testToStringWithSeveralOptions_gLjo3() throws Exception {
        final OptionGroup group = new OptionGroup();
        final Option option1 = new Option("a", "alpha", false, "the alpha option");
        final Option option2 = new Option("b", "beta", false, "the beta option");
        final Option option3 = new Option("g", "gamma", false, "the gamma option");
        group.addOption(option1);
        group.addOption(option2);
        group.addOption(option3);
        assertEquals("[a the alpha option, b the beta option, g the gamma option]", group.toString());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testToStringWithNullOption_qLoe4() throws Exception {
        final OptionGroup group = new OptionGroup();
        final Option option = new Option("a", "alpha", false, null);
        group.addOption(option);
        assertEquals("[a ]", group.toString());
    }
}