/**
 * Generated by Aster
 */
package org.apache.commons.jxpath.ri.compiler;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoSettings;
import org.mockito.quality.Strictness;
import org.mockito.MockitoAnnotations;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.jupiter.MockitoExtension;   
@ExtendWith(MockitoExtension.class)
@MockitoSettings(strictness = Strictness.LENIENT)
public class Aster_ExpressionPath_Test_Passing {
    public void testToStringWithEmptyPredicatesAndSteps_sZlI0_0() {
        Constant constant = new Constant("'Test'");
        ExpressionPath expressionPath = new ExpressionPath(constant, null, null);
        assertEquals("'Test'", expressionPath.toString());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testToStringWithSinglePredicate_SyLf1() {
        Constant constant = new Constant("Test");
        Expression[] predicates = {new Constant(1)};
        ExpressionPath expressionPath = new ExpressionPath(constant, predicates, null);
        assertEquals("'Test'[1]", expressionPath.toString());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testToStringWithMultiplePredicates_clfk2() {
        Constant constant = new Constant("Test");
        Expression[] predicates = {new Constant(1), new Constant(2)};
        ExpressionPath expressionPath = new ExpressionPath(constant, predicates, null);
        assertEquals("'Test'[1][2]", expressionPath.toString());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsSimpleExpressionPath_EmptyPredicatesAndSteps_OBCf3() {
        Constant constant = new Constant(456);
        Expression[] predicates = new Expression[] {};
        Step[] steps = new Step[] {};
        ExpressionPath expressionPath = new ExpressionPath(constant, predicates, steps);
        assertTrue(expressionPath.isSimpleExpressionPath());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testToStringWithNestedExpressions_XQZc7_jaju0() {
    Constant constant = new Constant("Nested");
    ExpressionPath expressionPath = new ExpressionPath(constant, null, null);
    assertEquals("'Nested'", expressionPath.toString());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void setUp_ciho0() {
        MockitoAnnotations.initMocks(this);
    }
@Test
    public void testExpressionPath_XmID1() {
    }
}