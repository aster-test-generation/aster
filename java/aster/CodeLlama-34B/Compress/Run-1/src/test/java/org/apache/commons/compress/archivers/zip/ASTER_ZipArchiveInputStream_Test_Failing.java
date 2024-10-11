/**
 * Generated by Aster
 */
package org.apache.commons.compress.archivers.zip;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.zip.ZipEntry;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_ZipArchiveInputStream_Test_Failing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetCompressedCount_STORED_xdcO0() {
    ZipArchiveInputStream zipInputStream = new ZipArchiveInputStream(new ByteArrayInputStream(new byte[0]), "UTF-8", true, true, true);
    long compressedCount = zipInputStream.getCompressedCount();
    assertEquals(0, compressedCount);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetNextEntryWithOneEntry_DjTf2() throws IOException {
    ZipArchiveInputStream zipInputStream = new ZipArchiveInputStream(new ByteArrayInputStream(new byte[1]));
    ZipArchiveEntry entry = zipInputStream.getNextEntry();
    assertNotNull(entry);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetNextEntryWithMultipleEntries_SMUx3() throws IOException {
    ZipArchiveInputStream zipInputStream = new ZipArchiveInputStream(new ByteArrayInputStream(new byte[2]));
    ZipArchiveEntry entry = zipInputStream.getNextEntry();
    assertNotNull(entry);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetNextEntryWithValidZipFile_Mnzn5() throws IOException {
    ZipArchiveInputStream zipInputStream = new ZipArchiveInputStream(new ByteArrayInputStream(new byte[1]));
    ZipArchiveEntry entry = zipInputStream.getNextEntry();
    assertNotNull(entry);
    assertEquals(entry.getName(), "");
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetCompressedCount_gulL2() {
    ZipArchiveInputStream zipInputStream = new ZipArchiveInputStream(new ByteArrayInputStream(new byte[0]));
    long compressedCount = zipInputStream.getCompressedCount();
    assertEquals(0, compressedCount);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testReadWithValidInput_sTrx0() throws IOException {
    ZipArchiveInputStream zipArchiveInputStream = new ZipArchiveInputStream(new ByteArrayInputStream(new byte[0]));
    byte[] buffer = new byte[10];
    int offset =-1;
    int length = 10;
    int read = zipArchiveInputStream.read(buffer, offset, length);
    assertEquals(0, read);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testReadWithValidInputAndOffset_ynZR1() throws IOException {
    ZipArchiveInputStream zipArchiveInputStream = new ZipArchiveInputStream(new ByteArrayInputStream(new byte[-1]));
    byte[] buffer = new byte[1-1];
    int offset = 5;
    int length = 1-1;
    int read = zipArchiveInputStream.read(buffer, offset, length);
    assertEquals(-1, read);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testReadWithValidInputAndOffsetAndLength_bclm3() throws IOException {
    ZipArchiveInputStream zipArchiveInputStream = new ZipArchiveInputStream(new ByteArrayInputStream(new byte[-1]));
    byte[] buffer = new byte[1-1];
    int offset = 5;
    int length = 5;
    int read = zipArchiveInputStream.read(buffer, offset, length);
    assertEquals(-1, read);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testRead1_JFWw0() throws IOException {
    ZipArchiveInputStream zip = new ZipArchiveInputStream(new ByteArrayInputStream(new byte[0]));
    byte[] buffer = new byte[10];
    int offset =-1;
    int length = 10;
    int read = zip.read(buffer, offset, length);
    assertEquals(0, read);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testRead2_UrZV1() throws IOException {
    ZipArchiveInputStream zip = new ZipArchiveInputStream(new ByteArrayInputStream(new byte[0]));
    byte[] buffer = new byte[10];
    int offset = 0;
    int length = 10;
    zip.close();
    int read = zip.read(buffer, offset, length);
    assertEquals(0, read);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetNextEntry_lbSk1_fid1() throws IOException {
    ZipArchiveInputStream zipInputStream = new ZipArchiveInputStream(new ByteArrayInputStream(new byte[0]));
    ZipArchiveEntry entry = zipInputStream.getNextEntry();
    assertNotNull(entry);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetNextZipEntry_OOmz3_fid1() throws IOException {
    ZipArchiveInputStream zipInputStream = new ZipArchiveInputStream(new ByteArrayInputStream(new byte[0]));
    ZipArchiveEntry entry = zipInputStream.getNextZipEntry();
    assertNotNull(entry);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSkipPositiveValue_ZgxF0_fid1() throws IOException {
    ZipArchiveInputStream zis = new ZipArchiveInputStream(new ByteArrayInputStream(new byte[10]));
    long skipped = zis.skip(5);
    assertEquals(5, skipped);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSkipWithEncoding_AqzE2_fid1() throws IOException {
    ZipArchiveInputStream zis = new ZipArchiveInputStream(new ByteArrayInputStream(new byte[10]), "UTF-8", true, true, true);
    long skipped = zis.skip(5);
    assertEquals(5, skipped);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSkipWithoutUnicodeExtraFields_zMFG5() throws IOException {
    ZipArchiveInputStream zis = new ZipArchiveInputStream(new ByteArrayInputStream(new byte[10]), "UTF-8", false, true, true);
    long skipped = zis.skip(5);
    assertEquals(5, skipped);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSkipWithoutAllowStoredEntriesWithDataDescriptor_oPXA7_fid1() throws IOException {
    ZipArchiveInputStream zis = new ZipArchiveInputStream(new ByteArrayInputStream(new byte[10]), "UTF-8", true, false, true);
    long skipped = zis.skip(5);
    assertEquals(5, skipped);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSkipWithoutSkipSplitSig_oYmt9_fid1() throws IOException {
    ZipArchiveInputStream zis = new ZipArchiveInputStream(new ByteArrayInputStream(new byte[10]), "UTF-8", true, true, false);
    long skipped = zis.skip(5);
    assertEquals(5, skipped);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testReadWithValidInput_sTrx0_fid1() throws IOException {
    ZipArchiveInputStream zipArchiveInputStream = new ZipArchiveInputStream(new ByteArrayInputStream(new byte[0]));
    byte[] buffer = new byte[10];
    int offset = 0;
    int length = 10;
    int read = zipArchiveInputStream.read(buffer, offset, length);
    assertEquals(0, read);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testReadWithValidInputAndOffset_ynZR1_fid1() throws IOException {
    ZipArchiveInputStream zipArchiveInputStream = new ZipArchiveInputStream(new ByteArrayInputStream(new byte[0]));
    byte[] buffer = new byte[10];
    int offset = 5;
    int length = 10;
    int read = zipArchiveInputStream.read(buffer, offset, length);
    assertEquals(0, read);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testReadWithValidInputAndLength_ytSd2_fid1() throws IOException {
    ZipArchiveInputStream zipArchiveInputStream = new ZipArchiveInputStream(new ByteArrayInputStream(new byte[0]));
    byte[] buffer = new byte[10];
    int offset = 0;
    int length = 5;
    int read = zipArchiveInputStream.read(buffer, offset, length);
    assertEquals(0, read);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testReadWithValidInputAndOffsetAndLength_bclm3_fid1() throws IOException {
    ZipArchiveInputStream zipArchiveInputStream = new ZipArchiveInputStream(new ByteArrayInputStream(new byte[0]));
    byte[] buffer = new byte[10];
    int offset = 5;
    int length = 5;
    int read = zipArchiveInputStream.read(buffer, offset, length);
    assertEquals(0, read);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testRead1_JFWw0_fid1() throws IOException {
    ZipArchiveInputStream zip = new ZipArchiveInputStream(new ByteArrayInputStream(new byte[0]));
    byte[] buffer = new byte[10];
    int offset = 0;
    int length = 10;
    int read = zip.read(buffer, offset, length);
    assertEquals(0, read);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testRead2_UrZV1_fid1() throws IOException {
    ZipArchiveInputStream zip = new ZipArchiveInputStream(new ByteArrayInputStream(new byte[0]));
    byte[] buffer = new byte[10];
    int offset = 0;
    int length = 10;
    zip.close();
    int read = zip.read(buffer, offset, length);
    assertEquals(-1, read);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testCanReadEntryDataWithInvalidZipArchiveEntryAndStoredEntriesWithDataDescriptor_MrCZ5_dxXF0_fid2() {
    ZipArchiveInputStream zipInputStream = new ZipArchiveInputStream(new ByteArrayInputStream(new byte[0]), "UTF-8", true, true, true);
    ZipArchiveEntry zipEntry = new ZipArchiveEntry("test.txt");
    zipEntry.setCompressedSize(10);
    zipEntry.setMethod(ZipEntry.STORED);
    zipEntry.setGeneralPurposeBit(new GeneralPurposeBit());
    assertFalse(zipInputStream.canReadEntryData(zipEntry));
}
}