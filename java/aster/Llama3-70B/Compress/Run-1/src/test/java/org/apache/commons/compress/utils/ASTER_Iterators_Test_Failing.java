/**
 * Generated by Aster
 */
package org.apache.commons.compress.utils;
import java.util.Collection;
import java.util.Iterator;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_Iterators_Test_Failing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testAddAll_ReturnsFalse_WhenCollectionNotModified_MjlY1_1_fid2() {
    Collection<String> collection = new ArrayList<>(Arrays.asList("a", "b", "c"));
    Iterator<String> iterator = Arrays.asList("a", "b", "c").iterator();
    boolean result = Iterators.addAll(collection, iterator);
    assertFalse(result);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testAddAll_ReturnsFalse_WhenCollectionNotModified_MjlY1_2() {
    Collection<String> collection = new ArrayList<>(Arrays.asList("a", "b", "c"));
    Iterator<String> iterator = Arrays.asList("a", "b", "c").iterator();
    boolean result = Iterators.addAll(collection, iterator);
    assertEquals(3, collection.size());}
}