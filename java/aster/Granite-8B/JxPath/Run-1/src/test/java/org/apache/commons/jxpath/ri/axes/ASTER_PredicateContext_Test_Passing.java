/**
 * Generated by Aster
 */
package org.apache.commons.jxpath.ri.axes;

import java.util.Iterator;
import java.util.concurrent.TimeUnit;
import org.apache.commons.jxpath.ri.compiler.Constant;
import org.apache.commons.jxpath.ri.compiler.Expression;
import org.apache.commons.jxpath.ri.compiler.NodeTypeTest;
import org.apache.commons.jxpath.ri.model.NodePointer;
import org.apache.commons.jxpath.ri.model.beans.PropertyPointer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.mockito.junit.jupiter.MockitoSettings;
import org.mockito.quality.Strictness;

import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

@ExtendWith(MockitoExtension.class)
@MockitoSettings(strictness = Strictness.LENIENT)
public class Aster_PredicateContext_Test_Passing {
    private NamespaceContext namespaceContext;
    @Mock
    private Constant constant;
    private NodeTypeTest nodeTypeTest;
    private Expression nameTestExpression;
    private PropertyPointer dynamicPropertyPointer;
    private PredicateContext predicatecontext;
    @Mock
    private NamespaceContext parentContext;
    @Mock
    private NodeTypeTest nodeTest;
    @Mock
    private SelfContext selfContext;
    @Mock
    private Constant expression;
    private boolean done = false;
    @Mock
    private Constant expressionConstant;
    @Mock
    private Constant nameTestExpressionConstant;
    @Mock
    private Iterator iterator;
    @Mock
    private NodePointer nodePointer;
    @Mock
    private Number number;
    private PredicateContext predicateContext;

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testReset_wIPk0_huIc0() {
        NamespaceContext parentContext = new NamespaceContext(new SelfContext(new NamespaceContext(null, new NodeTypeTest(0)), new NodeTypeTest(0)), new NodeTypeTest(0));
        Constant expression = new Constant("test");
        PredicateContext predicateContext = new PredicateContext(parentContext, expression);
        predicateContext.reset();
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetPositionNullNameTestExpression_RUSM2_fid2() {
        PredicateContext predicateContext = new PredicateContext(new NamespaceContext(new SelfContext(new NamespaceContext(new SelfContext(new NamespaceContext(new SelfContext(new NamespaceContext(new SelfContext(new SelfContext(null, new NodeTypeTest(0)), new NodeTypeTest(0)), new NodeTypeTest(0)), new NodeTypeTest(0)), new NodeTypeTest(0)), new NodeTypeTest(0)), new NodeTypeTest(0)), new NodeTypeTest(0)), new NodeTypeTest(0)), new Constant(1));
        Constant expression = new Constant(1);
        predicateContext.setPosition(1);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetPositionNullNameTestExpression_bScQ0_fid2() {
        PredicateContext predicateContext = new PredicateContext(new NamespaceContext(new SelfContext(new NamespaceContext(new SelfContext(null, null), null), null), null), new Constant("test"));
        predicateContext.setPosition(1);
    }
}