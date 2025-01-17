/**
 * Generated by Aster
 */
package org.apache.commons.compress.archivers.arj;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

import java.util.concurrent.TimeUnit;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_ArjArchiveEntry_Test_Failing {
private ArjArchiveEntry archiveEntry;
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEqualsWithDifferentObject_ZUaM3() {
        ArjArchiveEntry entry1 = new ArjArchiveEntry();
        ArjArchiveEntry entry2 = new ArjArchiveEntry();
        assertFalse(entry1.equals(entry2));
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsHostOsUnix_qdps0() {
        ArjArchiveEntry entry = new ArjArchiveEntry();
        assertTrue(entry.isHostOsUnix());
    }
}