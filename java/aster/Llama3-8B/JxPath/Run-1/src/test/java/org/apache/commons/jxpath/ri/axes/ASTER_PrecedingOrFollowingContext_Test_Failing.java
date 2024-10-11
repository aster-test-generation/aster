/**
 * Generated by Aster
 */
package org.apache.commons.jxpath.ri.axes;

import java.util.Stack;
import java.util.concurrent.TimeUnit;
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

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
@MockitoSettings(strictness = Strictness.LENIENT)
public class Aster_PrecedingOrFollowingContext_Test_Failing {
    @Mock
    private NodeTypeTest nodeTest;
    @Mock
    private NamespaceContext namespaceContext;
    @Mock
    private SelfContext selfContext;
    @Mock
    private PrecedingOrFollowingContext precedingOrFollowingContext;
    private int position;
    @Mock
    private NodeTypeTest nodeTypeTest;
    private boolean reverse;
    private PrecedingOrFollowingContext precedingorfollowingcontext;
    @Mock
    private NodePointer nodePointer;
    @Mock
    private Stack stack;
    @Mock
    private NodeIterator nodeIterator;
    private boolean setStarted = false;
    private NodePointer currentNodePointer;
    private NodePointer currentRootLocation;

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testsetPosition() throws Exception {
        position = 5;
        precedingorfollowingcontext = new PrecedingOrFollowingContext(namespaceContext, nodeTest, false);
        // Arrange
        precedingorfollowingcontext.setPosition(position);
        // Assert
        verify(precedingorfollowingcontext, times(1)).setPosition(position);
        verify(precedingorfollowingcontext, times(1)).reset();
        verify(precedingorfollowingcontext, times(position)).nextNode();
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testgetDocumentOrder_1() {
        precedingorfollowingcontext = new PrecedingOrFollowingContext(namespaceContext, nodeTypeTest, reverse);
        // Set the reverse flag to true
        reverse = true;
        // Mock the getDocumentOrder method to return -1
        when(precedingorfollowingcontext.getDocumentOrder()).thenReturn(-1);
        // Assert that the getDocumentOrder method returns -1
        // Set the reverse flag to false
        reverse = false;
        // Mock the getDocumentOrder method to return 1
        when(precedingorfollowingcontext.getDocumentOrder()).thenReturn(1);
        // Assert that the getDocumentOrder method returns 1
        assertEquals(-1, precedingorfollowingcontext.getDocumentOrder());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testgetDocumentOrder_2() {
        precedingorfollowingcontext = new PrecedingOrFollowingContext(namespaceContext, nodeTypeTest, reverse);
        // Set the reverse flag to true
        reverse = true;
        // Mock the getDocumentOrder method to return -1
        when(precedingorfollowingcontext.getDocumentOrder()).thenReturn(-1);
        // Assert that the getDocumentOrder method returns -1
        // Set the reverse flag to false
        reverse = false;
        // Mock the getDocumentOrder method to return 1
        when(precedingorfollowingcontext.getDocumentOrder()).thenReturn(1);
        // Assert that the getDocumentOrder method returns 1
        assertEquals(1, precedingorfollowingcontext.getDocumentOrder());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetCurrentNodePointer_LLLc0() {
        SelfContext parentContext = new SelfContext(new NamespaceContext(null, new NodeTypeTest(0)), new NodeTypeTest(0));
        NodeTypeTest nodeTest = new NodeTypeTest(0);
        PrecedingOrFollowingContext context = new PrecedingOrFollowingContext(parentContext, nodeTest, false);
        NodePointer result = context.getCurrentNodePointer();
        assert result != null;
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testgetDocumentOrder() {
        precedingorfollowingcontext = new PrecedingOrFollowingContext(namespaceContext, nodeTypeTest, reverse);
        // Set the reverse flag to true
        reverse = true;
        // Mock the getDocumentOrder method to return -1
        when(precedingorfollowingcontext.getDocumentOrder()).thenReturn(-1);
        // Assert that the getDocumentOrder method returns -1
        assertEquals(-1, precedingorfollowingcontext.getDocumentOrder());
        // Set the reverse flag to false
        reverse = false;
        // Mock the getDocumentOrder method to return 1
        when(precedingorfollowingcontext.getDocumentOrder()).thenReturn(1);
        // Assert that the getDocumentOrder method returns 1
        assertEquals(1, precedingorfollowingcontext.getDocumentOrder());
    }
}