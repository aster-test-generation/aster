/**
 * Generated by Aster
 */
package org.apache.commons.cli;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

public class Aster_Option_Coverage_Test_Failing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testToString_SpaceAppend_FLoD1() {
        Option option = new Option("o", "longOption", true, "description");
        String expected = "[ Option o longOption  [ARG] :: description ::  ]";
        assertEquals(expected, option.toString());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testProcessValue_GetValueSeparator_ZIFR3() {
        Option option = new Option("option", "longOption", true, "description");
        option.processValue("value,sep");
        assert option.getValueSeparator() == ',';
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testToDeprecatedString_DeprecatedNull_NfED6_bZID0() {
        Option option = new Option("o", "longOption", true, "description");
        String result = option.toDeprecatedString();
        assert(result.equals(" -o, --longOption <arg>      description"));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testToDeprecatedString_DeprecatedNull_NfED6_bZID0_fid2() {
        Option option = new Option("o", "longOption", true, "description");
        String result = option.toDeprecatedString();
        assert(result.equals("o,longOption,arg:description::"));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testToString_HasArgs_RXon3_ewxt0_fid2() {
        Option option = new Option("o", "longOption", true, "description");
        String expected = "[ Option o longOption [ARG...] :: description ::  ]";
        assertEquals(expected, option.toString());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testProcessValue_BreakCondition_lMWN6_xzpb0_fid2() {
        Option option = new Option("option", "longOption", true, "description");
        option.setArgs(2);
        option.processValue("value,sep");
        assertTrue(option.getValue().split(",").length == 1);
    }
}