/**
 * Generated by Aster
 */
package org.apache.commons.jxpath.ri.model.beans;

import java.util.concurrent.TimeUnit;
import org.apache.commons.jxpath.AbstractFactory;
import org.apache.commons.jxpath.JXPathContext;
import org.apache.commons.jxpath.JXPathInvalidAccessException;
import org.apache.commons.jxpath.ri.QName;
import org.apache.commons.jxpath.ri.model.NodePointer;
import org.apache.commons.jxpath.ri.model.VariablePointer;
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
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
@MockitoSettings(strictness = Strictness.LENIENT)
public class Aster_NullPropertyPointer_Test_Passing {
    private String propertyName = "*";
    NullPropertyPointer nullpropertypointer;
    DOMNodePointer parent;
    PropertyOwnerPointer propertyOwnerPointer;
    PropertyPointer propertyPointer;
    QName qName;
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
    @Mock
    private NodePointer nodePointer;
    DOMNodePointer domNodePointer;

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetValue_5_OfFj4() {
        NullPropertyPointer nullPropertyPointer = new NullPropertyPointer(null);
        try {
            nullPropertyPointer.setValue(new Object());
            assert false;
        } catch (JXPathInvalidAccessException e) {
            assert true;
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testgetValuePointer_1() throws Exception {
        parent = mock(DOMNodePointer.class);
        qName = new QName("test");
        nullpropertypointer = new NullPropertyPointer(parent);
        NodePointer result = nullpropertypointer.getValuePointer();
        assertNotNull(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testisCollection_1() throws Exception {
        parent = Mockito.mock(DOMNodePointer.class);
        nullpropertypointer = new NullPropertyPointer(parent);
        // when getIndex returns WHOLE_COLLECTION
        when(parent.getIndex()).thenReturn(NullPropertyPointer.WHOLE_COLLECTION);
        // when getIndex returns something other than WHOLE_COLLECTION
        when(parent.getIndex()).thenReturn(1);
        assertFalse(nullpropertypointer.isCollection());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testgetName_1() throws Exception {
        parent = Mockito.mock(DOMNodePointer.class);
        nullpropertypointer = new NullPropertyPointer(parent);
        QName expectedQName = new QName(propertyName);
        QName actualQName = nullpropertypointer.getName();
        assertEquals(expectedQName, actualQName);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testgetName_2() throws Exception {
        parent = Mockito.mock(DOMNodePointer.class);
        nullpropertypointer = new NullPropertyPointer(parent);
        QName expectedQName = new QName(propertyName);
        QName actualQName = nullpropertypointer.getName();
        assertEquals(propertyName, actualQName.getName());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testgetLength() throws Exception {
        domNodePointer = mock(DOMNodePointer.class);
        nullpropertypointer = new NullPropertyPointer(domNodePointer);
        int length = nullpropertypointer.getLength();
        assertEquals(0, length);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testgetBaseValue() throws Exception {
        domNodePointer = mock(DOMNodePointer.class);
        nullpropertypointer = new NullPropertyPointer(domNodePointer);
        Object result = nullpropertypointer.getBaseValue();
        assertNull(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCreatePath_isAttribute_vRsl0_pzTL0() {
        JXPathContext context = JXPathContext.newContext(new Object());
        VariablePointer pointer = new VariablePointer(new QName("prefix", "localName"));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCreatePath_nullParent_qhJt5_AQBg0() {
        JXPathContext context = JXPathContext.newContext(new Object());
        NullPropertyPointer pointer = new NullPropertyPointer(null);
        try {
            pointer.createPath(context);
            fail("Expected NullPointerException");
        } catch (NullPointerException e) {
            assertNotNull(e);
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testgetName() throws Exception {
        parent = Mockito.mock(DOMNodePointer.class);
        nullpropertypointer = new NullPropertyPointer(parent);
        QName expectedQName = new QName(propertyName);
        QName actualQName = nullpropertypointer.getName();
        assertEquals(expectedQName, actualQName);
        assertEquals(propertyName, actualQName.getName());
    }
}