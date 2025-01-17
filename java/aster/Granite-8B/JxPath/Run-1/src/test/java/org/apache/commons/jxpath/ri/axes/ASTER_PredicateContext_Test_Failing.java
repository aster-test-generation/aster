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
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.jupiter.MockitoExtension;
import org.mockito.junit.jupiter.MockitoSettings;
import org.mockito.quality.Strictness;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
@MockitoSettings(strictness = Strictness.LENIENT)
public class Aster_PredicateContext_Test_Failing {
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
    public void testSetPositionNullNameTestExpression_RUSM2() {
        PredicateContext predicateContext = new PredicateContext(new NamespaceContext(new SelfContext(new NamespaceContext(new SelfContext(new NamespaceContext(new SelfContext(new NamespaceContext(new SelfContext(new SelfContext(null, new NodeTypeTest(0)), new NodeTypeTest(0)), new NodeTypeTest(0)), new NodeTypeTest(0)), new NodeTypeTest(0)), new NodeTypeTest(0)), new NodeTypeTest(0)), new NodeTypeTest(0)), new NodeTypeTest(0)), new Constant(1));
        Constant expression = new Constant(1);
        predicateContext.setPosition(1);
        assertEquals(true, predicateContext.setPosition(1));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetPositionNullNameTestExpression_bScQ0() {
        PredicateContext predicateContext = new PredicateContext(new NamespaceContext(new SelfContext(new NamespaceContext(new SelfContext(null, null), null), null), null), new Constant("test"));
        predicateContext.setPosition(1);
        assertEquals(true, predicateContext.setPosition(1));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testNextSet_VuTD0() {
        NamespaceContext parentContext = new NamespaceContext(new SelfContext(new NamespaceContext(null, new NodeTypeTest(0)), new NodeTypeTest(0)), new NodeTypeTest(0));
        Constant expression = new Constant("test");
        PredicateContext predicateContext = new PredicateContext(parentContext, expression);
        boolean result = predicateContext.nextSet();
        assertTrue(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testreset_fWOH0() throws Exception {
        predicatecontext = new PredicateContext(parentContext, expression);
        Mockito.verify(parentContext).reset();
        predicatecontext.reset();
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testNextNode_ReturnsTrue_WhenNextNodeIsAvailable_PXZC0() throws Exception {
        MockitoAnnotations.initMocks(this);
        predicatecontext = new PredicateContext(parentContext, nameTestExpressionConstant);
        expression = new Constant(expressionConstant.toString());
        dynamicPropertyPointer = Mockito.mock(PropertyPointer.class);
        nameTestExpression = Mockito.mock(Expression.class);
        Mockito.when(parentContext.nextNode()).thenReturn(true);
        Mockito.when(nameTestExpressionConstant.computeValue(parentContext)).thenReturn("propertyName");
        Mockito.when(dynamicPropertyPointer.getPropertyNames()).thenReturn(new String[]{"propertyName"});
        Mockito.when(expressionConstant.computeValue(parentContext)).thenReturn(iterator);
        Mockito.when(iterator.hasNext()).thenReturn(true);
        Mockito.when(iterator.next()).thenReturn(nodePointer);
        Mockito.when(nodePointer.getNode()).thenReturn(number);
        Mockito.when(number.doubleValue()).thenReturn(1.0);
        boolean result = predicatecontext.nextNode();
        Mockito.verify(parentContext, Mockito.times(1)).nextNode();
        Mockito.verify(nameTestExpressionConstant, Mockito.times(1)).computeValue(parentContext);
        Mockito.verify(dynamicPropertyPointer, Mockito.times(1)).getPropertyNames();
        Mockito.verify(expressionConstant, Mockito.times(1)).computeValue(parentContext);
        Mockito.verify(iterator, Mockito.times(1)).hasNext();
        Mockito.verify(iterator, Mockito.times(1)).next();
        Mockito.verify(nodePointer, Mockito.times(1)).getNode();
        Mockito.verify(number, Mockito.times(1)).doubleValue();
        Assertions.assertTrue(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testNextNodeParentContextNextNode_UAfV1_qnUR0() {
        PredicateContext predicateContext = new PredicateContext(new NamespaceContext(new SelfContext(null, new NodeTypeTest(0)), null), new Constant("test"));
        boolean result = predicateContext.nextSet();
        assert (result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testNextNodeSetupDynamicPropertyPointer_VAoE2_sBbY0() {
        PredicateContext predicateContext = new PredicateContext(new NamespaceContext(new SelfContext(null, null), null), new Constant("test"));
        boolean result = predicateContext.nextSet();
        assert (result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetCurrentNodePointer_Orii0_1() throws Exception {
        nodeTypeTest = new NodeTypeTest(1);
        namespaceContext = new NamespaceContext(new SelfContext(namespaceContext, nodeTypeTest), nodeTypeTest);
        selfContext = new SelfContext(namespaceContext, nodeTypeTest);
        predicateContext = new PredicateContext(namespaceContext, new Constant("expression"));
        when(predicateContext.setPosition(1)).thenReturn(false);
        NodePointer propertyPointer = mock(NodePointer.class);
        when(predicateContext.getCurrentNodePointer()).thenReturn(propertyPointer);
        when(predicateContext.getCurrentNodePointer()).thenReturn(null);
        assertNull(predicateContext.getCurrentNodePointer());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetCurrentNodePointer_Orii0_2() throws Exception {
        nodeTypeTest = new NodeTypeTest(1);
        namespaceContext = new NamespaceContext(new SelfContext(namespaceContext, nodeTypeTest), nodeTypeTest);
        selfContext = new SelfContext(namespaceContext, nodeTypeTest);
        predicateContext = new PredicateContext(namespaceContext, new Constant("expression"));
        when(predicateContext.setPosition(1)).thenReturn(false);
        NodePointer propertyPointer = mock(NodePointer.class);
        when(predicateContext.getCurrentNodePointer()).thenReturn(propertyPointer);
        when(predicateContext.getCurrentNodePointer()).thenReturn(null);
        assertEquals(propertyPointer, predicateContext.getCurrentNodePointer());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetCurrentNodePointer_Orii0_2_fid2() throws Exception {
        nodeTypeTest = new NodeTypeTest(1);
        namespaceContext = new NamespaceContext(new SelfContext(namespaceContext, nodeTypeTest), nodeTypeTest);
        selfContext = new SelfContext(namespaceContext, nodeTypeTest);
        predicateContext = new PredicateContext(namespaceContext, new Constant("expression"));
        when(predicateContext.getCurrentNodePointer()).thenReturn(null);
        NodePointer propertyPointer = mock(NodePointer.class);
        when(predicateContext.getCurrentNodePointer()).thenReturn(propertyPointer);
        assertEquals(propertyPointer, predicateContext.getCurrentNodePointer());
    }
}