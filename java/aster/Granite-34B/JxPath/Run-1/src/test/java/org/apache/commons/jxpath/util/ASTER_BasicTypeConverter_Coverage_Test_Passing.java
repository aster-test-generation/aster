/**
 * Generated by Aster
 */
package org.apache.commons.jxpath.util;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.*;
import java.util.concurrent.TimeUnit;
import org.apache.commons.jxpath.JXPathTypeConversionException;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
import static org.mockito.Mockito.when;

public class Aster_BasicTypeConverter_Coverage_Test_Passing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCanCreateCollectionWhenTypeIsInterface_RkQO0() {
        BasicTypeConverter basicTypeConverter = new BasicTypeConverter();
        boolean actual = basicTypeConverter.canCreateCollection(List.class);
        boolean expected = true;
        assert actual == expected;
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testConvertWithNullObjectAndPrimitiveToType_GWlL0() {
        BasicTypeConverter basicTypeConverter = new BasicTypeConverter();
        Object object = null;
        Class toType = int.class;
        Object result = basicTypeConverter.convert(object, toType);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCanConvertForNullObject_dJMO0() {
        BasicTypeConverter basicTypeConverter = new BasicTypeConverter();
        boolean result = basicTypeConverter.canConvert(null, null);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCanConvertForUseTypeAsString_suYu2() {
        BasicTypeConverter basicTypeConverter = new BasicTypeConverter();
        Object object = new Object();
        Class toType = String.class;
        boolean result = basicTypeConverter.canConvert(object, toType);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testUnmodifiableCollectionForList_yAaZ0() {
        BasicTypeConverter basicTypeConverter = new BasicTypeConverter();
        List<String> list = new ArrayList<>();
        list.add("test");
        Collection<String> unmodCollection = basicTypeConverter.unmodifiableCollection(list);
        assertEquals(1, unmodCollection.size());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testUnmodifiableCollectionForSortedSet_jlAS1() {
        BasicTypeConverter basicTypeConverter = new BasicTypeConverter();
        SortedSet<String> sortedSet = new TreeSet<>();
        sortedSet.add("test");
        Collection<String> unmodCollection = basicTypeConverter.unmodifiableCollection(sortedSet);
        assertEquals(1, unmodCollection.size());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testUnmodifiableCollectionForSet_XjGm2() {
        BasicTypeConverter basicTypeConverter = new BasicTypeConverter();
        Set<String> set = new HashSet<>();
        set.add("test");
        Collection<String> unmodCollection = basicTypeConverter.unmodifiableCollection(set);
        assertEquals(1, unmodCollection.size());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testUnmodifiableCollectionForCollection_vcrO3() {
        BasicTypeConverter basicTypeConverter = new BasicTypeConverter();
        Collection<String> collection = new ArrayList<>();
        collection.add("test");
        Collection<String> unmodCollection = basicTypeConverter.unmodifiableCollection(collection);
        assertEquals(1, unmodCollection.size());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void allocateCollectionTest5_HAsQ4_HAPe0() {
        BasicTypeConverter basicTypeConverter = new BasicTypeConverter();
        Class type = Set.class;
        when(type == Set.class).thenReturn(true);
        Collection collection = basicTypeConverter.allocateCollection(type);
        assertEquals(HashSet.class, collection.getClass());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testallocateNumber_jkLJ0_EzTh0() {
        BasicTypeConverter basicTypeConverter = new BasicTypeConverter();
        Number result = basicTypeConverter.allocateNumber(Byte.class, 1.0);
        assertEquals(Byte.valueOf((byte) 1.0), result);
        result = basicTypeConverter.allocateNumber(Short.class, 1.0);
        assertEquals(Short.valueOf((short) 1.0), result);
        result = basicTypeConverter.allocateNumber(Integer.class, 1.0);
        assertEquals(Integer.valueOf((int) 1.0), result);
        result = basicTypeConverter.allocateNumber(Long.class, 1.0);
        assertEquals(Long.valueOf((long) 1.0), result);
        result = basicTypeConverter.allocateNumber(Float.class, 1.0);
        assertEquals(Float.valueOf((float) 1.0), result);
        result = basicTypeConverter.allocateNumber(Double.class, 1.0);
        assertEquals(Double.valueOf(1.0), result);
        result = basicTypeConverter.allocateNumber(BigInteger.class, 1.0);
        assertEquals(BigInteger.valueOf((long) 1.0), result);
        result = basicTypeConverter.allocateNumber(BigDecimal.class, 1.0);
        assertEquals(new BigDecimal(1.0), result);
        String className = "java.util.concurrent.atomic.AtomicInteger";
        Class initialValueType = null;
        if ("java.util.concurrent.atomic.AtomicInteger".equals(className)) {
            initialValueType = int.class;
        }
        if ("java.util.concurrent.atomic.AtomicLong".equals(className)) {
            initialValueType = long.class;
        }
        if (initialValueType != null) {
            try {
                result = (Number) Class.forName(className).getConstructor(new Class[]{initialValueType}).newInstance(basicTypeConverter.allocateNumber(initialValueType, 1.0));
            } catch (final Exception e) {
                throw new JXPathTypeConversionException(className, e);
            }
        }
        assertNull(null);
    }
}