/**
 * Generated by Aster
 */
package org.apache.commons.jxpath.util;

import java.beans.IndexedPropertyDescriptor;
import java.beans.PropertyDescriptor;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.apache.commons.jxpath.JXPathException;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_ValueUtils_Coverage_Test_Failing {
    private interface TestInterface {
    }
    private ValueUtils valueUtils;

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetValueWithNullPropertyDescriptor_DMas5() {
        Object bean = new Object();
        PropertyDescriptor propertyDescriptor = null;
        int index = 0;
        Object value = ValueUtils.getValue(bean, propertyDescriptor, index);
        assertNull(value);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetValueWithNullPropertyDescriptorAndNullBean_OrXB7() {
        Object bean = null;
        PropertyDescriptor propertyDescriptor = null;
        int index = 0;
        Object value = ValueUtils.getValue(bean, propertyDescriptor, index);
        assertNull(value);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetIndexedPropertyLength_NullPropertyDescriptor_VAWn7() {
        Object object = new Object();
        IndexedPropertyDescriptor pd = null;
        int result = ValueUtils.getIndexedPropertyLength(object, pd);
        assertEquals(0, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetIndexedPropertyLength_NullObjectAndNullPropertyDescriptor_SFrN10() {
        Object object = null;
        IndexedPropertyDescriptor pd = null;
        int result = ValueUtils.getIndexedPropertyLength(object, pd);
        assertEquals(0, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testRemove_Array_IndexEqualToLength_Umjl1_1() {
        Object[] array = new Object[]{1, 2, 3, 4, 5};
        Object result = ValueUtils.remove(array, 5);
        assertTrue(result instanceof Object[]);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testRemove_Array_IndexEqualToLength_Umjl1_2() {
        Object[] array = new Object[]{1, 2, 3, 4, 5};
        Object result = ValueUtils.remove(array, 5);
        assertEquals(4, ((Object[]) result).length);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testRemove_Array_IndexEqualToLength_Umjl1_3() {
        Object[] array = new Object[]{1, 2, 3, 4, 5};
        Object result = ValueUtils.remove(array, 5);
        assertEquals(1, ((Object[]) result)[0]);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testRemove_Array_IndexEqualToLength_Umjl1_4() {
        Object[] array = new Object[]{1, 2, 3, 4, 5};
        Object result = ValueUtils.remove(array, 5);
        assertEquals(2, ((Object[]) result)[1]);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testRemove_Array_IndexEqualToLength_Umjl1_5() {
        Object[] array = new Object[]{1, 2, 3, 4, 5};
        Object result = ValueUtils.remove(array, 5);
        assertEquals(3, ((Object[]) result)[2]);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testRemove_Array_IndexEqualToLength_Umjl1_6() {
        Object[] array = new Object[]{1, 2, 3, 4, 5};
        Object result = ValueUtils.remove(array, 5);
        assertEquals(4, ((Object[]) result)[3]);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testRemove_List_IndexEqualToSize_kxOz4_1() {
        List<Integer> list = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5));
        Object result = ValueUtils.remove(list, 5);
        assertTrue(result instanceof List);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testRemove_List_IndexEqualToSize_kxOz4_2() {
        List<Integer> list = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5));
        Object result = ValueUtils.remove(list, 5);
        assertEquals(4, ((List) result).size());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testRemove_List_IndexEqualToSize_kxOz4_3() {
        List<Integer> list = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5));
        Object result = ValueUtils.remove(list, 5);
        assertEquals(1, ((List) result).get(0));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testRemove_List_IndexEqualToSize_kxOz4_4() {
        List<Integer> list = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5));
        Object result = ValueUtils.remove(list, 5);
        assertEquals(2, ((List) result).get(1));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testRemove_List_IndexEqualToSize_kxOz4_5() {
        List<Integer> list = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5));
        Object result = ValueUtils.remove(list, 5);
        assertEquals(3, ((List) result).get(2));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testRemove_List_IndexEqualToSize_kxOz4_6() {
        List<Integer> list = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5));
        Object result = ValueUtils.remove(list, 5);
        assertEquals(4, ((List) result).get(3));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetValue_NullPropertyDescriptor_aSbc7() {
        Object bean = new Object();
        PropertyDescriptor propertyDescriptor = null;
        int index = 0;
        Object value = new Object();
        try {
            ValueUtils.setValue(bean, propertyDescriptor, index, value);
            fail("Exception should be thrown");
        } catch (IllegalArgumentException ex) {
            assertEquals("Cannot access property: " + propertyDescriptor.getName() + ", " + ex.getMessage(), ex.getMessage());
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetValueWithNullPropertyDescriptor_Ibua4() throws Exception {
        Object bean = new Object();
        PropertyDescriptor propertyDescriptor = null;
        Object value = ValueUtils.getValue(bean, propertyDescriptor);
        assertNull(value);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetValueWithNullBeanAndNullPropertyDescriptor_kuiI8() throws Exception {
        Object bean = null;
        PropertyDescriptor propertyDescriptor = null;
        Object value = ValueUtils.getValue(bean, propertyDescriptor);
        assertNull(value);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetValueWithNullBean_ueeM0() {
        try {
            valueUtils.setValue(null, null, null);
            fail("Expected JXPathException");
        } catch (JXPathException e) {
            assertEquals("Cannot modify property: null.null", e.getMessage());
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetValueWithNullPropertyDescriptor_VuJN1() {
        try {
            valueUtils.setValue(new Object(), null, null);
            fail("Expected JXPathException");
        } catch (JXPathException e) {
            assertEquals("Cannot modify property: java.lang.Object.null", e.getMessage());
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetValueWithReadMethod_klkX0_RDic0() throws Exception {
        Object bean = new Object();
        PropertyDescriptor propertyDescriptor = new PropertyDescriptor("property", bean.getClass());
        Method readMethod = bean.getClass().getMethod("getProperty");
        propertyDescriptor.setReadMethod(readMethod);
        Object value = ValueUtils.getValue(bean, propertyDescriptor);
        assertEquals(value, "expectedValue");
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetValueWithNoReadMethod_phRU1_fgIJ0() throws Exception {
        Object bean = new Object();
        PropertyDescriptor propertyDescriptor = new PropertyDescriptor("propertyName", bean.getClass());
        Object value = ValueUtils.getValue(bean, propertyDescriptor);
        assertNull(value);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetValueWithException_PlxQ2_zILQ0() throws Exception {
        Object bean = new Object();
        PropertyDescriptor propertyDescriptor = new PropertyDescriptor("property", bean.getClass());
        Method readMethod = bean.getClass().getMethod("getProperty");
        propertyDescriptor.setReadMethod(readMethod);
        Object value = ValueUtils.getValue(bean, propertyDescriptor);
        assertNotNull(value);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetValueWithNullBean_drGC3_SGOb0() throws Exception {
        Object bean = null;
        PropertyDescriptor propertyDescriptor = new PropertyDescriptor("", Object.class);
        Object value = ValueUtils.getValue(bean, propertyDescriptor);
        assertNull(value);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testRemove_Array_IndexEqualToLength_Umjl1() {
        Object[] array = new Object[]{1, 2, 3, 4, 5};
        Object result = ValueUtils.remove(array, 5);
        assertTrue(result instanceof Object[]);
        assertEquals(4, ((Object[]) result).length);
        assertEquals(1, ((Object[]) result)[0]);
        assertEquals(2, ((Object[]) result)[1]);
        assertEquals(3, ((Object[]) result)[2]);
        assertEquals(4, ((Object[]) result)[3]);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testRemove_List_IndexEqualToSize_kxOz4() {
        List<Integer> list = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5));
        Object result = ValueUtils.remove(list, 5);
        assertTrue(result instanceof List);
        assertEquals(4, ((List) result).size());
        assertEquals(1, ((List) result).get(0));
        assertEquals(2, ((List) result).get(1));
        assertEquals(3, ((List) result).get(2));
        assertEquals(4, ((List) result).get(3));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetValueWithException_PlxQ2_zILQ0_fid3() throws Exception {
        Object bean = new Object();
        PropertyDescriptor propertyDescriptor = new PropertyDescriptor("property", bean.getClass());
        Method readMethod = bean.getClass().getMethod("getProperty");
        propertyDescriptor.setReadMethod(readMethod);
        Object value = ValueUtils.getValue(bean, propertyDescriptor);
        assertNull(value);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetValueWithNullBean_drGC3_SGOb0_fid3() throws Exception {
        Object bean = null;
        PropertyDescriptor propertyDescriptor = new PropertyDescriptor("", null);
        Object value = ValueUtils.getValue(bean, propertyDescriptor);
        assertNull(value);
    }
}