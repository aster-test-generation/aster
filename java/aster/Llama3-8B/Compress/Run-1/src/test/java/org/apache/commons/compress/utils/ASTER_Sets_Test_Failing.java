/**
 * Generated by Aster
 */
package org.apache.commons.compress.utils;
import java.util.HashSet;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import java.util.HashSet;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_Sets_Test_Failing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testNewHashSetNullElements_RkUr4() {
    HashSet<String> set = Sets.newHashSet(null, null, null);
    assertEquals(3, set.size());
    assertTrue(set.contains(null));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testNewHashSetNullElements_RkUr4_1_fid3() {
    HashSet<String> set = Sets.newHashSet(null, null, null);
    assertEquals(3, set.size());}
}