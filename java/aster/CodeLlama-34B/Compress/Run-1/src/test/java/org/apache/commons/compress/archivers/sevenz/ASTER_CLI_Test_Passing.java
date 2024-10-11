/**
 * Generated by Aster
 */
package org.apache.commons.compress.archivers.sevenz;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_CLI_Test_Passing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testMainOneArg_PYpO1_bZbQ0() {
    String[] args = {"archive-name"};
    try {
        CLI.main(args);
    } catch (Exception e) {
        e.printStackTrace();
    }
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testMainInvalidArchiveName_iuLu4_Wtjy0() {
    String[] args = {"invalid-archive-name"};
    try {
        CLI.main(args);
    } catch (Exception e) {
    }
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testMainTwoArgs_SeVL2_XyQd0() {
    String[] args = {"archive-name", "list"};
    try {
        CLI.main(args);
    } catch (Exception e) {
    }
}
}