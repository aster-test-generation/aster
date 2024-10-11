/**
 * Generated by Aster
 */
package org.apache.commons.compress.harmony.unpack200;
import java.util.ArrayList;
import java.util.List;
import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_SegmentConstantPoolArrayCache_Test_Passing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    void testArrayIsCachedWhenArrayIsCached_CYUq0() {
        SegmentConstantPoolArrayCache cache = new SegmentConstantPoolArrayCache();
        String[] array = new String[]{"a", "b", "c"};
        boolean result = cache.arrayIsCached(array);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    void testArrayIsCachedWhenArrayIsNotCached_bkjQ1() {
        SegmentConstantPoolArrayCache cache = new SegmentConstantPoolArrayCache();
        String[] array = new String[]{"d", "e", "f"};
        boolean result = cache.arrayIsCached(array);
        assert !result;
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    void testArrayIsCachedWhenArrayIsCachedWithDifferentSize_cJof2() {
        SegmentConstantPoolArrayCache cache = new SegmentConstantPoolArrayCache();
        String[] array = new String[]{"a", "b"};
        boolean result = cache.arrayIsCached(array);
        assert !result;
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIndexesForArrayKeyWithCachedArray_CjxU0_ZLdE0() {
        SegmentConstantPoolArrayCache cache = new SegmentConstantPoolArrayCache();
        String[] array = {"a", "b", "c"};
        String key = "b";
        cache.cacheArray(array);
        List<Integer> expected = Arrays.asList(1);
        List<Integer> actual = cache.indexesForArrayKey(array, key);
        assertEquals(expected, actual);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIndexesForArrayKeyWithUncachedArray_vjlv1_ZBXw0() {
        SegmentConstantPoolArrayCache cache = new SegmentConstantPoolArrayCache();
        String[] array = {"a", "b", "c"};
        String key = "d";
        List<Integer> expected = new ArrayList<>();
        List<Integer> actual = cache.indexesForArrayKey(array, key);
        assertEquals(expected, actual);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIndexesForArrayKeyWithCachedArrayAndKey_VUwy2_oPnY0() {
        SegmentConstantPoolArrayCache cache = new SegmentConstantPoolArrayCache();
        String[] array = {"a", "b", "c"};
        String key = "b";
        cache.cacheArray(array);
        cache.indexesForArrayKey(array, key);
        List<Integer> expected = Arrays.asList(1);
        List<Integer> actual = cache.lastIndexes;
        assertEquals(expected, actual);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIndexesForArrayKeyWithUncachedArrayAndKey_pQeO3_PgPE0() {
        SegmentConstantPoolArrayCache cache = new SegmentConstantPoolArrayCache();
        String[] array = {"a", "b", "c"};
        String key = "d";
        cache.indexesForArrayKey(array, key);
        List<Integer> expected = new ArrayList<>();
        List<Integer> actual = cache.lastIndexes;
        assertEquals(expected, actual);
    }
}