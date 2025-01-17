/**
 * Generated by Aster
 */
package org.eclipse.cargotracker.interfaces.handling.file;

import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_LineParseExceptionListener_Test_Failing {
  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testOnSkipReadItem_jiiF0() throws Exception {
    LineParseExceptionListener lineParseExceptionListener = new LineParseExceptionListener();
    Exception e = new Exception();
    lineParseExceptionListener.onSkipReadItem(e);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testOnSkipReadItemWithNull_dyFB1() throws Exception {
    LineParseExceptionListener lineParseExceptionListener = new LineParseExceptionListener();
    Exception e = null;
    lineParseExceptionListener.onSkipReadItem(e);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testOnSkipReadItem_jiiF0_fid1() throws Exception {
    LineParseExceptionListener lineParseExceptionListener = new LineParseExceptionListener();
    Exception e = new Exception();
    lineParseExceptionListener.onSkipReadItem(e);
    // Add assertions here
}
}