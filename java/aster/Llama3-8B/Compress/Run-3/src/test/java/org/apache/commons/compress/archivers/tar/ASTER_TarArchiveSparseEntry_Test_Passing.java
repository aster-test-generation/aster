/**
 * Generated by Aster
 */
package org.apache.commons.compress.archivers.tar;
import java.io.IOException;
import java.util.List;
import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.List;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_TarArchiveSparseEntry_Test_Passing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsExtended_nUtT1() throws IOException {
        TarArchiveSparseEntry tarArchiveSparseEntry = new TarArchiveSparseEntry(new byte[0]);
        boolean result = tarArchiveSparseEntry.isExtended();
        assert result == false;
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetSparseHeaders_JwjA0() throws IOException {
        TarArchiveSparseEntry tarArchiveSparseEntry = new TarArchiveSparseEntry(new byte[0]);
        List<TarArchiveStructSparse> sparseHeaders = tarArchiveSparseEntry.getSparseHeaders();
        assertEquals(null, sparseHeaders);
    }
}