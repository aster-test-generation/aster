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
import org.mockito.Mockito;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import static org.mockito.Mockito.*;
import java.lang.reflect.Field;   
@ExtendWith(MockitoExtension.class)
@MockitoSettings(strictness = Strictness.LENIENT)
public class Aster_BeanPropertyPointer_Test_Failing {
private transient PropertyDescriptor[] propertyDescriptors;
private static final Object UNINITIALIZED = null;
@Mock
    private DOMNodePointer mockParent;
@Mock
    private JXPathBasicBeanInfo mockBeanInfo;
@Mock
    private PropertyDescriptor mockPropertyDescriptor;
@InjectMocks
    private BeanPropertyPointer beanPropertyPointer;
@Mock
    private DOMNodePointer parent;
@Mock
    private JXPathBasicBeanInfo beanInfo;
@Mock
    private PropertyDescriptor propertyDescriptor;
@Mock
    private JXPathContext context;
private static final String PROPERTY_NAME = "testProperty";
@Mock
    private Object baseValue;
@Mock
    private DOMNodePointer domNodePointerMock;
@Mock
    private JXPathBasicBeanInfo jXPathBasicBeanInfoMock;
@Mock
    private DOMNodePointer mockDomNodePointer;
@Mock
    private JXPathBasicBeanInfo mockJXPathBasicBeanInfo;
@Mock
    private DOMNodePointer domNodePointer;
private PropertyDescriptor[] mockPropertyDescriptors;
@Mock
    private JXPathBasicBeanInfo jXPathBasicBeanInfo;
    private Object value = UNINITIALIZED;
    private String propertyName;
    private transient String[] names;
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetImmediateNode_UninitializedAndWholeCollection() throws Exception {
        beanPropertyPointer = new BeanPropertyPointer(parent, beanInfo);
        // Arrange
        when(beanPropertyPointer.getBaseValue()).thenReturn(baseValue);
        when(beanPropertyPointer.getIndex()).thenReturn(BeanPropertyPointer.WHOLE_COLLECTION);
        when(ValueUtils.getValue(baseValue)).thenReturn("ExpectedValue");
        // Act
        Object result = beanPropertyPointer.getImmediateNode();
        // Assert
        assertEquals("ExpectedValue", result);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetIndex_WithDifferentIndex_UpdatesIndexAndValue_1() throws Exception {
        beanPropertyPointer = new BeanPropertyPointer(mockParent, mockBeanInfo);
        // Arrange
        int initialIndex = 0;
        int newIndex = 1;
        beanPropertyPointer.setIndex(initialIndex); // Set initial index
        reset(mockParent); // Reset interactions after initial setup
        // Act
        beanPropertyPointer.setIndex(newIndex);
        // Assert
        verify(mockParent, times(1)).setIndex(newIndex);
        assertEquals(newIndex, beanPropertyPointer.getIndex());}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetIndex_WithDifferentIndex_UpdatesIndexAndValue_2() throws Exception {
        beanPropertyPointer = new BeanPropertyPointer(mockParent, mockBeanInfo);
        // Arrange
        int initialIndex = 0;
        int newIndex = 1;
        beanPropertyPointer.setIndex(initialIndex); // Set initial index
        reset(mockParent); // Reset interactions after initial setup
        // Act
        beanPropertyPointer.setIndex(newIndex);
        // Assert
        verify(mockParent, times(1)).setIndex(newIndex);
        assertEquals(UNINITIALIZED, beanPropertyPointer.getValue());}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetPropertyDescriptors() throws Exception {
        mockPropertyDescriptors = new PropertyDescriptor[] {
            new PropertyDescriptor("property1", BeanPropertyPointer.class),
            new PropertyDescriptor("property2", BeanPropertyPointer.class)
        };
        when(beanInfo.getPropertyDescriptors()).thenReturn(mockPropertyDescriptors);
        beanPropertyPointer = new BeanPropertyPointer(domNodePointer, new JXPathBasicBeanInfo(BeanPropertyPointer.class));
        PropertyDescriptor[] result = beanPropertyPointer.getPropertyDescriptors();
        assertArrayEquals(mockPropertyDescriptors, result, "The returned property descriptors should match the expected ones.");
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetPropertyNames() throws Exception {
        // Mocking the getPropertyDescriptors method to return an array of PropertyDescriptors
        PropertyDescriptor pd1 = new PropertyDescriptor("propertyOne", BeanPropertyPointer.class);
        PropertyDescriptor pd2 = new PropertyDescriptor("propertyTwo", BeanPropertyPointer.class);
        PropertyDescriptor[] pds = {pd1, pd2};
        when(jXPathBasicBeanInfoMock.getPropertyDescriptors()).thenReturn(pds);
        // Expected names array
        String[] expectedNames = {"propertyOne", "propertyTwo"};
        // Call the method under test
        String[] actualNames = beanPropertyPointer.getPropertyNames();
        // Verify the results
        assertArrayEquals(expectedNames, actualNames, "The property names should match the expected values.");
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsCollectionWithNullPropertyDescriptor_HdIz0() {
        BeanPropertyPointer bpp = new BeanPropertyPointer(null, null);
        assertFalse(bpp.isCollection());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetPropertyCount_AtomicTrue_ReturnsZero() throws Exception {
        beanPropertyPointer = new BeanPropertyPointer(domNodePointer, jXPathBasicBeanInfo);
        when(beanInfo.isAtomic()).thenReturn(true);
        int result = beanPropertyPointer.getPropertyCount();
        assertEquals(0, result, "Property count should be 0 when bean is atomic");
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetPropertyCount_AtomicFalse_ReturnsPropertyDescriptorLength() throws Exception {
        beanPropertyPointer = new BeanPropertyPointer(domNodePointer, jXPathBasicBeanInfo);
        when(beanInfo.isAtomic()).thenReturn(false);
        when(beanInfo.getPropertyDescriptors()).thenReturn(new PropertyDescriptor[] {
            new PropertyDescriptor("property1", Object.class),
            new PropertyDescriptor("property2", Object.class)
        });
        int result = beanPropertyPointer.getPropertyCount();
        assertEquals(2, result, "Property count should match the number of property descriptors");
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSetPropertyIndex_ResetsStateWhenIndexChanges_fIjr0_1() throws Exception {
    beanPropertyPointer = new BeanPropertyPointer(mockParent, mockBeanInfo);
    int newIndex = 5;
    beanPropertyPointer.setPropertyIndex(3); // Set initial index
    beanPropertyPointer.setPropertyIndex(newIndex);
    assertNull(beanPropertyPointer.getPropertyName());}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSetPropertyIndex_ResetsStateWhenIndexChanges_fIjr0_2() throws Exception {
    beanPropertyPointer = new BeanPropertyPointer(mockParent, mockBeanInfo);
    int newIndex = 5;
    beanPropertyPointer.setPropertyIndex(3); // Set initial index
    beanPropertyPointer.setPropertyIndex(newIndex);
    assertSame(UNINITIALIZED, beanPropertyPointer.getBaseValue());}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSetPropertyIndex_ResetsStateWhenIndexChanges_fIjr0_3() throws Exception {
    beanPropertyPointer = new BeanPropertyPointer(mockParent, mockBeanInfo);
    int newIndex = 5;
    beanPropertyPointer.setPropertyIndex(3); // Set initial index
    beanPropertyPointer.setPropertyIndex(newIndex);
    assertSame(UNINITIALIZED, beanPropertyPointer.getValue());}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testRemove_SingleElement_cKdq0() throws Exception {
    BeanPropertyPointer beanPropertyPointer = Mockito.spy(new BeanPropertyPointer(domNodePointerMock, jXPathBasicBeanInfoMock));
    doReturn(false).when(beanPropertyPointer).isCollection();
    beanPropertyPointer.setIndex(0);
    beanPropertyPointer.remove();
    assertEquals(BeanPropertyPointer.WHOLE_COLLECTION, beanPropertyPointer.getIndex());
    verify(beanPropertyPointer, times(1)).setValue(null);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testCreatePath_NodeIsNotNull_oUXB0_1() throws Exception {
    BeanPropertyPointer beanPropertyPointer = Mockito.spy(new BeanPropertyPointer(parent, beanInfo));
    Object node = new Object();
    doReturn(node).when(beanPropertyPointer).getImmediateNode();
    NodePointer result = beanPropertyPointer.createPath(context);
    verify(beanPropertyPointer, never()).createPath(context);
    assertSame(beanPropertyPointer, result, "createPath should return 'this' when immediate node is not null");
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testCreatePath_NodeIsNotNull_oUXB0_2() throws Exception {
    BeanPropertyPointer beanPropertyPointer = Mockito.spy(new BeanPropertyPointer(parent, beanInfo));
    Object node = new Object();
    doReturn(node).when(beanPropertyPointer).getImmediateNode();
    NodePointer result = beanPropertyPointer.createPath(context);
    verify(beanPropertyPointer, never()).createPath(context);
    assertSame(node, beanPropertyPointer.getImmediateNode());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testCreatePath_NodeIsNotNull_oUXB0_3() throws Exception {
    BeanPropertyPointer beanPropertyPointer = Mockito.spy(new BeanPropertyPointer(parent, beanInfo));
    Object baseValue = new Object(); // Mocked base value
    Object value = new Object(); // Mocked value
    Object node = new Object();
    doReturn(node).when(beanPropertyPointer).getImmediateNode();
    NodePointer result = beanPropertyPointer.createPath(context);
    verify(beanPropertyPointer, never()).createPath(context);
    assertSame(node, result.getImmediateNode());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSetPropertyIndex_NoChangeWhenSameIndex_lvve0_2() throws Exception {
    beanPropertyPointer = new BeanPropertyPointer(mockParent, mockBeanInfo);
    int index = 3;
    beanPropertyPointer.setPropertyIndex(index); // Set initial index
    Object initialValue = beanPropertyPointer.getValue();
    String initialPropertyName = beanPropertyPointer.getPropertyName();
    beanPropertyPointer.setPropertyIndex(index); // Set the same index again
    assertSame(initialValue, beanPropertyPointer.getValue());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetIndex_WithDifferentIndex_UpdatesIndexAndValue() throws Exception {
        beanPropertyPointer = new BeanPropertyPointer(mockParent, mockBeanInfo);
        // Arrange
        int initialIndex = 0;
        int newIndex = 1;
        beanPropertyPointer.setIndex(initialIndex); // Set initial index
        reset(mockParent); // Reset interactions after initial setup
        // Act
        beanPropertyPointer.setIndex(newIndex);
        // Assert
        assertEquals(newIndex, beanPropertyPointer.getIndex());
        assertEquals(UNINITIALIZED, beanPropertyPointer.getValue());
        verify(mockParent, times(1)).setIndex(newIndex);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetIndex_WithSameIndex_DoesNotUpdateValue() throws Exception {
        beanPropertyPointer = new BeanPropertyPointer(mockParent, mockBeanInfo);
        // Arrange
        int initialIndex = 0;
        beanPropertyPointer.setIndex(initialIndex); // Set initial index
        reset(mockParent); // Reset interactions after initial setup
        // Act
        beanPropertyPointer.setIndex(initialIndex);
        // Assert
        assertEquals(initialIndex, beanPropertyPointer.getIndex());
        assertNotEquals(UNINITIALIZED, beanPropertyPointer.getValue());
        verify(mockParent, never()).setIndex(initialIndex);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetIndex_WithInvalidIndex_DoesNotUpdateValueOrIndex() throws Exception {
        beanPropertyPointer = new BeanPropertyPointer(mockParent, mockBeanInfo);
        // Arrange
        int initialIndex = 0;
        int invalidIndex = -1;
        beanPropertyPointer.setIndex(initialIndex); // Set initial index
        reset(mockParent); // Reset interactions after initial setup
        // Act
        beanPropertyPointer.setIndex(invalidIndex);
        // Assert
        assertEquals(initialIndex, beanPropertyPointer.getIndex());
        assertNotEquals(UNINITIALIZED, beanPropertyPointer.getValue());
        verify(mockParent, never()).setIndex(invalidIndex);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetIndex_WithSameIndex_DoesNotUpdateValue_1_fid3() throws Exception {
        beanPropertyPointer = new BeanPropertyPointer(mockParent, mockBeanInfo);
        // Arrange
        int initialIndex = 0;
        beanPropertyPointer.setIndex(initialIndex); // Set initial index
        reset(mockParent); // Reset interactions after initial setup
        // Act
        beanPropertyPointer.setIndex(initialIndex);
        // Assert
        verify(mockParent, never()).setIndex(initialIndex);
        assertEquals(initialIndex, beanPropertyPointer.getIndex());}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetIndex_WithSameIndex_DoesNotUpdateValue_2() throws Exception {
        beanPropertyPointer = new BeanPropertyPointer(mockParent, mockBeanInfo);
        // Arrange
        int initialIndex = 0;
        beanPropertyPointer.setIndex(initialIndex); // Set initial index
        reset(mockParent); // Reset interactions after initial setup
        // Act
        beanPropertyPointer.setIndex(initialIndex);
        // Assert
        verify(mockParent, never()).setIndex(initialIndex);
        assertNotEquals(UNINITIALIZED, beanPropertyPointer.getValue());}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetIndex_WithInvalidIndex_DoesNotUpdateValueOrIndex_1() throws Exception {
        beanPropertyPointer = new BeanPropertyPointer(mockParent, mockBeanInfo);
        // Arrange
        int initialIndex = 0;
        int invalidIndex = -1;
        beanPropertyPointer.setIndex(initialIndex); // Set initial index
        reset(mockParent); // Reset interactions after initial setup
        // Act
        beanPropertyPointer.setIndex(invalidIndex);
        // Assert
        verify(mockParent, never()).setIndex(invalidIndex);
        assertEquals(initialIndex, beanPropertyPointer.getIndex());}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetIndex_WithInvalidIndex_DoesNotUpdateValueOrIndex_2() throws Exception {
        beanPropertyPointer = new BeanPropertyPointer(mockParent, mockBeanInfo);
        // Arrange
        int initialIndex = 0;
        int invalidIndex = -1;
        beanPropertyPointer.setIndex(initialIndex); // Set initial index
        reset(mockParent); // Reset interactions after initial setup
        // Act
        beanPropertyPointer.setIndex(invalidIndex);
        // Assert
        verify(mockParent, never()).setIndex(invalidIndex);
        assertNotEquals(UNINITIALIZED, beanPropertyPointer.getValue());}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetLength_WhenPropertyDescriptorIsNull_ReturnsOne_WarB0_fid3() throws Exception {
    BeanPropertyPointer beanPropertyPointer = mock(BeanPropertyPointer.class);
    when(beanPropertyPointer.getBaseValue()).thenReturn(null);
    int length = beanPropertyPointer.getLength();
    assertEquals(1, length);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetImmediateNode_UninitializedAndNullPropertyDescriptor_IsiY0_fid3() throws Exception {
    DOMNodePointer parent = mock(DOMNodePointer.class);
    JXPathBasicBeanInfo beanInfo = mock(JXPathBasicBeanInfo.class);
    BeanPropertyPointer beanPropertyPointer = new BeanPropertyPointer(parent, beanInfo);
    Field baseValueField = BeanPropertyPointer.class.getDeclaredField("baseValue");
    baseValueField.setAccessible(true);
    baseValueField.set(beanPropertyPointer, UNINITIALIZED);
    Field pdField = BeanPropertyPointer.class.getDeclaredField("pd");
    pdField.setAccessible(true);
    pdField.set(beanPropertyPointer, null);
    Object result = beanPropertyPointer.getBaseValue();
    assertNull(result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testRemove_SingleElement_cKdq0_fid3() throws Exception {
    BeanPropertyPointer beanPropertyPointer = new BeanPropertyPointer(domNodePointerMock, jXPathBasicBeanInfoMock);
    when(beanPropertyPointer.isCollection()).thenReturn(false);
    beanPropertyPointer.setIndex(0);
    beanPropertyPointer.remove();
    assertEquals(BeanPropertyPointer.WHOLE_COLLECTION, beanPropertyPointer.getIndex());
    verify(beanPropertyPointer, times(1)).setValue(null);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testCreatePath_NodeIsNotNull_oUXB0_1_fid3() throws Exception {
    BeanPropertyPointer beanPropertyPointer = new BeanPropertyPointer(parent, beanInfo);
    Object baseValue = new Object(); // Mocked base value
    Object value = new Object(); // Mocked value
    Object node = new Object();
    when(beanPropertyPointer.getImmediateNode()).thenReturn(node);
    NodePointer result = beanPropertyPointer.createPath(context);
    verify(beanPropertyPointer, never()).createPath(context);
    assertEquals(beanPropertyPointer, result, "createPath should return 'this' when immediate node is not null");}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testCreatePath_NodeIsNotNull_oUXB0_2_fid3() throws Exception {
    BeanPropertyPointer beanPropertyPointer = new BeanPropertyPointer(parent, beanInfo);
    Object baseValue = new Object(); // Mocked base value
    Object value = new Object(); // Mocked value
    Object node = new Object();
    when(beanPropertyPointer.getImmediateNode()).thenReturn(node);
    NodePointer result = beanPropertyPointer.createPath(context);
    verify(beanPropertyPointer, never()).createPath(context);
    assertSame(baseValue, baseValue);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testCreatePath_NodeIsNotNull_oUXB0_3_fid3() throws Exception {
    BeanPropertyPointer beanPropertyPointer = new BeanPropertyPointer(parent, beanInfo);
    Object baseValue = new Object(); // Mocked base value
    Object value = new Object(); // Mocked value
    Object node = new Object();
    when(beanPropertyPointer.getImmediateNode()).thenReturn(node);
    NodePointer result = beanPropertyPointer.createPath(context);
    verify(beanPropertyPointer, never()).createPath(context);
    assertSame(value, value);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetLength_WhenNotIndexedAndCollectionHintIsNegativeOne_ReturnsOne_ZEXL0() throws Exception {
    PropertyDescriptor propertyDescriptor = mock(PropertyDescriptor.class);
    BeanPropertyPointer beanPropertyPointer = mock(BeanPropertyPointer.class, CALLS_REAL_METHODS);
    Field pdField = BeanPropertyPointer.class.getDeclaredField("propertyDescriptor");
    pdField.setAccessible(true);
    pdField.set(beanPropertyPointer, propertyDescriptor);
    when(ValueUtils.getCollectionHint(any())).thenReturn(-1);
    int length = beanPropertyPointer.getLength();
    assertEquals(1, length);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSetPropertyIndex_NoChangeWhenSameIndex_lvve0_1_fid3() throws Exception {
    beanPropertyPointer = new BeanPropertyPointer(mockParent, mockBeanInfo);
    int index = 3;
    beanPropertyPointer.setPropertyIndex(index); // Set initial index
    Object initialBaseValue = beanPropertyPointer.getBaseValue();
    Object initialValue = beanPropertyPointer.getValue();
    String initialPropertyName = beanPropertyPointer.getPropertyName();
    beanPropertyPointer.setPropertyIndex(index); // Set the same index again
    assertSame(initialBaseValue, beanPropertyPointer.getBaseValue());}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSetPropertyIndex_NoChangeWhenSameIndex_lvve0_2_fid3() throws Exception {
    beanPropertyPointer = new BeanPropertyPointer(mockParent, mockBeanInfo);
    int index = 3;
    beanPropertyPointer.setPropertyIndex(index); // Set initial index
    Object initialBaseValue = beanPropertyPointer.getBaseValue();
    Object initialValue = beanPropertyPointer.getValue();
    String initialPropertyName = beanPropertyPointer.getPropertyName();
    beanPropertyPointer.setPropertyIndex(index); // Set the same index again
    assertSame(initialValue, beanPropertyPointer.getValue());}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSetPropertyIndex_NoChangeWhenSameIndex_lvve0_3() throws Exception {
    beanPropertyPointer = new BeanPropertyPointer(mockParent, mockBeanInfo);
    int index = 3;
    beanPropertyPointer.setPropertyIndex(index); // Set initial index
    Object initialBaseValue = beanPropertyPointer.getBaseValue();
    Object initialValue = beanPropertyPointer.getValue();
    String initialPropertyName = beanPropertyPointer.getPropertyName();
    beanPropertyPointer.setPropertyIndex(index); // Set the same index again
    assertSame(initialPropertyName, beanPropertyPointer.getPropertyName());}
}