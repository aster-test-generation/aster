/**
 * Generated by Aster
 */
package org.eclipse.cargotracker.domain.model.voyage;

import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_SampleVoyages_Test_Failing {
  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetAllReturnsNotEmptyList_cwRU0_PXZa0_1() throws NoSuchFieldException, IllegalAccessException {
    Map<Integer, Voyage> testMap = new HashMap<>();
    testMap.put(1, new Voyage());
    testMap.put(2, new Voyage());
    Field field = SampleVoyages.class.getDeclaredField("ALL");
    field.setAccessible(true);
    field.set(null, testMap);
    List<Voyage> result = SampleVoyages.getAll();
    assertNotNull(result);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetAllReturnsNotEmptyList_cwRU0_PXZa0_2() throws NoSuchFieldException, IllegalAccessException {
    Map<Integer, Voyage> testMap = new HashMap<>();
    testMap.put(1, new Voyage());
    testMap.put(2, new Voyage());
    Field field = SampleVoyages.class.getDeclaredField("ALL");
    field.setAccessible(true);
    field.set(null, testMap);
    List<Voyage> result = SampleVoyages.getAll();
    assertFalse(result.isEmpty());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetAllReturnsNotEmptyList_cwRU0_PXZa0_3() throws NoSuchFieldException, IllegalAccessException {
    Map<Integer, Voyage> testMap = new HashMap<>();
    testMap.put(1, new Voyage());
    testMap.put(2, new Voyage());
    Field field = SampleVoyages.class.getDeclaredField("ALL");
    field.setAccessible(true);
    field.set(null, testMap);
    List<Voyage> result = SampleVoyages.getAll();
    assertEquals(2, result.size());
  }
}