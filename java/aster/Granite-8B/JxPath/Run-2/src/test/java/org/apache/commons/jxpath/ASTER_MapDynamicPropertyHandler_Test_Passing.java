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

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_MapDynamicPropertyHandler_Test_Passing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetPropertyNames_ajsF0() {
        MapDynamicPropertyHandler handler = new MapDynamicPropertyHandler();
        Map<String, String> map = new HashMap<>();
        map.put("key1", "value1");
        map.put("key2", "value2");
        String[] expected = {"key1", "key2"};
        String[] actual = handler.getPropertyNames(map);
        assertArrayEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetPropertyNamesEmptyMap_ZEos1() {
        MapDynamicPropertyHandler handler = new MapDynamicPropertyHandler();
        Map<String, String> map = new HashMap<>();
        String[] expected = {};
        String[] actual = handler.getPropertyNames(map);
        assertArrayEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetProperty_YLnL0() {
        MapDynamicPropertyHandler handler = new MapDynamicPropertyHandler();
        Map<String, Object> map = new HashMap<>();
        map.put("key", "value");
        Object result = handler.getProperty(map, "key");
        assertEquals("value", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetProperty_QZqA0() {
        MapDynamicPropertyHandler handler = new MapDynamicPropertyHandler();
        Map<String, Object> map = new HashMap<>();
        handler.setProperty(map, "key", "value");
        assertEquals("value", map.get("key"));
    }
}