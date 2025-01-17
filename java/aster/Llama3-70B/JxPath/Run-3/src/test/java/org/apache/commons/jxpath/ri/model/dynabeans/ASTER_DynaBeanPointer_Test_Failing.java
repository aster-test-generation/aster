/**
 * Generated by Aster
 */
package org.apache.commons.jxpath.ri.model.dynabeans;

import java.util.Locale;
import java.util.concurrent.TimeUnit;
import org.apache.commons.beanutils.DynaBean;
import org.apache.commons.jxpath.ri.QName;
import org.apache.commons.jxpath.ri.model.dom.DOMNodePointer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.mockito.junit.jupiter.MockitoSettings;
import org.mockito.quality.Strictness;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
@MockitoSettings(strictness = Strictness.LENIENT)
public class Aster_DynaBeanPointer_Test_Failing {
    private QName name;
    private DynaBean dynaBean;
    private DynaBeanPointer dynabeanpointer;
    private DynaBeanPointer other;
    @Mock
    QName qname;
    @Mock
    Locale locale;
    DOMNodePointer parent;

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testhashCode() throws Exception {
        name = mock(QName.class);
        dynabeanpointer = new DynaBeanPointer(mock(QName.class), mock(DynaBean.class), mock(Locale.class));
        // when name is not null
        when(name.hashCode()).thenReturn(123);
        assertEquals(123, dynabeanpointer.hashCode());
        // when name is null
        dynabeanpointer = new DynaBeanPointer(null, mock(DynaBean.class), mock(Locale.class));
        assertEquals(0, dynabeanpointer.hashCode());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testasPath() throws Exception {
        name = new QName("test");
        dynaBean = mock(DynaBean.class);
        locale = Locale.US;
        parent = mock(DOMNodePointer.class);
        dynabeanpointer = new DynaBeanPointer(parent, name, dynaBean);
        when(parent.asPath()).thenReturn("/parent");
        assertEquals("/parent", dynabeanpointer.asPath());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testhashCode_1() throws Exception {
        name = mock(QName.class);
        dynabeanpointer = new DynaBeanPointer(mock(QName.class), mock(DynaBean.class), mock(Locale.class));
        // when name is not null
        when(name.hashCode()).thenReturn(123);
        // when name is null
        dynabeanpointer = new DynaBeanPointer(null, mock(DynaBean.class), mock(Locale.class));
        assertEquals(123, dynabeanpointer.hashCode());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testhashCode_2() throws Exception {
        name = mock(QName.class);
        dynabeanpointer = new DynaBeanPointer(mock(QName.class), mock(DynaBean.class), mock(Locale.class));
        // when name is not null
        when(name.hashCode()).thenReturn(123);
        // when name is null
        dynabeanpointer = new DynaBeanPointer(null, mock(DynaBean.class), mock(Locale.class));
        assertEquals(0, dynabeanpointer.hashCode());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testasPath_fid2() throws Exception {
        name = new QName("test");
        dynaBean = mock(DynaBean.class);
        locale = Locale.US;
        parent = mock(DOMNodePointer.class);
        dynabeanpointer = new DynaBeanPointer(parent, name, dynaBean);
        when(parent.asPath()).thenReturn("/parent/test");
        assertEquals("/parent/test", dynabeanpointer.asPath());
    }
}