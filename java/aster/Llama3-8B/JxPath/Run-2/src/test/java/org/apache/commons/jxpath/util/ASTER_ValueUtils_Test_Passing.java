/**
 * Generated by Aster
 */
package org.apache.commons.jxpath.util;
import java.lang.reflect.Array;
import java.lang.reflect.Method;
import org.apache.commons.jxpath.JXPathException;
import static org.junit.jupiter.api.Assertions.*;
import java.util.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_ValueUtils_Test_Passing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetValueArray_hxzs0() {
        Object[] array = new Object[] {"a", "b", "c"};
        Object value = ValueUtils.getValue(array, 1);
        assert value.equals("b");
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetValueArrayOutOfBounds_WRCb1() {
        Object[] array = new Object[] {"a", "b", "c"};
        Object value = ValueUtils.getValue(array, 3);
        assert value == null;
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetValueList_WPbF2() {
        List<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("c");
        Object value = ValueUtils.getValue(list, 1);
        assert value.equals("b");
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetValueListOutOfBounds_qJfl3() {
        List<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("c");
        Object value = ValueUtils.getValue(list, 3);
        assert value == null;
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetValueNull_QJAH6() {
        Object value = ValueUtils.getValue(null, 0);
        assert value == null;
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetValueNullIndex_itsP7() {
        Object[] array = new Object[] {"a", "b", "c"};
        Object value = ValueUtils.getValue(array, -1);
        assert value == null;
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetValueEmptyArray_UvzE8() {
        Object[] array = new Object[0];
        Object value = ValueUtils.getValue(array, 0);
        assert value == null;
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetValueEmptyList_iCji9() {
        List<String> list = new ArrayList<>();
        Object value = ValueUtils.getValue(list, 0);
        assert value == null;
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsCollection_Array_BPMS0() {
        boolean result = ValueUtils.isCollection(new Object[1]);
        assert result;
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsCollection_List_onvw1() {
        boolean result = ValueUtils.isCollection(new ArrayList<>());
        assert result;
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsCollection_Null_XLrV2() {
        boolean result = ValueUtils.isCollection(null);
        assert !result;
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testRemoveFromArray_NlhC0() {
        Object array = new int[]{1, 2, 3, 4, 5};
        Object result = ValueUtils.remove(array, 2);
        assertArrayEquals(new int[]{1, 2, 4, 5}, (int[]) result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testRemoveFromArrayAtStart_snck1() {
        Object array = new int[]{1, 2, 3, 4, 5};
        Object result = ValueUtils.remove(array, 0);
        assertArrayEquals(new int[]{2, 3, 4, 5}, (int[]) result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testRemoveFromArrayAtEnd_tAcn2() {
        Object array = new int[]{1, 2, 3, 4, 5};
        Object result = ValueUtils.remove(array, 4);
        assertArrayEquals(new int[]{1, 2, 3, 4}, (int[]) result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testRemoveFromArrayAtMiddleAndEnd_TCzF5() {
        Object array = new int[]{1, 2, 3, 4, 5};
        Object result = ValueUtils.remove(array, 2);
        result = ValueUtils.remove(result, 3);
        assertArrayEquals(new int[]{1, 2, 4}, (int[]) result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testRemoveFromArrayAtEndAndStart_GVbJ11() {
        Object array = new int[]{1, 2, 3, 4, 5};
        Object result = ValueUtils.remove(array, 4);
        result = ValueUtils.remove(result, 0);
        assertArrayEquals(new int[]{2, 3, 4}, (int[]) result);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testNullCollection_Nsot0() {
        Iterator iterator = ValueUtils.iterate(null);
        assert iterator == Collections.EMPTY_LIST.iterator();
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEmptyArray_tapm1() {
        Object[] array = new Object[0];
        Iterator iterator = ValueUtils.iterate(array);
        assert iterator == Collections.EMPTY_LIST.iterator();
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testNonEmptyArray_aino2() {
        Object[] array = new Object[] { "a", "b", "c" };
        Iterator iterator = ValueUtils.iterate(array);
        List expected = new ArrayList(Arrays.asList(array));
        while (iterator.hasNext()) {
            assert iterator.next().equals(expected.remove(0));
        }
        assert !iterator.hasNext();
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEmptyCollection_xZPJ3() {
        Collection collection = Collections.emptyList();
        Iterator iterator = ValueUtils.iterate(collection);
        assert iterator == Collections.EMPTY_LIST.iterator();
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testNonEmptyCollection_jlYl4() {
        Collection collection = Arrays.asList("a", "b", "c");
        Iterator iterator = ValueUtils.iterate(collection);
        List expected = new ArrayList(collection);
        while (iterator.hasNext()) {
            assert iterator.next().equals(expected.remove(0));
        }
        assert !iterator.hasNext();
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSingleObject_Yzjz5() {
        Object object = "a";
        Iterator iterator = ValueUtils.iterate(object);
        List expected = new ArrayList(Collections.singletonList(object));
        assert iterator.hasNext();
        assert iterator.next().equals(expected.get(0));
        assert !iterator.hasNext();
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testArray_Xlan0() {
        assertEquals(1, ValueUtils.getCollectionHint(int[].class));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCollection_EbZs1() {
        assertEquals(1, ValueUtils.getCollectionHint(ArrayList.class));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testPrimitive_CuUB2() {
        assertEquals(-1, ValueUtils.getCollectionHint(int.class));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testNonFinalClass_MsxG4() {
        assertEquals(0, ValueUtils.getCollectionHint(ValueUtils.class));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSetValueArray_zQfi0() {
    Object array = new int[5];
   ValueUtils.setValue(array, 0, 10);
    assertEquals(10, Array.get(array, 0));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSetValueList_xWpV1() {
    List<Integer> list = new ArrayList<>();
    list.add(1);
   ValueUtils.setValue(list, 0, 10);
    assertEquals(10, list.get(0));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetAccessibleMethod_NullMethod_rvvm6() {
    Method result = ValueUtils.getAccessibleMethod(null);
    Assertions.assertNull(result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetLengthNull_Jmwm0() {
        int result = ValueUtils.getLength(null);
        assert result == 0;
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetLengthArray_kggR1() {
        int[] array = new int[5];
        int result = ValueUtils.getLength(array);
        assert result == 5;
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetLengthCollection_fwoE2() {
        List<Integer> collection = new ArrayList<>();
        collection.add(1);
        collection.add(2);
        collection.add(3);
        int result = ValueUtils.getLength(collection);
        assert result == 3;
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetLengthObject_OicT3() {
        int result = ValueUtils.getLength("Hello");
        assert result == 1;
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testExpandCollectionNullCollection_suvG0() {
        Object result = ValueUtils.expandCollection(null, 10);
        assertSame(null, result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testExpandCollectionCollection_paPx2() {
        Collection collection = new ArrayList();
        collection.add(1);
        collection.add(2);
        Object result = ValueUtils.expandCollection(collection, 5);
        assertSame(collection, result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testExpandCollectionNotCollection_iYWJ4() {
        Object object = new Object();
        assertThrows(JXPathException.class, () -> ValueUtils.expandCollection(object, 5));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetValue_UVYd0_Rnxy0_1() {
    List<Object> container = new ArrayList<>();
    Object object = container;
    Object result = ValueUtils.expandCollection(object, container.size());
    assertNotNull(result);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetValue_UVYd0_Rnxy0_2() {
    List<Object> container = new ArrayList<>();
    Object object = container;
    Object result = ValueUtils.expandCollection(object, container.size());
    assertEquals(container, result);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetAccessibleMethod_PublicMethod_WFQn0_DTAD0() {
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
public void testGetAccessibleMethod_ProtectedMethod_hPFk2_yqMf0() {
    try {
        Method method = new Object().getClass().getDeclaredMethod("hashCode", null);
    } catch (NoSuchMethodException e) {
    }
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetAccessibleMethod_MethodWithParameter_LUqA7_JXNk0() {
    try {
        Method method = new Object().getClass().getMethod("equals", new Class[]{Object.class});
        Method result = ValueUtils.getAccessibleMethod(method);
        Assertions.assertNotNull(result);
    } catch (NoSuchMethodException e) {
        throw new AssertionError("NoSuchMethodException occurred", e);
    }
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testRemoveFromArrayAtMiddleAndMiddle_RUdq7_fid2() {
        Object array = new int[]{1, 2, 3,5, 5};
        Object result = ValueUtils.remove(array, 2);
        result = ValueUtils.remove(result, 2);
        assertArrayEquals(new int[]{1, 2,5}, (int[]) result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testInterface_Kiuc3_fid2() {
        assertEquals(1, ValueUtils.getCollectionHint(List.class));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testNonCollectionNonArrayNonPrimitiveNonInterfaceNonFinalClass_zsqz5_fid2() {
        assertEquals(-1, ValueUtils.getCollectionHint(String.class));
    }
}