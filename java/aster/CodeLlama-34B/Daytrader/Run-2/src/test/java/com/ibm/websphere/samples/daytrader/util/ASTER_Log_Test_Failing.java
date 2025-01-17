/**
 * Generated by Aster
 */
package com.ibm.websphere.samples.daytrader.util;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_Log_Test_Failing {
  private static List<Log> logs = new ArrayList<>();

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testPrintCollection_nullElement_WFoM6() {
    Collection<Object> collection = new ArrayList<>();
    collection.add(null);
    Log.printCollection(collection);
    assertEquals(1, collection.size());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testError_NullThrowable_QfvD0() {
    Log.error(null, "message");
    assertEquals(0, System.out.toString().length());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testError_NullMessage_UNnH1() {
    Log.error(new Throwable(), null);
    assertEquals(88, System.out.toString().length());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testError_ValidMessageAndThrowable_nqFr4_1() {
    Throwable t = new Throwable();
    Log.error(t, "message");
    assertEquals("message\n\t", System.out.toString());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testError_ValidMessageAndThrowable_nqFr4_2() {
    Throwable t = new Throwable();
    Log.error(t, "message");
    assertEquals(t, System.out.toString().split("\n\t")[1]);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testError_ValidMessageAndThrowableWithCause_dszR5_1() {
    Throwable t = new Throwable();
    Throwable cause = new Throwable();
    t.initCause(cause);
    Log.error(t, "message");
    assertEquals("message\n\t", System.out.toString());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testError_ValidMessageAndThrowableWithCause_dszR5_2() {
    Throwable t = new Throwable();
    Throwable cause = new Throwable();
    t.initCause(cause);
    Log.error(t, "message");
    assertEquals(cause, System.out.toString().split("\n\t")[1]);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testError_ValidMessageAndThrowableWithCauseAndSuppressed_sOSb6_1() {
    Throwable t = new Throwable();
    Throwable cause = new Throwable();
    Throwable suppressed = new Throwable();
    t.initCause(cause);
    t.addSuppressed(suppressed);
    Log.error(t, "message");
    assertEquals("message\n\t", System.out.toString());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testError_ValidMessageAndThrowableWithCauseAndSuppressed_sOSb6_2() {
    Throwable t = new Throwable();
    Throwable cause = new Throwable();
    Throwable suppressed = new Throwable();
    t.initCause(cause);
    t.addSuppressed(suppressed);
    Log.error(t, "message");
    assertEquals(cause, System.out.toString().split("\n\t")[1]);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testError_ValidMessageAndThrowableWithCauseAndSuppressed_sOSb6_3() {
    Throwable t = new Throwable();
    Throwable cause = new Throwable();
    Throwable suppressed = new Throwable();
    t.initCause(cause);
    t.addSuppressed(suppressed);
    Log.error(t, "message");
    assertEquals(suppressed, System.out.toString().split("\n\t")[2]);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testError_ValidMessageAndThrowableWithSuppressed_gHzE7_1() {
    Throwable t = new Throwable();
    Throwable suppressed = new Throwable();
    t.addSuppressed(suppressed);
    Log.error(t, "message");
    assertEquals("message\n\t", System.out.toString());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testError_ValidMessageAndThrowableWithSuppressed_gHzE7_2() {
    Throwable t = new Throwable();
    Throwable suppressed = new Throwable();
    t.addSuppressed(suppressed);
    Log.error(t, "message");
    assertEquals(suppressed, System.out.toString().split("\n\t")[1]);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testError_ValidMessageAndThrowableWithCauseAndSuppressedAndStackTrace_FylB8_4() {
    Throwable t = new Throwable();
    Throwable cause = new Throwable();
    Throwable suppressed = new Throwable();
    t.initCause(cause);
    t.addSuppressed(suppressed);
    Log.error(t, "message");
    assertEquals(t.getStackTrace()[0], System.out.toString().split("\n\t")[3]);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testError_msg1_msg2_msg3_e_KOXd0() {
    String msg1 = "Error message 1";
    String msg2 = "Error message 2";
    String msg3 = "Error message 3";
    Throwable e = new Throwable("Error message 1Error message 2Error message 3	");
    Log.error(msg1, msg2, msg3, e);
    assertEquals(msg1 + "\n" + msg2 + "\n" + msg3 + "\n\t", e.getMessage());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testError_msg1_msg2_msg3_null_CtJX1() {
    String msg1 = "Error message 1";
    String msg2 = "Error message 2";
    String msg3 = "Error message 3";
    Throwable e = null;
    Log.error(msg1, msg2, msg3, e);
    assertEquals(msg1 + "\n" + msg2 + "\n" + msg3 + "\n\t", "");
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testError_msg1_msg2_null_null_wfWj3() {
    String msg1 = "Error message 1";
    String msg2 = "Error message 2";
    String msg3 = null;
    Throwable e = null;
    Log.error(msg1, msg2, msg3, e);
    assertEquals(msg1 + "\n" + msg2 + "\n\t", e.getMessage());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testError_msg1_null_msg3_e_RMxq4() {
    String msg1 = "Error message 1";
    String msg2 = null;
    String msg3 = "Error message 3";
    Throwable e = new Throwable("Error message 1	");
    Log.error(msg1, msg2, msg3, e);
    assertEquals(msg1 + "\n\t", e.getMessage());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testError_msg1_null_msg3_null_EvdC5() {
    String msg1 = "Error message 1";
    String msg2 = null;
    String msg3 = "Error message 3";
    Throwable e = null;
    Log.error(msg1, msg2, msg3, e);
    assertEquals(msg1 + "\n\t", "");
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testError_msg1_null_null_null_SOxQ7() {
    String msg1 = "Error message 1";
    String msg2 = null;
    String msg3 = null;
    Throwable e = null;
    Log.error(msg1, msg2, msg3, e);
    assertEquals(msg1 + "\n\t", "");
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testError_null_msg2_msg3_e_kUWt8() {
    String msg1 = null;
    String msg2 = "Error message 2";
    String msg3 = "Error message 3";
    Throwable e = new Throwable("Error message 2Error message 3	");
    Log.error(msg1, msg2, msg3, e);
    assertEquals(msg2 + "\n" + msg3 + "\n\t", e.getMessage());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testError_NullMessage_UNnH1_fid1() {
    Log.error(new Throwable(), null);
    assertEquals(0, System.out.toString().length());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testError_EmptyMessage_PAOY2_fid1() {
    Log.error(new Throwable(), "");
    assertEquals(0, System.out.toString().length());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testError_ValidMessage_TDRt3_fid1() {
    Log.error(new Throwable(), "message");
    assertEquals("message\n\t", System.out.toString());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testError_ValidMessageAndThrowable_nqFr4() {
    Throwable t = new Throwable();
    Log.error(t, "message");
    assertEquals("message\n\t", System.out.toString());
    assertEquals(t, System.out.toString().split("\n\t")[1]);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testError_ValidMessageAndThrowableWithCause_dszR5() {
    Throwable t = new Throwable();
    Throwable cause = new Throwable();
    t.initCause(cause);
    Log.error(t, "message");
    assertEquals("message\n\t", System.out.toString());
    assertEquals(cause, System.out.toString().split("\n\t")[1]);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testError_ValidMessageAndThrowableWithCauseAndSuppressed_sOSb6() {
    Throwable t = new Throwable();
    Throwable cause = new Throwable();
    Throwable suppressed = new Throwable();
    t.initCause(cause);
    t.addSuppressed(suppressed);
    Log.error(t, "message");
    assertEquals("message\n\t", System.out.toString());
    assertEquals(cause, System.out.toString().split("\n\t")[1]);
    assertEquals(suppressed, System.out.toString().split("\n\t")[2]);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testError_ValidMessageAndThrowableWithSuppressed_gHzE7() {
    Throwable t = new Throwable();
    Throwable suppressed = new Throwable();
    t.addSuppressed(suppressed);
    Log.error(t, "message");
    assertEquals("message\n\t", System.out.toString());
    assertEquals(suppressed, System.out.toString().split("\n\t")[1]);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testError_ValidMessageAndThrowableWithCauseAndSuppressedAndStackTrace_FylB8() {
    Throwable t = new Throwable();
    Throwable cause = new Throwable();
    Throwable suppressed = new Throwable();
    t.initCause(cause);
    t.addSuppressed(suppressed);
    Log.error(t, "message");
    assertEquals("message\n\t", System.out.toString());
    assertEquals(cause, System.out.toString().split("\n\t")[1]);
    assertEquals(suppressed, System.out.toString().split("\n\t")[2]);
    assertEquals(t.getStackTrace()[0], System.out.toString().split("\n\t")[3]);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testDoDebugWithFalse_wZKP1_fid1() {
    assertFalse(Log.doDebug());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testError_msg1_msg2_msg3_e_KOXd0_fid1() {
    String msg1 = "Error message 1";
    String msg2 = "Error message 2";
    String msg3 = "Error message 3";
    Throwable e = new Throwable("Error message 4");
    Log.error(msg1, msg2, msg3, e);
    assertEquals(msg1 + "\n" + msg2 + "\n" + msg3 + "\n\t", e.getMessage());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testError_msg1_msg2_msg3_null_CtJX1_fid1() {
    String msg1 = "Error message 1";
    String msg2 = "Error message 2";
    String msg3 = "Error message 3";
    Throwable e = null;
    Log.error(msg1, msg2, msg3, e);
    assertEquals(msg1 + "\n" + msg2 + "\n" + msg3 + "\n\t", e.getMessage());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testError_msg1_msg2_null_e_TDlB2_fid1() {
    String msg1 = "Error message 1";
    String msg2 = "Error message 2";
    String msg3 = null;
    Throwable e = new Throwable("Error message 4");
    Log.error(msg1, msg2, msg3, e);
    assertEquals(msg1 + "\n" + msg2 + "\n\t", e.getMessage());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testError_msg1_null_msg3_e_RMxq4_fid1() {
    String msg1 = "Error message 1";
    String msg2 = null;
    String msg3 = "Error message 3";
    Throwable e = new Throwable("Error message 4");
    Log.error(msg1, msg2, msg3, e);
    assertEquals(msg1 + "\n\t", e.getMessage());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testError_msg1_null_msg3_null_EvdC5_fid1() {
    String msg1 = "Error message 1";
    String msg2 = null;
    String msg3 = "Error message 3";
    Throwable e = null;
    Log.error(msg1, msg2, msg3, e);
    assertEquals(msg1 + "\n\t", e.getMessage());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testError_msg1_null_null_e_zqaw6_fid1() {
    String msg1 = "Error message 1";
    String msg2 = null;
    String msg3 = null;
    Throwable e = new Throwable("Error message 4");
    Log.error(msg1, msg2, msg3, e);
    assertEquals(msg1 + "\n\t", e.getMessage());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testError_msg1_null_null_null_SOxQ7_fid1() {
    String msg1 = "Error message 1";
    String msg2 = null;
    String msg3 = null;
    Throwable e = null;
    Log.error(msg1, msg2, msg3, e);
    assertEquals(msg1 + "\n\t", e.getMessage());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testError_null_msg2_msg3_e_kUWt8_fid1() {
    String msg1 = null;
    String msg2 = "Error message 2";
    String msg3 = "Error message 3";
    Throwable e = new Throwable("Error message 4");
    Log.error(msg1, msg2, msg3, e);
    assertEquals(msg2 + "\n" + msg3 + "\n\t", e.getMessage());
  }
}