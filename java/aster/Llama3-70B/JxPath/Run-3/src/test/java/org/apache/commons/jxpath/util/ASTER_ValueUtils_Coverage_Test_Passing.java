/**
 * Generated by Aster
 */
package org.apache.commons.jxpath.util;
import java.beans.IndexedPropertyDescriptor;
import java.beans.PropertyDescriptor;
import java.lang.reflect.Array;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import org.apache.commons.jxpath.JXPathException;
import static org.junit.jupiter.api.Assertions.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.mockito.Mockito.when;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_ValueUtils_Coverage_Test_Passing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetCollectionHint_ReturnZero_YhWe1() {
        Class clazz = Object.class; // Object is a class
        int result = ValueUtils.getCollectionHint(clazz);
        assertEquals(0, result);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetValue_ArrayIndexOutOfBounds_Varx0_1() {
        Object[] array = new Object[5];
        assertNull(ValueUtils.getValue(array, -1));}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetValue_ArrayIndexOutOfBounds_Varx0_2() {
        Object[] array = new Object[5];
        assertNull(ValueUtils.getValue(array, 5));}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetValue_ListIndexOutOfBounds_CXTu1_1() {
        List<Object> list = new ArrayList<>();
        list.add("element");
        assertNull(ValueUtils.getValue(list, -1));}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetValue_ListIndexOutOfBounds_CXTu1_2() {
        List<Object> list = new ArrayList<>();
        list.add("element");
        assertNull(ValueUtils.getValue(list, 1));}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetValue_CollectionIndexOutOfBounds_HZaI2_1() {
        Collection<Object> collection = new ArrayList<>();
        collection.add("element");
        assertNull(ValueUtils.getValue(collection, -1));}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetValue_CollectionIndexOutOfBounds_HZaI2_2() {
        Collection<Object> collection = new ArrayList<>();
        collection.add("element");
        assertNull(ValueUtils.getValue(collection, 1));}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetValue_ArrayValidIndex_JQUq3() {
        Object[] array = new Object[5];
        array[0] = "element";
        assertEquals("element", ValueUtils.getValue(array, 0));
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetValue_ListValidIndex_iYVD4() {
        List<Object> list = new ArrayList<>();
        list.add("element");
        assertEquals("element", ValueUtils.getValue(list, 0));
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetValue_CollectionValidIndex_eIym5() {
        Collection<Object> collection = new ArrayList<>();
        collection.add("element");
        assertEquals("element", ValueUtils.getValue(collection, 0));
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetValue_CollectionIterator_TstI6() {
        Collection<Object> collection = new ArrayList<>();
        collection.add("element1");
        collection.add("element2");
        assertEquals("element2", ValueUtils.getValue(collection, 1));
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testRemove_List_ElementRemoved_qsCy1() {
        List<String> list = new ArrayList<>();
        list.add("element1");
        list.add("element2");
        ValueUtils.remove(list, 0);
        assert list.size() == 1;
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testRemove_Collection_ElementRemoved_lObB3() {
        Collection<String> collection = new ArrayList<>();
        collection.add("element1");
        collection.add("element2");
        ValueUtils.remove(collection, 0);
        assert collection.size() == 1;
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testRemove_Array_QpCi5() {
        String[] array = {"element1", "element2"};
        Object result = ValueUtils.remove(array, 0);
        assert result.getClass().isArray();
        assert Array.getLength(result) == 1;
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void clear_LKFH7() {
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetIndexedPropertyLength_ReadMethodNull_IndexedReadMethodNull_uiAL2() throws Exception {
        IndexedPropertyDescriptor pd = mock(IndexedPropertyDescriptor.class);
        when(pd.getReadMethod()).thenReturn(null);
        when(pd.getIndexedReadMethod()).thenReturn(null);
        Object object = new Object();
        try {
            ValueUtils.getIndexedPropertyLength(object, pd);
            fail("Expected JXPathException");
        } catch (JXPathException e) {
            assertEquals("No indexed read method for property " + pd.getName(), e.getMessage());
        }
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetIndexedPropertyLength_InvokeIndexedReadMethod_Succeeds_Ehre3() throws Exception {
        IndexedPropertyDescriptor pd = mock(IndexedPropertyDescriptor.class);
        when(pd.getReadMethod()).thenReturn(null);
        Method readMethod = mock(Method.class);
        when(pd.getIndexedReadMethod()).thenReturn(readMethod);
        Object object = new Object();
        when(readMethod.invoke(object, Integer.valueOf(0))).thenReturn("value");
        int result = ValueUtils.getIndexedPropertyLength(object, pd);
        assertEquals(1, result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetIndexedPropertyLength_GetLength_ReturnsZero_NurW6() throws Exception {
        IndexedPropertyDescriptor pd = mock(IndexedPropertyDescriptor.class);
        when(pd.getReadMethod()).thenReturn(mock(Method.class));
        Object object = new Object();
        when(ValueUtils.getValue(object, pd)).thenReturn(new Object[0]);
        int result = ValueUtils.getIndexedPropertyLength(object, pd);
        assertEquals(0, result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetIndexedPropertyLength_GetLength_ReturnsOne_HxwN7() throws Exception {
        IndexedPropertyDescriptor pd = mock(IndexedPropertyDescriptor.class);
        when(pd.getReadMethod()).thenReturn(mock(Method.class));
        Object object = new Object();
        when(ValueUtils.getValue(object, pd)).thenReturn(new Object[1]);
        int result = ValueUtils.getIndexedPropertyLength(object, pd);
        assertEquals(1, result);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetValue_PropertyDescriptorIsNull_ThrowsException_IKNR6() throws Exception {
        Object bean = new Object();
        PropertyDescriptor propertyDescriptor = null;
        Object value = new Object();
        try {
            ValueUtils.setValue(bean, propertyDescriptor, value);
            fail("Expected NullPointerException");
        } catch (NullPointerException e) {
            assertNotNull(e);
        }
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetAccessibleMethod_NullMethod_ggsQ0() {
        Method method = null;
        assertNull(ValueUtils.getAccessibleMethod(method));
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetCollectionHint_Interface_SMOq0_Jndk0() {
    Class<?> clazz = java.io.Serializable.class; // Serializable is an interface
    int result = ValueUtils.getCollectionHint(clazz);
    assertEquals(0, result);
}
@Test
public void testExpandCollection_Array_Qsqn0() {
    Object array = new String[] {"element1", "element2"};
    Object expandedArray = ValueUtils.expandCollection(array, 5);
    assertArrayEquals(new String[] {"element1", "element2", null, null, null}, (String[]) expandedArray);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testExpandCollection_WhenCollectionIsNull_ReturnsNull_GHOY0() {
    Object result = ValueUtils.expandCollection(null, 10);
    assertNull(result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testExpandCollection_WhenCollectionIsNull_ReturnsNull_DouX0() {
    assertNull(ValueUtils.expandCollection(null, 10));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testExpandCollection_WhenCollectionIsArray_ExpandsArray_mamB1_1() {
    Object array = new String[] {"a", "b", "c"};
    Object expandedArray = ValueUtils.expandCollection(array, 5);
    assertEquals(5, Array.getLength(expandedArray));}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testExpandCollection_WhenCollectionIsArray_ExpandsArray_mamB1_2() {
    Object array = new String[] {"a", "b", "c"};
    Object expandedArray = ValueUtils.expandCollection(array, 5);
    assertNotNull(expandedArray);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testExpandCollection_WhenCollectionIsCollection_ExpandsCollection_kjsY2_1() {
    Collection collection = new ArrayList();
    collection.add("a");
    collection.add("b");
    collection.add("c");
    Collection expandedCollection = (Collection) ValueUtils.expandCollection(collection, 5);
    assertEquals(5, expandedCollection.size());}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testExpandCollection_WhenCollectionIsCollection_ExpandsCollection_kjsY2_2() {
    Collection collection = new ArrayList();
    collection.add("a");
    collection.add("b");
    collection.add("c");
    Collection expandedCollection = (Collection) ValueUtils.expandCollection(collection, 5);
    assertNotNull(expandedCollection);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetValue_ArrayIndexOutOfBounds_Varx0() {
        Object[] array = new Object[5];
        assertNull(ValueUtils.getValue(array, -1));
        assertNull(ValueUtils.getValue(array, 5));
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetValue_ListIndexOutOfBounds_CXTu1() {
        List<Object> list = new ArrayList<>();
        list.add("element");
        assertNull(ValueUtils.getValue(list, -1));
        assertNull(ValueUtils.getValue(list, 1));
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetValue_CollectionIndexOutOfBounds_HZaI2() {
        Collection<Object> collection = new ArrayList<>();
        collection.add("element");
        assertNull(ValueUtils.getValue(collection, -1));
        assertNull(ValueUtils.getValue(collection, 1));
    }
}