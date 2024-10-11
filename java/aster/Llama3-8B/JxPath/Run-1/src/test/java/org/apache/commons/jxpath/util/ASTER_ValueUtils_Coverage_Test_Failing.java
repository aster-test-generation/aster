/**
 * Generated by Aster
 */
package org.apache.commons.jxpath.util;

import java.beans.IndexedPropertyDescriptor;
import java.beans.PropertyDescriptor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.apache.commons.jxpath.DynamicPropertyHandler;
import org.apache.commons.jxpath.JXPathException;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_ValueUtils_Coverage_Test_Failing {
    private Object value;

    private Method getAccessibleMethod(Method method) {
        try {
            return method;
        } catch (Exception e) {
            return null;
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetValue_InstanceOfIndexedPropertyDescriptor_ReturnsValue_oNfx0() throws Exception {
        Object bean = new Object();
        PropertyDescriptor propertyDescriptor = new IndexedPropertyDescriptor("property", bean.getClass());
        int index = 0;
        Object result = ValueUtils.getValue(bean, propertyDescriptor, index);
        assertNotNull(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetValue_Array_AkPr0() {
        Object array = new int[]{1, 2, 3};
        ValueUtils.setValue(array, 1, "test");
        assertEquals("test", ((int[]) array)[1]);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testRemoveList_eJPk3_4() {
        List list = new ArrayList(Arrays.asList(1, 2, 4, 4, 5));
        ValueUtils.remove(list, 2);
        assertEquals(3, list.get(2));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testRemoveList_eJPk3_5() {
        List list = new ArrayList(Arrays.asList(1, 2, 3, 5, 5));
        ValueUtils.remove(list, 2);
        assertEquals(4, list.get(3));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testRemoveNullCollection_pBPA9() {
        Object collection = null;
        try {
            ValueUtils.remove(collection, 0);
            fail("Expected JXPathException");
        } catch (JXPathException e) {
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetValueWithNullPropertyDescriptor_mbzY3() {
        Object bean = new Object();
        Object value = ValueUtils.getValue(bean, null);
        assertNull(value);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetDynamicPropertyHandlerException_tRMF1() {
        try {
            Class clazz = Class.forName("YourClass");
            DynamicPropertyHandler dynamicPropertyHandler = ValueUtils.getDynamicPropertyHandler(clazz);
            fail("Expected exception");
        } catch (ClassNotFoundException e) {
            fail("Class not found");
        } catch (Exception e) {
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetValueWithNullPropertyDescriptor_wjyK2() {
        Object bean = new Object();
        PropertyDescriptor propertyDescriptor = null;
        Object value = "testValue";
        try {
            ValueUtils.setValue(bean, propertyDescriptor, value);
            fail("Expected JXPathException");
        } catch (JXPathException ex) {
            assertEquals("Cannot modify property: null.propertyName", ex.getMessage());
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetMethodWithNullMethod_tuPp8() {
        Method method = null;
        try {
            ValueUtils.getAccessibleMethod(method);
            fail("Expected NullPointerException");
        } catch (NullPointerException ex) {
            assertEquals("method", ex.getMessage());
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetValue_InstanceOfIndexedPropertyDescriptor_MethodInvoke_HsWs1_ZVtX0() throws Exception {
        Object bean = new Object();
        PropertyDescriptor propertyDescriptor = new IndexedPropertyDescriptor("property", bean.getClass());
        int index = 0;
        Method method = bean.getClass().getMethod("getMethod");
        ((IndexedPropertyDescriptor) propertyDescriptor).setIndexedReadMethod(method);
        Object result = ValueUtils.expandCollection(bean, index);
        assertNotNull(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetValue_InstanceOfIndexedPropertyDescriptor_MethodInvoke_ThrowsInvocationTargetException_JEwU2_QeKI0() throws Exception {
        Object bean = new Object();
        PropertyDescriptor propertyDescriptor = new IndexedPropertyDescriptor("property", bean.getClass());
        int index = 0;
        Method method = bean.getClass().getMethod("getMethod", int.class);
        ((IndexedPropertyDescriptor) propertyDescriptor).setIndexedReadMethod(method);
        InvocationTargetException ex = new InvocationTargetException(new IndexOutOfBoundsException());
        method.setAccessible(true);
        method.invoke(bean, Integer.valueOf(index));
        try {
            ValueUtils.getValue(bean, propertyDescriptor, index);
            fail("Expected JXPathException");
        } catch (JXPathException e) {
            assertEquals("Cannot access property: property", e.getMessage());
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetValue_InstanceOfIndexedPropertyDescriptor_MethodInvoke_ThrowsThrowable_NLGS3_OMmo0() throws Exception {
        Object bean = new Object();
        PropertyDescriptor propertyDescriptor = new IndexedPropertyDescriptor("property", bean.getClass());
        int index = 0;
        Method method = propertyDescriptor.getReadMethod();
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testRemoveArrayIndexLast_iPik2_qmsF0() {
        Object array = new Object[]{1, 2, 3, 4, 5};
        Object result = ValueUtils.expandCollection(array, 4);
        assertArrayEquals(new Object[]{1, 2, 3, 4}, ((Object[]) result));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testConvertValueWithDifferentType_awZI6_bfeb0() {
        Object value = "testValue";
        Class<?> propertyType = Integer.class;
        Object array = ValueUtils.expandCollection(value, 1);
        assertEquals(0, ((Integer) array).intValue());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsInterface_xanW0() {
        assertEquals(0, ValueUtils.getCollectionHint(Integer.class));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsFinalClass_QMZg1_fid2() {
        assertEquals(-1, ValueUtils.getCollectionHint(ValueUtils.class));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testRemoveList_eJPk3() {
        List list = new ArrayList(Arrays.asList(1, 2, 3, 4, 5));
        ValueUtils.remove(list, 2);
        assertEquals(4, list.size());
        assertEquals(1, list.get(0));
        assertEquals(2, list.get(1));
        assertEquals(3, list.get(2));
        assertEquals(4, list.get(3));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testRemoveList_eJPk3_4_fid3() {
        List list = new ArrayList(Arrays.asList(1, 2, 3, 4, 5));
        ValueUtils.remove(list, 2);
        assertEquals(3, list.get(2));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testRemoveList_eJPk3_5_fid3() {
        List list = new ArrayList(Arrays.asList(1, 2, 3, 4, 5));
        ValueUtils.remove(list, 2);
        assertEquals(4, list.get(3));
    }
}