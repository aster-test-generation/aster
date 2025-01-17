/**
 * Generated by Aster
 */
package org.apache.commons.jxpath.ri.model.jdom;

import java.util.List;
import java.util.concurrent.TimeUnit;
import org.apache.commons.jxpath.ri.model.NodePointer;
import org.apache.commons.jxpath.ri.model.dom.DOMNodePointer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import org.mockito.junit.jupiter.MockitoSettings;
import org.mockito.quality.Strictness;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

@ExtendWith(MockitoExtension.class)
@MockitoSettings(strictness = Strictness.LENIENT)
public class Aster_JDOMNamespaceIterator_Test_Failing {
    private int position = 0;
    JDOMNamespaceIterator jdomnamespaceiterator;
    private List namespaces;
    private NodePointer parent;

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetPosition1_rvDK0() {
        JDOMNamespaceIterator jDOMNamespaceIterator0 = new JDOMNamespaceIterator((DOMNodePointer) null);
        boolean boolean0 = jDOMNamespaceIterator0.setPosition(0);
        assertEquals(false, boolean0);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetPosition2_ONzS1() {
        JDOMNamespaceIterator jDOMNamespaceIterator0 = new JDOMNamespaceIterator((DOMNodePointer) null);
        boolean boolean0 = jDOMNamespaceIterator0.setPosition(1);
        assertEquals(false, boolean0);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetPosition3_FKhN2() {
        JDOMNamespaceIterator jDOMNamespaceIterator0 = new JDOMNamespaceIterator((DOMNodePointer) null);
        boolean boolean0 = jDOMNamespaceIterator0.setPosition((-1));
        assertEquals(false, boolean0);
    }
}