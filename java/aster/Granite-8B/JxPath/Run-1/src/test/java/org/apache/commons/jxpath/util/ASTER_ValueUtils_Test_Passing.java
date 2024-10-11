/**
 * Generated by Aster
 */
package org.apache.commons.jxpath.util;

import java.lang.reflect.Array;
import java.lang.reflect.Method;
import java.util.*;
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
    public void testGetValueArray_DXAg0() {
        Object array = new Integer[]{1, 2, 3};
        assertEquals(2, ValueUtils.getValue(array, 1));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetValueArrayOutOfBounds_KnoM1() {
        Object array = new Integer[]{1, 2, 3};
        assertNull(ValueUtils.getValue(array, 3));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetValueList_qkJK2() {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        assertEquals(2, ValueUtils.getValue(list, 1));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetValueListOutOfBounds_dpiL3() {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        assertNull(ValueUtils.getValue(list, 2));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetValueNullCollection_ygza6() {
        assertNull(ValueUtils.getValue(null, 0));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsCollection_Array_WoMj0() {
        boolean result = ValueUtils.isCollection(new Object[]{});
        assert result;
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsCollection_Null_rmdT1() {
        boolean result = ValueUtils.isCollection(null);
        assert !result;
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsCollection_NotCollection_mKpM2() {
        boolean result = ValueUtils.isCollection("String");
        assert !result;
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testRemoveArray_beST0() {
        Object array = new int[]{1, 2, 3, 4, 5};
        Object result = ValueUtils.remove(array, 2);
        assertArrayEquals(new int[]{1, 2, 4, 5}, (int[]) result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testRemoveArrayIndexOutOfBoundsException_zbtl1() {
        Object array = new int[]{1, 2, 3, 4, 5};
        try {
            ValueUtils.remove(array, 5);
            fail("Expected JXPathException");
        } catch (JXPathException e) {
            assertEquals("No such element at index 5", e.getMessage());
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testRemoveList_fXcr2() {
        List list = new ArrayList();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        ValueUtils.remove(list, 2);
        assertEquals(4, list.size());
        assertEquals(1, list.get(0));
        assertEquals(2, list.get(1));
        assertEquals(4, list.get(2));
        assertEquals(5, list.get(3));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testRemoveListIndexOutOfBoundsException_Rjdl3() {
        List list = new ArrayList();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        try {
            ValueUtils.remove(list, 5);
            fail("Expected JXPathException");
        } catch (JXPathException e) {
            assertEquals("No such element at index 5", e.getMessage());
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testRemoveCollection_RaHK4() {
        Collection collection = new ArrayList();
        collection.add(1);
        collection.add(2);
        collection.add(3);
        collection.add(4);
        collection.add(5);
        ValueUtils.remove(collection, 2);
        assertEquals(4, collection.size());
        assertEquals(1, ((Integer) collection.iterator().next()));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testRemoveCollectionIndexOutOfBoundsException_zoTr5() {
        Collection collection = new ArrayList();
        collection.add(1);
        collection.add(2);
        collection.add(3);
        collection.add(4);
        collection.add(5);
        try {
            ValueUtils.remove(collection, 5);
            fail("Expected JXPathException");
        } catch (JXPathException e) {
            assertEquals("No such element at index 5", e.getMessage());
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testRemoveNull_gtwP6() {
        Object result = ValueUtils.remove(null, 0);
        assertNull(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testRemoveNonArrayNonListNonCollection_wehH8() {
        try {
            ValueUtils.remove("Hello", 0);
            fail("Expected JXPathException");
        } catch (JXPathException e) {
            assertEquals("Cannot remove java.lang.String[0]", e.getMessage());
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testRemoveNonArrayNonListNonCollectionIndexOutOfBoundsException_tDoU9() {
        try {
            ValueUtils.remove("Hello", 5);
            fail("Expected JXPathException");
        } catch (JXPathException e) {
            assertEquals("No such element at index 5", e.getMessage());
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testRemoveArrayIndex0_kIyM10() {
        Object array = new int[]{1, 2, 3, 4, 5};
        Object result = ValueUtils.remove(array, 0);
        assertArrayEquals(new int[]{2, 3, 4, 5}, (int[]) result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testRemoveArrayIndexLast_horm11() {
        Object array = new int[]{1, 2, 3, 4, 5};
        Object result = ValueUtils.remove(array, 4);
        assertArrayEquals(new int[]{1, 2, 3, 4}, (int[]) result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testNullCollection_WUQS0() {
        Iterator iterator = ValueUtils.iterate(null);
        assert iterator == Collections.EMPTY_LIST.iterator();
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEmptyArrayCollection_RtHx2() {
        Object[] array = new Object[0];
        Iterator iterator = ValueUtils.iterate(array);
        assert iterator == Collections.EMPTY_LIST.iterator();
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testArray_GlDZ0() {
        assertEquals(1, ValueUtils.getCollectionHint(int[].class));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCollection_IuzC1() {
        assertEquals(1, ValueUtils.getCollectionHint(ArrayList.class));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testPrimitive_AkwJ2() {
        assertEquals(-1, ValueUtils.getCollectionHint(int.class));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetValueArray_LQag0() {
        Object[] array = new Object[]{1, 2, 3};
        ValueUtils.setValue(array, 1, "test");
        assertEquals("test", array[1]);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetValueList_MQaI1() {
        List<String> list = new ArrayList<>();
        list.add("1");
        list.add("2");
        ValueUtils.setValue(list, 1, "test");
        assertEquals("test", list.get(1));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetValueInvalidIndex_vSJC4() {
        Object[] array = new Object[]{1, 2, 3};
        try {
            ValueUtils.setValue(array, 3, "test");
            fail("Expected IndexOutOfBoundsException");
        } catch (IndexOutOfBoundsException e) {
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetAccessibleMethod_NullMethod_Eitz6() {
        Method result = ValueUtils.getAccessibleMethod(null);
        Assertions.assertNull(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetLengthNull_hTyo0() {
        int result = ValueUtils.getLength(null);
        assert result == 0;
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetLengthArray_cKcZ1() {
        int[] array = new int[5];
        int result = ValueUtils.getLength(array);
        assert result == 5;
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetLengthCollection_izAf2() {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        int result = ValueUtils.getLength(list);
        assert result == 3;
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetLengthSingleObject_WTqF3() {
        String str = "Hello";
        int result = ValueUtils.getLength(str);
        assert result == 1;
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testExpandCollectionArray_jcEV0() {
        Object collection = new Integer[3];
        int size = 5;
        Object result = ValueUtils.expandCollection(collection, size);
        assert result.getClass().isArray();
        assert Array.getLength(result) == size;
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testExpandCollectionCollection_otEh1() {
        Collection collection = new ArrayList();
        collection.add("a");
        collection.add("b");
        int size = 5;
        Object result = ValueUtils.expandCollection(collection, size);
        assert result instanceof Collection;
        assert ((Collection) result).size() == size;
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testExpandCollectionNull_xdqS2() {
        Object collection = null;
        int size = 5;
        Object result = ValueUtils.expandCollection(collection, size);
        assert result == null;
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testExpandCollectionSmallSize_uVIV3() {
        Object collection = new Integer[3];
        int size = 3;
        Object result = ValueUtils.expandCollection(collection, size);
        assert result.getClass().isArray();
        assert Array.getLength(result) == size;
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testExpandCollectionNotCollection_dWsO4() {
        Object collection = new String("a");
        int size = 5;
        try {
            ValueUtils.expandCollection(collection, size);
            assert false;
        } catch (JXPathException e) {
            assert true;
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testExpandCollectionTooSmallSize_KiNg5() {
        Object collection = new Integer[3];
        int size = 2;
        try {
            ValueUtils.expandCollection(collection, size);
            assert false;
        } catch (JXPathException e) {
            assert e.getMessage().equals("adjustment of " + collection + " to size " + size + " is not an expansion");
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testRemoveList_fXcr2_1() {
        List list = new ArrayList();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        ValueUtils.remove(list, 2);
        assertEquals(4, list.size());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testRemoveList_fXcr2_2() {
        List list = new ArrayList();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        ValueUtils.remove(list, 2);
        assertEquals(1, list.get(0));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testRemoveList_fXcr2_3() {
        List list = new ArrayList();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        ValueUtils.remove(list, 2);
        assertEquals(2, list.get(1));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testRemoveList_fXcr2_4() {
        List list = new ArrayList();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        ValueUtils.remove(list, 2);
        assertEquals(4, list.get(2));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testRemoveList_fXcr2_5() {
        List list = new ArrayList();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        ValueUtils.remove(list, 2);
        assertEquals(5, list.get(3));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testRemoveCollection_RaHK4_1() {
        Collection collection = new ArrayList();
        collection.add(1);
        collection.add(2);
        collection.add(3);
        collection.add(4);
        collection.add(5);
        ValueUtils.remove(collection, 2);
        assertEquals(4, collection.size());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testRemoveCollection_RaHK4_2() {
        Collection collection = new ArrayList();
        collection.add(1);
        collection.add(2);
        collection.add(3);
        collection.add(4);
        collection.add(5);
        ValueUtils.remove(collection, 2);
        assertEquals(1, ((Integer) collection.iterator().next()));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetValue_HhDt0_gYLk0() {
        List<Object> container = new ArrayList<>();
        Object object = container;
        assertEquals(object, ValueUtils.expandCollection(object, container.size()));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetAccessibleMethod_PublicMethod_sDal0_XMbb0() {
        try {
            Method method = new Object().getClass().getMethod("toString", null);
            Method result = ValueUtils.getAccessibleMethod(method);
            Assertions.assertEquals(method, result);
        } catch (NoSuchMethodException e) {
            throw new AssertionError(e);
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetAccessibleMethod_ProtectedMethod_kNTg2_TNnR1() {
        try {
            Method method = new Object().getClass().getDeclaredMethod("hashCode", null);
        } catch (NoSuchMethodException e) {
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetAccessibleMethod_MethodWithParameters_VvGo7_TyhM0() {
        try {
            Method method = new Object().getClass().getMethod("equals", new Class[]{Object.class});
            Method result = ValueUtils.getAccessibleMethod(method);
            Assertions.assertEquals(method, result);
        } catch (NoSuchMethodException e) {
            throw new AssertionError(e);
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testInterface_JfdD3_fid2() {
        assertEquals(1, ValueUtils.getCollectionHint(List.class));
    }
}