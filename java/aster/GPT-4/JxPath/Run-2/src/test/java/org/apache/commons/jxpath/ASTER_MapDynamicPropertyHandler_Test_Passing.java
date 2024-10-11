/**
 * Generated by Aster
 */
package org.apache.commons.jxpath;
import java.util.Map;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_MapDynamicPropertyHandler_Test_Passing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetPropertyNamesWithNonEmptyMap_myAo0() {
    MapDynamicPropertyHandler handler = new MapDynamicPropertyHandler();
    Map<String, Integer> testMap = new HashMap<>();
    testMap.put("key1", 1);
    testMap.put("key2", 2);
    String[] propertyNames = handler.getPropertyNames(testMap);
    Arrays.sort(propertyNames);
    assertArrayEquals(new String[]{"key1", "key2"}, propertyNames);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetPropertyNamesWithEmptyMap_DQfF1() {
    MapDynamicPropertyHandler handler = new MapDynamicPropertyHandler();
    Map<String, Integer> testMap = new HashMap<>();
    String[] propertyNames = handler.getPropertyNames(testMap);
    assertArrayEquals(new String[]{}, propertyNames);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetPropertyWithValidKey_gxRF0() {
    MapDynamicPropertyHandler handler = new MapDynamicPropertyHandler();
    Map<String, String> testMap = new HashMap<>();
    testMap.put("key", "value");
    Object result = handler.getProperty(testMap, "key");
    assertEquals("value", result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSetProperty_gKYv0() {
    MapDynamicPropertyHandler handler = new MapDynamicPropertyHandler();
    Map<String, Object> map = new HashMap<>();
    String key = "testKey";
    String value = "testValue";
    handler.setProperty(map, key, value);
    assertEquals("testValue", map.get(key));
}
}