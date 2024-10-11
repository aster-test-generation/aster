/**
 * Generated by Aster
 */
package org.apache.commons.jxpath.ri.model.beans;
import org.apache.commons.jxpath.JXPathInvalidAccessException;
import org.apache.commons.jxpath.ri.QName;
import org.apache.commons.jxpath.ri.model.dom.DOMNodePointer;
import org.apache.commons.jxpath.ri.model.VariablePointer;
import static org.junit.jupiter.api.Assertions.*;
import java.util.Locale;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoSettings;
import org.mockito.quality.Strictness;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.jupiter.MockitoExtension;
import static org.mockito.Mockito.*;
import java.lang.reflect.Field;   
@ExtendWith(MockitoExtension.class)
@MockitoSettings(strictness = Strictness.LENIENT)
public class Aster_NullPropertyPointer_Test_Passing {
    private boolean byNameAttribute = false;
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetValueWithNullParent_ElQP0() {
        DOMNodePointer parent = null;
        NullPropertyPointer pointer = new NullPropertyPointer(parent);
        try {
            pointer.setValue("testValue");
            fail("Expected JXPathInvalidAccessException to be thrown");
        } catch (JXPathInvalidAccessException e) {
            assertEquals("Cannot set property /*, the target object is null", e.getMessage());
        }
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSetPropertyName_qUTQ0_MFdE0() {
    org.w3c.dom.Node node = null; // Assuming a mock or a real Node object
    Locale locale = Locale.getDefault();
    DOMNodePointer domNodePointer = new DOMNodePointer(node, locale);
    NullPropertyPointer nullPropertyPointer = new NullPropertyPointer(domNodePointer);
    String expectedPropertyName = "testProperty";
    nullPropertyPointer.setPropertyName(expectedPropertyName);
    assertEquals(expectedPropertyName, nullPropertyPointer.getPropertyName());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetName_YXoy0_vrSo0_1() {
    org.w3c.dom.Node node = org.mockito.Mockito.mock(org.w3c.dom.Node.class);
    Locale locale = Locale.getDefault();
    DOMNodePointer domNodePointer = new DOMNodePointer(node, locale);
    NullPropertyPointer nullPropertyPointer = new NullPropertyPointer(domNodePointer);
    QName expectedQName = new QName("*");
    QName actualQName = nullPropertyPointer.getName();
    assertEquals(expectedQName.getName(), actualQName.getName());}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetName_YXoy0_vrSo0_2() {
    org.w3c.dom.Node node = org.mockito.Mockito.mock(org.w3c.dom.Node.class);
    Locale locale = Locale.getDefault();
    DOMNodePointer domNodePointer = new DOMNodePointer(node, locale);
    NullPropertyPointer nullPropertyPointer = new NullPropertyPointer(domNodePointer);
    QName expectedQName = new QName("propertyName");
    QName actualQName = nullPropertyPointer.getName();
    assertEquals(expectedQName.getPrefix(), actualQName.getPrefix());}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetLength_uvQH0_uJYd0() {
    org.w3c.dom.Node node = org.mockito.Mockito.mock(org.w3c.dom.Node.class); // Mock Node object
    Locale locale = Locale.getDefault();
    DOMNodePointer domNodePointer = new DOMNodePointer(node, locale);
    NullPropertyPointer nullPropertyPointer = new NullPropertyPointer(domNodePointer);
    int length = nullPropertyPointer.getPropertyCount();
    assertEquals(0, length);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testAsPathByNameAttributeFalse_VoFu1_hcvb0() {
    org.w3c.dom.Node node = mock(org.w3c.dom.Node.class);
    Locale locale = Locale.US;
    DOMNodePointer domNodePointer = new DOMNodePointer(node, locale);
    NullPropertyPointer nullPropertyPointer = new NullPropertyPointer(domNodePointer);
    Field byNameAttributeField = null;
    try {
        byNameAttributeField = NullPropertyPointer.class.getDeclaredField("byNameAttribute");
        byNameAttributeField.setAccessible(true);
        byNameAttributeField.set(nullPropertyPointer, false);
    } catch (NoSuchFieldException | IllegalAccessException e) {
        e.printStackTrace();
    }
    NullPropertyPointer spyPointer = spy(nullPropertyPointer);
    doReturn("/parentPath").when(spyPointer).asPath();
    assertEquals("/parentPath", spyPointer.asPath());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetBaseValue_rIsa0_YKAY0() {
    org.w3c.dom.Node node = null; // Assuming a mock or a stub Node object
    Locale locale = Locale.getDefault();
    DOMNodePointer domNodePointer = new DOMNodePointer(node, locale);
    NullPropertyPointer nullPropertyPointer = new NullPropertyPointer(domNodePointer);
    Object result = nullPropertyPointer.getBaseValue();
    assertNull(result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testIsActual_irdN0_dllf0() {
    org.w3c.dom.Node node = null; // Assuming a mock or a stub Node object
    Locale locale = Locale.getDefault();
    DOMNodePointer domNodePointer = new DOMNodePointer(node, locale);
    NullPropertyPointer nullPropertyPointer = new NullPropertyPointer(domNodePointer);
    assertFalse(nullPropertyPointer.isActual());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSetPropertyIndex_uHQo0_VXXW0() {
    org.w3c.dom.Node node = org.mockito.Mockito.mock(org.w3c.dom.Node.class);
    Locale locale = Locale.US;
    DOMNodePointer domNodePointer = new DOMNodePointer(node, locale);
    NullPropertyPointer nullPropertyPointer = new NullPropertyPointer(domNodePointer);
    nullPropertyPointer.setPropertyIndex(5);
}
@BeforeEach
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void setUp_xHOE0() {
        MockitoAnnotations.openMocks(this);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsCollection_whenIndexIsWholeCollection_shouldReturnFalse_QdGW0() throws Exception {
        DOMNodePointer mockDOMNodePointer = mock(DOMNodePointer.class);
        VariablePointer mockVariablePointer = mock(VariablePointer.class);
        NullPropertyPointer nullPropertyPointer = new NullPropertyPointer(mockDOMNodePointer);
        final int WHOLE_COLLECTION = -1;
        when(mockVariablePointer.getIndex()).thenReturn(WHOLE_COLLECTION);
        boolean result = nullPropertyPointer.isCollection();
        assertFalse(result, "isCollection should return false when index is WHOLE_COLLECTION");
    }
@BeforeEach
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetPropertyCount_xvhK0() throws Exception {
        DOMNodePointer mockDOMNodePointer = mock(DOMNodePointer.class);
        NullPropertyPointer nullPropertyPointer = new NullPropertyPointer(mockDOMNodePointer);
        assertEquals(0, nullPropertyPointer.getPropertyCount());
    }
}