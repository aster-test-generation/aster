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
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoSettings;
import org.mockito.quality.Strictness;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;   
@ExtendWith(MockitoExtension.class)
@MockitoSettings(strictness = Strictness.LENIENT)
public class Aster_DynaBeanPointer_Test_Failing {
private QName name;
private DynaBean dynaBean;
private DynaBeanPointer dynabeanpointer;
@Mock
    private QName mockName;
@Mock
    private DynaBean mockDynaBean;
@Mock
    private Locale mockLocale;
@Mock
    private DynaBeanPointer mockDynaBeanPointer;
@Mock
    private DOMNodePointer mockDOMNodePointer;
@Mock
    private DOMNodePointer parent;
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testequals_2() throws Exception {
        name = new QName("testName");
        dynaBean = Mockito.mock(DynaBean.class);
        dynabeanpointer = new DynaBeanPointer(name, dynaBean, Locale.US);
        // Test equals with same object
        // Test equals with different object
        DynaBeanPointer other = new DynaBeanPointer(name, dynaBean, Locale.US);
        // Test equals with null object
        // Test equals with object of different class
        assertNotEquals(dynabeanpointer, other);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHashCode() throws Exception{
        name = mockName;
        dynabeanpointer = new DynaBeanPointer(name, mockDynaBean, mockLocale);
        // Arrange
        when(mockName.hashCode()).thenReturn(1);
        // Act
        int result = dynabeanpointer.hashCode();
        // Assert
        assertEquals(1, result);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetName() {
        dynabeanpointer = new DynaBeanPointer(name, dynaBean, Locale.US);
        // Arrange
        String expectedName = "expectedName";
        // Act
        QName actualName = dynabeanpointer.getName();
        // Assert
        assertEquals(expectedName, actualName.getName());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testasPath() {
        dynabeanpointer = new DynaBeanPointer(name, dynaBean, Locale.US);
        // Arrange
        when(parent.asPath()).thenReturn("/parent");
        // Act
        String result = dynabeanpointer.asPath();
        // Assert
        assertEquals("/parent", result);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testHashCodeNullName_TMFh0_MvTO0() {
    DynaBeanPointer dynaBeanPointer = new DynaBeanPointer(null, new QName(null, null), null);
    int result = dynaBeanPointer.hashCode();
    assertEquals(0, result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testequals() throws Exception {
        name = new QName("testName");
        dynaBean = Mockito.mock(DynaBean.class);
        dynabeanpointer = new DynaBeanPointer(name, dynaBean, Locale.US);
        // Test equals with same object
        assertEquals(dynabeanpointer, dynabeanpointer);
        // Test equals with different object
        DynaBeanPointer other = new DynaBeanPointer(name, dynaBean, Locale.US);
        assertNotEquals(dynabeanpointer, other);
        // Test equals with null object
        assertNotEquals(dynabeanpointer, null);
        // Test equals with object of different class
        assertNotEquals(dynabeanpointer, new Object());
    }
}