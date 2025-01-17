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
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_KeyBlock_Test_Passing {
  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSize_IdQq0() {
    KeyBlock keyBlock = new KeyBlock(1, 10);
    int size = keyBlock.size();
    assertEquals(10 - 1 + 1, size);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSize2_GUks1() {
    KeyBlock keyBlock = new KeyBlock(5, 15);
    int size = keyBlock.size();
    assertEquals(15 - 5 + 1, size);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSize3_JjEs2() {
    KeyBlock keyBlock = new KeyBlock(0, 0);
    int size = keyBlock.size();
    assertEquals(0 - 0 + 1, size);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSize4_xNNT3() {
    KeyBlock keyBlock = new KeyBlock(10, 5);
    int size = keyBlock.size();
    assertEquals(5 - 10 + 1, size);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSize5_yjFc4() {
    KeyBlock keyBlock = new KeyBlock(10, 10);
    int size = keyBlock.size();
    assertEquals(10 - 10 + 1, size);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSize6_sQfH5() {
    KeyBlock keyBlock = new KeyBlock(0, 100);
    int size = keyBlock.size();
    assertEquals(100 - 0 + 1, size);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSize7_Obcq6() {
    KeyBlock keyBlock = new KeyBlock(50, 100);
    int size = keyBlock.size();
    assertEquals(100 - 50 + 1, size);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSize8_qJrS7() {
    KeyBlock keyBlock = new KeyBlock(50, 50);
    int size = keyBlock.size();
    assertEquals(50 - 50 + 1, size);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSize9_wnIY8() {
    KeyBlock keyBlock = new KeyBlock(100, 100);
    int size = keyBlock.size();
    assertEquals(100 - 100 + 1, size);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSize10_iYRu9() {
    KeyBlock keyBlock = new KeyBlock(100, 50);
    int size = keyBlock.size();
    assertEquals(50 - 100 + 1, size);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testListIterator_HGLs0() {
    KeyBlock keyBlock = new KeyBlock(1, 10);
    ListIterator<Object> iterator = keyBlock.listIterator(0);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testListIteratorWithNoArgs_YMXg1() {
    KeyBlock keyBlock = new KeyBlock();
    ListIterator<Object> iterator = keyBlock.listIterator(0);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testListIteratorWithNegativeIndex_hMzU2() {
    KeyBlock keyBlock = new KeyBlock(1, 10);
    ListIterator<Object> iterator = keyBlock.listIterator(-1);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testListIteratorWithIndexGreaterThanSize_DTWL3() {
    KeyBlock keyBlock = new KeyBlock(1, 10);
    ListIterator<Object> iterator = keyBlock.listIterator(100);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testListIteratorWithIndexOne_Lznt5() {
    KeyBlock keyBlock = new KeyBlock(1, 10);
    ListIterator<Object> iterator = keyBlock.listIterator(1);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testListIteratorWithIndexTwo_kIdk6() {
    KeyBlock keyBlock = new KeyBlock(1, 10);
    ListIterator<Object> iterator = keyBlock.listIterator(2);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testListIteratorWithIndexThree_VdXN7() {
    KeyBlock keyBlock = new KeyBlock(1, 10);
    ListIterator<Object> iterator = keyBlock.listIterator(3);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testListIteratorWithIndexFour_BUxN8() {
    KeyBlock keyBlock = new KeyBlock(1, 10);
    ListIterator<Object> iterator = keyBlock.listIterator(4);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testListIteratorWithIndexFive_txUk9() {
    KeyBlock keyBlock = new KeyBlock(1, 10);
    ListIterator<Object> iterator = keyBlock.listIterator(5);
  }
}