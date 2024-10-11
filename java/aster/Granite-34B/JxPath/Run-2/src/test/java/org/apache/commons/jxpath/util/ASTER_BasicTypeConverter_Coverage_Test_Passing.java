/**
 * Generated by Aster
 */
package org.apache.commons.jxpath.util;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.*;
import java.util.concurrent.TimeUnit;
import org.apache.commons.jxpath.JXPathInvalidAccessException;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_BasicTypeConverter_Coverage_Test_Passing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCanCreateCollectionWhenTypeIsInterface_elsZ0() {
        BasicTypeConverter basicTypeConverter = new BasicTypeConverter();
        boolean actual = basicTypeConverter.canCreateCollection(List.class);
        boolean expected = true;
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCanCreateCollectionWhenTypeIsAbstract_xcbn1() {
        BasicTypeConverter basicTypeConverter = new BasicTypeConverter();
        boolean actual = basicTypeConverter.canCreateCollection(AbstractList.class);
        boolean expected = false;
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCanCreateCollectionWhenTypeHasNoDefaultConstructor_UfIy2() {
        BasicTypeConverter basicTypeConverter = new BasicTypeConverter();
        boolean actual = basicTypeConverter.canCreateCollection(ArrayList.class);
        boolean expected = true;
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testConvertWhenObjectIsNull_Qhnd0() {
        BasicTypeConverter basicTypeConverter = new BasicTypeConverter();
        Object object = null;
        Class toType = int.class;
        Object result = basicTypeConverter.convert(object, toType);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testConvertWhenObjectIsArray_kdQw2() {
        BasicTypeConverter basicTypeConverter = new BasicTypeConverter();
        Object object = new Object[0];
        Class toType = Object.class;
        Object result = basicTypeConverter.convert(object, toType);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void allocateCollection_validType_returnsCollection_KOLU0() {
        BasicTypeConverter converter = new BasicTypeConverter();
        Class type = ArrayList.class;
        try {
            Collection collection = converter.allocateCollection(type);
            assertTrue(collection instanceof ArrayList);
        } catch (JXPathInvalidAccessException e) {
            fail("Unexpected exception: " + e.getMessage());
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void allocateCollection_invalidType_throwsJXPathInvalidAccessException_zoUw1() {
        BasicTypeConverter converter = new BasicTypeConverter();
        Class type = String.class;
        try {
            converter.allocateCollection(type);
            fail("Expected JXPathInvalidAccessException");
        } catch (JXPathInvalidAccessException e) {
            assertTrue(e.getMessage().contains("Cannot create collection of type: " + type));
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testUnmodifiableCollectionForList_eKdK0() {
        BasicTypeConverter basicTypeConverter = new BasicTypeConverter();
        List<String> list = Arrays.asList("a", "b", "c");
        Collection<String> unmodifiableCollection = basicTypeConverter.unmodifiableCollection(list);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testUnmodifiableCollectionForSortedSet_nmiW2() {
        BasicTypeConverter basicTypeConverter = new BasicTypeConverter();
        SortedSet<String> sortedSet = new TreeSet<>(Arrays.asList("a", "b", "c"));
        Collection<String> unmodifiableCollection = basicTypeConverter.unmodifiableCollection(sortedSet);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testUnmodifiableCollectionForCollection_YFQk3() {
        BasicTypeConverter basicTypeConverter = new BasicTypeConverter();
        Collection<String> collection = Arrays.asList("a", "b", "c");
        Collection<String> unmodifiableCollection = basicTypeConverter.unmodifiableCollection(collection);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAllocateNumberByte_HaFG0() {
        BasicTypeConverter basicTypeConverter = new BasicTypeConverter();
        Number number = basicTypeConverter.allocateNumber(Byte.class, 10.0);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAllocateNumberShort_mXsd1() {
        BasicTypeConverter basicTypeConverter = new BasicTypeConverter();
        Number number = basicTypeConverter.allocateNumber(Short.class, 10.0);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAllocateNumberInteger_vJkD2() {
        BasicTypeConverter basicTypeConverter = new BasicTypeConverter();
        Number number = basicTypeConverter.allocateNumber(Integer.class, 10.0);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAllocateNumberLong_hsrM3() {
        BasicTypeConverter basicTypeConverter = new BasicTypeConverter();
        Number number = basicTypeConverter.allocateNumber(Long.class, 10.0);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAllocateNumberFloat_ZbYb4() {
        BasicTypeConverter basicTypeConverter = new BasicTypeConverter();
        Number number = basicTypeConverter.allocateNumber(Float.class, 10.0);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAllocateNumberDouble_qrtN5() {
        BasicTypeConverter basicTypeConverter = new BasicTypeConverter();
        Number number = basicTypeConverter.allocateNumber(Double.class, 10.0);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAllocateNumberBigInteger_BNrb6() {
        BasicTypeConverter basicTypeConverter = new BasicTypeConverter();
        Number number = basicTypeConverter.allocateNumber(BigInteger.class, 10.0);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAllocateNumberBigDecimal_idjV7() {
        BasicTypeConverter basicTypeConverter = new BasicTypeConverter();
        Number number = basicTypeConverter.allocateNumber(BigDecimal.class, 10.0);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCanCreateCollection_XMGz0() {
        BasicTypeConverter basicTypeConverter = new BasicTypeConverter();
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testUnmodifiableCollectionForSet_ZEBf1_JvpA0() {
        BasicTypeConverter basicTypeConverter = new BasicTypeConverter();
        Set<String> set = new HashSet<>(Arrays.asList("a", "b", "c"));
        Collection<String> unmodifiableCollection = basicTypeConverter.unmodifiableCollection(set);
        assertEquals(3, unmodifiableCollection.size());
    }
}