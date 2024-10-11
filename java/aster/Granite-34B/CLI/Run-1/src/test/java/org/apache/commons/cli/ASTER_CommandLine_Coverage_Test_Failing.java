/**
 * Generated by Aster
 */
package org.apache.commons.cli;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

public class Aster_CommandLine_Coverage_Test_Failing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void test2_JPlt1() {
        CommandLine commandLine = new CommandLine();
        String opt = "test";
        Object optionObject = commandLine.getOptionObject(opt);
        assertNotNull(optionObject);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void test3_jNfs2() {
        CommandLine commandLine = new CommandLine();
        String opt = "test";
        Object optionObject = commandLine.getOptionObject(opt);
        assertTrue(optionObject instanceof Object);
    }
}