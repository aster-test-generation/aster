/**
 * Generated by Aster
 */
package org.apache.commons.compress.archivers.arj;
import org.apache.commons.compress.archivers.ArchiveException;
import static org.junit.jupiter.api.Assertions.*;
import java.util.Date;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_ArjArchiveInputStream_Test_Passing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testMatches_uTfk0() {
		byte[] signature = new byte[2];
		signature[0] = 0x61;
		signature[1] = 0x62;
		assertTrue(ArjArchiveInputStream.matches(signature, 2));
	}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testMatches2_Gpcw1() {
		byte[] signature = new byte[2];
		signature[0] = 0x61;
		signature[1] = 0x63;
		assertFalse(ArjArchiveInputStream.matches(signature, 2));
	}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testMatches3_gpPB2() {
		byte[] signature = new byte[2];
		signature[0] = 0x61;
		signature[1] = 0x61;
		assertFalse(ArjArchiveInputStream.matches(signature, 1));
	}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testMatches4_vsyR3() {
		byte[] signature = new byte[2];
		signature[0] = 0x61;
		signature[1] = 0x61;
		assertFalse(ArjArchiveInputStream.matches(signature, 0));
	}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetLastModifiedDate_dLKS0() {
        ArjArchiveEntry entry = new ArjArchiveEntry();
        Date lastModifiedDate = entry.getLastModifiedDate();
        assertNotNull(lastModifiedDate);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetSize_chFs1() {
        ArjArchiveEntry entry = new ArjArchiveEntry();
        long size = entry.getSize();
        assertEquals(0, size);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetHostOs_sRFy2() {
        ArjArchiveEntry entry = new ArjArchiveEntry();
        int hostOs = entry.getHostOs();
        assertEquals(0, hostOs);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHashCode_ogAZ3() {
        ArjArchiveEntry entry = new ArjArchiveEntry();
        int hashCode = entry.hashCode();
        assertEquals(0, hashCode);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetUnixMode_nVOX4() {
        ArjArchiveEntry entry = new ArjArchiveEntry();
        int unixMode = entry.getUnixMode();
        assertEquals(0, unixMode);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetName_Wxha5() {
        ArjArchiveEntry entry = new ArjArchiveEntry();
        String name = entry.getName();
        assertTrue(name.isEmpty());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetMode_fTJV6() {
        ArjArchiveEntry entry = new ArjArchiveEntry();
        int mode = entry.getMode();
        assertEquals(0, mode);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetArchiveName_fdOW0_zjMC0() {
        ArjArchiveInputStream arjArchiveInputStream = null;
        try {
            arjArchiveInputStream = new ArjArchiveInputStream(null);
        } catch (ArchiveException e) {
            e.printStackTrace();
        }
        assertEquals("mainHeader.name", arjArchiveInputStream.getArchiveName());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetArchiveNameWithCharset_ELAR1_gFfF0() {
        ArjArchiveInputStream arjArchiveInputStream = null;
        try {
            arjArchiveInputStream = new ArjArchiveInputStream(null, "UTF-8");
        } catch (ArchiveException e) {
            e.printStackTrace();
        }
        assertEquals("mainHeader.name", arjArchiveInputStream.getArchiveName());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCanReadEntryData_NullEntry_yKhr2_uPGP0() {
        ArjArchiveInputStream stream = null;
        boolean result = false;
        try {
            stream = new ArjArchiveInputStream(null);
            result = stream.canReadEntryData(null);
        } catch (ArchiveException e) {
            e.printStackTrace();
        }
        assertFalse(result);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testgetArchiveComment_xjpz0_kPmu0() {
        ArjArchiveInputStream arjArchiveInputStream = null;
        try {
            arjArchiveInputStream = new ArjArchiveInputStream(null);
        } catch (ArchiveException e) {
            e.printStackTrace();
        }
        String result = arjArchiveInputStream.getArchiveComment();
        assertEquals("", result);
    }
}