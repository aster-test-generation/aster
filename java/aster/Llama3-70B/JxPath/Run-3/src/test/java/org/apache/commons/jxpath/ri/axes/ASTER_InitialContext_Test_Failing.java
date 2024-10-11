/**
 * Generated by Aster
 */
package org.apache.commons.jxpath.ri.axes;

import java.util.concurrent.TimeUnit;
import org.apache.commons.jxpath.Pointer;
import org.apache.commons.jxpath.ri.compiler.NodeTypeTest;
import org.apache.commons.jxpath.ri.model.NodePointer;
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
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
@MockitoSettings(strictness = Strictness.LENIENT)
public class Aster_InitialContext_Test_Failing {
    @Mock
    private NodePointer nodePointer;
    private boolean collection = true;
    private InitialContext initialContext;
    @Mock
    private NamespaceContext namespaceContext;
    @Mock
    private SelfContext selfContext;
    @Mock
    private NodeTypeTest nodeTypeTest;
    private boolean started = false;

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testnextNode() throws Exception {
        nodeTypeTest = new NodeTypeTest(1);
        selfContext = new SelfContext(null, nodeTypeTest);
        namespaceContext = new NamespaceContext(selfContext, nodeTypeTest);
        initialContext = new InitialContext(namespaceContext);
        // given
        when(initialContext.setPosition(anyInt())).thenReturn(true);
        // when
        boolean result = initialContext.nextNode();
        // then
        verify(initialContext).setPosition(1);
        assertTrue(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testnextSet_1() throws Exception {
        NodeTypeTest nodeTypeTest = mock(NodeTypeTest.class);
        SelfContext selfContext = mock(SelfContext.class);
        NamespaceContext namespaceContext = mock(NamespaceContext.class);
        initialContext = new InitialContext(namespaceContext);
        // First call should return true
        // Second call should return false
        assertTrue(initialContext.nextSet());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testnextSet_2() throws Exception {
        NodeTypeTest nodeTypeTest = mock(NodeTypeTest.class);
        SelfContext selfContext = mock(SelfContext.class);
        NamespaceContext namespaceContext = mock(NamespaceContext.class);
        initialContext = new InitialContext(namespaceContext);
        // First call should return true
        // Second call should return false
        assertFalse(initialContext.nextSet());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetSingleNodePointer_DNxY0() {
        NodeTypeTest nodeTypeTest = new NodeTypeTest(1);
        SelfContext selfContext = new SelfContext(null, nodeTypeTest);
        NamespaceContext namespaceContext = new NamespaceContext(selfContext, nodeTypeTest);
        InitialContext initialContext = new InitialContext(namespaceContext);
        initialContext.setPosition(1); // Set position to 1
        Pointer pointer = initialContext.getSingleNodePointer();
        assertNotNull(pointer);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetValue_MRZn0() {
        NodeTypeTest nodeTypeTest = new NodeTypeTest(1);
        SelfContext selfContext = new SelfContext(null, nodeTypeTest);
        NamespaceContext namespaceContext = new NamespaceContext(selfContext, nodeTypeTest);
        InitialContext initialContext = new InitialContext(namespaceContext);
        initialContext.setPosition(1); // Set position to 1
        Object result = initialContext.getValue();
        assertNotNull(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testNextNode_jhSX0() {
        NodeTypeTest nodeTypeTest = new NodeTypeTest(1);
        SelfContext selfContext = new SelfContext(null, nodeTypeTest);
        NamespaceContext namespaceContext = new NamespaceContext(selfContext, nodeTypeTest);
        InitialContext initialContext = new InitialContext(namespaceContext);
        initialContext.setPosition(1);
        assertFalse(initialContext.setPosition(2));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testNextSet_StartedFalse_cwfC0() {
        NodeTypeTest nodeTypeTest = new NodeTypeTest(1);
        SelfContext selfContext = new SelfContext(null, nodeTypeTest);
        NamespaceContext namespaceContext = new NamespaceContext(selfContext, nodeTypeTest);
        InitialContext initialContext = new InitialContext(namespaceContext);
        initialContext.setPosition(1); // Set the position to 1
        boolean result = initialContext.setPosition(1); // Call setPosition before nextSet
        result = initialContext.nextSet();
        assertTrue(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testNextSet_StartedTrue_TSoo1() {
        NodeTypeTest nodeTypeTest = new NodeTypeTest(1);
        SelfContext selfContext = new SelfContext(null, nodeTypeTest);
        NamespaceContext namespaceContext = new NamespaceContext(selfContext, nodeTypeTest);
        InitialContext initialContext = new InitialContext(namespaceContext);
        initialContext.setPosition(1);
        boolean result = initialContext.nextSet();
        assertTrue(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetSingleNodePointer_DNxY0_fid1() {
        NodeTypeTest nodeTypeTest = new NodeTypeTest(1);
        SelfContext selfContext = new SelfContext(null, nodeTypeTest);
        NamespaceContext namespaceContext = new NamespaceContext(selfContext, nodeTypeTest);
        InitialContext initialContext = new InitialContext(namespaceContext);
        Pointer pointer = initialContext.getSingleNodePointer();
        assertNotNull(pointer);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetValue_MRZn0_fid1() {
        NodeTypeTest nodeTypeTest = new NodeTypeTest(1);
        SelfContext selfContext = new SelfContext(null, nodeTypeTest);
        NamespaceContext namespaceContext = new NamespaceContext(selfContext, nodeTypeTest);
        InitialContext initialContext = new InitialContext(namespaceContext);
        Object result = initialContext.getValue();
        assertNotNull(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testNextNode_jhSX0_fid1() {
        NodeTypeTest nodeTypeTest = new NodeTypeTest(1);
        SelfContext selfContext = new SelfContext(null, nodeTypeTest);
        NamespaceContext namespaceContext = new NamespaceContext(selfContext, nodeTypeTest);
        InitialContext initialContext = new InitialContext(namespaceContext);
        assertTrue(initialContext.nextNode());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testNextSet_StartedFalse_cwfC0_fid1() {
        NodeTypeTest nodeTypeTest = new NodeTypeTest(1);
        SelfContext selfContext = new SelfContext(null, nodeTypeTest);
        NamespaceContext namespaceContext = new NamespaceContext(selfContext, nodeTypeTest);
        InitialContext initialContext = new InitialContext(namespaceContext);
        boolean result = initialContext.nextSet();
        assert result;
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testNextSet_StartedTrue_TSoo1_fid1() {
        NodeTypeTest nodeTypeTest = new NodeTypeTest(1);
        SelfContext selfContext = new SelfContext(null, nodeTypeTest);
        NamespaceContext namespaceContext = new NamespaceContext(selfContext, nodeTypeTest);
        InitialContext initialContext = new InitialContext(namespaceContext);
        initialContext.nextSet();
        boolean result = initialContext.nextSet();
        assertFalse(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testgetSingleNodePointer_DTkR0() throws Exception {
        NodeTypeTest nodeTypeTest = new NodeTypeTest(1);
        SelfContext selfContext = new SelfContext(null, nodeTypeTest);
        NamespaceContext namespaceContext = new NamespaceContext(selfContext, nodeTypeTest);
        InitialContext initialContext = new InitialContext(namespaceContext);
        Pointer nodePointer = initialContext.getSingleNodePointer(); // Initialize nodePointer
        assertEquals(nodePointer, initialContext.getSingleNodePointer());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testnextSet() throws Exception {
        NodeTypeTest nodeTypeTest = mock(NodeTypeTest.class);
        SelfContext selfContext = mock(SelfContext.class);
        NamespaceContext namespaceContext = mock(NamespaceContext.class);
        initialContext = new InitialContext(namespaceContext);
        // First call should return true
        assertTrue(initialContext.nextSet());
        // Second call should return false
        assertFalse(initialContext.nextSet());
    }
}