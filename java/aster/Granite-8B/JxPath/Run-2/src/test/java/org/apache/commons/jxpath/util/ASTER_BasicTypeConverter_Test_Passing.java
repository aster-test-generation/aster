/**
 * Generated by Aster
 */
package org.apache.commons.jxpath.util;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.*;
import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_BasicTypeConverter_Test_Passing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCanConvertWithNullObjectAndPrimitiveType_ZwcR0() {
        BasicTypeConverter converter = new BasicTypeConverter();
        boolean result = converter.canConvert(null, int.class);
        assertTrue(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCanConvertWithNullObjectAndWrapperType_afyO1() {
        BasicTypeConverter converter = new BasicTypeConverter();
        boolean result = converter.canConvert(null, Integer.class);
        assertTrue(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCanConvertWithStringObjectAndPrimitiveType_qwbo2() {
        BasicTypeConverter converter = new BasicTypeConverter();
        boolean result = converter.canConvert("123", int.class);
        assertTrue(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCanConvertWithStringObjectAndWrapperType_ahEr3() {
        BasicTypeConverter converter = new BasicTypeConverter();
        boolean result = converter.canConvert("123", Integer.class);
        assertTrue(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCanConvertWithBooleanObjectAndPrimitiveType_LIHP4() {
        BasicTypeConverter converter = new BasicTypeConverter();
        boolean result = converter.canConvert(true, boolean.class);
        assertTrue(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCanConvertWithBooleanObjectAndWrapperType_onTw5() {
        BasicTypeConverter converter = new BasicTypeConverter();
        boolean result = converter.canConvert(true, Boolean.class);
        assertTrue(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCanConvertWithNumberObjectAndPrimitiveType_tKkN6() {
        BasicTypeConverter converter = new BasicTypeConverter();
        boolean result = converter.canConvert(123, int.class);
        assertTrue(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCanConvertWithNumberObjectAndWrapperType_Xeku7() {
        BasicTypeConverter converter = new BasicTypeConverter();
        boolean result = converter.canConvert(123, Integer.class);
        assertTrue(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCanConvertWithArrayObjectAndPrimitiveType_VvMO8() {
        BasicTypeConverter converter = new BasicTypeConverter();
        boolean result = converter.canConvert(new int[]{1, 2, 3}, int.class);
        assertTrue(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCanConvertWithArrayObjectAndWrapperType_zYTn9() {
        BasicTypeConverter converter = new BasicTypeConverter();
        boolean result = converter.canConvert(new Integer[]{1, 2, 3}, Integer.class);
        assertTrue(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCanConvertWithCollectionObjectAndPrimitiveType_vosW10() {
        BasicTypeConverter converter = new BasicTypeConverter();
        boolean result = converter.canConvert(Arrays.asList(1, 2, 3), int.class);
        assertTrue(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCanConvertWithCollectionObjectAndWrapperType_nZLp11() {
        BasicTypeConverter converter = new BasicTypeConverter();
        boolean result = converter.canConvert(Arrays.asList(1, 2, 3), Integer.class);
        assertTrue(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCanCreateCollectionWithNonInterfaceNonAbstractClass_HZTz0() {
        BasicTypeConverter converter = new BasicTypeConverter();
        Class nonInterfaceNonAbstractClass = String.class;
        boolean result = converter.canCreateCollection(nonInterfaceNonAbstractClass);
        assertTrue(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCanCreateCollectionWithInterfaceClass_lplG1() {
        BasicTypeConverter converter = new BasicTypeConverter();
        Class interfaceClass = List.class;
        boolean result = converter.canCreateCollection(interfaceClass);
        assertTrue(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCanCreateCollectionWithAbstractClass_ixoX2() {
        BasicTypeConverter converter = new BasicTypeConverter();
        Class abstractClass = ArrayList.class;
        boolean result = converter.canCreateCollection(abstractClass);
        assertTrue(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAllocateCollection_DyJT0_1() {
        BasicTypeConverter converter = new BasicTypeConverter();
        Collection collection = converter.allocateCollection(ArrayList.class);
        assertNotNull(collection);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAllocateCollection_DyJT0_2() {
        BasicTypeConverter converter = new BasicTypeConverter();
        Collection collection = converter.allocateCollection(ArrayList.class);
        assertTrue(collection instanceof ArrayList);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAllocateCollection2_VdOX1_1() {
        BasicTypeConverter converter = new BasicTypeConverter();
        Collection collection = converter.allocateCollection(HashSet.class);
        assertNotNull(collection);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAllocateCollection2_VdOX1_2() {
        BasicTypeConverter converter = new BasicTypeConverter();
        Collection collection = converter.allocateCollection(HashSet.class);
        assertTrue(collection instanceof HashSet);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAllocateCollection3_lxXB2_1() {
        BasicTypeConverter converter = new BasicTypeConverter();
        Collection collection = converter.allocateCollection(List.class);
        assertNotNull(collection);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAllocateCollection3_lxXB2_2() {
        BasicTypeConverter converter = new BasicTypeConverter();
        Collection collection = converter.allocateCollection(List.class);
        assertTrue(collection instanceof ArrayList);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAllocateCollection4_CwzD3_1() {
        BasicTypeConverter converter = new BasicTypeConverter();
        Collection collection = converter.allocateCollection(Collection.class);
        assertNotNull(collection);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAllocateCollection4_CwzD3_2() {
        BasicTypeConverter converter = new BasicTypeConverter();
        Collection collection = converter.allocateCollection(Collection.class);
        assertTrue(collection instanceof ArrayList);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAllocateCollection5_DVoS4_1() {
        BasicTypeConverter converter = new BasicTypeConverter();
        Collection collection = converter.allocateCollection(Set.class);
        assertNotNull(collection);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAllocateCollection5_DVoS4_2() {
        BasicTypeConverter converter = new BasicTypeConverter();
        Collection collection = converter.allocateCollection(Set.class);
        assertTrue(collection instanceof HashSet);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAllocateNumber_jOuL0() {
        BasicTypeConverter basicTypeConverter = new BasicTypeConverter();
        Number result = basicTypeConverter.allocateNumber(Double.class, 10.0);
        assertEquals(10.0, result.doubleValue(), 0.001);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAllocateNumber2_NpZn1() {
        BasicTypeConverter basicTypeConverter = new BasicTypeConverter();
        Number result = basicTypeConverter.allocateNumber(Integer.class, 10.0);
        assertEquals(10, result.intValue());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAllocateNumber3_srWA2() {
        BasicTypeConverter basicTypeConverter = new BasicTypeConverter();
        Number result = basicTypeConverter.allocateNumber(Long.class, 10.0);
        assertEquals(10L, result.longValue());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAllocateNumber4_mUiU3() {
        BasicTypeConverter basicTypeConverter = new BasicTypeConverter();
        Number result = basicTypeConverter.allocateNumber(Float.class, 10.0);
        assertEquals(10.0, result.floatValue(), 0.001);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAllocateNumber5_DPdj4() {
        BasicTypeConverter basicTypeConverter = new BasicTypeConverter();
        Number result = basicTypeConverter.allocateNumber(Short.class, 10.0);
        assertEquals(10, result.shortValue());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAllocateNumber6_ScDh5() {
        BasicTypeConverter basicTypeConverter = new BasicTypeConverter();
        Number result = basicTypeConverter.allocateNumber(Byte.class, 10.0);
        assertEquals(10, result.byteValue());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAllocateNumber7_AQCZ6() {
        BasicTypeConverter basicTypeConverter = new BasicTypeConverter();
        Number result = basicTypeConverter.allocateNumber(BigInteger.class, 10.0);
        assertEquals(10, result.intValue());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAllocateNumber8_oEBE7() {
        BasicTypeConverter basicTypeConverter = new BasicTypeConverter();
        Number result = basicTypeConverter.allocateNumber(BigDecimal.class, 10.0);
        assertEquals(10.0, result.doubleValue(), 0.001);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testConvertNullToPrimitiveBoolean_iLIn0() {
        BasicTypeConverter converter = new BasicTypeConverter();
        Object result = converter.convertNullToPrimitive(boolean.class);
        assertEquals(Boolean.FALSE, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testConvertNullToPrimitiveChar_rfHi1() {
        BasicTypeConverter converter = new BasicTypeConverter();
        Object result = converter.convertNullToPrimitive(char.class);
        assertEquals(Character.valueOf('\0'), result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testConvertNullToPrimitiveByte_tTpQ2() {
        BasicTypeConverter converter = new BasicTypeConverter();
        Object result = converter.convertNullToPrimitive(byte.class);
        assertEquals(Byte.valueOf((byte) 0), result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testConvertNullToPrimitiveShort_NZSL3() {
        BasicTypeConverter converter = new BasicTypeConverter();
        Object result = converter.convertNullToPrimitive(short.class);
        assertEquals(Short.valueOf((short) 0), result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testConvertNullToPrimitiveInt_IlMs4() {
        BasicTypeConverter converter = new BasicTypeConverter();
        Object result = converter.convertNullToPrimitive(int.class);
        assertEquals(Integer.valueOf(0), result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testConvertNullToPrimitiveLong_auBI5() {
        BasicTypeConverter converter = new BasicTypeConverter();
        Object result = converter.convertNullToPrimitive(long.class);
        assertEquals(Long.valueOf(0L), result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testConvertNullToPrimitiveFloat_qmPq6() {
        BasicTypeConverter converter = new BasicTypeConverter();
        Object result = converter.convertNullToPrimitive(float.class);
        assertEquals(Float.valueOf(0.0f), result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testConvertNullToPrimitiveDouble_LnVS7() {
        BasicTypeConverter converter = new BasicTypeConverter();
        Object result = converter.convertNullToPrimitive(double.class);
        assertEquals(Double.valueOf(0.0), result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testConvertNullToPrimitiveNull_qTYy8() {
        BasicTypeConverter converter = new BasicTypeConverter();
        Object result = converter.convertNullToPrimitive(null);
        assertEquals(null, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testUnmodifiableCollection1_qVwS0() {
        BasicTypeConverter converter = new BasicTypeConverter();
        Collection collection = new ArrayList<>();
        Collection result = converter.unmodifiableCollection(collection);
        assertTrue(result instanceof List);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testUnmodifiableCollection2_RRfw1() {
        BasicTypeConverter converter = new BasicTypeConverter();
        Collection collection = new TreeSet<>();
        Collection result = converter.unmodifiableCollection(collection);
        assertTrue(result instanceof SortedSet);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testUnmodifiableCollection3_lcoc2() {
        BasicTypeConverter converter = new BasicTypeConverter();
        Collection collection = new HashSet<>();
        Collection result = converter.unmodifiableCollection(collection);
        assertTrue(result instanceof Set);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testUnmodifiableCollection4_Mxbk3() {
        BasicTypeConverter converter = new BasicTypeConverter();
        Collection collection = new LinkedList<>();
        Collection result = converter.unmodifiableCollection(collection);
        assertTrue(result instanceof List);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testConvertStringToPrimitive_Boolean_FelB0() {
        BasicTypeConverter converter = new BasicTypeConverter();
        Object result = converter.convertStringToPrimitive("true", Boolean.class);
        assertEquals(true, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testConvertStringToPrimitive_Character_TcTR1() {
        BasicTypeConverter converter = new BasicTypeConverter();
        Object result = converter.convertStringToPrimitive("a", Character.class);
        assertEquals('a', result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testConvertStringToPrimitive_Byte_AHdB2() {
        BasicTypeConverter converter = new BasicTypeConverter();
        Object result = converter.convertStringToPrimitive("127", Byte.class);
        assertEquals((byte) 127, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testConvertStringToPrimitive_Short_Spqs3() {
        BasicTypeConverter converter = new BasicTypeConverter();
        Object result = converter.convertStringToPrimitive("32767", Short.class);
        assertEquals((short) 32767, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testConvertStringToPrimitive_Integer_Zobh4() {
        BasicTypeConverter converter = new BasicTypeConverter();
        Object result = converter.convertStringToPrimitive("2147483647", Integer.class);
        assertEquals(2147483647, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testConvertStringToPrimitive_Long_InHy5() {
        BasicTypeConverter converter = new BasicTypeConverter();
        Object result = converter.convertStringToPrimitive("9223372036854775807", Long.class);
        assertEquals(9223372036854775807L, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testConvertStringToPrimitive_Float_mCGm6() {
        BasicTypeConverter converter = new BasicTypeConverter();
        Object result = converter.convertStringToPrimitive("3.14", Float.class);
        assertEquals(3.14f, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testConvertStringToPrimitive_Double_jqJz7() {
        BasicTypeConverter converter = new BasicTypeConverter();
        Object result = converter.convertStringToPrimitive("2.71828", Double.class);
        assertEquals(2.71828, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testConvertStringToPrimitive_Null_pcwL8() {
        BasicTypeConverter converter = new BasicTypeConverter();
        Object result = converter.convertStringToPrimitive(null, String.class);
        assertEquals(null, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAllocateCollection_DyJT0() {
        BasicTypeConverter converter = new BasicTypeConverter();
        Collection collection = converter.allocateCollection(ArrayList.class);
        assertNotNull(collection);
        assertTrue(collection instanceof ArrayList);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAllocateCollection2_VdOX1() {
        BasicTypeConverter converter = new BasicTypeConverter();
        Collection collection = converter.allocateCollection(HashSet.class);
        assertNotNull(collection);
        assertTrue(collection instanceof HashSet);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAllocateCollection3_lxXB2() {
        BasicTypeConverter converter = new BasicTypeConverter();
        Collection collection = converter.allocateCollection(List.class);
        assertNotNull(collection);
        assertTrue(collection instanceof ArrayList);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAllocateCollection4_CwzD3() {
        BasicTypeConverter converter = new BasicTypeConverter();
        Collection collection = converter.allocateCollection(Collection.class);
        assertNotNull(collection);
        assertTrue(collection instanceof ArrayList);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAllocateCollection5_DVoS4() {
        BasicTypeConverter converter = new BasicTypeConverter();
        Collection collection = converter.allocateCollection(Set.class);
        assertNotNull(collection);
        assertTrue(collection instanceof HashSet);
    }
}