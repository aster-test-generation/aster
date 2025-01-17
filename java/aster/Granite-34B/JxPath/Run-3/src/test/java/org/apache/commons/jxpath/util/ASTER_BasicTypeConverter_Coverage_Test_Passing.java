/**
 * Generated by Aster
 */
package org.apache.commons.jxpath.util;

import java.util.*;
import java.util.concurrent.TimeUnit;
import org.apache.commons.jxpath.JXPathInvalidAccessException;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_BasicTypeConverter_Coverage_Test_Passing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCanCreateCollection2_YxWX1() {
        BasicTypeConverter basicTypeConverter = new BasicTypeConverter();
        Class type = Object.class;
        boolean expected = true;
        boolean actual = basicTypeConverter.canCreateCollection(type);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCanCreateCollection3_CEkZ2() {
        BasicTypeConverter basicTypeConverter = new BasicTypeConverter();
        Class type = String.class;
        boolean expected = false;
        boolean actual = basicTypeConverter.canCreateCollection(type);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCanCreateCollection4_zRSt3() {
        BasicTypeConverter basicTypeConverter = new BasicTypeConverter();
        Class type = List.class;
        boolean expected = true;
        boolean actual = basicTypeConverter.canCreateCollection(type);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCanCreateCollection5_PlRJ4() {
        BasicTypeConverter basicTypeConverter = new BasicTypeConverter();
        Class type = Set.class;
        boolean expected = true;
        boolean actual = basicTypeConverter.canCreateCollection(type);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testConvertArray_ksVz3() {
        BasicTypeConverter typeConverter = new BasicTypeConverter();
        Object[] array = new Object[10];
        Object converted = typeConverter.convert(array, Object.class);
        assertEquals(converted, array);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testConvertCollection_syav4() {
        BasicTypeConverter typeConverter = new BasicTypeConverter();
        List<Object> list = new ArrayList<>();
        Object converted = typeConverter.convert(list, Object.class);
        assertEquals(converted, list);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testConvertNumber_uDlo6() {
        BasicTypeConverter typeConverter = new BasicTypeConverter();
        Integer num = 10;
        Object converted = typeConverter.convert(num, Long.class);
        assertEquals(converted, new Long(10));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testConvertStringToPrimitive_gIhE7() {
        BasicTypeConverter typeConverter = new BasicTypeConverter();
        String str = "10";
        Object converted = typeConverter.convert(str, Integer.TYPE);
        assertEquals(converted, new Integer(10));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testConvertWithConverter_zdzZ8() {
        BasicTypeConverter typeConverter = new BasicTypeConverter();
        Object obj = new Object();
        Object converted = typeConverter.convert(obj, String.class);
        assertEquals(converted, obj.toString());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void allocateCollection_WhenTypeIsAbstractClass_ThenThrowJXPathInvalidAccessException_ekUn1() {
        Class type = Object.class;
        BasicTypeConverter systemUT = new BasicTypeConverter();
        assertThrows(JXPathInvalidAccessException.class, () -> systemUT.allocateCollection(type));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void allocateCollection_WhenTypeIsListOrCollectionClass_ThenReturnArrayList_mohp2() {
        Class type = List.class;
        BasicTypeConverter systemUT = new BasicTypeConverter();
        Collection result = systemUT.allocateCollection(type);
        assertEquals(ArrayList.class, result.getClass());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void allocateCollection_WhenTypeIsSetClass_ThenReturnHashSet_TTmk3() {
        Class type = Set.class;
        BasicTypeConverter systemUT = new BasicTypeConverter();
        Collection result = systemUT.allocateCollection(type);
        assertEquals(HashSet.class, result.getClass());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void allocateCollection_WhenTypeHasDefaultConstructor_ThenReturnNewInstance_zVrl4() {
        Class type = ArrayList.class;
        BasicTypeConverter systemUT = new BasicTypeConverter();
        Collection result = systemUT.allocateCollection(type);
        assertEquals(ArrayList.class, result.getClass());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCanConvertForCollection_pjqS0() {
        BasicTypeConverter basicTypeConverter = new BasicTypeConverter();
        boolean actual = basicTypeConverter.canConvert(new Object(), Collection.class);
        Assertions.assertFalse(actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCanConvertForArrayLength_jPHv1() {
        BasicTypeConverter basicTypeConverter = new BasicTypeConverter();
        boolean actual = basicTypeConverter.canConvert(new Object(), Object.class);
        Assertions.assertTrue(actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCanConvertForString_XTqs3() {
        BasicTypeConverter basicTypeConverter = new BasicTypeConverter();
        boolean actual = basicTypeConverter.canConvert(new Object(), String.class);
        Assertions.assertTrue(actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void test6_aLMZ5() {
        BasicTypeConverter basicTypeConverter = new BasicTypeConverter();
        Class type = java.util.concurrent.atomic.AtomicLong.class;
        double value = 1.0;
        Object expected = java.lang.Long.valueOf(1);
        Object actual = basicTypeConverter.allocateNumber(type, value);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testBoolean_UCGu0_MMgs0() {
        BasicTypeConverter b = new BasicTypeConverter();
        Object o = "true";
        Object result = b.convertStringToPrimitive(o, Boolean.class);
        org.junit.jupiter.api.Assertions.assertEquals(result, Boolean.TRUE);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCharacter_EIrl1_IkbG0() {
        BasicTypeConverter b = new BasicTypeConverter();
        Object o = "a";
        Object result = b.convertStringToPrimitive(o, Character.class);
        org.junit.jupiter.api.Assertions.assertEquals(new Character('a'), result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testByte_ikKJ2_VfTO0() {
        BasicTypeConverter b = new BasicTypeConverter();
        Object o = "1";
        Object result = b.convertStringToPrimitive(o, Byte.class);
        org.junit.jupiter.api.Assertions.assertEquals(new Byte("1"), result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testShort_tkpD3_TjrE0() {
        BasicTypeConverter b = new BasicTypeConverter();
        Object o = "1";
        Object result = b.convertStringToPrimitive(o, Short.class);
        org.junit.jupiter.api.Assertions.assertEquals((short) 1, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testInteger_Bval4_ASak0() {
        BasicTypeConverter b = new BasicTypeConverter();
        Object o = "1";
        Object result = b.convertStringToPrimitive(o, Integer.class);
        org.junit.jupiter.api.Assertions.assertEquals(result, new Integer(1));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testLong_TRJa5_LzuB0() {
        BasicTypeConverter b = new BasicTypeConverter();
        Object o = "1";
        Object result = b.convertStringToPrimitive(o, Long.class);
        org.junit.jupiter.api.Assertions.assertEquals(result, new Long("1"));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testFloat_KjVV6_rAAY0() {
        BasicTypeConverter b = new BasicTypeConverter();
        Object o = "1.0";
        Object result = b.convertStringToPrimitive(o, Float.class);
        org.junit.jupiter.api.Assertions.assertEquals(result, new Float("1.0"));
    }
}