/**
 * Generated by Aster
 */
package org.apache.commons.jxpath.ri.model.dynabeans;

import java.util.concurrent.TimeUnit;
import org.apache.commons.beanutils.DynaBean;
import org.apache.commons.beanutils.DynaClass;
import org.apache.commons.beanutils.DynaProperty;
import org.apache.commons.jxpath.ri.model.dom.DOMNodePointer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
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
    private DOMNodePointer parent;
    @Mock
    private DynaBean dynaBean;
    private DynaBeanPropertyPointer dynabeanpropertypointer;
    private String[] names;
    private String name;
    private DynaProperty dynaProperty;
    private int index = 0;
    private static final String CLASS = "class";

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testisContainer() throws Exception {
        parent = mock(DOMNodePointer.class);
        dynaBean = mock(DynaBean.class);
        dynabeanpropertypointer = new DynaBeanPropertyPointer(parent, dynaBean);
        boolean result = dynabeanpropertypointer.isContainer();
        assertTrue(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testsetPropertyIndex_1() throws Exception {
        parent = mock(DOMNodePointer.class);
        dynaBean = mock(DynaBean.class);
        dynabeanpropertypointer = new DynaBeanPropertyPointer(parent, dynaBean);
        int newIndex = 5;
        dynabeanpropertypointer.setPropertyIndex(newIndex);
        assertEquals(newIndex, dynabeanpropertypointer.getPropertyIndex());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testsetPropertyIndex_2() throws Exception {
        parent = mock(DOMNodePointer.class);
        dynaBean = mock(DynaBean.class);
        dynabeanpropertypointer = new DynaBeanPropertyPointer(parent, dynaBean);
        int newIndex = 5;
        dynabeanpropertypointer.setPropertyIndex(newIndex);
        assertNull(name);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetPropertyCount_MUBv0() throws Exception {
        parent = mock(DOMNodePointer.class);
        dynaBean = mock(DynaBean.class);
        DynaClass dynaClass = mock(DynaClass.class);
        DynaProperty dynaProperty1 = mock(DynaProperty.class);
        DynaProperty dynaProperty2 = mock(DynaProperty.class);
        when(dynaBean.getDynaClass()).thenReturn(dynaClass);
        when(dynaClass.getDynaProperties()).thenReturn(new DynaProperty[]{dynaProperty1, dynaProperty2});
        when(dynaProperty1.getName()).thenReturn("property1");
        when(dynaProperty2.getName()).thenReturn("class");
        DynaBeanPropertyPointer dynabeanpropertypointer = new DynaBeanPropertyPointer(parent, dynaBean);
        int propertyCount = dynabeanpropertypointer.getPropertyCount();
        assertEquals(1, propertyCount);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetPropertyCount_BACz0() throws Exception {
        DynaBean dynaBean = mock(DynaBean.class);
        DynaClass dynaClass = mock(DynaClass.class);
        DOMNodePointer parent = mock(DOMNodePointer.class);
        DynaBeanPropertyPointer dynabeanpropertypointer = new DynaBeanPropertyPointer(parent, dynaBean);
        when(dynaBean.getDynaClass()).thenReturn(dynaClass);
        when(dynaClass.getDynaProperties()).thenReturn(new DynaProperty[0]);
        int result = dynabeanpropertypointer.getPropertyCount();
        assertEquals(0, result);
        verify(dynaBean).getDynaClass();
        verify(dynaClass).getDynaProperties();
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testsetPropertyIndex() throws Exception {
        parent = mock(DOMNodePointer.class);
        dynaBean = mock(DynaBean.class);
        dynabeanpropertypointer = new DynaBeanPropertyPointer(parent, dynaBean);
        int newIndex = 5;
        dynabeanpropertypointer.setPropertyIndex(newIndex);
        assertEquals(newIndex, dynabeanpropertypointer.getPropertyIndex());
        assertNull(name);
    }
}