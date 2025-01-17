/**
 * Generated by Aster
 */
package org.eclipse.cargotracker.interfaces.handling.file;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_EventItemWriter_Test_Failing {
  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testOpenWithValidCheckpoint_WtMi0() throws Exception {
    EventItemWriter writer = new EventItemWriter();
    writer.open(new Serializable() {
    });
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testWriteItems_xWvL0() throws Exception {
    EventItemWriter writer = new EventItemWriter();
    List<Object> items = new ArrayList<>();
    writer.writeItems(items);
  }
}