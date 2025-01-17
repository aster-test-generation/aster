/**
 * Generated by Aster
 */
package org.apache.commons.compress.archivers.tar;
import java.io.IOException;
import java.util.List;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import java.util.List;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_TarArchiveSparseEntry_Test_Failing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testIsExtended_HKNB0_eDzv0() {
    try {
        TarArchiveSparseEntry entry = new TarArchiveSparseEntry(new byte[0]);
        assertTrue(entry.isExtended());
    } catch (IOException e) {
        e.printStackTrace();
    }
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetSparseHeaders_jkkQ0_tFNz0_2() throws IOException {
    byte[] headerBuf = new byte[1024];
    TarArchiveSparseEntry entry = new TarArchiveSparseEntry(headerBuf);
    List<TarArchiveStructSparse> sparseHeaders = entry.getSparseHeaders();
    TarArchiveStructSparse sparseHeader1 = new TarArchiveStructSparse(10, 10);
    sparseHeaders.add(sparseHeader1);
    TarArchiveStructSparse sparseHeader2 = new TarArchiveStructSparse(20, 20);
    sparseHeaders.add(sparseHeader2);
    sparseHeaders = entry.getSparseHeaders();
    assertTrue(sparseHeaders.isEmpty());}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetSparseHeaders_jkkQ0_tFNz0_4() throws IOException {
    byte[] headerBuf = new byte[1024];
    TarArchiveSparseEntry entry = new TarArchiveSparseEntry(headerBuf);
    List<TarArchiveStructSparse> sparseHeaders = entry.getSparseHeaders();
    TarArchiveStructSparse sparseHeader1 = new TarArchiveStructSparse(10, 10);
    sparseHeaders.add(sparseHeader1);
    TarArchiveStructSparse sparseHeader2 = new TarArchiveStructSparse(20, 20);
    sparseHeaders.add(sparseHeader2);
    sparseHeaders = entry.getSparseHeaders();
    assertEquals(2, sparseHeaders.size());}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetSparseHeaders_jkkQ0_tFNz0_5() throws IOException {
    byte[] headerBuf = new byte[1024];
    TarArchiveSparseEntry entry = new TarArchiveSparseEntry(headerBuf);
    List<TarArchiveStructSparse> sparseHeaders = entry.getSparseHeaders();
    TarArchiveStructSparse sparseHeader1 = new TarArchiveStructSparse(10, 10);
    sparseHeaders.add(sparseHeader1);
    TarArchiveStructSparse sparseHeader2 = new TarArchiveStructSparse(20, 20);
    sparseHeaders.add(sparseHeader2);
    sparseHeaders = entry.getSparseHeaders();
    assertEquals(10, sparseHeaders.get(0).getOffset());}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetSparseHeaders_jkkQ0_tFNz0_6() throws IOException {
    byte[] headerBuf = new byte[1024];
    TarArchiveSparseEntry entry = new TarArchiveSparseEntry(headerBuf);
    List<TarArchiveStructSparse> sparseHeaders = entry.getSparseHeaders();
    TarArchiveStructSparse sparseHeader1 = new TarArchiveStructSparse(10, 10);
    sparseHeaders.add(sparseHeader1);
    TarArchiveStructSparse sparseHeader2 = new TarArchiveStructSparse(20, 20);
    sparseHeaders.add(sparseHeader2);
    sparseHeaders = entry.getSparseHeaders();
    assertEquals(10, sparseHeaders.get(0).getNumbytes());}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetSparseHeaders_jkkQ0_tFNz0_7() throws IOException {
    byte[] headerBuf = new byte[1024];
    TarArchiveSparseEntry entry = new TarArchiveSparseEntry(headerBuf);
    List<TarArchiveStructSparse> sparseHeaders = entry.getSparseHeaders();
    TarArchiveStructSparse sparseHeader1 = new TarArchiveStructSparse(10, 10);
    sparseHeaders.add(sparseHeader1);
    TarArchiveStructSparse sparseHeader2 = new TarArchiveStructSparse(20, 20);
    sparseHeaders.add(sparseHeader2);
    sparseHeaders = entry.getSparseHeaders();
    assertEquals(20, sparseHeaders.get(1).getOffset());}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetSparseHeaders_jkkQ0_tFNz0_8() throws IOException {
    byte[] headerBuf = new byte[1024];
    TarArchiveSparseEntry entry = new TarArchiveSparseEntry(headerBuf);
    List<TarArchiveStructSparse> sparseHeaders = entry.getSparseHeaders();
    TarArchiveStructSparse sparseHeader1 = new TarArchiveStructSparse(10, 10);
    sparseHeaders.add(sparseHeader1);
    TarArchiveStructSparse sparseHeader2 = new TarArchiveStructSparse(20, 20);
    sparseHeaders.add(sparseHeader2);
    sparseHeaders = entry.getSparseHeaders();
    assertEquals(20, sparseHeaders.get(1).getNumbytes());}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testIsExtended_HKNB0_eDzv0_fid1() {
    try {
        TarArchiveSparseEntry entry = new TarArchiveSparseEntry(new byte[1]);
        assertTrue(entry.isExtended());
    } catch (IOException e) {
        e.printStackTrace();
    }
}
}