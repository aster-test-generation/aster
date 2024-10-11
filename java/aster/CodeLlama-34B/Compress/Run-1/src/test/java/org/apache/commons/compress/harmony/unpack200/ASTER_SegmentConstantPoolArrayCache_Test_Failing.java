/**
 * Generated by Aster
 */
package org.apache.commons.compress.harmony.unpack200;
import java.util.List;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import java.util.List;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_SegmentConstantPoolArrayCache_Test_Failing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testArrayIsCached_nonEmptyArray_frmi1_fid1() {
    SegmentConstantPoolArrayCache cache = new SegmentConstantPoolArrayCache();
    String[] array = new String[]{"a", "b", "c"};
    assertTrue(cache.arrayIsCached(array));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testIndexesForArrayKey_NonEmptyArray_eJnC1() {
    SegmentConstantPoolArrayCache cache = new SegmentConstantPoolArrayCache();
    String[] array = new String[]{"a", "b", "c"};
    String key = "key";
    List<Integer> indexes = cache.indexesForArrayKey(array, key);
    assertEquals(3, indexes.size());
    assertEquals(0, indexes.get(0).intValue());
    assertEquals(1, indexes.get(1).intValue());
    assertEquals(2, indexes.get(2).intValue());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testIndexesForArrayKey_NullArray_Eszh2() {
    SegmentConstantPoolArrayCache cache = new SegmentConstantPoolArrayCache();
    String[] array = null;
    String key = "key";
    List<Integer> indexes = cache.indexesForArrayKey(array, key);
    assertEquals(0, indexes.size());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testIndexesForArrayKey_NonEmptyArray_eJnC1_1_fid2() {
    SegmentConstantPoolArrayCache cache = new SegmentConstantPoolArrayCache();
    String[] array = new String[]{"a", "b", "c"};
    String key = "key";
    List<Integer> indexes = cache.indexesForArrayKey(array, key);
    assertEquals(3, indexes.size());}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testIndexesForArrayKey_NonEmptyArray_eJnC1_2() {
    SegmentConstantPoolArrayCache cache = new SegmentConstantPoolArrayCache();
    String[] array = new String[]{"a", "b", "c"};
    String key = "key";
    List<Integer> indexes = cache.indexesForArrayKey(array, key);
    assertEquals(0, indexes.get(0).intValue());}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testIndexesForArrayKey_NonEmptyArray_eJnC1_3() {
    SegmentConstantPoolArrayCache cache = new SegmentConstantPoolArrayCache();
    String[] array = new String[]{"a", "b", "c"};
    String key = "key";
    List<Integer> indexes = cache.indexesForArrayKey(array, key);
    assertEquals(1, indexes.get(1).intValue());}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testIndexesForArrayKey_NonEmptyArray_eJnC1_4() {
    SegmentConstantPoolArrayCache cache = new SegmentConstantPoolArrayCache();
    String[] array = new String[]{"a", "b", "c"};
    String key = "key";
    List<Integer> indexes = cache.indexesForArrayKey(array, key);
    assertEquals(2, indexes.get(2).intValue());}
}