/**
 * Generated by Aster
 */
package org.apache.commons.jxpath.ri.model.dynabeans;
import java.util.Locale;
import org.apache.commons.beanutils.DynaBean;
import org.apache.commons.jxpath.ri.QName;
import org.apache.commons.jxpath.ri.model.dom.DOMNodePointer;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import java.util.Locale;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.mockito.Mockito.when;
import static org.mockito.Mockito.mock;
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
@ExtendWith(MockitoExtension.class)
@MockitoSettings(strictness = Strictness.LENIENT)
public class Aster_DynaBeanPointer_Test_Passing {
@Mock
    private QName name;
@Mock
    private DynaBean dynaBean;
@Mock
    private DOMNodePointer parent;
private DynaBeanPointer dynabeanpointer;
@Mock
    private Locale locale;
@Mock
    private DOMNodePointer domNodePointer;
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testequals_1() throws Exception {
        MockitoAnnotations.initMocks(this);
        dynabeanpointer = new DynaBeanPointer(parent, name, dynaBean);
        // Test equals with same object
        // Test equals with different object
        DynaBeanPointer other = new DynaBeanPointer(parent, name, dynaBean);
        // Test equals with null object
        // Test equals with object of different class
        // Test equals with object of same class but different properties
        DynaBeanPointer other2 = new DynaBeanPointer(parent, Mockito.mock(QName.class), Mockito.mock(DynaBean.class));
        assertEquals(dynabeanpointer, dynabeanpointer);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testequals_2() throws Exception {
        MockitoAnnotations.initMocks(this);
        dynabeanpointer = new DynaBeanPointer(parent, name, dynaBean);
        // Test equals with same object
        // Test equals with different object
        DynaBeanPointer other = new DynaBeanPointer(parent, name, dynaBean);
        // Test equals with null object
        // Test equals with object of different class
        // Test equals with object of same class but different properties
        DynaBeanPointer other2 = new DynaBeanPointer(parent, Mockito.mock(QName.class), Mockito.mock(DynaBean.class));
        assertNotEquals(dynabeanpointer, other);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testequals_3() throws Exception {
        MockitoAnnotations.initMocks(this);
        dynabeanpointer = new DynaBeanPointer(parent, name, dynaBean);
        // Test equals with same object
        // Test equals with different object
        DynaBeanPointer other = new DynaBeanPointer(parent, name, dynaBean);
        // Test equals with null object
        // Test equals with object of different class
        // Test equals with object of same class but different properties
        DynaBeanPointer other2 = new DynaBeanPointer(parent, Mockito.mock(QName.class), Mockito.mock(DynaBean.class));
        assertNotEquals(dynabeanpointer, null);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testequals_4() throws Exception {
        MockitoAnnotations.initMocks(this);
        dynabeanpointer = new DynaBeanPointer(parent, name, dynaBean);
        // Test equals with same object
        // Test equals with different object
        DynaBeanPointer other = new DynaBeanPointer(parent, name, dynaBean);
        // Test equals with null object
        // Test equals with object of different class
        // Test equals with object of same class but different properties
        DynaBeanPointer other2 = new DynaBeanPointer(parent, Mockito.mock(QName.class), Mockito.mock(DynaBean.class));
        assertNotEquals(dynabeanpointer, new Object());}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testequals_5() throws Exception {
        MockitoAnnotations.initMocks(this);
        dynabeanpointer = new DynaBeanPointer(parent, name, dynaBean);
        // Test equals with same object
        // Test equals with different object
        DynaBeanPointer other = new DynaBeanPointer(parent, name, dynaBean);
        // Test equals with null object
        // Test equals with object of different class
        // Test equals with object of same class but different properties
        DynaBeanPointer other2 = new DynaBeanPointer(parent, Mockito.mock(QName.class), Mockito.mock(DynaBean.class));
        assertNotEquals(dynabeanpointer, other2);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testisCollection() throws Exception {
        dynabeanpointer = new DynaBeanPointer(name, dynaBean, locale);
        // Arrange
        boolean expected = false;
        // Act
        boolean actual = dynabeanpointer.isCollection();
        // Assert
        assertEquals(expected, actual);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testgetImmediateNode() throws Exception {
        dynabeanpointer = new DynaBeanPointer(new QName("name"), dynaBean, Locale.US);
        // Act
        Object immediateNode = dynabeanpointer.getImmediateNode();
        // Assert
        assertEquals(dynaBean, immediateNode);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHashCode() throws Exception {
        dynabeanpointer = new DynaBeanPointer(name, dynaBean, locale);
        // Arrange
        when(name.hashCode()).thenReturn(1);
        // Act
        int result = dynabeanpointer.hashCode();
        // Assert
        assertEquals(1, result);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetName() throws Exception{
        dynabeanpointer = new DynaBeanPointer(name, null, null);
        // Arrange
        String expectedName = "expectedName";
        // Act
        QName actualName = dynabeanpointer.getName();
        // Assert
        assertEquals(expectedName, actualName.getName());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testgetLength() throws Exception {
        dynabeanpointer = new DynaBeanPointer(name, dynaBean, locale);
        // Arrange
        int expectedLength = 1;
        // Act
        int actualLength = dynabeanpointer.getLength();
        // Assert
        assertEquals(expectedLength, actualLength);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testgetBaseValue() throws Exception {
        dynabeanpointer = new DynaBeanPointer(new QName("test"), dynaBean, Locale.US);
        // Arrange
        Object expected = "test";
        // Act
        Object actual = dynabeanpointer.getBaseValue();
        // Assert
        assertEquals(expected, actual);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testisLeaf() throws Exception {
        dynabeanpointer = new DynaBeanPointer(name, dynaBean, locale);
        // Arrange
        boolean expected = false;
        // Act
        boolean actual = dynabeanpointer.isLeaf();
        // Assert
        assertEquals(expected, actual);
    }
}