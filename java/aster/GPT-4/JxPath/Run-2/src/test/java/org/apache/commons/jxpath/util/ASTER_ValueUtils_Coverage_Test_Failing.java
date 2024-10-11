/**
 * Generated by Aster
 */
package org.apache.commons.jxpath.util;
import java.beans.IndexedPropertyDescriptor;
import java.beans.PropertyDescriptor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.mockito.Mockito.when;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_ValueUtils_Coverage_Test_Failing {

    @Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetValue_WithInvalidIndexOnNonCollection_rPQa2() throws Exception {
        Object bean = new Object();
        PropertyDescriptor pd = new PropertyDescriptor("testProperty", Object.class);
        ValueUtils.setValue(bean, pd, 1, "value");
    }
    @Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetValueWithInvocationTargetException_XtOS2() throws Exception {
        Object bean = new Object();
        IndexedPropertyDescriptor propertyDescriptor = mock(IndexedPropertyDescriptor.class);
        Method method = mock(Method.class);
        when(propertyDescriptor.getIndexedReadMethod()).thenReturn(method);
        when(method.invoke(bean, 0)).thenThrow(new InvocationTargetException(new Exception("Inner exception")));
        ValueUtils.getValue(bean, propertyDescriptor, 0);
    }
    @Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetValueWithOtherException_gacH4() throws Exception {
        Object bean = new Object();
        IndexedPropertyDescriptor propertyDescriptor = mock(IndexedPropertyDescriptor.class);
        Method method = mock(Method.class);
        when(propertyDescriptor.getIndexedReadMethod()).thenReturn(method);
        when(method.invoke(bean, 0)).thenThrow(new IllegalAccessException());
        ValueUtils.getValue(bean, propertyDescriptor, 0);
    }
    @Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetValueWithRuntimeException_ofNF11() throws Exception {
        Object bean = new Object();
        IndexedPropertyDescriptor propertyDescriptor = mock(IndexedPropertyDescriptor.class);
        Method method = mock(Method.class);
        when(propertyDescriptor.getIndexedReadMethod()).thenReturn(method);
        when(method.invoke(bean, 0)).thenThrow(new RuntimeException("Runtime exception"));
        ValueUtils.getValue(bean, propertyDescriptor, 0);
    }
    @Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetValueWithThrowable_oysQ12() throws Exception {
        Object bean = new Object();
        IndexedPropertyDescriptor propertyDescriptor = mock(IndexedPropertyDescriptor.class);
        Method method = mock(Method.class);
        when(propertyDescriptor.getIndexedReadMethod()).thenReturn(method);
        when(method.invoke(bean, 0)).thenThrow(new Throwable("Generic throwable"));
        ValueUtils.getValue(bean, propertyDescriptor, 0);
    }
    @Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testExpandCollectionWithSizeLessThanCurrent_RvJn0() {
        int[] originalArray = new int[] {1, 2, 3};
        int newSize = 2; // less than the length of the original array
        ValueUtils.expandCollection(originalArray, newSize);
    }
    @Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testExpandCollectionWithInvalidSize_GwzF1() {
        String[] originalArray = new String[] {"a", "b", "c"};
        int newSize = 1; // less than the length of the original array
        ValueUtils.expandCollection(originalArray, newSize);
    }
    interface PrivateInterface {
        void privateMethod_Imhe0();
}
    @Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testRemove_IndexOutOfBounds_XzfG0() {
        Integer[] array = {1, 2, 3};
        ValueUtils.remove(array, 3); // index >= length of array
}
    @Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testRemove_CollectionInvalidType_CPpJ3() {
        String str = "test";
        ValueUtils.remove(str, 0); // String is not a collection or array
}
    @Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetValue_NoWriteMethod_vQvu0() {
        Object bean = new Object();
        PropertyDescriptor pd = mock(PropertyDescriptor.class);
        when(pd.getWriteMethod()).thenReturn(null);
        ValueUtils.setValue(bean, pd, "value");
}
    @Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetValue_WriteMethodNotAccessible_qpHO1() {
        Object bean = new Object();
        Method writeMethod = mock(Method.class);
        PropertyDescriptor pd = mock(PropertyDescriptor.class);
        when(pd.getWriteMethod()).thenReturn(writeMethod);
        when(ValueUtils.getAccessibleMethod(writeMethod)).thenReturn(null);
        ValueUtils.setValue(bean, pd, "value");
}
    @Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetValue_NullBean_MWtT6() {
        PropertyDescriptor pd = mock(PropertyDescriptor.class);
        when(pd.getWriteMethod()).thenReturn(mock(Method.class));
        ValueUtils.setValue(null, pd, "value");
}

    @Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetValue_NullPropertyDescriptor_zEZZ8() {
        ValueUtils.setValue(new Object(), null, "value");
}
    @Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetValue_NullValue_SquO9() throws Exception {
        Object bean = new Object();
        Method writeMethod = mock(Method.class);
        PropertyDescriptor pd = mock(PropertyDescriptor.class);
        when(pd.getWriteMethod()).thenReturn(writeMethod);
        when(ValueUtils.getAccessibleMethod(writeMethod)).thenReturn(writeMethod);
        ValueUtils.setValue(bean, pd, null);
}
    @Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetValue_PropertyNameNull_weyG11() {
        Object bean = new Object();
        PropertyDescriptor pd = mock(PropertyDescriptor.class);
        when(pd.getName()).thenReturn(null);
        when(pd.getWriteMethod()).thenReturn(mock(Method.class));
        ValueUtils.setValue(bean, pd, "value");
    }
}