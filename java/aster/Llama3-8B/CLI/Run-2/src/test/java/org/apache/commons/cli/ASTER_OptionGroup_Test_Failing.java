/**
 * Generated by Aster
 */
package org.apache.commons.cli;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

public class Aster_OptionGroup_Test_Failing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetSelected_JEtQ0() {
        OptionGroup optionGroup = new OptionGroup();
        String selected = optionGroup.getSelected();
        assert selected != null;
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testToString_SingleOption_zeKT1() {
        OptionGroup optionGroup = new OptionGroup();
        optionGroup.getOptions().add(new Option("opt", "description"));
        String result = optionGroup.toString();
        assertEquals("[-opt description]", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testToString_MultipleOptions_Bvgt2() {
        OptionGroup optionGroup = new OptionGroup();
        optionGroup.getOptions().add(new Option("opt1", "description1"));
        optionGroup.getOptions().add(new Option("opt2", "description2"));
        String result = optionGroup.toString();
        assertEquals("[--opt1 description1, --opt2 description2]", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testToString_SingleLongOption_yDWS3() {
        OptionGroup optionGroup = new OptionGroup();
        optionGroup.getOptions().add(new Option(null, "longOpt"));
        String result = optionGroup.toString();
        assertEquals("[--longOpt]", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testToString_MultipleLongOptions_rVLR4() {
        OptionGroup optionGroup = new OptionGroup();
        optionGroup.getOptions().add(new Option(null, "longOpt1"));
        optionGroup.getOptions().add(new Option(null, "longOpt2"));
        String result = optionGroup.toString();
        assertEquals("[--longOpt1, --longOpt2]", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetSelectedNull_ttxd0_GqVm0() {
        OptionGroup optionGroup = new OptionGroup();
        try {
            optionGroup.setSelected(null);
            fail("Expected AlreadySelectedException");
        } catch (AlreadySelectedException e) {
        }
    }
}