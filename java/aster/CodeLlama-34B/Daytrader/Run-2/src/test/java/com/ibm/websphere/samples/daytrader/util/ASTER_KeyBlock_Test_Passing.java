/**
 * Generated by Aster
 */
package com.ibm.websphere.samples.daytrader.util;

import java.util.ListIterator;
import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_KeyBlock_Test_Passing {
  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testListIteratorWithValidIndex_qRGZ0_1() {
    KeyBlock keyBlock = new KeyBlock(1, 10);
    ListIterator<Object> iterator = keyBlock.listIterator(5);
    assertNotNull(iterator);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testListIteratorWithValidIndex_qRGZ0_2() {
    KeyBlock keyBlock = new KeyBlock(1, 10);
    ListIterator<Object> iterator = keyBlock.listIterator(0);
    assertEquals(0, iterator.nextIndex());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testListIteratorWithInvalidIndex_WWBn1() {
    KeyBlock keyBlock = new KeyBlock(1, 10);
    ListIterator<Object> iterator = keyBlock.listIterator(15);
    assertNotNull(iterator);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSize_EcVR0() {
    KeyBlock keyBlock = new KeyBlock(1, 10);
    assertEquals(10, keyBlock.size());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSizeWithMinAndMaxEqual_cZuW1() {
    KeyBlock keyBlock = new KeyBlock(1, 1);
    assertEquals(1, keyBlock.size());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSizeWithMinAndMaxEqualAndNegative_vRHs4() {
    KeyBlock keyBlock = new KeyBlock(-1, -1);
    assertEquals(1, keyBlock.size());
  }
}