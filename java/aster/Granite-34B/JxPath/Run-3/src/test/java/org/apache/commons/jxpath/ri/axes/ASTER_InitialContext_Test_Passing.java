/**
 * Generated by Aster
 */
package org.apache.commons.jxpath.ri.axes;

import java.util.concurrent.TimeUnit;
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

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

@ExtendWith(MockitoExtension.class)
@MockitoSettings(strictness = Strictness.LENIENT)
public class Aster_InitialContext_Test_Passing {
    private NodePointer nodePointer;
    private boolean collection;
    InitialContext initialcontext;
    @Mock
    NamespaceContext namespacecontext;
    @Mock
    SelfContext selfContext;
    @Mock
    NodeTypeTest nodeTypeTest;
    private boolean started = false;

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testnextSet() throws Exception {
        NamespaceContext namespacecontext = new NamespaceContext(null, new NodeTypeTest(0));
        SelfContext selfcontext = new SelfContext(namespacecontext, new NodeTypeTest(0));
        initialcontext = new InitialContext(selfcontext);
        boolean actual = initialcontext.nextSet();
        boolean expected = true;
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testNextNode_QNmV0() throws Exception {
        NamespaceContext namespaceContext = new NamespaceContext(new SelfContext(new NamespaceContext(null, new NodeTypeTest(0)), new NodeTypeTest(0)), new NodeTypeTest(0));
        InitialContext initialContext = new InitialContext(namespaceContext);
        boolean result = initialContext.nextNode();
        assert result == true;
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetPositionWhenCollectionAndPositionIsOne_qaMQ0() throws Exception {
        InitialContext context = new InitialContext(new NamespaceContext(new SelfContext(null, new NodeTypeTest(1)), null));
        context.setPosition(1);
        assertEquals(1, context.getPosition());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetPositionWhenCollectionAndPositionIsInvalid_ngIb1() throws Exception {
        InitialContext context = new InitialContext(new NamespaceContext(new SelfContext(null, new NodeTypeTest(1)), null));
        context.setPosition(0);
        assertEquals(0, context.getPosition());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetPositionWhenNotCollectionAndPositionIsInvalid_ZYes3() throws Exception {
        InitialContext context = new InitialContext(new NamespaceContext(new SelfContext(null, new NodeTypeTest(1)), null));
        context.setPosition(2);
        assertEquals(2, context.getPosition());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testNextSet_PNzA0() throws Exception {
        NamespaceContext namespaceContext = new NamespaceContext(new SelfContext(new NamespaceContext(null, new NodeTypeTest(1)), new NodeTypeTest(1)), new NodeTypeTest(1));
        InitialContext initialContext = new InitialContext(namespaceContext);
        boolean actual = initialContext.nextSet();
        boolean expected = true;
        assert actual == expected;
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testNextSet2_Kfcg1() throws Exception {
        NamespaceContext namespaceContext = new NamespaceContext(new SelfContext(new NamespaceContext(null, new NodeTypeTest(1)), new NodeTypeTest(1)), new NodeTypeTest(1));
        InitialContext initialContext = new InitialContext(namespaceContext);
        boolean actual = initialContext.nextSet();
        boolean expected = false;
        assert actual == expected;
    }
}