/**
 * Generated by Aster
 */
package org.apache.commons.compress.archivers.ar;
import java.io.File;
import java.io.IOException;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.util.Date;
import static org.junit.jupiter.api.Assertions.*;
import java.util.Date;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_ArArchiveEntry_Test_Failing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testEquals_DifferentObject_Rizz1() {
    ArArchiveEntry entry1 = new ArArchiveEntry("file.txt", 100);
    ArArchiveEntry entry2 = new ArArchiveEntry("file.txt", 100);
    assertFalse(entry1.equals(entry2));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testEquals_DifferentLength_fzUz4() {
    ArArchiveEntry entry1 = new ArArchiveEntry("file.txt", 100);
    ArArchiveEntry entry2 = new ArArchiveEntry("file.txt", 200);
    assertFalse(entry1.equals(entry2));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testEquals_DifferentUserId_yJaz5() {
    ArArchiveEntry entry1 = new ArArchiveEntry("file.txt", 100, 1, 1, 1, 1);
    ArArchiveEntry entry2 = new ArArchiveEntry("file.txt", 100, 2, 1, 1, 1);
    assertFalse(entry1.equals(entry2));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testEquals_DifferentGroupId_ppdx6() {
    ArArchiveEntry entry1 = new ArArchiveEntry("file.txt", 100, 1, 1, 1, 1);
    ArArchiveEntry entry2 = new ArArchiveEntry("file.txt", 100, 1, 2, 1, 1);
    assertFalse(entry1.equals(entry2));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testEquals_DifferentMode_Uybp7() {
    ArArchiveEntry entry1 = new ArArchiveEntry("file.txt", 100, 1, 1, 1, 1);
    ArArchiveEntry entry2 = new ArArchiveEntry("file.txt", 100, 1, 1, 2, 1);
    assertFalse(entry1.equals(entry2));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testEquals_DifferentLastModified_yZhS8() {
    ArArchiveEntry entry1 = new ArArchiveEntry("file.txt", 100, 1, 1, 1, 1);
    ArArchiveEntry entry2 = new ArArchiveEntry("file.txt", 100, 1, 1, 1, 2);
    assertFalse(entry1.equals(entry2));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testIsDirectory_NegativeLength_Anng7() {
    ArArchiveEntry entry = new ArArchiveEntry("test", -1);
    assertFalse(entry.isDirectory());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testIsDirectory_NullPath_zMcJ8() throws IOException {
    Path inputPath = null;
    ArArchiveEntry entry = new ArArchiveEntry(inputPath, "test", LinkOption.NOFOLLOW_LINKS);
    assertFalse(entry.isDirectory());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testIsDirectory_NullFile_Eolt9() {
    File inputFile = null;
    ArArchiveEntry entry = new ArArchiveEntry(inputFile, "test");
    assertFalse(entry.isDirectory());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testIsDirectory_NullEntry_ctjN10() {
    ArArchiveEntry entry = null;
    assertFalse(entry.isDirectory());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testGetLastModifiedDate_QHYs0() {
		ArArchiveEntry entry = new ArArchiveEntry("test.txt", 1000);
		Date expected = new Date(1000 * 1000);
		Date actual = entry.getLastModifiedDate();
		assertEquals(expected, actual);
	}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testGetLastModifiedDateWithInvalidInput_BBBZ1() {
		ArArchiveEntry entry = new ArArchiveEntry("test.txt", -1);
		Date expected = new Date(0);
		Date actual = entry.getLastModifiedDate();
		assertEquals(expected, actual);
	}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testGetLastModifiedDateWithNullInput_HPxT2() {
		ArArchiveEntry entry = new ArArchiveEntry(null, 1000);
		Date expected = new Date(0);
		Date actual = entry.getLastModifiedDate();
		assertEquals(expected, actual);
	}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testGetLastModifiedDateWithEmptyInput_AmBA3() {
		ArArchiveEntry entry = new ArArchiveEntry("", 1000);
		Date expected = new Date(0);
		Date actual = entry.getLastModifiedDate();
		assertEquals(expected, actual);
	}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetNameWithInvalidName_sJKc1() {
    ArArchiveEntry entry = new ArArchiveEntry("test.txt", 100L);
    assertNotEquals("test.txt", entry.getName());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetLastModified_NyFX0() {
    ArArchiveEntry entry = new ArArchiveEntry("test.txt", 100);
    assertEquals(100, entry.getLastModified());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testIsDirectory_NullEntry_ctjN10_fid1() {
    ArArchiveEntry entry = null;
    assertNull(entry.getLastModified());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetLastModifiedDateWithInvalidInput_BBBZ1_fid1() {
    ArArchiveEntry entry = new ArArchiveEntry("test.txt", 0);
    Date expected = new Date(0);
    Date actual = entry.getLastModifiedDate();
    assertEquals(expected, actual);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetLastModifiedDateWithEmptyInput_AmBA3_fid1() {
    ArArchiveEntry entry = new ArArchiveEntry("", 1000);
    Date expected = new Date(0);
    Date actual = entry.getLastModifiedDate();
    assertEquals(expected.getTime(), actual.getTime());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetNameWithInvalidName_sJKc1_fid1() {
    ArArchiveEntry entry = new ArArchiveEntry("not equal", 100L);
    assertNotEquals("not equal", entry.getName());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetLastModified_NyFX0_fid1() {
    ArArchiveEntry entry = new ArArchiveEntry("test.txt",1720902163);
    assertEquals(100, entry.getLastModified());
}
}