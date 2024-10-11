/**
 * Generated by Aster
 */
package org.apache.commons.jxpath.ri.model.dynabeans;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.apache.commons.beanutils.DynaBean;
import org.apache.commons.beanutils.DynaClass;
import org.apache.commons.beanutils.DynaProperty;
import org.apache.commons.jxpath.ri.QName;
import org.apache.commons.jxpath.ri.model.VariablePointer;
import org.apache.commons.jxpath.ri.model.dom.DOMNodePointer;
import org.apache.commons.jxpath.util.ValueUtils;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.jupiter.MockitoExtension;
import org.mockito.junit.jupiter.MockitoSettings;
import org.mockito.quality.Strictness;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
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
    private DynaClass dynaClass;
    @Mock
    private ValueUtils valueUtils;
    @Mock
    private QName nameQName;
    private static String CLASS = "class";
    @Mock
    private DynaBean dynaBeanMock;
    @Mock
    private DynaClass dynaClassMock;
    @Mock
    private DynaProperty[] dynaPropertiesMock;
    @Mock
    private QName qName;
    @Mock
    private DOMNodePointer domNodePointer;
    @Mock
    private VariablePointer variablePointer;
    private DynaBeanPropertyPointer dynaBeanPropertyPointer;
    @Mock
    private DynaBeanPropertyPointer spyDynaBeanPropertyPointer;

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testgetPropertyName() throws Exception {
        names = new String[]{"prop1", "prop2", "prop3"};
        name = null;
        dynabeanpropertypointer = Mockito.mock(DynaBeanPropertyPointer.class);
        Mockito.when(dynabeanpropertypointer.getPropertyNames()).thenReturn(names);
        Mockito.when(dynabeanpropertypointer.getPropertyIndex()).thenReturn(1);
        assertEquals("prop2", dynabeanpropertypointer.getPropertyName());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testgetPropertyNameNull() throws Exception {
        names = new String[]{"prop1", "prop2", "prop3"};
        name = null;
        dynabeanpropertypointer = Mockito.mock(DynaBeanPropertyPointer.class);
        Mockito.when(dynabeanpropertypointer.getPropertyNames()).thenReturn(names);
        Mockito.when(dynabeanpropertypointer.getPropertyIndex()).thenReturn(-1);
        assertEquals("*", dynabeanpropertypointer.getPropertyName());
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
    public void testGetPropertyNames() throws Exception {
        dynaBean = dynaBeanMock;
        dynaClassMock = mock(DynaClass.class);
        dynaPropertiesMock = new DynaProperty[1];
        dynaPropertiesMock[0] = mock(DynaProperty.class);
        when(dynaBeanMock.getDynaClass()).thenReturn(dynaClassMock);
        when(dynaClassMock.getDynaProperties()).thenReturn(dynaPropertiesMock);
        when(dynaPropertiesMock[0].getName()).thenReturn("property1");
        dynabeanpropertypointer = new DynaBeanPropertyPointer(null, dynaBean);
        String[] expected = {"property1"};
        String[] actual = dynabeanpropertypointer.getPropertyNames();
        assertArrayEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetBaseValue() throws Exception {
        dynaBeanPropertyPointer = new DynaBeanPropertyPointer(domNodePointer, dynaBean);
        // Arrange
        String propertyName = "propertyName";
        Object baseValue = "baseValue";
        when(dynaBean.get(propertyName)).thenReturn(baseValue);
        // Act
        Object result = dynaBeanPropertyPointer.getBaseValue();
        // Assert
        assertEquals(baseValue, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testgetImmediateNode_QeuW0_1() throws Exception {
        dynaBean = mock(DynaBean.class);
        name = "testName";
        dynabeanpropertypointer = new DynaBeanPropertyPointer(null, dynaBean);
        when(dynaBean.get(name)).thenReturn("testValue");
        when(dynaBean.get("*")).thenReturn("testValue");
        List<String> collection = new ArrayList<>();
        collection.add("testValue1");
        collection.add("testValue2");
        when(dynaBean.get(name)).thenReturn(collection);
        when(dynaBean.get(name)).thenReturn("testValue");
        when(dynaBean.get(name)).thenReturn("testValue");
        when(dynaBean.get(name)).thenReturn(collection);
        assertEquals("testValue", dynabeanpropertypointer.getImmediateNode());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testgetImmediateNode_QeuW0_3() throws Exception {
        dynaBean = mock(DynaBean.class);
        name = "testName";
        dynabeanpropertypointer = new DynaBeanPropertyPointer(null, dynaBean);
        when(dynaBean.get(name)).thenReturn("testValue");
        when(dynaBean.get("*")).thenReturn("testValue");
        List<String> collection = new ArrayList<>();
        collection.add("testValue1");
        collection.add("testValue2");
        when(dynaBean.get(name)).thenReturn(collection);
        when(dynaBean.get(name)).thenReturn("testValue");
        when(dynaBean.get(name)).thenReturn("testValue");
        when(dynaBean.get(name)).thenReturn(collection);
        assertEquals(collection, dynabeanpropertypointer.getImmediateNode());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testgetImmediateNode_QeuW0_5() throws Exception {
        dynaBean = mock(DynaBean.class);
        name = "testName";
        dynabeanpropertypointer = new DynaBeanPropertyPointer(null, dynaBean);
        when(dynaBean.get(name)).thenReturn("testValue");
        when(dynaBean.get("*")).thenReturn("testValue");
        List<String> collection = new ArrayList<>();
        collection.add("testValue1");
        collection.add("testValue2");
        when(dynaBean.get(name)).thenReturn(collection);
        when(dynaBean.get(name)).thenReturn("testValue");
        when(dynaBean.get(name)).thenReturn("testValue");
        when(dynaBean.get(name)).thenReturn(collection);
        assertEquals(1, dynabeanpropertypointer.getPropertyCount());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testgetImmediateNode_QeuW0_7() throws Exception {
        dynaBean = mock(DynaBean.class);
        name = "testName";
        dynabeanpropertypointer = new DynaBeanPropertyPointer(null, dynaBean);
        when(dynaBean.get(name)).thenReturn("testValue");
        when(dynaBean.get("*")).thenReturn("testValue");
        List<String> collection = new ArrayList<>();
        collection.add("testValue1");
        collection.add("testValue2");
        when(dynaBean.get(name)).thenReturn(collection);
        when(dynaBean.get(name)).thenReturn("testValue");
        when(dynaBean.get(name)).thenReturn("testValue");
        when(dynaBean.get(name)).thenReturn(collection);
        assertEquals(collection.size(), dynabeanpropertypointer.getPropertyCount());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testsetPropertyIndex_rpVC0() throws Exception {
        MockitoAnnotations.initMocks(this);
        dynaBean = mock(DynaBean.class);
        parent = mock(DOMNodePointer.class);
        spyDynaBeanPropertyPointer = spy(new DynaBeanPropertyPointer(parent, dynaBean));
        int index = 10;
        spyDynaBeanPropertyPointer.setPropertyIndex(index);
        Mockito.verify(spyDynaBeanPropertyPointer).setPropertyIndex(index);
    }
}