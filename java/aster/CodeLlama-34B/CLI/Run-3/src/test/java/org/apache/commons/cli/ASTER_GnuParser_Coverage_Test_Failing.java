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

public class Aster_GnuParser_Coverage_Test_Failing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testFlatten2_BaGd1_1() throws ParseException {
        Options options = new Options();
        options.addOption("a", false, "description");
        options.addOption("b", true, "description");
        options.addOption("c", false, "description");
        String[] arguments = new String[]{"-a", "-b", "value", "-c"};
        GnuParser parser = new GnuParser();
        String[] tokens = parser.flatten(options, arguments, true);
        assertEquals(2, tokens.length);
    }
}