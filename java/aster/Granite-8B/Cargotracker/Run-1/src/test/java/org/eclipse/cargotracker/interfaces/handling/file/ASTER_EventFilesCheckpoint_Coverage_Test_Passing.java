/**
 * Generated by Aster
 */
package org.eclipse.cargotracker.interfaces.handling.file;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_EventFilesCheckpoint_Coverage_Test_Passing {
  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testCurrentFileWithEmptyList_cYVB0() {
    EventFilesCheckpoint eventFilesCheckpoint = new EventFilesCheckpoint();
    List<File> files = new ArrayList<>();
    eventFilesCheckpoint.setFiles(files);
    File currentFile = eventFilesCheckpoint.currentFile();
    assertNull(currentFile);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testCurrentFileWithFileList_Fgae1() {
    EventFilesCheckpoint eventFilesCheckpoint = new EventFilesCheckpoint();
    List<File> files = new ArrayList<>();
    files.add(new File("file1.txt"));
    files.add(new File("file2.txt"));
    eventFilesCheckpoint.setFiles(files);
    File currentFile = eventFilesCheckpoint.currentFile();
    assertEquals("file1.txt", currentFile.getName());
  }
}