/**
 * Generated by Aster
 */
package org.eclipse.cargotracker.interfaces.handling.file;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import org.eclipse.cargotracker.application.util.DateConverter;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_EventItemWriter_Coverage_Test_Failing {
  private DateConverter dateConverter;
  private Properties properties;

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testWriteItemsWithEmptyItems_Gqrj1() throws Exception {
    EventItemWriter eventItemWriter = new EventItemWriter();
    List<Object> items = new ArrayList<>();
    eventItemWriter.writeItems(items);
    assertFalse(new File("archive_directory/archive_job_name_instance_id.csv").exists());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testWriteItemsWithNullItems_rjoT2() throws Exception {
    EventItemWriter eventItemWriter = new EventItemWriter();
    eventItemWriter.writeItems(null);
    assertFalse(new File("archive_directory/archive_job_name_instance_id.csv").exists());
  }
}