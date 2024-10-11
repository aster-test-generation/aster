/**
 * Generated by Aster
 */
package org.apache.commons.jxpath;
import java.util.Map;
import static org.junit.jupiter.api.Assertions.*;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_MapDynamicPropertyHandler_Coverage_Test_Passing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetProperty_Bwbu0_1() {
        MapDynamicPropertyHandler handler = new MapDynamicPropertyHandler();
        Map<String, Object> testMap = new HashMap<>();
        testMap.put("key1", "value1");
        testMap.put("key2", 12345);
        Object result1 = handler.getProperty(testMap, "key1");
        Object result2 = handler.getProperty(testMap, "key2");
        assertEquals("value1", result1);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetProperty_Bwbu0_2() {
        MapDynamicPropertyHandler handler = new MapDynamicPropertyHandler();
        Map<String, Object> testMap = new HashMap<>();
        testMap.put("key1", "value1");
        testMap.put("key2", 12345);
        Object result1 = handler.getProperty(testMap, "key1");
        Object result2 = handler.getProperty(testMap, "key2");
        assertEquals(12345, result2);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetPropertyWithValidMap_SfBn0() {
        MapDynamicPropertyHandler handler = new MapDynamicPropertyHandler();
        Map<String, Object> map = new HashMap<>();
        handler.setProperty(map, "key", "value");
        assertEquals("value", map.get("key"));
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetPropertyNamesWithEmptyMap_xwxa0() {
        MapDynamicPropertyHandler handler = new MapDynamicPropertyHandler();
        Map<Object, Object> emptyMap = new HashMap<>();
        String[] propertyNames = handler.getPropertyNames(emptyMap);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetPropertyNamesWithSingleElement_xfZl1() {
        MapDynamicPropertyHandler handler = new MapDynamicPropertyHandler();
        Map<String, Object> singleElementMap = new HashMap<>();
        singleElementMap.put("key1", "value1");
        String[] propertyNames = handler.getPropertyNames(singleElementMap);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetPropertyNamesWithMultipleElements_PjIk2() {
        MapDynamicPropertyHandler handler = new MapDynamicPropertyHandler();
        Map<String, Object> multipleElementMap = new HashMap<>();
        multipleElementMap.put("key1", "value1");
        multipleElementMap.put("key2", "value2");
        String[] propertyNames = handler.getPropertyNames(multipleElementMap);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetPropertyNamesWithMapContainingNullKey_KfxY5() {
        MapDynamicPropertyHandler handler = new MapDynamicPropertyHandler();
        Map<Object, Object> mapWithNullKey = new HashMap<>();
        mapWithNullKey.put(null, "value1");
        String[] propertyNames = handler.getPropertyNames(mapWithNullKey);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetPropertyNamesWithNull_FefQ3_lcKy0() {
    MapDynamicPropertyHandler handler = new MapDynamicPropertyHandler();
    try {
        handler.getPropertyNames(null);
        fail("Expected an exception to be thrown");
    } catch (NullPointerException e) {
        assertNotNull(e);
    }
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetPropertyNamesWithNonMapObject_nhDP4_ChLh0() {
    MapDynamicPropertyHandler handler = new MapDynamicPropertyHandler();
    try {
        handler.getPropertyNames(new Object());
        fail("Expected a ClassCastException to be thrown");
    } catch (ClassCastException e) {
        assertNotNull(e);
    }
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetProperty_Bwbu0() {
        MapDynamicPropertyHandler handler = new MapDynamicPropertyHandler();
        Map<String, Object> testMap = new HashMap<>();
        testMap.put("key1", "value1");
        testMap.put("key2", 12345);
        Object result1 = handler.getProperty(testMap, "key1");
        Object result2 = handler.getProperty(testMap, "key2");
        assertEquals("value1", result1);
        assertEquals(12345, result2);
    }
}