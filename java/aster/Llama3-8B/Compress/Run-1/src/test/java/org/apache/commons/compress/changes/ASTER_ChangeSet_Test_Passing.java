/**
 * Generated by Aster
 */
package org.apache.commons.compress.changes;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_ChangeSet_Test_Passing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDelete_XTAC0() {
        ChangeSet changeSet = new ChangeSet();
        changeSet.delete("file.txt");
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDeleteDir_xGvw1() {
        ChangeSet changeSet = new ChangeSet();
        changeSet.delete("dir/subdir");
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testAddValidEntryAndNullInputStream_TNMM2_ZmEU0() {
    ChangeSet changeSet = new ChangeSet();
    changeSet.delete("entry");
}
}