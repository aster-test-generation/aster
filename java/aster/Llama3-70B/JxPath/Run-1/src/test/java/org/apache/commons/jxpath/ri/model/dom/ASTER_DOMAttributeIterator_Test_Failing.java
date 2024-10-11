/**
 * Generated by Aster
 */
package org.apache.commons.jxpath.ri.model.dom;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.apache.commons.jxpath.ri.QName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import org.mockito.junit.jupiter.MockitoSettings;
import org.mockito.quality.Strictness;
import org.w3c.dom.Attr;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
import static org.mockito.Mockito.mock;

@ExtendWith(MockitoExtension.class)
@MockitoSettings(strictness = Strictness.LENIENT)
public class Aster_DOMAttributeIterator_Test_Failing {
    private int position = 0;
    DOMAttributeIterator domattributeiterator;
    Node node;
    DOMNodePointer nodepointer;
    Attr attr;
    QName qname;
    NamedNodeMap namednodemap;
    private List<Attr> attributes = new ArrayList<>();
    DOMAttributeIterator domAttributeIterator;
    DOMNodePointer nodePointer;
    QName qName;
    NamedNodeMap namedNodeMap;

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetPosition() throws Exception {
        node = mock(Node.class);
        nodepointer = mock(DOMNodePointer.class);
        attr = mock(Attr.class);
        qname = mock(QName.class);
        namednodemap = mock(NamedNodeMap.class);
        domattributeiterator = new DOMAttributeIterator(nodepointer, qname);
        assertEquals(0, domattributeiterator.getPosition());
    }
}