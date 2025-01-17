/**
 * Generated by Aster
 */
package org.apache.commons.jxpath.ri.compiler;
import org.apache.commons.jxpath.ri.EvalContext;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.mockito.Mockito.when;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoSettings;
import org.mockito.quality.Strictness;
import org.mockito.InjectMocks;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import static org.mockito.Mockito.when;   
@ExtendWith(MockitoExtension.class)
@MockitoSettings(strictness = Strictness.LENIENT)
public class Aster_CoreOperationMod_Test_Passing {
@Mock
    private Constant arg1;
@Mock
    private Constant arg2;
@Mock
    private EvalContext context;
@InjectMocks
    private CoreOperationMod coreOperationMod;
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testComputeValue() throws Exception {
        coreOperationMod = new CoreOperationMod(arg1, arg2);
        // Setup
        when(arg1.computeValue(context)).thenReturn(10.0);
        when(arg2.computeValue(context)).thenReturn(3.0);
        // Execute
        Object result = coreOperationMod.computeValue(context);
        // Verify
        assertEquals(Double.valueOf(10 % 3), result, "The modulus result should be correct.");
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetSymbol_EWde0() {
    Constant arg1 = new Constant(5);
    Constant arg2 = new Constant(10);
    CoreOperationMod coreOperationMod = new CoreOperationMod(arg1, arg2);
    assertEquals("mod", coreOperationMod.getSymbol());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testIsSymmetricReturnsFalse_NuLQ0() {
    Constant arg1 = new Constant(5);
    Constant arg2 = new Constant("test");
    CoreOperationMod coreOperationMod = new CoreOperationMod(arg1, arg2);
    assertFalse(coreOperationMod.isSymmetric());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetPrecedence_EthI0_cjXQ0() {
    Constant arg1 = new Constant(5);
    Constant arg2 = new Constant(10);
    CoreOperationMod operation = new CoreOperationMod(arg1, arg2);
    int expectedPrecedence =5; // Assuming MULTIPLY_PRECEDENCE is5
    assertEquals(expectedPrecedence, operation.getPrecedence());
}
}