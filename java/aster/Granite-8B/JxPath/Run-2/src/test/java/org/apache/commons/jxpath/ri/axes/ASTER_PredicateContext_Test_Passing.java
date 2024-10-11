/**
 * Generated by Aster
 */
package org.apache.commons.jxpath.ri.axes;

import java.util.concurrent.TimeUnit;
import org.apache.commons.jxpath.JXPathContext;
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

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

@ExtendWith(MockitoExtension.class)
@MockitoSettings(strictness = Strictness.LENIENT)
public class Aster_PredicateContext_Test_Passing {
    private Expression nameTestExpression;
    private PropertyPointer dynamicPropertyPointer;
    @Mock
    private NamespaceContext namespaceContext;
    @Mock
    private SelfContext selfContext;
    @Mock
    private NodeTypeTest nodeTypeTest;
    @Mock
    private Constant constant;
    private boolean done = false;
    private NamespaceContext parentContext;
    private NodeTypeTest nodeTest;
    private Constant expression;
    private PredicateContext predicatecontext;
    @Mock
    private NodePointer nodePointer;
    @Mock
    private JXPathContext context;

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetPosition1_orNk0() {
        PredicateContext predicateContext = new PredicateContext(new NamespaceContext(null, new NodeTypeTest(1)), new Constant(""));
        predicateContext.setPosition(1);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testReset_YGOY0() {
        NamespaceContext namespaceContext = new NamespaceContext(null, null);
        SelfContext selfContext = new SelfContext(namespaceContext, null);
        NodeTypeTest nodeTypeTest = new NodeTypeTest(0);
        Constant expression = new Constant("string");
        PredicateContext predicateContext = new PredicateContext(selfContext, expression);
        predicateContext.reset();
        assertNotNull(predicateContext);
        assertNotNull(namespaceContext);
        assertNotNull(selfContext);
        assertNotNull(nodeTypeTest);
        assertNotNull(expression);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetCurrentNodePointer1_fPgE0() {
        NamespaceContext namespaceContext = new NamespaceContext(null, null);
        SelfContext selfContext = new SelfContext(namespaceContext, null);
        NodeTypeTest nodeTypeTest = new NodeTypeTest(0);
        Constant expression = new Constant("expression");
        PredicateContext predicateContext = new PredicateContext(selfContext, expression);
        NodePointer actualCurrentNodePointer = predicateContext.getCurrentNodePointer();
        assertNull(actualCurrentNodePointer);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testReset_YGOY0_1() {
        NamespaceContext namespaceContext = new NamespaceContext(null, null);
        SelfContext selfContext = new SelfContext(namespaceContext, null);
        NodeTypeTest nodeTypeTest = new NodeTypeTest(0);
        Constant expression = new Constant("string");
        PredicateContext predicateContext = new PredicateContext(selfContext, expression);
        predicateContext.reset();
        assertNotNull(predicateContext);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testReset_YGOY0_2() {
        NamespaceContext namespaceContext = new NamespaceContext(null, null);
        SelfContext selfContext = new SelfContext(namespaceContext, null);
        NodeTypeTest nodeTypeTest = new NodeTypeTest(0);
        Constant expression = new Constant("string");
        PredicateContext predicateContext = new PredicateContext(selfContext, expression);
        predicateContext.reset();
        assertNotNull(namespaceContext);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testReset_YGOY0_3() {
        NamespaceContext namespaceContext = new NamespaceContext(null, null);
        SelfContext selfContext = new SelfContext(namespaceContext, null);
        NodeTypeTest nodeTypeTest = new NodeTypeTest(0);
        Constant expression = new Constant("string");
        PredicateContext predicateContext = new PredicateContext(selfContext, expression);
        predicateContext.reset();
        assertNotNull(selfContext);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testReset_YGOY0_4() {
        NamespaceContext namespaceContext = new NamespaceContext(null, null);
        SelfContext selfContext = new SelfContext(namespaceContext, null);
        NodeTypeTest nodeTypeTest = new NodeTypeTest(0);
        Constant expression = new Constant("string");
        PredicateContext predicateContext = new PredicateContext(selfContext, expression);
        predicateContext.reset();
        assertNotNull(nodeTypeTest);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testReset_YGOY0_5() {
        NamespaceContext namespaceContext = new NamespaceContext(null, null);
        SelfContext selfContext = new SelfContext(namespaceContext, null);
        NodeTypeTest nodeTypeTest = new NodeTypeTest(0);
        Constant expression = new Constant("string");
        PredicateContext predicateContext = new PredicateContext(selfContext, expression);
        predicateContext.reset();
        assertNotNull(expression);
    }
}