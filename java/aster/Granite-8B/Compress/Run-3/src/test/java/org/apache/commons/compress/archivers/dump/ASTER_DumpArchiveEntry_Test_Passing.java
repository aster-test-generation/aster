/**
 * Generated by Aster
 */
package org.apache.commons.compress.archivers.dump;
import java.util.Date;
import java.util.Set;
import static org.junit.jupiter.api.Assertions.*;
import java.util.Date;
import java.util.Set;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_DumpArchiveEntry_Test_Passing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void test_getOffset_2_nFlQ1() throws Exception {
        DumpArchiveEntry dumpArchiveEntry = new DumpArchiveEntry("name", "simpleName");
        long offset = dumpArchiveEntry.getOffset();
        assertEquals(0, offset);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetName_kxxT0() throws Exception {
        DumpArchiveEntry entry = new DumpArchiveEntry("name", "simpleName");
        assertEquals("name", entry.getName());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEqualsWithNull_JfEm0() throws Exception {
        DumpArchiveEntry entry = new DumpArchiveEntry();
        boolean result = entry.equals(null);
        assertFalse(result);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEqualsWithDifferentClass_teGs1() throws Exception {
        DumpArchiveEntry entry = new DumpArchiveEntry();
        boolean result = entry.equals(new Object());
        assertFalse(result);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEqualsWithSameObject_MjPd2() throws Exception {
        DumpArchiveEntry entry = new DumpArchiveEntry();
        boolean result = entry.equals(entry);
        assertTrue(result);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testToStringNoType_nLxl11() throws Exception {
        DumpArchiveEntry entry = new DumpArchiveEntry("name", "simpleName", 1, null);
        assertEquals("name", entry.toString());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testgetSimpleName_VwGA0() throws Exception {
        DumpArchiveEntry entry = new DumpArchiveEntry("name", "simpleName");
        assertEquals("simpleName", entry.getSimpleName());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetNlinkNoType_yiGZ8() throws Exception {
        DumpArchiveEntry entry = new DumpArchiveEntry("name", "simpleName", 1, null);
        assertEquals(1, entry.getNlink());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetName_DfMU0() throws Exception {
        DumpArchiveEntry entry = new DumpArchiveEntry();
        entry.setName("test.txt");
        assertEquals("test.txt", entry.getName());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetNameWithDirectory_jAhb1() throws Exception {
        DumpArchiveEntry entry = new DumpArchiveEntry();
        entry.setName("test/");
        assertEquals("test/", entry.getName());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetNameWithleadingSlash_dwrd2() throws Exception {
        DumpArchiveEntry entry = new DumpArchiveEntry();
        entry.setName("/test.txt");
        assertEquals("test.txt", entry.getName());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetNameWithleadingDoubleSlash_XxWc3() throws Exception {
        DumpArchiveEntry entry = new DumpArchiveEntry();
        entry.setName("//test.txt");
        assertEquals("test.txt", entry.getName());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetNameWithleadingPeriodAndSlash_KUAz4() throws Exception {
        DumpArchiveEntry entry = new DumpArchiveEntry();
        entry.setName("./test.txt");
        assertEquals("test.txt", entry.getName());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetSize_Vwkd0() throws Exception {
        DumpArchiveEntry entry = new DumpArchiveEntry("name", "simpleName");
        entry.setSize(100L);
        assertEquals(100L, entry.getSize());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetSizeWithNegativeNumber_RKoV1() throws Exception {
        DumpArchiveEntry entry = new DumpArchiveEntry("name", "simpleName");
        entry.setSize(-100L);
        assertEquals(-100L, entry.getSize());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetSizeWithZero_uIeG2() throws Exception {
        DumpArchiveEntry entry = new DumpArchiveEntry("name", "simpleName");
        entry.setSize(0L);
        assertEquals(0L, entry.getSize());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetSizeWithMaximumValue_CuvK3() throws Exception {
        DumpArchiveEntry entry = new DumpArchiveEntry("name", "simpleName");
        entry.setSize(Long.MAX_VALUE);
        assertEquals(Long.MAX_VALUE, entry.getSize());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetSizeWithMinimumValue_xCWo4() throws Exception {
        DumpArchiveEntry entry = new DumpArchiveEntry("name", "simpleName");
        entry.setSize(Long.MIN_VALUE);
        assertEquals(Long.MIN_VALUE, entry.getSize());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetUserId2_DGgr1() throws Exception {
        DumpArchiveEntry entry = new DumpArchiveEntry("name", "simpleName");
        int userId = entry.getUserId();
        assertEquals(0, userId);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testgetHeaderCount2_unIg1() throws Exception {
        DumpArchiveEntry entry = new DumpArchiveEntry("name", "simpleName");
        assertEquals(0, entry.getHeaderCount());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testgetHeaderCount3_ZMER2() throws Exception {
        DumpArchiveEntry entry = new DumpArchiveEntry();
        assertEquals(0, entry.getHeaderCount());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testParse_ewzv0() throws Exception {
        byte[] buffer = new byte[1024];
        DumpArchiveEntry entry = DumpArchiveEntry.parse(buffer);
        assertNotNull(entry);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetOffset_dqCj1() throws Exception {
        byte[] buffer = new byte[1024];
        DumpArchiveEntry entry = DumpArchiveEntry.parse(buffer);
        long offset = entry.getOffset();
        assertEquals(0, offset);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetName_xiQZ2() throws Exception {
        byte[] buffer = new byte[1024];
        DumpArchiveEntry entry = DumpArchiveEntry.parse(buffer);
        String name = entry.getName();
        assertEquals("", name);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetLastModifiedDate_LQqb3() throws Exception {
        byte[] buffer = new byte[1024];
        DumpArchiveEntry entry = DumpArchiveEntry.parse(buffer);
        Date lastModified = entry.getLastModifiedDate();
        assertNotNull(lastModified);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetGeneration_hOVG4() throws Exception {
        byte[] buffer = new byte[1024];
        DumpArchiveEntry entry = DumpArchiveEntry.parse(buffer);
        int generation = entry.getGeneration();
        assertEquals(0, generation);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetIno_pDyv5() throws Exception {
        byte[] buffer = new byte[1024];
        DumpArchiveEntry entry = DumpArchiveEntry.parse(buffer);
        int ino = entry.getIno();
        assertEquals(0, ino);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetSimpleName_qtFP6() throws Exception {
        byte[] buffer = new byte[1024];
        DumpArchiveEntry entry = DumpArchiveEntry.parse(buffer);
        String simpleName = entry.getSimpleName();
        assertEquals("", simpleName);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetNlink_TfUT7() throws Exception {
        byte[] buffer = new byte[1024];
        DumpArchiveEntry entry = DumpArchiveEntry.parse(buffer);
        int nlink = entry.getNlink();
        assertEquals(0, nlink);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetMode_LcWD8() throws Exception {
        byte[] buffer = new byte[1024];
        DumpArchiveEntry entry = DumpArchiveEntry.parse(buffer);
        int mode = entry.getMode();
        assertEquals(0, mode);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetGroupId_urYf9() throws Exception {
        byte[] buffer = new byte[1024];
        DumpArchiveEntry entry = DumpArchiveEntry.parse(buffer);
        int groupId = entry.getGroupId();
        assertEquals(0, groupId);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetPermissions_zQNX10() throws Exception {
        byte[] buffer = new byte[1024];
        DumpArchiveEntry entry = DumpArchiveEntry.parse(buffer);
        Set<DumpArchiveEntry.PERMISSION> permissions = entry.getPermissions();
        assertNotNull(permissions);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetUserId_VuPE11() throws Exception {
        byte[] buffer = new byte[1024];
        DumpArchiveEntry entry = DumpArchiveEntry.parse(buffer);
        int userId = entry.getUserId();
        assertEquals(0, userId);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHashCode_VOVs12() throws Exception {
        byte[] buffer = new byte[1024];
        DumpArchiveEntry entry = DumpArchiveEntry.parse(buffer);
        int hashCode = entry.hashCode();
        assertEquals(0, hashCode);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetHeaderCount_EPXJ13() throws Exception {
        byte[] buffer = new byte[1024];
        DumpArchiveEntry entry = DumpArchiveEntry.parse(buffer);
        int headerCount = entry.getHeaderCount();
        assertEquals(0, headerCount);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetHeaderHoles_KliY16() throws Exception {
        byte[] buffer = new byte[1024];
        DumpArchiveEntry entry = DumpArchiveEntry.parse(buffer);
        int headerHoles = entry.getHeaderHoles();
        assertEquals(0, headerHoles);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testgetOriginalName_BkgY0() throws Exception {
        DumpArchiveEntry entry = new DumpArchiveEntry("name", "simpleName");
        assertEquals("name", entry.getOriginalName());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetHeaderHoles10_iZlE9() throws Exception {
        DumpArchiveEntry entry = new DumpArchiveEntry("name", "simpleName");
        assertEquals(0, entry.getHeaderHoles());
    }
}