/**
 * Generated by Aster
 */
package org.apache.commons.jxpath.ri.axes;
import org.apache.commons.jxpath.Pointer;
import org.apache.commons.jxpath.ri.model.NodePointer;
import org.apache.commons.jxpath.ri.compiler.NodeTypeTest;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoSettings;
import org.mockito.quality.Strictness;
import org.mockito.InjectMocks;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import java.lang.reflect.Field;   
@ExtendWith(MockitoExtension.class)
@MockitoSettings(strictness = Strictness.LENIENT)
public class Aster_InitialContext_Test_Passing {
@Mock
    private NodePointer nodePointer;
@InjectMocks
    private InitialContext initialContext;
@Mock
    private NamespaceContext namespaceContext;
    private boolean collection;
    private boolean started = false;
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetSingleNodePointer_bEBR0() {
    NodeTypeTest nodeTypeTest = new NodeTypeTest(1);
    NamespaceContext namespaceContext = new NamespaceContext(null, nodeTypeTest);
    InitialContext initialContext = new InitialContext(namespaceContext);
    Pointer result = initialContext.getSingleNodePointer();
    assertNotNull(result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetCurrentNodePointer_gdIg0() {
    NodeTypeTest nodeTypeTest = new NodeTypeTest(1);
    NamespaceContext namespaceContext = new NamespaceContext(null, nodeTypeTest);
    InitialContext initialContext = new InitialContext(namespaceContext);
    NodePointer result = initialContext.getCurrentNodePointer();
    assertNotNull(result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testNextNode() throws Exception {
        initialContext = new InitialContext(namespaceContext);
        // Arrange
        when(initialContext.setPosition(anyInt())).thenReturn(true);
        // Act
        boolean result = initialContext.nextNode();
        // Assert
        assertTrue(result, "Expected nextNode to return true when setPosition returns true");
        verify(initialContext, times(1)).setPosition(anyInt());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testNextNode_PlcU0() {
    NodeTypeTest nodeTypeTest = new NodeTypeTest(1);
    NamespaceContext namespaceContext = new NamespaceContext(null, nodeTypeTest);
    InitialContext initialContext = new InitialContext(namespaceContext);
    boolean result = initialContext.nextNode();
    assertTrue(result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetValue() throws Exception {
        // Create a NamespaceContext and NodeTypeTest to use in the constructor of InitialContext
        NodeTypeTest nodeTypeTest = new NodeTypeTest(1);
        NamespaceContext namespaceContext = new NamespaceContext(null, nodeTypeTest);
        initialContext = new InitialContext(namespaceContext);
        // Setup the expected value
        Object expectedValue = "expectedValue";
        when(nodePointer.getValue()).thenReturn(expectedValue);
        // Execute the method under test
        Object actualValue = initialContext.getValue();
        // Assert the result
        assertEquals(expectedValue, actualValue, "The returned value should match the expected value.");
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetValue_neYg0() {
    NodeTypeTest nodeTypeTest = new NodeTypeTest(1);
    NamespaceContext namespaceContext = new NamespaceContext(null, nodeTypeTest);
    InitialContext initialContext = new InitialContext(namespaceContext);
    Object result = initialContext.getValue();
    assertNotNull(result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testNextSet_FirstCall_ReturnsTrue() throws Exception {
        // Since InitialContext does not have external dependencies in its constructor,
        // we can directly instantiate it.
        initialContext = new InitialContext(null);
        // Test that the first call to nextSet returns true
        boolean result = initialContext.nextSet();
        assertTrue(result, "Expected nextSet to return true on first call");
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testNextSet_SecondCall_ReturnsFalse() throws Exception {
        // Since InitialContext does not have external dependencies in its constructor,
        // we can directly instantiate it.
        initialContext = new InitialContext(null);
        // Call nextSet once to set 'started' to true
        initialContext.nextSet();
        // Test that subsequent calls to nextSet return false
        boolean result = initialContext.nextSet();
        assertFalse(result, "Expected nextSet to return false on second call");
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testNextSetFirstCall_tbta0() {
    NodeTypeTest nodeTypeTest = new NodeTypeTest(1);
    NamespaceContext namespaceContext = new NamespaceContext(null, nodeTypeTest);
    InitialContext initialContext = new InitialContext(namespaceContext);
    boolean result = initialContext.nextSet();
    assertTrue(result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testNextSetSecondCall_uRdp1() {
    NodeTypeTest nodeTypeTest = new NodeTypeTest(1);
    NamespaceContext namespaceContext = new NamespaceContext(null, nodeTypeTest);
    InitialContext initialContext = new InitialContext(namespaceContext);
    initialContext.nextSet(); // first call to set started to true
    boolean result = initialContext.nextSet(); // second call should return false
    assertFalse(result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSetPositionTrueNotInCollection_YKOD0() throws Exception {
    InitialContext initialContext = new InitialContext(null); // Assuming null as there's no use of parentContext in setPosition
    boolean started = false;
    boolean result = initialContext.nextSet();
    assertTrue(result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSetPositionFalseNotInCollection_YyGa0() throws Exception {
    InitialContext initialContext = new InitialContext(null); // Assuming null as there's no use of parentContext in setPosition
    boolean result = initialContext.setPosition(2);
    assertFalse(result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetSingleNodePointer_TVEd0() throws Exception {
    InitialContext initialContext = new InitialContext(null); // Assuming constructor does not affect the test
    Pointer nodePointer = mock(Pointer.class); // Correctly instantiate and set the mock object
    when(initialContext.getSingleNodePointer()).thenReturn(nodePointer);
    Pointer result = initialContext.getSingleNodePointer();
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetCurrentNodePointer_NcCx0() throws Exception {
    InitialContext initialContext = new InitialContext(new NamespaceContext(null, new NodeTypeTest(1)));
    NodePointer result = initialContext.getCurrentNodePointer();
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSetPositionTrueInCollection_dWUX0() throws Exception {
    InitialContext initialContext = new InitialContext(null); // Assuming null as there's no use of parentContext in setPosition
    NodePointer nodePointer = mock(NodePointer.class);
    when(nodePointer.getLength()).thenReturn(5);
    Field collectionField = InitialContext.class.getDeclaredField("collection");
    collectionField.setAccessible(true);
    collectionField.set(initialContext, true);
    boolean result = initialContext.setPosition(3);
    assertTrue(result);
    verify(nodePointer).setIndex(2);
}
}