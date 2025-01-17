/**
 * Generated by Aster
 */
package com.ibm.websphere.samples.daytrader.util;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
import static org.mockito.Mockito.*;

public class Aster_Log_Test_Passing {
  private static final Logger log = Logger.getLogger(Log.class.getName());

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testPrintCollectionWithEmptyCollection_ndiJ0() {
    Collection<Object> emptyCollection = new ArrayList<>();
    Log.printCollection(emptyCollection);
    assertEquals(0, emptyCollection.size());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testPrintCollectionWithNonEmptyCollection_UxJa1() {
    Collection<String> stringCollection = Arrays.asList("Hello", "World");
    Log.printCollection(stringCollection);
    assertEquals(2, stringCollection.size());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testDoTrace_lDTM0() {
    Logger log = Logger.getLogger(Log.class.getName());
    log.setLevel(Level.FINE);
    assertFalse(Log.doTrace());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testTrace_RBOT0() {
    Object parm1 = new Object();
    Object parm2 = new Object();
    Object parm3 = new Object();
    Object parm4 = new Object();
    Object parm5 = new Object();
    Object parm6 = new Object();
    Object parm7 = new Object();
    Log spyLog = spy(Log.class);
    doNothing().when(spyLog).trace(anyString());
    spyLog.trace("TestMessage", parm1, parm2, parm3, parm4, parm5, parm6, parm7);
    verify(spyLog).trace("TestMessage(" + parm1 + ", " + parm2 + ", " + parm3 + "), " + parm4 + ", " + parm5 + ", " + parm6 + ", " + parm7);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testDoDebugReturnsTrue_bLsP0() {
    assertTrue(Log.doDebug());
  }
}