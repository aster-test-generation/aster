/**
 * Generated by Aster
 */
package org.apache.commons.jxpath.util;
import static org.junit.jupiter.api.Assertions.*;
import java.util.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_BasicTypeConverter_Coverage_Test_Passing {

@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAllocateCollectionWithConcreteClass_Wjin0() {
        BasicTypeConverter converter = new BasicTypeConverter();
        Collection result = converter.allocateCollection(ArrayList.class);
        assertTrue(result instanceof ArrayList);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAllocateCollectionWithSetInterface_JvoB3() {
        BasicTypeConverter converter = new BasicTypeConverter();
        Collection result = converter.allocateCollection(Set.class);
        assertTrue(result instanceof HashSet);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testConvertNullToPrimitiveFloat_CaRN0() {
        BasicTypeConverter converter = new BasicTypeConverter();
        Object result = converter.convertNullToPrimitive(float.class);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testConvertNullToPrimitiveDouble_CwjD1() {
        BasicTypeConverter converter = new BasicTypeConverter();
        Object result = converter.convertNullToPrimitive(double.class);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testUnmodifiableCollectionWithSet_jRxF0() {
        BasicTypeConverter converter = new BasicTypeConverter();
        Set<String> originalSet = new HashSet<>();
        originalSet.add("element1");
        originalSet.add("element2");
        Collection<String> unmodifiableSet = converter.unmodifiableCollection(originalSet);
        try {
            unmodifiableSet.add("newElement");
            fail("Should throw UnsupportedOperationException on add operation");
        } catch (UnsupportedOperationException e) {
        }
        assertTrue(unmodifiableSet instanceof Set);
        assertFalse(unmodifiableSet instanceof SortedSet);
        assertFalse(unmodifiableSet instanceof List);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testUnmodifiableCollectionWithGeneralCollection_XrzF1() {
        BasicTypeConverter converter = new BasicTypeConverter();
        Collection<String> originalCollection = new ArrayList<>();
        originalCollection.add("element1");
        originalCollection.add("element2");
        Collection<String> unmodifiableCollection = converter.unmodifiableCollection(originalCollection);
        try {
            unmodifiableCollection.add("newElement");
            fail("Should throw UnsupportedOperationException on add operation");
        } catch (UnsupportedOperationException e) {
        }
        assertFalse(unmodifiableCollection instanceof Set);
        assertFalse(unmodifiableCollection instanceof SortedSet);
        assertFalse(unmodifiableCollection instanceof List);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testConvertNullToObject_fttf0() {
        BasicTypeConverter converter = new BasicTypeConverter();
        assertNull(converter.convert(null, Object.class));
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testConvertNullToPrimitiveInt_PvQI1() {
        BasicTypeConverter converter = new BasicTypeConverter();
        assertEquals(0, converter.convert(null, int.class));
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testConvertArrayToArray_JoBn4() {
        BasicTypeConverter converter = new BasicTypeConverter();
        Integer[] array = new Integer[]{1, 2, 3};
        Integer[] result = (Integer[]) converter.convert(array, Integer[].class);
        assertArrayEquals(array, result);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testConvertArrayToCollection_gwZR5() {
        BasicTypeConverter converter = new BasicTypeConverter();
        Integer[] array = new Integer[]{1, 2, 3};
        Collection<Integer> result = (Collection<Integer>) converter.convert(array, List.class);
        assertEquals(Arrays.asList(array), result);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testConvertArrayToSingleElement_PmEk6() {
        BasicTypeConverter converter = new BasicTypeConverter();
        Integer[] array = new Integer[]{1, 2, 3};
        assertEquals(1, converter.convert(array, Integer.class));
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testConvertEmptyArrayToDefault_hrcT7() {
        BasicTypeConverter converter = new BasicTypeConverter();
        Integer[] array = new Integer[]{};
        assertEquals("", converter.convert(array, String.class));
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testConvertCollectionToArray_FhIF8() {
        BasicTypeConverter converter = new BasicTypeConverter();
        List<Integer> list = Arrays.asList(1, 2, 3);
        Integer[] result = (Integer[]) converter.convert(list, Integer[].class);
        assertArrayEquals(list.toArray(new Integer[0]), result);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testConvertCollectionToCollection_ZNAr9() {
        BasicTypeConverter converter = new BasicTypeConverter();
        List<Integer> list = Arrays.asList(1, 2, 3);
        Collection<Integer> result = (Collection<Integer>) converter.convert(list, Set.class);
        assertEquals(new HashSet<>(list), result);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testConvertCollectionToSingleElement_GUzL10() {
        BasicTypeConverter converter = new BasicTypeConverter();
        List<Integer> list = Arrays.asList(1, 2, 3);
        assertEquals(1, converter.convert(list, Integer.class));
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testConvertEmptyCollectionToDefault_AiXO11() {
        BasicTypeConverter converter = new BasicTypeConverter();
        List<Integer> list = Collections.emptyList();
        assertEquals("", converter.convert(list, String.class));
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testConvertBooleanToNumber_AAkp12() {
        BasicTypeConverter converter = new BasicTypeConverter();
        assertEquals(1, converter.convert(true, Integer.class));
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testConvertNumberToBoolean_yKda14() {
        BasicTypeConverter converter = new BasicTypeConverter();
        assertEquals(Boolean.TRUE, converter.convert(1, Boolean.class));
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testConvertStringToPrimitive_sOdk16() {
        BasicTypeConverter converter = new BasicTypeConverter();
        assertEquals(123, converter.convert("123", Integer.class));
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCanConvertArrayElementNotConvertible_WoUi0() {
        BasicTypeConverter converter = new BasicTypeConverter();
        Integer[] array = new Integer[]{1, 2, 3};
        assertFalse(converter.canConvert(array, Boolean[].class));
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCanConvertArrayToCollection_WWCT1() {
        BasicTypeConverter converter = new BasicTypeConverter();
        Integer[] array = new Integer[]{1, 2, 3};
        assertTrue(converter.canConvert(array, List.class));
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCanConvertNonEmptyCollectionToDifferentType_ZOLD2() {
        BasicTypeConverter converter = new BasicTypeConverter();
        List<String> list = Arrays.asList("1", "2", "3");
        assertTrue(converter.canConvert(list, Integer.class));
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCanConvertListDirectly_HFzw3() {
        BasicTypeConverter converter = new BasicTypeConverter();
        List<Integer> list = Arrays.asList(1, 2, 3);
        assertTrue(converter.canConvert(list, List.class));
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCanConvertIteratorNextElement_oqAj4() {
        BasicTypeConverter converter = new BasicTypeConverter();
        Set<String> set = new HashSet<>(Arrays.asList("1", "2", "3"));
        assertTrue(converter.canConvert(set, Integer.class));
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCanConvertEmptyCollectionToString_GFlr5() {
        BasicTypeConverter converter = new BasicTypeConverter();
        List<String> list = new ArrayList<>();
        assertTrue(converter.canConvert(list, String.class));
    }

@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCanConvertUsingConvertUtils_Iefq8() {
        BasicTypeConverter converter = new BasicTypeConverter();
        assertTrue(converter.canConvert("123", Integer.class));
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCanConvertBooleanToNumber_urbn9() {
        BasicTypeConverter converter = new BasicTypeConverter();
        assertTrue(converter.canConvert(true, Integer.class));
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCanConvertStringToPrimitiveTypes_kCGr10() {
        BasicTypeConverter converter = new BasicTypeConverter();
        assertTrue(converter.canConvert("123", int.class));
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCanConvertArrayToArray_jNIP11() {
        BasicTypeConverter converter = new BasicTypeConverter();
        String[] array = new String[]{"1", "2", "3"};
        assertTrue(converter.canConvert(array, String[].class));
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCanConvertArrayLength_ABEQ12() {
        BasicTypeConverter converter = new BasicTypeConverter();
        Integer[] array = new Integer[]{1, 2, 3};
        assertTrue(converter.canConvert(array, Integer[].class));
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCanConvertStringToNumber_wzdj15() {
        BasicTypeConverter converter = new BasicTypeConverter();
        assertTrue(converter.canConvert("123", Double.class));
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCanConvertStringToBoolean_qzRn16() {
        BasicTypeConverter converter = new BasicTypeConverter();
        assertTrue(converter.canConvert("true", Boolean.class));
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCanConvertStringToCharacter_hcTv17() {
        BasicTypeConverter converter = new BasicTypeConverter();
        assertTrue(converter.canConvert("a", Character.class));
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCanConvertStringToAtomicBoolean_OacP18() {
        BasicTypeConverter converter = new BasicTypeConverter();
        assertTrue(converter.canConvert("true", java.util.concurrent.atomic.AtomicBoolean.class));
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCanConvertBooleanToAtomicBoolean_yBPY19() {
        BasicTypeConverter converter = new BasicTypeConverter();
        assertTrue(converter.canConvert(true, java.util.concurrent.atomic.AtomicBoolean.class));
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCanConvertNumberToBoolean_Lhqd20() {
        BasicTypeConverter converter = new BasicTypeConverter();
        assertTrue(converter.canConvert(1, Boolean.class));
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCanConvertEmptyStringToType_tdeg21() {
        BasicTypeConverter converter = new BasicTypeConverter();
        assertTrue(converter.canConvert("", Integer.class));
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCanConvertNull_fmpy22() {
        BasicTypeConverter converter = new BasicTypeConverter();
        assertTrue(converter.canConvert(null, Object.class));
    }
}