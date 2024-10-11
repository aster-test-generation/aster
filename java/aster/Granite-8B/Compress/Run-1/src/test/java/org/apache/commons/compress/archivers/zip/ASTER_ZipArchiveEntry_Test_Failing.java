/**
 * Generated by Aster
 */
package org.apache.commons.compress.archivers.zip;
import java.io.File;
import java.io.IOException;
import java.nio.file.attribute.FileTime;
import java.util.zip.ZipEntry;
import java.util.zip.ZipException;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_ZipArchiveEntry_Test_Failing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetVersionRequired2_XRRB2() throws IOException {
        ZipArchiveEntry zipArchiveEntry = new ZipArchiveEntry(new java.util.zip.ZipEntry(""));
        int versionRequired = zipArchiveEntry.getVersionRequired();
        assertEquals(0, versionRequired);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEqualsWithDifferentObject_hOem3() {
        ZipArchiveEntry entry1 = new ZipArchiveEntry();
        ZipArchiveEntry entry2 = new ZipArchiveEntry();
        boolean result = entry1.equals(entry2);
        assertFalse(result);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testRemoveUnparseableExtraFieldData1_Famh0() {
        ZipArchiveEntry zipArchiveEntry = new ZipArchiveEntry();
        zipArchiveEntry.removeUnparseableExtraFieldData();
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testgetRawFlag5_FOpI4() {
        ZipArchiveEntry zipArchiveEntry = new ZipArchiveEntry((File) null, "");
        int rawFlag = zipArchiveEntry.getRawFlag();
        assertEquals(0, rawFlag);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSetCreationTime_GkIC0_1() {
    ZipArchiveEntry zipArchiveEntry = new ZipArchiveEntry();
    zipArchiveEntry.setCreationTime(FileTime.fromMillis(0L));
    zipArchiveEntry.setCreationTime(FileTime.fromMillis(1L));
    assertEquals(0L, zipArchiveEntry.getCreationTime().toMillis());}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetCreationTimeWithJavaZipEntry_fOgu2() throws ZipException {
        ZipArchiveEntry entry = new ZipArchiveEntry(new java.util.zip.ZipEntry(""));
        FileTime time = FileTime.fromMillis(0);
        entry.setCreationTime(time);
        assertEquals(time, entry.getCreationTime());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetCreationTimeWithNull_RCTz1() {
        ZipArchiveEntry entry = new ZipArchiveEntry("name");
        entry.setCreationTime(null);
        assertNull(entry.getCreationTime());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetExtraWithNull_XQfC3() {
        ZipArchiveEntry zipArchiveEntry = new ZipArchiveEntry();
        zipArchiveEntry.setExtra(null);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetExtraFieldsWithUnparseableField_OFom2_1() {
        ZipArchiveEntry entry = new ZipArchiveEntry("name");
        UnparseableExtraFieldData field = new UnparseableExtraFieldData();
        entry.setExtraFields(new ZipExtraField[]{field});
        assertEquals(1, entry.getExtraFields().length);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetExtraFieldsWithUnparseableField_OFom2_2() {
        ZipArchiveEntry entry = new ZipArchiveEntry("name");
        UnparseableExtraFieldData field = new UnparseableExtraFieldData();
        entry.setExtraFields(new ZipExtraField[]{field});
        assertTrue(entry.getExtraFields()[0] instanceof UnparseableExtraFieldData);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetExtraFieldsWithNullField_DiGH3_1() {
        ZipArchiveEntry entry = new ZipArchiveEntry("name");
        ZipExtraField field = null;
        ZipExtraField[] fields = new ZipExtraField[]{field};
        IllegalArgumentException e = assertThrows(IllegalArgumentException.class, () -> entry.setExtraFields(fields));}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSetNameWithNull_lvus1() {
    ZipArchiveEntry entry = new ZipArchiveEntry();
    entry.setName(null);
    assertEquals(null, entry.getName());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testUnparseableExtraFieldData_niGn0() {
        ZipArchiveEntry zipArchiveEntry = new ZipArchiveEntry();
        UnparseableExtraFieldData unparseableExtraFieldData = zipArchiveEntry.getUnparseableExtraFieldData();
        assertNotNull(unparseableExtraFieldData);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testgetLocalHeaderOffset_GRZj0() {
        ZipArchiveEntry entry = new ZipArchiveEntry();
        long offset = entry.getLocalHeaderOffset();
        assertEquals(0, offset);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testgetLocalHeaderOffsetWithString_jQmY3() {
        String name = "entryName";
        ZipArchiveEntry entry = new ZipArchiveEntry(name);
        long offset = entry.getLocalHeaderOffset();
        assertEquals(0, offset);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testgetLocalHeaderOffsetWithFile_cPmq4() {
        File inputFile = new File("file");
        String entryName = "entryName";
        ZipArchiveEntry entry = new ZipArchiveEntry(inputFile, entryName);
        long offset = entry.getLocalHeaderOffset();
        assertEquals(0, offset);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetCentralDirectoryExtra_PUMY0_2() {
        ZipArchiveEntry entry = new ZipArchiveEntry(new File("input.txt"), "entryName");
        byte[] b = new byte[10];
        entry.setCentralDirectoryExtra(b);
        assertEquals(10, entry.getCentralDirectoryExtra().length);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetCentralDirectoryExtra_rknK0() {
        ZipArchiveEntry entry = new ZipArchiveEntry();
        byte[] b = new byte[10];
        entry.setCentralDirectoryExtra(b);
        assertEquals(b, entry.getCentralDirectoryExtra());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetCentralDirectoryExtraWithNull_DyqX1() {
        ZipArchiveEntry entry = new ZipArchiveEntry();
        entry.setCentralDirectoryExtra(null);
        assertNull(entry.getCentralDirectoryExtra());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetMethod_ZtrE0() {
        ZipArchiveEntry zipArchiveEntry = new ZipArchiveEntry();
        int actualMethod = zipArchiveEntry.getMethod();
        assertEquals(0, actualMethod);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetMethodWithEntry_jtsD1() throws ZipException {
        ZipArchiveEntry zipArchiveEntry = new ZipArchiveEntry(new ZipArchiveEntry());
        int actualMethod = zipArchiveEntry.getMethod();
        assertEquals(0, actualMethod);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetMethodWithZipEntry_QTEE3() throws ZipException {
        ZipArchiveEntry zipArchiveEntry = new ZipArchiveEntry(new java.util.zip.ZipEntry(""));
        int actualMethod = zipArchiveEntry.getMethod();
        assertEquals(0, actualMethod);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetMethodWithEntryName_AVSw4() {
        ZipArchiveEntry zipArchiveEntry = new ZipArchiveEntry("");
        int actualMethod = zipArchiveEntry.getMethod();
        assertEquals(0, actualMethod);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetMethodWithFileAndEntryName_kfNq5() {
        ZipArchiveEntry zipArchiveEntry = new ZipArchiveEntry(new File(""), "");
        int actualMethod = zipArchiveEntry.getMethod();
        assertEquals(0, actualMethod);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testZipShortByteArrayInt_WHtX0() {
		ZipShort zipShort = new ZipShort(new byte[10], 5);
		assertEquals(5, zipShort.getValue());
	}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testToString_wPaS5() {
		ZipShort zipShort = new ZipShort(10);
		assertEquals("10", zipShort.toString());
	}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testZipArchiveEntryZipArchiveEntry_Vcya15() throws ZipException {
		ZipArchiveEntry entry1 = new ZipArchiveEntry(new ZipArchiveEntry());
		ZipArchiveEntry entry2 = new ZipArchiveEntry(entry1);
		assertEquals(entry1.getName(), entry2.getName());
	}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetLastModifiedTimeWithNullFileTime_QoIa1() {
        ZipArchiveEntry entry = new ZipArchiveEntry(new File("input.txt"), "entryName");
        entry.setLastModifiedTime(null);
        assertEquals(null, entry.getLastModifiedTime());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSetLastModifiedTimeWithNull_jLex1() {
    ZipArchiveEntry zipArchiveEntry = new ZipArchiveEntry("name");
    zipArchiveEntry.setLastModifiedTime(null);
    assertEquals(null, zipArchiveEntry.getLastModifiedTime());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetLastModifiedTimeWithNull_IwSX1() {
        ZipArchiveEntry entry = new ZipArchiveEntry("name");
        entry.setLastModifiedTime(null);
        assertEquals(null, entry.getLastModifiedTime());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetLastModifiedTimeWithNegativeMillis_rvRf2() {
        ZipArchiveEntry entry = new ZipArchiveEntry("name");
        FileTime fileTime = FileTime.fromMillis(-1L);
        entry.setLastModifiedTime(fileTime);
        assertEquals(null, entry.getLastModifiedTime());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetLastModifiedTimeWithLargeMillis_HTPt3() {
        ZipArchiveEntry entry = new ZipArchiveEntry("name");
        FileTime fileTime = FileTime.fromMillis(Long.MAX_VALUE);
        entry.setLastModifiedTime(fileTime);
        assertEquals(null, entry.getLastModifiedTime());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSetLastAccessTime_eeHP0_2() {
    ZipArchiveEntry entry = new ZipArchiveEntry();
    FileTime fileTime = FileTime.fromMillis(System.currentTimeMillis());
    entry.setLastAccessTime(fileTime);
    assertEquals(fileTime, entry.getLastModifiedTime());}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSetLastAccessTime_eeHP0_3() {
    ZipArchiveEntry entry = new ZipArchiveEntry();
    FileTime fileTime = FileTime.fromMillis(System.currentTimeMillis());
    entry.setLastAccessTime(fileTime);
    assertEquals(fileTime, entry.getCreationTime());}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetLastAccessTimeWithEntry_cqjv2() throws ZipException {
        ZipArchiveEntry entry = new ZipArchiveEntry(new java.util.zip.ZipEntry("entryName"));
        FileTime fileTime = FileTime.fromMillis(1234567890L);
        entry.setLastAccessTime(fileTime);
        assertEquals(fileTime, entry.getLastAccessTime());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetLastAccessTimeWithNull_PxAE1() {
        ZipArchiveEntry entry = new ZipArchiveEntry("name");
        entry.setLastAccessTime(null);
        assertEquals(null, entry.getLastAccessTime());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetLastAccessTimeWithInvalidFileTime_RBwG2() {
        ZipArchiveEntry entry = new ZipArchiveEntry("name");
        FileTime fileTime = FileTime.fromMillis(-1);
        entry.setLastAccessTime(fileTime);
        assertEquals(null, entry.getLastAccessTime());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetLastAccessTimeWithZeroMillis_SUbS4() {
        ZipArchiveEntry entry = new ZipArchiveEntry("name");
        FileTime fileTime = FileTime.fromMillis(0);
        entry.setLastAccessTime(fileTime);
        assertEquals(null, entry.getLastAccessTime());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetLastAccessTimeWithLargeMillis_MVQq6() {
        ZipArchiveEntry entry = new ZipArchiveEntry("name");
        FileTime fileTime = FileTime.fromMillis(Long.MAX_VALUE);
        entry.setLastAccessTime(fileTime);
        assertEquals(fileTime, entry.getLastAccessTime());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetLastAccessTimeWithLargeNegativeMillis_jEKO7() {
        ZipArchiveEntry entry = new ZipArchiveEntry("name");
        FileTime fileTime = FileTime.fromMillis(Long.MIN_VALUE);
        entry.setLastAccessTime(fileTime);
        assertEquals(null, entry.getLastAccessTime());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetLastAccessTimeWithNull_SaWy1() {
        ZipArchiveEntry zipArchiveEntry = new ZipArchiveEntry("name");
        zipArchiveEntry.setLastAccessTime(null);
        assertNull(zipArchiveEntry.getLastAccessTime());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetLastAccessTimeWithMillisOverflow_yNzz5() {
        ZipArchiveEntry zipArchiveEntry = new ZipArchiveEntry("name");
        FileTime fileTime = FileTime.fromMillis(Long.MAX_VALUE);
        zipArchiveEntry.setLastAccessTime(fileTime);
        assertEquals(fileTime, zipArchiveEntry.getLastAccessTime());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetLastAccessTimeWithMillisUnderflow_jwxR6() {
        ZipArchiveEntry zipArchiveEntry = new ZipArchiveEntry("name");
        FileTime fileTime = FileTime.fromMillis(Long.MIN_VALUE);
        zipArchiveEntry.setLastAccessTime(fileTime);
        assertEquals(fileTime, zipArchiveEntry.getLastAccessTime());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetLastAccessTimeWithJavaZipEntry_ZUcE4() throws IOException {
        ZipArchiveEntry entry = new ZipArchiveEntry(new java.util.zip.ZipEntry("name"));
        FileTime fileTime = FileTime.fromMillis(0);
        entry.setLastAccessTime(fileTime);
        assertEquals(fileTime, entry.getLastAccessTime());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testNonNullExtra_dwJj1_2() {
        ZipArchiveEntry entry = new ZipArchiveEntry();
        byte[] extra = new byte[10];
        entry.setExtra(extra);
        byte[] result = entry.getLocalFileDataExtra();
        assertTrue(result.length == 10);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsDirectory_bcmU0_1() {
        ZipArchiveEntry entry = new ZipArchiveEntry("test.txt");
        entry = new ZipArchiveEntry("test/");
        assertFalse(entry.isDirectory());}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testConstructor1_PQiR0() throws ZipException {
        ZipArchiveEntry entry = new ZipArchiveEntry(new ZipArchiveEntry());
        byte[] rawName = entry.getRawName();
        assertNotNull(rawName);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testConstructor4_EHwO3() throws ZipException {
        ZipArchiveEntry entry = new ZipArchiveEntry(new java.util.zip.ZipEntry("entryName"));
        byte[] rawName = entry.getRawName();
        assertNotNull(rawName);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testConstructor5_GLfC4() {
        ZipArchiveEntry entry = new ZipArchiveEntry("name");
        byte[] rawName = entry.getRawName();
        assertNotNull(rawName);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testConstructor6_sXOy5() {
        ZipArchiveEntry entry = new ZipArchiveEntry(new File("inputFile"), "entryName");
        byte[] rawName = entry.getRawName();
        assertNotNull(rawName);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testRemoveExtraField_PSeW0() {
    ZipArchiveEntry zipArchiveEntry = new ZipArchiveEntry();
    zipArchiveEntry.removeExtraField(new ZipShort(1));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testRemoveExtraField2_HxqB1() {
    ZipArchiveEntry zipArchiveEntry = new ZipArchiveEntry();
    zipArchiveEntry.removeExtraField(new ZipShort(2));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetTimeWithZipArchiveEntry_JpGT0() throws ZipException {
        ZipArchiveEntry zipArchiveEntry = new ZipArchiveEntry(new ZipArchiveEntry());
        zipArchiveEntry.setTime(1234567890L);
        assertEquals(1234567890L, zipArchiveEntry.getTime());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetTimeWithZipEntry_waGV2() throws ZipException {
        ZipArchiveEntry zipArchiveEntry = new ZipArchiveEntry(new java.util.zip.ZipEntry("entryName"));
        zipArchiveEntry.setTime(1234567890L);
        assertEquals(1234567890L, zipArchiveEntry.getTime());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetTime_Gbly0_1() {
        ZipArchiveEntry entry = new ZipArchiveEntry("test.txt");
        entry.setTime(1234567890L);
        entry.setTime(ZipUtil.dosToJavaTime(1234567890L));
        assertEquals(1234567890L, entry.getTime());}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetTime_Gbly0_2() {
        ZipArchiveEntry entry = new ZipArchiveEntry("test.txt");
        entry.setTime(1234567890L);
        entry.setTime(ZipUtil.dosToJavaTime(1234567890L));
        assertTrue(entry.getLastModifiedDate() == null);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetTimeWithNullEntry_dwmW1() {
        try {
            ZipArchiveEntry entry = null;
            entry.setTime(1234567890L);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
        }
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetTimeWithNegativeTime_UqtQ2() {
        ZipArchiveEntry entry = new ZipArchiveEntry("test.txt");
        try {
            entry.setTime(-1L);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
        }
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetTimeWithInvalidTime_IWga3() {
        ZipArchiveEntry entry = new ZipArchiveEntry("test.txt");
        try {
            entry.setTime(Long.MAX_VALUE);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
        }
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetTimeWithInvalidTime2_HUzD4() {
        ZipArchiveEntry entry = new ZipArchiveEntry("test.txt");
        try {
            entry.setTime(Long.MIN_VALUE);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
        }
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetTimeWithZipArchiveEntry_DeVV0() throws ZipException {
        ZipArchiveEntry entry = new ZipArchiveEntry(new ZipArchiveEntry());
        entry.setTime(1234567890L);
        assertEquals(1234567890L, entry.getTime());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetTimeWithZipEntry_FyoR2() throws ZipException {
        ZipArchiveEntry entry = new ZipArchiveEntry(new java.util.zip.ZipEntry("entryName"));
        entry.setTime(1234567890L);
        assertEquals(1234567890L, entry.getTime());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetTime_GoHH0_3() {
        ZipArchiveEntry entry = new ZipArchiveEntry(new File("input.txt"), "entryName");
        entry.setTime(1234567890L);
        assertEquals(FileTime.fromMillis(0L), entry.getLastAccessTime());}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetTime_GoHH0_4() {
        ZipArchiveEntry entry = new ZipArchiveEntry(new File("input.txt"), "entryName");
        entry.setTime(1234567890L);
        assertEquals(FileTime.fromMillis(0L), entry.getCreationTime());}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAddExtraFieldWithUnparseableExtraFieldData_VMqi1_2() {
        ZipArchiveEntry entry = new ZipArchiveEntry();
        UnparseableExtraFieldData ze = new UnparseableExtraFieldData();
        entry.addExtraField(ze);
        assertEquals(1, entry.getExtraFields().length);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAddExtraFieldWithUnparseableExtraFieldData_VMqi1_3() {
        ZipArchiveEntry entry = new ZipArchiveEntry();
        UnparseableExtraFieldData ze = new UnparseableExtraFieldData();
        entry.addExtraField(ze);
        assertEquals(ze, entry.getExtraFields()[0]);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testConstructor1_axhL0() throws ZipException {
        ZipArchiveEntry entry = new ZipArchiveEntry(new ZipArchiveEntry());
        assertNotNull(entry);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testConstructor4_Zzrz3() throws ZipException {
        ZipArchiveEntry entry = new ZipArchiveEntry(new java.util.zip.ZipEntry(""));
        assertNotNull(entry);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void getDataOffsetTest_jftv0() {
        ZipArchiveEntry entry = new ZipArchiveEntry();
        long dataOffset = entry.getDataOffset();
        assertEquals(0, dataOffset);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetSize_vORn0() {
        ZipArchiveEntry zipArchiveEntry = new ZipArchiveEntry();
        long size = zipArchiveEntry.getSize();
        assertEquals(0, size);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetLastModifiedTimeWithNegativeNanos_gups6_OHsM0() {
        ZipArchiveEntry entry = new ZipArchiveEntry("name");
        FileTime fileTime = FileTime.fromMillis(0L);
        entry.setLastModifiedTime(fileTime);
        assertEquals(null, entry.getLastModifiedTime());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testHashCodeWithDifferentEntryZipArchiveEntry_yuNV8_IMGW0() {
    ZipArchiveEntry entry1 = new ZipArchiveEntry("name1");
    ZipArchiveEntry entry2 = null;
    try {
        entry2 = new ZipArchiveEntry(new ZipArchiveEntry("entryName"));
    } catch (ZipException e) {
        e.printStackTrace();
    }
    assertNotEquals(entry1.hashCode(), entry2.hashCode());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testgetLocalHeaderOffsetWithZipEntry_cgVO2_Anmm0() {
        java.util.zip.ZipEntry entry = new java.util.zip.ZipEntry("entryName");
        ZipArchiveEntry zipEntry = null;
        try {
            zipEntry = new ZipArchiveEntry(entry);
        } catch (ZipException e) {
            e.printStackTrace();
        }
        long offset = zipEntry.getLocalHeaderOffset();
        assertEquals(0, offset);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetLastAccessTimeWithEntry_FVTW2_eYQU0() {
        ZipArchiveEntry entry1 = new ZipArchiveEntry("name1");
        ZipArchiveEntry entry2 = null;
        try {
            entry2 = new ZipArchiveEntry(entry1);
        } catch (ZipException e) {
            e.printStackTrace();
        }
        FileTime fileTime = FileTime.fromMillis(0);
        entry2.setLastAccessTime(fileTime);
        assertEquals(fileTime, entry2.getLastAccessTime());
        assertNotEquals(fileTime, entry1.getLastAccessTime());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetExtraFieldsWithUnparseableField_OFom2() {
        ZipArchiveEntry entry = new ZipArchiveEntry("name");
        UnparseableExtraFieldData field = new UnparseableExtraFieldData();
        entry.setExtraFields(new ZipExtraField[]{field});
        assertEquals(1, entry.getExtraFields().length);
        assertTrue(entry.getExtraFields()[0] instanceof UnparseableExtraFieldData);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetExtraFieldsWithNullField_DiGH3() {
        ZipArchiveEntry entry = new ZipArchiveEntry("name");
        ZipExtraField field = null;
        ZipExtraField[] fields = new ZipExtraField[]{field};
        IllegalArgumentException e = assertThrows(IllegalArgumentException.class, () -> entry.setExtraFields(fields));
        assertEquals("fields must not contain null elements", e.getMessage());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetCentralDirectoryExtra_PUMY0() {
        ZipArchiveEntry entry = new ZipArchiveEntry(new File("input.txt"), "entryName");
        byte[] b = new byte[10];
        entry.setCentralDirectoryExtra(b);
        assertNotNull(entry.getCentralDirectoryExtra());
        assertEquals(10, entry.getCentralDirectoryExtra().length);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSetLastAccessTime_eeHP0() {
    ZipArchiveEntry entry = new ZipArchiveEntry();
    FileTime fileTime = FileTime.fromMillis(System.currentTimeMillis());
    entry.setLastAccessTime(fileTime);
    assertEquals(fileTime, entry.getLastAccessTime());
    assertEquals(fileTime, entry.getLastModifiedTime());
    assertEquals(fileTime, entry.getCreationTime());
    assertNotNull(entry.getExtraField(X000A_NTFS.HEADER_ID));
    assertNotNull(entry.getExtraField(X5455_ExtendedTimestamp.HEADER_ID));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testNonNullExtra_dwJj1() {
        ZipArchiveEntry entry = new ZipArchiveEntry();
        byte[] extra = new byte[10];
        entry.setExtra(extra);
        byte[] result = entry.getLocalFileDataExtra();
        assertNotNull(result);
        assertTrue(result.length == 10);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetTime_Gbly0() {
        ZipArchiveEntry entry = new ZipArchiveEntry("test.txt");
        entry.setTime(1234567890L);
        assertEquals(1234567890L, entry.getTime());
        assertTrue(entry.getLastModifiedDate() == null);
        entry.setTime(ZipUtil.dosToJavaTime(1234567890L));
        assertEquals(1234567890L, entry.getTime());
        assertNotNull(entry.getLastModifiedDate());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetTime_GoHH0() {
        ZipArchiveEntry entry = new ZipArchiveEntry(new File("input.txt"), "entryName");
        entry.setTime(1234567890L);
        assertEquals(1234567890L, entry.getTime());
        assertEquals(1234567890L, entry.getLastModifiedTime().toMillis());
        assertEquals(FileTime.fromMillis(0L), entry.getLastAccessTime());
        assertEquals(FileTime.fromMillis(0L), entry.getCreationTime());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAddExtraFieldWithUnparseableExtraFieldData_VMqi1() {
        ZipArchiveEntry entry = new ZipArchiveEntry();
        UnparseableExtraFieldData ze = new UnparseableExtraFieldData();
        entry.addExtraField(ze);
        assertNotNull(entry.getExtraFields());
        assertEquals(1, entry.getExtraFields().length);
        assertEquals(ze, entry.getExtraFields()[0]);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetGeneralPurposeBit4_xHcM3_fid2() {
        ZipArchiveEntry zipArchiveEntry = new ZipArchiveEntry(new File("inputFile"), "entryName");
        GeneralPurposeBit generalPurposeBit = zipArchiveEntry.getGeneralPurposeBit();
        assertEquals(-1, generalPurposeBit.hashCode());
    }
}