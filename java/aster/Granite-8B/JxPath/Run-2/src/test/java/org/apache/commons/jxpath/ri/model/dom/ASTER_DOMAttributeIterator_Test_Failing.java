/**
 * Generated by Aster
 */
package org.apache.commons.jxpath.ri.model.dom;

import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import org.apache.commons.jxpath.AbstractFactory;
import org.apache.commons.jxpath.ri.NamespaceResolver;
import org.apache.commons.jxpath.ri.QName;
import org.apache.commons.jxpath.ri.model.NodePointer;
import org.apache.commons.jxpath.ri.model.VariablePointer;
import org.apache.commons.jxpath.servlet.KeywordVariables;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.mockito.junit.jupiter.MockitoSettings;
import org.mockito.quality.Strictness;
import org.w3c.dom.Attr;
import org.w3c.dom.Element;
import org.w3c.dom.Node;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

@ExtendWith(MockitoExtension.class)
@MockitoSettings(strictness = Strictness.LENIENT)
public class Aster_DOMAttributeIterator_Test_Failing {
    private int position = 0;
    DOMAttributeIterator domattributeiterator;
    Node node;
    NodePointer nodepointer;
    Attr attr;
    Locale locale;
    KeywordVariables variables;
    QName name;
    DOMNodePointer domNodePointer;
    VariablePointer variablePointer;
    private List attributes;
    String id;
    VariablePointer parent;
    @Mock
    private List list;
    @Mock
    private Element element;
    @Mock
    private NamespaceResolver namespaceResolver;
    @Mock
    private AbstractFactory abstractFactory;

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetPosition_ZwDh0() {
        DOMNodePointer domNodePointer = new DOMNodePointer(null, null, null);
        DOMAttributeIterator domAttributeIterator = new DOMAttributeIterator(domNodePointer, null);
        int position = domAttributeIterator.getPosition();
        assertEquals(0, position);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetNodePointer_wbpV0() {
        DOMAttributeIterator iterator = new DOMAttributeIterator(null, null);
        NodePointer nodePointer = iterator.getNodePointer();
        assertNotNull(nodePointer);
    }
}