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

public class Aster_MapDynamicPropertyHandler_Test_Failing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetPropertyNames_nullMap_nmUB2() {
        MapDynamicPropertyHandler handler = new MapDynamicPropertyHandler();
        Map<String, Object> map = null;
        String[] propertyNames = handler.getPropertyNames(map);
        assertNull(propertyNames);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetPropertyNames_nullMap_nmUB2_fid2() {
        MapDynamicPropertyHandler handler = new MapDynamicPropertyHandler();
        Map<String, Object> map = null;
        String[] propertyNames = handler.getPropertyNames(map);
        assertEquals(0, propertyNames.length);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetPropertyNames_nullKey_ZyKz5_2_fid2() {
        MapDynamicPropertyHandler handler = new MapDynamicPropertyHandler();
        Map<String, Object> map = new HashMap<>();
        map.put(null, "value1");
        String[] propertyNames = handler.getPropertyNames(map);
        assertEquals(null, propertyNames[0]);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetProperty_Map_NullMap_yfwM3() {
        MapDynamicPropertyHandler handler = new MapDynamicPropertyHandler();
        Map<String, Object> map = null;
        Object result = handler.getProperty(map, "key");
        assertNull(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetProperty_Map_MultipleKeys_talh5_1() {
        MapDynamicPropertyHandler handler = new MapDynamicPropertyHandler();
        Map<String, Object> map = new HashMap<>();
        map.put("key1", "value1");
        map.put("key2", "value2");
        Object result = handler.getProperty(map, "key1");
        result = handler.getProperty(map, "key2");
        assertEquals("value1", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetProperty_Map_NestedMap_LTsl6() {
        MapDynamicPropertyHandler handler = new MapDynamicPropertyHandler();
        Map<String, Object> map = new HashMap<>();
        Map<String, Object> nestedMap = new HashMap<>();
        nestedMap.put("key", "value");
        map.put("nestedMap", nestedMap);
        Object result = handler.getProperty(map, "nestedMap.key");
        assertEquals("value", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetProperty_InvalidPropertyName_VLNq5() {
        MapDynamicPropertyHandler handler = new MapDynamicPropertyHandler();
        Map<String, Object> map = new HashMap<>();
        String propertyName = null;
        Object value = "John Doe";
        try {
            handler.setProperty(map, propertyName, value);
            fail("Expected NullPointerException");
        } catch (NullPointerException e) {
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetProperty_InvalidValue_auie6() {
        MapDynamicPropertyHandler handler = new MapDynamicPropertyHandler();
        Map<String, Object> map = new HashMap<>();
        String propertyName = "name";
        Object value = null;
        try {
            handler.setProperty(map, propertyName, value);
            fail("Expected NullPointerException");
        } catch (NullPointerException e) {
        }
    }
}