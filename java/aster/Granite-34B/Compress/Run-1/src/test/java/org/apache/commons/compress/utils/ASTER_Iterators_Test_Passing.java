/**
 * Generated by Aster
 */
package org.apache.commons.compress.utils;
import java.util.Iterator;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_Iterators_Test_Passing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAddAll_ZAVN0_1() {
        List<Integer> list = new ArrayList<>();
        Iterator<Integer> iterator = Arrays.asList(1, 2, 3).iterator();
        assertTrue(Iterators.addAll(list, iterator));}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAddAll_ZAVN0_2() {
        List<Integer> list = new ArrayList<>();
        Iterator<Integer> iterator = Arrays.asList(1, 2, 3).iterator();
        assertFalse(list.containsAll(Arrays.asList(1, 2, 3)));}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAddAllEmptyIterator_OZeR1_1() {
        List<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3));
        Iterator<Integer> iterator = new ArrayList<Integer>().iterator();
        assertTrue(!Iterators.addAll(list, iterator));}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAddAllEmptyIterator_OZeR1_2() {
        List<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3));
        Iterator<Integer> iterator = new ArrayList<Integer>().iterator();
        assertTrue(list.containsAll(Arrays.asList(1, 2, 3)));}
}