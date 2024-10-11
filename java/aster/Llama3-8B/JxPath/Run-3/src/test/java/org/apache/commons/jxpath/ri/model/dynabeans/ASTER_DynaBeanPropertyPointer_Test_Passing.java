/**
 * Generated by Aster
 */
package org.apache.commons.jxpath.ri.model.dynabeans;
import org.apache.commons.beanutils.DynaBean;
import org.apache.commons.beanutils.DynaClass;
import org.apache.commons.beanutils.DynaProperty;
import org.apache.commons.jxpath.servlet.KeywordVariables;
import org.apache.commons.jxpath.ri.model.dom.DOMNodePointer;
import org.apache.commons.jxpath.ri.model.VariablePointer;
import org.apache.commons.jxpath.ri.QName;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.mockito.Mockito.when;
import static org.mockito.Mockito.when;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoSettings;
import org.mockito.quality.Strictness;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;   
@ExtendWith(MockitoExtension.class)
@MockitoSettings(strictness = Strictness.LENIENT)
public class Aster_DynaBeanPropertyPointer_Test_Passing {
@Mock
    private DOMNodePointer parent;
@Mock
    private DynaBean dynaBean;
private DynaBeanPropertyPointer dynabeanpropertypointer;
@Mock
    private VariablePointer variablePointer;
@Mock
    private KeywordVariables keywordVariables;
@Mock
    private QName qName;
@Mock
    private DynaClass dynaClass;
@Mock
    private DynaProperty property;
private String name = "property_name";
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testisIndexedProperty_1() throws Exception {
        dynabeanpropertypointer = new DynaBeanPropertyPointer(null, dynaBean);
        when(dynaBean.getDynaClass()).thenReturn(dynaClass);
        when(dynaClass.getDynaProperty(name)).thenReturn(property);
        // Test when property is indexed
        when(property.isIndexed()).thenReturn(true);
        // Test when property is not indexed
        when(property.isIndexed()).thenReturn(false);
        assertTrue(dynabeanpropertypointer.isIndexedProperty());}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testisIndexedProperty_2() throws Exception {
        dynabeanpropertypointer = new DynaBeanPropertyPointer(null, dynaBean);
        when(dynaBean.getDynaClass()).thenReturn(dynaClass);
        when(dynaClass.getDynaProperty(name)).thenReturn(property);
        // Test when property is indexed
        when(property.isIndexed()).thenReturn(true);
        // Test when property is not indexed
        when(property.isIndexed()).thenReturn(false);
        assertFalse(dynabeanpropertypointer.isIndexedProperty());}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testgetBaseValue() throws Exception{
        dynabeanpropertypointer = new DynaBeanPropertyPointer(parent, dynaBean);
        // Arrange
        String propertyName = "propertyName";
        Object baseValue = "baseValue";
        when(dynaBean.get(propertyName)).thenReturn(baseValue);
        // Act
        Object result = dynabeanpropertypointer.getBaseValue();
        // Assert
        assertEquals(baseValue, result);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testisActualProperty_false() throws Exception {
        dynabeanpropertypointer = new DynaBeanPropertyPointer(null, dynaBean);
        // Arrange
        when(dynaBean.getDynaClass()).thenReturn(dynaClass);
        when(dynaClass.getDynaProperty("propertyName")).thenReturn(null);
        // Act
        boolean result = dynabeanpropertypointer.isActualProperty();
        // Assert
        assertFalse(result);
    }
}