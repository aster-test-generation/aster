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
public class Aster_Sets_Test_Passing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testNewHashSetEmpty_LOpc0() {
    HashSet<String> set = Sets.newHashSet();
    assertEquals(0, set.size());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testNewHashSetSingleElement_MSpY1_1() {
    HashSet<String> set = Sets.newHashSet("Hello");
    assertEquals(1, set.size());}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testNewHashSetSingleElement_MSpY1_2() {
    HashSet<String> set = Sets.newHashSet("Hello");
    assertTrue(set.contains("Hello"));}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testNewHashSetMultipleElements_Dspy2_1() {
    HashSet<String> set = Sets.newHashSet("Hello", "World", "Java");
    assertEquals(3, set.size());}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testNewHashSetMultipleElements_Dspy2_2() {
    HashSet<String> set = Sets.newHashSet("Hello", "World", "Java");
    assertTrue(set.contains("Hello"));}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testNewHashSetMultipleElements_Dspy2_3() {
    HashSet<String> set = Sets.newHashSet("Hello", "World", "Java");
    assertTrue(set.contains("World"));}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testNewHashSetMultipleElements_Dspy2_4() {
    HashSet<String> set = Sets.newHashSet("Hello", "World", "Java");
    assertTrue(set.contains("Java"));}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testNewHashSetDuplicateElements_uzyO3_1() {
    HashSet<String> set = Sets.newHashSet("Hello", "Hello", "World");
    assertEquals(2, set.size());}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testNewHashSetDuplicateElements_uzyO3_2() {
    HashSet<String> set = Sets.newHashSet("Hello", "Hello", "World");
    assertTrue(set.contains("Hello"));}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testNewHashSetDuplicateElements_uzyO3_3() {
    HashSet<String> set = Sets.newHashSet("Hello", "Hello", "World");
    assertTrue(set.contains("World"));}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testNewHashSetNullElements_RkUr4_1() {
    HashSet<String> set = Sets.newHashSet(null, null, null);
    assertEquals(1, set.size());}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testNewHashSetNullElements_RkUr4_2() {
    HashSet<String> set = Sets.newHashSet(null, null, null);
    assertTrue(set.contains(null));}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testNewHashSetLargeElements_aKXy6_1() {
    HashSet<String> set = Sets.newHashSet(new String(new char[100]).toString());
    assertEquals(1, set.size());}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testNewHashSetLargeElements_aKXy6_2() {
    HashSet<String> set = Sets.newHashSet(new String(new char[100]).toString());
    assertTrue(set.contains(new String(new char[100]).toString()));}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testNewHashSetElementsWithHashcode_EwAM7_1() {
    HashSet<String> set = Sets.newHashSet(new String("Hello"), new String("World"));
    assertEquals(2, set.size());}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testNewHashSetElementsWithHashcode_EwAM7_2() {
    HashSet<String> set = Sets.newHashSet(new String("Hello"), new String("World"));
    assertTrue(set.contains(new String("Hello")));}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testNewHashSetElementsWithHashcode_EwAM7_3() {
    HashSet<String> set = Sets.newHashSet(new String("Hello"), new String("World"));
    assertTrue(set.contains(new String("World")));}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testNewHashSetElementsWithEquals_ERLS8_1() {
    HashSet<String> set = Sets.newHashSet(new String("Hello"), new String("Hello"));
    assertEquals(1, set.size());}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testNewHashSetElementsWithEquals_ERLS8_2() {
    HashSet<String> set = Sets.newHashSet(new String("Hello"), new String("Hello"));
    assertTrue(set.contains(new String("Hello")));}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testNewHashSetElementsWithToString_gXvh9_1() {
    HashSet<String> set = Sets.newHashSet("Hello", "Hello");
    assertEquals(1, set.size());}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testNewHashSetElementsWithToString_gXvh9_2() {
    HashSet<String> set = Sets.newHashSet("Hello", "Hello");
    assertTrue(set.contains("Hello"));}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testNewHashSetMixedElements_hpBQ5_xmhj0_1() {
    HashSet<Object> set = Sets.newHashSet("Hello", 1, "World", 2.0);
    assertEquals(4, set.size());}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testNewHashSetMixedElements_hpBQ5_xmhj0_2() {
    HashSet<Object> set = Sets.newHashSet("Hello", 1, "World", 2.0);
    assertTrue(set.contains("Hello"));}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testNewHashSetMixedElements_hpBQ5_xmhj0_3() {
    HashSet<Object> set = Sets.newHashSet("Hello", 1, "World", 2.0);
    assertTrue(set.contains("World"));}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testNewHashSetMixedElements_hpBQ5_xmhj0_4() {
    HashSet<Object> set = Sets.newHashSet("Hello", 1, "World", 2.0);
    assertTrue(set.contains(1));}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testNewHashSetMixedElements_hpBQ5_xmhj0_5() {
    HashSet<Object> set = Sets.newHashSet("Hello", 1, "World", 2.0);
    assertTrue(set.contains(2.0));}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testNewHashSetSingleElement_MSpY1() {
    HashSet<String> set = Sets.newHashSet("Hello");
    assertEquals(1, set.size());
    assertTrue(set.contains("Hello"));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testNewHashSetMultipleElements_Dspy2() {
    HashSet<String> set = Sets.newHashSet("Hello", "World", "Java");
    assertEquals(3, set.size());
    assertTrue(set.contains("Hello"));
    assertTrue(set.contains("World"));
    assertTrue(set.contains("Java"));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testNewHashSetDuplicateElements_uzyO3() {
    HashSet<String> set = Sets.newHashSet("Hello", "Hello", "World");
    assertEquals(2, set.size());
    assertTrue(set.contains("Hello"));
    assertTrue(set.contains("World"));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testNewHashSetLargeElements_aKXy6() {
    HashSet<String> set = Sets.newHashSet(new String(new char[100]).toString());
    assertEquals(1, set.size());
    assertTrue(set.contains(new String(new char[100]).toString()));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testNewHashSetElementsWithHashcode_EwAM7() {
    HashSet<String> set = Sets.newHashSet(new String("Hello"), new String("World"));
    assertEquals(2, set.size());
    assertTrue(set.contains(new String("Hello")));
    assertTrue(set.contains(new String("World")));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testNewHashSetElementsWithEquals_ERLS8() {
    HashSet<String> set = Sets.newHashSet(new String("Hello"), new String("Hello"));
    assertEquals(1, set.size());
    assertTrue(set.contains(new String("Hello")));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testNewHashSetElementsWithToString_gXvh9() {
    HashSet<String> set = Sets.newHashSet("Hello", "Hello");
    assertEquals(1, set.size());
    assertTrue(set.contains("Hello"));
}
}