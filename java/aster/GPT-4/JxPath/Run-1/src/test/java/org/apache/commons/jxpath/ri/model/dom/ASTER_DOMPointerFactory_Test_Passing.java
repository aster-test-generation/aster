/**
 * Generated by Aster
 */
package org.apache.commons.jxpath.ri.model.dom;
import java.util.Locale;
import org.apache.commons.jxpath.ri.QName;
import org.apache.commons.jxpath.ri.model.NodePointer;
import org.w3c.dom.Node;
import static org.junit.jupiter.api.Assertions.*;
import java.util.Locale;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoSettings;
import org.mockito.quality.Strictness;
import org.mockito.InjectMocks;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import static org.mockito.Mockito.mock;   
@ExtendWith(MockitoExtension.class)
@MockitoSettings(strictness = Strictness.LENIENT)
public class Aster_DOMPointerFactory_Test_Passing {
@InjectMocks
    private DOMPointerFactory domPointerFactory;
@Mock
    private NodePointer mockParentNodePointer;
@Mock
    private Node mockNode;
@Mock
    private QName mockQName;
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCreateNodePointerWithNonNode() throws Exception {
        // Initialization is handled by Mockito annotations
        // Setup
        Object nonNodeBean = new Object();
        // Execution
        NodePointer result = domPointerFactory.createNodePointer(mockParentNodePointer, mockQName, nonNodeBean);
        // Verification
        assertNull(result);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testCreateNodePointerWithNode_iHOc0_1() {
    DOMPointerFactory factory = new DOMPointerFactory();
    QName name = new QName("testName");
    Node node = mock(Node.class);
    DOMNodePointer parent = new DOMNodePointer(node, Locale.getDefault());
    NodePointer result = factory.createNodePointer(parent, name, node);
    assertNotNull(result);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testCreateNodePointerWithNode_iHOc0_2() {
    DOMPointerFactory factory = new DOMPointerFactory();
    QName name = new QName("testName");
    Node node = mock(Node.class);
    DOMNodePointer parent = new DOMNodePointer(node, Locale.getDefault());
    NodePointer result = factory.createNodePointer(parent, name, node);
    assertTrue(result instanceof DOMNodePointer);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testCreateNodePointerWithNonNode_ijJB1() {
    DOMPointerFactory factory = new DOMPointerFactory();
    QName name = new QName("testName");
    Object nonNodeBean = new Object();
    DOMNodePointer parent = new DOMNodePointer(mock(Node.class), Locale.getDefault());
    NodePointer result = factory.createNodePointer(parent, name, nonNodeBean);
    assertNull(result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetOrder_uNRP0_PNBy0() {
    DOMPointerFactory factory = new DOMPointerFactory();
    int expected =100; // Assuming default order as100 since DOM_POINTER_FACTORY_ORDER is not defined
    assertEquals(expected, factory.getOrder());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testCreateNodePointerWithNonNode_vKGR1_oNaj0() {
    DOMPointerFactory factory = new DOMPointerFactory();
    Object nonNode = new Object(); // Non-Node object
    QName name = new QName("testName");
    Locale locale = Locale.getDefault();
    NodePointer result = factory.createNodePointer(null, name, nonNode);
    assertNull(result, "Expected null NodePointer for non-Node input");
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testCreateNodePointerWithNode_iHOc0() {
    DOMPointerFactory factory = new DOMPointerFactory();
    QName name = new QName("testName");
    Node node = mock(Node.class);
    DOMNodePointer parent = new DOMNodePointer(node, Locale.getDefault());
    NodePointer result = factory.createNodePointer(parent, name, node);
    assertNotNull(result);
    assertTrue(result instanceof DOMNodePointer);
}
}