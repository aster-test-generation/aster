/**
 * Generated by Aster
 */
package org.apache.commons.compress.archivers.sevenz;
import java.nio.file.attribute.FileTime;
import java.util.Date;
import org.apache.commons.io.file.attribute.FileTimes;
import static org.junit.jupiter.api.Assertions.*;
import java.util.Date;
import java.util.Locale;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_SevenZArchiveEntry_Test_Failing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetCreationDate_oOVy0_1() {
    SevenZArchiveEntry entry = new SevenZArchiveEntry();
    Date creationDate = entry.getCreationDate();
    assertNotNull(creationDate);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetCreationDate_oOVy0_2() {
    SevenZArchiveEntry entry = new SevenZArchiveEntry();
    Date creationDate = entry.getCreationDate();
    assertEquals(creationDate, FileTimes.toDate(entry.getCreationTime()));}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetCreationDateWithNullCreationTime_KHAN1() {
    SevenZArchiveEntry entry = new SevenZArchiveEntry();
    entry.setCreationTime(null);
    Date creationDate = entry.getCreationDate();
    assertNull(creationDate);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSetLastModifiedDate_ienE0() {
    SevenZArchiveEntry entry = new SevenZArchiveEntry();
    long ntfsLastModifiedDate = 1234567890;
    entry.setLastModifiedDate(ntfsLastModifiedDate);
    assertEquals(FileTimes.ntfsTimeToFileTime(ntfsLastModifiedDate), entry.getLastModifiedDate());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSetLastModifiedDateWithNegativeValue_cSAw1() {
    SevenZArchiveEntry entry = new SevenZArchiveEntry();
    long ntfsLastModifiedDate = -1234567890;
    entry.setLastModifiedDate(ntfsLastModifiedDate);
    assertEquals(FileTimes.ntfsTimeToFileTime(ntfsLastModifiedDate), entry.getLastModifiedDate());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSetLastModifiedDateWithZeroValue_gZJV2() {
    SevenZArchiveEntry entry = new SevenZArchiveEntry();
    long ntfsLastModifiedDate = 0;
    entry.setLastModifiedDate(ntfsLastModifiedDate);
    assertEquals(FileTimes.ntfsTimeToFileTime(ntfsLastModifiedDate), entry.getLastModifiedDate());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSetLastModifiedDateWithMaxValue_GFOS3() {
    SevenZArchiveEntry entry = new SevenZArchiveEntry();
    long ntfsLastModifiedDate = Long.MAX_VALUE;
    entry.setLastModifiedDate(ntfsLastModifiedDate);
    assertEquals(FileTimes.ntfsTimeToFileTime(ntfsLastModifiedDate), entry.getLastModifiedDate());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSetLastModifiedDateWithMinValue_NSxq4() {
    SevenZArchiveEntry entry = new SevenZArchiveEntry();
    long ntfsLastModifiedDate = Long.MIN_VALUE;
    entry.setLastModifiedDate(ntfsLastModifiedDate);
    assertEquals(FileTimes.ntfsTimeToFileTime(ntfsLastModifiedDate), entry.getLastModifiedDate());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSetLastModifiedDateWithInvalidValue_TGdp5() {
    SevenZArchiveEntry entry = new SevenZArchiveEntry();
    long ntfsLastModifiedDate = -1;
    try {
        entry.setLastModifiedDate(ntfsLastModifiedDate);
        fail("Expected IllegalArgumentException");
    } catch (IllegalArgumentException e) {
        assertEquals("Invalid NTFS last modified date: " + ntfsLastModifiedDate, e.getMessage());
    }
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSetAccessDate_XDft0() {
    SevenZArchiveEntry entry = new SevenZArchiveEntry();
    long ntfsAccessDate = 1643744000000L; // 2022-02-01 00:00:00
    entry.setAccessDate(ntfsAccessDate);
    assertEquals(FileTimes.ntfsTimeToFileTime(ntfsAccessDate), entry.getAccessDate());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSetAccessDateWithNegativeValue_GfXZ1() {
    SevenZArchiveEntry entry = new SevenZArchiveEntry();
    long ntfsAccessDate = -1L;
    entry.setAccessDate(ntfsAccessDate);
    assertEquals(FileTimes.ntfsTimeToFileTime(ntfsAccessDate), entry.getAccessDate());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSetAccessDateWithZeroValue_SQpR2() {
    SevenZArchiveEntry entry = new SevenZArchiveEntry();
    long ntfsAccessDate = 0L;
    entry.setAccessDate(ntfsAccessDate);
    assertEquals(FileTimes.ntfsTimeToFileTime(ntfsAccessDate), entry.getAccessDate());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSetAccessDateWithMaxValue_WXxJ3() {
    SevenZArchiveEntry entry = new SevenZArchiveEntry();
    long ntfsAccessDate = Long.MAX_VALUE;
    entry.setAccessDate(ntfsAccessDate);
    assertEquals(FileTimes.ntfsTimeToFileTime(ntfsAccessDate), entry.getAccessDate());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSetAccessDateWithMinValue_yeub4() {
    SevenZArchiveEntry entry = new SevenZArchiveEntry();
    long ntfsAccessDate = Long.MIN_VALUE;
    entry.setAccessDate(ntfsAccessDate);
    assertEquals(FileTimes.ntfsTimeToFileTime(ntfsAccessDate), entry.getAccessDate());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSetAccessDateWithInvalidValue_EYRc5() {
    SevenZArchiveEntry entry = new SevenZArchiveEntry();
    long ntfsAccessDate = 1643744000000L; // 2022-02-01 00:00:00
    entry.setAccessDate(ntfsAccessDate);
    assertNotEquals(FileTimes.ntfsTimeToFileTime(ntfsAccessDate), entry.getAccessDate());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetLastModifiedDate_RKzR0_1() {
    SevenZArchiveEntry entry = new SevenZArchiveEntry();
    Date lastModifiedDate = entry.getLastModifiedDate();
    assertNotNull(lastModifiedDate);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetLastModifiedDate_RKzR0_2() {
    SevenZArchiveEntry entry = new SevenZArchiveEntry();
    Date lastModifiedDate = entry.getLastModifiedDate();
    assertEquals(lastModifiedDate, entry.getLastModifiedTime());}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSetLastModifiedTime_nullFileTime_Cokr4() {
    SevenZArchiveEntry entry = new SevenZArchiveEntry();
    FileTime time = null;
    entry.setLastModifiedTime(time);
    assertNull(entry.getLastModifiedTime());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSetCompressedCrc_invalidCrc_DMGO1() {
    SevenZArchiveEntry entry = new SevenZArchiveEntry();
    entry.setCompressedCrc(-1);
    assertEquals(0, entry.getCompressedCrc());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSetCompressedCrc_negativeCrc_uLpV6() {
    SevenZArchiveEntry entry = new SevenZArchiveEntry();
    entry.setCompressedCrc(-123456789);
    assertEquals(0, entry.getCompressedCrc());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetLastModifiedTime_hasLastModifiedDate_SpmT0() {
    SevenZArchiveEntry entry = new SevenZArchiveEntry();
    entry.setHasLastModifiedDate(true);
    FileTime lastModifiedDate = entry.getLastModifiedTime();
    assertNotNull(lastModifiedDate);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetLastModifiedTime_nullLastModifiedDate_KNLO2() {
    SevenZArchiveEntry entry = new SevenZArchiveEntry();
    entry.setHasLastModifiedDate(true);
    entry.setLastModifiedDate(null);
    try {
        entry.getLastModifiedTime();
        fail("Expected NullPointerException");
    } catch (NullPointerException e) {
        assertEquals("Last modified date is null", e.getMessage());
    }
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testNtfsTimeToJavaTime_EiGr0() {
    long ntfsTime = 1234567890;
    Date expected = new Date(ntfsTime);
    Date actual = SevenZArchiveEntry.ntfsTimeToJavaTime(ntfsTime);
    assertEquals(expected, actual);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testNtfsTimeToJavaTimeWithNegativeValue_qZMz1() {
    long ntfsTime = -1234567890;
    Date expected = new Date(ntfsTime);
    Date actual = SevenZArchiveEntry.ntfsTimeToJavaTime(ntfsTime);
    assertEquals(expected, actual);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testNtfsTimeToJavaTimeWithZeroValue_xwzS2() {
    long ntfsTime = 0;
    Date expected = new Date(ntfsTime);
    Date actual = SevenZArchiveEntry.ntfsTimeToJavaTime(ntfsTime);
    assertEquals(expected, actual);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testNtfsTimeToJavaTimeWithMaxValue_lytt3() {
    long ntfsTime = Long.MAX_VALUE;
    Date expected = new Date(ntfsTime);
    Date actual = SevenZArchiveEntry.ntfsTimeToJavaTime(ntfsTime);
    assertEquals(expected, actual);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testNtfsTimeToJavaTimeWithMinValue_wqCE4() {
    long ntfsTime = Long.MIN_VALUE;
    Date expected = new Date(ntfsTime);
    Date actual = SevenZArchiveEntry.ntfsTimeToJavaTime(ntfsTime);
    assertEquals(expected, actual);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testNtfsTimeToJavaTimeWithInvalidValue_wtPS5() {
    long ntfsTime = -1;
    Date expected = new Date(ntfsTime);
    Date actual = SevenZArchiveEntry.ntfsTimeToJavaTime(ntfsTime);
    assertEquals(expected, actual);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetCompressedSize_Invalid_cuit1() {
    SevenZArchiveEntry entry = new SevenZArchiveEntry();
    long compressedSize = entry.getCompressedSize();
    assertNotEquals(0, compressedSize);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetCompressedSize_Negative_ahUV2() {
    SevenZArchiveEntry entry = new SevenZArchiveEntry();
    long compressedSize = entry.getCompressedSize();
    assertTrue(compressedSize < 0);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetCompressedSize_Positive_WRsq4() {
    SevenZArchiveEntry entry = new SevenZArchiveEntry();
    long compressedSize = entry.getCompressedSize();
    assertTrue(compressedSize > 0);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetCompressedSize_MaxValue_LsyN5() {
    SevenZArchiveEntry entry = new SevenZArchiveEntry();
    long compressedSize = entry.getCompressedSize();
    assertEquals(Long.MAX_VALUE, compressedSize);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetCompressedSize_MinValue_hmsI6() {
    SevenZArchiveEntry entry = new SevenZArchiveEntry();
    long compressedSize = entry.getCompressedSize();
    assertEquals(Long.MIN_VALUE, compressedSize);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetCompressedSize_Null_alJT7() {
    SevenZArchiveEntry entry = new SevenZArchiveEntry();
    long compressedSize = entry.getCompressedSize();
    assertNull(compressedSize);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSetCreationDate_ValidDate_oNrs0() {
    SevenZArchiveEntry entry = new SevenZArchiveEntry();
    Date creationDate = new Date();
    entry.setCreationDate(creationDate);
    assertEquals(creationDate, entry.getCreationTime());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSetCreationDate_NullDate_ApLB1() {
    SevenZArchiveEntry entry = new SevenZArchiveEntry();
    entry.setCreationDate(null);
    assertNull(entry.getCreationTime());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testEquals_DifferentObjects_qTVZ1() {
    SevenZArchiveEntry entry1 = new SevenZArchiveEntry();
    SevenZArchiveEntry entry2 = new SevenZArchiveEntry();
    assertFalse(entry1.equals(entry2));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSetAntiItem_IllegalStateException_LPIu9() {
    SevenZArchiveEntry entry = new SevenZArchiveEntry();
    try {
        entry.setAntiItem(true);
        fail("Expected IllegalStateException");
    } catch (IllegalStateException e) {
        assertTrue(e.getMessage().contains("isAntiItem"));
    }
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSetAccessDate_NullDate_Awvf1() {
    SevenZArchiveEntry entry = new SevenZArchiveEntry();
    entry.setAccessDate(null);
    assertEquals(0, entry.getAccessTime());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSetAccessDate_InvalidDate_jwtL2() {
    SevenZArchiveEntry entry = new SevenZArchiveEntry();
    Date accessDate = new Date(0);
    entry.setAccessDate(accessDate);
    assertEquals(0, entry.getAccessTime());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetHasAccessDate_zDvp0_1() {
    SevenZArchiveEntry entry = new SevenZArchiveEntry();
    entry.setHasAccessDate(true);
    assertEquals(false, entry.getHasAccessDate());}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testJavaTimeToNtfsTimeWithNullDate_Yyke1() {
        long ntfsTime = SevenZArchiveEntry.javaTimeToNtfsTime(null);
        assertEquals(0, ntfsTime);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testJavaTimeToNtfsTimeWithValidDate_ngqA3() {
        Date date = new Date(1585971200000L); // 2020-04-01 00:00:00
        long ntfsTime = SevenZArchiveEntry.javaTimeToNtfsTime(date);
        assertEquals(132537600000000000L, ntfsTime);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testJavaTimeToNtfsTimeWithMaxDate_kQkK4() {
        Date date = new Date(Long.MAX_VALUE);
        long ntfsTime = SevenZArchiveEntry.javaTimeToNtfsTime(date);
        assertEquals(Long.MAX_VALUE, ntfsTime);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testJavaTimeToNtfsTimeWithMinDate_uhHe5() {
        Date date = new Date(Long.MIN_VALUE);
        long ntfsTime = SevenZArchiveEntry.javaTimeToNtfsTime(date);
        assertEquals(Long.MIN_VALUE, ntfsTime);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetHasCrc_Qkby0() {
    SevenZArchiveEntry entry = new SevenZArchiveEntry();
    assertTrue(entry.getHasCrc());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSetCompressedSize_NegativeSize_JdhY1() {
    SevenZArchiveEntry entry = new SevenZArchiveEntry();
    long size = -100;
    entry.setCompressedSize(size);
    assertEquals(0, entry.getCompressedSize());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSetCompressedSize_InvalidSize_Lkdm6() {
    SevenZArchiveEntry entry = new SevenZArchiveEntry();
    long size = -1;
    entry.setCompressedSize(size);
    assertEquals(0, entry.getCompressedSize());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSetNameWithMultipleNames_ECBd8_1() {
    SevenZArchiveEntry entry = new SevenZArchiveEntry();
    entry.setName("name1");
    entry.setName("name2");
    assertEquals("name1", entry.getName());}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSetCrcValueWithInvalidValue_kLsw5() {
    SevenZArchiveEntry entry = new SevenZArchiveEntry();
    long crc = -1L;
    try {
        entry.setCrcValue(crc);
        fail("Expected IllegalArgumentException");
    } catch (IllegalArgumentException e) {
        assertEquals("Invalid CRC value: " + crc, e.getMessage());
    }
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetHasWindowsAttributes_EyWG0() {
    SevenZArchiveEntry entry = new SevenZArchiveEntry();
    assertTrue(entry.getHasWindowsAttributes());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSetCompressedCrcValue_InvalidCrc_jXMR1() {
    SevenZArchiveEntry entry = new SevenZArchiveEntry();
    long crc = -1L;
    try {
        entry.setCompressedCrcValue(crc);
        fail("Expected IllegalArgumentException");
    } catch (IllegalArgumentException e) {
        assertEquals("Invalid CRC value: -1", e.getMessage());
    }
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSetCompressedCrcValue_NegativeCrc_kwfM6() {
    SevenZArchiveEntry entry = new SevenZArchiveEntry();
    long crc = -1234567890L;
    try {
        entry.setCompressedCrcValue(crc);
        fail("Expected IllegalArgumentException");
    } catch (IllegalArgumentException e) {
        assertEquals("Invalid CRC value: -1234567890", e.getMessage());
    }
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetAccessDate_Wedc0() {
    SevenZArchiveEntry entry = new SevenZArchiveEntry();
    Date accessDate = entry.getAccessDate();
    assertNotNull(accessDate);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetAccessDateWithNullAccessTime_UKVQ3() {
    SevenZArchiveEntry entry = new SevenZArchiveEntry();
    entry.setAccessTime(null);
    Date accessDate = entry.getAccessDate();
    assertNull(accessDate);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSetCreationDate_yiZY0() {
    SevenZArchiveEntry entry = new SevenZArchiveEntry();
    long ntfsCreationDate = 1234567890;
    entry.setCreationDate(ntfsCreationDate);
    assertEquals(FileTimes.ntfsTimeToFileTime(ntfsCreationDate), entry.getCreationDate());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSetCreationDateWithNull_oxcJ1() {
    SevenZArchiveEntry entry = new SevenZArchiveEntry();
    entry.setCreationDate(null);
    assertNull(entry.getCreationDate());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSetCreationDateWithInvalidValue_evQT2() {
    SevenZArchiveEntry entry = new SevenZArchiveEntry();
    long ntfsCreationDate = -1;
    entry.setCreationDate(ntfsCreationDate);
    assertEquals(FileTimes.ntfsTimeToFileTime(ntfsCreationDate), entry.getCreationDate());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSetCreationDateWithMaxValue_yZxM3() {
    SevenZArchiveEntry entry = new SevenZArchiveEntry();
    long ntfsCreationDate = Long.MAX_VALUE;
    entry.setCreationDate(ntfsCreationDate);
    assertEquals(FileTimes.ntfsTimeToFileTime(ntfsCreationDate), entry.getCreationDate());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSetCreationDateWithMinValue_LVsG4() {
    SevenZArchiveEntry entry = new SevenZArchiveEntry();
    long ntfsCreationDate = Long.MIN_VALUE;
    entry.setCreationDate(ntfsCreationDate);
    assertEquals(FileTimes.ntfsTimeToFileTime(ntfsCreationDate), entry.getCreationDate());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSetCreationDateWithZero_jAYv5() {
    SevenZArchiveEntry entry = new SevenZArchiveEntry();
    long ntfsCreationDate = 0;
    entry.setCreationDate(ntfsCreationDate);
    assertEquals(FileTimes.ntfsTimeToFileTime(ntfsCreationDate), entry.getCreationDate());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSetCreationDateWithNegativeValue_eRZN6() {
    SevenZArchiveEntry entry = new SevenZArchiveEntry();
    long ntfsCreationDate = -1234567890;
    entry.setCreationDate(ntfsCreationDate);
    assertEquals(FileTimes.ntfsTimeToFileTime(ntfsCreationDate), entry.getCreationDate());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetCompressedCrcValueWithNullEntry_IbgX6() {
    SevenZArchiveEntry entry = null;
    long compressedCrc = entry.getCompressedCrcValue();
    assertEquals(0, compressedCrc);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetWindowsAttributesWithNullEntry_ZqLy6() {
    SevenZArchiveEntry entry = null;
    int attributes = entry.getWindowsAttributes();
    assertEquals(0, attributes);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSetHasCreationDate_LIYC0_FNcl0() {
    SevenZArchiveEntry entry = new SevenZArchiveEntry();
    entry.setHasCreationDate(true);
    assertTrue(entry.getWindowsAttributes() == 1);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSetHasCreationDateFalse_ljJh1_ygkR0() {
    SevenZArchiveEntry entry = new SevenZArchiveEntry();
    entry.setHasCreationDate(false);
    assertFalse(entry.getWindowsAttributes() == 0);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSetLastModifiedTime_specificTimeAndLastModifiedTimeAlreadySet_XNAo6_hgIc0_1() {
    SevenZArchiveEntry entry = new SevenZArchiveEntry();
    FileTime time = FileTime.fromMillis(1234567890);
    entry.setLastModifiedTime(time);
    FileTime newTime = FileTime.fromMillis(9876543210L);
    entry.setLastModifiedTime(newTime);
    assertEquals(time, entry.getLastModifiedTime());}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetCreationDateWithInvalidCreationTime_bFHE2_udBh0() {
    SevenZArchiveEntry entry = new SevenZArchiveEntry();
    entry.setCreationTime(FileTime.fromMillis(0));
    Date creationDate = entry.getCreationDate();
    assertNull(creationDate);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSetHasCrc_sfDE0_YSeL0_1() {
    SevenZArchiveEntry entry = new SevenZArchiveEntry();
    entry.setHasCrc(true);
    entry.setHasCrc(false);
    assertTrue(entry.getHasCrc());}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSetLastModifiedDateWithNullValue_WSWg6_ybDp0() {
    SevenZArchiveEntry entry = new SevenZArchiveEntry();
    long ntfsLastModifiedDate = 0L;
    try {
        entry.setLastModifiedDate(ntfsLastModifiedDate);
        fail("Expected NullPointerException");
    } catch (NullPointerException e) {
        assertEquals("NTFS last modified date cannot be null", e.getMessage());
    }
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testHasStream_Null_KroZ2_EGRQ0() {
    SevenZArchiveEntry entry = new SevenZArchiveEntry();
    entry.setHasStream(false);
    assertNull(entry.hasStream());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSetHasAccessDateTrue_oQjG0_PBkJ0() {
    SevenZArchiveEntry entry = new SevenZArchiveEntry();
    entry.setHasAccessDate(true);
    assertTrue(entry.getWindowsAttributes() == 1);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSetHasAccessDateFalse_SjPZ1_tQGW0() {
    SevenZArchiveEntry entry = new SevenZArchiveEntry();
    entry.setHasAccessDate(false);
    assertFalse(entry.getWindowsAttributes() == 0);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSetCreationDate_DifferentLocale_Oyjr4_PIDI0() {
    SevenZArchiveEntry entry = new SevenZArchiveEntry();
    Date creationDate = new Date();
    Locale locale = Locale.US;
    entry.setCreationDate(creationDate);
    assertEquals(creationDate, entry.getCreationTime());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSetSizeInvalid_zYHw5_FOXp0() {
    SevenZArchiveEntry entry = new SevenZArchiveEntry();
    try {
        entry.setSize(0L);
        fail("Expected IllegalArgumentException");
    } catch (IllegalArgumentException e) {
        assertEquals("size must not be null", e.getMessage());
    }
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSetAntiItem_NullPointerException_NnZu7_Vwhg0() {
    SevenZArchiveEntry entry = new SevenZArchiveEntry();
    try {
        entry.setAntiItem(false);
        fail("Expected NullPointerException");
    } catch (NullPointerException e) {
        assertTrue(e.getMessage().contains("isAntiItem"));
    }
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSetAntiItem_IllegalArgumentException_yThv8_MSMA0() {
    SevenZArchiveEntry entry = new SevenZArchiveEntry();
    try {
        entry.setAntiItem(true);
        fail("Expected IllegalArgumentException");
    } catch (IllegalArgumentException e) {
        assertTrue(e.getMessage().contains("isAntiItem"));
    }
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSetHasWindowsAttributesInvalid_mGvX3_kUSl0() {
    SevenZArchiveEntry entry = new SevenZArchiveEntry();
    entry.setHasWindowsAttributes(false);
    assertFalse(entry.getWindowsAttributes() == 0);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSetHasWindowsAttributesTrue_tecK0_gqTa0() {
    SevenZArchiveEntry entry = new SevenZArchiveEntry();
    entry.setHasWindowsAttributes(true);
    assertTrue(entry.getWindowsAttributes() != 0);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSetCrcValueWithNullValue_Rwvj6_DSxv0() {
    SevenZArchiveEntry entry = new SevenZArchiveEntry();
    long crc = 0;
    try {
        entry.setCrcValue(crc);
        fail("Expected NullPointerException");
    } catch (NullPointerException e) {
        assertEquals("CRC value cannot be null", e.getMessage());
    }
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSetCompressedCrcValue_NullCrc_gjwh2_prPS0() {
    SevenZArchiveEntry entry = new SevenZArchiveEntry();
    try {
        entry.setCompressedCrcValue(0L);
        fail("Expected NullPointerException");
    } catch (NullPointerException e) {
        assertEquals("CRC value cannot be null", e.getMessage());
    }
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSetWindowsAttributesWithInvalidValue_Pxbq5_paGT0() {
    SevenZArchiveEntry entry = new SevenZArchiveEntry();
    try {
        entry.setWindowsAttributes(0);
        fail("Expected NullPointerException");
    } catch (NullPointerException e) {
        assertTrue(true);
    }
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetAccessDateWithInvalidAccessTime_yLvn2_nZay0() {
    SevenZArchiveEntry entry = new SevenZArchiveEntry();
    entry.setAccessTime(FileTime.fromMillis(-1L));
    Date accessDate = entry.getAccessDate();
    assertNull(accessDate);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetWindowsAttributesWithNullEntryAndNullAttributes_fvGi10_EiHu0() {
    SevenZArchiveEntry entry = null;
    entry.setWindowsAttributes(0);
    int attributes = entry.getWindowsAttributes();
    assertEquals(0, attributes);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetCreationDate_oOVy0_1_fid1() {
    SevenZArchiveEntry entry = new SevenZArchiveEntry();
    Date creationDate = entry.getCreationDate();
    assertNull(creationDate);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSetLastModifiedDateWithMaxValue_GFOS3_fid1() {
    SevenZArchiveEntry entry = new SevenZArchiveEntry();
    long ntfsLastModifiedDate = Long.MAX_VALUE;
    entry.setLastModifiedDate(ntfsLastModifiedDate);
    assertEquals(ntfsLastModifiedDate, entry.getLastModifiedDate());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSetLastModifiedDateWithInvalidValue_TGdp5_fid1() {
    SevenZArchiveEntry entry = new SevenZArchiveEntry();
    long ntfsLastModifiedDate = -1;
    try {
        entry.setLastModifiedDate(ntfsLastModifiedDate);
        assertEquals(-1, entry.getWindowsAttributes());
    } catch (IllegalArgumentException e) {
        assertEquals("Invalid NTFS last modified date: " + ntfsLastModifiedDate, e.getMessage());
    }
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSetAccessDateWithNegativeValue_GfXZ1_fid1() {
    SevenZArchiveEntry entry = new SevenZArchiveEntry();
    long ntfsAccessDate = -1L;
    entry.setAccessDate(ntfsAccessDate);
    assertEquals(ntfsAccessDate, entry.getAccessDate());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSetAccessDateWithZeroValue_SQpR2_fid1() {
    SevenZArchiveEntry entry = new SevenZArchiveEntry();
    long ntfsAccessDate = 0L;
    entry.setAccessDate(ntfsAccessDate);
    assertEquals(ntfsAccessDate, entry.getAccessDate());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetLastModifiedDate_RKzR0_1_fid1() {
    SevenZArchiveEntry entry = new SevenZArchiveEntry();
    Date lastModifiedDate = entry.getLastModifiedDate();
    assertNull(lastModifiedDate);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetLastModifiedTime_hasLastModifiedDate_SpmT0_fid1() {
    SevenZArchiveEntry entry = new SevenZArchiveEntry();
    entry.setHasLastModifiedDate(true);
    FileTime lastModifiedDate = entry.getLastModifiedTime();
    assertNotNull(lastModifiedDate);
    assertEquals(lastModifiedDate, entry.getLastModifiedTime());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testNtfsTimeToJavaTime_EiGr0_fid1() {
    long ntfsTime = 1234567890;
    Date expected = new Date(ntfsTime);
    Date actual = SevenZArchiveEntry.ntfsTimeToJavaTime(ntfsTime);
    assertEquals(expected.getTime(), actual.getTime());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSetCreationDate_NullDate_ApLB1_fid1() {
    SevenZArchiveEntry entry = new SevenZArchiveEntry();
    entry.setCreationDate(null);
    assertNull(entry.getWindowsAttributes());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetCreationDate_oOVy0() {
    SevenZArchiveEntry entry = new SevenZArchiveEntry();
    Date creationDate = entry.getCreationDate();
    assertNotNull(creationDate);
    assertEquals(creationDate, FileTimes.toDate(entry.getCreationTime()));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetLastModifiedDate_RKzR0() {
    SevenZArchiveEntry entry = new SevenZArchiveEntry();
    Date lastModifiedDate = entry.getLastModifiedDate();
    assertNotNull(lastModifiedDate);
    assertEquals(lastModifiedDate, entry.getLastModifiedTime());
}
}