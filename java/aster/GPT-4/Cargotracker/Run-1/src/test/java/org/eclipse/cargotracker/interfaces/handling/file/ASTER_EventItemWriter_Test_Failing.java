/**
 * Generated by Aster
 */
package org.eclipse.cargotracker.interfaces.handling.file;

import jakarta.batch.runtime.context.JobContext;
import java.io.File;
import java.util.Objects;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class Aster_EventItemWriter_Test_Failing {
  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testOpen_createsDirectoryWhenNotExists_diva0() throws Exception {
    JobContext mockJobContext = mock(JobContext.class);
    Properties properties = new Properties();
    properties.setProperty("ARCHIVE_DIRECTORY", "testDir");
    when(mockJobContext.getProperties()).thenReturn(properties);
    EventItemWriter writer = new EventItemWriter();
    writer.open(null);
    File createdDir = new File("testDir");
    assertTrue(createdDir.exists());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testOpen_doesNotCreateDirectoryWhenExists_bjcr1_2() throws Exception {
    JobContext mockJobContext = mock(JobContext.class);
    Properties properties = new Properties();
    properties.setProperty("ARCHIVE_DIRECTORY", "existingDir");
    when(mockJobContext.getProperties()).thenReturn(properties);
    File existingDir = new File("existingDir");
    existingDir.mkdirs();
    EventItemWriter writer = new EventItemWriter();
    writer.open(null);
    assertEquals(0, Objects.requireNonNull(existingDir.listFiles()).length);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testOpen_doesNotCreateDirectoryWhenExists_bjcr1() throws Exception {
    JobContext mockJobContext = mock(JobContext.class);
    Properties properties = new Properties();
    properties.setProperty("ARCHIVE_DIRECTORY", "existingDir");
    when(mockJobContext.getProperties()).thenReturn(properties);
    File existingDir = new File("existingDir");
    existingDir.mkdirs();
    EventItemWriter writer = new EventItemWriter();
    writer.open(null);
    assertTrue(existingDir.exists());
    assertEquals(0, Objects.requireNonNull(existingDir.listFiles()).length);
  }
}