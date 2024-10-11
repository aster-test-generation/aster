/**
 * Generated by Aster
 */
package org.apache.commons.jxpath.ri.model.beans;
import java.beans.IndexedPropertyDescriptor;
import java.beans.PropertyDescriptor;
import org.apache.commons.jxpath.JXPathContext;
import org.apache.commons.jxpath.ri.model.NodePointer;
import org.apache.commons.jxpath.util.ValueUtils;
import org.apache.commons.jxpath.JXPathBasicBeanInfo;
import org.apache.commons.jxpath.ri.model.dom.DOMNodePointer;
import org.apache.commons.jxpath.ri.QName;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoSettings;
import org.mockito.quality.Strictness;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import static org.mockito.Mockito.*;   
@ExtendWith(MockitoExtension.class)
@MockitoSettings(strictness = Strictness.LENIENT)
public class Aster_BeanPropertyPointer_Test_Passing {
private Object value = UNINITIALIZED;
@Mock
    private PropertyDescriptor propertyDescriptor;
@Mock
    private BeanPropertyPointer beanPropertyPointer;
@Mock
    private IndexedPropertyDescriptor indexedPropertyDescriptor;
@Mock
    private ValueUtils valueUtils;
@Mock
    private JXPathContext jXPathContext;
private BeanPropertyPointer beanpropertypointer;
@Mock
    private JXPathBasicBeanInfo jXPathBasicBeanInfo;
@Mock
    private Object getBaseValue;
@Mock
    private DOMNodePointer parent;
@Mock
    private JXPathBasicBeanInfo beanInfo;
@Mock
    private PropertyDescriptor[] propertyDescriptors;
@Mock
    private QName name;
@Mock
    private PropertyDescriptor[] getPropertyDescriptors;
    private static final Object UNINITIALIZED = new Object();
    private Object baseValue = UNINITIALIZED;
    private transient String[] names;
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsContainer() {
        beanpropertypointer = new BeanPropertyPointer(parent, beanInfo);
        // Arrange
        when(parent.isContainer()).thenReturn(true);
        // Act
        boolean result = beanpropertypointer.isContainer();
        // Assert
        assertEquals(true, result);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetPropertyDescriptors() {
        beanpropertypointer = new BeanPropertyPointer(null, beanInfo);
        // Arrange
        when(beanInfo.getPropertyDescriptors()).thenReturn(propertyDescriptors);
        // Act
        PropertyDescriptor[] result = beanpropertypointer.getPropertyDescriptors();
        // Assert
        assertEquals(propertyDescriptors, result);
        verify(beanInfo).getPropertyDescriptors();
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetPropertyNames() {
        beanpropertypointer = new BeanPropertyPointer(null, null);
        when(propertyDescriptors.length).thenReturn(2);
        when(propertyDescriptors[0].getName()).thenReturn("property1");
        when(propertyDescriptors[1].getName()).thenReturn("property2");
        String[] expected = {"property1", "property2"};
        String[] actual = beanpropertypointer.getPropertyNames();
        assertArrayEquals(expected, actual);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testsetPropertyIndex_1() {
        beanpropertypointer = new BeanPropertyPointer(null, null);
        int initialIndex = beanpropertypointer.getPropertyIndex();
        beanpropertypointer.setPropertyIndex(1);
        beanpropertypointer.setPropertyIndex(initialIndex);
        assertEquals(1, beanpropertypointer.getPropertyIndex());}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testsetPropertyIndex_2() {
        beanpropertypointer = new BeanPropertyPointer(null, null);
        int initialIndex = beanpropertypointer.getPropertyIndex();
        beanpropertypointer.setPropertyIndex(1);
        beanpropertypointer.setPropertyIndex(initialIndex);
        assertEquals(initialIndex, beanpropertypointer.getPropertyIndex());}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetPropertyCount_AtomicBeanInfo_ReturnsZero() throws Exception {
        beanpropertypointer = new BeanPropertyPointer(null, beanInfo);
        // Arrange
        when(beanInfo.isAtomic()).thenReturn(true);
        // Act
        int result = beanpropertypointer.getPropertyCount();
        // Assert
        assertEquals(0, result);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetPropertyCount_NonAtomicBeanInfo_ReturnsPropertyDescriptorCount() throws Exception {
        beanpropertypointer = new BeanPropertyPointer(null, beanInfo);
        // Arrange
        when(beanInfo.isAtomic()).thenReturn(false);
        when(beanInfo.getPropertyDescriptors()).thenReturn(getPropertyDescriptors);
        // Act
        int result = beanpropertypointer.getPropertyCount();
        // Assert
        assertEquals(getPropertyDescriptors.length, result);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testCreatePath_UHmf0_NNFr0() {
    JXPathContext context = JXPathContext.newContext(new Object());
    BeanPropertyPointer beanPropertyPointer = new BeanPropertyPointer(new DOMNodePointer(null, null, null), new JXPathBasicBeanInfo(new Object().getClass(), true));
    NodePointer result = beanPropertyPointer.createPath(context);
    assertNotNull(result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testCreatePathNullImmediateNode_rtbk1_UvSa0() {
    JXPathContext context = JXPathContext.newContext(null);
    BeanPropertyPointer beanPropertyPointer = new BeanPropertyPointer(null, new JXPathBasicBeanInfo(new Object().getClass(), true));
    NodePointer result = beanPropertyPointer.createPath(context);
    assertNotNull(result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testsetIndex_WnQI0() throws Exception{
    beanpropertypointer = Mockito.mock(BeanPropertyPointer.class);
    int index = 1;
    BeanPropertyPointer beanpropertypointer = this.beanpropertypointer;
    Mockito.when(beanpropertypointer.isCollection()).thenReturn(true);
    Mockito.when(beanpropertypointer.getPropertyCount()).thenReturn(0);
    beanpropertypointer.setIndex(index);
    Mockito.verify(beanpropertypointer).setIndex(index);
    Mockito.verify(beanpropertypointer).getPropertyCount();
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSetPropertyName_dRoX0() throws Exception {
    String propertyName = "testProperty"; // declare the variable
    BeanPropertyPointer beanpropertypointer = Mockito.mock(BeanPropertyPointer.class);
    Mockito.when(beanpropertypointer.getPropertyName()).thenReturn(propertyName);
    Mockito.verify(beanpropertypointer).setPropertyName(propertyName);
    org.junit.Assert.assertEquals(propertyName, beanpropertypointer.getPropertyName());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testgetBaseValue_aaLn0() throws Exception{
    beanpropertypointer = new BeanPropertyPointer(null, null);
    when(valueUtils.getValue(any(), any())).thenReturn("Test Value");
    Object baseValue = beanpropertypointer.getBaseValue();
    assertEquals("Test Value", baseValue);
    verify(valueUtils).getValue(any(), any());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetPropertyCount_NonAtomicBeanInfo_ReturnsPropertyDescriptorCount_EMTX0() throws Exception {
    BeanPropertyPointer beanPropertyPointer = new BeanPropertyPointer(null, beanInfo);
    when(beanInfo.isAtomic()).thenReturn(false);
    PropertyDescriptor[] propertyDescriptors = new PropertyDescriptor[1];
    propertyDescriptors[0] = new PropertyDescriptor("test", null, null, null);
    when(beanInfo.getPropertyDescriptors()).thenReturn(propertyDescriptors);
    int result = beanPropertyPointer.getPropertyCount();
    assertEquals(1, result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testsetPropertyIndex() {
        beanpropertypointer = new BeanPropertyPointer(null, null);
        int initialIndex = beanpropertypointer.getPropertyIndex();
        beanpropertypointer.setPropertyIndex(1);
        assertEquals(1, beanpropertypointer.getPropertyIndex());
        beanpropertypointer.setPropertyIndex(initialIndex);
        assertEquals(initialIndex, beanpropertypointer.getPropertyIndex());
    }
}