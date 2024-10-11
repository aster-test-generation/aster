/**
 * Generated by Aster
 */
package org.apache.commons.compress.archivers;
import java.io.IOException;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_Lister_Test_Failing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGo_agzD0() throws ArchiveException, IOException {
    Lister lister = new Lister();
    String[] args = new String[]{"path", "zipfile"};
    new Lister(false, args).go();
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGo_agzD0_fid2() throws ArchiveException, IOException {
    Lister lister = new Lister();
    String[] args = new String[]{"path"};
    lister.go();
}
}