/**
 * Generated by Aster
 */
package org.apache.commons.jxpath.ri.axes;

import java.util.concurrent.TimeUnit;
import org.apache.commons.jxpath.BasicNodeSet;
import org.apache.commons.jxpath.Pointer;
import org.apache.commons.jxpath.ri.EvalContext;
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
public class Aster_UnionContext_Test_Failing {
    private EvalContext[] contexts;
    private boolean prepared;
    @Mock
    private EvalContext evalContext1;
    @Mock
    private EvalContext evalContext2;
    @Mock
    private NodePointer nodePointer1;
    @Mock
    private NodePointer nodePointer2;
    @Mock
    private BasicNodeSet nodeSet;
    @Mock
    private Pointer pointer1;
    @Mock
    private Pointer pointer2;
    UnionContext unionContext;

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testsetPosition7_Ywwj6_fid1() {
        NodeTypeTest nodeTypeTest = new NodeTypeTest(1);
        NamespaceContext namespaceContext = new NamespaceContext(new SelfContext(new NamespaceContext(null, nodeTypeTest), nodeTypeTest), nodeTypeTest);
        EvalContext[] contexts = new EvalContext[0];
        UnionContext unionContext = new UnionContext(namespaceContext, contexts);
        assertTrue(unionContext.setPosition(1));
    }
}