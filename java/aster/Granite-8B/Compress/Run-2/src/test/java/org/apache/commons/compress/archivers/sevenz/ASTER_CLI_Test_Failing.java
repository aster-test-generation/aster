/**
 * Generated by Aster
 */
package org.apache.commons.compress.archivers.sevenz;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

import java.io.File;
import java.util.concurrent.TimeUnit;

import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_CLI_Test_Failing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testMain_argsLengthIs1_callsUsage_AFLs6() throws Exception {
        final CLI cli = new CLI();
        cli.main(new String[]{""});
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testMain_argsLengthIs2_callsModeTakeAction_WbNW7() throws Exception {
        final CLI cli = new CLI();
        final File file = new File("");
        cli.main(new String[]{file.getAbsolutePath(), "TEST"});
}
}