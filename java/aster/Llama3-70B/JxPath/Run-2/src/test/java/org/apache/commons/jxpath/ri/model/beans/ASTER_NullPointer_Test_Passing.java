/**
 * Generated by Aster
 */
package org.apache.commons.jxpath.ri.model.beans;

import java.lang.reflect.Field;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import org.apache.commons.jxpath.JXPathContext;
import org.apache.commons.jxpath.ri.QName;
import org.apache.commons.jxpath.ri.model.NodePointer;
import org.apache.commons.jxpath.ri.model.dom.DOMNodePointer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import org.junit.jupiter.api.extension.ExtendWith;
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
    private NullPointer nullpointer;
    private NullPointer otherNullPointer;
    JXPathContext context;
    DOMNodePointer parent;
    Object value;
    QName qname;
    DOMNodePointer parentNode;
    NullPropertyPointer nullPropertyPointer;
    private NodePointer nodePointer;
    private String id = "testId";

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEquals_SameObject() throws Exception {
        name = new QName("test");
        nullpointer = new NullPointer(name, Locale.US);
        otherNullPointer = new NullPointer(name, Locale.US);
        assertTrue(nullpointer.equals(nullpointer));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEquals_SameName() throws Exception {
        name = new QName("test");
        nullpointer = new NullPointer(name, Locale.US);
        otherNullPointer = new NullPointer(name, Locale.US);
        assertTrue(nullpointer.equals(otherNullPointer));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEquals_DifferentName() throws Exception {
        name = new QName("test");
        nullpointer = new NullPointer(name, Locale.US);
        otherNullPointer = new NullPointer(name, Locale.US);
        otherNullPointer = new NullPointer(new QName("different"), Locale.US);
        assertFalse(nullpointer.equals(otherNullPointer));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEquals_Null() throws Exception {
        name = new QName("test");
        nullpointer = new NullPointer(name, Locale.US);
        otherNullPointer = new NullPointer(name, Locale.US);
        assertFalse(nullpointer.equals(null));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEquals_SameObject_HznH0() {
        NullPointer nullPointer = new NullPointer(new Locale("en"), "id");
        assertTrue(nullPointer.equals(nullPointer));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEquals_DifferentClass_VsVA1() {
        Object obj = new Object();
        NullPointer nullPointer = new NullPointer(new Locale("en"), "id");
        assertFalse(nullPointer.equals(obj));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEquals_SameName_AVNZ2() {
        QName name = new QName("qualifiedName");
        NullPointer nullPointer1 = new NullPointer(name, new Locale("en"));
        NullPointer nullPointer2 = new NullPointer(name, new Locale("en"));
        assertTrue(nullPointer1.equals(nullPointer2));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEquals_DifferentName_jBTV3() {
        QName name1 = new QName("qualifiedName1");
        QName name2 = new QName("qualifiedName2");
        NullPointer nullPointer1 = new NullPointer(name1, new Locale("en"));
        NullPointer nullPointer2 = new NullPointer(name2, new Locale("en"));
        assertFalse(nullPointer1.equals(nullPointer2));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEquals_NullName_gkxy4() {
        NullPointer nullPointer1 = new NullPointer(null, new Locale("en"));
        NullPointer nullPointer2 = new NullPointer(null, new Locale("en"));
        assertTrue(nullPointer1.equals(nullPointer2));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEquals_OneNullName_ajKo5() {
        QName name = new QName("qualifiedName");
        NullPointer nullPointer1 = new NullPointer(name, new Locale("en"));
        NullPointer nullPointer2 = new NullPointer(null, new Locale("en"));
        assertFalse(nullPointer1.equals(nullPointer2));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsCollection_ZIqN0() {
        QName name = new QName("qualifiedName");
        NullPointer nullPointer = new NullPointer(name, Locale.getDefault());
        boolean result = nullPointer.isCollection();
        assert !result;
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHashCode_NameNull_LtYt1() {
        NullPointer nullPointer = new NullPointer(Locale.US, "id");
        assertEquals(0, nullPointer.hashCode());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testgetName() throws Exception {
        name = mock(QName.class);
        nullpointer = new NullPointer(name, Locale.US);
        when(name.getName()).thenReturn("mockedName");
        String result = nullpointer.getName().getName();
        assertEquals("mockedName", result);
        verify(name, times(1)).getName();
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetName_lAjY0() {
        QName name = new QName("qualifiedName");
        NullPointer nullPointer = new NullPointer(name, Locale.getDefault());
        QName result = nullPointer.getName();
        assertEquals(name, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetPropertyPointer_lXxe0() {
        NullPointer nullPointer = new NullPointer(new Locale("en", "US"), "id");
        PropertyPointer propertyPointer = nullPointer.getPropertyPointer();
        assertNotNull(propertyPointer);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAsPath_IdNotNull_IVQu0() {
        NullPointer nullPointer = new NullPointer(new Locale("en", "US"), "id1");
        assertEquals("id(id1)", nullPointer.asPath());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAsPath_IdNull_XJJt2() {
        NullPointer nullPointer = new NullPointer(new QName("qualifiedName"), new Locale("en", "US"));
        assertEquals("null()", nullPointer.asPath());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetLength_PXsM0() {
        Locale locale = new Locale("en", "US");
        QName name = new QName("prefix", "localName");
        NullPointer nullPointer = new NullPointer(locale, "id");
        int length = nullPointer.getLength();
        assertEquals(0, length);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetBaseValue_EXSm0() {
        Locale locale = new Locale("en", "US");
        QName name = new QName("prefix", "localName");
        NullPointer nullPointer = new NullPointer(locale, "id");
        Object baseValue = nullPointer.getBaseValue();
        assertNull(baseValue);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsActual_Azdi0() {
        QName name = new QName("qualifiedName");
        NullPointer nullPointer = new NullPointer(name, Locale.getDefault());
        assertFalse(nullPointer.isActual());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testcreatePath_oASU0() throws Exception {
        parent = mock(DOMNodePointer.class);
        context = mock(JXPathContext.class);
        value = new Object();
        QName qName = new QName("test");
        nullpointer = new NullPointer(parent, qName);
        NodePointer nodePointer = mock(NodePointer.class);
        when(parent.createPath(context, value)).thenReturn(nodePointer);
        when(nodePointer.getValuePointer()).thenReturn(nodePointer);
        NodePointer result = nullpointer.createPath(context, value);
        assertEquals(nodePointer, result);
        verify(parent, times(1)).createPath(context, value);
        verify(nodePointer, times(1)).getValuePointer();
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testcreatePath_l_jTTv0() throws Exception {
        parent = mock(DOMNodePointer.class);
        context = mock(JXPathContext.class);
        QName qname = new QName("test");
        nullpointer = new NullPointer(parent, qname);
        NodePointer valuePointer = mock(NodePointer.class);
        when(parent.createPath(context)).thenReturn(valuePointer);
        when(valuePointer.getValuePointer()).thenReturn(valuePointer);
        NodePointer result = nullpointer.createPath(context);
        assertEquals(valuePointer, result);
        verify(parent).createPath(context);
        verify(valuePointer).getValuePointer();
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCreatePath_withoutParent_HENp1_nQwl0() {
        JXPathContext context = JXPathContext.newContext(new Object());
        Object value = new Object();
        QName name = new QName("prefix", "localName");
        Locale locale = Locale.US;
        NullPointer nullPointer = new NullPointer(name, locale);
        try {
            nullPointer.createPath(context, value);
            fail("Expected UnsupportedOperationException");
        } catch (UnsupportedOperationException e) {
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCreatePath_withoutParent_Zzsc1_eByF0() {
        JXPathContext context = JXPathContext.newContext(new Object());
        QName qName = new QName("name");
        NullPointer nullPointer = new NullPointer(qName, Locale.US);
        try {
            nullPointer.createPath(context);
            fail("Expected UnsupportedOperationException");
        } catch (UnsupportedOperationException e) {
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testasPath_withId_szxA0() throws Exception {
        parent = mock(DOMNodePointer.class);
        nullpointer = new NullPointer(parent, new QName("testPrefix", "testLocalName"));
        Field idField = NullPointer.class.getDeclaredField("id");
        idField.setAccessible(true);
        idField.set(nullpointer, "testId");
        String result = nullpointer.asPath();
        assertEquals("id(testId)", result);
    }
}