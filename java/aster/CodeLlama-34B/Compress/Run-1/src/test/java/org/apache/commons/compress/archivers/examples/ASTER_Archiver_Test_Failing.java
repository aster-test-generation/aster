/**
 * Generated by Aster
 */
package org.apache.commons.compress.archivers.examples;
import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.channels.SeekableByteChannel;
import org.apache.commons.compress.archivers.ArchiveException;
import org.apache.commons.compress.archivers.sevenz.SevenZOutputFile;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_Archiver_Test_Failing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testCreate_invalidFormat_validTarget_validDirectory_Dxlg1() throws IOException, ArchiveException {
    Archiver archiver = new Archiver();
    String format = "invalid";
    File target = new File("target.zip");
    File directory = new File("directory");
    try {
        archiver.create(format, target.toPath(), directory.toPath());
        fail("Expected ArchiveException");
    } catch (ArchiveException e) {
        assertEquals("Invalid format: " + format, e.getMessage());
    }
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testCreate_nullFormat_validTarget_validDirectory_cHGD6() throws IOException, ArchiveException {
    Archiver archiver = new Archiver();
    String format = null;
    File target = new File("target.zip");
    File directory = new File("directory");
    try {
        archiver.create(format, target.toPath(), directory.toPath());
        fail("Expected NullPointerException");
    } catch (NullPointerException e) {
        assertEquals("Format cannot be null", e.getMessage());
    }
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testCreateWithNullTarget_FXnD3_zuhM0() throws IOException, ArchiveException {
    Archiver archiver = new Archiver();
    OutputStream target = null;
    File directory = new File("test");
    archiver.create("zip", target, directory);
    assertNull(target);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testCreateWithEmptyFormat_RbeR1_BeAN0() throws IOException, ArchiveException {
    Archiver archiver = new Archiver();
    File target = new File("test");
    File directory = new File("test");
    archiver.create("", target, directory);
    assertEquals(0, target.list().length);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testCreateWithNullFormat_VFUG0_vWhQ1() throws IOException, ArchiveException {
    Archiver archiver = new Archiver();
    File target = new File("test");
    File directory = new File("test");
    archiver.create(null, target, directory);
    assertEquals(0, target.length());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testCreateWithInvalidFormat_undZ2_YUIK0() throws IOException, ArchiveException {
    Archiver archiver = new Archiver();
    File target = new File("test");
    File directory = new File("test");
    archiver.create("invalid", target, directory);
    assertEquals(0, target.length());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testCreate9_QMcN8() throws IOException {
    Archiver archiver = new Archiver();
    SevenZOutputFile target = new SevenZOutputFile(new File("test.7z"));
    File directory = new File("test_dir");
    archiver.create(target, directory);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testCreateWithNullTarget_FcBN4() throws IOException, ArchiveException {
    Archiver archiver = new Archiver();
    String format = "zip";
    SeekableByteChannel target = null;
    File directory = new File("test");
    try {
        archiver.create(format, target, directory);
        fail("Expected NullPointerException");
    } catch (NullPointerException e) {
        assertEquals("Target cannot be null", e.getMessage());
    }
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testCreate_invalidFormat_validTarget_validDirectory_Dxlg1_fid2() throws IOException, ArchiveException {
    Archiver archiver = new Archiver();
    String format = "invalid";
    File target = new File("target.zip");
    File directory = new File("directory");
    try {
        archiver.create(format, target, directory);
        fail("Expected ArchiveException");
    } catch (ArchiveException e) {
        assertEquals("Invalid format: " + format, e.getMessage());
    }
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testCreate_validFormat_invalidTarget_validDirectory_PBmN2_fid2() throws IOException, ArchiveException {
    Archiver archiver = new Archiver();
    String format = "zip";
    File target = new File("target.txt");
    File directory = new File("directory");
    try {
        archiver.create(format, target, directory);
        fail("Expected IOException");
    } catch (IOException e) {
        assertEquals("Invalid target file: " + target.getPath(), e.getMessage());
    }
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testCreate_validFormat_validTarget_invalidDirectory_wSqL3() throws IOException, ArchiveException {
    Archiver archiver = new Archiver();
    String format = "zip";
    File target = new File("target.zip");
    File directory = new File("invalid");
    try {
        archiver.create(format, target, directory);
        fail("Expected IOException");
    } catch (IOException e) {
        assertEquals("Invalid directory: " + directory.getPath(), e.getMessage());
    }
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testCreate_validFormat_validTarget_nullDirectory_ceCZ4() throws IOException, ArchiveException {
    Archiver archiver = new Archiver();
    String format = "zip";
    File target = new File("target.zip");
    File directory = null;
    try {
        archiver.create(format, target, directory);
        fail("Expected NullPointerException");
    } catch (NullPointerException e) {
        assertEquals("Directory cannot be null", e.getMessage());
    }
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testCreate_validFormat_nullTarget_validDirectory_Ibzk5() throws IOException, ArchiveException {
    Archiver archiver = new Archiver();
    String format = "zip";
    File target = null;
    File directory = new File("directory");
    try {
        archiver.create(format, target, directory);
        fail("Expected NullPointerException");
    } catch (NullPointerException e) {
        assertEquals("Target file cannot be null", e.getMessage());
    }
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testCreate_nullFormat_validTarget_validDirectory_cHGD6_fid2() throws IOException, ArchiveException {
    Archiver archiver = new Archiver();
    String format = null;
    File target = new File("target.zip");
    File directory = new File("directory");
    try {
        archiver.create(format, target, directory);
        fail("Expected NullPointerException");
    } catch (NullPointerException e) {
        assertEquals("Format cannot be null", e.getMessage());
    }
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testCreateWithNullTarget_FXnD3_zuhM0_fid2() throws IOException, ArchiveException {
    Archiver archiver = new Archiver();
    OutputStream target = null;
    File directory = new File("test");
    archiver.create("zip", target, directory);
    assertEquals(0, 0);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testCreateWithEmptyFormat_RbeR1_BeAN0_fid2() throws IOException, ArchiveException {
    Archiver archiver = new Archiver();
    File target = new File("test");
    File directory = new File("test");
    archiver.create("", target, directory);
    assertEquals(0, target.length());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testCreateWithEmptyDirectory_VlkC6_wMyb0_fid2() throws IOException, ArchiveException {
    Archiver archiver = new Archiver();
    File target = new File("test.zip");
    File directory = new File("test");
    directory.mkdir();
    archiver.create("zip", target, directory);
    assertEquals(0, target.length());
}
}