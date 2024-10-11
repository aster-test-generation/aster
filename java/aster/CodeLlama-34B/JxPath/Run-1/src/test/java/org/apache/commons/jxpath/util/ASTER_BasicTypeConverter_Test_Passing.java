/**
 * Generated by Aster
 */
package org.apache.commons.jxpath.util;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.*;
import java.util.concurrent.TimeUnit;
import org.apache.commons.jxpath.NodeSet;
import org.apache.commons.jxpath.Pointer;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_BasicTypeConverter_Test_Passing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCanConvertNull_Sdrv0() {
        BasicTypeConverter converter = new BasicTypeConverter();
        Assertions.assertTrue(converter.canConvert(null, String.class));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCanConvertAssignable_WIyy1() {
        BasicTypeConverter converter = new BasicTypeConverter();
        Assertions.assertTrue(converter.canConvert("test", String.class));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCanConvertStringToBoolean_WCHK2() {
        BasicTypeConverter converter = new BasicTypeConverter();
        Assertions.assertTrue(converter.canConvert("true", Boolean.class));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCanConvertStringToNumber_ljaO3() {
        BasicTypeConverter converter = new BasicTypeConverter();
        Assertions.assertTrue(converter.canConvert("123", Integer.class));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCanConvertNumberToBoolean_huqJ4() {
        BasicTypeConverter converter = new BasicTypeConverter();
        Assertions.assertTrue(converter.canConvert(1, Boolean.class));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCanConvertNumberToNumber_gXuH5() {
        BasicTypeConverter converter = new BasicTypeConverter();
        Assertions.assertTrue(converter.canConvert(1, Integer.class));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCanConvertStringToArray_HlwI6() {
        BasicTypeConverter converter = new BasicTypeConverter();
        Assertions.assertTrue(converter.canConvert("test", String[].class));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCanConvertArrayToArray_QgSC7() {
        BasicTypeConverter converter = new BasicTypeConverter();
        Assertions.assertTrue(converter.canConvert(new String[]{"test"}, String[].class));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCanConvertCollectionToArray_OoNT8() {
        BasicTypeConverter converter = new BasicTypeConverter();
        Assertions.assertTrue(converter.canConvert(Arrays.asList("test"), String[].class));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCanConvertArrayToCollection_KBhU9() {
        BasicTypeConverter converter = new BasicTypeConverter();
        Assertions.assertTrue(converter.canConvert(new String[]{"test"}, List.class));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCanConvertCollectionToCollection_UyXC10() {
        BasicTypeConverter converter = new BasicTypeConverter();
        Assertions.assertTrue(converter.canConvert(Arrays.asList("test"), List.class));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCanConvertOtherToPointer_ZDHj17() {
        BasicTypeConverter converter = new BasicTypeConverter();
        Assertions.assertTrue(converter.canConvert(1, Pointer.class));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCanCreateCollection_List_KHee0() {
        BasicTypeConverter converter = new BasicTypeConverter();
        assertTrue(converter.canCreateCollection(List.class));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCanCreateCollection_Collection_PMJC1() {
        BasicTypeConverter converter = new BasicTypeConverter();
        assertTrue(converter.canCreateCollection(Collection.class));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCanCreateCollection_Set_vpRn2() {
        BasicTypeConverter converter = new BasicTypeConverter();
        assertTrue(converter.canCreateCollection(Set.class));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCanCreateCollection_AbstractClass_ubZc3() {
        BasicTypeConverter converter = new BasicTypeConverter();
        assertFalse(converter.canCreateCollection(AbstractList.class));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCanCreateCollection_Interface_uINW4() {
        BasicTypeConverter converter = new BasicTypeConverter();
        assertFalse(converter.canCreateCollection(List.class));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCanCreateCollection_NonAbstractClass_hozG5() {
        BasicTypeConverter converter = new BasicTypeConverter();
        assertTrue(converter.canCreateCollection(ArrayList.class));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCanCreateCollection_NonCollectionClass_glfp6() {
        BasicTypeConverter converter = new BasicTypeConverter();
        assertFalse(converter.canCreateCollection(String.class));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCanCreateCollection_Null_LgjM7() {
        BasicTypeConverter converter = new BasicTypeConverter();
        assertFalse(converter.canCreateCollection(null));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAllocateCollection_List_LQMr0() {
        BasicTypeConverter converter = new BasicTypeConverter();
        Collection collection = converter.allocateCollection(List.class);
        assertTrue(collection instanceof ArrayList);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAllocateCollection_Set_KACS1() {
        BasicTypeConverter converter = new BasicTypeConverter();
        Collection collection = converter.allocateCollection(Set.class);
        assertTrue(collection instanceof HashSet);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAllocateCollection_AbstractClass_RuvX2() {
        BasicTypeConverter converter = new BasicTypeConverter();
        Collection collection = converter.allocateCollection(AbstractList.class);
        assertTrue(collection instanceof ArrayList);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAllocateCollection_InvalidType_TqjO4() {
        BasicTypeConverter converter = new BasicTypeConverter();
        Collection collection = converter.allocateCollection(String.class);
        assertNull(collection);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAllocateCollection_NullType_TQUG5() {
        BasicTypeConverter converter = new BasicTypeConverter();
        Collection collection = converter.allocateCollection(null);
        assertNull(collection);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testConvertNullToPrimitive_gBZF0() {
        BasicTypeConverter converter = new BasicTypeConverter();
        Object result = converter.convert(null, boolean.class);
        assertEquals(false, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testConvertNullToPrimitive2_twwt1() {
        BasicTypeConverter converter = new BasicTypeConverter();
        Object result = converter.convert(null, byte.class);
        assertEquals((byte) 0, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testConvertNullToPrimitive3_zwXk2() {
        BasicTypeConverter converter = new BasicTypeConverter();
        Object result = converter.convert(null, char.class);
        assertEquals('\0', result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testConvertNullToPrimitive4_ZYRI3() {
        BasicTypeConverter converter = new BasicTypeConverter();
        Object result = converter.convert(null, short.class);
        assertEquals((short) 0, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testConvertNullToPrimitive5_OyTu4() {
        BasicTypeConverter converter = new BasicTypeConverter();
        Object result = converter.convert(null, int.class);
        assertEquals(0, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testConvertNullToPrimitive6_naZI5() {
        BasicTypeConverter converter = new BasicTypeConverter();
        Object result = converter.convert(null, long.class);
        assertEquals(0L, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testConvertNullToPrimitive7_fyjn6() {
        BasicTypeConverter converter = new BasicTypeConverter();
        Object result = converter.convert(null, float.class);
        assertEquals(0.0f, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testConvertNullToPrimitive8_zdQY7() {
        BasicTypeConverter converter = new BasicTypeConverter();
        Object result = converter.convert(null, double.class);
        assertEquals(0.0d, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testConvertNullToObject_zTac8() {
        BasicTypeConverter converter = new BasicTypeConverter();
        Object result = converter.convert(null, Object.class);
        assertNull(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testConvertNullToCollection_FWHF9() {
        BasicTypeConverter converter = new BasicTypeConverter();
        Object result = converter.convert(null, Collection.class);
        assertNull(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testConvertNullToArray_fPwS10() {
        BasicTypeConverter converter = new BasicTypeConverter();
        Object result = converter.convert(null, Object[].class);
        assertNull(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testConvertNullToNodeSet_rGXv11() {
        BasicTypeConverter converter = new BasicTypeConverter();
        Object result = converter.convert(null, NodeSet.class);
        assertNull(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testConvertNullToPointer_GNAt12() {
        BasicTypeConverter converter = new BasicTypeConverter();
        Object result = converter.convert(null, Pointer.class);
        assertNull(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testConvertObjectToObject_gweL13() {
        BasicTypeConverter converter = new BasicTypeConverter();
        Object object = new Object();
        Object result = converter.convert(object, Object.class);
        assertSame(object, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testConvertObjectToCollection_cFSN14_1() {
        BasicTypeConverter converter = new BasicTypeConverter();
        Object object = new Object();
        Object result = converter.convert(object, Collection.class);
        assertNotNull(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testConvertObjectToCollection_cFSN14_2() {
        BasicTypeConverter converter = new BasicTypeConverter();
        Object object = new Object();
        Object result = converter.convert(object, Collection.class);
        assertTrue(result instanceof Collection);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testConvertObjectToCollection_cFSN14_3() {
        BasicTypeConverter converter = new BasicTypeConverter();
        Object object = new Object();
        Object result = converter.convert(object, Collection.class);
        assertEquals(1, ((Collection) result).size());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testConvertObjectToCollection_cFSN14_4() {
        BasicTypeConverter converter = new BasicTypeConverter();
        Object object = new Object();
        Object result = converter.convert(object, Collection.class);
        assertSame(object, ((Collection) result).iterator().next());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testConvertObjectToArray_FANm15_1() {
        BasicTypeConverter converter = new BasicTypeConverter();
        Object object = new Object();
        Object result = converter.convert(object, Object[].class);
        assertNotNull(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testConvertObjectToArray_FANm15_2() {
        BasicTypeConverter converter = new BasicTypeConverter();
        Object object = new Object();
        Object result = converter.convert(object, Object[].class);
        assertTrue(result instanceof Object[]);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testConvertObjectToArray_FANm15_3() {
        BasicTypeConverter converter = new BasicTypeConverter();
        Object object = new Object();
        Object result = converter.convert(object, Object[].class);
        assertEquals(1, ((Object[]) result).length);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testConvertObjectToArray_FANm15_4() {
        BasicTypeConverter converter = new BasicTypeConverter();
        Object object = new Object();
        Object result = converter.convert(object, Object[].class);
        assertSame(object, ((Object[]) result)[0]);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAllocateNumber_Byte_mOSe0() {
        BasicTypeConverter converter = new BasicTypeConverter();
        Number result = converter.allocateNumber(Byte.class, 10.0);
        assertEquals(Byte.valueOf((byte) 10), result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAllocateNumber_Short_wOOi1() {
        BasicTypeConverter converter = new BasicTypeConverter();
        Number result = converter.allocateNumber(Short.class, 10.0);
        assertEquals(Short.valueOf((short) 10), result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAllocateNumber_Integer_QQNg2() {
        BasicTypeConverter converter = new BasicTypeConverter();
        Number result = converter.allocateNumber(Integer.class, 10.0);
        assertEquals(Integer.valueOf(10), result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAllocateNumber_Long_vqvx3() {
        BasicTypeConverter converter = new BasicTypeConverter();
        Number result = converter.allocateNumber(Long.class, 10.0);
        assertEquals(Long.valueOf(10L), result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAllocateNumber_Float_QEUo4() {
        BasicTypeConverter converter = new BasicTypeConverter();
        Number result = converter.allocateNumber(Float.class, 10.0);
        assertEquals(Float.valueOf(10.0f), result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAllocateNumber_Double_valP5() {
        BasicTypeConverter converter = new BasicTypeConverter();
        Number result = converter.allocateNumber(Double.class, 10.0);
        assertEquals(Double.valueOf(10.0), result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAllocateNumber_BigInteger_NSBq6() {
        BasicTypeConverter converter = new BasicTypeConverter();
        Number result = converter.allocateNumber(BigInteger.class, 10.0);
        assertEquals(BigInteger.valueOf(10L), result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAllocateNumber_BigDecimal_jGlm7() {
        BasicTypeConverter converter = new BasicTypeConverter();
        Number result = converter.allocateNumber(BigDecimal.class, 10.0);
        assertEquals(new BigDecimal(10.0), result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAllocateNumber_InvalidType_SbqY10() {
        BasicTypeConverter converter = new BasicTypeConverter();
        Number result = converter.allocateNumber(String.class, 10.0);
        assertNull(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAllocateNumber_NullType_tQOH11() {
        BasicTypeConverter converter = new BasicTypeConverter();
        Number result = converter.allocateNumber(null, 10.0);
        assertNull(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testConvertNullToPrimitive_boolean_vJIj0() {
        BasicTypeConverter converter = new BasicTypeConverter();
        Object result = converter.convertNullToPrimitive(boolean.class);
        assertEquals(Boolean.FALSE, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testConvertNullToPrimitive_char_VGVM1() {
        BasicTypeConverter converter = new BasicTypeConverter();
        Object result = converter.convertNullToPrimitive(char.class);
        assertEquals(Character.valueOf('\0'), result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testConvertNullToPrimitive_byte_EcmJ2() {
        BasicTypeConverter converter = new BasicTypeConverter();
        Object result = converter.convertNullToPrimitive(byte.class);
        assertEquals(Byte.valueOf((byte) 0), result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testConvertNullToPrimitive_short_SMAV3() {
        BasicTypeConverter converter = new BasicTypeConverter();
        Object result = converter.convertNullToPrimitive(short.class);
        assertEquals(Short.valueOf((short) 0), result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testConvertNullToPrimitive_int_CdQR4() {
        BasicTypeConverter converter = new BasicTypeConverter();
        Object result = converter.convertNullToPrimitive(int.class);
        assertEquals(Integer.valueOf(0), result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testConvertNullToPrimitive_long_AQgS5() {
        BasicTypeConverter converter = new BasicTypeConverter();
        Object result = converter.convertNullToPrimitive(long.class);
        assertEquals(Long.valueOf(0L), result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testConvertNullToPrimitive_float_Xkmq6() {
        BasicTypeConverter converter = new BasicTypeConverter();
        Object result = converter.convertNullToPrimitive(float.class);
        assertEquals(Float.valueOf(0.0f), result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testConvertNullToPrimitive_double_KoEn7() {
        BasicTypeConverter converter = new BasicTypeConverter();
        Object result = converter.convertNullToPrimitive(double.class);
        assertEquals(Double.valueOf(0.0), result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testConvertNullToPrimitive_null_ckPS8() {
        BasicTypeConverter converter = new BasicTypeConverter();
        Object result = converter.convertNullToPrimitive(null);
        assertNull(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testUnmodifiableCollection_List_Fgrn0() {
        List<String> list = new ArrayList<>();
        list.add("apple");
        list.add("banana");
        list.add("cherry");
        Collection<String> unmodifiableCollection = new BasicTypeConverter().unmodifiableCollection(list);
        assertEquals(list, unmodifiableCollection);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testUnmodifiableCollection_SortedSet_PVEk1() {
        SortedSet<String> sortedSet = new TreeSet<>();
        sortedSet.add("apple");
        sortedSet.add("banana");
        sortedSet.add("cherry");
        Collection<String> unmodifiableCollection = new BasicTypeConverter().unmodifiableCollection(sortedSet);
        assertEquals(sortedSet, unmodifiableCollection);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testUnmodifiableCollection_Set_juos2() {
        Set<String> set = new HashSet<>();
        set.add("apple");
        set.add("banana");
        set.add("cherry");
        Collection<String> unmodifiableCollection = new BasicTypeConverter().unmodifiableCollection(set);
        assertEquals(set, unmodifiableCollection);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testConvertStringToPrimitive_Boolean_PARa0() {
        BasicTypeConverter converter = new BasicTypeConverter();
        Object result = converter.convertStringToPrimitive("true", Boolean.class);
        assertEquals(Boolean.TRUE, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testConvertStringToPrimitive_Character_Viat1() {
        BasicTypeConverter converter = new BasicTypeConverter();
        Object result = converter.convertStringToPrimitive("a", Character.class);
        assertEquals(Character.valueOf('a'), result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testConvertStringToPrimitive_Byte_vQAH2() {
        BasicTypeConverter converter = new BasicTypeConverter();
        Object result = converter.convertStringToPrimitive("123", Byte.class);
        assertEquals(Byte.valueOf((byte) 123), result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testConvertStringToPrimitive_Short_Jref3() {
        BasicTypeConverter converter = new BasicTypeConverter();
        Object result = converter.convertStringToPrimitive("12345", Short.class);
        assertEquals(Short.valueOf((short) 12345), result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testConvertStringToPrimitive_Integer_gvXU4() {
        BasicTypeConverter converter = new BasicTypeConverter();
        Object result = converter.convertStringToPrimitive("123456789", Integer.class);
        assertEquals(Integer.valueOf(123456789), result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testConvertStringToPrimitive_Long_GzUR5() {
        BasicTypeConverter converter = new BasicTypeConverter();
        Object result = converter.convertStringToPrimitive("1234567890123456789", Long.class);
        assertEquals(Long.valueOf(1234567890123456789L), result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testConvertStringToPrimitive_Float_Wlzo6() {
        BasicTypeConverter converter = new BasicTypeConverter();
        Object result = converter.convertStringToPrimitive("123.456", Float.class);
        assertEquals(Float.valueOf(123.456f), result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testConvertStringToPrimitive_Double_cfEZ7() {
        BasicTypeConverter converter = new BasicTypeConverter();
        Object result = converter.convertStringToPrimitive("123.456789", Double.class);
        assertEquals(Double.valueOf(123.456789), result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testConvertStringToPrimitive_Null_dwAc8() {
        BasicTypeConverter converter = new BasicTypeConverter();
        Object result = converter.convertStringToPrimitive(null, null);
        assertNull(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testConvertObjectToCollection_cFSN14() {
        BasicTypeConverter converter = new BasicTypeConverter();
        Object object = new Object();
        Object result = converter.convert(object, Collection.class);
        assertNotNull(result);
        assertTrue(result instanceof Collection);
        assertEquals(1, ((Collection) result).size());
        assertSame(object, ((Collection) result).iterator().next());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testConvertObjectToArray_FANm15() {
        BasicTypeConverter converter = new BasicTypeConverter();
        Object object = new Object();
        Object result = converter.convert(object, Object[].class);
        assertNotNull(result);
        assertTrue(result instanceof Object[]);
        assertEquals(1, ((Object[]) result).length);
        assertSame(object, ((Object[]) result)[0]);
    }
}