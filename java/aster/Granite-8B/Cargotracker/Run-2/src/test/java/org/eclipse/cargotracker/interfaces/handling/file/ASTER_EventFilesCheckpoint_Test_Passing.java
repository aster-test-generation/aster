/**
 * Generated by Aster
 */
package org.eclipse.cargotracker.interfaces.handling.file;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_EventFilesCheckpoint_Test_Passing {
  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testNextFileWithEmptyFilesList_SbmJ0() {
    EventFilesCheckpoint eventFilesCheckpoint = new EventFilesCheckpoint();
    List<File> files = new ArrayList<>();
    eventFilesCheckpoint.setFiles(files);
    File nextFile = eventFilesCheckpoint.nextFile();
    Assertions.assertNull(nextFile);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetFilePointer_FdxS0() {
    EventFilesCheckpoint eventFilesCheckpoint = new EventFilesCheckpoint();
    long filePointer = eventFilesCheckpoint.getFilePointer();
    assertEquals(0, filePointer);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetFilePointer_QDYc0() {
    EventFilesCheckpoint eventFilesCheckpoint = new EventFilesCheckpoint();
    long filePointer = 10;
    eventFilesCheckpoint.setFilePointer(filePointer);
    assertEquals(filePointer, eventFilesCheckpoint.getFilePointer());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testNextFileWithNonEmptyFilesList_CpxL1_fid1() {
    EventFilesCheckpoint eventFilesCheckpoint = new EventFilesCheckpoint();
    List<File> files = new ArrayList<>();
    files.add(new File("file2.txt"));
    files.add(new File("file2.txt"));
    eventFilesCheckpoint.setFiles(files);
    File nextFile = eventFilesCheckpoint.nextFile();
    Assertions.assertEquals("file2.txt", nextFile.getName());
  }
}