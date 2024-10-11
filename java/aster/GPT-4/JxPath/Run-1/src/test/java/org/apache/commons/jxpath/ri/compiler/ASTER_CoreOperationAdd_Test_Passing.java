/**
 * Generated by Aster
 */
package org.apache.commons.jxpath.ri.compiler;
import org.apache.commons.jxpath.ri.EvalContext;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.mockito.Mockito.when;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoSettings;
import org.mockito.quality.Strictness;
import org.mockito.junit.jupiter.MockitoExtension;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;   
@ExtendWith(MockitoExtension.class)
@MockitoSettings(strictness = Strictness.LENIENT)
public class Aster_CoreOperationAdd_Test_Passing {
private CoreOperationAdd coreOperationAdd;
private Expression[] expressions;
private EvalContext context;
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetSymbol_bEEg0() {
    Expression[] expressions = new Expression[0];
    CoreOperationAdd coreOperationAdd = new CoreOperationAdd(expressions);
    assertEquals("+", coreOperationAdd.getSymbol());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testComputeValue_1() throws Exception {
        // Mocking the dependencies
        expressions = new Expression[2];
        expressions[0] = mock(Expression.class);
        expressions[1] = mock(Expression.class);
        context = mock(EvalContext.class);
        // Setting up the CoreOperationAdd with mocked expressions
        coreOperationAdd = new CoreOperationAdd(expressions);
        // Setup the behavior of the mocked expressions
        when(expressions[0].computeValue(context)).thenReturn(10.0);
        when(expressions[1].computeValue(context)).thenReturn(20.0);
        // Call the method under test
        Object result = coreOperationAdd.computeValue(context);
        // Assertions
        assertNotNull(result, "The result should not be null");}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testComputeValue_2() throws Exception {
        // Mocking the dependencies
        expressions = new Expression[2];
        expressions[0] = mock(Expression.class);
        expressions[1] = mock(Expression.class);
        context = mock(EvalContext.class);
        // Setting up the CoreOperationAdd with mocked expressions
        coreOperationAdd = new CoreOperationAdd(expressions);
        // Setup the behavior of the mocked expressions
        when(expressions[0].computeValue(context)).thenReturn(10.0);
        when(expressions[1].computeValue(context)).thenReturn(20.0);
        // Call the method under test
        Object result = coreOperationAdd.computeValue(context);
        // Assertions
        assertTrue(result instanceof Double, "The result should be of type Double");}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testComputeValue_3() throws Exception {
        // Mocking the dependencies
        expressions = new Expression[2];
        expressions[0] = mock(Expression.class);
        expressions[1] = mock(Expression.class);
        context = mock(EvalContext.class);
        // Setting up the CoreOperationAdd with mocked expressions
        coreOperationAdd = new CoreOperationAdd(expressions);
        // Setup the behavior of the mocked expressions
        when(expressions[0].computeValue(context)).thenReturn(10.0);
        when(expressions[1].computeValue(context)).thenReturn(20.0);
        // Call the method under test
        Object result = coreOperationAdd.computeValue(context);
        // Assertions
        assertEquals(30.0, (Double) result, 0.001, "The sum of the values should be 30.0");}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testIsSymmetricReturnsTrue_ZHFf0() {
    Expression[] expressions = new Expression[0]; // Assuming Expression is defined elsewhere
    CoreOperationAdd coreOperationAdd = new CoreOperationAdd(expressions);
    assertTrue(coreOperationAdd.isSymmetric());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetPrecedence_UszL0_nhCE0() {
    Expression[] expressions = new Expression[0];
    CoreOperationAdd coreOperationAdd = new CoreOperationAdd(expressions);
    int expected =4; // Assuming4 as the precedence for simplicity, replace with actual precedence value if available
    assertEquals(expected, coreOperationAdd.getPrecedence());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testComputeValue() throws Exception {
        // Mocking the dependencies
        expressions = new Expression[2];
        expressions[0] = mock(Expression.class);
        expressions[1] = mock(Expression.class);
        context = mock(EvalContext.class);
        // Setting up the CoreOperationAdd with mocked expressions
        coreOperationAdd = new CoreOperationAdd(expressions);
        // Setup the behavior of the mocked expressions
        when(expressions[0].computeValue(context)).thenReturn(10.0);
        when(expressions[1].computeValue(context)).thenReturn(20.0);
        // Call the method under test
        Object result = coreOperationAdd.computeValue(context);
        // Assertions
        assertNotNull(result, "The result should not be null");
        assertTrue(result instanceof Double, "The result should be of type Double");
        assertEquals(30.0, (Double) result, 0.001, "The sum of the values should be 30.0");
    }
}