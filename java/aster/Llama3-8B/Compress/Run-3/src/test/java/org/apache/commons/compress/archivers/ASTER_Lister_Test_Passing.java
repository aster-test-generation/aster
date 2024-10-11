/**
 * Generated by Aster
 */
package org.apache.commons.compress.archivers;
import java.io.IOException;
import static org.junit.jupiter.api.Assertions.fail;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_Lister_Test_Passing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testMainWithNoArguments_Pdjd0() {
    String[] args = new String[0];
    try {
        Lister.main(args);
        fail("Expected usage() to be called");
    } catch (IOException | ArchiveException e) {
    }
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testMainWithOneArgument_iChC1() {
    String[] args = new String[] {"archive-name"};
    try {
        Lister.main(args);
        fail("Expected usage() to be called");
    } catch (IOException | ArchiveException e) {
    }
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testMainWithTwoArguments_vBWb2() {
    String[] args = new String[] {"archive-name", "zipfile"};
    try {
        Lister.main(args);
    } catch (IOException | ArchiveException e) {
        fail("ExpectedLister.main() to be called");
    }
}
}