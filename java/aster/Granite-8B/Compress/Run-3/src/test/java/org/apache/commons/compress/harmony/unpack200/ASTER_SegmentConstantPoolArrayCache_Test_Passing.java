/**
 * Generated by Aster
 */
package org.apache.commons.compress.harmony.unpack200;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;
import java.util.Arrays;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.List;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_SegmentConstantPoolArrayCache_Test_Passing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testArrayIsCached_VeAj0() throws Exception {
        SegmentConstantPoolArrayCache segmentConstantPoolArrayCache = new SegmentConstantPoolArrayCache();
        String[] array = new String[10];
        boolean result = segmentConstantPoolArrayCache.arrayIsCached(array);
        assertFalse(result);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testArrayIsCached2_oCEa1() throws Exception {
        SegmentConstantPoolArrayCache segmentConstantPoolArrayCache = new SegmentConstantPoolArrayCache();
        String[] array = new String[5];
        boolean result = segmentConstantPoolArrayCache.arrayIsCached(array);
        assertTrue(result);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testArrayIsCached3_xiKI2() throws Exception {
        SegmentConstantPoolArrayCache segmentConstantPoolArrayCache = new SegmentConstantPoolArrayCache();
        String[] array = new String[0];
        boolean result = segmentConstantPoolArrayCache.arrayIsCached(array);
        assertFalse(result);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIndexesForArrayKey_bxGZ0() throws Exception {
        SegmentConstantPoolArrayCache segmentConstantPoolArrayCache = new SegmentConstantPoolArrayCache();
        String[] array = new String[]{"key1", "key2", "key3"};
        String key = "key2";
        List<Integer> indexes = segmentConstantPoolArrayCache.indexesForArrayKey(array, key);
        assertEquals(Arrays.asList(1), indexes);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIndexesForArrayKey2_upEB1() throws Exception {
        SegmentConstantPoolArrayCache segmentConstantPoolArrayCache = new SegmentConstantPoolArrayCache();
        String[] array = new String[]{"key1", "key2", "key3"};
        String key = "key3";
        List<Integer> indexes = segmentConstantPoolArrayCache.indexesForArrayKey(array, key);
        assertEquals(Arrays.asList(2), indexes);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIndexesForArrayKey3_WpHr2() throws Exception {
        SegmentConstantPoolArrayCache segmentConstantPoolArrayCache = new SegmentConstantPoolArrayCache();
        String[] array = new String[]{"key1", "key2", "key3"};
        String key = "key4";
        List<Integer> indexes = segmentConstantPoolArrayCache.indexesForArrayKey(array, key);
        assertEquals(Collections.emptyList(), indexes);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIndexesForArrayKey4_jfuc3() throws Exception {
        SegmentConstantPoolArrayCache segmentConstantPoolArrayCache = new SegmentConstantPoolArrayCache();
        String[] array = new String[]{"key1", "key2", "key3"};
        String key = "key1";
        List<Integer> indexes = segmentConstantPoolArrayCache.indexesForArrayKey(array, key);
        assertEquals(Arrays.asList(0), indexes);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCacheArray_ASsb0() throws Exception {
        SegmentConstantPoolArrayCache cache = new SegmentConstantPoolArrayCache();
        String[] array = new String[10];
        cache.cacheArray(array);
        assert cache.knownArrays.containsKey(array);
    }
}