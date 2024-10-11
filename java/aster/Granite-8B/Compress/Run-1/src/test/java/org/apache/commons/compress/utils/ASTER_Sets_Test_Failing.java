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
    public void testNewHashSet_vkMt3_2() {
        HashSet<String> set = new HashSet<>();
        set =Sets.newHashSet("a", "b", "c");
        set =Sets.newHashSet("a", "b", "a");
        set =Sets.newHashSet();
        assertEquals(set.size(), 3);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testNewHashSet_vkMt2_6() {
        HashSet<String> set = new HashSet<>();
        set =Sets.newHashSet("a", "b", "c");
        set =Sets.newHashSet("a", "b", "a");
        set =Sets.newHashSet();
        assertEquals(set.size(), 2);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testNewHashSetWithNullArray_tKoJ3() {
        HashSet<String> set =Sets.newHashSet((String[]) null);
        assertEquals(set.size(), 0);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testNewHashSetWithNull_HRiw1() {
        HashSet<String> set =Sets.newHashSet("a", null, "b");
        assertEquals(set.size(), 2);
        assertTrue(set.contains("a"));
        assertTrue(set.contains(null));
        assertTrue(set.contains("b"));
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testNewHashSet_vkMt0_3_fid3() {
        HashSet<String> set = new HashSet<>();
        set =Sets.newHashSet("a", "b", "c");
        set =Sets.newHashSet("a", "b", "a");
        set =Sets.newHashSet();
        assertTrue(set.contains("a"));}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testNewHashSet_vkMt0_4_fid3() {
        HashSet<String> set = new HashSet<>();
        set =Sets.newHashSet("a", "b", "c");
        set =Sets.newHashSet("a", "b", "a");
        set =Sets.newHashSet();
        assertTrue(set.contains("b"));}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testNewHashSet_vkMt0_5_fid3() {
        HashSet<String> set = new HashSet<>();
        set =Sets.newHashSet("a", "b", "c");
        set =Sets.newHashSet("a", "b", "a");
        set =Sets.newHashSet();
        assertTrue(set.contains("c"));}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testNewHashSetWithNull_HRiw1_1_fid3() {
        HashSet<String> set =Sets.newHashSet("a", null, "b");
        assertEquals(set.size(), 2);}
}