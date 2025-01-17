/**
 * Generated by Aster
 */
package org.apache.commons.compress.archivers.arj;
import java.util.Date;
import org.apache.commons.compress.archivers.zip.ZipUtil;
import static org.junit.jupiter.api.Assertions.*;
import java.util.Date;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_ArjArchiveEntry_Test_Passing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEqualsWithSameObject_cBCo0() {
        ArjArchiveEntry entry = new ArjArchiveEntry();
        boolean result = entry.equals(entry);
        assertTrue(result);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEqualsWithNull_HfRF1() {
        ArjArchiveEntry entry = new ArjArchiveEntry();
        boolean result = entry.equals(null);
        assertFalse(result);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEqualsWithDifferentClass_jIor2() {
        ArjArchiveEntry entry = new ArjArchiveEntry();
        Object obj = new Object();
        boolean result = entry.equals(obj);
        assertFalse(result);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEqualsWithDifferentObject_vxHv3() {
        ArjArchiveEntry entry1 = new ArjArchiveEntry();
        ArjArchiveEntry entry2 = new ArjArchiveEntry();
        boolean result = entry1.equals(entry2);
        assertFalse(result);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetLastModifiedDate_xGjU0() {
        ArjArchiveEntry entry = new ArjArchiveEntry();
        Date expectedDate = new Date(1234567890L); // Replace with actual expected date
        assertEquals(expectedDate, entry.getLastModifiedDate());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetLastModifiedDateWithInvalidDate_Mcgm1() {
        ArjArchiveEntry entry = new ArjArchiveEntry();
        long invalidDate = 0; // Replace with actual invalid date
        final long ts = entry.isHostOsUnix() ? invalidDate * 1000L : ZipUtil.dosToJavaTime(0xFFFFFFFFL & invalidDate);
        Date expectedDate = new Date(ts);
        assertEquals(expectedDate, entry.getLastModifiedDate());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testGetHostOs_XgWU0() {
		ArjArchiveEntry entry = new ArjArchiveEntry();
		int hostOs = entry.getHostOs();
		assertEquals(0, hostOs);
	}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsHostOsUnix_Mrua0() {
        ArjArchiveEntry entry = new ArjArchiveEntry();
        entry.isHostOsUnix();
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetMode_gjby1() {
        ArjArchiveEntry entry = new ArjArchiveEntry();
        entry.getMode();
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsHostOsUnix_UJNm0() {
        ArjArchiveEntry entry = new ArjArchiveEntry();
        assertTrue(entry.isHostOsUnix());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetMode_yPtH0() {
        ArjArchiveEntry entry = new ArjArchiveEntry();
        int mode = entry.getMode();
        assertEquals(0, mode);
    }
}