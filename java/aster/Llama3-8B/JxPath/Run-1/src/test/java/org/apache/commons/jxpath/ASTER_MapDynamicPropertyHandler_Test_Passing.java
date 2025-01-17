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

import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_MapDynamicPropertyHandler_Test_Passing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetPropertyNames_ciyG0() {
        MapDynamicPropertyHandler handler = new MapDynamicPropertyHandler();
        Map<String, String> map = new HashMap<>();
        map.put("key1", "value1");
        map.put("key2", "value2");
        String[] result = handler.getPropertyNames(map);
        assert result.length == 2;
        assert result[0].equals("key1");
        assert result[1].equals("key2");
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetPropertyNamesEmptyMap_AeFs1() {
        MapDynamicPropertyHandler handler = new MapDynamicPropertyHandler();
        Map<String, String> map = new HashMap<>();
        String[] result = handler.getPropertyNames(map);
        assert result.length == 0;
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetProperty_xvSY1() {
        MapDynamicPropertyHandler handler = new MapDynamicPropertyHandler();
        Map<String, Object> map = new HashMap<>();
        map.put("name", "John");
        Object result = handler.getProperty(map, "name");
        assert result.equals("John");
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetProperty_rdTa0() {
        MapDynamicPropertyHandler handler = new MapDynamicPropertyHandler();
        Map<String, Object> map = new HashMap<>();
        handler.setProperty(map, "name", "John");
        Map<String, Object> result = (Map<String, Object>) map;
        assert result.get("name").equals("John");
    }
}