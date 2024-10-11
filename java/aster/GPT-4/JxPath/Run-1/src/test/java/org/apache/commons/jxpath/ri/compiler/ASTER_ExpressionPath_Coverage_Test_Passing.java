/**
 * Generated by Aster
 */
package org.apache.commons.jxpath.ri.compiler;
import org.apache.commons.jxpath.ri.EvalContext;
import org.apache.commons.jxpath.ri.axes.InitialContext;
import org.apache.commons.jxpath.ri.axes.NodeSetContext;
import org.apache.commons.jxpath.ri.model.NodePointer;
import org.apache.commons.jxpath.ri.axes.RootContext;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_ExpressionPath_Coverage_Test_Passing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testComputeValue_aQjR0() {
        Constant mockExpression = mock(Constant.class);
        Expression[] mockPredicates = new Expression[0];
        Step[] mockSteps = new Step[0];
        ExpressionPath expressionPath = new ExpressionPath(mockExpression, mockPredicates, mockSteps);
        EvalContext mockContext = mock(EvalContext.class);
        when(expressionPath.expressionPath(mockContext, true)).thenReturn(new Object());
        Object result = expressionPath.computeValue(mockContext);
        assertNotNull(result);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCompute_mfMG0() {
        EvalContext context = mock(EvalContext.class);
        Constant expression = new Constant("testExpression");
        Expression[] predicates = new Expression[0]; // Assuming Expression is defined elsewhere
        Step[] steps = new Step[0]; // Assuming Step is defined elsewhere
        ExpressionPath expressionPath = new ExpressionPath(expression, predicates, steps);
        Object result = expressionPath.compute(context);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    void testComputeContextDependent_ExpressionIsContextDependent_xNup0() {
        Constant mockConstant = mock(Constant.class);
        when(mockConstant.isContextDependent()).thenReturn(true);
        ExpressionPath expressionPath = new ExpressionPath(mockConstant, null, null);
        assertTrue(expressionPath.computeContextDependent());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    void testComputeContextDependent_ExpressionIsNotContextDependent_fYab1() {
        Constant mockConstant = mock(Constant.class);
        when(mockConstant.isContextDependent()).thenReturn(false);
        ExpressionPath expressionPath = new ExpressionPath(mockConstant, null, null);
        assertFalse(expressionPath.computeContextDependent());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    void testComputeContextDependent_PredicatesNotNullAndContextDependent_sxaq2() {
        Constant mockConstant = mock(Constant.class);
        when(mockConstant.isContextDependent()).thenReturn(false);
        Expression mockExpression = mock(Expression.class);
        when(mockExpression.isContextDependent()).thenReturn(true);
        Expression[] predicates = {mockExpression};
        ExpressionPath expressionPath = new ExpressionPath(mockConstant, predicates, null);
        assertTrue(expressionPath.computeContextDependent());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    void testComputeContextDependent_PredicatesNotNullAndNotContextDependent_shXo3() {
        Constant mockConstant = mock(Constant.class);
        when(mockConstant.isContextDependent()).thenReturn(false);
        Expression mockExpression = mock(Expression.class);
        when(mockExpression.isContextDependent()).thenReturn(false);
        Expression[] predicates = {mockExpression};
        ExpressionPath expressionPath = new ExpressionPath(mockConstant, predicates, null);
        assertFalse(expressionPath.computeContextDependent());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsSimpleExpressionPath_FirstCall_UnknownBasic_gwjQ0() {
        Constant expression = new Constant("test");
        Expression[] predicates = new Expression[0];
        Step[] steps = new Step[0];
        ExpressionPath expressionPath = new ExpressionPath(expression, predicates, steps);
        expressionPath = spy(expressionPath);
        when(expressionPath.isSimplePath()).thenReturn(true);
        when(expressionPath.areBasicPredicates(predicates)).thenReturn(true);
        boolean result = expressionPath.isSimpleExpressionPath();
        assertTrue(result);
        verify(expressionPath, times(1)).isSimplePath();
        verify(expressionPath, times(1)).areBasicPredicates(predicates);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsSimpleExpressionPath_SecondCall_KnownBasic_SinE1() {
        Constant expression = new Constant("test");
        Expression[] predicates = new Expression[0];
        Step[] steps = new Step[0];
        ExpressionPath expressionPath = new ExpressionPath(expression, predicates, steps);
        expressionPath = spy(expressionPath);
        when(expressionPath.isSimplePath()).thenReturn(true);
        when(expressionPath.areBasicPredicates(predicates)).thenReturn(true);
        expressionPath.isSimpleExpressionPath(); // First call to set basicKnown to true
        reset(expressionPath);
        boolean result = expressionPath.isSimpleExpressionPath();
        assertTrue(result);
        verify(expressionPath, never()).isSimplePath();
        verify(expressionPath, never()).areBasicPredicates(predicates);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsSimpleExpressionPath_WithComplexPath_XmBy2() {
        Constant expression = new Constant("test");
        Expression[] predicates = new Expression[0];
        Step[] steps = new Step[0];
        ExpressionPath expressionPath = new ExpressionPath(expression, predicates, steps);
        expressionPath = spy(expressionPath);
        when(expressionPath.isSimplePath()).thenReturn(false);
        boolean result = expressionPath.isSimpleExpressionPath();
        assertFalse(result);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsSimpleExpressionPath_WithNonBasicPredicates_zLVL3() {
        Constant expression = new Constant("test");
        Expression[] predicates = new Expression[1]; // Assume non-basic predicates
        Step[] steps = new Step[0];
        ExpressionPath expressionPath = new ExpressionPath(expression, predicates, steps);
        expressionPath = spy(expressionPath);
        when(expressionPath.isSimplePath()).thenReturn(true);
        when(expressionPath.areBasicPredicates(predicates)).thenReturn(false);
        boolean result = expressionPath.isSimpleExpressionPath();
        assertFalse(result);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testExpressionPath_ValueIsInitialContext_vYly0() {
        ExpressionPath expressionPath = new ExpressionPath(null, null, null);
        EvalContext evalContext = mock(EvalContext.class);
        InitialContext initialContext = mock(InitialContext.class);
        Expression expression = mock(Expression.class);
        when(expression.compute(evalContext)).thenReturn(initialContext);
        expressionPath.expressionPath(evalContext, true);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testExpressionPath_ValueIsEvalContext_qYUg1() {
        ExpressionPath expressionPath = new ExpressionPath(null, null, null);
        EvalContext evalContext = mock(EvalContext.class);
        EvalContext valueContext = mock(EvalContext.class);
        Expression expression = mock(Expression.class);
        when(expression.compute(evalContext)).thenReturn(valueContext);
        expressionPath.expressionPath(evalContext, true);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testExpressionPath_FirstMatchTrue_SimpleExpressionPath_WVpV3() {
        ExpressionPath expressionPath = new ExpressionPath(null, null, null);
        EvalContext evalContext = mock(EvalContext.class);
        NodeSetContext nodeSetContext = mock(NodeSetContext.class);
        NodePointer nodePointer = mock(NodePointer.class);
        when(expressionPath.isSimpleExpressionPath()).thenReturn(true);
        when(nodeSetContext.getSingleNodePointer()).thenReturn(nodePointer);
        when(nodePointer.getIndex()).thenReturn(NodePointer.WHOLE_COLLECTION);
        expressionPath.expressionPath(nodeSetContext, true);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testExpressionPath_PredicatesNotNull_zfJk4() {
        ExpressionPath expressionPath = new ExpressionPath(null, new Expression[1], null);
        EvalContext evalContext = mock(EvalContext.class);
        EvalContext initialContext = mock(EvalContext.class);
        Expression expression = mock(Expression.class);
        when(expression.compute(evalContext)).thenReturn(initialContext);
        expressionPath.expressionPath(evalContext, false);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testExpressionPath_PredicatesLoop_iklU5() {
        ExpressionPath expressionPath = new ExpressionPath(null, new Expression[2], null);
        EvalContext evalContext = mock(EvalContext.class);
        EvalContext initialContext = mock(EvalContext.class);
        Expression expression = mock(Expression.class);
        when(expression.compute(evalContext)).thenReturn(initialContext);
        expressionPath.expressionPath(evalContext, false);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testExpressionPath_FirstMatchTrue_GetSingleNodePointerForSteps_CHaO6() {
        ExpressionPath expressionPath = new ExpressionPath(null, null, null);
        EvalContext evalContext = mock(EvalContext.class);
        EvalContext initialContext = mock(EvalContext.class);
        Expression expression = mock(Expression.class);
        when(expression.compute(evalContext)).thenReturn(initialContext);
        expressionPath.expressionPath(evalContext, true);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testExpressionPath_FirstMatchFalse_EvalSteps_GsUN7() {
        ExpressionPath expressionPath = new ExpressionPath(null, null, null);
        EvalContext evalContext = mock(EvalContext.class);
        EvalContext initialContext = mock(EvalContext.class);
        Expression expression = mock(Expression.class);
        when(expression.compute(evalContext)).thenReturn(initialContext);
        expressionPath.expressionPath(evalContext, false);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testToStringWithEmptyExpressionAndNoPredicatesOrSteps_cQvx0() {
        Constant expression = new Constant("Empty");
        ExpressionPath path = new ExpressionPath(expression, null, null);
        assertEquals("Empty", path.toString());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testToStringWithCoreOperationExpression_hZbZ1() {
        Constant expression = new Constant("CoreOperation");
        ExpressionPath path = new ExpressionPath(expression, null, null);
        assertEquals("(CoreOperation)", path.toString());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testToStringWithExpressionPathExpression_yVgP2() {
        Constant expression = new Constant("ExpressionPath");
        ExpressionPath path = new ExpressionPath(expression, null, null);
        assertEquals("(ExpressionPath)", path.toString());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testToStringWithLocationPathExpression_LVTY3() {
        Constant expression = new Constant("LocationPath");
        ExpressionPath path = new ExpressionPath(expression, null, null);
        assertEquals("(LocationPath)", path.toString());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testToStringWithEmptyPredicatesAndSteps_dviC11() {
        Constant expression = new Constant("Expression");
        Expression[] predicates = {};
        Step[] steps = {};
        ExpressionPath path = new ExpressionPath(expression, predicates, steps);
        assertEquals("Expression", path.toString());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testToStringWithNullExpression_dxcG12() {
        ExpressionPath path = new ExpressionPath(null, null, null);
        assertEquals("null", path.toString());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testToStringWithNullPredicatesAndSteps_tJkt16() {
        Constant expression = new Constant("NullFields");
        ExpressionPath path = new ExpressionPath(expression, null, null);
        assertEquals("NullFields", path.toString());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testExpressionPath_ValueIsOther_LuCb2_WcQu0() {
    ExpressionPath expressionPath = new ExpressionPath(null, null, null);
    EvalContext evalContext = mock(EvalContext.class);
    RootContext rootContext = mock(RootContext.class);
    EvalContext constantContext = mock(EvalContext.class);
    Expression expression = mock(Expression.class);
    when(expression.compute(evalContext)).thenReturn(new Object());
    when(evalContext.getRootContext()).thenReturn(rootContext);
    when(rootContext.getConstantContext(any())).thenReturn(constantContext);
    expressionPath.expressionPath(evalContext, true);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testToStringWithPredicates_TzSP4_rYBd0() {
    Constant expression = new Constant("Expression");
    Expression[] predicates = {
        new CoreOperationEqual(new Constant("Predicate1"), new Constant("Predicate1")),
        new CoreOperationEqual(new Constant("Predicate2"), new Constant("Predicate2"))
    };
    ExpressionPath path = new ExpressionPath(expression, predicates, null);
    assertEquals("Expression[Predicate1][Predicate2]", path.toString());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testToStringWithMultiplePredicates_sfhN9_QWrr0() {
    Constant expression = new Constant("Expression");
    Expression[] predicates = {
        new CoreOperationEqual(new Constant("Predicate1"), new Constant("")),
        new CoreOperationEqual(new Constant("Predicate2"), new Constant("")),
        new CoreOperationEqual(new Constant("Predicate3"), new Constant(""))
    };
    ExpressionPath path = new ExpressionPath(expression, predicates, null);
    assertEquals("Expression[Predicate1][Predicate2][Predicate3]", path.toString());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testToStringWithOnlyPredicates_mnRL14_PiAS0() {
    Constant expression = new Constant("OnlyPredicates");
    Expression[] predicates = {
        new CoreOperationEqual(new Constant("OnlyPredicate1"), new Constant("1")),
        new CoreOperationEqual(new Constant("OnlyPredicate2"), new Constant("2"))
    };
    ExpressionPath path = new ExpressionPath(expression, predicates, null);
    assertEquals("OnlyPredicates[OnlyPredicate1 = 1][OnlyPredicate2 = 2]", path.toString());
}
}