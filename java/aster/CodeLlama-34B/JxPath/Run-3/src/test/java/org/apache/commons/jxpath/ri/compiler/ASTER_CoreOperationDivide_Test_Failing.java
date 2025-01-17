/**
 * Generated by Aster
 */
package org.apache.commons.jxpath.ri.compiler;

import java.util.concurrent.TimeUnit;
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
public class Aster_CoreOperationDivide_Test_Failing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsSymmetricWithSameArguments_ZObT1_fid2() {
        Constant arg1 = new Constant("1");
        Constant arg2 = new Constant("1");
        CoreOperationDivide coreOperationDivide = new CoreOperationDivide(arg1, arg2);
        assertTrue(coreOperationDivide.isSymmetric());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetPrecedenceWithNullArgument_EidD1_fid2() {
        CoreOperationDivide coreOperationDivide = new CoreOperationDivide(null, null);
        int result = coreOperationDivide.getPrecedence();
        assertEquals(0, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetPrecedence_oSNP0_lSHK0_fid2() {
        CoreOperationDivide coreOperationDivide = new CoreOperationDivide(new Constant("2"), new Constant("3"));
        int result = coreOperationDivide.getPrecedence();
        assertEquals(4, result);
    }
}