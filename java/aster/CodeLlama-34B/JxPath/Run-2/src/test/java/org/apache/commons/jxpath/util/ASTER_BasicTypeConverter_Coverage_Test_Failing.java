/**
 * Generated by Aster
 */
package org.apache.commons.jxpath.util;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.apache.commons.jxpath.JXPathTypeConversionException;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_BasicTypeConverter_Coverage_Test_Failing {
    private BasicTypeConverter converter = new BasicTypeConverter();
    private BasicTypeConverter basicTypeConverter;

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAllocateCollectionForOtherTypes_lFlo2_1() {
        BasicTypeConverter converter = new BasicTypeConverter();
        Collection collection = converter.allocateCollection(String.class);
        assertNotNull(collection);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAllocateCollectionForOtherTypes_lFlo2_2() {
        BasicTypeConverter converter = new BasicTypeConverter();
        Collection collection = converter.allocateCollection(String.class);
        assertEquals(ArrayList.class, collection.getClass());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testConvertStringToPrimitive_Null_YrEH1() {
        BasicTypeConverter converter = new BasicTypeConverter();
        Object result = converter.convertStringToPrimitive(null, Double.class);
        assertNull(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCanCreateCollectionWithAbstractClass_CCNB1_fid1() {
        BasicTypeConverter converter = new BasicTypeConverter();
        Class type = List.class;
        assertFalse(converter.canCreateCollection(type));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCanCreateCollectionWithException_rIHG3_fid1() {
        BasicTypeConverter converter = new BasicTypeConverter();
        Class type = Exception.class;
        assertFalse(converter.canCreateCollection(type));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCanCreateCollectionWithNoConstructor_lgmL4_fid1() {
        BasicTypeConverter converter = new BasicTypeConverter();
        Class type = BasicTypeConverter.class;
        assertFalse(converter.canCreateCollection(type));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testConvertArray_TRNf2() {
        BasicTypeConverter converter = new BasicTypeConverter();
        Object[] array = new Object[]{1, 2, 3};
        Object converted = converter.convert(array, String.class);
        assertEquals(Arrays.asList(array), converted);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testConvertCollection_iWit3() {
        BasicTypeConverter converter = new BasicTypeConverter();
        Collection collection = new ArrayList();
        collection.add(1);
        collection.add(2);
        collection.add(3);
        Object converted = converter.convert(collection, String.class);
        assertEquals(collection, converted);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testConvertInvalidType_VPYI9() {
        BasicTypeConverter converter = new BasicTypeConverter();
        try {
            converter.convert(new Object(), String.class);
            fail("Expected JXPathTypeConversionException");
        } catch (JXPathTypeConversionException e) {
            assertEquals("Cannot convert java.lang.Object to java.lang.String", e.getMessage());
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAllocateNumber_BigDecimal_bkec2_1() {
        Class type = BigDecimal.class;
        double value = 10.0;
        Number result = basicTypeConverter.allocateNumber(type, value);
        assertNotNull(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAllocateNumber_BigDecimal_bkec2_2() {
        Class type = BigDecimal.class;
        double value = 10.0;
        Number result = basicTypeConverter.allocateNumber(type, value);
        assertTrue(result instanceof BigDecimal);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAllocateNumber_BigDecimal_bkec2_3() {
        Class type = BigDecimal.class;
        double value = 10.0;
        Number result = basicTypeConverter.allocateNumber(type, value);
        assertEquals(10.0, result.doubleValue(), 0.0);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAllocateNumber_BigInteger_rIHx3_1() {
        Class type = BigInteger.class;
        double value = 10.0;
        Number result = basicTypeConverter.allocateNumber(type, value);
        assertNotNull(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAllocateNumber_BigInteger_rIHx3_2() {
        Class type = BigInteger.class;
        double value = 10.0;
        Number result = basicTypeConverter.allocateNumber(type, value);
        assertTrue(result instanceof BigInteger);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAllocateNumber_BigInteger_rIHx3_3() {
        Class type = BigInteger.class;
        double value = 10.0;
        Number result = basicTypeConverter.allocateNumber(type, value);
        assertEquals(10, result.longValue());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAllocateNumber_Byte_agzu4_1() {
        Class type = Byte.class;
        double value = 10.0;
        Number result = basicTypeConverter.allocateNumber(type, value);
        assertNotNull(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAllocateNumber_Byte_agzu4_2() {
        Class type = Byte.class;
        double value = 10.0;
        Number result = basicTypeConverter.allocateNumber(type, value);
        assertTrue(result instanceof Byte);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAllocateNumber_Byte_agzu4_3() {
        Class type = Byte.class;
        double value = 10.0;
        Number result = basicTypeConverter.allocateNumber(type, value);
        assertEquals(10, result.byteValue());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAllocateNumber_Double_mYZp5_1() {
        Class type = Double.class;
        double value = 10.0;
        Number result = basicTypeConverter.allocateNumber(type, value);
        assertNotNull(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAllocateNumber_Double_mYZp5_2() {
        Class type = Double.class;
        double value = 10.0;
        Number result = basicTypeConverter.allocateNumber(type, value);
        assertTrue(result instanceof Double);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAllocateNumber_Double_mYZp5_3() {
        Class type = Double.class;
        double value = 10.0;
        Number result = basicTypeConverter.allocateNumber(type, value);
        assertEquals(10.0, result.doubleValue(), 0.0);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAllocateNumber_Float_hXvL6_1() {
        Class type = Float.class;
        double value = 10.0;
        Number result = basicTypeConverter.allocateNumber(type, value);
        assertNotNull(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAllocateNumber_Float_hXvL6_2() {
        Class type = Float.class;
        double value = 10.0;
        Number result = basicTypeConverter.allocateNumber(type, value);
        assertTrue(result instanceof Float);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAllocateNumber_Float_hXvL6_3() {
        Class type = Float.class;
        double value = 10.0;
        Number result = basicTypeConverter.allocateNumber(type, value);
        assertEquals(10.0, result.floatValue(), 0.0);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAllocateNumber_Integer_VsrX7_1() {
        Class type = Integer.class;
        double value = 10.0;
        Number result = basicTypeConverter.allocateNumber(type, value);
        assertNotNull(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAllocateNumber_Integer_VsrX7_2() {
        Class type = Integer.class;
        double value = 10.0;
        Number result = basicTypeConverter.allocateNumber(type, value);
        assertTrue(result instanceof Integer);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAllocateNumber_Integer_VsrX7_3() {
        Class type = Integer.class;
        double value = 10.0;
        Number result = basicTypeConverter.allocateNumber(type, value);
        assertEquals(10, result.intValue());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAllocateNumber_Long_nLxL8_1() {
        Class type = Long.class;
        double value = 10.0;
        Number result = basicTypeConverter.allocateNumber(type, value);
        assertNotNull(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAllocateNumber_Long_nLxL8_2() {
        Class type = Long.class;
        double value = 10.0;
        Number result = basicTypeConverter.allocateNumber(type, value);
        assertTrue(result instanceof Long);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAllocateNumber_Long_nLxL8_3() {
        Class type = Long.class;
        double value = 10.0;
        Number result = basicTypeConverter.allocateNumber(type, value);
        assertEquals(10, result.longValue());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCanConvertWithCollectionAndUseTypeIsNotArray_pKco1_nAQl0() {
        Object object = new Object();
        Class toType = String.class;
        assertFalse(converter.canConvert(object, toType));
    }

    @Test
    public void testConvertStringToPrimitive_yIEN0_9() {
        assertNull(converter.convertStringToPrimitive("null", null));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAllocateCollectionForOtherTypes_lFlo2() {
        BasicTypeConverter converter = new BasicTypeConverter();
        Collection collection = converter.allocateCollection(String.class);
        assertNotNull(collection);
        assertEquals(ArrayList.class, collection.getClass());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAllocateNumber_BigDecimal_bkec2() {
        Class type = BigDecimal.class;
        double value = 10.0;
        Number result = basicTypeConverter.allocateNumber(type, value);
        assertNotNull(result);
        assertTrue(result instanceof BigDecimal);
        assertEquals(10.0, result.doubleValue(), 0.0);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAllocateNumber_BigInteger_rIHx3() {
        Class type = BigInteger.class;
        double value = 10.0;
        Number result = basicTypeConverter.allocateNumber(type, value);
        assertNotNull(result);
        assertTrue(result instanceof BigInteger);
        assertEquals(10, result.longValue());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAllocateNumber_Byte_agzu4() {
        Class type = Byte.class;
        double value = 10.0;
        Number result = basicTypeConverter.allocateNumber(type, value);
        assertNotNull(result);
        assertTrue(result instanceof Byte);
        assertEquals(10, result.byteValue());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAllocateNumber_Double_mYZp5() {
        Class type = Double.class;
        double value = 10.0;
        Number result = basicTypeConverter.allocateNumber(type, value);
        assertNotNull(result);
        assertTrue(result instanceof Double);
        assertEquals(10.0, result.doubleValue(), 0.0);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAllocateNumber_Float_hXvL6() {
        Class type = Float.class;
        double value = 10.0;
        Number result = basicTypeConverter.allocateNumber(type, value);
        assertNotNull(result);
        assertTrue(result instanceof Float);
        assertEquals(10.0, result.floatValue(), 0.0);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAllocateNumber_Integer_VsrX7() {
        Class type = Integer.class;
        double value = 10.0;
        Number result = basicTypeConverter.allocateNumber(type, value);
        assertNotNull(result);
        assertTrue(result instanceof Integer);
        assertEquals(10, result.intValue());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAllocateNumber_Long_nLxL8() {
        Class type = Long.class;
        double value = 10.0;
        Number result = basicTypeConverter.allocateNumber(type, value);
        assertNotNull(result);
        assertTrue(result instanceof Long);
        assertEquals(10, result.longValue());
    }
}