/**
 * Generated by Aster
 */
package org.apache.commons.cli;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

public class Aster_CommandLine_Coverage_Test_Passing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void test1_zJMq0() {
        CommandLine commandLine = new CommandLine();
        String opt = "test";
        Object optionObject = commandLine.getOptionObject(opt);
        assertEquals(null, optionObject);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void test3_jNfs2_fid1() {
        CommandLine commandLine = new CommandLine();
        String opt = "test";
        Object optionObject = commandLine.getOptionObject(opt);
        assertFalse(optionObject instanceof Object);
    }
}