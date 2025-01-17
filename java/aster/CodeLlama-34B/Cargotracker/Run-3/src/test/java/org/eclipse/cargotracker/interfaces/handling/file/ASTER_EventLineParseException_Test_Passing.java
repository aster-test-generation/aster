/**
 * Generated by Aster
 */
package org.eclipse.cargotracker.interfaces.handling.file;

import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_EventLineParseException_Test_Passing {
  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetLine_messageAndLine_lWvu0() throws Exception {
    EventLineParseException exception = new EventLineParseException("message", "line");
    assertEquals("line", exception.getLine());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetLine_messageAndCauseAndLine_BURB1() throws Exception {
    EventLineParseException exception = new EventLineParseException("message", new Exception(), "line");
    assertEquals("line", exception.getLine());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetLine_nullMessageAndLine_kKrQ2() throws Exception {
    EventLineParseException exception = new EventLineParseException(null, "line");
    assertNull(exception.getLine());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetLine_nullMessageAndCauseAndLine_mDSR3() throws Exception {
    EventLineParseException exception = new EventLineParseException(null, new Exception(), "line");
    assertNull(exception.getLine());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetLine_nullLine_fpRN4() throws Exception {
    EventLineParseException exception = new EventLineParseException("message", null);
    assertNull(exception.getLine());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetLine_nullLineAndCause_qYEd5() throws Exception {
    EventLineParseException exception = new EventLineParseException("message", new Exception(), null);
    assertNull(exception.getLine());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetLine_emptyLine_sHKi6() throws Exception {
    EventLineParseException exception = new EventLineParseException("message", "");
    assertEquals("", exception.getLine());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetLine_emptyLineAndCause_OJvF7() throws Exception {
    EventLineParseException exception = new EventLineParseException("message", new Exception(), "");
    assertEquals("", exception.getLine());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetLine_nullCause_NQhu12() throws Exception {
    EventLineParseException exception = new EventLineParseException("message", null, "line");
    assertEquals("line", exception.getLine());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetLine_nullCauseAndLine_CGwO13() throws Exception {
    EventLineParseException exception = new EventLineParseException("message", null, null);
    assertNull(exception.getLine());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetLine_nullCauseAndEmptyLine_rxLl14() throws Exception {
    EventLineParseException exception = new EventLineParseException("message", null, "");
    assertEquals("", exception.getLine());
  }
}