/**
 * Generated by Aster
 */
package org.apache.commons.jxpath.ri.model.dynabeans;
import java.util.Locale;
import org.apache.commons.beanutils.DynaBean;
import org.apache.commons.jxpath.ri.QName;
import org.apache.commons.jxpath.ri.model.beans.PropertyPointer;
import org.apache.commons.jxpath.ri.model.dom.DOMNodePointer;
import static org.junit.jupiter.api.Assertions.*;
import java.util.Locale;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.mockito.Mockito.when;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoSettings;
import org.mockito.quality.Strictness;
import org.mockito.InjectMocks;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import static org.mockito.Mockito.when;   
@ExtendWith(MockitoExtension.class)
@MockitoSettings(strictness = Strictness.LENIENT)
public class Aster_DynaBeanPointer_Test_Passing {
@Mock
    private QName name;
@Mock
    private DynaBean dynaBean;
@Mock
    private DOMNodePointer parent;
@InjectMocks
    private DynaBeanPointer dynaBeanPointer;
private DynaBeanPointer anotherDynaBeanPointer;
private DynaBeanPointer identicalDynaBeanPointer;
@Mock
    private Locale locale;
@Mock
    private DOMNodePointer mockParent;
@Mock
    private QName mockName;
@Mock
    private DynaBean mockDynaBean;
private DynaBeanPointer dynaBeanPointerWithParent;
private DynaBeanPointer dynaBeanPointerWithoutParent;
DynaBeanPointer dynabeanpointer;
@Mock
    private QName qName;
@Mock
    private DOMNodePointer domNodePointer;
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsCollection() throws Exception {
        // Assuming that the DynaBeanPointer constructor is being used is the one with QName, DynaBean, and Locale
        dynaBeanPointer = new DynaBeanPointer(name, dynaBean, locale);
        // Since isCollection method returns a hardcoded false, we assert that it indeed returns false
        assertFalse(dynaBeanPointer.isCollection(), "isCollection should return false");
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsCollectionReturnsFalse_oZfd0() {
        QName name = new QName("testName");
        Locale locale = Locale.getDefault();
        DynaBeanPointer dynaBeanPointer = new DynaBeanPointer(name, dynaBean, locale);
        assertFalse(dynaBeanPointer.isCollection());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetImmediateNode() throws Exception {
        QName qName = new QName("testName");
        dynaBeanPointer = new DynaBeanPointer(qName, dynaBean, Locale.getDefault());
        Object result = dynaBeanPointer.getImmediateNode();
        assertEquals(dynaBean, result, "The returned object should be the same as the mocked DynaBean instance.");
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHashCode_WithNameNull() {
        dynaBeanPointer = new DynaBeanPointer(name, dynaBean, null);
        // Create a DynaBeanPointer with a null name to test null handling in hashCode
        DynaBeanPointer dynaBeanPointerWithNullName = new DynaBeanPointer(null, dynaBean, null);
        // Assert that the hashCode is zero when name is null
        assertEquals(0, dynaBeanPointerWithNullName.hashCode());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetName() throws Exception {
        when(name.getName()).thenReturn("expectedName");
        dynaBeanPointer = new DynaBeanPointer(name, dynaBean, locale);
        QName result = dynaBeanPointer.getName();
        assertEquals(name, result);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetPropertyPointer_1() throws Exception {
        name = new QName("testNamespace", "testName");
        dynaBeanPointer = new DynaBeanPointer(name, dynaBean, locale);
        PropertyPointer propertyPointer = dynaBeanPointer.getPropertyPointer();
        // Verify that the returned PropertyPointer is correctly initialized
        DynaBeanPropertyPointer dynaBeanPropertyPointer = (DynaBeanPropertyPointer) propertyPointer;
        assertNotNull(propertyPointer, "PropertyPointer should not be null");}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetPropertyPointer_2() throws Exception {
        name = new QName("testNamespace", "testName");
        dynaBeanPointer = new DynaBeanPointer(name, dynaBean, locale);
        PropertyPointer propertyPointer = dynaBeanPointer.getPropertyPointer();
        // Verify that the returned PropertyPointer is correctly initialized
        DynaBeanPropertyPointer dynaBeanPropertyPointer = (DynaBeanPropertyPointer) propertyPointer;
        assertTrue(propertyPointer instanceof DynaBeanPropertyPointer, "Should return an instance of DynaBeanPropertyPointer");}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetPropertyPointer_3() throws Exception {
        name = new QName("testNamespace", "testName");
        dynaBeanPointer = new DynaBeanPointer(name, dynaBean, locale);
        PropertyPointer propertyPointer = dynaBeanPointer.getPropertyPointer();
        // Verify that the returned PropertyPointer is correctly initialized
        DynaBeanPropertyPointer dynaBeanPropertyPointer = (DynaBeanPropertyPointer) propertyPointer;
        assertSame(dynaBean, dynaBeanPropertyPointer.getBean(), "The DynaBean in the PropertyPointer should be the same as the mocked DynaBean");}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAsPath_WithoutParent() throws Exception {
        // Setup DynaBeanPointer with a parent
        dynaBeanPointerWithParent = new DynaBeanPointer(mockParent, mockName, mockDynaBean);
        // Setup DynaBeanPointer without a parent (null parent)
        dynaBeanPointerWithoutParent = new DynaBeanPointer(null, mockName, mockDynaBean);
        // Mocking the behavior of asPath from parent to return a specific path
        when(mockParent.asPath()).thenReturn("/parentPath");
        // Test asPath when there is no parent
        String result = dynaBeanPointerWithoutParent.asPath();
        assertEquals("/", result, "The path should be root '/' when there is no parent.");
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsLeaf() {
        QName name = new QName("testName");
        DynaBean dynaBean = null; // Assuming DynaBean is an interface or class you can mock if needed.
        Locale locale = Locale.getDefault();
        dynaBeanPointer = new DynaBeanPointer(name, dynaBean, locale);
        assertFalse(dynaBeanPointer.isLeaf(), "DynaBeanPointer should not be a leaf");
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testEquals_SameObject_ReturnsTrue_reqB0() {
    QName name = new QName("same");
    DOMNodePointer parent = new DOMNodePointer(null, Locale.getDefault(), "id");
    DynaBeanPointer dynaBeanPointer = new DynaBeanPointer(parent, name, dynaBean);
    DynaBeanPointer identicalDynaBeanPointer = new DynaBeanPointer(parent, name, dynaBean);
    DOMNodePointer differentParent = new DOMNodePointer(null, Locale.getDefault());
    QName differentName = new QName("different");
    DynaBeanPointer anotherDynaBeanPointer = new DynaBeanPointer(differentParent, differentName, null);
    assertTrue(dynaBeanPointer.equals(identicalDynaBeanPointer), "Should return true when comparing the same object");
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testEquals_Null_ReturnsFalse_tDcX0() {
    QName name = new QName("someName");
    DOMNodePointer parent = new DOMNodePointer(null, Locale.getDefault(), "someId");
    DynaBeanPointer dynaBeanPointer = new DynaBeanPointer(parent, name, dynaBean);
    DynaBeanPointer identicalDynaBeanPointer = new DynaBeanPointer(parent, name, dynaBean);
    DynaBeanPointer anotherDynaBeanPointer = new DynaBeanPointer(new DOMNodePointer(null, Locale.getDefault()), new QName("different"), null);
    assertFalse(dynaBeanPointer.equals(null), "Should return false when comparing to null");
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testEquals_DifferentClass_ReturnsFalse_IaHy0() {
    QName name = new QName("same");
    DOMNodePointer parent = new DOMNodePointer(null, Locale.getDefault(), "id");
    DynaBeanPointer identicalDynaBeanPointer = new DynaBeanPointer(parent, name, dynaBean);
    DOMNodePointer anotherParent = new DOMNodePointer(null, Locale.getDefault());
    QName differentName = new QName("different");
    DynaBeanPointer anotherDynaBeanPointer = new DynaBeanPointer(anotherParent, differentName, null);
    assertFalse(identicalDynaBeanPointer.equals(new Object()), "Should return false when comparing to a different class");
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetPropertyPointer() throws Exception {
        name = new QName("testNamespace", "testName");
        dynaBeanPointer = new DynaBeanPointer(name, dynaBean, locale);
        PropertyPointer propertyPointer = dynaBeanPointer.getPropertyPointer();
        assertNotNull(propertyPointer, "PropertyPointer should not be null");
        assertTrue(propertyPointer instanceof DynaBeanPropertyPointer, "Should return an instance of DynaBeanPropertyPointer");
        // Verify that the returned PropertyPointer is correctly initialized
        DynaBeanPropertyPointer dynaBeanPropertyPointer = (DynaBeanPropertyPointer) propertyPointer;
        assertSame(dynaBean, dynaBeanPropertyPointer.getBean(), "The DynaBean in the PropertyPointer should be the same as the mocked DynaBean");
    }
}