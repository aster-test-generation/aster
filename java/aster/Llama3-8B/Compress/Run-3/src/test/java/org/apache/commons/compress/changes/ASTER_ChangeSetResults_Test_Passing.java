/**
 * Generated by Aster
 */
package org.apache.commons.compress.changes;
import java.util.List;
import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.mockito.Mockito.when;
import static org.mockito.Mockito.when;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_ChangeSetResults_Test_Passing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAddedFromChangeSet_iEqp0() {
        ChangeSetResults changeSetResults = new ChangeSetResults();
        changeSetResults.addedFromChangeSet("testFile.txt");
        assertEquals("testFile.txt", changeSetResults.getAddedFromChangeSet().get(0));
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHasBeenAddedFalse_DgXx1() {
        ChangeSetResults changeSetResults = new ChangeSetResults();
        boolean result = changeSetResults.hasBeenAdded("file1.txt");
        assertEquals(false, result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetAddedFromChangeSet_SDmR0() {
        ChangeSetResults changeSetResults = new ChangeSetResults();
        List<String> expected = Arrays.asList("added1", "added2");
        when(changeSetResults.getAddedFromChangeSet()).thenReturn(expected);
        List<String> actual = changeSetResults.getAddedFromChangeSet();
        assertEquals(expected, actual);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetAddedFromStream_Vrdq0() {
        ChangeSetResults changeSetResults = new ChangeSetResults();
        List<String> addedFromStream = changeSetResults.getAddedFromStream();
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetDeleted_HdVg0() {
        ChangeSetResults changeSetResults = new ChangeSetResults();
        List<String> deleted = changeSetResults.getDeleted();
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAddedFromStream_hSpB0() {
        ChangeSetResults changeSetResults = new ChangeSetResults();
        changeSetResults.addedFromStream("testFile.txt");
        assertEquals("testFile.txt", changeSetResults.getAddedFromStream().get(0));
    }
}