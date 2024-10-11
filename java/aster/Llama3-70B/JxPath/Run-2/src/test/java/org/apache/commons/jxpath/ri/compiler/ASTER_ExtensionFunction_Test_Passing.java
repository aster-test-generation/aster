/**
 * Generated by Aster
 */
package org.apache.commons.jxpath.ri.compiler;

import java.util.concurrent.TimeUnit;
import org.apache.commons.jxpath.Function;
import org.apache.commons.jxpath.ri.EvalContext;
import org.apache.commons.jxpath.ri.QName;
import org.apache.commons.jxpath.ri.axes.RootContext;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import org.mockito.junit.jupiter.MockitoSettings;
import org.mockito.quality.Strictness;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
@MockitoSettings(strictness = Strictness.LENIENT)
public class Aster_ExtensionFunction_Test_Passing {
    private QName functionName;
    private EvalContext context;
    private Expression[] args;
    private ExtensionFunction extensionFunction;

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetFunctionName_gpJY0() {
        QName functionName = new QName("prefix", "localName");
        Expression[] args = new Expression[0];
        ExtensionFunction extensionFunction = new ExtensionFunction(functionName, args);
        QName result = extensionFunction.getFunctionName();
        assertEquals(functionName, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testToString_NoArgs_lcTH0() {
        QName functionName = new QName("prefix", "localName");
        ExtensionFunction ef = new ExtensionFunction(functionName, new Expression[0]);
        assertEquals("prefix:localName()", ef.toString());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testToString_NullArgs_attd3() {
        QName functionName = new QName("prefix", "localName");
        ExtensionFunction ef = new ExtensionFunction(functionName, null);
        assertEquals("prefix:localName()", ef.toString());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testComputeValue() throws Exception {
        functionName = new QName("testFunction");
        args = new Expression[]{};
        extensionFunction = new ExtensionFunction(functionName, args);
        context = Mockito.mock(EvalContext.class);
        // Mocking
        RootContext rootContext = Mockito.mock(RootContext.class);
        Mockito.when(context.getRootContext()).thenReturn(rootContext);
        Function function = Mockito.mock(Function.class);
        Mockito.when(rootContext.getFunction(functionName, new Object[]{})).thenReturn(function);
        Object result = new Object();
        Mockito.when(function.invoke(context, new Object[]{})).thenReturn(result);
        // Test
        Object computedValue = extensionFunction.computeValue(context);
        // Assertions
        assertEquals(result, computedValue);
        Mockito.verify(context, Mockito.times(1)).getRootContext();
        Mockito.verify(rootContext, Mockito.times(1)).getFunction(functionName, new Object[]{});
        Mockito.verify(function, Mockito.times(1)).invoke(context, new Object[]{});
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testComputeContextDependent_sRmU0() {
        QName functionName = new QName("prefix", "localName");
        Expression[] args = new Expression[0];
        ExtensionFunction extensionFunction = new ExtensionFunction(functionName, args);
        assertTrue(extensionFunction.computeContextDependent());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testToString_SingleArg_uPxU1_szUi0() {
        QName functionName = new QName("prefix", "localName");
        ExtensionFunction ef = new ExtensionFunction(functionName, new Expression[]{});
        assertEquals("prefix:localName()", ef.toString());
    }
}