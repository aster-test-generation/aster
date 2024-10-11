/**
 * Generated by Aster
 */
package org.apache.commons.jxpath.util;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.apache.commons.jxpath.JXPathException;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_ValueUtils_Test_Passing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void getValueTest1_WYAU0() {
        Object collection = new Object();
        int index = 0;
        Object expected = collection;
        Object actual = ValueUtils.getValue(collection, index);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsCollectionWithNull_GzuU0() {
        Object value = null;
        boolean result = ValueUtils.isCollection(value);
        assertFalse(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsCollectionWithArray_pxNy1() {
        Object value = new Object[0];
        boolean result = ValueUtils.isCollection(value);
        assertTrue(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testArray_srNN0() {
        assertEquals(1, ValueUtils.getCollectionHint(int[].class));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCollection_YIwV1() {
        assertEquals(1, ValueUtils.getCollectionHint(List.class));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testPrimitive_Ugha2() {
        assertEquals(-1, ValueUtils.getCollectionHint(int.class));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testInterface_koBw3() {
        assertEquals(0, ValueUtils.getCollectionHint(Runnable.class));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testFinalClass_jOsw4() {
        assertEquals(-1, ValueUtils.getCollectionHint(String.class));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testOtherClass_PTHs5() {
        assertEquals(0, ValueUtils.getCollectionHint(Object.class));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetValue_array_cAry0() {
        Object[] array = new Object[5];
        Object value = new Object();
        ValueUtils.setValue(array, 2, value);
        assertSame(value, array[2]);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetValue_negativeIndex_hTzk4() {
        Object[] array = new Object[5];
        Object value = new Object();
        try {
            ValueUtils.setValue(array, -1, value);
            fail("IndexOutOfBoundsException expected");
        } catch (IndexOutOfBoundsException e) {
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetValue_indexTooLarge_pPZl5() {
        Object[] array = new Object[5];
        Object value = new Object();
        try {
            ValueUtils.setValue(array, 5, value);
            fail("IndexOutOfBoundsException expected");
        } catch (IndexOutOfBoundsException e) {
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetValue_nullValue_kUCw6() {
        Object[] array = new Object[5];
        ValueUtils.setValue(array, 2, null);
        assertNull(array[2]);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void test1_KFka0() {
        Method method = null;
        Method result = ValueUtils.getAccessibleMethod(method);
        Assertions.assertNull(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void test_getLength_null_EkDd0() {
        assertEquals(0, ValueUtils.getLength(null));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void test_getLength_array_Jeae1() {
        int[] array = {1, 2, 3};
        assertEquals(3, ValueUtils.getLength(array));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void test_getLength_collection_aLxU2() {
        List<String> list = Arrays.asList("a", "b", "c");
        assertEquals(3, ValueUtils.getLength(list));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testExpandCollectionWithNullCollection_SNLU0() {
        Object collection = null;
        int size = 10;
        Object result = ValueUtils.expandCollection(collection, size);
        assertEquals(null, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testExpandCollectionWithArray_LYtW2() {
        Object collection = new Object[5];
        int size = 10;
        Object result = ValueUtils.expandCollection(collection, size);
        assertEquals(Object[].class, result.getClass());
        assertEquals(10, ((Object[]) result).length);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testExpandCollectionWithCollection_VLOS3() {
        List<Object> collection = new ArrayList<>();
        collection.add(1);
        collection.add(2);
        collection.add(3);
        int size = 10;
        Object result = ValueUtils.expandCollection(collection, size);
        assertEquals(ArrayList.class, result.getClass());
        assertEquals(10, ((List<Object>) result).size());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void getValueTest2_YfLe1_fid1() {
        Object collection = new Object();
        int index = 0;
        Object expected = null;
        Object actual = ValueUtils.getValue(collection, index);
        assertNull(expected);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void getValueTest3_VPRB2_fid1() {
        Object collection = new Object();
        int index = 1;
        Object expected = null;
        Object actual = ValueUtils.getValue(collection, index);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void getValueTest5_hnaW4() {
        Object collection = new Object();
        int index = 0;
        Object expected = null;
        Object actual = ValueUtils.getValue(collection, index);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testRemove2_uSvg1_fid1() {
        Object collection = new Object();
        int index = 0;
        try {
            ValueUtils.remove(collection, index);
            Assertions.fail("Expected JXPathException");
        } catch (JXPathException e) {
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testExpandCollectionWithArray_LYtW2_1() {
        Object collection = new Object[5];
        int size = 10;
        Object result = ValueUtils.expandCollection(collection, size);
        assertEquals(Object[].class, result.getClass());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testExpandCollectionWithArray_LYtW2_2() {
        Object collection = new Object[5];
        int size = 10;
        Object result = ValueUtils.expandCollection(collection, size);
        assertEquals(10, ((Object[]) result).length);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testExpandCollectionWithCollection_VLOS3_1() {
        List<Object> collection = new ArrayList<>();
        collection.add(1);
        collection.add(2);
        collection.add(3);
        int size = 10;
        Object result = ValueUtils.expandCollection(collection, size);
        assertEquals(ArrayList.class, result.getClass());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testExpandCollectionWithCollection_VLOS3_2() {
        List<Object> collection = new ArrayList<>();
        collection.add(1);
        collection.add(2);
        collection.add(3);
        int size = 10;
        Object result = ValueUtils.expandCollection(collection, size);
        assertEquals(10, ((List<Object>) result).size());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void test2_HuGA1_wCdT0() throws NoSuchMethodException {
        Method method = ValueUtils.class.getMethod("expandCollection", Object.class, int.class);
        Method result = ValueUtils.getAccessibleMethod(method);
        Assertions.assertEquals(method, result);
    }
}