/**
 * Generated by Aster
 */
package org.apache.commons.cli;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

public class Aster_CommandLineParser_Test_Failing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testParseWithStopAtNonOption_BrzU6_3_fid1() throws Exception {
        Options options = new Options();
        options.addOption("a", "alpha", false, "Alpha option");
        String[] args = {"-a", "value", "arg1", "arg2"};
        CommandLineParser parser = new DefaultParser();
        CommandLine commandLine = parser.parse(options, args, true);
        assertEquals(0, commandLine.getArgs().length);
    }
}