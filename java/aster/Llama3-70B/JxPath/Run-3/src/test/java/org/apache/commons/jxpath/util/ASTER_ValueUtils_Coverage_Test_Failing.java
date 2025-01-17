/**
 * Generated by Aster
 */
package org.apache.commons.jxpath.util;
import java.beans.IndexedPropertyDescriptor;
import java.beans.PropertyDescriptor;
import java.lang.reflect.Method;
import org.apache.commons.jxpath.JXPathException;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_ValueUtils_Coverage_Test_Failing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetValue_ReturnNull_zEWl8() throws Exception {
        PropertyDescriptor propertyDescriptor = new PropertyDescriptor("test", Object.class);
        Object bean = new Object();
        int index = 0;
        assertNull(ValueUtils.getValue(bean, propertyDescriptor, index));
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetIndexedPropertyLength_ReadMethodNotNull_botq0() throws Exception {
        IndexedPropertyDescriptor pd = mock(IndexedPropertyDescriptor.class);
        when(pd.getReadMethod()).thenReturn(mock(Method.class));
        Object object = new Object();
        int result = ValueUtils.getIndexedPropertyLength(object, pd);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetIndexedPropertyLength_ReadMethodNull_IndexedReadMethodNotNull_IzNp1() throws Exception {
        IndexedPropertyDescriptor pd = mock(IndexedPropertyDescriptor.class);
        when(pd.getReadMethod()).thenReturn(null);
        when(pd.getIndexedReadMethod()).thenReturn(mock(Method.class));
        Object object = new Object();
        int result = ValueUtils.getIndexedPropertyLength(object, pd);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetIndexedPropertyLength_InvokeIndexedReadMethod_ThrowsException_nJgd4() throws Exception {
        IndexedPropertyDescriptor pd = mock(IndexedPropertyDescriptor.class);
        when(pd.getReadMethod()).thenReturn(null);
        Method readMethod = mock(Method.class);
        when(pd.getIndexedReadMethod()).thenReturn(readMethod);
        Object object = new Object();
        when(readMethod.invoke(object, Integer.valueOf(0))).thenThrow(new Throwable());
        int result = ValueUtils.getIndexedPropertyLength(object, pd);
        assertEquals(0, result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetIndexedPropertyLength_InvokeIndexedReadMethod_MaxCountReached_HEGQ5() throws Exception {
        IndexedPropertyDescriptor pd = mock(IndexedPropertyDescriptor.class);
        when(pd.getReadMethod()).thenReturn(null);
        Method readMethod = mock(Method.class);
        when(pd.getIndexedReadMethod()).thenReturn(readMethod);
        Object object = new Object();
        when(readMethod.invoke(object, any(Integer.class))).thenReturn("value");
        try {
            ValueUtils.getIndexedPropertyLength(object, pd);
            fail("Expected JXPathException");
        } catch (JXPathException e) {
            assertEquals("Cannot determine the length of the indexed property " + pd.getName(), e.getMessage());
        }
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetValue_GetAccessibleMethod_ReturnsMethod_wgpw0() throws Exception {
        Object bean = new Object();
        PropertyDescriptor propertyDescriptor = new PropertyDescriptor("property", Object.class);
        Method writeMethod = Object.class.getMethod("setProperty", Object.class);
        propertyDescriptor.setWriteMethod(writeMethod);
        Method method = ValueUtils.getAccessibleMethod(propertyDescriptor.getWriteMethod());
        assertNotNull(method);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetValue_GetAccessibleMethod_ReturnsNull_uZkt1() throws Exception {
        Object bean = new Object();
        PropertyDescriptor propertyDescriptor = new PropertyDescriptor("property", Object.class);
        propertyDescriptor.setWriteMethod(null);
        try {
            ValueUtils.setValue(bean, propertyDescriptor, new Object());
            fail("Expected JXPathException");
        } catch (JXPathException e) {
            assertEquals("No write method", e.getMessage());
        }
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetValue_ConvertValue_Succeeds_IoEx2() throws Exception {
        Object bean = new Object();
        PropertyDescriptor propertyDescriptor = new PropertyDescriptor("property", String.class);
        Object value = "value";
        ValueUtils.setValue(bean, propertyDescriptor, value);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetValue_BeanIsNull_ThrowsException_Gsxf5() throws Exception {
        Object bean = null;
        PropertyDescriptor propertyDescriptor = new PropertyDescriptor("property", Object.class);
        Object value = new Object();
        try {
            ValueUtils.setValue(bean, propertyDescriptor, value);
            fail("Expected JXPathException");
        } catch (JXPathException e) {
            assertEquals("Cannot modify property: null.property", e.getMessage());
        }
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetValue_ValueIsNull_ThrowsException_IZGW7() throws Exception {
        Object bean = new Object();
        PropertyDescriptor propertyDescriptor = new PropertyDescriptor("property", Object.class);
        Object value = null;
        try {
            ValueUtils.setValue(bean, propertyDescriptor, value);
            fail("Expected JXPathException");
        } catch (JXPathException e) {
            assertEquals("Cannot modify property: java.lang.Object.property", e.getMessage());
        }
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetValue_PropertyNameIsNull_ThrowsException_KtaP8() throws Exception {
        Object bean = new Object();
        PropertyDescriptor propertyDescriptor = new PropertyDescriptor(null, Object.class);
        Object value = new Object();
        try {
            ValueUtils.setValue(bean, propertyDescriptor, value);
            fail("Expected JXPathException");
        } catch (JXPathException e) {
            assertEquals("Cannot modify property: java.lang.Object.null", e.getMessage());
        }
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetValue_PropertyNameIsEmpty_ThrowsException_EkfL9() throws Exception {
        Object bean = new Object();
        PropertyDescriptor propertyDescriptor = new PropertyDescriptor("", Object.class);
        Object value = new Object();
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetValue_WhenPropertyDescriptorIsNull_ThrowsJXPathException_rPTd1() {
        try {
            ValueUtils.getValue(new Object(), null);
            fail("Expected JXPathException");
        } catch (JXPathException e) {
            assertEquals("Cannot access property: java.lang.Object.", e.getMessage());
        }
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetValue_CastToIndexedPropertyDescriptor_sWZw1_NLfN0() throws Exception {
    IndexedPropertyDescriptor propertyDescriptor = new IndexedPropertyDescriptor("test", Object.class, "isTest", "setTest", "getTest", "setTest");
    Object bean = new Object();
    int index = 0;
    ValueUtils.expandCollection(new Object[]{}, 10);
}
}