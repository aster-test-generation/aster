/**
 * Generated by Aster
 */
package org.apache.commons.cli;

import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

public class Aster_DefaultParser_Coverage_Test_Failing {
    DefaultParser defaultparser;

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCheckRequiredOptions2_LEBo1() throws org.apache.commons.cli.MissingOptionException {
        DefaultParser defaultParser = new DefaultParser();
        defaultParser.expectedOpts = new ArrayList<>();
        defaultParser.expectedOpts.add("option1");
        defaultParser.checkRequiredOptions();
    }
}