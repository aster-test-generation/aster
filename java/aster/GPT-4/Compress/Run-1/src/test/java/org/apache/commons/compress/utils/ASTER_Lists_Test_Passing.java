/**
 * Generated by Aster
 */
package org.apache.commons.compress.utils;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

import java.util.*;
import java.util.concurrent.TimeUnit;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_Lists_Test_Passing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testNewArrayListIsEmpty_mivf0() throws Exception {
    ArrayList<Object> list = Lists.newArrayList();
    assertTrue(list.isEmpty());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testNewArrayListWithEmptyIterator_xOGw0() throws Exception {
        Iterator<Integer> emptyIterator = Arrays.<Integer>asList().iterator();
        ArrayList<Integer> result = Lists.newArrayList(emptyIterator);
        assertTrue(result.isEmpty());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testNewArrayListWithSingleElement_wbRa1_1() throws Exception {
        Iterator<Integer> singleElementIterator = Arrays.asList(1).iterator();
        ArrayList<Integer> result = Lists.newArrayList(singleElementIterator);
        assertEquals(1, result.size());}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testNewArrayListWithSingleElement_wbRa1_2() throws Exception {
        Iterator<Integer> singleElementIterator = Arrays.asList(1).iterator();
        ArrayList<Integer> result = Lists.newArrayList(singleElementIterator);
        assertEquals(Integer.valueOf(1), result.get(0));}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testNewArrayListWithMultipleElements_VmyN2_1() throws Exception {
        Iterator<Integer> multipleElementsIterator = Arrays.asList(1, 2, 3).iterator();
        ArrayList<Integer> result = Lists.newArrayList(multipleElementsIterator);
        assertEquals(3, result.size());}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testNewArrayListWithMultipleElements_VmyN2_2() throws Exception {
        Iterator<Integer> multipleElementsIterator = Arrays.asList(1, 2, 3).iterator();
        ArrayList<Integer> result = Lists.newArrayList(multipleElementsIterator);
        assertEquals(Arrays.asList(1, 2, 3), result);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testNewArrayListWithNullElement_YGeL3_1() throws Exception {
        Iterator<Integer> nullElementIterator = Arrays.asList((Integer) null).iterator();
        ArrayList<Integer> result = Lists.newArrayList(nullElementIterator);
        assertEquals(1, result.size());}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testNewArrayListWithNullElement_YGeL3_2() throws Exception {
        Iterator<Integer> nullElementIterator = Arrays.asList((Integer) null).iterator();
        ArrayList<Integer> result = Lists.newArrayList(nullElementIterator);
        assertNull(result.get(0));}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testNewArrayListWithDuplicateElements_Ubff5_1() throws Exception {
        Iterator<Integer> duplicateElementsIterator = Arrays.asList(1, 1, 2, 2, 2).iterator();
        ArrayList<Integer> result = Lists.newArrayList(duplicateElementsIterator);
        assertEquals(5, result.size());}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testNewArrayListWithDuplicateElements_Ubff5_2() throws Exception {
        Iterator<Integer> duplicateElementsIterator = Arrays.asList(1, 1, 2, 2, 2).iterator();
        ArrayList<Integer> result = Lists.newArrayList(duplicateElementsIterator);
        assertEquals(Arrays.asList(1, 1, 2, 2, 2), result);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testNewArrayListWithLargeNumberOfElements_FqoK6() throws Exception {
        Iterator<Integer> largeIterator = Arrays.asList(new Integer[1000]).iterator();
        ArrayList<Integer> result = Lists.newArrayList(largeIterator);
        assertEquals(1000, result.size());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testNewArrayListWithDifferentTypes_eWGJ7_1() throws Exception {
        Iterator<?> mixedTypeIterator = Arrays.asList(1, "two", 3.0, true).iterator();
        ArrayList<?> result = Lists.newArrayList(mixedTypeIterator);
        assertEquals(4, result.size());}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testNewArrayListWithDifferentTypes_eWGJ7_2() throws Exception {
        Iterator<?> mixedTypeIterator = Arrays.asList(1, "two", 3.0, true).iterator();
        ArrayList<?> result = Lists.newArrayList(mixedTypeIterator);
        assertEquals(Arrays.asList(1, "two", 3.0, true), result);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testNewArrayListWithIteratorFromList_kVjp8() throws Exception {
        ArrayList<Integer> originalList = new ArrayList<>(Arrays.asList(1, 2, 3));
        Iterator<Integer> listIterator = originalList.iterator();
        ArrayList<Integer> result = Lists.newArrayList(listIterator);
        assertEquals(originalList, result);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testNewArrayListWithIteratorFromSet_garF9_1() throws Exception {
        Set<Integer> originalSet = new HashSet<>(Arrays.asList(1, 2, 3));
        Iterator<Integer> setIterator = originalSet.iterator();
        ArrayList<Integer> result = Lists.newArrayList(setIterator);
        assertEquals(3, result.size());}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testNewArrayListWithIteratorFromSet_garF9_2() throws Exception {
        Set<Integer> originalSet = new HashSet<>(Arrays.asList(1, 2, 3));
        Iterator<Integer> setIterator = originalSet.iterator();
        ArrayList<Integer> result = Lists.newArrayList(setIterator);
        assertTrue(result.containsAll(Arrays.asList(1, 2, 3)));}
}