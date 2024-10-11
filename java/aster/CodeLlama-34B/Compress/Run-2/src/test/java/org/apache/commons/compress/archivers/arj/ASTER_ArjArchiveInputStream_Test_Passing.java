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
public class Aster_ArjArchiveInputStream_Test_Passing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testMatches_validSignature_dgSk0() throws Exception {
    byte[] signature = new byte[] { (byte) 0xff, (byte) 0xff };
    int length = 2;
    assertTrue(ArjArchiveInputStream.matches(signature, length));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testMatches_invalidSignature_anEc1() throws Exception {
    byte[] signature = new byte[] { (byte) 0xff, (byte) 0xfe };
    int length = 2;
    assertFalse(ArjArchiveInputStream.matches(signature, length));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testMatches_emptySignature_KGAQ2() throws Exception {
    byte[] signature = new byte[] {};
    int length = 0;
    assertFalse(ArjArchiveInputStream.matches(signature, length));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetArchiveName_biXg0() throws Exception {
    ArjArchiveInputStream inputStream = new ArjArchiveInputStream(new ByteArrayInputStream(new byte[0]));
    String archiveName = inputStream.getArchiveName();
    assertEquals("", archiveName);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetArchiveNameWithCharsetName_DrSp1() throws Exception {
    ArjArchiveInputStream inputStream = new ArjArchiveInputStream(new ByteArrayInputStream(new byte[0]), "UTF-8");
    String archiveName = inputStream.getArchiveName();
    assertEquals("", archiveName);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetArchiveNameWithInvalidCharsetName_QxES2() throws Exception {
    ArjArchiveInputStream inputStream = new ArjArchiveInputStream(new ByteArrayInputStream(new byte[0]), "invalid_charset");
    String archiveName = inputStream.getArchiveName();
    assertEquals("", archiveName);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetArchiveNameWithNullCharsetName_pKmd3() throws Exception {
    ArjArchiveInputStream inputStream = new ArjArchiveInputStream(new ByteArrayInputStream(new byte[0]), null);
    String archiveName = inputStream.getArchiveName();
    assertEquals("", archiveName);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetArchiveNameWithEmptyCharsetName_gyJX4() throws Exception {
    ArjArchiveInputStream inputStream = new ArjArchiveInputStream(new ByteArrayInputStream(new byte[0]), "");
    String archiveName = inputStream.getArchiveName();
    assertEquals("", archiveName);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetArchiveNameWithNullInputStream_oGbH5() throws Exception {
    ArjArchiveInputStream inputStream = new ArjArchiveInputStream(null);
    String archiveName = inputStream.getArchiveName();
    assertEquals("", archiveName);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetArchiveNameWithNullInputStreamAndCharsetName_icSR7() throws Exception {
    ArjArchiveInputStream inputStream = new ArjArchiveInputStream(null, "UTF-8");
    String archiveName = inputStream.getArchiveName();
    assertEquals("", archiveName);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetArchiveNameWithNullInputStreamAndInvalidCharsetName_kzyd9() throws Exception {
    ArjArchiveInputStream inputStream = new ArjArchiveInputStream(null, "invalid_charset");
    String archiveName = inputStream.getArchiveName();
    assertEquals("", archiveName);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetArchiveNameWithNullInputStreamAndNullCharsetName_nuoZ10() throws Exception {
    ArjArchiveInputStream inputStream = new ArjArchiveInputStream(null, null);
    String archiveName = inputStream.getArchiveName();
    assertEquals("", archiveName);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetArchiveNameWithNullInputStreamAndEmptyCharsetName_nnKa11() throws Exception {
    ArjArchiveInputStream inputStream = new ArjArchiveInputStream(null, "");
    String archiveName = inputStream.getArchiveName();
    assertEquals("", archiveName);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetArchiveComment_bBTJ0() throws ArchiveException {
    ArjArchiveInputStream inputStream = new ArjArchiveInputStream(new ByteArrayInputStream(new byte[0]));
    String comment = inputStream.getArchiveComment();
    assertEquals("", comment);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetArchiveCommentWithCharsetName_moPp1() throws ArchiveException {
    ArjArchiveInputStream inputStream = new ArjArchiveInputStream(new ByteArrayInputStream(new byte[0]), "UTF-8");
    String comment = inputStream.getArchiveComment();
    assertEquals("", comment);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetArchiveCommentWithInvalidCharsetName_zEkI2() throws ArchiveException {
    ArjArchiveInputStream inputStream = new ArjArchiveInputStream(new ByteArrayInputStream(new byte[0]), "invalid_charset");
    String comment = inputStream.getArchiveComment();
    assertEquals("", comment);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetArchiveCommentWithNullCharsetName_RhdZ3() throws ArchiveException {
    ArjArchiveInputStream inputStream = new ArjArchiveInputStream(new ByteArrayInputStream(new byte[0]), null);
    String comment = inputStream.getArchiveComment();
    assertEquals("", comment);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetArchiveCommentWithEmptyCharsetName_halG4() throws ArchiveException {
    ArjArchiveInputStream inputStream = new ArjArchiveInputStream(new ByteArrayInputStream(new byte[0]), "");
    String comment = inputStream.getArchiveComment();
    assertEquals("", comment);
}
}