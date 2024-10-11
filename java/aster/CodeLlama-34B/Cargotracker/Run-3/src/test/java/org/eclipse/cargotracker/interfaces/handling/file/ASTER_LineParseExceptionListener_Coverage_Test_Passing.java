/**
 * Generated by Aster
 */
package org.eclipse.cargotracker.interfaces.handling.file;

import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_LineParseExceptionListener_Coverage_Test_Passing {
  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testOnSkipReadItemWithEmptyLine_BEQw8() throws Exception {
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testOnSkipReadItemWithNullJobContext_Lmtq2_dXgj0() throws Exception {
    LineParseExceptionListener listener = new LineParseExceptionListener();
    EventLineParseException e = new EventLineParseException("Test exception", null, null);
    assertThrows(Exception.class, () -> listener.onSkipReadItem(e));
  }
}