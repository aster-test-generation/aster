/**
 * Generated by Aster
 */
package com.ibm.websphere.samples.daytrader.util;

import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_Log_Test_Passing {
  private Log log;
  private static int errorCount = 0;

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testError_pPNV0_1() {
    Throwable e = new Throwable("Test exception");
    String message = "Test message";
    Log.error(e, message);
    assertEquals(message + "\n\t", e.getMessage());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testError_pPNV0_2() {
    Throwable e = new Throwable("Test exception");
    String message = "Test message";
    Log.error(e, message);
    assertEquals(e, System.out);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testDoDebug_true_DDyf0() {
    assertTrue(Log.doDebug());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testDoDebug_false_ApNl1() {
    assertFalse(Log.doDebug());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testDoTrace_True_Umth0() {
    Log log = new Log();
    assertTrue(log.doTrace());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testDoTrace_False_eWGe1() {
    Log log = new Log();
    assertFalse(log.doTrace());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testDoTrace_Null_RvLX2() {
    Log log = new Log();
    assertNull(log.doTrace());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testTrace_withNullMessage_khbx8() {
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testError_NullThrowable_qUIC0() {
    Log.error(null, "msg1", "msg2");
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testError_NullMessage1_ucWp1() {
    Log.error(new Throwable(), null, "msg2");
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testError_NullMessage2_EKoD2() {
    Log.error(new Throwable(), "msg1", null);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testError_ValidThrowableAndMessages_MIya3() {
    Throwable t = new Throwable();
    Log.error(t, "msg1", "msg2");
    assertEquals("msg1\nmsg2\n\t", t.getMessage());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testError_ValidThrowableAndNullMessage1_eXRG4() {
    Throwable t = new Throwable();
    Log.error(t, null, "msg2");
    assertEquals("msg2\n\t", t.getMessage());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testError_ValidThrowableAndNullMessage2_IJUE5() {
    Throwable t = new Throwable();
    Log.error(t, "msg1", null);
    assertEquals("msg1\n\t", t.getMessage());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testError_ValidThrowableAndEmptyMessage1_jBkB6() {
    Throwable t = new Throwable();
    Log.error(t, "", "msg2");
    assertEquals("msg2\n\t", t.getMessage());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testError_ValidThrowableAndEmptyMessage2_efsH7() {
    Throwable t = new Throwable();
    Log.error(t, "msg1", "");
    assertEquals("msg1\n\t", t.getMessage());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testError_ValidThrowableAndMultipleMessages_OUTU10() {
    Throwable t = new Throwable();
    Log.error(t, "msg1", "msg2", "msg3");
    assertEquals("msg1\nmsg2\nmsg3\n\t", t.getMessage());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testError_ValidThrowableAndMultipleMessagesWithNull_tLCH11() {
    Throwable t = new Throwable();
    Log.error(t, "msg1", null, "msg3");
    assertEquals("msg1\nmsg3\n\t", t.getMessage());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testError_ValidThrowableAndMultipleMessagesWithEmpty_uheI12() {
    Throwable t = new Throwable();
    Log.error(t, "msg1", "", "msg3");
    assertEquals("msg1\nmsg3\n\t", t.getMessage());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testError_pPNV0() {
    Throwable e = new Throwable("Test exception");
    String message = "Test message";
    Log.error(e, message);
    assertEquals(message + "\n\t", e.getMessage());
    assertEquals(e, System.out);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void setUp_vyrK2() {
    log = new Log();
  }
}