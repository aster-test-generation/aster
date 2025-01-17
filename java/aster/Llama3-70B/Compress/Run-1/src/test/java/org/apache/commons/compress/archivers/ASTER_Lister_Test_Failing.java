/**
 * Generated by Aster
 */
package org.apache.commons.compress.archivers;
import java.io.IOException;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_Lister_Test_Failing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGo_JIei0() throws ArchiveException, IOException {
    Lister lister = new Lister();
    String[] args = new String[] {"path"};
    Lister.main(args);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testMainWithValidArgs_YSPP2() throws ArchiveException, IOException {
    String[] args = new String[] {"archive-name", "archive-type"};
    Lister lister = new Lister(false, args);
    lister.go();
    assertTrue(true);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGo_JIei0_fid1() throws ArchiveException, IOException {
    Lister lister = new Lister();
    String[] args = new String[] {"path"};
    lister.go();
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testMainWithValidArgs_YSPP2_fid1() throws ArchiveException, IOException {
    String[] args = new String[] {"archive-name", "archive-type"};
    Lister.main(args);
    assertNotNull(new Lister(false, args));
}
}