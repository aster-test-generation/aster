/**
 * Generated by Aster
 */
package com.ibm.websphere.samples.daytrader.util;

import java.util.ListIterator;
import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_KeyBlock_Coverage_Test_Passing {
  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testListIterator_psRc0() {
    KeyBlock keyBlock = new KeyBlock();
    ListIterator<Object> iterator = keyBlock.listIterator(0);
    assertNotNull(iterator);
  }
}