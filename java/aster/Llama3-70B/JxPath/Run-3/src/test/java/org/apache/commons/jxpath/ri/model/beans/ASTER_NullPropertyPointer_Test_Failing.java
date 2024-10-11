/**
 * Generated by Aster
 */
package org.apache.commons.jxpath.ri.model.beans;

import java.util.concurrent.TimeUnit;
import org.apache.commons.jxpath.AbstractFactory;
import org.apache.commons.jxpath.JXPathContext;
import org.apache.commons.jxpath.ri.QName;
import org.apache.commons.jxpath.ri.model.NodePointer;
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
public class Aster_NullPropertyPointer_Test_Failing {
    private String propertyName = "*";
    NullPropertyPointer nullpropertypointer;
    DOMNodePointer parent;
    PropertyOwnerPointer propertyOwnerPointer;
    PropertyPointer propertyPointer;
    QName qName;
    NodePointer nodePointer;
    @Mock
    private JXPathContext context;
    @Mock
    private NodePointer newParent;
    @Mock
    private PropertyOwnerPointer pop;
    @Mock
    private AbstractFactory factory;
    @Mock
    private QName name;
    DOMNodePointer domNodePointer;

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testcreateChild() throws Exception {
        nullpropertypointer = new NullPropertyPointer(parent);
        when(parent.createPath(any(JXPathContext.class))).thenReturn(nodePointer);
        NodePointer result = nullpropertypointer.createChild(context, name, 1);
        assertEquals(nodePointer, result);
        verify(parent).createPath(context);
        verify(nodePointer).createChild(context, name, 1);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testcreatePath_PropertyOwnerPointer_RXEL0() throws Exception {
        parent = mock(DOMNodePointer.class);
        nullpropertypointer = new NullPropertyPointer(parent);
        when(parent.createPath(context)).thenReturn(newParent);
        when(newParent.createAttribute(context, any(QName.class))).thenReturn(newParent);
        when(newParent.createChild(context, any(QName.class), anyInt(), any())).thenReturn(newParent);
        when(context.getFactory()).thenReturn(factory);
        when(newParent instanceof PropertyOwnerPointer).thenReturn(true);
        PropertyOwnerPointer propertyOwnerPointer = (PropertyOwnerPointer) newParent;
        PropertyPointer propertyPointer = mock(PropertyPointer.class);
        when(propertyOwnerPointer.getPropertyPointer()).thenReturn(propertyPointer);
        NodePointer result = nullpropertypointer.createPath(context, "value");
        verify(parent).createPath(context);
        verify(propertyOwnerPointer).getPropertyPointer();
        verify(newParent).createChild(context, any(QName.class), anyInt(), "value");
        assertEquals(newParent, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetValuePointer() throws Exception {
        parent = mock(DOMNodePointer.class);
        qName = new QName("test");
        nodePointer = new NullPointer(parent, qName);
        nullpropertypointer = new NullPropertyPointer(parent);
        NodePointer result = nullpropertypointer.getValuePointer();
        assertNotNull(result);
        assertEquals(qName, result.getName());
        assertSame(parent, result.getParent());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetValuePointer_2() throws Exception {
        parent = mock(DOMNodePointer.class);
        qName = new QName("test");
        nodePointer = new NullPointer(parent, qName);
        nullpropertypointer = new NullPropertyPointer(parent);
        NodePointer result = nullpropertypointer.getValuePointer();
        assertEquals(qName, result.getName());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testcreatePath_fiSU0() throws Exception {
        DOMNodePointer parent = mock(DOMNodePointer.class);
        NullPropertyPointer nullpropertypointer = new NullPropertyPointer(parent);
        when(parent.createPath(context)).thenReturn(newParent);
        when(newParent.createAttribute(context, any(QName.class))).thenReturn(newParent);
        when(newParent.createChild(context, any(QName.class), anyInt(), any())).thenReturn(newParent);
        when(context.getFactory()).thenReturn(factory);
        when(nullpropertypointer.getParent()).thenReturn(parent);
        when(parent.equals(newParent)).thenReturn(true);
        NodePointer result = nullpropertypointer.createPath(context, "value");
        verify(parent).createPath(context);
        verify(newParent).createAttribute(context, any(QName.class));
        verify(newParent).setValue("value");
        assertEquals(newParent, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testcreatePath_PropertyOwnerPointer_RXEL0_fid3() throws Exception {
        nullpropertypointer = new NullPropertyPointer(parent);
        when(parent.createPath(context)).thenReturn(newParent);
        when(newParent.createAttribute(context, any(QName.class))).thenReturn(newParent);
        when(newParent.createChild(context, any(QName.class), anyInt(), any())).thenReturn(newParent);
        when(context.getFactory()).thenReturn(factory);
        when(newParent instanceof PropertyOwnerPointer).thenReturn(true);
        PropertyOwnerPointer propertyOwnerPointer = (PropertyOwnerPointer) newParent;
        PropertyPointer propertyPointer = mock(PropertyPointer.class);
        when(propertyOwnerPointer.getPropertyPointer()).thenReturn(propertyPointer);
        NodePointer result = nullpropertypointer.createPath(context, "value");
        verify(parent).createPath(context);
        verify(propertyOwnerPointer).getPropertyPointer();
        verify(newParent).createChild(context, any(QName.class), anyInt(), "value");
        assertEquals(newParent, result);
    }
}