/**
 * Generated by Aster
 */
package org.apache.commons.compress.changes;

import org.apache.commons.compress.changes.Change.ChangeType;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

import java.util.concurrent.TimeUnit;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_ChangeSet_Test_Passing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetChangesReturnsEmptySetInitially_qakD0() throws Exception {
    ChangeSet changeSet = new ChangeSet();
    assertTrue(changeSet.getChanges().isEmpty());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testDeleteDir_YPDw0() throws Exception {
    ChangeSet changeSet = new ChangeSet();
    changeSet.deleteDir("testDir");
    assertTrue(changeSet.getChanges().contains(new Change<>("testDir", ChangeType.DELETE_DIR)));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testDelete_ValidFileName_DeletionAdded_SuIn0() throws Exception {
    ChangeSet changeSet = new ChangeSet();
    String fileName = "testFile.txt";
    changeSet.delete(fileName);
    assertTrue(changeSet.getChanges().contains(new Change<>(fileName, ChangeType.DELETE)));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAdd_NullEntry_NullStream_fpdI0() throws Exception {
        ChangeSet changeSet = new ChangeSet();
        changeSet.add(null, null);
        assertNotNull(changeSet);
    }
}