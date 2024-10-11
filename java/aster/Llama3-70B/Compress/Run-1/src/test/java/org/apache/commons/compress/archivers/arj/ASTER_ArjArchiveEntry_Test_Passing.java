/**
 * Generated by Aster
 */
package org.apache.commons.compress.archivers.arj;
import static org.junit.jupiter.api.Assertions.assertFalse;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_ArjArchiveEntry_Test_Passing {
    private int hostOsValue;
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testEquals_SameObject_ReturnTrue_oxsQ0() {
    ArjArchiveEntry entry = new ArjArchiveEntry();
    assert entry.equals(entry);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testEquals_NullObject_ReturnFalse_HfjY1() {
    ArjArchiveEntry entry = new ArjArchiveEntry();
    assert !entry.equals(null);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testEquals_DifferentClass_ReturnFalse_ZITY2() {
    ArjArchiveEntry entry = new ArjArchiveEntry();
    Object obj = new Object();
    assert !entry.equals(obj);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testIsHostOsUnix_ETMD0_fid1() {
    ArjArchiveEntry entry = new ArjArchiveEntry();
    entry.getHostOs(); // Initialize getHostOs() for entry
    assertFalse(entry.isHostOsUnix());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testIsHostOsUnix_crwp0_fid1() {
    ArjArchiveEntry arjArchiveEntry = new ArjArchiveEntry();
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testIsHostOsUnix_ctVs0_fid1() {
    ArjArchiveEntry arjArchiveEntry = new ArjArchiveEntry();
    assertFalse(arjArchiveEntry.isHostOsUnix());
}
}