/**
 * Generated by Aster
 */
package org.apache.commons.cli;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

public class Aster_DefaultParser_Coverage_Test_Failing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCheckRequiredOptions_EmptyList_akgu0() throws org.apache.commons.cli.MissingOptionException {
        DefaultParser parser = new DefaultParser(true);
        parser.checkRequiredOptions();
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCheckRequiredOptions_NonEmptyList_gIiB1_aXHM0() throws org.apache.commons.cli.MissingOptionException {
        DefaultParser parser = new DefaultParser(true);
        List<String> expectedOpts = new ArrayList<>();
        expectedOpts.add("opt1");
        expectedOpts.add("opt2");
        Options options = new Options();
        options.addOption("opt1", "opt1", true, "Description for opt1");
        options.addOption("opt2", "opt2", true, "Description for opt2");
        String[] args = new String[]{"-opt1", "-opt2", "arg1", "arg2"};
        try {
            CommandLine cmd = parser.parse(options, args, true);
            assertEquals(expectedOpts, cmd.getArgList());
        } catch (ParseException e) {
            fail("ParseException was thrown");
        }
    }
}