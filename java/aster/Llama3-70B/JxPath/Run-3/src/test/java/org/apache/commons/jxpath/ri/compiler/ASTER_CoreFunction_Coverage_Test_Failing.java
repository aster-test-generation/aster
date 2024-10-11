/**
 * Generated by Aster
 */
package org.apache.commons.jxpath.ri.compiler;
import org.apache.commons.jxpath.ri.Compiler;
import org.apache.commons.jxpath.ri.EvalContext;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.mockito.Mockito.when;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_CoreFunction_Coverage_Test_Failing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testToString_NoArguments_vLlJ0() {
        CoreFunction coreFunction = new CoreFunction(1, new Expression[0]);
        assertEquals("functionName()", coreFunction.toString());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testToString_NullArguments_BqhV3() {
        CoreFunction coreFunction = new CoreFunction(1, null);
        assertEquals("functionName()", coreFunction.toString());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testComputeContextDependent_ArgsLengthTwo_vQtn4() {
        CoreFunction coreFunction = new CoreFunction(Compiler.FUNCTION_FORMAT_NUMBER, new Expression[2]);
        assertTrue(coreFunction.computeContextDependent());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIndexOf_bVjy3() {
        CoreFunction coreFunction = new CoreFunction(1, new Expression[2]);
        EvalContext context = mock(EvalContext.class);
        when(coreFunction.getArg1().computeValue(context)).thenReturn("HelloWorld");
        when(coreFunction.getArg2().computeValue(context)).thenReturn("World");
        assertEquals("World", coreFunction.functionSubstringAfter(context));
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIndexNotFound_HhkI4() {
        CoreFunction coreFunction = new CoreFunction(1, new Expression[2]);
        EvalContext context = mock(EvalContext.class);
        when(coreFunction.getArg1().computeValue(context)).thenReturn("Hello");
        when(coreFunction.getArg2().computeValue(context)).thenReturn("World");
        assertEquals("", coreFunction.functionSubstringAfter(context));
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSubstring_Gfih5() {
        CoreFunction coreFunction = new CoreFunction(1, new Expression[2]);
        EvalContext context = mock(EvalContext.class);
        when(coreFunction.getArg1().computeValue(context)).thenReturn("HelloWorld");
        when(coreFunction.getArg2().computeValue(context)).thenReturn("Hello");
        assertEquals("World", coreFunction.functionSubstringAfter(context));
    }
}