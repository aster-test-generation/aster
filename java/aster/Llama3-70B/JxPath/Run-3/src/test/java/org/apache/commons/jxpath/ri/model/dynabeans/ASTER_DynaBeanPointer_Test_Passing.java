/**
 * Generated by Aster
 */
package org.apache.commons.jxpath.ri.model.dynabeans;

import java.util.Locale;
import java.util.concurrent.TimeUnit;
import org.apache.commons.beanutils.DynaBean;
import org.apache.commons.jxpath.ri.QName;
import org.apache.commons.jxpath.ri.model.beans.PropertyPointer;
import org.apache.commons.jxpath.ri.model.dom.DOMNodePointer;
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
public class Aster_DynaBeanPointer_Test_Passing {
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
    public void testEquals_SameObject_ReturnsTrue() throws Exception {
        name = mock(QName.class);
        dynaBean = mock(DynaBean.class);
        dynabeanpointer = new DynaBeanPointer(name, dynaBean, Locale.US);
        other = new DynaBeanPointer(name, dynaBean, Locale.US);
        assertTrue(dynabeanpointer.equals(dynabeanpointer));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEquals_SameProperties_ReturnsTrue() throws Exception {
        name = mock(QName.class);
        dynaBean = mock(DynaBean.class);
        dynabeanpointer = new DynaBeanPointer(name, dynaBean, Locale.US);
        other = new DynaBeanPointer(name, dynaBean, Locale.US);
        assertTrue(dynabeanpointer.equals(other));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEquals_DifferentName_ReturnsFalse() throws Exception {
        name = mock(QName.class);
        dynaBean = mock(DynaBean.class);
        dynabeanpointer = new DynaBeanPointer(name, dynaBean, Locale.US);
        other = new DynaBeanPointer(name, dynaBean, Locale.US);
        QName differentName = mock(QName.class);
        DynaBeanPointer differentPointer = new DynaBeanPointer(differentName, dynaBean, Locale.US);
        assertFalse(dynabeanpointer.equals(differentPointer));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEquals_DifferentDynaBean_ReturnsFalse() throws Exception {
        name = mock(QName.class);
        dynaBean = mock(DynaBean.class);
        dynabeanpointer = new DynaBeanPointer(name, dynaBean, Locale.US);
        other = new DynaBeanPointer(name, dynaBean, Locale.US);
        DynaBean differentDynaBean = mock(DynaBean.class);
        DynaBeanPointer differentPointer = new DynaBeanPointer(name, differentDynaBean, Locale.US);
        assertFalse(dynabeanpointer.equals(differentPointer));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEquals_Null_ReturnsFalse() throws Exception {
        name = mock(QName.class);
        dynaBean = mock(DynaBean.class);
        dynabeanpointer = new DynaBeanPointer(name, dynaBean, Locale.US);
        other = new DynaBeanPointer(name, dynaBean, Locale.US);
        assertFalse(dynabeanpointer.equals(null));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEquals_DifferentClass_ReturnsFalse() throws Exception {
        name = mock(QName.class);
        dynaBean = mock(DynaBean.class);
        dynabeanpointer = new DynaBeanPointer(name, dynaBean, Locale.US);
        other = new DynaBeanPointer(name, dynaBean, Locale.US);
        assertFalse(dynabeanpointer.equals(new Object()));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testisCollection() throws Exception {
        qname = new QName("qualifiedName");
        dynaBean = Mockito.mock(DynaBean.class);
        locale = Mockito.mock(Locale.class);
        dynabeanpointer = new DynaBeanPointer(qname, dynaBean, locale);
        boolean result = dynabeanpointer.isCollection();
        assertFalse(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testgetImmediateNode() throws Exception {
        name = new QName("test");
        locale = new Locale("en", "US");
        dynaBean = mock(DynaBean.class);
        dynabeanpointer = new DynaBeanPointer(name, dynaBean, locale);
        // when
        Object result = dynabeanpointer.getImmediateNode();
        // then
        assertEquals(dynaBean, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testgetName() throws Exception {
        name = mock(QName.class);
        dynabeanpointer = new DynaBeanPointer(name, mock(DynaBean.class), mock(Locale.class));
        when(name.getName()).thenReturn("mockedName");
        String result = dynabeanpointer.getName().getName();
        assertEquals("mockedName", result);
        verify(name, times(1)).getName();
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetPropertyPointer() throws Exception {
        name = new QName("test");
        locale = Locale.US;
        dynaBean = mock(DynaBean.class);
        dynabeanpointer = new DynaBeanPointer(name, dynaBean, locale);
        PropertyPointer propertyPointer = dynabeanpointer.getPropertyPointer();
        assertNotNull(propertyPointer);
        assertTrue(propertyPointer instanceof DynaBeanPropertyPointer);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testasPath_withNullParent() throws Exception {
        name = new QName("test");
        dynaBean = mock(DynaBean.class);
        locale = Locale.US;
        parent = mock(DOMNodePointer.class);
        dynabeanpointer = new DynaBeanPointer(parent, name, dynaBean);
        dynabeanpointer = new DynaBeanPointer(name, dynaBean, locale);
        assertEquals("/", dynabeanpointer.asPath());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testgetLength() throws Exception {
        qname = new QName("qualifiedName");
        dynaBean = Mockito.mock(DynaBean.class);
        locale = Mockito.mock(Locale.class);
        dynabeanpointer = new DynaBeanPointer(qname, dynaBean, locale);
        int length = dynabeanpointer.getLength();
        assertEquals(1, length);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testgetBaseValue() throws Exception {
        dynabeanpointer = new DynaBeanPointer(name, dynaBean, Locale.US);
        // When
        Object baseValue = dynabeanpointer.getBaseValue();
        // Then
        assertEquals(dynaBean, baseValue);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testisLeaf() throws Exception {
        qname = new QName("qualifiedName");
        dynaBean = Mockito.mock(DynaBean.class);
        locale = Mockito.mock(Locale.class);
        dynabeanpointer = new DynaBeanPointer(qname, dynaBean, locale);
        boolean result = dynabeanpointer.isLeaf();
        assertFalse(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetPropertyPointer_1() throws Exception {
        name = new QName("test");
        locale = Locale.US;
        dynaBean = mock(DynaBean.class);
        dynabeanpointer = new DynaBeanPointer(name, dynaBean, locale);
        PropertyPointer propertyPointer = dynabeanpointer.getPropertyPointer();
        assertNotNull(propertyPointer);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetPropertyPointer_2() throws Exception {
        name = new QName("test");
        locale = Locale.US;
        dynaBean = mock(DynaBean.class);
        dynabeanpointer = new DynaBeanPointer(name, dynaBean, locale);
        PropertyPointer propertyPointer = dynabeanpointer.getPropertyPointer();
        assertTrue(propertyPointer instanceof DynaBeanPropertyPointer);
    }
}