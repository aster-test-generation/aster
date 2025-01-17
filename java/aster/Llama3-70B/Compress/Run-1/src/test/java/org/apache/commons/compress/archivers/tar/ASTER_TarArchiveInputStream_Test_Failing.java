/**
 * Generated by Aster
 */
package org.apache.commons.compress.archivers.tar;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.apache.commons.compress.utils.IOUtils;
import static org.junit.jupiter.api.Assertions.*;
import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_TarArchiveInputStream_Test_Failing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSkip_NegativeValue_vSRr3() throws IOException {
    TarArchiveInputStream tarArchiveInputStream = new TarArchiveInputStream(new FileInputStream("test.tar"), 512);
    assertEquals(0, tarArchiveInputStream.skip(-1));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSkip_NonSparseEntry_vatq0_ptkK0() throws IOException {
    TarArchiveInputStream tarArchiveInputStream = new TarArchiveInputStream(new FileInputStream("test.tar"), 512);
    TarArchiveEntry currEntry = tarArchiveInputStream.getNextTarEntry();
    currEntry.setSize(1024);
    IOUtils.skip(tarArchiveInputStream, 1024);
    assertEquals(1024, IOUtils.skip(tarArchiveInputStream, Long.MAX_VALUE));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSkip_SparseEntry_RexK1_OrsW0() throws IOException {
    TarArchiveInputStream tarArchiveInputStream = new TarArchiveInputStream(new FileInputStream("test.tar"), 512);
    TarArchiveEntry currEntry = tarArchiveInputStream.getNextTarEntry();
    currEntry.setSize(1024);
    List<TarArchiveStructSparse> sparseHeaders = new ArrayList<>();
    sparseHeaders.add(new TarArchiveStructSparse(0, 1024));
    currEntry.setSparseHeaders(sparseHeaders);
    tarArchiveInputStream.getNextTarEntry(); 
    long skipped = tarArchiveInputStream.skip(1024);
    assertEquals(1024, skipped);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetNextTarEntry6_gKfI5_fmMm0() {
    try {
        TarArchiveInputStream tarArchiveInputStream = new TarArchiveInputStream(new FileInputStream("file"), 512, 20, "UTF-8");
        TarArchiveEntry tarArchiveEntry = tarArchiveInputStream.getNextTarEntry();
        assertNotNull(tarArchiveEntry);
    } catch (IOException e) {
        fail("IOException occurred: " + e.getMessage());
    }
}
}