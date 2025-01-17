/**
 * Generated by Aster
 */
package org.apache.commons.jxpath.ri.model.beans;
import org.apache.commons.jxpath.JXPathInvalidAccessException;
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
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;   
@ExtendWith(MockitoExtension.class)
@MockitoSettings(strictness = Strictness.LENIENT)
public class Aster_NullPropertyPointer_Test_Passing {
@Mock
    private DOMNodePointer parent;
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testIsCollectionTrue_wgDs0() throws Exception {
    DOMNodePointer domNodePointer = mock(DOMNodePointer.class);
    NullPropertyPointer nullPropertyPointer = new NullPropertyPointer(domNodePointer);
    assertTrue(nullPropertyPointer.isCollection(), "isCollection should return true when index is not WHOLE_COLLECTION");
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testIsCollectionFalse_UHeq0() throws Exception {
    DOMNodePointer domNodePointer = mock(DOMNodePointer.class);
    NullPropertyPointer nullPropertyPointer = new NullPropertyPointer(domNodePointer);
    assertFalse(nullPropertyPointer.isCollection(), "isCollection should return false when index is WHOLE_COLLECTION");
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetPropertyNames_WlYr0() throws Exception {
    DOMNodePointer domNodePointer = new DOMNodePointer(null, Locale.getDefault()); // Corrected to use a valid Locale
    NullPropertyPointer nullPropertyPointer = new NullPropertyPointer(domNodePointer);
    String[] propertyNames = nullPropertyPointer.getPropertyNames();
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetPropertyCount_WgvB0() throws Exception {
    DOMNodePointer domNodePointer = mock(DOMNodePointer.class);
    NullPropertyPointer nullPropertyPointer = new NullPropertyPointer(domNodePointer);
    int count = nullPropertyPointer.getPropertyCount();
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testIsLeaf_ruea0() throws Exception {
    DOMNodePointer domNodePointerMock = mock(DOMNodePointer.class);
    NullPropertyPointer nullPropertyPointer = new NullPropertyPointer(domNodePointerMock);
    assertTrue(nullPropertyPointer.isLeaf(), "isLeaf should return true for NullPropertyPointer");
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSetValue_ThrowsException_WhenParentIsContainer_JADQ0_1() {
    DOMNodePointer parent = mock(DOMNodePointer.class);
    when(parent.isContainer()).thenReturn(false);
    PropertyPointer propertyPointer = mock(PropertyPointer.class);
    PropertyOwnerPointer propertyOwnerPointer = mock(PropertyOwnerPointer.class);
    when(propertyOwnerPointer.isDynamicPropertyDeclarationSupported()).thenReturn(true);
    when(propertyOwnerPointer.getPropertyPointer()).thenReturn(propertyPointer);
    when(parent.isContainer()).thenReturn(true);
    NullPropertyPointer nullPropertyPointer = new NullPropertyPointer(parent);
    Exception exception = assertThrows(RuntimeException.class, () -> nullPropertyPointer.setValue(new Object()));}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetName_Idlq0() throws Exception {
    DOMNodePointer mockedDomNodePointer = org.mockito.Mockito.mock(DOMNodePointer.class);
    NullPropertyPointer nullPropertyPointer = new NullPropertyPointer(mockedDomNodePointer);
    int propertyCount = nullPropertyPointer.getPropertyCount();
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetPropertyCount_sExd0() throws Exception {
    DOMNodePointer parent = mock(DOMNodePointer.class);
    NullPropertyPointer nullPropertyPointer = new NullPropertyPointer(parent);
    int result = nullPropertyPointer.getPropertyCount();
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testIsActual_sRiu0() throws Exception {
    DOMNodePointer parentNode = new DOMNodePointer(null, null, "someId");
    NullPropertyPointer nullPropertyPointer = new NullPropertyPointer(parentNode);
    assertFalse(nullPropertyPointer.isActual());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetPropertyCount_FGlW0() throws Exception {
    DOMNodePointer domNodePointer = new DOMNodePointer(null, null, "testId");
    NullPropertyPointer nullPropertyPointer = new NullPropertyPointer(domNodePointer);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSetValue_ThrowsException_WhenParentIsNull_EkWu0() {
    NullPropertyPointer pointer = new NullPropertyPointer(null);
    Exception exception = assertThrows(JXPathInvalidAccessException.class, () -> pointer.setValue(new Object()));
}
}