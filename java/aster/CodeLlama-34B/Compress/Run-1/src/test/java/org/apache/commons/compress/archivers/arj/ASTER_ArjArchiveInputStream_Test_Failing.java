/**
 * Generated by Aster
 */
package org.apache.commons.compress.archivers.arj;
import java.io.ByteArrayInputStream;
import org.apache.commons.compress.archivers.ArchiveException;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_ArjArchiveInputStream_Test_Failing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testMatches_validSignature_uSKy0() {
    byte[] signature = new byte[] { (byte) 0xff, (byte) 0xff };
    int length = 2;
    assertTrue(ArjArchiveInputStream.matches(signature, length));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testMatches_nullSignature_bDes2() {
    byte[] signature = null;
    int length = 2;
    assertFalse(ArjArchiveInputStream.matches(signature, length));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetArchiveComment_TDVt0() throws ArchiveException {
    ArjArchiveInputStream inputStream = new ArjArchiveInputStream(new ByteArrayInputStream(new byte[0]));
    String comment = inputStream.getArchiveComment();
    assertEquals("", comment);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetArchiveName_Nbtx0() throws ArchiveException {
    ArjArchiveInputStream inputStream = new ArjArchiveInputStream(new ByteArrayInputStream(new byte[0]));
    String archiveName = inputStream.getArchiveName();
    assertEquals("", archiveName);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetArchiveNameWithCharsetName_ijCS1() throws ArchiveException {
    ArjArchiveInputStream inputStream = new ArjArchiveInputStream(new ByteArrayInputStream(new byte[0]), "UTF-8");
    String archiveName = inputStream.getArchiveName();
    assertEquals("", archiveName);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetArchiveNameWithInvalidCharsetName_IXnQ2() throws ArchiveException {
    ArjArchiveInputStream inputStream = new ArjArchiveInputStream(new ByteArrayInputStream(new byte[0]), "invalid_charset");
    String archiveName = inputStream.getArchiveName();
    assertEquals("", archiveName);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetArchiveNameWithNullCharsetName_TGIW3() throws ArchiveException {
    ArjArchiveInputStream inputStream = new ArjArchiveInputStream(new ByteArrayInputStream(new byte[0]), null);
    String archiveName = inputStream.getArchiveName();
    assertEquals("", archiveName);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetArchiveNameWithEmptyCharsetName_wgrQ4() throws ArchiveException {
    ArjArchiveInputStream inputStream = new ArjArchiveInputStream(new ByteArrayInputStream(new byte[0]), "");
    String archiveName = inputStream.getArchiveName();
    assertEquals("", archiveName);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetArchiveNameWithNullInputStream_aAcv5() throws ArchiveException {
    ArjArchiveInputStream inputStream = new ArjArchiveInputStream(null);
    String archiveName = inputStream.getArchiveName();
    assertEquals("", archiveName);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testMatches_nullSignature_bDes2_fid1() {
    byte[] signature = null;
    int length = 2;
    assertNull(ArjArchiveInputStream.matches(signature, length));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetArchiveNameWithInvalidInputStream_MYBq6_fid1() throws ArchiveException {
    ArjArchiveInputStream inputStream = new ArjArchiveInputStream(new ByteArrayInputStream(new byte[0]));
    String archiveName = inputStream.getArchiveName();
    assertNull(archiveName);
}
}