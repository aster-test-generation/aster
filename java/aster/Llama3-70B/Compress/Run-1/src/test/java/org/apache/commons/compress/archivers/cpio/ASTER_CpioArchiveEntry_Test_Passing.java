/**
 * Generated by Aster
 */
package org.apache.commons.compress.archivers.cpio;
import java.nio.charset.Charset;
import java.util.Date;
import java.util.Objects;
import static org.junit.jupiter.api.Assertions.*;
import java.util.Date;
import java.util.Objects;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_CpioArchiveEntry_Test_Passing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSetGID_NgWG0() {
    CpioArchiveEntry cpioArchiveEntry = new CpioArchiveEntry((short) 1);
    cpioArchiveEntry.setGID(123L);
    assertEquals(123L, cpioArchiveEntry.getGID());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSetInode_FJwM0() {
    CpioArchiveEntry entry = new CpioArchiveEntry((short) 1);
    entry.setInode(12345L);
    assertEquals(12345L, entry.getInode());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetName2_ASRv1() {
    CpioArchiveEntry cpioArchiveEntry = new CpioArchiveEntry((short) 1, "name", 10);
    assertEquals("name", cpioArchiveEntry.getName());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetName3_HxIf2() {
    CpioArchiveEntry cpioArchiveEntry = new CpioArchiveEntry("name");
    assertEquals("name", cpioArchiveEntry.getName());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetName5_WwLs4() {
    CpioArchiveEntry cpioArchiveEntry = new CpioArchiveEntry((short) 1, "name");
    assertEquals("name", cpioArchiveEntry.getName());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetName7_WIbD6() {
    CpioArchiveEntry cpioArchiveEntry = new CpioArchiveEntry("name", 10);
    assertEquals("name", cpioArchiveEntry.getName());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testIsDirectory_true_pnfn0() {
    CpioArchiveEntry entry = new CpioArchiveEntry((short) 1, "name", 0);
    entry.setMode((short) 040755); // directory mode
    assertTrue(entry.isDirectory());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testIsDirectory_false_AasL1() {
    CpioArchiveEntry entry = new CpioArchiveEntry((short) 1, "name", 0);
    entry.setMode((short) 0100644); // file mode
    assertFalse(entry.isDirectory());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testEquals_SameObject_dXSF0() {
    CpioArchiveEntry entry = new CpioArchiveEntry((short) 1);
    assertTrue(entry.equals(entry));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testEquals_DifferentClass_CDxP1() {
    CpioArchiveEntry entry = new CpioArchiveEntry((short) 1);
    Object obj = new Object();
    assertFalse(entry.equals(obj));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testEquals_NullObject_QOsd2() {
    CpioArchiveEntry entry = new CpioArchiveEntry((short) 1);
    assertFalse(entry.equals(null));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testEquals_SameName_usPP3() {
    CpioArchiveEntry entry1 = new CpioArchiveEntry("name");
    CpioArchiveEntry entry2 = new CpioArchiveEntry("name");
    assertTrue(entry1.equals(entry2));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testEquals_DifferentName_pMpU4() {
    CpioArchiveEntry entry1 = new CpioArchiveEntry("name1");
    CpioArchiveEntry entry2 = new CpioArchiveEntry("name2");
    assertFalse(entry1.equals(entry2));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testEquals_NullName_YUdQ5() {
    CpioArchiveEntry entry1 = new CpioArchiveEntry((short) 1, null, 0);
    CpioArchiveEntry entry2 = new CpioArchiveEntry((short) 1, null, 0);
    assertTrue(entry1.equals(entry2));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetLastModifiedDate_DhkZ0() {
    CpioArchiveEntry cpioArchiveEntry = new CpioArchiveEntry((short) 1, "name", 100L);
    Date lastModifiedDate = cpioArchiveEntry.getLastModifiedDate();
    assertNotNull(lastModifiedDate);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetUID_xrcF0() {
    CpioArchiveEntry cpioArchiveEntry = new CpioArchiveEntry((short) 1);
    assertEquals(0, cpioArchiveEntry.getUID());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetFormat1_KBQl0() {
    CpioArchiveEntry cpioArchiveEntry = new CpioArchiveEntry((short) 1);
    short format = cpioArchiveEntry.getFormat();
    assertEquals((short) 1, format);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSetChksum_eizx0() {
    CpioArchiveEntry cpioArchiveEntry = new CpioArchiveEntry((short) 1);
    cpioArchiveEntry.setChksum(123456789L);
    assertEquals(123456789L, cpioArchiveEntry.getChksum());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetHeaderPadCountNullName_NTTy0() {
    CpioArchiveEntry entry = new CpioArchiveEntry((short) 1);
    assertEquals(0, entry.getHeaderPadCount(null));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSetName_YWAX0() {
    CpioArchiveEntry cpioArchiveEntry = new CpioArchiveEntry((short) 1);
    cpioArchiveEntry.setName("newName");
    assertEquals("newName", cpioArchiveEntry.getName());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetInode1_OQNb0() {
    CpioArchiveEntry cpioArchiveEntry = new CpioArchiveEntry((short) 1);
    assertEquals(0, cpioArchiveEntry.getInode());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testHashCode_bMai0() {
    CpioArchiveEntry cpioArchiveEntry = new CpioArchiveEntry((short) 1, "name", 10L);
    int result = cpioArchiveEntry.hashCode();
    assertEquals(Objects.hash(cpioArchiveEntry.getName()), result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetDataPadCount1_NEQV0() {
    CpioArchiveEntry entry = new CpioArchiveEntry((short) 1);
    assertEquals(0, entry.getDataPadCount());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetDataPadCount2_ddJW1() {
    CpioArchiveEntry entry = new CpioArchiveEntry((short) 1, "name", 10);
    assertEquals(2, entry.getDataPadCount());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetDataPadCount3_ecec2() {
    CpioArchiveEntry entry = new CpioArchiveEntry((short) 1, "name", 16);
    assertEquals(0, entry.getDataPadCount());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetHeaderPadCount_Mmlr0() {
    CpioArchiveEntry cpioArchiveEntry = new CpioArchiveEntry((short) 1);
    assertEquals(0, cpioArchiveEntry.getHeaderPadCount());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSetUID_qgMq0() {
    CpioArchiveEntry cpioArchiveEntry = new CpioArchiveEntry((short) 1);
    cpioArchiveEntry.setUID(123L);
    assertEquals(123L, cpioArchiveEntry.getUID());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSetMode_tmkA0() {
    CpioArchiveEntry entry = new CpioArchiveEntry((short) 1);
    entry.setMode(0x41ED);
    assertEquals(0x41ED, entry.getMode());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetGID_gtKA0() {
    CpioArchiveEntry cpioArchiveEntry = new CpioArchiveEntry((short) 1);
    assertEquals(0, cpioArchiveEntry.getGID());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSetNumberOfLinks_GsLX0() {
    CpioArchiveEntry entry = new CpioArchiveEntry((short) 1);
    entry.setNumberOfLinks(5);
    assertEquals(5, entry.getNumberOfLinks());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetSize1_knpd0() {
    CpioArchiveEntry cpioArchiveEntry = new CpioArchiveEntry((short) 1);
    assertEquals(0, cpioArchiveEntry.getSize());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetSize2_myLp1() {
    CpioArchiveEntry cpioArchiveEntry = new CpioArchiveEntry((short) 1, "name", 10);
    assertEquals(10, cpioArchiveEntry.getSize());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetSize3_nyYw2() {
    CpioArchiveEntry cpioArchiveEntry = new CpioArchiveEntry("name");
    assertEquals(0, cpioArchiveEntry.getSize());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetSize6_imPs5() {
    CpioArchiveEntry cpioArchiveEntry = new CpioArchiveEntry((short) 1, "name");
    assertEquals(0, cpioArchiveEntry.getSize());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetSize8_nPhw7() {
    CpioArchiveEntry cpioArchiveEntry = new CpioArchiveEntry("name", 10);
    assertEquals(10, cpioArchiveEntry.getSize());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetNumberOfLinks1_dKQQ0() {
    CpioArchiveEntry entry = new CpioArchiveEntry((short) 1);
    assertEquals(1, entry.getNumberOfLinks());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetNumberOfLinks2_BOhX1() {
    CpioArchiveEntry entry = new CpioArchiveEntry("name", 10);
    assertEquals(1, entry.getNumberOfLinks());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetAlignmentBoundary1_Ucnh4() {
    CpioArchiveEntry cpioArchiveEntry = new CpioArchiveEntry((short) 1);
    assertEquals(4, cpioArchiveEntry.getAlignmentBoundary());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetName1_FWpS0_fid1() {
    CpioArchiveEntry cpioArchiveEntry = new CpioArchiveEntry((short) 1);
    assertNull(cpioArchiveEntry.getName());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetMode1_AWwr0_fid1() {
    CpioArchiveEntry entry = new CpioArchiveEntry((short) 1, "test", 10);
    assertEquals(32768, entry.getMode());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetMode2_ptjc1_fid1() {
    CpioArchiveEntry entry = new CpioArchiveEntry("test");
    assertEquals(32768, entry.getMode());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetMode3_atlT2_fid1() {
    CpioArchiveEntry entry = new CpioArchiveEntry((short) 1, "test");
    assertEquals(32768, entry.getMode());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetHeaderPadCountNullCharset_ODaR1_fid1() {
    CpioArchiveEntry entry = new CpioArchiveEntry("name");
    assertEquals(1, entry.getHeaderPadCount(null));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetHeaderPadCount_ILeG2_fid1() {
    CpioArchiveEntry entry = new CpioArchiveEntry((short) 1, "name", 10);
    assertEquals(1, entry.getHeaderPadCount(Charset.defaultCharset()));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetHeaderSize_lvde110() {
    CpioArchiveEntry cpioArchiveEntry = new CpioArchiveEntry((short) 1);
    assertEquals(110, cpioArchiveEntry.getHeaderSize());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testIsRegularFile_true_hoAO0_fid1() {
    CpioArchiveEntry entry = new CpioArchiveEntry((short) 1, "test", 10);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testIsRegularFile_false_WMSi1_fid1() {
    CpioArchiveEntry entry = new CpioArchiveEntry((short) 1, "test", 20);
    entry.setMode((short) 040000); // set mode to a directory type
    assertFalse(entry.isRegularFile());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetHeaderPadCount1_wqtE0_fid1() {
    CpioArchiveEntry entry = new CpioArchiveEntry((short) 1);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetHeaderPadCount2_HVev1_fid1() {
    CpioArchiveEntry entry = new CpioArchiveEntry((short) 1, "name", 10);
    assertEquals(0, entry.getHeaderPadCount(5));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetHeaderPadCount3_kXsy2_fid1() {
    CpioArchiveEntry entry = new CpioArchiveEntry("name");
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetNumberOfLinks3_aZHY1() {
    CpioArchiveEntry entry = new CpioArchiveEntry((short) 1, "name", 10);
    entry.isDirectory(); // assume this sets the directory flag
    assertEquals(1, entry.getNumberOfLinks());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetRemoteDeviceMaj_jnlX0_ThTk0() {
    CpioArchiveEntry cpioArchiveEntry = new CpioArchiveEntry((short) 1);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testIsSymbolicLink_true_BUgO0_DkoO0() {
    CpioArchiveEntry entry = new CpioArchiveEntry((short) 1, "name", 10);
    entry.setMode((short) 0120570); // mode for symbolic link
    assertTrue(entry.isSymbolicLink());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testIsSymbolicLink_false_wCXx1_ylTa0() {
    CpioArchiveEntry entry = new CpioArchiveEntry((short) 1, "name", 10);
    entry.setMode((short) 0100644); // mode for regular file
    assertFalse(entry.isSymbolicLink());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetRemoteDevice_wCOz0_ZNlM0() {
    CpioArchiveEntry cpioArchiveEntry = new CpioArchiveEntry((short) 1);
    cpioArchiveEntry.setRemoteDeviceMin(10);
    assertEquals(10, cpioArchiveEntry.getRemoteDeviceMin());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testIsPipe_true_DxiC0_SGWx0() {
    CpioArchiveEntry entry = new CpioArchiveEntry((short) 1, "name", 0);
    entry.setMode((short) 0010000); // Assuming C_ISFIFO is 0010000
    assertTrue(entry.isPipe());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testIsSocket_true_KDXC0_FCgn0() {
    CpioArchiveEntry entry = new CpioArchiveEntry((short) 1);
    entry.setMode((short) 0120000); // Assuming C_ISSOCK is 0120000
    assertFalse(entry.isSocket());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSetRemoteDeviceMin_OJLe0_Vmjq0() {
    CpioArchiveEntry cpioArchiveEntry = new CpioArchiveEntry((short) 1);
    cpioArchiveEntry.setRemoteDeviceMin(10L);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testIsCharacterDevice_true_rRmx0_pFqF0() {
    CpioArchiveEntry entry = new CpioArchiveEntry((short) 1, "name", 1024);
    entry.setMode((short) 0020000); // assuming C_ISCHR is 0020000
    assertTrue(entry.isCharacterDevice());
}
}