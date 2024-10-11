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
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_EventFilesCheckpoint_Test_Failing {
  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testNextFileWithNonEmptyFilesList_XMuk1() {
    EventFilesCheckpoint eventFilesCheckpoint = new EventFilesCheckpoint();
    List<File> files = new ArrayList<>();
    files.add(new File("file1.txt"));
    files.add(new File("file2.txt"));
    eventFilesCheckpoint.setFiles(files);
    File nextFile = eventFilesCheckpoint.nextFile();
    Assertions.assertEquals("file1.txt", nextFile.getName());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testCurrentFile_HDIA0() {
    EventFilesCheckpoint eventFilesCheckpoint = new EventFilesCheckpoint();
    File file = eventFilesCheckpoint.currentFile();
    assertNotNull(file);
  }
}