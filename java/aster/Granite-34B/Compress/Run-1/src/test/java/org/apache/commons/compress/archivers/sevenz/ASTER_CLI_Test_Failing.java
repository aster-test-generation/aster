/**
 * Generated by Aster
 */
package org.apache.commons.compress.archivers.sevenz;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_CLI_Test_Failing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testMainWithTwoArguments_ucEP4_sigL0() throws Exception {
    String[] args = {"archive-name", "list"};
    CLI.main(args);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testMainWithThreeArguments_htaT5_lxwf0() throws Exception {
    String[] args = {"archive-name", "list", "extra-argument"};
    CLI.main(args);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testMainWithOneArgument_DLVi3_LTna0() throws Exception {
    String[] args = {"archive-name"};
    CLI.main(args);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testMainWithFileThatExistsAndIsAFile_OmzD8_foXr0() throws Exception {
    String[] args = {"file-name"};
    CLI.main(args);
}
}