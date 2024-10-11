/**
 * Generated by Aster
 */
package org.apache.commons.jxpath.ri.model.beans;
import java.beans.PropertyDescriptor;
import org.apache.commons.jxpath.JXPathContext;
import org.apache.commons.jxpath.ri.model.NodePointer;
import org.apache.commons.jxpath.util.ValueUtils;
import org.apache.commons.jxpath.JXPathBasicBeanInfo;
import org.apache.commons.jxpath.ri.model.dom.DOMNodePointer;
import static org.junit.jupiter.api.Assertions.*;
import java.util.Locale;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoSettings;
import org.mockito.quality.Strictness;
import org.mockito.InjectMocks;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import static org.mockito.Mockito.*;
import java.lang.reflect.Field;   
@ExtendWith(MockitoExtension.class)
@MockitoSettings(strictness = Strictness.LENIENT)
public class Aster_BeanPropertyPointer_Test_Passing {
private static final Object UNINITIALIZED = null;
@Mock
    private DOMNodePointer parent;
@Mock
    private JXPathBasicBeanInfo beanInfo;
@Mock
    private PropertyDescriptor propertyDescriptor;
@InjectMocks
    private BeanPropertyPointer beanPropertyPointer;
@Mock
    private DOMNodePointer parentNode;
@Mock
    private DOMNodePointer domNodePointerMock;
@Mock
    private JXPathBasicBeanInfo jXPathBasicBeanInfoMock;
@Mock
    private JXPathContext jXPathContextMock;
@Mock
    private DOMNodePointer mockParent;
@Mock
    private JXPathBasicBeanInfo mockBeanInfo;
@Mock
    private DOMNodePointer parentMock;
@Mock
    private JXPathBasicBeanInfo beanInfoMock;
@Mock
    private DOMNodePointer domNodePointer;
@Mock
    private JXPathBasicBeanInfo jXPathBasicBeanInfo;
@Mock
    private PropertyDescriptor mockPropertyDescriptor1;
@Mock
    private PropertyDescriptor mockPropertyDescriptor2;
@Mock
    private Object bean;
@Mock
    private JXPathBasicBeanInfo jxPathBasicBeanInfo;
    private Object value = UNINITIALIZED;
    private String propertyName;
    private Object baseValue = UNINITIALIZED;
    private transient PropertyDescriptor[] propertyDescriptors;
    private transient String[] names;
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCreatePath_WhenImmediateNodeIsNull_1() throws Exception {
        beanPropertyPointer = new BeanPropertyPointer(domNodePointerMock, jXPathBasicBeanInfoMock);
        // Arrange
        when(beanPropertyPointer.getImmediateNode()).thenReturn(null);
        // Act
        NodePointer result = beanPropertyPointer.createPath(jXPathContextMock);
        // Assert
        verify(beanPropertyPointer, times(1)).createPath(jXPathContextMock);
        assertSame(beanPropertyPointer, result, "The returned NodePointer should be the same instance as 'beanPropertyPointer'");}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCreatePath_WhenImmediateNodeIsNull_2() throws Exception {
        beanPropertyPointer = new BeanPropertyPointer(domNodePointerMock, jXPathBasicBeanInfoMock);
        // Arrange
        when(beanPropertyPointer.getImmediateNode()).thenReturn(null);
        // Act
        NodePointer result = beanPropertyPointer.createPath(jXPathContextMock);
        // Assert
        verify(beanPropertyPointer, times(1)).createPath(jXPathContextMock);
        assertNull(beanPropertyPointer.getImmediateNode(), "Immediate node should still be null after path creation");}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCreatePath_WhenImmediateNodeIsNull_3() throws Exception {
        beanPropertyPointer = new BeanPropertyPointer(domNodePointerMock, jXPathBasicBeanInfoMock);
        // Arrange
        when(beanPropertyPointer.getImmediateNode()).thenReturn(null);
        // Act
        NodePointer result = beanPropertyPointer.createPath(jXPathContextMock);
        // Assert
        verify(beanPropertyPointer, times(1)).createPath(jXPathContextMock);
        assertEquals(UNINITIALIZED, beanPropertyPointer.getNodeValue(), "Node value should be reset to UNINITIALIZED");}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCreatePath_WhenImmediateNodeIsNotNull_1() throws Exception {
        beanPropertyPointer = new BeanPropertyPointer(domNodePointerMock, jXPathBasicBeanInfoMock);
        // Arrange
        Object node = new Object();
        when(beanPropertyPointer.getImmediateNode()).thenReturn(node);
        // Act
        NodePointer result = beanPropertyPointer.createPath(jXPathContextMock);
        // Assert
        verify(beanPropertyPointer, never()).createPath(jXPathContextMock);
        assertSame(beanPropertyPointer, result, "The returned NodePointer should be the same instance as 'beanPropertyPointer'");}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCreatePath_WhenImmediateNodeIsNotNull_2() throws Exception {
        beanPropertyPointer = new BeanPropertyPointer(domNodePointerMock, jXPathBasicBeanInfoMock);
        // Arrange
        Object node = new Object();
        when(beanPropertyPointer.getImmediateNode()).thenReturn(node);
        // Act
        NodePointer result = beanPropertyPointer.createPath(jXPathContextMock);
        // Assert
        verify(beanPropertyPointer, never()).createPath(jXPathContextMock);
        assertSame(node, beanPropertyPointer.getImmediateNode(), "Immediate node should not change after path creation");}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetPropertyName() throws Exception {
        // Initialization of mocks is handled by MockitoExtension
        // Arrange
        String expectedPropertyName = "testProperty";
        // Act
        beanPropertyPointer.setPropertyName(expectedPropertyName);
        // Assert
        assertEquals(expectedPropertyName, beanPropertyPointer.getPropertyName(), "Property name should match the set value.");
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsContainer() throws Exception {
        // Initialization of mocks is handled by MockitoExtension
        // Act
        boolean result = beanPropertyPointer.isContainer();
        // Assert
        assertTrue(result, "isContainer should always return true");
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetIndex_WithDifferentIndex_UpdatesIndexAndValue_1() throws Exception {
        // Initialize BeanPropertyPointer with mocked dependencies
        beanPropertyPointer = new BeanPropertyPointer(parentMock, beanInfoMock);
        // Arrange
        int initialIndex = 0;
        int newIndex = 1;
        beanPropertyPointer.setIndex(initialIndex); // Setting initial index
        // Act
        beanPropertyPointer.setIndex(newIndex);
        // Assert
        assertEquals(newIndex, beanPropertyPointer.getIndex(), "Index should be updated to new index");}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetIndex_WithDifferentIndex_UpdatesIndexAndValue_2() throws Exception {
        // Initialize BeanPropertyPointer with mocked dependencies
        beanPropertyPointer = new BeanPropertyPointer(parentMock, beanInfoMock);
        // Arrange
        int initialIndex = 0;
        int newIndex = 1;
        beanPropertyPointer.setIndex(initialIndex); // Setting initial index
        // Act
        beanPropertyPointer.setIndex(newIndex);
        // Assert
        assertEquals(UNINITIALIZED, beanPropertyPointer.getValue(), "Value should be reset to UNINITIALIZED");}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetIndex_WithSameIndex_DoesNotUpdateValue_1() throws Exception {
        // Initialize BeanPropertyPointer with mocked dependencies
        beanPropertyPointer = new BeanPropertyPointer(parentMock, beanInfoMock);
        // Arrange
        int initialIndex = 0;
        beanPropertyPointer.setIndex(initialIndex); // Setting initial index
        // Act
        beanPropertyPointer.setIndex(initialIndex); // Setting the same index again
        // Assert
        assertEquals(initialIndex, beanPropertyPointer.getIndex(), "Index should remain unchanged");}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetIndex_WithSameIndex_DoesNotUpdateValue_2() throws Exception {
        // Initialize BeanPropertyPointer with mocked dependencies
        beanPropertyPointer = new BeanPropertyPointer(parentMock, beanInfoMock);
        // Arrange
        int initialIndex = 0;
        beanPropertyPointer.setIndex(initialIndex); // Setting initial index
        // Act
        beanPropertyPointer.setIndex(initialIndex); // Setting the same index again
        // Assert
        assertNotEquals(UNINITIALIZED, beanPropertyPointer.getValue(), "Value should not be reset");}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetPropertyDescriptors_1() throws Exception {
        when(beanInfo.getPropertyDescriptors()).thenReturn(new PropertyDescriptor[]{});
        beanPropertyPointer = new BeanPropertyPointer(domNodePointer, jXPathBasicBeanInfo);
        // First call, propertyDescriptors should be fetched from beanInfo
        PropertyDescriptor[] descriptors = beanPropertyPointer.getPropertyDescriptors();
        verify(beanInfo, times(1)).getPropertyDescriptors();
        // Subsequent calls, should not fetch from beanInfo again, should return cached value
        descriptors = beanPropertyPointer.getPropertyDescriptors();
        verify(beanInfo, times(1)).getPropertyDescriptors(); // still one time only
        assertNotNull(descriptors, "Property descriptors should not be null on first call");}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetPropertyDescriptors_2() throws Exception {
        when(beanInfo.getPropertyDescriptors()).thenReturn(new PropertyDescriptor[]{});
        beanPropertyPointer = new BeanPropertyPointer(domNodePointer, jXPathBasicBeanInfo);
        // First call, propertyDescriptors should be fetched from beanInfo
        PropertyDescriptor[] descriptors = beanPropertyPointer.getPropertyDescriptors();
        verify(beanInfo, times(1)).getPropertyDescriptors();
        // Subsequent calls, should not fetch from beanInfo again, should return cached value
        descriptors = beanPropertyPointer.getPropertyDescriptors();
        verify(beanInfo, times(1)).getPropertyDescriptors(); // still one time only
        assertNotNull(descriptors, "Property descriptors should not be null on subsequent calls");}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetPropertyNames_1() throws Exception {
        when(mockBeanInfo.getPropertyDescriptors()).thenReturn(new PropertyDescriptor[]{mockPropertyDescriptor1, mockPropertyDescriptor2});
        when(mockPropertyDescriptor1.getName()).thenReturn("propertyOne");
        when(mockPropertyDescriptor2.getName()).thenReturn("propertyTwo");
        String[] propertyNames = beanPropertyPointer.getPropertyNames();
        // Verify that getPropertyDescriptors is called exactly once
        verify(mockBeanInfo, times(1)).getPropertyDescriptors();
        // Verify that getName is called on each PropertyDescriptor
        verify(mockPropertyDescriptor1, times(1)).getName();
        verify(mockPropertyDescriptor2, times(1)).getName();
        assertNotNull(propertyNames, "Property names should not be null");}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetPropertyNames_2() throws Exception {
        when(mockBeanInfo.getPropertyDescriptors()).thenReturn(new PropertyDescriptor[]{mockPropertyDescriptor1, mockPropertyDescriptor2});
        when(mockPropertyDescriptor1.getName()).thenReturn("propertyOne");
        when(mockPropertyDescriptor2.getName()).thenReturn("propertyTwo");
        String[] propertyNames = beanPropertyPointer.getPropertyNames();
        // Verify that getPropertyDescriptors is called exactly once
        verify(mockBeanInfo, times(1)).getPropertyDescriptors();
        // Verify that getName is called on each PropertyDescriptor
        verify(mockPropertyDescriptor1, times(1)).getName();
        verify(mockPropertyDescriptor2, times(1)).getName();
        assertEquals(2, propertyNames.length, "There should be two property names");}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetPropertyNames_3() throws Exception {
        when(mockBeanInfo.getPropertyDescriptors()).thenReturn(new PropertyDescriptor[]{mockPropertyDescriptor1, mockPropertyDescriptor2});
        when(mockPropertyDescriptor1.getName()).thenReturn("propertyOne");
        when(mockPropertyDescriptor2.getName()).thenReturn("propertyTwo");
        String[] propertyNames = beanPropertyPointer.getPropertyNames();
        // Verify that getPropertyDescriptors is called exactly once
        verify(mockBeanInfo, times(1)).getPropertyDescriptors();
        // Verify that getName is called on each PropertyDescriptor
        verify(mockPropertyDescriptor1, times(1)).getName();
        verify(mockPropertyDescriptor2, times(1)).getName();
        assertEquals("propertyOne", propertyNames[0], "First property name should match");}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetPropertyNames_4() throws Exception {
        when(mockBeanInfo.getPropertyDescriptors()).thenReturn(new PropertyDescriptor[]{mockPropertyDescriptor1, mockPropertyDescriptor2});
        when(mockPropertyDescriptor1.getName()).thenReturn("propertyOne");
        when(mockPropertyDescriptor2.getName()).thenReturn("propertyTwo");
        String[] propertyNames = beanPropertyPointer.getPropertyNames();
        // Verify that getPropertyDescriptors is called exactly once
        verify(mockBeanInfo, times(1)).getPropertyDescriptors();
        // Verify that getName is called on each PropertyDescriptor
        verify(mockPropertyDescriptor1, times(1)).getName();
        verify(mockPropertyDescriptor2, times(1)).getName();
        assertEquals("propertyTwo", propertyNames[1], "Second property name should match");}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetPropertyCount_AtomicTrue_ReturnsZero() throws Exception {
        when(beanInfo.isAtomic()).thenReturn(false);
        when(beanInfo.getPropertyDescriptors()).thenReturn(new PropertyDescriptor[]{new PropertyDescriptor("property1", Object.class), new PropertyDescriptor("property2", Object.class)});
        when(beanInfo.isAtomic()).thenReturn(true);
        int result = beanPropertyPointer.getPropertyCount();
        assertEquals(0, result, "Expected property count to be zero when bean is atomic");
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetPropertyCount_AtomicFalse_ReturnsPropertyDescriptorLength() throws Exception {
        when(beanInfo.isAtomic()).thenReturn(false);
        when(beanInfo.getPropertyDescriptors()).thenReturn(new PropertyDescriptor[]{new PropertyDescriptor("property1", Object.class), new PropertyDescriptor("property2", Object.class)});
        when(beanInfo.isAtomic()).thenReturn(false);
        int result = beanPropertyPointer.getPropertyCount();
        assertEquals(2, result, "Expected property count to match the number of property descriptors");
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetPropertyName_WhenPropertyDescriptorIsNotNull_Lmwm0() throws Exception {
    DOMNodePointer parent = mock(DOMNodePointer.class);
    JXPathBasicBeanInfo beanInfo = mock(JXPathBasicBeanInfo.class);
    BeanPropertyPointer beanPropertyPointer = new BeanPropertyPointer(parent, beanInfo);
    PropertyDescriptor[] propertyDescriptors = new PropertyDescriptor[1];
    String expectedPropertyName = "testProperty";
    propertyDescriptors[0] = mock(PropertyDescriptor.class);
    when(beanInfo.getPropertyDescriptors()).thenReturn(propertyDescriptors);
    when(propertyDescriptors[0].getName()).thenReturn(expectedPropertyName);
    String actualPropertyName = beanPropertyPointer.getPropertyName();
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetPropertyNameReturnsCorrectName_WQZr0_Eqcw0() {
    DOMNodePointer parent = new DOMNodePointer(null, Locale.getDefault(), null);
    JXPathBasicBeanInfo beanInfo = new JXPathBasicBeanInfo(Object.class);
    BeanPropertyPointer bpp = new BeanPropertyPointer(parent, beanInfo);
    assertEquals("Expected property name", "propertyName", bpp.getPropertyName());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetPropertyNameReturnsAsteriskWhenNameIsNull_SvWi1_XEFV0() {
    Locale locale = null; // Assuming Locale can be null as per original intent
    DOMNodePointer parent = new DOMNodePointer(null, locale, null);
    JXPathBasicBeanInfo beanInfo = new JXPathBasicBeanInfo(Object.class);
    BeanPropertyPointer bpp = new BeanPropertyPointer(parent, beanInfo);
    assertEquals("Expected default property name", "*", bpp.getPropertyName());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetPropertyNameCachesResult_sJYT3_WQYa0() {
    Locale locale = null; // Assuming Locale can be null as per the original test setup
    JXPathBasicBeanInfo beanInfo = new JXPathBasicBeanInfo(Object.class);
    BeanPropertyPointer bpp = new BeanPropertyPointer(parent, beanInfo);
    bpp.getPropertyName(); // Call once to set the cache
    assertEquals("Expected cached property name", "propertyName", bpp.getPropertyName());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testIsCollection_WithNullPropertyDescriptor_ReturnsFalse_CpXU0() throws Exception {
    DOMNodePointer parentNode = mock(DOMNodePointer.class);
    when(parentNode.getBaseValue()).thenReturn(null); // Default behavior
    JXPathBasicBeanInfo beanInfo = mock(JXPathBasicBeanInfo.class);
    BeanPropertyPointer beanPropertyPointer = new BeanPropertyPointer(parentNode, beanInfo);
    assertFalse(beanPropertyPointer.isCollection());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetImmediateNode_UninitializedAndNonNullPropertyDescriptor_nzes0() throws NoSuchFieldException, IllegalAccessException {
    DOMNodePointer parent = mock(DOMNodePointer.class);
    JXPathBasicBeanInfo beanInfo = mock(JXPathBasicBeanInfo.class);
    BeanPropertyPointer beanPropertyPointer = new BeanPropertyPointer(parent, beanInfo);
    Field valueField = BeanPropertyPointer.class.getDeclaredField("value");
    valueField.setAccessible(true);
    valueField.set(beanPropertyPointer, UNINITIALIZED);
    PropertyDescriptor[] propertyDescriptors = new PropertyDescriptor[]{mock(PropertyDescriptor.class)};
    Field descriptorsField = BeanPropertyPointer.class.getDeclaredField("propertyDescriptors");
    descriptorsField.setAccessible(true);
    descriptorsField.set(beanPropertyPointer, propertyDescriptors);
    Object expectedValue = new Object();
    when(ValueUtils.getValue(any(), eq(propertyDescriptors[0]), anyInt())).thenReturn(expectedValue);
    Object result = beanPropertyPointer.getImmediateNode();
    assertSame(expectedValue, result, "Expected result to be the value returned from ValueUtils");
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetImmediateNode_AlreadyInitialized_npOs0() throws NoSuchFieldException, IllegalAccessException {
    DOMNodePointer parent = mock(DOMNodePointer.class);
    JXPathBasicBeanInfo beanInfo = mock(JXPathBasicBeanInfo.class);
    BeanPropertyPointer beanPropertyPointer = new BeanPropertyPointer(parent, beanInfo);
    final Object UNINITIALIZED = null; // Define or replace with actual constant if available
    Field valueField = BeanPropertyPointer.class.getDeclaredField("value");
    valueField.setAccessible(true);
    valueField.set(beanPropertyPointer, UNINITIALIZED);
    Object initializedValue = new Object();
    valueField.set(beanPropertyPointer, initializedValue);
    Object result = beanPropertyPointer.getImmediateNode();
    assertSame(initializedValue, result, "Expected result to be the previously initialized value");
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetImmediateNode_UninitializedWholeCollection_ScHF0_zWGt0() {
    Locale locale = null; // Assuming Locale can be null as per original test case intent
    DOMNodePointer parent = new DOMNodePointer(null, locale);
    JXPathBasicBeanInfo beanInfo = new JXPathBasicBeanInfo(Object.class);
    BeanPropertyPointer pointer = new BeanPropertyPointer(parent, beanInfo);
    pointer.setIndex(BeanPropertyPointer.WHOLE_COLLECTION);
    Object result = pointer.getImmediateNode();
    assertNotNull(result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetImmediateNode_UninitializedSingleIndexWithPropertyDescriptor_CQhJ1_JbWL0() {
    Locale locale = null; // Assuming locale can be null for this test
    DOMNodePointer parent = new DOMNodePointer(null, locale);
    JXPathBasicBeanInfo beanInfo = new JXPathBasicBeanInfo(Object.class);
    BeanPropertyPointer pointer = new BeanPropertyPointer(parent, beanInfo);
    pointer.setIndex(0); // Using setter to set index assuming it exists
    pointer.setValue(null); // Assuming setValue method exists and setting it to null simulates uninitialized
    Object result = pointer.getImmediateNode();
    assertNotNull(result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetImmediateNode_UninitializedSingleIndexNoPropertyDescriptor_aIFl2_ccmp0() {
    Locale locale = null; // Assuming locale can be null for this test
    DOMNodePointer parent = new DOMNodePointer(null, locale);
    JXPathBasicBeanInfo beanInfo = new JXPathBasicBeanInfo(Object.class);
    BeanPropertyPointer pointer = new BeanPropertyPointer(parent, beanInfo);
    pointer.setIndex(0); // Corrected to use setter method to access protected field
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCreatePath_WhenImmediateNodeIsNull() throws Exception {
        beanPropertyPointer = new BeanPropertyPointer(domNodePointerMock, jXPathBasicBeanInfoMock);
        // Arrange
        when(beanPropertyPointer.getImmediateNode()).thenReturn(null);
        // Act
        NodePointer result = beanPropertyPointer.createPath(jXPathContextMock);
        // Assert
        verify(beanPropertyPointer, times(1)).createPath(jXPathContextMock);
        assertSame(beanPropertyPointer, result, "The returned NodePointer should be the same instance as 'beanPropertyPointer'");
        assertNull(beanPropertyPointer.getImmediateNode(), "Immediate node should still be null after path creation");
        assertEquals(UNINITIALIZED, beanPropertyPointer.getNodeValue(), "Node value should be reset to UNINITIALIZED");
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCreatePath_WhenImmediateNodeIsNotNull() throws Exception {
        beanPropertyPointer = new BeanPropertyPointer(domNodePointerMock, jXPathBasicBeanInfoMock);
        // Arrange
        Object node = new Object();
        when(beanPropertyPointer.getImmediateNode()).thenReturn(node);
        // Act
        NodePointer result = beanPropertyPointer.createPath(jXPathContextMock);
        // Assert
        verify(beanPropertyPointer, never()).createPath(jXPathContextMock);
        assertSame(beanPropertyPointer, result, "The returned NodePointer should be the same instance as 'beanPropertyPointer'");
        assertSame(node, beanPropertyPointer.getImmediateNode(), "Immediate node should not change after path creation");
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetIndex_WithDifferentIndex_UpdatesIndexAndValue() throws Exception {
        // Initialize BeanPropertyPointer with mocked dependencies
        beanPropertyPointer = new BeanPropertyPointer(parentMock, beanInfoMock);
        // Arrange
        int initialIndex = 0;
        int newIndex = 1;
        beanPropertyPointer.setIndex(initialIndex); // Setting initial index
        // Act
        beanPropertyPointer.setIndex(newIndex);
        // Assert
        assertEquals(newIndex, beanPropertyPointer.getIndex(), "Index should be updated to new index");
        assertEquals(UNINITIALIZED, beanPropertyPointer.getValue(), "Value should be reset to UNINITIALIZED");
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetIndex_WithSameIndex_DoesNotUpdateValue() throws Exception {
        // Initialize BeanPropertyPointer with mocked dependencies
        beanPropertyPointer = new BeanPropertyPointer(parentMock, beanInfoMock);
        // Arrange
        int initialIndex = 0;
        beanPropertyPointer.setIndex(initialIndex); // Setting initial index
        // Act
        beanPropertyPointer.setIndex(initialIndex); // Setting the same index again
        // Assert
        assertEquals(initialIndex, beanPropertyPointer.getIndex(), "Index should remain unchanged");
        assertNotEquals(UNINITIALIZED, beanPropertyPointer.getValue(), "Value should not be reset");
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetPropertyDescriptors() throws Exception {
        when(beanInfo.getPropertyDescriptors()).thenReturn(new PropertyDescriptor[]{});
        beanPropertyPointer = new BeanPropertyPointer(domNodePointer, jXPathBasicBeanInfo);
        // First call, propertyDescriptors should be fetched from beanInfo
        PropertyDescriptor[] descriptors = beanPropertyPointer.getPropertyDescriptors();
        verify(beanInfo, times(1)).getPropertyDescriptors();
        assertNotNull(descriptors, "Property descriptors should not be null on first call");
        // Subsequent calls, should not fetch from beanInfo again, should return cached value
        descriptors = beanPropertyPointer.getPropertyDescriptors();
        verify(beanInfo, times(1)).getPropertyDescriptors(); // still one time only
        assertNotNull(descriptors, "Property descriptors should not be null on subsequent calls");
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetPropertyNames() throws Exception {
        when(mockBeanInfo.getPropertyDescriptors()).thenReturn(new PropertyDescriptor[]{mockPropertyDescriptor1, mockPropertyDescriptor2});
        when(mockPropertyDescriptor1.getName()).thenReturn("propertyOne");
        when(mockPropertyDescriptor2.getName()).thenReturn("propertyTwo");
        String[] propertyNames = beanPropertyPointer.getPropertyNames();
        assertNotNull(propertyNames, "Property names should not be null");
        assertEquals(2, propertyNames.length, "There should be two property names");
        assertEquals("propertyOne", propertyNames[0], "First property name should match");
        assertEquals("propertyTwo", propertyNames[1], "Second property name should match");
        // Verify that getPropertyDescriptors is called exactly once
        verify(mockBeanInfo, times(1)).getPropertyDescriptors();
        // Verify that getName is called on each PropertyDescriptor
        verify(mockPropertyDescriptor1, times(1)).getName();
        verify(mockPropertyDescriptor2, times(1)).getName();
    }
}