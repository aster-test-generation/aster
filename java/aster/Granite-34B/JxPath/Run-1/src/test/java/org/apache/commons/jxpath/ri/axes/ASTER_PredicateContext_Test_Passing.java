/**
 * Generated by Aster
 */
package org.apache.commons.jxpath.ri.axes;

import java.util.concurrent.TimeUnit;
import org.apache.commons.jxpath.ri.compiler.Constant;
import org.apache.commons.jxpath.ri.compiler.Expression;
import org.apache.commons.jxpath.ri.compiler.NodeTypeTest;
import org.apache.commons.jxpath.ri.model.beans.PropertyPointer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import org.mockito.junit.jupiter.MockitoSettings;
import org.mockito.quality.Strictness;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
@MockitoSettings(strictness = Strictness.LENIENT)
public class Aster_PredicateContext_Test_Passing {
    private Expression nameTestExpression;
    private PropertyPointer dynamicPropertyPointer;
    PredicateContext predicatecontext;
    private boolean done = false;
    private Expression expression;
    NamespaceContext namespacecontext;
    SelfContext selfcontext;
    NodeTypeTest nodetypetest;
    Constant constant;

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetPosition_whenNameTestExpressionIsNull_IJLN0() {
        PredicateContext predicateContext = new PredicateContext(new NamespaceContext(new SelfContext(null, new NodeTypeTest(1)), new NodeTypeTest(1)), new Constant(""));
        int position = 1;
        boolean result = predicateContext.setPosition(position);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetPosition_whenPositionIsInvalid_uVBu2() {
        PredicateContext predicateContext = new PredicateContext(new NamespaceContext(new SelfContext(null, new NodeTypeTest(1)), new NodeTypeTest(1)), new Constant(""));
        int position = 0;
        boolean result = predicateContext.setPosition(position);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetPositionWhenNameTestExpressionIsNullOrEmpty_iWwG0() {
        PredicateContext context = new PredicateContext(new NamespaceContext(new SelfContext(null, new NodeTypeTest(1)), new NodeTypeTest(1)), new Constant(""));
        boolean result = context.setPosition(1);
        assertFalse(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetPositionWhenPositionIsInvalid_YKLQ2() {
        PredicateContext context = new PredicateContext(new NamespaceContext(new SelfContext(null, new NodeTypeTest(1)), new NodeTypeTest(1)), new Constant(""));
        boolean result = context.setPosition(0);
        assertTrue(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testReset_NBZR0() {
        NamespaceContext namespaceContext = new NamespaceContext(new SelfContext(null, new NodeTypeTest(1)), new NodeTypeTest(1));
        Constant constant = new Constant("string");
        PredicateContext predicateContext = new PredicateContext(namespaceContext, constant);
        predicateContext.reset();
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testNextNodeWhenDone_VGBw0() {
        NamespaceContext namespaceContext = new NamespaceContext(new SelfContext(new NamespaceContext(null, new NodeTypeTest(1)), new NodeTypeTest(1)), new NodeTypeTest(1));
        Constant constant = new Constant("string");
        PredicateContext predicateContext = new PredicateContext(namespaceContext, constant);
        boolean result = predicateContext.nextNode();
        assert !result;
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testnextSet() throws Exception {
        namespacecontext = mock(NamespaceContext.class);
        selfcontext = mock(SelfContext.class);
        nodetypetest = mock(NodeTypeTest.class);
        constant = mock(Constant.class);
        predicatecontext = new PredicateContext(namespacecontext, constant);
        when(namespacecontext.nextSet()).thenReturn(true);
        assertTrue(predicatecontext.nextSet());
    }
}