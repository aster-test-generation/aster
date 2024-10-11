/**
 * Generated by Aster
 */
package org.eclipse.cargotracker.interfaces.handling.file;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_EventFilesCheckpoint_Test_Passing {
  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetFilePointer_DKrn0() {
    EventFilesCheckpoint checkpoint = new EventFilesCheckpoint();
    long expected = 0; // Assuming default filePointer is 0 after initialization
    assertEquals(expected, checkpoint.getFilePointer());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetFilesWithNonNullList_hOPc0_Acyx0_1() {
    EventFilesCheckpoint checkpoint = new EventFilesCheckpoint();
    List<File> testFiles = Arrays.asList(new File("test1.txt"), new File("test2.txt"));
    checkpoint.setFiles(testFiles);
    assertNotNull(checkpoint.currentFile());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetFilesWithNonNullList_hOPc0_Acyx0_2() {
    EventFilesCheckpoint checkpoint = new EventFilesCheckpoint();
    List<File> testFiles = Arrays.asList(new File("test1.txt"), new File("test2.txt"));
    checkpoint.setFiles(testFiles);
    assertEquals(testFiles.get(0), checkpoint.currentFile());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetFilePointer_gTHu0_MJAQ0() {
    EventFilesCheckpoint checkpoint = new EventFilesCheckpoint();
    long expectedFilePointer = 12345L;
    checkpoint.setFilePointer(expectedFilePointer);
    assertEquals(expectedFilePointer, checkpoint.getFilePointer());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testCurrentFileReturnsCorrectFile_CQLM0_USQu0() {
    EventFilesCheckpoint checkpoint = new EventFilesCheckpoint();
    ArrayList<File> files = new ArrayList<>();
    File expectedFile = new File("expectedFile.txt");
    files.add(expectedFile);
  }
}