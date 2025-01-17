/**
 * Generated by Aster
 */
package org.apache.commons.jxpath.ri.compiler;

import java.util.concurrent.TimeUnit;
import org.apache.commons.jxpath.ri.EvalContext;
import org.apache.commons.jxpath.ri.QName;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import org.mockito.junit.jupiter.MockitoSettings;
import org.mockito.quality.Strictness;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
import static org.mockito.Mockito.mock;

@ExtendWith(MockitoExtension.class)
@MockitoSettings(strictness = Strictness.LENIENT)
public class Aster_ExtensionFunction_Test_Passing {
    private QName functionName;
    ExtensionFunction extensionfunction;

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testcomputeValue() throws Exception {
        functionName = new QName("qualifiedName");
        extensionfunction = new ExtensionFunction(functionName, null);
        EvalContext context = mock(EvalContext.class);
        Object result = extensionfunction.computeValue(context);
        // Add meaningful assertion here
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testcompute() throws Exception {
        functionName = new QName("qualifiedName");
        extensionfunction = new ExtensionFunction(functionName, new Expression[0]);
        EvalContext context = mock(EvalContext.class);
        Object result = extensionfunction.compute(context);
        // Add meaningful assertions here
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetFunctionName_iRRT0() throws Exception {
        ExtensionFunction extensionFunction = new ExtensionFunction(new QName(" qualifiedName"), new Expression[0]);
        QName qName = extensionFunction.getFunctionName();
        Assertions.assertEquals(qName, new QName("qualifiedName"));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetFunctionName1_fakf1() throws Exception {
        ExtensionFunction extensionFunction = new ExtensionFunction(new QName("prefix", "localName"), new Expression[0]);
        QName qName = extensionFunction.getFunctionName();
        Assertions.assertEquals(qName, new QName("prefix", "localName"));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetFunctionName2_AjaN2() throws Exception {
        ExtensionFunction extensionFunction = new ExtensionFunction(new QName("qualifiedName"), new Expression[0]);
        int i = extensionFunction.getFunctionName().hashCode();
        Assertions.assertEquals(i, 0);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetFunctionName3_VihZ3() throws Exception {
        ExtensionFunction extensionFunction = new ExtensionFunction(new QName("prefix", "localName"), new Expression[0]);
        int i = extensionFunction.getFunctionName().hashCode();
        Assertions.assertEquals(i, 0);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testToStringWithNoArguments_RTXR0() throws Exception {
        ExtensionFunction function = new ExtensionFunction(new QName("functionName"), new Expression[0]);
        assertEquals("functionName()", function.toString());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testComputeContextDependent_ItZc0() throws Exception {
        ExtensionFunction extensionFunction = new ExtensionFunction(new QName("functionName"), new Expression[0]);
        boolean actual = extensionFunction.computeContextDependent();
        boolean expected = true;
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testComputeContextDependentFalse_ZzEy1() throws Exception {
        ExtensionFunction extensionFunction = new ExtensionFunction(new QName("functionName"), new Expression[0]);
        boolean actual = extensionFunction.computeContextDependent();
        boolean expected = false;
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testComputeContextDependentArgsNull_OagC2() throws Exception {
        ExtensionFunction extensionFunction = new ExtensionFunction(new QName("functionName"), null);
        boolean actual = extensionFunction.computeContextDependent();
        boolean expected = true;
        assertEquals(expected, actual);
    }
}