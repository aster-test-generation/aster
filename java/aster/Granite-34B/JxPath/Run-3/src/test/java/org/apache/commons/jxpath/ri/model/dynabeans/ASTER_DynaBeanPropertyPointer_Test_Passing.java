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
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import org.mockito.junit.jupiter.MockitoSettings;
import org.mockito.quality.Strictness;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
@MockitoSettings(strictness = Strictness.LENIENT)
public class Aster_DynaBeanPropertyPointer_Test_Passing {
    DynaBeanPropertyPointer dynabeanpropertypointer;
    DOMNodePointer parent;
    DynaBean dynaBean;
    Object value;
    int index;
    private String[] names;
    private String name;
    private static String CLASS = "class";
    private DynaBeanPropertyPointer pointer;

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testremove() throws Exception {
        dynaBean = mock(DynaBean.class);
        dynabeanpropertypointer = new DynaBeanPropertyPointer(null, dynaBean);
        dynabeanpropertypointer.remove();
        verify(dynaBean).set(anyString(), any());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testisActualProperty() throws Exception {
        dynaBean = mock(DynaBean.class);
        dynabeanpropertypointer = new DynaBeanPropertyPointer(null, dynaBean);
        DynaClass dynaclass = mock(DynaClass.class);
        when(dynaBean.getDynaClass()).thenReturn(dynaclass);
        String propertyName = "propertyName";
        when(dynaclass.getDynaProperty(propertyName)).thenReturn(new DynaProperty(propertyName));
        boolean actual = dynabeanpropertypointer.isActualProperty();
        assertTrue(actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testgetPropertyCount() throws Exception {
        dynabeanpropertypointer = new DynaBeanPropertyPointer(parent, dynaBean);
        Mockito.when(dynaBean.getDynaClass()).thenReturn(Mockito.mock(DynaClass.class));
        Mockito.when(dynaBean.getDynaClass().getDynaProperties()).thenReturn(new DynaProperty[1]);
        assertEquals(1, dynabeanpropertypointer.getPropertyCount());
    }
}