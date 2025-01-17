/**
 * Generated by Aster
 */
package org.apache.commons.jxpath.ri.model.beans;

import java.util.Locale;
import java.util.concurrent.TimeUnit;
import org.apache.commons.jxpath.JXPathContext;
import org.apache.commons.jxpath.ri.QName;
import org.apache.commons.jxpath.ri.model.NodePointer;
import org.apache.commons.jxpath.ri.model.VariablePointer;
import org.apache.commons.jxpath.ri.model.dom.DOMNodePointer;
import org.apache.commons.jxpath.servlet.KeywordVariables;
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
public class Aster_NullPointer_Test_Passing {
    private QName name;
    NullPointer nullpointer;
    @Mock
    Locale locale;
    @Mock
    String id;
    @Mock
    DOMNodePointer parent;

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testequals() throws Exception {
        name = new QName("name");
        nullpointer = new NullPointer(name, Locale.getDefault());
        Object object = new Object();
        boolean actual = nullpointer.equals(object);
        boolean expected = false;
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEqualsWithThisObject_xNFV0() {
        final NullPointer pointer = new NullPointer(Locale.ROOT, "id");
        assertTrue(pointer.equals(pointer));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEqualsWithNullObject_xnFK1() {
        final NullPointer pointer = new NullPointer(Locale.ROOT, "id");
        assertFalse(pointer.equals(null));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEqualsWithDifferentClassObject_IJJZ2() {
        final NullPointer pointer = new NullPointer(Locale.ROOT, "id");
        assertFalse(pointer.equals(""));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEqualsWithEqualObjects_eoUs3() {
        final NullPointer pointer1 = new NullPointer(Locale.ROOT, "id");
        final NullPointer pointer2 = new NullPointer(Locale.ROOT, "id");
        assertTrue(pointer1.equals(pointer2));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEqualsWithDifferentObjects_hUKY4() {
        final NullPointer pointer1 = new NullPointer(Locale.ROOT, "id1");
        final NullPointer pointer2 = new NullPointer(Locale.ROOT, "id2");
        assertFalse(pointer1.equals(pointer2));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCreatePath_lsLa0() {
        Locale locale = Locale.getDefault();
        String id = "id";
        NullPointer nullPointer = new NullPointer(locale, id);
        NodePointer nodePointer = nullPointer.createPath(null, null);
        assertNotNull(nodePointer);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testcreateChild() throws Exception {
        nullpointer = new NullPointer(Locale.getDefault(), "id");
        name = new QName("name");
        JXPathContext context = mock(JXPathContext.class);
        NodePointer nodePointer = mock(NodePointer.class);
        when(context.getPointer(name.toString())).thenReturn(nodePointer);
        when(nodePointer.createChild(context, name, 1)).thenReturn(nodePointer);
        NodePointer result = nullpointer.createChild(context, name, 1);
        assertEquals(nodePointer, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testisCollection() throws Exception {
        nullpointer = new NullPointer(locale, id);
        when(locale.toString()).thenReturn("locale");
        when(id.toString()).thenReturn("id");
        when(parent.toString()).thenReturn("parent");
        when(name.toString()).thenReturn("name");
        boolean actual = nullpointer.isCollection();
        boolean expected = false;
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testcreatePath() throws Exception {
        nullpointer = new NullPointer(Locale.getDefault(), "id");
        JXPathContext context = mock(JXPathContext.class);
        NodePointer nodePointer = mock(NodePointer.class);
        when(context.getPointer(anyString())).thenReturn(nodePointer);
        when(nodePointer.getValuePointer()).thenReturn(nodePointer);
        NodePointer result = nullpointer.createPath(context);
        assertEquals(nodePointer, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testhashCode() throws Exception {
        name = new QName("name");
        nullpointer = new NullPointer(Locale.getDefault(), "id");
        assertEquals(0, nullpointer.hashCode());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testgetName() throws Exception {
        name = new QName("name");
        nullpointer = new NullPointer(name, Locale.getDefault());
        assertEquals(name, nullpointer.getName());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetName_UeLv0() {
        NullPointer pointer = new NullPointer(new Locale("en"), "id");
        assertEquals(pointer.getName(), null);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetPropertyPointer_Hvpc0() {
        NullPointer nullPointer = new NullPointer(new Locale("en"), "id");
        PropertyPointer propertyPointer = nullPointer.getPropertyPointer();
        assertEquals(null, propertyPointer.getImmediateNode());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testasPath() throws Exception {
        id = "testId";
        nullpointer = new NullPointer(Locale.getDefault(), id);
        String expected = "id(" + id + ")";
        String actual = nullpointer.asPath();
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testgetLength() throws Exception {
        nullpointer = new NullPointer(Locale.getDefault(), "id");
        assertEquals(0, nullpointer.getLength());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testMethod1_HHpA0() {
        NullPointer nullPointer = new NullPointer(new Locale("en"), "id");
        int result = nullPointer.getLength();
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testgetBaseValue() throws Exception {
        nullpointer = new NullPointer(Locale.getDefault(), "id");
        Object baseValue = nullpointer.getBaseValue();
        assertEquals(null, baseValue);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void getBaseValueTest_YLwL1() {
        VariablePointer variablePointer = new VariablePointer(new KeywordVariables("keyword", new Object()), new QName("name"));
        Object baseValue = variablePointer.getBaseValue();
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testisLeaf() throws Exception {
        nullpointer = new NullPointer(Locale.getDefault(), "id");
        assertTrue(nullpointer.isLeaf());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsLeaf_FdQV0() {
        NullPointer nullPointer = new NullPointer(new Locale("en"), "id");
        boolean result = nullPointer.isLeaf();
        assert result;
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCreateChild_Exzh0_CrKm0() {
        JXPathContext context = JXPathContext.newContext(new Object());
        QName name = new QName("name");
        int index = 0;
        NodePointer nodePointer = new NullPointer(null, name).createChild(context, name, index);
        assertEquals(nodePointer, new NullPointer(null, name).createPath(context).createChild(context, name, index));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void getBaseValueTest_NuRT2_RkXD0() {
        NullPointer nullPointer = new NullPointer(Locale.getDefault(), "id");
        Object baseValue = nullPointer.getBaseValue();
    }
}