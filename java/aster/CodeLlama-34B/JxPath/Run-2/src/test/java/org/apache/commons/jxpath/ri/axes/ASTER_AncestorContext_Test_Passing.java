/**
 * Generated by Aster
 */
package org.apache.commons.jxpath.ri.axes;

import java.util.concurrent.TimeUnit;
import org.apache.commons.jxpath.ri.compiler.NodeTest;
import org.apache.commons.jxpath.ri.compiler.NodeTypeTest;
import org.apache.commons.jxpath.ri.model.NodePointer;
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
public class Aster_AncestorContext_Test_Passing {
    private NodePointer currentNodePointer;
    private boolean setStarted = false;
    private boolean includeSelf;
    private NodeTest nodeTest;

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetDocumentOrder1_VJDE0() {
        NamespaceContext namespaceContext = new NamespaceContext(null, new NodeTypeTest(1));
        SelfContext selfContext = new SelfContext(namespaceContext, new NodeTypeTest(2));
        AncestorContext ancestorContext = new AncestorContext(selfContext, true, new NodeTypeTest(3));
        int result = ancestorContext.getDocumentOrder();
        assertEquals(-1, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetDocumentOrder2_YQKL1() {
        NamespaceContext namespaceContext = new NamespaceContext(null, new NodeTypeTest(1));
        SelfContext selfContext = new SelfContext(namespaceContext, new NodeTypeTest(2));
        AncestorContext ancestorContext = new AncestorContext(selfContext, false, new NodeTypeTest(3));
        int result = ancestorContext.getDocumentOrder();
        assertEquals(-1, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetPosition_positionGreaterThanCurrentPosition_Rhme0_fid1() {
        AncestorContext ancestorContext = new AncestorContext(new NamespaceContext(new SelfContext(new NamespaceContext(null, new NodeTypeTest(1)), new NodeTypeTest(2)), new NodeTypeTest(3)), true, new NodeTypeTest(4));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testNextNode_includeSelfTrue_nodeTestMatches_ZTDH0_fid1() {
        NamespaceContext parentContext = new NamespaceContext(null, new NodeTypeTest(1));
        SelfContext selfContext = new SelfContext(parentContext, new NodeTypeTest(1));
        AncestorContext ancestorContext = new AncestorContext(selfContext, true, new NodeTypeTest(1));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testNextNode_includeSelfFalse_nodeTestMatches_FxTT2_fid1() {
        NamespaceContext parentContext = new NamespaceContext(null, new NodeTypeTest(1));
        SelfContext selfContext = new SelfContext(parentContext, new NodeTypeTest(1));
        AncestorContext ancestorContext = new AncestorContext(selfContext, false, new NodeTypeTest(1));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testNextNode_includeSelfFalse_nodeTestDoesNotMatch_KNUk3_fid1() {
        NamespaceContext parentContext = new NamespaceContext(null, new NodeTypeTest(1));
        SelfContext selfContext = new SelfContext(parentContext, new NodeTypeTest(1));
        AncestorContext ancestorContext = new AncestorContext(selfContext, false, new NodeTypeTest(2));
    }
}