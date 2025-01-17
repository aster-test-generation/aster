/**
 * Generated by Aster
 */
package org.apache.commons.jxpath.util;

import java.beans.IndexedPropertyDescriptor;
import java.beans.PropertyDescriptor;
import java.util.*;
import java.util.concurrent.TimeUnit;
import org.apache.commons.jxpath.DynamicPropertyHandler;
import org.apache.commons.jxpath.JXPathException;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_ValueUtils_Test_Failing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetValue_IndexedPropertyDescriptor_VikZ0() throws Exception {
        Object bean = new Object();
        PropertyDescriptor propertyDescriptor = new IndexedPropertyDescriptor("name", bean.getClass());
        int index = 0;
        Object value = ValueUtils.getValue(bean, propertyDescriptor, index);
        assertEquals(bean.getClass().getMethod("get" + propertyDescriptor.getName()).invoke(bean), value);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetValue_NonIndexedPropertyDescriptor_qiBX1() throws Exception {
        Object bean = new Object();
        PropertyDescriptor propertyDescriptor = new PropertyDescriptor("name", bean.getClass());
        int index = 0;
        Object value = ValueUtils.getValue(bean, propertyDescriptor, index);
        assertEquals(bean.getClass().getMethod("get" + propertyDescriptor.getName()).invoke(bean), value);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetValue_IndexOutOfBoundsException_IeWf2() throws Exception {
        Object bean = new Object();
        PropertyDescriptor propertyDescriptor = new IndexedPropertyDescriptor("name", bean.getClass());
        int index = 10;
        try {
            ValueUtils.getValue(bean, propertyDescriptor, index);
            fail("Expected IndexOutOfBoundsException");
        } catch (IndexOutOfBoundsException e) {
            assertEquals("Index: 10, Size: 0", e.getMessage());
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testRemoveEmptyList_yWQx11() {
        List<Object> list = new ArrayList<Object>();
        Object result = ValueUtils.remove(list, 2);
        assertEquals(new ArrayList<Object>(), result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testRemoveEmptyCollection_HOPX12() {
        Collection<Object> collection = new HashSet<Object>();
        Object result = ValueUtils.remove(collection, 2);
        assertEquals(new HashSet<Object>(), result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetCollectionHint_Interface_zyvA3() {
        Class clazz = List.class;
        int hint = ValueUtils.getCollectionHint(clazz);
        assertEquals(0, hint);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetCollectionHint_FinalClassThatImplementsCollection_MWUz11() {
        Class clazz = ArrayList.class;
        int hint = ValueUtils.getCollectionHint(clazz);
        assertEquals(-1, hint);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetValue_NullBean_yVMC0() {
        try {
            ValueUtils.setValue(null, null, null);
            fail("Expected JXPathException to be thrown");
        } catch (JXPathException e) {
            assertEquals("Cannot modify property: null.null", e.getMessage());
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetValue_NullPropertyDescriptor_JWDz1() {
        Object bean = new Object();
        try {
            ValueUtils.setValue(bean, null, null);
            fail("Expected JXPathException to be thrown");
        } catch (JXPathException e) {
            assertEquals("Cannot modify property: " + bean.getClass().getName() + ".null", e.getMessage());
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetValue_Collection_rMyE2() {
        Collection<Object> collection = new HashSet<>();
        collection.add("test");
        ValueUtils.setValue(collection, 0, "test2");
        assertEquals("test2", collection.iterator().next());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetValue_UnsupportedType_kFJp4() {
        Map<Object, Object> map = new HashMap<>();
        map.put("key", "value");
        try {
            ValueUtils.setValue(map, 0, "test");
            fail("Expected UnsupportedOperationException");
        } catch (UnsupportedOperationException e) {
            assertEquals("Cannot set value of an element of a java.util.HashMap", e.getMessage());
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetValue_propertyDescriptorIsNull_KPaq1() {
        Object value = ValueUtils.getValue(new Object(), null);
        assertNull(value);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetValue_beanIsNotNullButPropertyDescriptorIsNull_SaHd3() {
        Object bean = new Object();
        Object value = ValueUtils.getValue(bean, null);
        assertNull(value);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetDynamicPropertyHandler_mnfm0() {
        Class clazz = DynamicPropertyHandler.class;
        DynamicPropertyHandler handler = ValueUtils.getDynamicPropertyHandler(clazz);
        assertNotNull(handler);
        assertEquals(DynamicPropertyHandler.class, handler.getClass());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetDynamicPropertyHandlerWithException_hwCR1() {
        Class clazz = null;
        try {
            ValueUtils.getDynamicPropertyHandler(clazz);
            fail("Expected JXPathException");
        } catch (JXPathException e) {
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testExpandCollection_NonCollection_ynUx3() {
        Object result = ValueUtils.expandCollection(new Object(), 5);
        assertEquals(5, ((Collection) result).size());
        assertNull(((Collection) result).toArray()[0]);
        assertNull(((Collection) result).toArray()[1]);
        assertNull(((Collection) result).toArray()[2]);
        assertNull(((Collection) result).toArray()[3]);
        assertNull(((Collection) result).toArray()[4]);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testExpandCollection_NegativeSize_sFDB4() {
        Object result = ValueUtils.expandCollection(new Object(), -1);
        assertEquals(0, ((Collection) result).size());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testExpandCollection_ZeroSize_vZDV5() {
        Object result = ValueUtils.expandCollection(new Object(), 0);
        assertEquals(0, ((Collection) result).size());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIterateArray_SgvX1_4() {
        Object[] array = new Object[]{"a", "b", "c"};
        Iterator<Object> iterator = ValueUtils.iterate(array);
        assertEquals("b", iterator.next());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIterateArray_SgvX1_5() {
        Object[] array = new Object[]{"a", "b", "c"};
        Iterator<Object> iterator = ValueUtils.iterate(array);
        assertEquals("c", iterator.next());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIterateArray_SgvX1_6() {
        Object[] array = new Object[]{"a", "b", "c"};
        Iterator<Object> iterator = ValueUtils.iterate(array);
        assertFalse(iterator.hasNext());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIterateCollection_LaSA2_4() {
        Collection<Object> collection = new ArrayList<Object>();
        collection.add("a");
        collection.add("b");
        collection.add("c");
        Iterator<Object> iterator = ValueUtils.iterate(collection);
        assertEquals("b", iterator.next());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIterateCollection_LaSA2_5() {
        Collection<Object> collection = new ArrayList<Object>();
        collection.add("a");
        collection.add("b");
        collection.add("c");
        Iterator<Object> iterator = ValueUtils.iterate(collection);
        assertEquals("c", iterator.next());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIterateCollection_LaSA2_6() {
        Collection<Object> collection = new ArrayList<Object>();
        collection.add("a");
        collection.add("b");
        collection.add("c");
        Iterator<Object> iterator = ValueUtils.iterate(collection);
        assertFalse(iterator.hasNext());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIterateSingletonList_HExS3_4() {
        Object object = "a";
        Iterator<Object> iterator = ValueUtils.iterate(object);
        assertFalse(iterator.hasNext());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetDynamicPropertyHandler_mnfm0_1() {
        Class clazz = DynamicPropertyHandler.class;
        DynamicPropertyHandler handler = ValueUtils.getDynamicPropertyHandler(clazz);
        assertNotNull(handler);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetDynamicPropertyHandler_mnfm0_2() {
        Class clazz = DynamicPropertyHandler.class;
        DynamicPropertyHandler handler = ValueUtils.getDynamicPropertyHandler(clazz);
        assertEquals(DynamicPropertyHandler.class, handler.getClass());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testExpandCollection_NonCollection_ynUx3_1() {
        Object result = ValueUtils.expandCollection(new Object(), 5);
        assertEquals(5, ((Collection) result).size());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testExpandCollection_NonCollection_ynUx3_2() {
        Object result = ValueUtils.expandCollection(new Object(), 5);
        assertNull(((Collection) result).toArray()[0]);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testExpandCollection_NonCollection_ynUx3_3() {
        Object result = ValueUtils.expandCollection(new Object(), 5);
        assertNull(((Collection) result).toArray()[1]);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testExpandCollection_NonCollection_ynUx3_4() {
        Object result = ValueUtils.expandCollection(new Object(), 5);
        assertNull(((Collection) result).toArray()[2]);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testExpandCollection_NonCollection_ynUx3_5() {
        Object result = ValueUtils.expandCollection(new Object(), 5);
        assertNull(((Collection) result).toArray()[3]);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testExpandCollection_NonCollection_ynUx3_6() {
        Object result = ValueUtils.expandCollection(new Object(), 5);
        assertNull(((Collection) result).toArray()[4]);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetValue_IndexedPropertyDescriptor_VikZ0_fid2() throws Exception {
        Object bean = new Object();
        PropertyDescriptor propertyDescriptor = new IndexedPropertyDescriptor("name", bean.getClass());
        int index = 0;
        Object value = ValueUtils.getValue(bean, propertyDescriptor, index);
        assertEquals(bean.getClass().getMethod("get" + propertyDescriptor.getName() + "At").invoke(bean, index), value);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetValue_NonIndexedPropertyDescriptor_qiBX1_fid2() throws Exception {
        Object bean = new Object();
        PropertyDescriptor propertyDescriptor = new PropertyDescriptor("name", bean.getClass());
        int index = 0;
        Object value = ValueUtils.getValue(bean, propertyDescriptor, index);
        assertEquals(bean.getClass().getMethod("getName").invoke(bean), value);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetDynamicPropertyHandlerWithException_hwCR1_fid2() {
        Class clazz = null;
        try {
            ValueUtils.getDynamicPropertyHandler(clazz);
            fail("Expected JXPathException");
        } catch (JXPathException e) {
            assertEquals("Cannot turn null into a collection of size 1", e.getMessage());
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetDynamicPropertyHandlerWithNullClass_tugn4_fid2() {
        Class clazz = null;
        try {
            ValueUtils.getDynamicPropertyHandler(clazz);
            fail("Expected JXPathException");
        } catch (JXPathException e) {
            assertEquals("Cannot turn null into a collection of size 0", e.getMessage());
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetDynamicPropertyHandlerWithNullConstructor_gpxa7_fid2() {
        Class clazz = null;
        try {
            ValueUtils.getDynamicPropertyHandler(clazz);
            fail("Expected JXPathException");
        } catch (JXPathException e) {
            assertEquals(e.getMessage(), "Cannot turn null into a collection of size 0");
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testExpandCollection_NonCollection_ynUx3_1_fid2() {
        Object result = ValueUtils.expandCollection(new Object(), 5);
        assertEquals(1, ((Collection) result).size());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testExpandCollection_ZeroSize_vZDV5_fid2() {
        Object result = ValueUtils.expandCollection(new Object[0], 0);
        assertEquals(0, ((Collection) result).size());
    }
}