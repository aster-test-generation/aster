/**
 * Generated by Aster
 */
package org.apache.commons.compress.utils;
import java.util.ArrayList;
import java.util.Iterator;
import static org.junit.jupiter.api.Assertions.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_Lists_Test_Passing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testNewArrayListWithEmptyIterator_ILFX0() {
    Iterator<String> iterator = new ArrayList<String>().iterator();
    ArrayList<String> result = Lists.newArrayList(iterator);
    assertEquals(0, result.size());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testNewArrayListWithSingleElementIterator_hIxW1() {
    Iterator<String> iterator = Arrays.asList("Hello").iterator();
    ArrayList<String> result = Lists.newArrayList(iterator);
    assertEquals(1, result.size());
    assertEquals("Hello", result.get(0));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testNewArrayListWithMultipleElementsIterator_kvpm2() {
    Iterator<String> iterator = Arrays.asList("Hello", "World", "Java").iterator();
    ArrayList<String> result = Lists.newArrayList(iterator);
    assertEquals(3, result.size());
    assertEquals("Hello", result.get(0));
    assertEquals("World", result.get(1));
    assertEquals("Java", result.get(2));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testNewArrayListWithNullIterator_Mazy3() {
    Iterator<String> iterator = null;
    try {
        Lists.newArrayList(iterator);
        fail("Expected NullPointerException");
    } catch (NullPointerException e) {
    }
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testNewArrayListWithSingleElementIterator_hIxW1_1() {
    Iterator<String> iterator = Arrays.asList("Hello").iterator();
    ArrayList<String> result = Lists.newArrayList(iterator);
    assertEquals(1, result.size());}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testNewArrayListWithSingleElementIterator_hIxW1_2() {
    Iterator<String> iterator = Arrays.asList("Hello").iterator();
    ArrayList<String> result = Lists.newArrayList(iterator);
    assertEquals("Hello", result.get(0));}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testNewArrayListWithMultipleElementsIterator_kvpm2_1() {
    Iterator<String> iterator = Arrays.asList("Hello", "World", "Java").iterator();
    ArrayList<String> result = Lists.newArrayList(iterator);
    assertEquals(3, result.size());}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testNewArrayListWithMultipleElementsIterator_kvpm2_2() {
    Iterator<String> iterator = Arrays.asList("Hello", "World", "Java").iterator();
    ArrayList<String> result = Lists.newArrayList(iterator);
    assertEquals("Hello", result.get(0));}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testNewArrayListWithMultipleElementsIterator_kvpm2_3() {
    Iterator<String> iterator = Arrays.asList("Hello", "World", "Java").iterator();
    ArrayList<String> result = Lists.newArrayList(iterator);
    assertEquals("World", result.get(1));}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testNewArrayListWithMultipleElementsIterator_kvpm2_4() {
    Iterator<String> iterator = Arrays.asList("Hello", "World", "Java").iterator();
    ArrayList<String> result = Lists.newArrayList(iterator);
    assertEquals("Java", result.get(2));}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testNewArrayList_rmRQ0_gcOa1() {
    ArrayList<String> result = Lists.newArrayList((Iterator<String>) Collections.singleton("Test").iterator());
    assertNotNull(result);
}
}