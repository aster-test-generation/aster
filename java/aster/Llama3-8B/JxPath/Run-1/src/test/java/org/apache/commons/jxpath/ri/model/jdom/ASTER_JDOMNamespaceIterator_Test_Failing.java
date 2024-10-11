/**
 * Generated by Aster
 */
package org.apache.commons.jxpath.ri.model.jdom;

import java.util.List;
import java.util.concurrent.TimeUnit;
import org.apache.commons.jxpath.JXPathContext;
import org.apache.commons.jxpath.ri.model.NodePointer;
import org.apache.commons.jxpath.ri.model.dom.DOMNodePointer;
import org.jdom.Namespace;
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
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
@MockitoSettings(strictness = Strictness.LENIENT)
public class Aster_JDOMNamespaceIterator_Test_Failing {
    @Mock
    private DOMNodePointer parent;
    @Mock
    private List namespaces;
    private JDOMNamespaceIterator jdomnamespaceiterator;
    private int position = 0;

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testgetNodePointer_kNxa0() throws Exception {
        JDOMNamespaceIterator jdomnamespaceiterator = new JDOMNamespaceIterator(parent);
        JXPathContext jnamespacess = null; // Initialize the variable
        Namespace namespace = mock(Namespace.class);
        when(namespaces.get(0)).thenReturn(namespace);
        when(parent.getImmediateNode()).thenReturn(new Object());
        NodePointer result = jdomnamespaceiterator.getNodePointer();
        verify(namespaces, times(1)).get(0);
        verify(parent, times(1)).getImmediateNode();
        assertEquals(new JDOMNamespacePointer(parent, namespace.getPrefix(), namespace.getURI()), result);
    }
}