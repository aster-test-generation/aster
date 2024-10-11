/**
 * Generated by Aster
 */
package org.apache.commons.jxpath.ri.model.beans;
import org.apache.commons.jxpath.JXPathContext;
import org.apache.commons.jxpath.JXPathInvalidAccessException;
import org.apache.commons.jxpath.ri.QName;
import org.apache.commons.jxpath.ri.model.NodePointer;
import org.apache.commons.jxpath.ri.model.dom.DOMNodePointer;
import org.apache.commons.jxpath.ri.model.VariablePointer;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.mockito.Mockito.when;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoSettings;
import org.mockito.quality.Strictness;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.jupiter.MockitoExtension;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;   
@ExtendWith(MockitoExtension.class)
@MockitoSettings(strictness = Strictness.LENIENT)
public class Aster_NullPropertyPointer_Test_Passing {
private String propertyName = "*";
@Mock
    private PropertyOwnerPointer propertyOwnerPointer;
@Mock
    private PropertyPointer propertyPointer;
@Mock
    private DOMNodePointer parent;
@Mock
    private QName qName;
@Mock
    private JXPathContext jXPathContext;
@Mock
    private NullPropertyPointer nullpropertypointer;
private boolean byNameAttribute = false;
@Mock
    private NodePointer nodePointer;
@Mock
    private DOMNodePointer immediateParentPointer;
@Mock
    private NullPropertyPointer nullPropertyPointer;
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSetValueNullParent_jzKg0() {
    NullPropertyPointer nullPropertyPointer = new NullPropertyPointer(null);
    try {
        nullPropertyPointer.setValue("test");
        fail("Expected JXPathInvalidAccessException");
    } catch (JXPathInvalidAccessException e) {
    }
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSetValueNonDynamicProperty_oSWs1() {
    QName qName = new QName("test");
    VariablePointer variablePointer = new VariablePointer(qName);
    NullPropertyPointer nullPropertyPointer = new NullPropertyPointer(variablePointer);
    try {
        nullPropertyPointer.setValue("test");
        fail("Expected JXPathInvalidAccessException");
    } catch (JXPathInvalidAccessException e) {
    }
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testgetPropertyName() throws Exception{
        nullpropertypointer = new NullPropertyPointer(null);
        // Act
        String result = nullpropertypointer.getPropertyName();
        // Assert
        assertEquals(propertyName, result);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testisCollection() throws Exception{
        nullpropertypointer = Mockito.mock(NullPropertyPointer.class);
        // Arrange
        Mockito.when(nullpropertypointer.getIndex()).thenReturn(0);
        // Act
        boolean result = nullpropertypointer.isCollection();
        // Assert
        Assertions.assertFalse(result);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetImmediateNode_cgws0_1() {
        DOMNodePointer parent = new DOMNodePointer(null, null, null);
        NullPropertyPointer nullPropertyPointer = new NullPropertyPointer(parent);
        Object immediateNode = nullPropertyPointer.getImmediateNode();
        assertEquals(null, immediateNode);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testsetPropertyName() {
        nullpropertypointer = new NullPropertyPointer(null);
        String newPropertyName = "newProperty";
        nullpropertypointer.setPropertyName(newPropertyName);
        assertEquals(newPropertyName, nullpropertypointer.getPropertyName());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testisContainer() {
        NullPropertyPointer nullpropertypointer = new NullPropertyPointer(parent);
        boolean result = nullpropertypointer.isContainer();
        Assertions.assertTrue(result);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsContainer_xmGF0() {
        NullPropertyPointer nullPropertyPointer = new NullPropertyPointer(new DOMNodePointer(null, null, null));
        boolean result = nullPropertyPointer.isContainer();
        assert result;
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetName() throws Exception {
        MockitoAnnotations.initMocks(this);
        nullpropertypointer = new NullPropertyPointer(parent);
        QName expected = new QName(propertyName);
        QName actual = nullpropertypointer.getName();
        assertEquals(expected, actual);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testasPath() throws Exception{
        when(immediateParentPointer.asPath()).thenReturn("parentPath");
        nullpropertypointer = new NullPropertyPointer(immediateParentPointer);
        String expectedPath = "parentPath/*";
        String actualPath = nullpropertypointer.asPath();
        assertEquals(expectedPath, actualPath);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testgetLength() throws Exception {
        MockitoAnnotations.initMocks(this);
        nullpropertypointer = new NullPropertyPointer(parent);
        int length = nullpropertypointer.getLength();
        assertEquals(0, length);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetLength_kItk0() {
        NullPropertyPointer nullPropertyPointer = new NullPropertyPointer(new DOMNodePointer(null, null, null));
        int length = nullPropertyPointer.getLength();
        assert length == 0;
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetPropertyNames() {
        nullpropertypointer = new NullPropertyPointer(parent);
        String[] expected = new String[0];
        String[] actual = nullpropertypointer.getPropertyNames();
        assertArrayEquals(expected, actual);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetPropertyNames_Shqy0() {
        NullPropertyPointer nullPropertyPointer = new NullPropertyPointer(new DOMNodePointer(null, null, null));
        String[] result = nullPropertyPointer.getPropertyNames();
        String[] expected = new String[0];
        assertArrayEquals(expected, result);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testgetBaseValue() throws Exception{
        nullpropertypointer = new NullPropertyPointer(parent);
        // Act and Assert
        assertEquals(null, nullpropertypointer.getBaseValue());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetBaseValue_Dowy0() {
        DOMNodePointer parent = new DOMNodePointer(null, null, null);
        NullPropertyPointer nullPropertyPointer = new NullPropertyPointer(parent);
        Object result = nullPropertyPointer.getBaseValue();
        assert result == null;
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testisActual() throws Exception {
        NullPropertyPointer nullpropertypointer = new NullPropertyPointer(parent);
        // Arrange
        boolean expected = false;
        // Act
        boolean actual = nullpropertypointer.isActual();
        // Assert
        assertEquals(expected, actual);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsActualProperty() {
        nullpropertypointer = new NullPropertyPointer(parent);
        // Arrange
        boolean expected = false;
        // Act
        boolean actual = nullpropertypointer.isActualProperty();
        // Assert
        assertEquals(expected, actual);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsActualProperty_dPRi0() {
        QName qName = new QName("prefix", "localName");
        VariablePointer variablePointer = new VariablePointer(qName);
        NullPropertyPointer nullPropertyPointer = new NullPropertyPointer(variablePointer);
        boolean result = nullPropertyPointer.isActualProperty();
        assert (!result);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetPropertyCount() {
        nullpropertypointer = new NullPropertyPointer(parent);
        int propertyCount = nullpropertypointer.getPropertyCount();
        assertEquals(0, propertyCount);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetPropertyCount_uLIN0() {
        NullPropertyPointer nullPropertyPointer = new NullPropertyPointer(new DOMNodePointer(null, null, null));
        int propertyCount = nullPropertyPointer.getPropertyCount();
        assert propertyCount == 0;
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetPropertyCount_IMQY0() throws Exception{
    MockitoAnnotations.initMocks(this);
    NullPropertyPointer nullpropertypointer = new NullPropertyPointer(Mockito.mock(DOMNodePointer.class));
    assertEquals(0, nullpropertypointer.getPropertyCount());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testCreatePath_BadFactoryException_YLHz2_GHUK0() {
    NullPropertyPointer nullPropertyPointer = new NullPropertyPointer(null);
    JXPathContext context = JXPathContext.newContext(null);
    try {
        int propertyCount = nullPropertyPointer.getPropertyCount();
        Assertions.assertEquals(0, propertyCount);
    } catch (Exception e) {
        Assertions.fail("Expected no exception");
    }
}
}