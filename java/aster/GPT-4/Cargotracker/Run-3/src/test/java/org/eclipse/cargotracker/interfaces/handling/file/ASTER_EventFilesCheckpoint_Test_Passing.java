/**
 * Generated by Aster
 */
package org.eclipse.cargotracker.interfaces.handling.file;

import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_EventFilesCheckpoint_Test_Passing {
  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetFilePointer_KgEA0() throws Exception {
    EventFilesCheckpoint checkpoint = new EventFilesCheckpoint();
    long expected = 0; // Assuming default or initial value of filePointer is 0
    long actual = checkpoint.getFilePointer();
    assertEquals(expected, actual);
  }
}