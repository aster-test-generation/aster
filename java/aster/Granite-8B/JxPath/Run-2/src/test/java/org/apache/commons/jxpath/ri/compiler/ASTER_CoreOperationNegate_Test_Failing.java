/**
 * Generated by Aster
 */
package org.apache.commons.jxpath.ri.compiler;

import java.util.concurrent.TimeUnit;
import org.apache.commons.jxpath.ri.EvalContext;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.mockito.junit.jupiter.MockitoSettings;
import org.mockito.quality.Strictness;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

@ExtendWith(MockitoExtension.class)
@MockitoSettings(strictness = Strictness.LENIENT)
public class Aster_CoreOperationNegate_Test_Failing {
    @Mock
    private Constant arg;
    @Mock
    private EvalContext context;
    private CoreOperationNegate coreoperationnegate;

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsSymmetricWithNumber_HKQt1_fid1() {
        Constant constant = new Constant(1);
        CoreOperationNegate coreOperationNegate = new CoreOperationNegate(constant);
        boolean result = coreOperationNegate.isSymmetric();
        assertTrue(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetPrecedence_adgq0_fid1() {
        Constant constant = new Constant("string");
        CoreOperationNegate coreOperationNegate = new CoreOperationNegate(constant);
        int expected = 1;
        int actual = coreOperationNegate.getPrecedence();
        assertEquals(expected, actual);
    }
}