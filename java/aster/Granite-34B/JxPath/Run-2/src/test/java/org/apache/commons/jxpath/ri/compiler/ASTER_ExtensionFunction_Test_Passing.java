/**
 * Generated by Aster
 */
package org.apache.commons.jxpath.ri.compiler;

import java.util.concurrent.TimeUnit;
import org.apache.commons.jxpath.Function;
import org.apache.commons.jxpath.ri.EvalContext;
import org.apache.commons.jxpath.ri.QName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import org.mockito.junit.jupiter.MockitoSettings;
import org.mockito.quality.Strictness;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

@ExtendWith(MockitoExtension.class)
@MockitoSettings(strictness = Strictness.LENIENT)
public class Aster_ExtensionFunction_Test_Passing {
    private EvalContext context;
    private ExtensionFunction extensionfunction;
    private Function function;
    private Object[] parameters;
    private Expression[] args;
    private Object result;
    private QName functionName;

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testgetFunctionName2_chss1() {
        ExtensionFunction extensionFunction = new ExtensionFunction(new QName("prefix", "localName"), new Expression[]{});
        assertEquals(new QName("prefix", "localName"), extensionFunction.getFunctionName());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testToString_XIAg0() {
        ExtensionFunction extensionFunction = new ExtensionFunction(new QName("functionName"), new Expression[0]);
        String result = extensionFunction.toString();
        assertEquals("functionName()", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testToStringWithNullArguments_QVPl3() {
        ExtensionFunction extensionFunction = new ExtensionFunction(new QName("functionName"), null);
        String result = extensionFunction.toString();
        assertEquals("functionName()", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testComputeContextDependent_fQVw0() {
        ExtensionFunction function = new ExtensionFunction(new QName("functionName"), new Expression[0]);
        assertTrue(function.computeContextDependent());
    }
}