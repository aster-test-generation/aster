/**
 * Generated by Aster
 */
package org.apache.commons.jxpath.ri.model.dom;
import org.apache.commons.jxpath.ri.model.NodePointer;
import org.w3c.dom.Node;
import org.apache.commons.jxpath.ri.compiler.NodeTypeTest;
import org.apache.commons.jxpath.ri.model.VariablePointer;
import org.apache.commons.jxpath.ri.QName;
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
import org.mockito.Mockito;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import static org.mockito.Mockito.*;
import java.lang.reflect.Field;   
@ExtendWith(MockitoExtension.class)
@MockitoSettings(strictness = Strictness.LENIENT)
public class Aster_DOMNodeIterator_Test_Passing {
@Mock
    private DOMNodePointer parentNodePointer;
@Mock
    private NodeTypeTest nodeTest;
@InjectMocks
    private DOMNodeIterator domNodeIterator;
@Mock
    private Node child;
@Mock
    private NodePointer parent;
    private int position = 0;
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetPosition() throws Exception {
        // Assuming DOMNodeIterator has a constructor that takes these parameters
        domNodeIterator = new DOMNodeIterator(parentNodePointer, nodeTest, false, null);
        // Set the initial position to a specific value to test retrieval
        // Using reflection to set private field, as there's no setter provided in the class definition
        java.lang.reflect.Field positionField = DOMNodeIterator.class.getDeclaredField("position");
        positionField.setAccessible(true);
        positionField.setInt(domNodeIterator, 5);
        // Test getPosition method
        int position = domNodeIterator.getPosition();
        // Verify the position is correctly retrieved
        assertEquals(5, position, "The position should be correctly retrieved as 5.");
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetPosition_eFqP0() {
    Node node = mock(Node.class);
    Locale locale = Locale.getDefault();
    QName qName = new QName("test");
    VariablePointer variablePointer = new VariablePointer(qName);
    DOMNodePointer domNodePointer = new DOMNodePointer(variablePointer, node);
    NodeTypeTest nodeTypeTest = new NodeTypeTest(1);
    DOMNodeIterator domNodeIterator = new DOMNodeIterator(domNodePointer, nodeTypeTest, false, domNodePointer);
    int expectedPosition = 0; // Assuming the position is initialized to 0 in the DOMNodeIterator constructor
    int actualPosition = domNodeIterator.getPosition();
    assertEquals(expectedPosition, actualPosition);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSetPositionForwardSuccess_wLyz0() {
    Node node = mock(Node.class);
    when(node.getFirstChild()).thenReturn(null);
    DOMNodePointer domNodePointer = new DOMNodePointer(node, Locale.getDefault());
    NodeTypeTest nodeTypeTest = new NodeTypeTest(1);
    DOMNodeIterator iterator = new DOMNodeIterator(domNodePointer, nodeTypeTest, false, null);
    boolean result = iterator.setPosition(1);
    assertTrue(result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSetPositionForwardFail_aSgw1() {
    Node node = mock(Node.class);
    when(node.getFirstChild()).thenReturn(null);
    DOMNodePointer domNodePointer = new DOMNodePointer(node, Locale.getDefault());
    NodeTypeTest nodeTypeTest = new NodeTypeTest(1);
    DOMNodeIterator iterator = new DOMNodeIterator(domNodePointer, nodeTypeTest, false, null);
    boolean result = iterator.setPosition(2);
    assertFalse(result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSetPositionBackwardSuccess_YKcC2() {
    Node node = mock(Node.class);
    when(node.getLastChild()).thenReturn(null);
    DOMNodePointer domNodePointer = new DOMNodePointer(node, Locale.getDefault());
    NodeTypeTest nodeTypeTest = new NodeTypeTest(1);
    DOMNodeIterator iterator = new DOMNodeIterator(domNodePointer, nodeTypeTest, true, null);
    boolean result = iterator.setPosition(1);
    assertTrue(result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSetPositionBackwardFail_VAUy3() {
    Node node = mock(Node.class);
    when(node.getLastChild()).thenReturn(null);
    DOMNodePointer domNodePointer = new DOMNodePointer(node, Locale.getDefault());
    NodeTypeTest nodeTypeTest = new NodeTypeTest(1);
    DOMNodeIterator iterator = new DOMNodeIterator(domNodePointer, nodeTypeTest, true, null);
    boolean result = iterator.setPosition(2);
    assertFalse(result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSetPositionZero_NkPz4() {
    Node node = mock(Node.class);
    DOMNodePointer domNodePointer = new DOMNodePointer(node, Locale.getDefault());
    NodeTypeTest nodeTypeTest = new NodeTypeTest(1);
    DOMNodeIterator iterator = new DOMNodeIterator(domNodePointer, nodeTypeTest, false, null);
    boolean result = iterator.setPosition(0);
    assertTrue(result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSetPositionToZero_oEgn0() {
    Node node = mock(Node.class);
    Locale locale = Locale.getDefault();
    DOMNodePointer domNodePointer = new DOMNodePointer(node, locale);
    NodeTypeTest nodeTest = new NodeTypeTest(1);
    DOMNodeIterator domNodeIterator = new DOMNodeIterator(domNodePointer, nodeTest, false, null);
    boolean result = domNodeIterator.setPosition(0);
    assertTrue(result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSetPositionForwardWithNoChildNodes_nZSK1() {
    Node node = mock(Node.class);
    when(node.getFirstChild()).thenReturn(null);
    Locale locale = Locale.getDefault();
    DOMNodePointer domNodePointer = new DOMNodePointer(node, locale);
    NodeTypeTest nodeTest = new NodeTypeTest(1);
    DOMNodeIterator domNodeIterator = new DOMNodeIterator(domNodePointer, nodeTest, false, null);
    boolean result = domNodeIterator.setPosition(1);
    assertFalse(result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSetPositionReverseWithNoChildNodes_IHUU2() {
    Node node = mock(Node.class);
    when(node.getLastChild()).thenReturn(null);
    Locale locale = Locale.getDefault();
    DOMNodePointer domNodePointer = new DOMNodePointer(node, locale);
    NodeTypeTest nodeTest = new NodeTypeTest(1);
    DOMNodeIterator domNodeIterator = new DOMNodeIterator(domNodePointer, nodeTest, true, null);
    boolean result = domNodeIterator.setPosition(1);
    assertFalse(result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSetPositionForwardWithValidChildNodes_ixwB3() {
    Node node = mock(Node.class);
    Node firstChild = mock(Node.class);
    when(node.getFirstChild()).thenReturn(firstChild);
    when(firstChild.getNextSibling()).thenReturn(null);
    Locale locale = Locale.getDefault();
    DOMNodePointer domNodePointer = new DOMNodePointer(node, locale);
    NodeTypeTest nodeTest = new NodeTypeTest(1);
    DOMNodeIterator domNodeIterator = new DOMNodeIterator(domNodePointer, nodeTest, false, null);
    boolean result = domNodeIterator.setPosition(1);
    assertTrue(result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSetPositionReverseWithValidChildNodes_PPrF4() {
    Node node = mock(Node.class);
    Node lastChild = mock(Node.class);
    when(node.getLastChild()).thenReturn(lastChild);
    when(lastChild.getPreviousSibling()).thenReturn(null);
    Locale locale = Locale.getDefault();
    DOMNodePointer domNodePointer = new DOMNodePointer(node, locale);
    NodeTypeTest nodeTest = new NodeTypeTest(1);
    DOMNodeIterator domNodeIterator = new DOMNodeIterator(domNodePointer, nodeTest, true, null);
    boolean result = domNodeIterator.setPosition(1);
    assertTrue(result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetNodePointer_WhenPositionIsZero_1() {
        domNodeIterator = new DOMNodeIterator((DOMNodePointer) parent, null, false, null);
        // Arrange
        when(parent.getNode()).thenReturn(child);
        // Act
        NodePointer result = domNodeIterator.getNodePointer();
        // Assert
        verify(parent).getNode();
        assertNotNull(result);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetNodePointer_WhenPositionIsZero_2() {
        domNodeIterator = new DOMNodeIterator((DOMNodePointer) parent, null, false, null);
        // Arrange
        when(parent.getNode()).thenReturn(child);
        // Act
        NodePointer result = domNodeIterator.getNodePointer();
        // Assert
        verify(parent).getNode();
        assertTrue(result instanceof DOMNodePointer);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetNodePointer_WhenChildIsNull() {
        domNodeIterator = new DOMNodeIterator((DOMNodePointer) parent, null, false, null);
        // Arrange
        when(parent.getNode()).thenReturn(null);
        // Act
        NodePointer result = domNodeIterator.getNodePointer();
        // Assert
        assertNull(result);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetNodePointer_WhenPositionIsNotZero_1() {
        domNodeIterator = new DOMNodeIterator((DOMNodePointer) parent, null, false, null);
        // Arrange
        domNodeIterator.setPosition(1); // Manually setting position to 1
        when(parent.getNode()).thenReturn(child);
        // Act
        NodePointer result = domNodeIterator.getNodePointer();
        // Assert
        verify(parent).getNode();
        assertNotNull(result);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetNodePointer_WhenPositionIsNotZero_2() {
        domNodeIterator = new DOMNodeIterator((DOMNodePointer) parent, null, false, null);
        // Arrange
        domNodeIterator.setPosition(1); // Manually setting position to 1
        when(parent.getNode()).thenReturn(child);
        // Act
        NodePointer result = domNodeIterator.getNodePointer();
        // Assert
        verify(parent).getNode();
        assertTrue(result instanceof DOMNodePointer);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSetPosition_DecreasePosition_Fail_QqMg0() {
    DOMNodePointer parentNodePointer = mock(DOMNodePointer.class);
    NodeTypeTest nodeTest = new NodeTypeTest(1);
    DOMNodeIterator domNodeiterator = new DOMNodeIterator(parentNodePointer, nodeTest, false, null);
    domNodeiterator.setPosition(5);
    reset(parentNodePointer); // Reset mocks to clear interactions
    when(parentNodePointer.getImmediateParentPointer()).thenReturn(parentNodePointer, parentNodePointer, null);
    boolean result = domNodeiterator.setPosition(0);
    verify(parentNodePointer, times(3)).getImmediateParentPointer();
    assertFalse(result, "setPosition should return false when unable to reach the desired position");
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSetPositionForwardSuccess_nUIE0_RKct0() {
    Node node = Mockito.mock(Node.class);
    Locale locale = new Locale("en");
    DOMNodePointer parent = new DOMNodePointer(node, locale);
    NodeTypeTest nodeTest = new NodeTypeTest(1);
    DOMNodeIterator iterator = new DOMNodeIterator(parent, nodeTest, false, null);
    assertTrue(iterator.setPosition(5));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSetPositionBackwardSuccess_Vbhc2_rcPf0() {
    Node node = Mockito.mock(Node.class); // Using Mockito to create a mock Node object
    Locale locale = new Locale("en");
    DOMNodePointer parent = new DOMNodePointer(node, locale);
    NodeTypeTest nodeTest = new NodeTypeTest(1);
    DOMNodeIterator iterator = new DOMNodeIterator(parent, nodeTest, true, null);
    assertTrue(iterator.setPosition(3));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetNodePointer_PositionZero_MgrY0_atxX0() {
    Locale locale = new Locale("en", "US");
    Node node = mock(Node.class); // Assuming Node is an interface from org.w3c.dom.Node
    DOMNodePointer parent = new DOMNodePointer(node, locale);
    NodeTypeTest nodeTest = new NodeTypeTest(1);
    DOMNodeIterator iterator = new DOMNodeIterator(parent, nodeTest, false, null);
    NodePointer result = iterator.getNodePointer();
    assertNull(result, "Expected null when child is not set");
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetNodePointer_ValidChild_Hwab2_eItt0_1() {
    Locale locale = new Locale("en", "US");
    Node node = mock(Node.class);
    Node childNode = mock(Node.class);
    DOMNodePointer parent = new DOMNodePointer(node, locale, null);
    NodeTypeTest nodeTest = new NodeTypeTest(1);
    DOMNodePointer startWith = new DOMNodePointer(childNode, locale, null);
    DOMNodeIterator iterator = new DOMNodeIterator(parent, nodeTest, false, startWith);
    iterator.setPosition(1); // Manually set position to simulate the condition
    NodePointer result = iterator.getNodePointer();
    assertNotNull(result, "Expected non-null NodePointer");}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetNodePointer_ValidChild_Hwab2_eItt0_2() {
    Locale locale = new Locale("en", "US");
    Node node = mock(Node.class);
    Node childNode = mock(Node.class);
    DOMNodePointer parent = new DOMNodePointer(node, locale, null);
    NodeTypeTest nodeTest = new NodeTypeTest(1);
    DOMNodePointer startWith = new DOMNodePointer(childNode, locale, null);
    DOMNodeIterator iterator = new DOMNodeIterator(parent, nodeTest, false, startWith);
    iterator.setPosition(1); // Manually set position to simulate the condition
    NodePointer result = iterator.getNodePointer();
    assertEquals(childNode, ((DOMNodePointer)result).getNode(), "Expected the child node to be set in NodePointer");}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetNodePointer_WhenPositionIsZero() {
        domNodeIterator = new DOMNodeIterator((DOMNodePointer) parent, null, false, null);
        // Arrange
        when(parent.getNode()).thenReturn(child);
        // Act
        NodePointer result = domNodeIterator.getNodePointer();
        // Assert
        assertNotNull(result);
        assertTrue(result instanceof DOMNodePointer);
        verify(parent).getNode();
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetNodePointer_WhenPositionIsNotZero() {
        domNodeIterator = new DOMNodeIterator((DOMNodePointer) parent, null, false, null);
        // Arrange
        domNodeIterator.setPosition(1); // Manually setting position to 1
        when(parent.getNode()).thenReturn(child);
        // Act
        NodePointer result = domNodeIterator.getNodePointer();
        // Assert
        assertNotNull(result);
        assertTrue(result instanceof DOMNodePointer);
        verify(parent).getNode();
    }
}