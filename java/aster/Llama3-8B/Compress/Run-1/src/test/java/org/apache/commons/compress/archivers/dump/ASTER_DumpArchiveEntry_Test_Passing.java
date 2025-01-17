/**
 * Generated by Aster
 */
package org.apache.commons.compress.archivers.dump;
import java.util.Date;
import static org.junit.jupiter.api.Assertions.*;
import java.util.Date;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_DumpArchiveEntry_Test_Passing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetOffset_soGr0() {
        DumpArchiveEntry dumpArchiveEntry = new DumpArchiveEntry("name", "simpleName");
        assertEquals(0, dumpArchiveEntry.getOffset());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetAccessTime_GiTW0() {
        DumpArchiveEntry dumpArchiveEntry = new DumpArchiveEntry("name", "simpleName");
        Date date = new Date();
        dumpArchiveEntry.setAccessTime(date);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetName_svOt0() {
        DumpArchiveEntry dumpArchiveEntry = new DumpArchiveEntry("testName", "testSimpleName");
        assertEquals("testName", dumpArchiveEntry.getName());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetCreationTime_mvHa0() {
        DumpArchiveEntry dumpArchiveEntry = new DumpArchiveEntry("name", "simpleName");
        Date date = new Date();
        dumpArchiveEntry.setCreationTime(date);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testIsDirectoryFalse_cZGX1() {
    DumpArchiveEntry dumpArchiveEntry = new DumpArchiveEntry("name", "simpleName");
    boolean result = dumpArchiveEntry.isDirectory();
    assert result == false;
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testEqualsSameObject_FaTO0() {
    DumpArchiveEntry entry = new DumpArchiveEntry("name", "simpleName");
    boolean result = entry.equals(entry);
    assert result;
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testEqualsNull_kdPD1() {
    DumpArchiveEntry entry = new DumpArchiveEntry("name", "simpleName");
    boolean result = entry.equals(null);
    assert !result;
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testEqualsDifferentClass_hNdH2() {
    DumpArchiveEntry entry = new DumpArchiveEntry("name", "simpleName");
    boolean result = entry.equals(new Object());
    assert !result;
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetLastModifiedDate_wYdh0() {
        DumpArchiveEntry dumpArchiveEntry = new DumpArchiveEntry("name", "simpleName");
        Date lastModifiedDate = dumpArchiveEntry.getLastModifiedDate();
        assert lastModifiedDate != null;
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testToString_nmph0() {
        DumpArchiveEntry entry = new DumpArchiveEntry("name", "simpleName");
        assertEquals("name", entry.toString());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetGeneration_WkUG0() {
        DumpArchiveEntry dumpArchiveEntry = new DumpArchiveEntry("name", "simpleName");
        assertEquals(0, dumpArchiveEntry.getGeneration());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetSimpleName_CDQg0() {
        DumpArchiveEntry dumpArchiveEntry = new DumpArchiveEntry("name", "oldSimpleName");
        dumpArchiveEntry.setSimpleName("newSimpleName");
        assertEquals("newSimpleName", dumpArchiveEntry.getSimpleName());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetSimpleName_nyFg0() {
        DumpArchiveEntry dumpArchiveEntry = new DumpArchiveEntry("name", "simpleName");
        String simpleName = dumpArchiveEntry.getSimpleName();
        assert "simpleName".equals(simpleName);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetNlink_fGwk0() {
        DumpArchiveEntry dumpArchiveEntry = new DumpArchiveEntry("name", "simpleName");
        assertEquals(0, dumpArchiveEntry.getNlink());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetGeneration_SlkN0() {
        DumpArchiveEntry dumpArchiveEntry = new DumpArchiveEntry("name", "simpleName");
        dumpArchiveEntry.setGeneration(10);
        assertEquals(10, dumpArchiveEntry.getGeneration());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetEntrySize_PvcC0() {
        DumpArchiveEntry dumpArchiveEntry = new DumpArchiveEntry("name", "simpleName");
        assertEquals(0, dumpArchiveEntry.getEntrySize());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetGroupId_MisB0() {
        DumpArchiveEntry dumpArchiveEntry = new DumpArchiveEntry("name", "simpleName");
        assertEquals(0, dumpArchiveEntry.getGroupId());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSetNameNull_Hgaw0() {
    DumpArchiveEntry dumpArchiveEntry = new DumpArchiveEntry("name", "simpleName");
    dumpArchiveEntry.setName(null);
    Assertions.assertNull(dumpArchiveEntry.getName());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSetNameEmpty_TXoC1() {
    DumpArchiveEntry dumpArchiveEntry = new DumpArchiveEntry("name", "simpleName");
    dumpArchiveEntry.setName("");
    Assertions.assertEquals("", dumpArchiveEntry.getName());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSetNameWithSlash_zHSj2() {
    DumpArchiveEntry dumpArchiveEntry = new DumpArchiveEntry("name", "simpleName");
    dumpArchiveEntry.setName("directory/");
    Assertions.assertEquals("directory/", dumpArchiveEntry.getName());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSetNameWithoutSlash_GlVT3() {
    DumpArchiveEntry dumpArchiveEntry = new DumpArchiveEntry("name", "simpleName");
    dumpArchiveEntry.setName("directory");
    Assertions.assertEquals("directory", dumpArchiveEntry.getName());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSetNameWithDotSlash_dpRU4() {
    DumpArchiveEntry dumpArchiveEntry = new DumpArchiveEntry("name", "simpleName");
    dumpArchiveEntry.setName("./directory");
    Assertions.assertEquals("directory", dumpArchiveEntry.getName());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetSize_AroS0() {
        DumpArchiveEntry dumpArchiveEntry = new DumpArchiveEntry("test", "test");
        dumpArchiveEntry.setSize(123L);
        assertEquals(123L, dumpArchiveEntry.getSize());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetNlink_mNyO0() {
        DumpArchiveEntry dumpArchiveEntry = new DumpArchiveEntry("name", "simpleName");
        dumpArchiveEntry.setNlink(5);
        assert dumpArchiveEntry.getNlink() == 5;
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsSparseRecordTrue_vECB0() {
        DumpArchiveEntry dumpArchiveEntry = new DumpArchiveEntry("name", "simpleName");
        boolean result = dumpArchiveEntry.isSparseRecord(0);
        assertTrue(result);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetUserId_UYRW0() {
        DumpArchiveEntry dumpArchiveEntry = new DumpArchiveEntry("name", "simpleName");
        assertEquals(0, dumpArchiveEntry.getUserId());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetUserId_qedD0() {
        DumpArchiveEntry dumpArchiveEntry = new DumpArchiveEntry("name", "simpleName");
        dumpArchiveEntry.setUserId(1);
        assertEquals(1, dumpArchiveEntry.getUserId());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetLastModifiedDate_EmKA0() {
        DumpArchiveEntry dumpArchiveEntry = new DumpArchiveEntry("name", "simpleName");
        Date date = new Date();
        dumpArchiveEntry.setLastModifiedDate(date);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testParseNullBuffer_dqHG2() {
    byte[] buffer = null;
    try {
        DumpArchiveEntry.parse(buffer);
        fail("Expected NullPointerException");
    } catch (NullPointerException e) {
    }
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testParseEmptyBuffer_qBVj3() {
    byte[] buffer = new byte[0];
    try {
        DumpArchiveEntry.parse(buffer);
        fail("Expected IndexOutOfBoundsException");
    } catch (IndexOutOfBoundsException e) {
    }
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetDeleted_huey0() {
        DumpArchiveEntry dumpArchiveEntry = new DumpArchiveEntry("name", "simpleName");
        dumpArchiveEntry.setDeleted(true);
        assertEquals(true, dumpArchiveEntry.isDeleted());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetOriginalName_tgsg0() {
        DumpArchiveEntry dumpArchiveEntry = new DumpArchiveEntry("name", "simpleName");
        String result = dumpArchiveEntry.getOriginalName();
        assert result.equals("name");
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetHeaderHoles_xVnm0() {
        DumpArchiveEntry dumpArchiveEntry = new DumpArchiveEntry("name", "simpleName");
        int result = dumpArchiveEntry.getHeaderHoles();
        assertEquals(0, result);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetCreationTime_pAvY0() {
        DumpArchiveEntry dumpArchiveEntry = new DumpArchiveEntry("name", "simpleName");
        Date creationTime = dumpArchiveEntry.getCreationTime();
        assert creationTime != null;
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetVolume_UYAc0() {
        DumpArchiveEntry dumpArchiveEntry = new DumpArchiveEntry("name", "simpleName");
        assertEquals(0, dumpArchiveEntry.getVolume());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testIsDeleted_Azym0_NIbp0() {
    DumpArchiveEntry dumpArchiveEntry = new DumpArchiveEntry("name", "simpleName");
    dumpArchiveEntry.setDeleted(true);
    assertTrue(dumpArchiveEntry.isDeleted());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSetOffset_HPwk0_ADfv0() {
    DumpArchiveEntry dumpArchiveEntry = new DumpArchiveEntry("name", "simpleName");
    dumpArchiveEntry.setOffset(123L);
    org.junit.Assert.assertEquals(123L, dumpArchiveEntry.getOffset());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSetType_XNXT0_Odyd0() {
    DumpArchiveEntry dumpArchiveEntry = new DumpArchiveEntry("name", "simpleName");
    DumpArchiveEntry.TYPE type = DumpArchiveEntry.TYPE.WHITEOUT;
    dumpArchiveEntry.setType(type);
    org.junit.Assert.assertEquals(type, dumpArchiveEntry.getType());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetIno_SGAR0_FmZX0() {
    DumpArchiveEntry dumpArchiveEntry = new DumpArchiveEntry("name", "simpleName");
    int ino = dumpArchiveEntry.getIno();
    assert ino == 0;
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testIsBlkDevFalse_afJC1_USdm0() {
    DumpArchiveEntry dumpArchiveEntry = new DumpArchiveEntry("name", "simpleName", 1, DumpArchiveEntry.TYPE.FILE);
    boolean result = dumpArchiveEntry.isBlkDev();
    assert(!result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetHeaderCount_USpQ0_EWSF0_1() {
    DumpArchiveEntry dumpArchiveEntry = new DumpArchiveEntry("name", "simpleName");
    Date result = dumpArchiveEntry.getAccessTime();
    org.junit.Assert.assertNotNull(result);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSetGroupId_iHpA0_vFff0() {
    DumpArchiveEntry dumpArchiveEntry = new DumpArchiveEntry("test", "test");
    dumpArchiveEntry.setGroupId(123);
    org.junit.Assert.assertEquals(123, dumpArchiveEntry.getGroupId());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetType2_LZDo1_AWeE0() {
    DumpArchiveEntry dumpArchiveEntry = new DumpArchiveEntry("name", "simpleName");
    assertEquals(DumpArchiveEntry.TYPE.UNKNOWN, dumpArchiveEntry.getType());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetAccessTime_gTyg0_eVXX0() {
    DumpArchiveEntry dumpArchiveEntry = new DumpArchiveEntry("name", "simpleName");
    Date accessTime = dumpArchiveEntry.getAccessTime();
    org.junit.Assert.assertNotNull(accessTime);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetType_THma0_bVvT0_fid2() {
    DumpArchiveEntry dumpArchiveEntry = new DumpArchiveEntry("name", "simpleName");
}
}