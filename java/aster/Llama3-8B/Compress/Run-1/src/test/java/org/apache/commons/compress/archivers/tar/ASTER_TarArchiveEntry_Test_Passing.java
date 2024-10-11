/**
 * Generated by Aster
 */
package org.apache.commons.compress.archivers.tar;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.attribute.FileTime;
import java.util.Date;
import static org.junit.jupiter.api.Assertions.*;
import java.util.Date;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_TarArchiveEntry_Test_Passing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsNotBlockDevice_vqGC1() {
        TarArchiveEntry tarArchiveEntry = new TarArchiveEntry("test", (byte) 1);
        assertFalse(tarArchiveEntry.isBlockDevice());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetModTime6_bfmR5() throws IOException {
        TarArchiveEntry tarArchiveEntry = new TarArchiveEntry("name", (byte) 0);
        Date date = new Date();
        tarArchiveEntry.setModTime(date);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetModTime7_xBui6() throws IOException {
        TarArchiveEntry tarArchiveEntry = new TarArchiveEntry("name", (byte) 0, true);
        Date date = new Date();
        tarArchiveEntry.setModTime(date);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetModTime8_gsoQ7() throws IOException {
        TarArchiveEntry tarArchiveEntry = new TarArchiveEntry(new File("file"), "fileName");
        Date date = new Date();
        tarArchiveEntry.setModTime(date);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetModTime9_tmhU8() throws IOException {
        TarArchiveEntry tarArchiveEntry = new TarArchiveEntry(new File("file"));
        Date date = new Date();
        tarArchiveEntry.setModTime(date);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetModTime6_eBsE5() throws IOException {
        TarArchiveEntry tarArchiveEntry = new TarArchiveEntry("name", (byte) 0);
        Date modTime = tarArchiveEntry.getModTime();
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetModTime7_sLrO6() throws IOException {
        TarArchiveEntry tarArchiveEntry = new TarArchiveEntry("name", (byte) 0, true);
        Date modTime = tarArchiveEntry.getModTime();
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetModTime8_FMuX7() throws IOException {
        TarArchiveEntry tarArchiveEntry = new TarArchiveEntry(new File("file"), "fileName");
        Date modTime = tarArchiveEntry.getModTime();
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetModTime9_SVPr8() throws IOException {
        TarArchiveEntry tarArchiveEntry = new TarArchiveEntry(new File("file"));
        Date modTime = tarArchiveEntry.getModTime();
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetDevMajor5_vHFC4() {
        TarArchiveEntry tarArchiveEntry = new TarArchiveEntry(new File("file"), "fileName");
        assertEquals(0, tarArchiveEntry.getDevMajor());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testTarUtilsParseName_ndEr6() {
        byte[] header = new byte[0];
        int offset = 0;
        int length = 0;
        String result = TarUtils.parseName(header, offset, length);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testIsFIFOFalse_Qjzw1() {
    TarArchiveEntry entry = new TarArchiveEntry("file", (byte) 0);
    boolean result = entry.isFIFO();
    assert !result;
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetPath2_mQsX1() {
        TarArchiveEntry tarArchiveEntry = new TarArchiveEntry(new File("file"), "fileName");
        assertEquals(new File("file").toPath(), tarArchiveEntry.getPath());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetPath3_mhEx2() {
        TarArchiveEntry tarArchiveEntry = new TarArchiveEntry(new File("file"));
        assertEquals(new File("file").toPath(), tarArchiveEntry.getPath());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetLinkFlag_vtZa0() {
        TarArchiveEntry tarArchiveEntry = new TarArchiveEntry("test", (byte) 0);
        assertEquals((byte) 0, tarArchiveEntry.getLinkFlag());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetLastModifiedDate6_GeVo5() {
        TarArchiveEntry tarArchiveEntry = new TarArchiveEntry(new File("file"), "fileName");
        Date lastModifiedDate = tarArchiveEntry.getLastModifiedDate();
        assert lastModifiedDate != null;
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetLastModifiedDate7_nRKh6() {
        TarArchiveEntry tarArchiveEntry = new TarArchiveEntry(new File("file"));
        Date lastModifiedDate = tarArchiveEntry.getLastModifiedDate();
        assert lastModifiedDate != null;
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testIsLink_LinkFlagIsLF_LINK_ReturnsTrue_pFWG0() {
    TarArchiveEntry tarArchiveEntry = new TarArchiveEntry("name", (byte) TarArchiveEntry.LF_LINK);
    boolean result = tarArchiveEntry.isLink();
    assert result;
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testIsLink_LinkFlagIsNotLF_LINK_ReturnsFalse_KTUy1() {
    TarArchiveEntry tarArchiveEntry = new TarArchiveEntry("name", (byte) 0);
    boolean result = tarArchiveEntry.isLink();
    assert !result;
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetSizeValidSize_CZkc0() {
        TarArchiveEntry entry = new TarArchiveEntry("test", (byte)0);
        entry.setSize(100);
        assertEquals(100, entry.getSize());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetSizeInvalidSize_xxJo1() {
        TarArchiveEntry entry = new TarArchiveEntry("test", (byte)0);
        try {
            entry.setSize(-1);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
        }
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsStreamContiguous_RUPh0() {
        TarArchiveEntry tarArchiveEntry = new TarArchiveEntry("test", (byte) 0);
        assertTrue(tarArchiveEntry.isStreamContiguous());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsStreamContiguous7_jVyS6() {
        TarArchiveEntry tarArchiveEntry = new TarArchiveEntry(new File("test"), "test");
        assertTrue(tarArchiveEntry.isStreamContiguous());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsDirectory_LinkFlagDir_SWcj1() {
        TarArchiveEntry entry = new TarArchiveEntry("name", (byte) TarArchiveEntry.LF_DIR);
        assertTrue(entry.isDirectory());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsDirectory_NameEndsWithSlash_axXj2() {
        TarArchiveEntry entry = new TarArchiveEntry("name/");
        assertTrue(entry.isDirectory());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetName2_iKyF1() {
        TarArchiveEntry tarArchiveEntry = new TarArchiveEntry("test");
        assertEquals("test", tarArchiveEntry.getName());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testIsSymbolicLinkTrue_kEuT0() {
    TarArchiveEntry tarArchiveEntry = new TarArchiveEntry("test", (byte) TarArchiveEntry.LF_SYMLINK);
    boolean result = tarArchiveEntry.isSymbolicLink();
    assert(result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testIsSymbolicLinkFalse_lJkQ1() {
    TarArchiveEntry tarArchiveEntry = new TarArchiveEntry("test", (byte) TarArchiveEntry.LF_DIR);
    boolean result = tarArchiveEntry.isSymbolicLink();
    assert(!result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testParseTarHeaderUnwrappedXstarLenient_wccP12() {
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testTarUtilsParseName_jmjt8() {
        byte[] header = new byte[1024];
        String name = TarUtils.parseName(header, 0, 1);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testTarUtilsVerifyCheckSum_IYJb10() {
        byte[] header = new byte[1024];
        boolean checkSumOK = TarUtils.verifyCheckSum(header);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetLastModifiedTime6_RlSM5() {
        TarArchiveEntry tarArchiveEntry = new TarArchiveEntry(new File("file"), "fileName");
        FileTime fileTime = tarArchiveEntry.getLastModifiedTime();
        assertEquals(fileTime, fileTime);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetLastModifiedTime7_kPiG6() {
        TarArchiveEntry tarArchiveEntry = new TarArchiveEntry(new File("file"));
        FileTime fileTime = tarArchiveEntry.getLastModifiedTime();
        assertEquals(fileTime, fileTime);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetLongUserIdWithUserIdAndLinkFlag_fZYi2() {
        TarArchiveEntry tarArchiveEntry = new TarArchiveEntry("file", (byte) 1);
        assertEquals(0, tarArchiveEntry.getLongUserId());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetLongUserIdWithUserIdAndLinkFlagAndAbsolutePath_MaSq3() {
        TarArchiveEntry tarArchiveEntry = new TarArchiveEntry("file", (byte) 1, true);
        assertEquals(0, tarArchiveEntry.getLongUserId());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetLongUserIdWithUserIdAndFileAndFileName_xwtF9() {
        TarArchiveEntry tarArchiveEntry = new TarArchiveEntry(new File("file"), "fileName");
        assertEquals(0, tarArchiveEntry.getLongUserId());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetLongUserIdWithUserIdAndFile_GIwh10() {
        TarArchiveEntry tarArchiveEntry = new TarArchiveEntry(new File("file"));
        assertEquals(0, tarArchiveEntry.getLongUserId());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetModTime_mQyR0() throws IOException {
        TarArchiveEntry tarArchiveEntry = new TarArchiveEntry(Files.createTempFile("test", ".tmp"), "test.txt");
        FileTime fileTime = Files.getLastModifiedTime(Files.createTempFile("test", ".tmp"));
        tarArchiveEntry.setModTime(fileTime);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetUserId5_niMw4() {
        TarArchiveEntry tarArchiveEntry = new TarArchiveEntry(new File("file"), "fileName");
        assertEquals(0, tarArchiveEntry.getUserId());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetSize_skwR0() {
        TarArchiveEntry entry = new TarArchiveEntry("test", (byte) 0);
        assertEquals(0, entry.getSize());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testEqualsSameObject_xuET0() {
    TarArchiveEntry entry1 = new TarArchiveEntry("test", (byte) 0);
    TarArchiveEntry entry2 = entry1;
    boolean result = entry1.equals(entry2);
    assert result;
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testEqualsDifferentObject_Gigu1() {
    TarArchiveEntry entry1 = new TarArchiveEntry("test", (byte) 0);
    TarArchiveEntry entry2 = new TarArchiveEntry("test2", (byte) 0);
    boolean result = entry1.equals(entry2);
    assert !result;
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testEqualsNull_kjTf2() {
    TarArchiveEntry entry = new TarArchiveEntry("test", (byte) 0);
    boolean result = entry.equals(null);
    assert !result;
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsBlockDevice_uRzx0_fid1() {
        TarArchiveEntry tarArchiveEntry = new TarArchiveEntry("test", (byte) 0);
        assertFalse(tarArchiveEntry.isBlockDevice());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetLinkName6_oQLp5_fid1() {
        TarArchiveEntry tarArchiveEntry = new TarArchiveEntry(new File("file"), "");
        String linkName = tarArchiveEntry.getLinkName();
        assertEquals("", linkName);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetMode_SnXl0_fid1() {
        TarArchiveEntry tarArchiveEntry = new TarArchiveEntry("test", (byte) 0x1ff);
        assertEquals(33188, tarArchiveEntry.getMode());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetDataOffset6_JMrF5_fid1() {
        TarArchiveEntry tarArchiveEntry = new TarArchiveEntry(new File("file"), "file");
        assertEquals(-1, tarArchiveEntry.getDataOffset());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetDevMajor6_EftB5_inNh0() {
    TarArchiveEntry tarArchiveEntry = new TarArchiveEntry(new File("file"));
    assertEquals(0, tarArchiveEntry.getDevMajor());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetPath_AsFR0_opSL0() {
    TarArchiveEntry tarArchiveEntry = new TarArchiveEntry(new File("path"), "fileName");
    assertEquals(new File("path").toPath(), tarArchiveEntry.getPath());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetLongGroupId_qeEQ0_pthA0() {
    TarArchiveEntry tarArchiveEntry = new TarArchiveEntry(new File("file"), "fileName");
    assertEquals(0, tarArchiveEntry.getLongGroupId());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSetDataOffsetPositive_lwxL0_HlLQ0() {
    TarArchiveEntry entry = new TarArchiveEntry(new File("file"), "fileName");
    entry.setDataOffset(100);
    assertEquals(100, entry.getDataOffset());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSetDataOffsetNegative_AXPk1_acTN0() {
    TarArchiveEntry entry = new TarArchiveEntry(new File("file"), "fileName");
    try {
        entry.setDataOffset(-1);
        fail("Expected IllegalArgumentException");
    } catch (IllegalArgumentException e) {
    }
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testIsDescendentNotStartsWith_SzNi1_cxcL0() {
    TarArchiveEntry parent = new TarArchiveEntry("parent");
    TarArchiveEntry child = new TarArchiveEntry("child");
    assertFalse(parent.isDescendent(child));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testIsFile_FileNotNull_pkkt0_PJKk0() {
    TarArchiveEntry tarArchiveEntry = new TarArchiveEntry(new File("path"), "file");
    assertTrue(tarArchiveEntry.isFile());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetGroupName_EVfb0_fJdb1() {
    TarArchiveEntry tarArchiveEntry = new TarArchiveEntry(new File("file"), "fileName");
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testIsExtended_gyRL0_ISPN0() {
    TarArchiveEntry tarArchiveEntry = new TarArchiveEntry(new File("file"), "fileName");
    assertFalse(tarArchiveEntry.isExtended());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testAddPaxHeaderTarGnuSparseKeysREALSIZE_YCvB9_UDJU1() {
    TarArchiveEntry tarArchiveEntry = new TarArchiveEntry(new File(""), "");
    tarArchiveEntry.addPaxHeader(TarGnuSparseKeys.REALSIZE, "2000");
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testIsDirectory_FileNotNull_nFRV0_CFlq0() {
    TarArchiveEntry entry = new TarArchiveEntry(new File("file"), "fileName");
    assertFalse(entry.isDirectory());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetName_Lasb0_MxbF0() {
    TarArchiveEntry tarArchiveEntry = new TarArchiveEntry("test", (byte)0);
    assertEquals("test", tarArchiveEntry.getName());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetUserId6_RRxJ5_lhMi0() {
    TarArchiveEntry tarArchiveEntry = new TarArchiveEntry(new File("file"));
    assertEquals(0, tarArchiveEntry.getUserId());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetGroupId_vrQp0_AHGF0() {
    TarArchiveEntry tarArchiveEntry = new TarArchiveEntry(new File("file"), "fileName");
    assertEquals(0, tarArchiveEntry.getGroupId());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetRealSize_lWaA0_IruF0() {
    TarArchiveEntry tarArchiveEntry = new TarArchiveEntry(new File("path"), "fileName");
    assertEquals(tarArchiveEntry.getSize(), tarArchiveEntry.getRealSize());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetDevMinor_Ozfl0_xStC1() {
    TarArchiveEntry tarArchiveEntry = new TarArchiveEntry(new File("file"), "fileName");
    assertEquals(0, tarArchiveEntry.getDevMinor());
}
}