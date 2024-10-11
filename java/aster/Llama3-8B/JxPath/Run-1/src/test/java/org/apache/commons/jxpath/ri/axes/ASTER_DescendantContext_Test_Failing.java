/**
 * Generated by Aster
 */
package org.apache.commons.jxpath.ri.axes;

import java.util.Stack;
import java.util.concurrent.TimeUnit;
import org.apache.commons.jxpath.ri.compiler.NodeTypeTest;
import org.apache.commons.jxpath.ri.model.NodeIterator;
import org.apache.commons.jxpath.ri.model.NodePointer;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import org.mockito.junit.jupiter.MockitoSettings;
import org.mockito.quality.Strictness;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

@ExtendWith(MockitoExtension.class)
@MockitoSettings(strictness = Strictness.LENIENT)
public class Aster_DescendantContext_Test_Failing {
    @Mock
    private NodeTypeTest nodeTest;
    @Mock
    private NamespaceContext namespaceContext;
    @Mock
    private SelfContext selfContext;
    @Mock
    private Object superObject;
    private boolean setStarted = false;
    @Mock
    private DescendantContext descendantcontext;
    @Mock
    private NodePointer nodePointer;
    private DescendantContext descendantContext;
    @Mock
    private NamespaceContext parentContext;
    @Mock
    private NodeIterator nodeIterator;
    @Mock
    private NodeTypeTest nodeTypeTest;
    private NodePointer currentNodePointer = null;
    private Stack stack = null;

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testsetPosition() throws Exception {
        DescendantContext descendantContext = new DescendantContext(namespaceContext, true, nodeTest);
        this.descendantcontext = descendantContext;
        // Arrange
        int position = 5;
        int initialPosition = 3;
        boolean expectedResult = true;
        // Act
        boolean result = descendantcontext.setPosition(position);
        // Assert
        Mockito.verify(descendantcontext).reset();
        Mockito.verify(descendantcontext, Mockito.times(position - initialPosition)).nextNode();
        Assertions.assertEquals(expectedResult, result);
    }
}