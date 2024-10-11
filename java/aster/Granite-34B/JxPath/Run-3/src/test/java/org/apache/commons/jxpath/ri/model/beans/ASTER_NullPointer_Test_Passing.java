/**
 * Generated by Aster
 */
package org.apache.commons.jxpath.ri.model.beans;

import java.util.Locale;
import java.util.concurrent.TimeUnit;
import org.apache.commons.jxpath.JXPathContext;
import org.apache.commons.jxpath.Pointer;
import org.apache.commons.jxpath.Variables;
import org.apache.commons.jxpath.ri.QName;
import org.apache.commons.jxpath.ri.model.NodePointer;
import org.apache.commons.jxpath.ri.model.dom.DOMNodePointer;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import org.mockito.junit.jupiter.MockitoSettings;
import org.mockito.quality.Strictness;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
@MockitoSettings(strictness = Strictness.LENIENT)
public class Aster_NullPointer_Test_Passing {
    private QName name;
    NullPointer nullpointer;
    private String id;
    private DOMNodePointer parent;
    private static final String NULL_POINTER = "NullPointer";

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testcreatePath_0() throws Exception {
        nullpointer = new NullPointer(Locale.getDefault(), "id");
        JXPathContext context = mock(JXPathContext.class);
        NodePointer parent = mock(NodePointer.class);
        when(context.getPointer("/id")).thenReturn(parent);
        Object value = new Object();
        NodePointer result = nullpointer.createPath(context, value);
        assertEquals(parent.getValuePointer(), result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testcreateChild_0() throws Exception {
        name = new QName(" qualifiedName");
        nullpointer = new NullPointer(name, Locale.getDefault());
        JXPathContext context = mock(JXPathContext.class);
        when(context.getVariables()).thenReturn(mock(Variables.class));
        when(context.getPointer(anyString())).thenReturn(mock(Pointer.class));
        when(context.getPointer(anyString())).thenReturn(mock(Pointer.class));
        when(context.getPointer(anyString())).thenReturn(mock(Pointer.class));
        when(context.getPointer(anyString())).thenReturn(mock(Pointer.class));
        NodePointer nodePointer = nullpointer.createChild(context, name, 1);
        assertEquals(name, nodePointer.getName());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testcreateChild() throws Exception {
        nullpointer = new NullPointer(Locale.getDefault(), "id");
        name = new QName("qualifiedName");
        NodePointer nodePointer = nullpointer.createChild(Mockito.mock(JXPathContext.class), name, 1, new Object());
        Assertions.assertEquals(name, nodePointer.getName());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testisCollection() throws Exception {
        nullpointer = new NullPointer(Locale.getDefault(), "id");
        boolean result = nullpointer.isCollection();
        assertFalse(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testhashCode() throws Exception {
        name = mock(QName.class);
        when(name.hashCode()).thenReturn(123);
        nullpointer = new NullPointer(name, Locale.getDefault());
        assertEquals(123, nullpointer.hashCode());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetName() throws Exception {
        name = Mockito.mock(QName.class);
        nullpointer = new NullPointer(name, Locale.getDefault());
        assertEquals(name, nullpointer.getName());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void equals_with_same_object_VFcM0() throws Exception {
        NullPointer pointer = new NullPointer(Locale.getDefault(), "id");
        assertTrue(pointer.equals(pointer));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void equals_with_same_type_and_equal_name_MFtA1() throws Exception {
        NullPointer pointer1 = new NullPointer(Locale.getDefault(), "id");
        NullPointer pointer2 = new NullPointer(Locale.getDefault(), "id");
        assertTrue(pointer1.equals(pointer2));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void equals_with_same_type_and_unequal_name_DDXU2() throws Exception {
        NullPointer pointer1 = new NullPointer(Locale.getDefault(), "id1");
        NullPointer pointer2 = new NullPointer(Locale.getDefault(), "id2");
        assertFalse(pointer1.equals(pointer2));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void equals_with_different_type_VSKh3() throws Exception {
        NullPointer pointer = new NullPointer(Locale.getDefault(), "id");
        assertFalse(pointer.equals(new Object()));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void equals_with_null_HQgf4() throws Exception {
        NullPointer pointer = new NullPointer(Locale.getDefault(), "id");
        assertFalse(pointer.equals(null));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void equals_with_same_type_and_null_name_ETZy5() throws Exception {
        NullPointer pointer1 = new NullPointer(Locale.getDefault(), "id");
        NullPointer pointer2 = new NullPointer(Locale.getDefault(), null);
        assertFalse(pointer1.equals(pointer2));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testgetPropertyPointer_1() throws Exception {
        nullpointer = new NullPointer(Locale.getDefault(), "id");
        PropertyPointer propertyPointer = nullpointer.getPropertyPointer();
        assertNotNull(propertyPointer);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testgetPropertyPointer_2() throws Exception {
        nullpointer = new NullPointer(Locale.getDefault(), "id");
        PropertyPointer propertyPointer = nullpointer.getPropertyPointer();
        assertEquals(0, propertyPointer.getPropertyCount());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetPropertyPointer_ehsM0() throws Exception {
        NullPointer nullPointer = new NullPointer(new Locale("en"), "id");
        PropertyPointer propertyPointer = nullPointer.getPropertyPointer();
        assertNotNull(propertyPointer);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCreatePath_iPvm0() throws Exception {
        NullPointer nullPointer = new NullPointer(Locale.getDefault(), "id");
        JXPathContext context = JXPathContext.newContext(nullPointer);
        NodePointer nodePointer = nullPointer.createPath(context);
        assertEquals(null, nodePointer.getValue());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCreatePathWithParent_fdFt1() throws Exception {
        NullPointer parent = new NullPointer(Locale.getDefault(), "id");
        NullPointer nullPointer = new NullPointer(parent, new QName("name"));
        JXPathContext context = JXPathContext.newContext(nullPointer);
        NodePointer nodePointer = nullPointer.createPath(context);
        assertEquals(parent.getValuePointer(), nodePointer);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCreatePathWithLocale_Lmeb2() throws Exception {
        NullPointer nullPointer = new NullPointer(new QName("name"), Locale.FRANCE);
        JXPathContext context = JXPathContext.newContext(nullPointer);
        NodePointer nodePointer = nullPointer.createPath(context);
        assertEquals(Locale.FRANCE, nodePointer.getLocale());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testgetLength() throws Exception {
        nullpointer = new NullPointer(Locale.getDefault(), "id");
        assertEquals(0, nullpointer.getLength());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHashCode_BgzN0() throws Exception {
        NullPointer nullPointer = new NullPointer(new Locale("en"), "id");
        int actual = nullPointer.hashCode();
        int expected = 0;
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testLength_uWgd0() throws Exception {
        NullPointer np = new NullPointer(new Locale("en"), "id");
        assertEquals(0, np.getLength());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testisLeaf() throws Exception {
        nullpointer = new NullPointer(Locale.getDefault(), "id");
        assertTrue(nullpointer.isLeaf());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsLeaf_oNMq0() throws Exception {
        NullPointer nullPointer = new NullPointer(Locale.getDefault(), "id");
        boolean result = nullPointer.isLeaf();
        assert result;
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void test_getBaseValue_1_zHMB0() throws Exception {
        NullPointer nullPointer = new NullPointer(new Locale("en"), "id");
        Object baseValue = nullPointer.getBaseValue();
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetName_fjve0() throws Exception {
        NullPointer nullPointer = new NullPointer(Locale.getDefault(), "id");
        QName name = nullPointer.getName();
        assertNotNull(name);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetNameWithLocaleAndId_IYNi3() throws Exception {
        Locale locale = Locale.getDefault();
        NullPointer nullPointer = new NullPointer(locale, "id");
        QName returnedName = nullPointer.getName();
        assertEquals(new QName("id"), returnedName);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsActual_oAWL0() throws Exception {
        NullPointer nullPointer = new NullPointer(new Locale("en"), "id");
        assertFalse(nullPointer.isActual());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAsPathWithId_KBMx0() throws Exception {
        NullPointer pointer = new NullPointer(new Locale("en"), "myId");
        assertEquals("id(myId)", pointer.asPath());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAsPathWithParent_sPhh1() throws Exception {
        NullPointer parent = new NullPointer(new Locale("en"), "myId");
        NullPointer pointer = new NullPointer(parent, new QName("myName"));
        assertEquals("null().myName", pointer.asPath());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsCollection_IylS0() throws Exception {
        NullPointer nullPointer = new NullPointer(new Locale("en"), "id");
        assertFalse(nullPointer.isCollection());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testNullPointer_ffIA0_1() throws Exception {
        JXPathContext context = JXPathContext.newContext(new Object());
        Pointer pointer = context.getPointer(NULL_POINTER);
        assertNotNull(pointer);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testNullPointer_ffIA0_2() throws Exception {
        JXPathContext context = JXPathContext.newContext(new Object());
        Pointer pointer = context.getPointer(NULL_POINTER);
        assertTrue(pointer instanceof NullPointer);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetValue_BfVL6() throws Exception {
        JXPathContext context = JXPathContext.newContext(new Object());
        Pointer pointer = context.getPointer(NULL_POINTER);
        pointer.setValue(new Object());
    }
}