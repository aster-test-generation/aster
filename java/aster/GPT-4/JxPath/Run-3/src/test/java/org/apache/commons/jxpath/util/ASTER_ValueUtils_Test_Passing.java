/**
 * Generated by Aster
 */
package org.apache.commons.jxpath.util;
import java.beans.IndexedPropertyDescriptor;
import java.beans.PropertyDescriptor;
import java.lang.reflect.Array;
import java.lang.reflect.Method;
import org.apache.commons.jxpath.DynamicPropertyHandler;
import org.apache.commons.jxpath.JXPathException;
import static org.junit.jupiter.api.Assertions.*;
import java.util.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.mockito.Mockito.when;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_ValueUtils_Test_Passing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetValueWithNullCollection_zDVd0() throws Exception {
        assertNull(ValueUtils.getValue(null, 0));
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetValueWithEmptyArray_lcUT1() throws Exception {
        Object[] array = new Object[0];
        assertNull(ValueUtils.getValue(array, 0));
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetValueWithArrayValidIndex_Pxhg2() throws Exception {
        Object[] array = { "a", "b", "c" };
        assertEquals("b", ValueUtils.getValue(array, 1));
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetValueWithArrayInvalidIndex_csxk3() throws Exception {
        Object[] array = { "a", "b", "c" };
        assertNull(ValueUtils.getValue(array, 3));
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetValueWithArrayNegativeIndex_rGGR4() throws Exception {
        Object[] array = { "a", "b", "c" };
        assertNull(ValueUtils.getValue(array, -1));
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetValueWithEmptyList_wthP5() throws Exception {
        List<Object> list = new ArrayList<>();
        assertNull(ValueUtils.getValue(list, 0));
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetValueWithListValidIndex_oJbv6() throws Exception {
        List<Object> list = new ArrayList<>(Arrays.asList("x", "y", "z"));
        assertEquals("y", ValueUtils.getValue(list, 1));
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetValueWithListInvalidIndex_bMUW7() throws Exception {
        List<Object> list = new ArrayList<>(Arrays.asList("x", "y", "z"));
        assertNull(ValueUtils.getValue(list, 3));
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetValueWithListNegativeIndex_fwFi8() throws Exception {
        List<Object> list = new ArrayList<>(Arrays.asList("x", "y", "z"));
        assertNull(ValueUtils.getValue(list, -1));
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetValueWithEmptySet_ciOU9() throws Exception {
        Set<Object> set = new HashSet<>();
        assertNull(ValueUtils.getValue(set, 0));
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetValueWithSetValidIndex_iLLg10() throws Exception {
        Set<Object> set = new HashSet<>(Arrays.asList("1", "2", "3"));
        assertNotNull(ValueUtils.getValue(set, 1)); // Cannot predict exact element due to set nature
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetValueWithSetInvalidIndex_UbTs11() throws Exception {
        Set<Object> set = new HashSet<>(Arrays.asList("1", "2", "3"));
        assertNull(ValueUtils.getValue(set, 3));
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetValueWithSetNegativeIndex_jFAN12() throws Exception {
        Set<Object> set = new HashSet<>(Arrays.asList("1", "2", "3"));
        assertNull(ValueUtils.getValue(set, -1));
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetValueWithIndexedPropertyAndValidIndex_jROG0() throws Exception {
        String[] data = {"zero", "one", "two"};
        IndexedPropertyDescriptor ipd = new IndexedPropertyDescriptor("data", data.getClass(), null, null, "getData", null);
        Object result = ValueUtils.getValue(data, ipd, 1);
        assertEquals("one", result);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetValueWithIndexedPropertyAndInvalidIndex_rJia1() throws Exception {
        String[] data = {"zero", "one", "two"};
        IndexedPropertyDescriptor ipd = new IndexedPropertyDescriptor("data", data.getClass(), null, null, "getData", null);
        Object result = ValueUtils.getValue(data, ipd, 5);
        assertNull(result);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetValueWithIndexedPropertyAndNullMethod_ZjaK2() throws Exception {
        String[] data = {"zero", "one", "two"};
        IndexedPropertyDescriptor ipd = new IndexedPropertyDescriptor("data", data.getClass(), null, null, null, null);
        Object result = ValueUtils.getValue(data, ipd, 1);
        assertNull(result);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsCollectionWithNull_CVEA0() throws Exception {
        assertFalse(ValueUtils.isCollection(null));
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsCollectionWithArray_uyIU1() throws Exception {
        Integer[] array = new Integer[]{1, 2, 3};
        assertTrue(ValueUtils.isCollection(array));
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsCollectionWithArrayList_wyTS2() throws Exception {
        ArrayList<Integer> arrayList = new ArrayList<>(Arrays.asList(1, 2, 3));
        assertTrue(ValueUtils.isCollection(arrayList));
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testRemoveFromArray_MiddleElement_lOmG0() throws Exception {
        Integer[] array = {1, 2, 3};
        Integer[] expected = {1, 3};
        Integer[] result = (Integer[]) ValueUtils.remove(array, 1);
        assertArrayEquals(expected, result);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testRemoveFromArray_FirstElement_VyAB1() throws Exception {
        Integer[] array = {1, 2, 3};
        Integer[] expected = {2, 3};
        Integer[] result = (Integer[]) ValueUtils.remove(array, 0);
        assertArrayEquals(expected, result);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testRemoveFromArray_LastElement_JOLj2() throws Exception {
        Integer[] array = {1, 2, 3};
        Integer[] expected = {1, 2};
        Integer[] result = (Integer[]) ValueUtils.remove(array, 2);
        assertArrayEquals(expected, result);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testRemoveFromList_MiddleElement_jQgp4() throws Exception {
        List<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3));
        List<Integer> expected = new ArrayList<>(Arrays.asList(1, 3));
        List<Integer> result = (List<Integer>) ValueUtils.remove(list, 1);
        assertEquals(expected, result);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testRemoveFromList_FirstElement_NSMx5() throws Exception {
        List<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3));
        List<Integer> expected = new ArrayList<>(Arrays.asList(2, 3));
        List<Integer> result = (List<Integer>) ValueUtils.remove(list, 0);
        assertEquals(expected, result);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testRemoveFromList_LastElement_pBdk6() throws Exception {
        List<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3));
        List<Integer> expected = new ArrayList<>(Arrays.asList(1, 2));
        List<Integer> result = (List<Integer>) ValueUtils.remove(list, 2);
        assertEquals(expected, result);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testRemoveFromSet_RWAr8() throws Exception {
        Set<Integer> set = new LinkedHashSet<>(Arrays.asList(1, 2, 3));
        Set<Integer> expected = new LinkedHashSet<>(Arrays.asList(1, 3));
        Set<Integer> result = (Set<Integer>) ValueUtils.remove(set, 1);
        assertEquals(expected, result);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testRemove_NullCollection_DDdP11() throws Exception {
        assertNull(ValueUtils.remove(null, 0));
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIterateWithNull_ccHG0() throws Exception {
        Iterator iterator = ValueUtils.iterate(null);
        assertFalse(iterator.hasNext());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIterateWithEmptyArray_PiRx1() throws Exception {
        Integer[] emptyArray = new Integer[0];
        Iterator iterator = ValueUtils.iterate(emptyArray);
        assertFalse(iterator.hasNext());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIterateWithNonEmptyArray_hZBI2() throws Exception {
        Integer[] array = {1, 2, 3};
        Iterator iterator = ValueUtils.iterate(array);
        assertTrue(iterator.hasNext());
        assertEquals(Integer.valueOf(1), iterator.next());
        assertEquals(Integer.valueOf(2), iterator.next());
        assertEquals(Integer.valueOf(3), iterator.next());
        assertFalse(iterator.hasNext());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIterateWithCollection_lulA3() throws Exception {
        Collection<Integer> collection = Arrays.asList(1, 2, 3);
        Iterator iterator = ValueUtils.iterate(collection);
        assertTrue(iterator.hasNext());
        assertEquals(Integer.valueOf(1), iterator.next());
        assertEquals(Integer.valueOf(2), iterator.next());
        assertEquals(Integer.valueOf(3), iterator.next());
        assertFalse(iterator.hasNext());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIterateWithSingleElement_nknU4() throws Exception {
        String singleElement = "test";
        Iterator iterator = ValueUtils.iterate(singleElement);
        assertTrue(iterator.hasNext());
        assertEquals("test", iterator.next());
        assertFalse(iterator.hasNext());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIterateWithEmptyCollection_fUWj5() throws Exception {
        Collection<Integer> emptyCollection = Collections.emptyList();
        Iterator iterator = ValueUtils.iterate(emptyCollection);
        assertFalse(iterator.hasNext());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetCollectionHintWithArray_Ctac0() throws Exception {
        assertEquals(1, ValueUtils.getCollectionHint(int[].class));
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetCollectionHintWithCollection_AOdz1() throws Exception {
        assertEquals(1, ValueUtils.getCollectionHint(ArrayList.class));
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetCollectionHintWithPrimitive_JQCE2() throws Exception {
        assertEquals(-1, ValueUtils.getCollectionHint(int.class));
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetCollectionHintWithInterface_VrKM3() throws Exception {
        assertEquals(0, ValueUtils.getCollectionHint(List.class));
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetCollectionHintWithFinalClass_JahJ4() throws Exception {
        assertEquals(-1, ValueUtils.getCollectionHint(String.class));
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetCollectionHintWithRegularClass_jVKw5() throws Exception {
        assertEquals(0, ValueUtils.getCollectionHint(Object.class));
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetValue_Collection_Valid_TqjE2() throws Exception {
        Object bean = new ArrayList<>();
        PropertyDescriptor pd = mock(PropertyDescriptor.class);
        when(pd.getName()).thenReturn("list");
        ValueUtils.setValue(bean, pd, 0, "element");
        assertEquals("element", ((List) bean).get(0));
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetValueOnArray_UiRs0() throws Exception {
        Integer[] array = new Integer[]{1, 2, 3};
        ValueUtils.setValue(array, 1, 4);
        assertEquals(Integer.valueOf(4), Array.get(array, 1));
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetValueOnList_SKcV1() throws Exception {
        List<String> list = new ArrayList<>(Arrays.asList("a", "b", "c"));
        ValueUtils.setValue(list, 2, "z");
        assertEquals("z", list.get(2));
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetValueWithNullCollection_qTwb3() throws Exception {
        List<String> list = null;
        ValueUtils.setValue(list, 0, "test");
        assertNull(list);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetValueOutOfBounds_NIwG4() throws Exception {
        List<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3));
        try {
            ValueUtils.setValue(list, 5, 10);
            fail("Expected IndexOutOfBoundsException to be thrown");
        } catch (IndexOutOfBoundsException e) {
        }
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetAccessibleMethod_NullMethod_pPAo0() throws Exception {
        Method result = ValueUtils.getAccessibleMethod(null);
        assertNull(result);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetLengthWithNull_DTTg0() throws Exception {
        assertEquals(0, ValueUtils.getLength(null));
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetLengthWithArray_cbMV1() throws Exception {
        Integer[] array = new Integer[] {1, 2, 3};
        assertEquals(3, ValueUtils.getLength(array));
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetLengthWithCollection_RDIo2() throws Exception {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4));
        assertEquals(4, ValueUtils.getLength(list));
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetLengthWithSingleObject_YbyB3() throws Exception {
        String singleObject = "Hello";
        assertEquals(1, ValueUtils.getLength(singleObject));
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetDynamicPropertyHandlerWithValidClass_nSMh0() throws Exception {
    DynamicPropertyHandler handler = ValueUtils.getDynamicPropertyHandler(DynamicPropertyHandler.class);
    assertNotNull(handler);
    assertTrue(handler instanceof DynamicPropertyHandler);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIterateWithNonEmptyArray_hZBI2_1() throws Exception {
        Integer[] array = {1, 2, 3};
        Iterator iterator = ValueUtils.iterate(array);
        assertTrue(iterator.hasNext());}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIterateWithNonEmptyArray_hZBI2_2() throws Exception {
        Integer[] array = {1, 2, 3};
        Iterator iterator = ValueUtils.iterate(array);
        assertEquals(Integer.valueOf(1), iterator.next());}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIterateWithNonEmptyArray_hZBI2_3() throws Exception {
        Integer[] array = {1, 2, 3};
        Iterator iterator = ValueUtils.iterate(array);
        assertEquals(Integer.valueOf(2), iterator.next());}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIterateWithNonEmptyArray_hZBI2_4() throws Exception {
        Integer[] array = {1, 2, 3};
        Iterator iterator = ValueUtils.iterate(array);
        assertEquals(Integer.valueOf(3), iterator.next());}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIterateWithNonEmptyArray_hZBI2_5() throws Exception {
        Integer[] array = {1, 2, 3};
        Iterator iterator = ValueUtils.iterate(array);
        assertFalse(iterator.hasNext());}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIterateWithCollection_lulA3_1() throws Exception {
        Collection<Integer> collection = Arrays.asList(1, 2, 3);
        Iterator iterator = ValueUtils.iterate(collection);
        assertTrue(iterator.hasNext());}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIterateWithCollection_lulA3_2() throws Exception {
        Collection<Integer> collection = Arrays.asList(1, 2, 3);
        Iterator iterator = ValueUtils.iterate(collection);
        assertEquals(Integer.valueOf(1), iterator.next());}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIterateWithCollection_lulA3_3() throws Exception {
        Collection<Integer> collection = Arrays.asList(1, 2, 3);
        Iterator iterator = ValueUtils.iterate(collection);
        assertEquals(Integer.valueOf(2), iterator.next());}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIterateWithCollection_lulA3_4() throws Exception {
        Collection<Integer> collection = Arrays.asList(1, 2, 3);
        Iterator iterator = ValueUtils.iterate(collection);
        assertEquals(Integer.valueOf(3), iterator.next());}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIterateWithCollection_lulA3_5() throws Exception {
        Collection<Integer> collection = Arrays.asList(1, 2, 3);
        Iterator iterator = ValueUtils.iterate(collection);
        assertFalse(iterator.hasNext());}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIterateWithSingleElement_nknU4_1() throws Exception {
        String singleElement = "test";
        Iterator iterator = ValueUtils.iterate(singleElement);
        assertTrue(iterator.hasNext());}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIterateWithSingleElement_nknU4_2() throws Exception {
        String singleElement = "test";
        Iterator iterator = ValueUtils.iterate(singleElement);
        assertEquals("test", iterator.next());}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIterateWithSingleElement_nknU4_3() throws Exception {
        String singleElement = "test";
        Iterator iterator = ValueUtils.iterate(singleElement);
        assertFalse(iterator.hasNext());}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetDynamicPropertyHandlerWithValidClass_nSMh0_1() throws Exception {
    DynamicPropertyHandler handler = ValueUtils.getDynamicPropertyHandler(DynamicPropertyHandler.class);
    assertNotNull(handler);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetDynamicPropertyHandlerWithValidClass_nSMh0_2() throws Exception {
    DynamicPropertyHandler handler = ValueUtils.getDynamicPropertyHandler(DynamicPropertyHandler.class);
    assertTrue(handler instanceof DynamicPropertyHandler);}
@Test
public void testGetIndexedPropertyLengthWithNoReadMethods_whWh2_eKQC0() throws Exception {
    Object testObject = new Object();
    IndexedPropertyDescriptor pd = mock(IndexedPropertyDescriptor.class);
    when(pd.getReadMethod()).thenReturn(null);
    when(pd.getIndexedReadMethod()).thenReturn(null);
    assertThrows(JXPathException.class, () -> {
        ValueUtils.getIndexedPropertyLength(testObject, pd);
    });
}
@Test
public void testRemoveFromArray_IndexOutOfBounds_WFdX3_gsOS0() throws Exception {
    Integer[] array = {1, 2, 3};
    try {
        ValueUtils.remove(array, 3);
        fail("Expected an JXPathException to be thrown");
    } catch (JXPathException e) {
        assertEquals("Index out of bounds", e.getMessage());
    }
}
@Test
    public void testRemoveFromUnsupportedCollection_OCdc10_ocla0() throws Exception {
        Map<Integer, Integer> map = new HashMap<>();
        map.put(1, 2);
        assertThrows(JXPathException.class, () -> ValueUtils.expandCollection(map, 0));
    }
@Test
public void testExpandUnsupportedCollectionType_PLwy4_rkNd0() throws Exception {
    try {
        ValueUtils.expandCollection("This is a string, not a collection", 10);
        fail("Expected a JXPathException to be thrown");
    } catch (JXPathException e) {
    }
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testExpandCollectionWithNull_HdzS0_Ogfs0() throws Exception {
    assertNull(ValueUtils.expandCollection(null, 5));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testExpandArray_toBa1_iFNd0_1() throws Exception {
    Integer[] original = new Integer[]{1, 2, 3};
    Integer[] expanded = (Integer[]) ValueUtils.expandCollection(original, 5);
    assertNotNull(expanded);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testExpandArray_toBa1_iFNd0_2() throws Exception {
    Integer[] original = new Integer[]{1, 2, 3};
    Integer[] expanded = (Integer[]) ValueUtils.expandCollection(original, 5);
    assertEquals(5, expanded.length, "Expanded array length should be 5");}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testExpandArray_toBa1_iFNd0_3() throws Exception {
    Integer[] original = new Integer[]{1, 2, 3};
    Integer[] expanded = (Integer[]) ValueUtils.expandCollection(original, 5);
    assertArrayEquals(Arrays.copyOfRange(expanded, 0, 3), original, "First three elements should match the original");}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testExpandArray_toBa1_iFNd0_4() throws Exception {
    Integer[] original = new Integer[]{1, 2, 3};
    Integer[] expanded = (Integer[]) ValueUtils.expandCollection(original, 5);
    assertNull(expanded[3], "Fourth element of expanded array should be null");}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testExpandArray_toBa1_iFNd0_5() throws Exception {
    Integer[] original = new Integer[]{1, 2, 3};
    Integer[] expanded = (Integer[]) ValueUtils.expandCollection(original, 5);
    assertNull(expanded[4], "Fifth element of expanded array should be null");}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testExpandArrayList_KOvk2_CTKa0_1() throws Exception {
    ArrayList<Integer> original = new ArrayList<>(Arrays.asList(1, 2, 3));
    ArrayList<Integer> expanded = (ArrayList<Integer>) ValueUtils.expandCollection(original, 5);
    assertNotNull(expanded);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testExpandArrayList_KOvk2_CTKa0_2() throws Exception {
    ArrayList<Integer> original = new ArrayList<>(Arrays.asList(1, 2, 3));
    ArrayList<Integer> expanded = (ArrayList<Integer>) ValueUtils.expandCollection(original, 5);
    assertEquals(5, expanded.size(), "Expanded ArrayList size should be 5");}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testExpandArrayList_KOvk2_CTKa0_3() throws Exception {
    ArrayList<Integer> original = new ArrayList<>(Arrays.asList(1, 2, 3));
    ArrayList<Integer> expanded = (ArrayList<Integer>) ValueUtils.expandCollection(original, 5);
    assertEquals(Arrays.asList(1, 2, 3), expanded.subList(0, 3), "First three elements should match the original");}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testExpandArrayList_KOvk2_CTKa0_4() throws Exception {
    ArrayList<Integer> original = new ArrayList<>(Arrays.asList(1, 2, 3));
    ArrayList<Integer> expanded = (ArrayList<Integer>) ValueUtils.expandCollection(original, 5);
    assertNull(expanded.get(3), "Fourth element of expanded ArrayList should be null");}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testExpandArrayList_KOvk2_CTKa0_5() throws Exception {
    ArrayList<Integer> original = new ArrayList<>(Arrays.asList(1, 2, 3));
    ArrayList<Integer> expanded = (ArrayList<Integer>) ValueUtils.expandCollection(original, 5);
    assertNull(expanded.get(4), "Fifth element of expanded ArrayList should be null");}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testExpandCollectionWithExactSize_XdMm5_xuAv0() throws Exception {
    Integer[] original = new Integer[]{1, 2, 3};
    Integer[] expanded = (Integer[]) ValueUtils.expandCollection(original, 3);
    assertArrayEquals(original, expanded, "Expanded array should be equal to the original when size is the same");
}
}