/**
 * Generated by Aster
 */
package org.apache.commons.jxpath.ri.compiler;

import java.util.concurrent.TimeUnit;
import org.apache.commons.jxpath.ri.Compiler;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_CoreFunction_Coverage_Test_Failing {
    private int functionCode;
    CoreFunction corefunction;

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testComputeContextDependentWithFunctionCodeAndArgsReturnsTrue2_wCTX3() {
        CoreFunction coreFunction = new CoreFunction(Compiler.FUNCTION_FORMAT_NUMBER, new Expression[2]);
        assertTrue(coreFunction.computeContextDependent());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testComputeContextDependentWithFunctionCodeAndArgsReturnsFalse2_sMJl5() {
        CoreFunction coreFunction = new CoreFunction(Compiler.FUNCTION_SUM, new Expression[2]);
        assertFalse(coreFunction.computeContextDependent());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testComputeContextDependentWithFunctionCodeAndArgsReturnsFalse3_yzvA6() {
        CoreFunction coreFunction = new CoreFunction(Compiler.FUNCTION_FLOOR, new Expression[2]);
        assertFalse(coreFunction.computeContextDependent());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testToString1_PETq0() {
        CoreFunction coreFunction = new CoreFunction(0, new Expression[0]);
        assertEquals("getFunctionName()()", coreFunction.toString());
    }
}