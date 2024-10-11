/**
 * Generated by Aster
 */
package org.apache.commons.jxpath.ri.model.dynabeans;
import java.util.Locale;
import org.apache.commons.beanutils.DynaBean;
import org.apache.commons.jxpath.ri.QName;
import org.apache.commons.jxpath.ri.model.dom.DOMNodePointer;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import java.util.Locale;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoSettings;
import org.mockito.quality.Strictness;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import static org.mockito.Mockito.*;   
@ExtendWith(MockitoExtension.class)
@MockitoSettings(strictness = Strictness.LENIENT)
public class Aster_DynaBeanPointer_Test_Failing {
@Mock
    private QName name;
@Mock
    private DynaBean dynaBean;
@Mock
    private DOMNodePointer parent;
private DynaBeanPointer dynaBeanPointer;
@Mock
    private DOMNodePointer domNodePointer;
@Mock
    private QName qName;
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
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetImmediateNode() throws Exception {
        dynaBeanPointer = new DynaBeanPointer(domNodePointer, qName, dynaBean);
        when(dynaBeanPointer.getImmediateNode()).thenReturn(dynaBean);
        Object result = dynaBeanPointer.getImmediateNode();
        assertEquals(dynaBean, result, "The returned object should be the same as the mocked DynaBean instance.");
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHashCode_WithName() throws Exception {
        when(name.hashCode()).thenReturn(123);
        int expectedHashCode = 123;
        int actualHashCode = dynaBeanPointer.hashCode();
        assertEquals(expectedHashCode, actualHashCode, "Hash code should match the mocked hash code of QName");
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHashCode_WithNullName() throws Exception {
        when(name.hashCode()).thenReturn(123);
        DynaBeanPointer dynaBeanPointerWithNullName = new DynaBeanPointer(null, dynaBean, locale);
        int expectedHashCode = 0;
        int actualHashCode = dynaBeanPointerWithNullName.hashCode();
        assertEquals(expectedHashCode, actualHashCode, "Hash code should be zero when name is null");
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetName_1() throws Exception {
        // Initialize DynaBeanPointer with mocks
        dynaBeanPointer = new DynaBeanPointer(parent, name, dynaBean);
        // Setup the behavior of the mock
        when(name.getName()).thenReturn("ExpectedName");
        // Execute the method to be tested
        QName result = dynaBeanPointer.getName();
        // Verify the result
        // Verify interactions
        verify(name, times(1)).getName();
        assertNotNull(result, "The result should not be null.");}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetName_2() throws Exception {
        // Initialize DynaBeanPointer with mocks
        dynaBeanPointer = new DynaBeanPointer(parent, name, dynaBean);
        // Setup the behavior of the mock
        when(name.getName()).thenReturn("ExpectedName");
        // Execute the method to be tested
        QName result = dynaBeanPointer.getName();
        // Verify the result
        // Verify interactions
        verify(name, times(1)).getName();
        assertEquals("ExpectedName", result.getName(), "The name should match the expected value.");}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAsPath_WithParent() throws Exception {
        // Create a DynaBeanPointer with a parent
        dynaBeanPointerWithParent = new DynaBeanPointer(mockParent, mockName, mockDynaBean);
        // Create a DynaBeanPointer without a parent (null parent)
        dynaBeanPointerWithoutParent = new DynaBeanPointer(null, mockName, mockDynaBean);
        // Mocking the behavior of asPath from the parent to return a specific path
        when(mockParent.asPath()).thenReturn("/parentPath/mockName");
        // Test asPath when there is a parent
        String result = dynaBeanPointerWithParent.asPath();
        assertEquals("/parentPath/mockName", result, "The path should match the mocked parent path");
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetBaseValue() {
        dynaBeanPointer = new DynaBeanPointer(domNodePointer, qName, dynaBean);
        when(dynaBeanPointer.getBaseValue()).thenReturn(dynaBean);
        Object result = dynaBeanPointer.getBaseValue();
        assertEquals(dynaBean, result, "The returned object should be the same as the mocked DynaBean instance.");
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAsPath_WithParent_fid1() throws Exception {
        // Create a DynaBeanPointer with a parent
        dynaBeanPointerWithParent = new DynaBeanPointer(mockParent, mockName, mockDynaBean);
        // Create a DynaBeanPointer without a parent (null parent)
        dynaBeanPointerWithoutParent = new DynaBeanPointer(null, mockName, mockDynaBean);
        // Mocking the behavior of asPath from the parent to return a specific path
        when(mockParent.asPath()).thenReturn("/parentPath");
        // Test asPath when there is a parent
        String result = dynaBeanPointerWithParent.asPath();
        assertEquals("/parentPath", result, "The path should match the mocked parent path");
    }
}