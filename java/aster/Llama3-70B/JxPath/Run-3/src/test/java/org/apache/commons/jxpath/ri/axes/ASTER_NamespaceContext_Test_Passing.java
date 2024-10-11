/**
 * Generated by Aster
 */
package org.apache.commons.jxpath.ri.axes;

import java.util.concurrent.TimeUnit;
import org.apache.commons.jxpath.ri.QName;
import org.apache.commons.jxpath.ri.compiler.NodeNameTest;
import org.apache.commons.jxpath.ri.compiler.NodeTest;
import org.apache.commons.jxpath.ri.compiler.NodeTypeTest;
import org.apache.commons.jxpath.ri.model.NodeIterator;
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
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
@MockitoSettings(strictness = Strictness.LENIENT)
public class Aster_NamespaceContext_Test_Passing {
    @Mock
    private SelfContext selfContext;
    @Mock
    private NodeTypeTest nodeTypeTest;
    private NamespaceContext namespaceContext;
    @Mock
    private NodeIterator iterator;
    private NodePointer currentNodePointer;
    @Mock
    private NodeTest nodeTest;
    @Mock
    private SelfContext parentContext;
    @Mock
    private NodePointer parentCurrentNodePointer;
    private boolean setStarted = false;

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testReset_2() throws Exception {
        namespaceContext = new NamespaceContext(null, new NodeTypeTest(1));
        iterator = iterator;
        setStarted = true;
        namespaceContext.reset();
        assertTrue(setStarted);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testNextNode_IteratorIsNull_ReturnsFalse() throws Exception {
        namespaceContext = new NamespaceContext(parentContext, nodeTest);
        // Arrange
        namespaceContext.nextNode(); // setStarted = true
        // Act
        boolean result = namespaceContext.nextNode();
        // Assert
        assertFalse(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testNextNode_IteratorHasNext_ReturnsTrue() throws Exception {
        namespaceContext = new NamespaceContext(parentContext, nodeTest);
        // Arrange
        namespaceContext.nextNode(); // setStarted = true
        when(iterator.setPosition(1)).thenReturn(true);
        when(iterator.getNodePointer()).thenReturn(currentNodePointer);
        // Act
        boolean result = namespaceContext.nextNode();
        // Assert
        assertFalse(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetCurrentNodePointer_NAka0() {
        NodeTypeTest nodeTypeTest = new NodeTypeTest(1);
        SelfContext selfContext = new SelfContext(null, nodeTypeTest);
        NamespaceContext namespaceContext = new NamespaceContext(selfContext, nodeTypeTest);
        NodePointer nodePointer = namespaceContext.getCurrentNodePointer();
        assertNull(nodePointer);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void setPosition_test1_zcHM0() {
        SelfContext selfContext = new SelfContext(null, new NodeTypeTest(1));
        NamespaceContext namespaceContext = new NamespaceContext(selfContext, new NodeTypeTest(1));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void setPosition_test2_hYQt1() {
        SelfContext selfContext = new SelfContext(null, new NodeTypeTest(1));
        NamespaceContext namespaceContext = new NamespaceContext(selfContext, new NodeTypeTest(1));
        namespaceContext.getCurrentPosition(); // assume this returns 10
        assertFalse(namespaceContext.setPosition(5));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void setPosition_test3_qwKq2() {
        SelfContext selfContext = new SelfContext(null, new NodeTypeTest(1));
        NamespaceContext namespaceContext = new NamespaceContext(selfContext, new NodeTypeTest(1));
        namespaceContext.getCurrentPosition(); // assume this returns 5
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testNextNode1_qDqV0() {
        NodeTypeTest nodeTypeTest = new NodeTypeTest(1);
        SelfContext selfContext = new SelfContext(null, nodeTypeTest);
        NamespaceContext namespaceContext = new NamespaceContext(selfContext, nodeTypeTest);
        boolean result = namespaceContext.nextNode();
        assert !result;
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void setup_oMhH0() {
        NodeTypeTest nodeTypeTest = new NodeTypeTest(1);
        SelfContext selfContext = new SelfContext(new NamespaceContext(null, null), nodeTypeTest);
        namespaceContext = new NamespaceContext(selfContext, nodeTypeTest);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testNextNode3_ehuX2_mhzT0() {
        NodeTypeTest nodeTypeTest = new NodeTypeTest(1);
        QName testName = new QName("uri", "name");
        NodeNameTest nodeNameTest = new NodeNameTest(testName);
        SelfContext selfContext = new SelfContext(null, nodeNameTest);
        NamespaceContext namespaceContext = new NamespaceContext(selfContext, nodeNameTest);
        boolean result = namespaceContext.nextNode();
        assert !result;
    }
}