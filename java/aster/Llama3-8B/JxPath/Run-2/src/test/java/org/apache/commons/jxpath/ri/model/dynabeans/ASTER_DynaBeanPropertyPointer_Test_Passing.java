/**
 * Generated by Aster
 */
package org.apache.commons.jxpath.ri.model.dynabeans;
import org.apache.commons.beanutils.DynaBean;
import org.apache.commons.beanutils.DynaClass;
import org.apache.commons.beanutils.DynaProperty;
import org.apache.commons.jxpath.util.ValueUtils;
import org.apache.commons.jxpath.ri.model.dom.DOMNodePointer;
import org.apache.commons.jxpath.ri.model.VariablePointer;
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
public class Aster_DynaBeanPropertyPointer_Test_Passing {
@Mock
    private DynaBean dynaBean;
@Mock
    private DOMNodePointer parent;
private String[] names;
private String name;
private DynaBeanPropertyPointer dynabeanpropertypointer;
@Mock
    private DynaBean dynaBeanMock;
@Mock
    private DynaClass dynaClassMock;
@Mock
    private DynaProperty dynaPropertyMock;
@Mock
    private QName nameQName;
@Mock
    private ValueUtils valueUtils;
private static String CLASS = "class";
@Mock
    private DynaProperty[] dynaPropertiesMock;
@Mock
    private DynaClass dynaClass;
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testgetPropertyName_1() throws Exception{
        names = new String[]{"prop1", "prop2", "prop3"};
        name = null;
        dynabeanpropertypointer = Mockito.mock(DynaBeanPropertyPointer.class);
        Mockito.when(dynabeanpropertypointer.getPropertyNames()).thenReturn(names);
        Mockito.when(dynabeanpropertypointer.getPropertyIndex()).thenReturn(1);
        Mockito.when(dynabeanpropertypointer.getPropertyIndex()).thenReturn(-1);
        assertEquals("prop2", dynabeanpropertypointer.getPropertyName());}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testgetPropertyName_2() throws Exception{
        names = new String[]{"prop1", "prop2", "prop3"};
        name = null;
        dynabeanpropertypointer = Mockito.mock(DynaBeanPropertyPointer.class);
        Mockito.when(dynabeanpropertypointer.getPropertyNames()).thenReturn(names);
        Mockito.when(dynabeanpropertypointer.getPropertyIndex()).thenReturn(1);
        Mockito.when(dynabeanpropertypointer.getPropertyIndex()).thenReturn(-1);
        assertEquals("*", dynabeanpropertypointer.getPropertyName());}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testisIndexedProperty_true() throws Exception{
        dynaBean = dynaBeanMock;
        name = "testName";
        dynabeanpropertypointer = new DynaBeanPropertyPointer(null, dynaBean);
        // Given
        when(dynaBeanMock.getDynaClass()).thenReturn(dynaClassMock);
        when(dynaClassMock.getDynaProperty(name)).thenReturn(dynaPropertyMock);
        when(dynaPropertyMock.isIndexed()).thenReturn(true);
        // When
        boolean result = dynabeanpropertypointer.isIndexedProperty();
        // Then
        assertTrue(result);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testisIndexedProperty_false() throws Exception{
        dynaBean = dynaBeanMock;
        name = "testName";
        dynabeanpropertypointer = new DynaBeanPropertyPointer(null, dynaBean);
        // Given
        when(dynaBeanMock.getDynaClass()).thenReturn(dynaClassMock);
        when(dynaClassMock.getDynaProperty(name)).thenReturn(dynaPropertyMock);
        when(dynaPropertyMock.isIndexed()).thenReturn(false);
        // When
        boolean result = dynabeanpropertypointer.isIndexedProperty();
        // Then
        assertFalse(result);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetPropertyName_inDv0() {
        QName qName = new QName("prefix", "localName");
        VariablePointer variablePointer = new VariablePointer(qName);
        DOMNodePointer dOMNodePointer = new DOMNodePointer(variablePointer, null);
        DynaBeanPropertyPointer dynaBeanPropertyPointer = new DynaBeanPropertyPointer(dOMNodePointer, null);
        dynaBeanPropertyPointer.setPropertyName("propertyName");
        assert dynaBeanPropertyPointer.getPropertyName().equals("propertyName");
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testgetImmediateNode() throws Exception{
        name = "testName";
        dynabeanpropertypointer = new DynaBeanPropertyPointer(null, dynaBean);
        // Mock the dynaBean to return a specific value
        when(dynaBean.get(name)).thenReturn("testValue");
        // Mock the ValueUtils to return a specific value
        when(valueUtils.getValue("testValue")).thenReturn("testValue");
        // Call the getImmediateNode method
        Object result = dynabeanpropertypointer.getImmediateNode();
        // Assert the result
        assertEquals("testValue", result);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testisContainer() {
        dynabeanpropertypointer = new DynaBeanPropertyPointer(parent, dynaBean);
        // Arrange
        when(parent.isContainer()).thenReturn(true);
        // Act
        boolean result = dynabeanpropertypointer.isContainer();
        // Assert
        assertTrue(result);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetPropertyNames_UYFd0() throws Exception {
    names = new String[0];
    dynaBean = dynaBeanMock;
    dynaClassMock.getDynaProperties();
    dynaPropertiesMock = new DynaProperty[0];
    DynaProperty dynaProperty1 = mock(DynaProperty.class);
    DynaProperty dynaProperty2 = mock(DynaProperty.class);
    DynaProperty[] dynaProperties = new DynaProperty[]{dynaProperty1, dynaProperty2};
    when(dynaClassMock.getDynaProperties()).thenReturn(dynaProperties);
    String[] result = dynabeanpropertypointer.getPropertyNames();
    assertEquals(2, result.length);
    verify(dynaClassMock, times(1)).getDynaProperties();
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testgetBaseValue_TvTU0() throws Exception{
    DynaBean dynaBean = mock(DynaBean.class);
    DOMNodePointer parent = mock(DOMNodePointer.class);
    QName name = new QName("prefix", "localName");
    DynaBeanPropertyPointer dynabeanpropertypointer = new DynaBeanPropertyPointer(parent, dynaBean);
    String propertyName = "propertyName";
    Object baseValue = "baseValue";
    when(dynaBean.get(propertyName)).thenReturn(baseValue);
    Object result = dynabeanpropertypointer.getBaseValue();
    assertEquals(baseValue, result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testsetPropertyIndex_MvDv0() throws Exception{
    dynabeanpropertypointer = new DynaBeanPropertyPointer(parent, dynaBean);
    int index = 1;
    dynabeanpropertypointer.setPropertyIndex(index);
    assertEquals(index, dynabeanpropertypointer.getPropertyIndex());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testisActualProperty_JrqA0() throws Exception{
    when(dynaBean.getDynaClass()).thenReturn(dynaClass);
    String propertyName = "propertyName";
    DynaProperty dynaProperty = new DynaProperty(propertyName, null);
    when(dynaClass.getDynaProperty(propertyName)).thenReturn(dynaProperty);
    boolean result = dynabeanpropertypointer.isActualProperty();
    assertTrue(result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testgetPropertyName() throws Exception{
        names = new String[]{"prop1", "prop2", "prop3"};
        name = null;
        dynabeanpropertypointer = Mockito.mock(DynaBeanPropertyPointer.class);
        Mockito.when(dynabeanpropertypointer.getPropertyNames()).thenReturn(names);
        Mockito.when(dynabeanpropertypointer.getPropertyIndex()).thenReturn(1);
        assertEquals("prop2", dynabeanpropertypointer.getPropertyName());
        Mockito.when(dynabeanpropertypointer.getPropertyIndex()).thenReturn(-1);
        assertEquals("*", dynabeanpropertypointer.getPropertyName());
    }
}