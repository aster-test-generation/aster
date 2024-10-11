/**
 * Generated by Aster
 */
package org.apache.commons.compress.archivers;
import java.io.IOException;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.mockito.Mockito.verify;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_Lister_Test_Passing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGo_PqEi0() throws ArchiveException, IOException {
    Lister lister = new Lister();
    String[] args = new String[] {"path"};
    lister.go();
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testMainWithNullArgs_NyhB0() throws ArchiveException, IOException {
    String[] args = null;
    Lister.main(args);
    verify(System.err).println("Parameters: archive-name [archive-type]\n");
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testMainWithEmptyArgs_DEwl1() throws ArchiveException, IOException {
    String[] args = new String[0];
    Lister.main(args);
    verify(System.err).println("Parameters: archive-name [archive-type]\n");
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testMainWithValidArgs_ZoGU2() throws ArchiveException, IOException {
    String[] args = new String[] {"archive-name", "archive-type"};
    Lister.main(args);
    verify(new Lister(false, args)).go();
}
}