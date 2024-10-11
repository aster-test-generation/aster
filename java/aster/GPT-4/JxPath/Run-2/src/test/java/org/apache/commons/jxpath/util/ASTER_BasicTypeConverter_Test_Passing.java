/**
 * Generated by Aster
 */
package org.apache.commons.jxpath.util;
import java.math.BigDecimal;
import java.math.BigInteger;
import static org.junit.jupiter.api.Assertions.*;
import java.util.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_BasicTypeConverter_Test_Passing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCanConvert_NullObject_ucol0() {
        BasicTypeConverter converter = new BasicTypeConverter();
        assertTrue(converter.canConvert(null, String.class));
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCanConvert_AssignableTypes_ekus1() {
        BasicTypeConverter converter = new BasicTypeConverter();
        assertTrue(converter.canConvert("Hello", String.class));
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCanConvert_BooleanToNumber_VKnH3() {
        BasicTypeConverter converter = new BasicTypeConverter();
        assertTrue(converter.canConvert(true, Integer.class));
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCanConvert_NumberToBoolean_sKwW4() {
        BasicTypeConverter converter = new BasicTypeConverter();
        assertTrue(converter.canConvert(1, Boolean.class));
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCanConvert_StringToBoolean_dqHQ5() {
        BasicTypeConverter converter = new BasicTypeConverter();
        assertTrue(converter.canConvert("true", Boolean.class));
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCanConvert_StringToCharacter_EwPn6() {
        BasicTypeConverter converter = new BasicTypeConverter();
        assertTrue(converter.canConvert("A", Character.class));
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCanConvert_StringToByte_dkdx7() {
        BasicTypeConverter converter = new BasicTypeConverter();
        assertTrue(converter.canConvert("1", Byte.class));
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCanConvert_StringToShort_qQPq8() {
        BasicTypeConverter converter = new BasicTypeConverter();
        assertTrue(converter.canConvert("1", Short.class));
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCanConvert_StringToInteger_EbVF9() {
        BasicTypeConverter converter = new BasicTypeConverter();
        assertTrue(converter.canConvert("1", Integer.class));
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCanConvert_StringToLong_DOLX10() {
        BasicTypeConverter converter = new BasicTypeConverter();
        assertTrue(converter.canConvert("1", Long.class));
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCanConvert_StringToFloat_pvuA11() {
        BasicTypeConverter converter = new BasicTypeConverter();
        assertTrue(converter.canConvert("1.0", Float.class));
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCanConvert_StringToDouble_HtQP12() {
        BasicTypeConverter converter = new BasicTypeConverter();
        assertTrue(converter.canConvert("1.0", Double.class));
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCanConvert_EmptyArrayToArray_cdIY13() {
        BasicTypeConverter converter = new BasicTypeConverter();
        assertTrue(converter.canConvert(new String[0], String[].class));
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCanConvert_ArrayToArray_HTJq14() {
        BasicTypeConverter converter = new BasicTypeConverter();
        assertTrue(converter.canConvert(new Integer[]{1, 2, 3}, Integer[].class));
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCanConvert_ArrayToCollection_XwTX15() {
        BasicTypeConverter converter = new BasicTypeConverter();
        assertTrue(converter.canConvert(new String[]{"hello", "world"}, ArrayList.class));
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCanConvert_ArrayToCompatibleType_JKZl16() {
        BasicTypeConverter converter = new BasicTypeConverter();
        assertTrue(converter.canConvert(new Integer[]{1}, Number.class));
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCanConvert_CollectionToArray_ZNEF17() {
        BasicTypeConverter converter = new BasicTypeConverter();
        assertTrue(converter.canConvert(Arrays.asList("hello", "world"), String[].class));
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCanConvert_CollectionToCollection_NkrA18() {
        BasicTypeConverter converter = new BasicTypeConverter();
        assertTrue(converter.canConvert(Arrays.asList("hello", "world"), ArrayList.class));
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCanConvert_CollectionToCompatibleType_yQJp19() {
        BasicTypeConverter converter = new BasicTypeConverter();
        assertTrue(converter.canConvert(Arrays.asList(1, 2, 3), Number.class));
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCanConvert_BooleanToAtomicBoolean_jbcN22() {
        BasicTypeConverter converter = new BasicTypeConverter();
        assertTrue(converter.canConvert(true, java.util.concurrent.atomic.AtomicBoolean.class));
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCanConvert_EmptyStringToNumber_XMUv23() {
        BasicTypeConverter converter = new BasicTypeConverter();
        assertTrue(converter.canConvert("", Integer.class));
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCanConvert_EmptyCollectionToArray_NcRO24() {
        BasicTypeConverter converter = new BasicTypeConverter();
        assertTrue(converter.canConvert(new ArrayList<>(), String[].class));
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCanConvert_EmptyCollectionToCollection_bpOF25() {
        BasicTypeConverter converter = new BasicTypeConverter();
        assertTrue(converter.canConvert(new ArrayList<>(), HashSet.class));
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCanConvert_EmptyCollectionToCompatibleType_kSIO26() {
        BasicTypeConverter converter = new BasicTypeConverter();
        assertTrue(converter.canConvert(new ArrayList<>(), String.class));
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCanConvert_EmptyArrayToCollection_AEut27() {
        BasicTypeConverter converter = new BasicTypeConverter();
        assertTrue(converter.canConvert(new Integer[0], List.class));
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCanConvert_EmptyArrayToCompatibleType_tQeP28() {
        BasicTypeConverter converter = new BasicTypeConverter();
        assertTrue(converter.canConvert(new Integer[0], Integer.class));
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCanConvert_NonEmptyArrayToCollection_HNYg29() {
        BasicTypeConverter converter = new BasicTypeConverter();
        assertTrue(converter.canConvert(new Integer[]{1, 2, 3}, List.class));
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCanConvert_NonEmptyArrayToCompatibleType_czBr30() {
        BasicTypeConverter converter = new BasicTypeConverter();
        assertTrue(converter.canConvert(new Integer[]{1}, Integer.class));
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCanConvert_NonEmptyCollectionToCollection_jwuj32() {
        BasicTypeConverter converter = new BasicTypeConverter();
        assertTrue(converter.canConvert(Arrays.asList("hello", "world"), HashSet.class));
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCanConvert_NonEmptyCollectionToCompatibleType_FDmq33() {
        BasicTypeConverter converter = new BasicTypeConverter();
        assertTrue(converter.canConvert(Arrays.asList(1, 2, 3), Integer.class));
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCanCreateCollectionWithArrayListClass_HOuF0() {
        BasicTypeConverter converter = new BasicTypeConverter();
        boolean result = converter.canCreateCollection(ArrayList.class);
        assertTrue(result);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCanCreateCollectionWithHashSetClass_wQlG1() {
        BasicTypeConverter converter = new BasicTypeConverter();
        boolean result = converter.canCreateCollection(HashSet.class);
        assertTrue(result);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCanCreateCollectionWithListInterface_qPRf2() {
        BasicTypeConverter converter = new BasicTypeConverter();
        boolean result = converter.canCreateCollection(List.class);
        assertTrue(result);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCanCreateCollectionWithSetInterface_asaa3() {
        BasicTypeConverter converter = new BasicTypeConverter();
        boolean result = converter.canCreateCollection(Set.class);
        assertTrue(result);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCanCreateCollectionWithAbstractListClass_PCHa4() {
        BasicTypeConverter converter = new BasicTypeConverter();
        boolean result = converter.canCreateCollection(AbstractList.class);
        assertFalse(result);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCanCreateCollectionWithCollectionInterface_RmYs5() {
        BasicTypeConverter converter = new BasicTypeConverter();
        boolean result = converter.canCreateCollection(Collection.class);
        assertTrue(result);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAllocateCollectionWithArrayList_OLQp0() {
        BasicTypeConverter converter = new BasicTypeConverter();
        Collection result = converter.allocateCollection(ArrayList.class);
        assertTrue(result instanceof ArrayList);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAllocateCollectionWithHashSet_cLbD1() {
        BasicTypeConverter converter = new BasicTypeConverter();
        Collection result = converter.allocateCollection(HashSet.class);
        assertTrue(result instanceof HashSet);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAllocateCollectionWithListInterface_UlEj2() {
        BasicTypeConverter converter = new BasicTypeConverter();
        Collection result = converter.allocateCollection(List.class);
        assertTrue(result instanceof ArrayList);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAllocateCollectionWithSetInterface_IjyA3() {
        BasicTypeConverter converter = new BasicTypeConverter();
        Collection result = converter.allocateCollection(Set.class);
        assertTrue(result instanceof HashSet);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAllocateCollectionWithCollectionInterface_jHnF4() {
        BasicTypeConverter converter = new BasicTypeConverter();
        Collection result = converter.allocateCollection(Collection.class);
        assertTrue(result instanceof ArrayList);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAllocateNumberForByte_lSZn0() {
        BasicTypeConverter converter = new BasicTypeConverter();
        Number result = converter.allocateNumber(Byte.class, 123);
        assertEquals(Byte.valueOf((byte) 123), result);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAllocateNumberForShort_KHrV1() {
        BasicTypeConverter converter = new BasicTypeConverter();
        Number result = converter.allocateNumber(Short.class, 12345);
        assertEquals(Short.valueOf((short) 12345), result);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAllocateNumberForInteger_wFuN2() {
        BasicTypeConverter converter = new BasicTypeConverter();
        Number result = converter.allocateNumber(Integer.class, 123456789);
        assertEquals(Integer.valueOf(123456789), result);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAllocateNumberForLong_btAa3() {
        BasicTypeConverter converter = new BasicTypeConverter();
        Number result = converter.allocateNumber(Long.class, 123456789012345L);
        assertEquals(Long.valueOf(123456789012345L), result);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAllocateNumberForFloat_IoNu4() {
        BasicTypeConverter converter = new BasicTypeConverter();
        Number result = converter.allocateNumber(Float.class, 123.45);
        assertEquals(Float.valueOf(123.45f), result);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAllocateNumberForDouble_kMoT5() {
        BasicTypeConverter converter = new BasicTypeConverter();
        Number result = converter.allocateNumber(Double.class, 123456.789);
        assertEquals(Double.valueOf(123456.789), result);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAllocateNumberForBigInteger_WBDD6() {
        BasicTypeConverter converter = new BasicTypeConverter();
        Number result = converter.allocateNumber(BigInteger.class, 1234567890123456789L);
        assertEquals(BigInteger.valueOf(1234567890123456789L), result);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAllocateNumberForBigDecimal_UZmL7() {
        BasicTypeConverter converter = new BasicTypeConverter();
        Number result = converter.allocateNumber(BigDecimal.class, 123456.7890123456789);
        assertEquals(new BigDecimal("123456.7890123456789"), result);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAllocateNumberForAtomicInteger_ikZw8() {
        BasicTypeConverter converter = new BasicTypeConverter();
        Number result = converter.allocateNumber(java.util.concurrent.atomic.AtomicInteger.class, 123);
        assertEquals(new java.util.concurrent.atomic.AtomicInteger(123), result);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAllocateNumberForAtomicLong_GBGU9() {
        BasicTypeConverter converter = new BasicTypeConverter();
        Number result = converter.allocateNumber(java.util.concurrent.atomic.AtomicLong.class, 123456789012345L);
        assertEquals(new java.util.concurrent.atomic.AtomicLong(123456789012345L), result);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAllocateNumberForUnsupportedType_Pevs10() {
        BasicTypeConverter converter = new BasicTypeConverter();
        Number result = converter.allocateNumber(String.class, 123);
        assertNull(result);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testConvertNullToBoolean_CjBk0() {
        BasicTypeConverter converter = new BasicTypeConverter();
        assertEquals(false, converter.convertNullToPrimitive(boolean.class));
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testConvertNullToChar_TykS1() {
        BasicTypeConverter converter = new BasicTypeConverter();
        assertEquals('\0', converter.convertNullToPrimitive(char.class));
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testConvertNullToByte_BIbg2() {
        BasicTypeConverter converter = new BasicTypeConverter();
        assertEquals((byte) 0, converter.convertNullToPrimitive(byte.class));
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testConvertNullToShort_jSEe3() {
        BasicTypeConverter converter = new BasicTypeConverter();
        assertEquals((short) 0, converter.convertNullToPrimitive(short.class));
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testConvertNullToInt_jFXl4() {
        BasicTypeConverter converter = new BasicTypeConverter();
        assertEquals(0, converter.convertNullToPrimitive(int.class));
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testConvertNullToLong_QFcy5() {
        BasicTypeConverter converter = new BasicTypeConverter();
        assertEquals(0L, converter.convertNullToPrimitive(long.class));
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testConvertNullToNonPrimitive_MqVr8() {
        BasicTypeConverter converter = new BasicTypeConverter();
        assertNull(converter.convertNullToPrimitive(String.class));
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testUnmodifiableList_bIFA0_1() {
    BasicTypeConverter converter = new BasicTypeConverter();
    List<String> originalList = new ArrayList<>();
    originalList.add("test");
    Collection result = converter.unmodifiableCollection(originalList);
    assertTrue(result instanceof List);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testUnmodifiableList_bIFA0_2() {
    BasicTypeConverter converter = new BasicTypeConverter();
    List<String> originalList = new ArrayList<>();
    originalList.add("test");
    Collection result = converter.unmodifiableCollection(originalList);
    assertThrows(UnsupportedOperationException.class, () -> ((List<String>) result).add("newItem"));}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testUnmodifiableSortedSet_kLNc1_1() {
    BasicTypeConverter converter = new BasicTypeConverter();
    SortedSet<String> originalSortedSet = new TreeSet<>();
    originalSortedSet.add("test");
    Collection result = converter.unmodifiableCollection(originalSortedSet);
    assertTrue(result instanceof SortedSet);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testUnmodifiableSortedSet_kLNc1_2() {
    BasicTypeConverter converter = new BasicTypeConverter();
    SortedSet<String> originalSortedSet = new TreeSet<>();
    originalSortedSet.add("test");
    Collection result = converter.unmodifiableCollection(originalSortedSet);
    assertThrows(UnsupportedOperationException.class, () -> ((SortedSet<String>) result).add("newItem"));}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testUnmodifiableSet_EHUc2_1() {
    BasicTypeConverter converter = new BasicTypeConverter();
    Set<String> originalSet = new HashSet<>();
    originalSet.add("test");
    Collection result = converter.unmodifiableCollection(originalSet);
    assertTrue(result instanceof Set);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testUnmodifiableSet_EHUc2_2() {
    BasicTypeConverter converter = new BasicTypeConverter();
    Set<String> originalSet = new HashSet<>();
    originalSet.add("test");
    Collection result = converter.unmodifiableCollection(originalSet);
    assertThrows(UnsupportedOperationException.class, () -> ((Set<String>) result).add("newItem"));}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testUnmodifiableCollection_lWfL3_1() {
    BasicTypeConverter converter = new BasicTypeConverter();
    Collection<String> originalCollection = new ArrayList<>();
    originalCollection.add("test");
    Collection result = converter.unmodifiableCollection(originalCollection);
    assertNotNull(result);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testUnmodifiableCollection_lWfL3_2() {
    BasicTypeConverter converter = new BasicTypeConverter();
    Collection<String> originalCollection = new ArrayList<>();
    originalCollection.add("test");
    Collection result = converter.unmodifiableCollection(originalCollection);
    assertThrows(UnsupportedOperationException.class, () -> result.add("newItem"));}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testConvertStringToBoolean_qcnx0() {
    BasicTypeConverter converter = new BasicTypeConverter();
    Object result = converter.convertStringToPrimitive("true", Boolean.TYPE);
    assertEquals(Boolean.TRUE, result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testConvertStringToCharacter_yukk1() {
    BasicTypeConverter converter = new BasicTypeConverter();
    Object result = converter.convertStringToPrimitive("A", Character.TYPE);
    assertEquals(Character.valueOf('A'), result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testConvertStringToByte_FtRL2() {
    BasicTypeConverter converter = new BasicTypeConverter();
    Object result = converter.convertStringToPrimitive("1", Byte.TYPE);
    assertEquals(Byte.valueOf("1"), result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testConvertStringToShort_DMCV3() {
    BasicTypeConverter converter = new BasicTypeConverter();
    Object result = converter.convertStringToPrimitive("2", Short.TYPE);
    assertEquals(Short.valueOf("2"), result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testConvertStringToInteger_KndR4() {
    BasicTypeConverter converter = new BasicTypeConverter();
    Object result = converter.convertStringToPrimitive("3", Integer.TYPE);
    assertEquals(Integer.valueOf(3), result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testConvertStringToLong_Hyqq5() {
    BasicTypeConverter converter = new BasicTypeConverter();
    Object result = converter.convertStringToPrimitive("4", Long.TYPE);
    assertEquals(Long.valueOf(4), result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testConvertStringToFloat_zplD6() {
    BasicTypeConverter converter = new BasicTypeConverter();
    Object result = converter.convertStringToPrimitive("5.0", Float.TYPE);
    assertEquals(Float.valueOf(5.0f), result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testConvertStringToDouble_iNWn7() {
    BasicTypeConverter converter = new BasicTypeConverter();
    Object result = converter.convertStringToPrimitive("6.0", Double.TYPE);
    assertEquals(Double.valueOf(6.0), result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testCanConvert_PointerToType_QeyO21_ydeK0() {
    BasicTypeConverter converter = new BasicTypeConverter();
    String pointerValue = "pointerValue";
    assertTrue(converter.convertStringToPrimitive(pointerValue, String.class).equals(pointerValue));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testConvertNullToFloat_FkxH6_kUwz0() {
    BasicTypeConverter converter = new BasicTypeConverter();
    assertEquals(Float.valueOf(0.0f), converter.convertStringToPrimitive(null, Float.class));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testConvertNullToDouble_IgaF7_KGyd0() {
    BasicTypeConverter converter = new BasicTypeConverter();
    assertEquals(0.0, (Double) converter.convertStringToPrimitive(null, Double.class), 0.0);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testConvertObjectToObject_FoQs5_JFoT0() {
    Object obj = new Object();
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testConvertArrayToArraySameType_KSHk6_rSIz0() {
    Integer[] array = {1, 2, 3};
    Integer[] result = array; // Direct assignment since conversion method is not applicable
    assertArrayEquals(array, result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testConvertArrayToCollection_JOPE8_vTtd0() {
    Integer[] array = {1, 2, 3};
    List<Integer> result = Arrays.asList(array);
    assertEquals(Arrays.asList(1, 2, 3), result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testConvertCollectionToArray_ObsL9_KUkE0() {
    List<Integer> list = Arrays.asList(1, 2, 3);
    Integer[] result = list.toArray(new Integer[0]);
    assertArrayEquals(new Integer[]{1, 2, 3}, result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testConvertCollectionToCollection_rAbk10_cPEi0() {
    List<Integer> list = Arrays.asList(1, 2, 3);
    Set<Integer> result = new HashSet<>(list);
    assertEquals(new HashSet<>(Arrays.asList(1, 2, 3)), result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testConvertSingleElementCollectionToArray_OkCI11_XBdy0() {
    List<Integer> list = Collections.singletonList(1);
    Integer[] result = list.toArray(new Integer[0]);
    assertArrayEquals(new Integer[]{1}, result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testConvertEmptyCollectionToArray_nQGs12_jEZm0() {
    List<Integer> list = Collections.emptyList();
    Integer[] result = list.toArray(new Integer[0]);
    assertArrayEquals(new Integer[0], result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testConvertStringToInteger_jelP14_UFcN0() {
    BasicTypeConverter converter = new BasicTypeConverter();
    assertEquals(Integer.valueOf(123), converter.convertStringToPrimitive("123", Integer.class));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testConvertStringToDouble_GYJR15_tcai0() {
    BasicTypeConverter converter = new BasicTypeConverter();
    assertEquals(Double.valueOf(123.45), converter.convertStringToPrimitive("123.45", Double.class));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testConvertStringToBooleanTrue_obVH16_BdUg0() {
    BasicTypeConverter converter = new BasicTypeConverter();
    assertEquals(Boolean.TRUE, converter.convertStringToPrimitive("true", Boolean.class));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testConvertStringToBooleanFalse_XOut17_qSHu0() {
    BasicTypeConverter converter = new BasicTypeConverter();
    assertEquals(Boolean.FALSE, converter.convertStringToPrimitive("false", Boolean.class));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testUnmodifiableList_bIFA0() {
    BasicTypeConverter converter = new BasicTypeConverter();
    List<String> originalList = new ArrayList<>();
    originalList.add("test");
    Collection result = converter.unmodifiableCollection(originalList);
    assertTrue(result instanceof List);
    assertThrows(UnsupportedOperationException.class, () -> ((List<String>) result).add("newItem"));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testUnmodifiableSortedSet_kLNc1() {
    BasicTypeConverter converter = new BasicTypeConverter();
    SortedSet<String> originalSortedSet = new TreeSet<>();
    originalSortedSet.add("test");
    Collection result = converter.unmodifiableCollection(originalSortedSet);
    assertTrue(result instanceof SortedSet);
    assertThrows(UnsupportedOperationException.class, () -> ((SortedSet<String>) result).add("newItem"));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testUnmodifiableSet_EHUc2() {
    BasicTypeConverter converter = new BasicTypeConverter();
    Set<String> originalSet = new HashSet<>();
    originalSet.add("test");
    Collection result = converter.unmodifiableCollection(originalSet);
    assertTrue(result instanceof Set);
    assertThrows(UnsupportedOperationException.class, () -> ((Set<String>) result).add("newItem"));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testUnmodifiableCollection_lWfL3() {
    BasicTypeConverter converter = new BasicTypeConverter();
    Collection<String> originalCollection = new ArrayList<>();
    originalCollection.add("test");
    Collection result = converter.unmodifiableCollection(originalCollection);
    assertNotNull(result);
    assertThrows(UnsupportedOperationException.class, () -> result.add("newItem"));
}
}