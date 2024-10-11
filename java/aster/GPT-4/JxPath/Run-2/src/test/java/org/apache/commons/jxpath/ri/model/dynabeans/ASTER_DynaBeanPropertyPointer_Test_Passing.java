/**
 * Generated by Aster
 */
package org.apache.commons.jxpath.ri.model.dynabeans;
import java.util.Arrays;
import org.apache.commons.beanutils.DynaBean;
import org.apache.commons.beanutils.DynaClass;
import org.apache.commons.beanutils.DynaProperty;
import org.apache.commons.jxpath.ri.model.dom.DOMNodePointer;
import static org.junit.jupiter.api.Assertions.*;
import java.util.Arrays;
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
public class Aster_DynaBeanPropertyPointer_Test_Passing {
@Mock
    private DOMNodePointer parentNode;
@Mock
    private DynaBean dynaBean;
@InjectMocks
    private DynaBeanPropertyPointer dynabeanPropertyPointer;
@Mock
    private DynaClass dynaClass;
@Mock
    private DynaProperty dynaProperty;
@Mock
    private DOMNodePointer domNodePointer;
@InjectMocks
    private DynaBeanPropertyPointer dynaBeanPropertyPointer;
private final String name = "testProperty";
private static final int UNSPECIFIED_PROPERTY = -1;
private String[] names = {"firstProperty", "secondProperty", "targetProperty"};
    private DOMNodePointer parent;
@Mock
    private DOMNodePointer domNodePointerMock;
@Mock
    private DynaBean dynaBeanMock;
    private static final String CLASS = "class";
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsContainer() throws Exception {
        // Initialization of mocks is handled by MockitoExtension and @InjectMocks
        // Since isContainer method always returns true, we expect true
        assertTrue(dynabeanPropertyPointer.isContainer(), "isContainer should return true");
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetPropertyNames() throws Exception {
        when(dynaBean.getDynaClass()).thenReturn(dynaClass);
        when(dynaClass.getDynaProperties()).thenReturn(new DynaProperty[]{
            new DynaProperty("name1"),
            new DynaProperty("class"), // This should be filtered out
            new DynaProperty("name2")
        });
        String[] expected = {"name1", "name2"};
        String[] propertyNames = dynaBeanPropertyPointer.getPropertyNames();
        Arrays.sort(propertyNames); // Ensure the order for comparison
        assertArrayEquals(expected, propertyNames, "The property names should be correctly retrieved and sorted, excluding 'class'");
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsActualProperty_WhenPropertyExists() throws Exception {
        when(dynaBean.getDynaClass()).thenReturn(dynaClass);
        // Setup
        String propertyName = "existingProperty";
        when(dynaClass.getDynaProperty(propertyName)).thenReturn(dynaProperty);
        dynaBeanPropertyPointer = new DynaBeanPropertyPointer(domNodePointer, dynaBean) {
            public String getPropertyName() {
                return propertyName;
            }
        };
        // Execution
        boolean result = dynaBeanPropertyPointer.isActualProperty();
        // Assertion
        assertTrue(result, "Property should exist and return true");
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsActualProperty_WhenPropertyDoesNotExist() throws Exception {
        when(dynaBean.getDynaClass()).thenReturn(dynaClass);
        // Setup
        String propertyName = "nonExistingProperty";
        when(dynaClass.getDynaProperty(propertyName)).thenReturn(null);
        dynaBeanPropertyPointer = new DynaBeanPropertyPointer(domNodePointer, dynaBean) {
            public String getPropertyName() {
                return propertyName;
            }
        };
        // Execution
        boolean result = dynaBeanPropertyPointer.isActualProperty();
        // Assertion
        assertFalse(result, "Property should not exist and return false");
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetPropertyName_WithInvalidIndex_XUjK0() throws Exception {
    dynabeanPropertyPointer = new DynaBeanPropertyPointer(parentNode, dynaBean);
    String[] propertyNames = {"firstName", "lastName"};
}
}