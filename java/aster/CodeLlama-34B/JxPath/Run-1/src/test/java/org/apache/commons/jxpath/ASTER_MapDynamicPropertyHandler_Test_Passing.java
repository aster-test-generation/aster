/**
 * Generated by Aster
 */
package org.apache.commons.jxpath;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_MapDynamicPropertyHandler_Test_Passing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetPropertyNames_EmptyMap_Oduy0() {
        MapDynamicPropertyHandler handler = new MapDynamicPropertyHandler();
        Map<String, Object> map = new HashMap<>();
        String[] propertyNames = handler.getPropertyNames(map);
        assertEquals(0, propertyNames.length);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetPropertyNames_NonEmptyMap_PRQx1_1() {
        MapDynamicPropertyHandler handler = new MapDynamicPropertyHandler();
        Map<String, Object> map = new HashMap<>();
        map.put("key1", "value1");
        map.put("key2", "value2");
        String[] propertyNames = handler.getPropertyNames(map);
        assertEquals(2, propertyNames.length);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetPropertyNames_NonEmptyMap_PRQx1_2() {
        MapDynamicPropertyHandler handler = new MapDynamicPropertyHandler();
        Map<String, Object> map = new HashMap<>();
        map.put("key1", "value1");
        map.put("key2", "value2");
        String[] propertyNames = handler.getPropertyNames(map);
        assertEquals("key1", propertyNames[0]);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetPropertyNames_NonEmptyMap_PRQx1_3() {
        MapDynamicPropertyHandler handler = new MapDynamicPropertyHandler();
        Map<String, Object> map = new HashMap<>();
        map.put("key1", "value1");
        map.put("key2", "value2");
        String[] propertyNames = handler.getPropertyNames(map);
        assertEquals("key2", propertyNames[1]);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetProperty_ValidInput_GSkc0() {
        MapDynamicPropertyHandler handler = new MapDynamicPropertyHandler();
        Map<String, Object> map = new HashMap<>();
        map.put("key", "value");
        Object result = handler.getProperty(map, "key");
        assertEquals("value", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetProperty_InvalidInput_pgvt1() {
        MapDynamicPropertyHandler handler = new MapDynamicPropertyHandler();
        Map<String, Object> map = new HashMap<>();
        map.put("key", "value");
        Object result = handler.getProperty(map, "invalidKey");
        assertNull(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetProperty_NullKey_fcoV3() {
        MapDynamicPropertyHandler handler = new MapDynamicPropertyHandler();
        Map<String, Object> map = new HashMap<>();
        map.put("key", "value");
        Object result = handler.getProperty(map, null);
        assertNull(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetProperty_EmptyKey_YfYi4() {
        MapDynamicPropertyHandler handler = new MapDynamicPropertyHandler();
        Map<String, Object> map = new HashMap<>();
        map.put("key", "value");
        Object result = handler.getProperty(map, "");
        assertNull(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetProperty_NullMapInput_zHrc7() {
        MapDynamicPropertyHandler handler = new MapDynamicPropertyHandler();
        Object result = handler.getProperty(new HashMap<>(), "key");
        assertNull(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetProperty_QWAN0() {
        MapDynamicPropertyHandler handler = new MapDynamicPropertyHandler();
        Map<String, Object> map = new HashMap<>();
        String propertyName = "name";
        Object value = "John";
        handler.setProperty(map, propertyName, value);
        assertEquals(value, map.get(propertyName));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetPropertyWithNullMap_devF1() {
        MapDynamicPropertyHandler handler = new MapDynamicPropertyHandler();
        Map<String, Object> map = null;
        String propertyName = "name";
        Object value = "John";
        try {
            handler.setProperty(map, propertyName, value);
            fail("Expected NullPointerException");
        } catch (NullPointerException e) {
            assertNull(e.getMessage());
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetPropertyWithNullValue_RbOh3() {
        MapDynamicPropertyHandler handler = new MapDynamicPropertyHandler();
        Map<String, Object> map = new HashMap<>();
        String propertyName = "name";
        Object value = null;
        try {
            handler.setProperty(map, propertyName, value);
        } catch (NullPointerException e) {
            assertEquals("value", e.getMessage());
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetPropertyWithInvalidPropertyName_dVZt4() {
        MapDynamicPropertyHandler handler = new MapDynamicPropertyHandler();
        Map<String, Object> map = new HashMap<>();
        String propertyName = "invalid";
        Object value = "John";
        try {
            handler.setProperty(map, propertyName, value);
            assertEquals(value, map.get(propertyName));
        } catch (IllegalArgumentException e) {
            fail("Unexpected IllegalArgumentException");
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetPropertyWithInvalidValue_YBsl5() {
        MapDynamicPropertyHandler handler = new MapDynamicPropertyHandler();
        Map<String, Object> map = new HashMap<>();
        String propertyName = "name";
        Object value = new Object();
        try {
            handler.setProperty(map, propertyName, value);
            assertTrue(map.containsKey(propertyName));
            assertEquals(value, map.get(propertyName));
        } catch (IllegalArgumentException e) {
            fail("Unexpected IllegalArgumentException");
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetPropertyWithDuplicatePropertyName_ZgnW6() {
        MapDynamicPropertyHandler handler = new MapDynamicPropertyHandler();
        Map<String, Object> map = new HashMap<>();
        String propertyName = "name";
        Object value1 = "John";
        Object value2 = "Jane";
        handler.setProperty(map, propertyName, value1);
        try {
            handler.setProperty(map, propertyName, value2);
            assertEquals(value2, map.get(propertyName));
        } catch (IllegalArgumentException e) {
            fail("Unexpected IllegalArgumentException");
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetProperty_NonStringKey_saxj5_XSxx0() {
        MapDynamicPropertyHandler handler = new MapDynamicPropertyHandler();
        Map<String, Object> map = new HashMap<>();
        map.put("key", "value");
        Object result = handler.getProperty(map, "1");
        assertNull(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetPropertyNames_NonEmptyMap_PRQx1() {
        MapDynamicPropertyHandler handler = new MapDynamicPropertyHandler();
        Map<String, Object> map = new HashMap<>();
        map.put("key1", "value1");
        map.put("key2", "value2");
        String[] propertyNames = handler.getPropertyNames(map);
        assertEquals(2, propertyNames.length);
        assertEquals("key1", propertyNames[0]);
        assertEquals("key2", propertyNames[1]);
    }
}