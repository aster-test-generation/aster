/**
 * Generated by Aster
 */
package org.apache.commons.cli;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

public class Aster_Option_Coverage_Test_Failing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHasArgName_ArgNameEmpty_RLiH2_vuiw0() {
        Option option = new Option("option", "longOption", true, "description");
        boolean result = option.hasArgName();
        assertTrue(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testProcessValue_WhileLoop_OFIQ3_BlHb1() {
        Option option = new Option("option", true, "description");
        option.setArgs(3);
        option.addValue("value1");
        option.addValue("value2");
        option.addValue("value3");
        option.processValue("value1,value2,value3");
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testProcessValue_WhileLoop_OFIQ3_BlHb1_fid2() {
        Option option = new Option("option", true, "description");
        option.setArgs(3);
        option.processValue("value1");
        option.processValue("value2");
        option.processValue("value3");
        option.processValue("value1,value2,value3");
    }
}