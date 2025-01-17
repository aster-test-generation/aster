/**
 * Generated by Aster
 */
package org.apache.commons.jxpath.ri.model.dom;
import org.apache.commons.jxpath.ri.model.NodePointer;
import org.w3c.dom.Node;
import org.apache.commons.jxpath.ri.compiler.NodeTypeTest;
import org.apache.commons.jxpath.ri.model.VariablePointer;
import org.apache.commons.jxpath.ri.QName;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoSettings;
import org.mockito.quality.Strictness;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;   
@ExtendWith(MockitoExtension.class)
@MockitoSettings(strictness = Strictness.LENIENT)
public class Aster_DOMNodeIterator_Test_Failing {
private int position = 0;
@Mock
    private Node node;
@Mock
    private NodePointer nodePointer;
@Mock
    private DOMNodePointer domNodePointer;
@Mock
    private NodeTypeTest nodeTypeTest;
@Mock
    private VariablePointer variablePointer;
@Mock
    private QName qName;
private Node child = null;
private NodePointer parent;
@Mock
    private NodePointer nodepointer;
@Mock
    private DOMNodePointer domnodepointer;
@Mock
    private DOMNodePointer parentpointer;
@Mock
    private NodeTypeTest nodetest;
@Mock
    private DOMNodeIterator domnodeiterator;
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetNodePointer_Position0_ReturnsNull_PjYw0() {
    DOMNodePointer parent = new DOMNodePointer(null, null, null);
    DOMNodePointer child = null;
    DOMNodeIterator iterator = new DOMNodeIterator(parent, new NodeTypeTest(0), false, child);
    NodePointer result = iterator.getNodePointer();
    Assertions.assertNull(result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetNodePointer_PositionNot0_ReturnsNodePointer_tixc1() {
    DOMNodePointer parent = new DOMNodePointer(null, null, null);
    DOMNodePointer child = new DOMNodePointer(null, null, null);
    DOMNodeIterator iterator = new DOMNodeIterator(parent, new NodeTypeTest(0), false, child);
    iterator.setPosition(1);
    NodePointer result = iterator.getNodePointer();
    Assertions.assertNotNull(result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetNodePointer_Position0_SetPosition1_ReturnsNodePointer_zgsA2() {
    DOMNodePointer parent = new DOMNodePointer(null, null, null);
    DOMNodePointer child = null;
    DOMNodeIterator iterator = new DOMNodeIterator(parent, new NodeTypeTest(0), false, child);
    NodePointer result = iterator.getNodePointer();
    Assertions.assertNotNull(result);
}
}