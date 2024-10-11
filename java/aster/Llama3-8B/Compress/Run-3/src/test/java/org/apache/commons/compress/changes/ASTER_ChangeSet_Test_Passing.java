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
public void testAddNullEntry_aJuc0() {
    ChangeSet changeSet = new ChangeSet();
    changeSet.add(null, null, false);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDelete_SdsP0() {
        ChangeSet changeSet = new ChangeSet();
        changeSet.delete("testFile.txt");
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testAddNullEntry_VCHd0_pNNJ1() {
    ChangeSet changeSet = new ChangeSet();
    changeSet.add(null, null);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testAddValidEntryNullInputStreamValidFlag_FDNc9_jOLU1() {
    ChangeSet changeSet = new ChangeSet();
    changeSet.add(null, null, true);
}
}