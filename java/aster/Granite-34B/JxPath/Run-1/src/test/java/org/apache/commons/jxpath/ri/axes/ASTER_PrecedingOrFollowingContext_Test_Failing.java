/**
 * Generated by Aster
 */
package org.apache.commons.jxpath.ri.axes;

import java.util.Stack;
import java.util.concurrent.TimeUnit;
import org.apache.commons.jxpath.ri.compiler.NodeTest;
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

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

@ExtendWith(MockitoExtension.class)
@MockitoSettings(strictness = Strictness.LENIENT)
public class Aster_PrecedingOrFollowingContext_Test_Failing {
    @Mock
    NamespaceContext namespacecontext;
    @Mock
    NodeTypeTest nodetypetest;
    @Mock
    SelfContext selfcontext;
    PrecedingOrFollowingContext precedingorfollowingcontext;
    private boolean reverse;
    private boolean setStarted = false;
    private NodePointer currentNodePointer;
    private NodeTest nodeTest;
    private NodePointer currentRootLocation;
    private Stack stack = null;

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testNextNode_iMuh0() {
        NodeTypeTest nodeTypeTest = new NodeTypeTest(1);
        NamespaceContext namespaceContext = new NamespaceContext(null, nodeTypeTest);
        SelfContext selfContext = new SelfContext(namespaceContext, nodeTypeTest);
        PrecedingOrFollowingContext precedingOrFollowingContext = new PrecedingOrFollowingContext(selfContext, nodeTypeTest, true);
        boolean result = precedingOrFollowingContext.nextNode();
        assertTrue(result);
    }
}