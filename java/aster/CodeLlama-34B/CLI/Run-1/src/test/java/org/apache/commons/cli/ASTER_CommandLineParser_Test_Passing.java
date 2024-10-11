/**
 * Generated by Aster
 */
package org.apache.commons.cli;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

public class Aster_CommandLineParser_Test_Passing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testParseWithInvalidOption_GXDk7_gRtJ0_fid1() {
        Options options = new Options();
        options.addOption("a", "alpha", false, "alpha option");
        String[] arguments = new String[]{"-b"};
        CommandLineParser parser = new DefaultParser();
        try {
            parser.parse(options, arguments, false);
            fail("Expected ParseException");
        } catch (ParseException e) {
            assertEquals("Unrecognized option: -b", e.getMessage());
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testParseWithInvalidOptionValue_BZdB8_ZcoH0_fid1() {
        Options options = new Options();
        options.addOption("a", "alpha", true, "alpha option");
        String[] arguments = new String[]{"-a", "arg"};
        CommandLineParser parser = new DefaultParser();
        try {
            parser.parse(options, arguments, false);
            assertTrue(true);
        } catch (ParseException e) {
            assertEquals("Invalid value for option -a: arg", e.getMessage());
        }
    }
}