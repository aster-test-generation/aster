/**
 * Generated by Aster
 */
package org.apache.commons.jxpath.ri.compiler;

import java.util.concurrent.TimeUnit;
import org.apache.commons.jxpath.ri.QName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import org.mockito.junit.jupiter.MockitoSettings;
import org.mockito.quality.Strictness;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

@ExtendWith(MockitoExtension.class)
@MockitoSettings(strictness = Strictness.LENIENT)
public class Aster_ExtensionFunction_Test_Passing {
    private QName functionName;

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetFunctionName_WYnu0() {
        QName functionName = new QName("prefix", "localName");
        ExtensionFunction extensionFunction = new ExtensionFunction(functionName, new Expression[0]);
        assertEquals(functionName, extensionFunction.getFunctionName());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetFunctionNameWithNullFunctionName_DgQg1() {
        ExtensionFunction extensionFunction = new ExtensionFunction(null, new Expression[0]);
        assertNull(extensionFunction.getFunctionName());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetFunctionNameWithEmptyFunctionName_GzUj2() {
        QName functionName = new QName("", "");
        ExtensionFunction extensionFunction = new ExtensionFunction(functionName, new Expression[0]);
        assertEquals(functionName, extensionFunction.getFunctionName());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetFunctionNameWithNullPrefix_yjAX3() {
        QName functionName = new QName(null, "localName");
        ExtensionFunction extensionFunction = new ExtensionFunction(functionName, new Expression[0]);
        assertEquals(functionName, extensionFunction.getFunctionName());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetFunctionNameWithNullLocalName_oqCO4() {
        QName functionName = new QName("prefix", null);
        ExtensionFunction extensionFunction = new ExtensionFunction(functionName, new Expression[0]);
        assertEquals(functionName, extensionFunction.getFunctionName());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetFunctionNameWithNullArguments_eVOy5() {
        QName functionName = new QName("prefix", "localName");
        ExtensionFunction extensionFunction = new ExtensionFunction(functionName, null);
        assertEquals(functionName, extensionFunction.getFunctionName());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetFunctionNameWithDifferentFunctionName_Dqpx8() {
        QName functionName = new QName("prefix", "localName");
        ExtensionFunction extensionFunction = new ExtensionFunction(functionName, new Expression[0]);
        assertNotEquals(new QName("differentPrefix", "differentLocalName"), extensionFunction.getFunctionName());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetFunctionNameWithDifferentPrefix_aGoX9() {
        QName functionName = new QName("prefix", "localName");
        ExtensionFunction extensionFunction = new ExtensionFunction(functionName, new Expression[0]);
        assertNotEquals(new QName("differentPrefix", "localName"), extensionFunction.getFunctionName());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetFunctionNameWithDifferentLocalName_BNbR10() {
        QName functionName = new QName("prefix", "localName");
        ExtensionFunction extensionFunction = new ExtensionFunction(functionName, new Expression[0]);
        assertNotEquals(new QName("prefix", "differentLocalName"), extensionFunction.getFunctionName());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testToStringWithQualifiedName_btmO0() {
        QName functionName = new QName("myFunction");
        Expression[] args = new Expression[0];
        ExtensionFunction function = new ExtensionFunction(functionName, args);
        String expected = "myFunction()";
        String actual = function.toString();
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testToStringWithPrefixAndLocalName_POGM1() {
        QName functionName = new QName("myPrefix", "myLocalName");
        Expression[] args = new Expression[0];
        ExtensionFunction function = new ExtensionFunction(functionName, args);
        String expected = "myPrefix:myLocalName()";
        String actual = function.toString();
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testToStringWithNullArguments_BOyE3() {
        QName functionName = new QName("myFunction");
        Expression[] args = null;
        ExtensionFunction function = new ExtensionFunction(functionName, args);
        String expected = "myFunction()";
        String actual = function.toString();
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testComputeContextDependent_BMsi0() {
        QName functionName = new QName("myFunction");
        Expression[] args = new Expression[0];
        ExtensionFunction function = new ExtensionFunction(functionName, args);
        assertTrue(function.computeContextDependent());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testComputeContextDependentWithNullArgs_wXJF3() {
        QName functionName = new QName("myFunction");
        Expression[] args = null;
        ExtensionFunction function = new ExtensionFunction(functionName, args);
        assertTrue(function.computeContextDependent());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testComputeContextDependentWithNullQName_JoTw4() {
        QName functionName = null;
        Expression[] args = new Expression[0];
        ExtensionFunction function = new ExtensionFunction(functionName, args);
        assertTrue(function.computeContextDependent());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testComputeContextDependentWithNullQNameAndNullArgs_veEg6() {
        QName functionName = null;
        Expression[] args = null;
        ExtensionFunction function = new ExtensionFunction(functionName, args);
        assertTrue(function.computeContextDependent());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetFunctionNameWithDifferentArguments_lGOt11_Jbum0() {
        QName functionName = new QName("prefix", "localName");
        Expression[] arguments = new Expression[]{new Constant("arg1"), new Constant("arg2")};
        ExtensionFunction extensionFunction = new ExtensionFunction(functionName, arguments);
        assertEquals(new QName("prefix", "localName"), extensionFunction.getFunctionName());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testComputeContextDependentWithNullQNameAndNonEmptyArgs_PhSA5_OOMm0() {
        QName functionName = null;
        Expression[] args = new Expression[]{new Constant("arg1")};
        ExtensionFunction function = new ExtensionFunction(functionName, args);
        assertTrue(function.computeContextDependent());
    }
}