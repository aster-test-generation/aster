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

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

@ExtendWith(MockitoExtension.class)
@MockitoSettings(strictness = Strictness.LENIENT)
public class Aster_ExtensionFunction_Test_Failing {
    private QName functionName;

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testComputeContextDependentWithNullQName_JoTw4_fid2() {
        QName functionName = null;
        Expression[] args = new Expression[0];
        ExtensionFunction function = new ExtensionFunction(functionName, args);
        assertFalse(function.computeContextDependent());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetFunctionNameWithDifferentArguments_lGOt11_Jbum0_fid3() {
        QName functionName = new QName("prefix", "localName");
        Expression[] arguments = new Expression[]{new Constant("arg1"), new Constant("arg2")};
        ExtensionFunction extensionFunction = new ExtensionFunction(functionName, arguments);
        assertNotEquals(new QName("prefix", "localName"), extensionFunction.getFunctionName());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testComputeContextDependentWithNullQNameAndNonEmptyArgs_PhSA5_OOMm0_fid3() {
        QName functionName = null;
        Expression[] args = new Expression[]{new Constant("arg1")};
        ExtensionFunction function = new ExtensionFunction(functionName, args);
        assertFalse(function.computeContextDependent());
    }
}