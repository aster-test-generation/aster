/**
 * Generated by Aster
 */
package org.apache.commons.jxpath.ri.model.dynabeans;

import java.util.Locale;
import java.util.concurrent.TimeUnit;
import org.apache.commons.beanutils.DynaBean;
import org.apache.commons.jxpath.ri.QName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import org.mockito.junit.jupiter.MockitoSettings;
import org.mockito.quality.Strictness;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
@MockitoSettings(strictness = Strictness.LENIENT)
public class Aster_DynaBeanPointer_Test_Failing {
    private QName name;
    private DynaBean dynaBean;
    private DynaBeanPointer parent;
    DynaBeanPointer dynabeanpointer;
    DynaBeanPointer otherDynabeanpointer;
    @Mock
    QName qname;
    @Mock
    Locale locale;

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEquals_DifferentParent_ReturnsFalse() throws Exception {
        name = new QName("test");
        dynaBean = mock(DynaBean.class);
        parent = new DynaBeanPointer(name, dynaBean, Locale.US);
        dynabeanpointer = new DynaBeanPointer(parent, name, dynaBean);
        otherDynabeanpointer = new DynaBeanPointer(parent, name, dynaBean);
        DynaBeanPointer differentParentDynabeanpointer = new DynaBeanPointer(new DynaBeanPointer(name, dynaBean, Locale.US), name, dynaBean);
        assertFalse(dynabeanpointer.equals(differentParentDynabeanpointer));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testgetImmediateNode_2() throws Exception {
        QName name = new QName("test");
        DynaBean dynaBeanMock = Mockito.mock(DynaBean.class);
        dynabeanpointer = new DynaBeanPointer(name, dynaBeanMock, Locale.US);
        Object result = dynabeanpointer.getImmediateNode();
        assertEquals(dynaBean, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testhashCode() throws Exception {
        name = mock(QName.class);
        dynabeanpointer = new DynaBeanPointer(name, mock(DynaBean.class), mock(Locale.class));
        // given
        when(name.hashCode()).thenReturn(123);
        // when
        int hashCode = dynabeanpointer.hashCode();
        // then
        assertEquals(123, hashCode);
        verify(name).hashCode();
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testgetImmediateNode() throws Exception {
        QName name = new QName("test");
        DynaBean dynaBeanMock = Mockito.mock(DynaBean.class);
        dynabeanpointer = new DynaBeanPointer(name, dynaBeanMock, Locale.US);
        Object result = dynabeanpointer.getImmediateNode();
        assertNotNull(result);
        assertEquals(dynaBean, result);
    }
}