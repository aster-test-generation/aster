/**
 * Generated by Aster
 */
package org.apache.commons.compress.harmony.unpack200;
import java.util.Collections;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_SegmentConstantPoolArrayCache_Test_Passing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testArrayIsCached_emptyArray_ngYK0() {
    SegmentConstantPoolArrayCache cache = new SegmentConstantPoolArrayCache();
    String[] array = new String[0];
    assertFalse(cache.arrayIsCached(array));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testArrayIsCached_nonEmptyArray_FPdY1() {
    SegmentConstantPoolArrayCache cache = new SegmentConstantPoolArrayCache();
    String[] array = new String[]{"a", "b", "c"};
    assertTrue(cache.arrayIsCached(array));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testIndexesForArrayKey_arrayIsCached_nsxm0() {
    SegmentConstantPoolArrayCache cache = new SegmentConstantPoolArrayCache();
    String[] array = new String[] {"a", "b", "c"};
    String key = "a";
    List<Integer> expectedIndexes = Arrays.asList(0);
    List<Integer> actualIndexes = cache.indexesForArrayKey(array, key);
    assertEquals(expectedIndexes, actualIndexes);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testIndexesForArrayKey_arrayIsNotCached_eVHW1() {
    SegmentConstantPoolArrayCache cache = new SegmentConstantPoolArrayCache();
    String[] array = new String[] {"a", "b", "c"};
    String key = "d";
    List<Integer> expectedIndexes = Collections.emptyList();
    List<Integer> actualIndexes = cache.indexesForArrayKey(array, key);
    assertEquals(expectedIndexes, actualIndexes);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testIndexesForArrayKey_arrayCachedAndKeyNotFound_geqP6() {
    SegmentConstantPoolArrayCache cache = new SegmentConstantPoolArrayCache();
    String[] array = new String[] {"a", "b", "c"};
    cache.cacheArray(array);
    String key = "d";
    List<Integer> expectedIndexes = Collections.emptyList();
    List<Integer> actualIndexes = cache.indexesForArrayKey(array, key);
    assertEquals(expectedIndexes, actualIndexes);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testCacheArray_ValidArray_AvGN0() {
    SegmentConstantPoolArrayCache cache = new SegmentConstantPoolArrayCache();
    String[] array = new String[] {"a", "b", "c"};
    cache.cacheArray(array);
    assertTrue(cache.arrayIsCached(array));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testCacheArray_InvalidArray_YSWy1() {
    SegmentConstantPoolArrayCache cache = new SegmentConstantPoolArrayCache();
    String[] array = new String[] {"a", "b", "c"};
    cache.cacheArray(array);
    assertFalse(cache.arrayIsCached(new String[] {"d", "e", "f"}));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testCacheArray_NullArray_Pqig2() {
    SegmentConstantPoolArrayCache cache = new SegmentConstantPoolArrayCache();
    String[] array = null;
    cache.cacheArray(array);
    assertFalse(cache.arrayIsCached(array));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testCacheArray_EmptyArray_MjXF3() {
    SegmentConstantPoolArrayCache cache = new SegmentConstantPoolArrayCache();
    String[] array = new String[0];
    cache.cacheArray(array);
    assertFalse(cache.arrayIsCached(array));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testCacheArray_DuplicateArray_EWsc4() {
    SegmentConstantPoolArrayCache cache = new SegmentConstantPoolArrayCache();
    String[] array = new String[] {"a", "b", "c"};
    cache.cacheArray(array);
    assertFalse(cache.arrayIsCached(array));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testCacheArray_NullValue_jgad12() {
    SegmentConstantPoolArrayCache cache = new SegmentConstantPoolArrayCache();
    String[] array = null;
}
}