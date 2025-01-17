/**
 * Generated by Aster
 */
package org.apache.commons.compress.archivers.tar;
import java.io.IOException;
import java.util.List;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import java.util.List;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_TarArchiveSparseEntry_Test_Passing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetSparseHeaders_Xawz0_yBTG0() throws IOException {
        byte[] headerBuf = new byte[512]; // Assuming headerBuf is initialized with appropriate values
        TarArchiveSparseEntry tarArchiveSparseEntry = new TarArchiveSparseEntry(headerBuf);
        List<TarArchiveStructSparse> sparseHeaders = tarArchiveSparseEntry.getSparseHeaders();
        assertNotNull(sparseHeaders);
    }
}