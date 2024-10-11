/**
 * Generated by Aster
 */
package org.apache.commons.compress.archivers.sevenz;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_CLI_Test_Failing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testMainThreeArgs_pdra3_VGPW0() {
    String[] args = {"archive-name", "list", "extra-arg"};
    try {
        CLI.main(args);
    } catch (Exception e) {
    }
    assertEquals("org.apache.maven.surefire.api.report.ConsoleOutputCapture$ForwardingPrintStream@29d98dcf", System.out.toString());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testMainOneArg_PYpO1_bZbQ0_fid1() {
    String[] args = {"archive-name"};
    try {
        CLI.main(args);
    } catch (Exception e) {
        e.printStackTrace();
    }
    assertEquals("Parameters: archive-name [list]", System.out.toString());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testMainInvalidArchiveName_iuLu4_Wtjy0_fid1() {
    String[] args = {"invalid-archive-name"};
    try {
        CLI.main(args);
    } catch (Exception e) {
    }
    assertEquals("Parameters: archive-name [list]", System.out.toString());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testMainTwoArgs_SeVL2_XyQd0_fid1() {
    String[] args = {"archive-name", "list"};
    try {
        CLI.main(args);
    } catch (Exception e) {
    }
    assertEquals("Parameters: archive-name [list]", System.out.toString());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testMainThreeArgs_pdra3_VGPW0_fid1() {
    String[] args = {"archive-name", "list", "extra-arg"};
    try {
        CLI.main(args);
    } catch (Exception e) {
    }
    assertEquals("Parameters: archive-name [list]", System.out.toString());
}
}