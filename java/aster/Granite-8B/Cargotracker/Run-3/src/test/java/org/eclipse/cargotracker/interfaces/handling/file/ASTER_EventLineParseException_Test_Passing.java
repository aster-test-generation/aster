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

public class Aster_EventLineParseException_Test_Passing {
  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetLine_ygfG0() throws Exception {
    EventLineParseException eventLineParseException = new EventLineParseException("message", "line");
    String actualLine = eventLineParseException.getLine();
    String expectedLine = "line";
    assertEquals(expectedLine, actualLine);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetLineWithCause_wjws1() throws Exception {
    EventLineParseException eventLineParseException = new EventLineParseException("message", new Throwable(), "line");
    String actualLine = eventLineParseException.getLine();
    String expectedLine = "line";
    assertEquals(expectedLine, actualLine);
  }
}