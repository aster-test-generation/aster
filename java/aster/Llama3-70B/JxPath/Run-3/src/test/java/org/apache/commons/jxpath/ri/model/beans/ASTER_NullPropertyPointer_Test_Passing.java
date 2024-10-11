/**
 * Generated by Aster
 */
package org.apache.commons.jxpath.ri.model.beans;

import java.util.concurrent.TimeUnit;
import org.apache.commons.jxpath.AbstractFactory;
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
import static org.mockito.Mockito.mock;

@ExtendWith(MockitoExtension.class)
@MockitoSettings(strictness = Strictness.LENIENT)
public class Aster_NullPropertyPointer_Test_Passing {
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
    public void testGetValuePointer_1() throws Exception {
        parent = mock(DOMNodePointer.class);
        qName = new QName("test");
        nodePointer = new NullPointer(parent, qName);
        nullpropertypointer = new NullPropertyPointer(parent);
        NodePointer result = nullpropertypointer.getValuePointer();
        assertNotNull(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetValuePointer_3() throws Exception {
        parent = mock(DOMNodePointer.class);
        qName = new QName("test");
        nodePointer = new NullPointer(parent, qName);
        nullpropertypointer = new NullPropertyPointer(parent);
        NodePointer result = nullpropertypointer.getValuePointer();
        assertSame(parent, result.getParent());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testgetName() throws Exception {
        parent = mock(DOMNodePointer.class);
        nullpropertypointer = new NullPropertyPointer(parent);
        QName expectedQName = new QName(propertyName);
        QName actualQName = nullpropertypointer.getName();
        assertEquals(expectedQName, actualQName);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testisActual() throws Exception {
        domNodePointer = mock(DOMNodePointer.class);
        nullpropertypointer = new NullPropertyPointer(domNodePointer);
        assertFalse(nullpropertypointer.isActual());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetImmediateNode_IWdI0_jPNQ0() {
        KeywordVariables keywordVariables = new KeywordVariables("keyword", new Object());
        QName qname = new QName("qualifiedName");
        VariablePointer variablePointer = new VariablePointer(keywordVariables, qname);
        org.w3c.dom.Node node = null;
        DOMNodePointer domNodePointer = new DOMNodePointer(variablePointer, node);
        NullPropertyPointer nullPropertyPointer = new NullPropertyPointer(domNodePointer);
        assertNull(nullPropertyPointer.getImmediateNode());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void setPropertyName(String propertyName) {
        this.propertyName = propertyName;
    }
}