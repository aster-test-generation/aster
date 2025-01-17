/**
 * Generated by Aster
 */
package org.eclipse.cargotracker.interfaces.handling.file;

import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.fail;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_LineParseExceptionListener_Coverage_Test_Failing {
  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testOnSkipReadItem3_Dvep2() throws java.lang.Exception {
    LineParseExceptionListener listener = new LineParseExceptionListener();
    Exception e = new Exception();
    try {
      listener.onSkipReadItem(e);
      fail("Expected exception of type java.lang.ClassNotFoundException");
    } catch (ClassNotFoundException ex) {
    }
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testOnSkipReadItem4_NxDZ3() throws java.lang.Exception {
    LineParseExceptionListener listener = new LineParseExceptionListener();
    Exception e = new Exception();
    try {
      listener.onSkipReadItem(e);
      fail("Expected exception of type java.lang.UnsupportedOperationException");
    } catch (UnsupportedOperationException ex) {
    }
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testOnSkipReadItem5_PwVY4() throws java.lang.Exception {
    LineParseExceptionListener listener = new LineParseExceptionListener();
    Exception e = new Exception();
    try {
      listener.onSkipReadItem(e);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (IllegalArgumentException ex) {
    }
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testOnSkipReadItem6_RIGr5() throws java.lang.Exception {
    LineParseExceptionListener listener = new LineParseExceptionListener();
    Exception e = new Exception();
    try {
      listener.onSkipReadItem(e);
      fail("Expected exception of type java.lang.IllegalMonitorStateException");
    } catch (IllegalMonitorStateException ex) {
    }
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testOnSkipReadItem7_nXgM6() throws java.lang.Exception {
    LineParseExceptionListener listener = new LineParseExceptionListener();
    Exception e = new Exception();
    try {
      listener.onSkipReadItem(e);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (IndexOutOfBoundsException ex) {
    }
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testOnSkipReadItem8_zviw7() throws java.lang.Exception {
    LineParseExceptionListener listener = new LineParseExceptionListener();
    Exception e = new Exception();
    try {
      listener.onSkipReadItem(e);
      fail("Expected exception of type java.lang.SecurityException");
    } catch (SecurityException ex) {
    }
  }
}