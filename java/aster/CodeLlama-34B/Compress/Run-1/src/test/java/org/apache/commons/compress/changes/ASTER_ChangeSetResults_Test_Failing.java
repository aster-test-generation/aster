/**
 * Generated by Aster
 */
package org.apache.commons.compress.changes;
import java.util.ArrayList;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;
import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_ChangeSetResults_Test_Failing {
    private List<String> deleted = new ArrayList<>();
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetDeleted_NonEmptyList_mzQF1_1() {
    ChangeSetResults changeSetResults = new ChangeSetResults();
    List<String> deleted = changeSetResults.getDeleted();
    assertFalse(deleted.isEmpty());}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetDeleted_NonEmptyList_mzQF1_2() {
    ChangeSetResults changeSetResults = new ChangeSetResults();
    List<String> deleted = changeSetResults.getDeleted();
    assertEquals(1, deleted.size());}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetDeleted_NonEmptyList_mzQF1_3() {
    ChangeSetResults changeSetResults = new ChangeSetResults();
    List<String> deleted = changeSetResults.getDeleted();
    assertEquals("deleted", deleted.get(0));}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetDeleted_Null_IGwc2() {
    ChangeSetResults changeSetResults = new ChangeSetResults();
    List<String> deleted = changeSetResults.getDeleted();
    assertNull(deleted);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testAddedFromStream_emptyString_OqXP0() {
    ChangeSetResults changeSetResults = new ChangeSetResults();
    changeSetResults.addedFromStream("");
    assertEquals(0, changeSetResults.getAddedFromStream().size());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testAddedFromStream_nullString_eGwv1() {
    ChangeSetResults changeSetResults = new ChangeSetResults();
    changeSetResults.addedFromStream(null);
    assertEquals(0, changeSetResults.getAddedFromStream().size());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testAddedFromStream_duplicateString_JRlZ3_1() {
    ChangeSetResults changeSetResults = new ChangeSetResults();
    changeSetResults.addedFromStream("file1.txt");
    changeSetResults.addedFromStream("file1.txt");
    assertEquals(1, changeSetResults.getAddedFromStream().size());}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testAddedFromStream_multipleStringsWithDuplicates_UJwA5_1() {
    ChangeSetResults changeSetResults = new ChangeSetResults();
    changeSetResults.addedFromStream("file1.txt");
    changeSetResults.addedFromStream("file2.txt");
    changeSetResults.addedFromStream("file1.txt");
    assertEquals(2, changeSetResults.getAddedFromStream().size());}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testAddedFromStream_multipleStringsWithDuplicatesAndNull_xbcs6_1() {
    ChangeSetResults changeSetResults = new ChangeSetResults();
    changeSetResults.addedFromStream("file1.txt");
    changeSetResults.addedFromStream("file2.txt");
    changeSetResults.addedFromStream("file1.txt");
    changeSetResults.addedFromStream(null);
    assertEquals(2, changeSetResults.getAddedFromStream().size());}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testAddedFromStream_multipleStringsWithDuplicatesAndEmpty_fkoP7_1() {
    ChangeSetResults changeSetResults = new ChangeSetResults();
    changeSetResults.addedFromStream("file1.txt");
    changeSetResults.addedFromStream("file2.txt");
    changeSetResults.addedFromStream("file1.txt");
    changeSetResults.addedFromStream("");
    assertEquals(2, changeSetResults.getAddedFromStream().size());}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetAddedFromChangeSetWithDuplicateElements_vFWO3_uZxV0_1() {
    ChangeSetResults changeSetResults = new ChangeSetResults();
    changeSetResults.deleted("added1");
    changeSetResults.deleted("added1");
    List<String> addedFromChangeSet = changeSetResults.getAddedFromChangeSet();
    assertEquals(1, addedFromChangeSet.size());}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetAddedFromChangeSetWithDuplicateElements_vFWO3_uZxV0_2() {
    ChangeSetResults changeSetResults = new ChangeSetResults();
    changeSetResults.deleted("added1");
    changeSetResults.deleted("added1");
    List<String> addedFromChangeSet = changeSetResults.getAddedFromChangeSet();
    assertEquals("added1", addedFromChangeSet.get(0));}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetDeleted_NonEmptyList_mzQF1() {
    ChangeSetResults changeSetResults = new ChangeSetResults();
    List<String> deleted = changeSetResults.getDeleted();
    assertFalse(deleted.isEmpty());
    assertEquals(1, deleted.size());
    assertEquals("deleted", deleted.get(0));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testAddedFromStream_duplicateString_JRlZ3() {
    ChangeSetResults changeSetResults = new ChangeSetResults();
    changeSetResults.addedFromStream("file1.txt");
    changeSetResults.addedFromStream("file1.txt");
    assertEquals(1, changeSetResults.getAddedFromStream().size());
    assertEquals("file1.txt", changeSetResults.getAddedFromStream().get(0));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testAddedFromStream_multipleStringsWithDuplicates_UJwA5() {
    ChangeSetResults changeSetResults = new ChangeSetResults();
    changeSetResults.addedFromStream("file1.txt");
    changeSetResults.addedFromStream("file2.txt");
    changeSetResults.addedFromStream("file1.txt");
    assertEquals(2, changeSetResults.getAddedFromStream().size());
    assertEquals("file1.txt", changeSetResults.getAddedFromStream().get(0));
    assertEquals("file2.txt", changeSetResults.getAddedFromStream().get(1));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testAddedFromStream_multipleStringsWithDuplicatesAndNull_xbcs6() {
    ChangeSetResults changeSetResults = new ChangeSetResults();
    changeSetResults.addedFromStream("file1.txt");
    changeSetResults.addedFromStream("file2.txt");
    changeSetResults.addedFromStream("file1.txt");
    changeSetResults.addedFromStream(null);
    assertEquals(2, changeSetResults.getAddedFromStream().size());
    assertEquals("file1.txt", changeSetResults.getAddedFromStream().get(0));
    assertEquals("file2.txt", changeSetResults.getAddedFromStream().get(1));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testAddedFromStream_multipleStringsWithDuplicatesAndEmpty_fkoP7() {
    ChangeSetResults changeSetResults = new ChangeSetResults();
    changeSetResults.addedFromStream("file1.txt");
    changeSetResults.addedFromStream("file2.txt");
    changeSetResults.addedFromStream("file1.txt");
    changeSetResults.addedFromStream("");
    assertEquals(2, changeSetResults.getAddedFromStream().size());
    assertEquals("file1.txt", changeSetResults.getAddedFromStream().get(0));
    assertEquals("file2.txt", changeSetResults.getAddedFromStream().get(1));
}
}