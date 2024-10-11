/**
 * Generated by Aster
 */
package org.apache.commons.jxpath.ri.compiler;
import org.apache.commons.jxpath.ri.EvalContext;
import static org.junit.jupiter.api.Assertions.*;
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
import static org.mockito.Mockito.verify;
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
public void testGetSymbolReturnsMod_CdCg0() {
    Constant arg1 = new Constant(5);
    Constant arg2 = new Constant(10);
    CoreOperationMod operation = new CoreOperationMod(arg1, arg2);
    assertEquals("mod", operation.getSymbol());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testComputeValue() throws Exception {
        coreOperationMod = new CoreOperationMod(arg1, arg2);
        // Setup
        when(arg1.computeValue(context)).thenReturn(10.0);
        when(arg2.computeValue(context)).thenReturn(3.0);
        // Execution
        Object result = coreOperationMod.computeValue(context);
        // Verification
        verify(arg1).computeValue(context);
        verify(arg2).computeValue(context);
        // Assertion
        assertNotNull(result);
        assertTrue(result instanceof Double);
        assertEquals(1.0, (Double) result, "The modulus of 10 by 3 should be 1.");
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testIsSymmetricReturnsFalse_RYJo0() {
    Constant constant1 = new Constant(123);
    Constant constant2 = new Constant("test");
    CoreOperationMod coreOperationMod = new CoreOperationMod(constant1, constant2);
    assertFalse(coreOperationMod.isSymmetric());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testComputeValue_1() throws Exception {
        coreOperationMod = new CoreOperationMod(arg1, arg2);
        // Setup
        when(arg1.computeValue(context)).thenReturn(10.0);
        when(arg2.computeValue(context)).thenReturn(3.0);
        // Execution
        Object result = coreOperationMod.computeValue(context);
        // Verification
        verify(arg1).computeValue(context);
        verify(arg2).computeValue(context);
        // Assertion
        assertNotNull(result);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testComputeValue_2() throws Exception {
        coreOperationMod = new CoreOperationMod(arg1, arg2);
        // Setup
        when(arg1.computeValue(context)).thenReturn(10.0);
        when(arg2.computeValue(context)).thenReturn(3.0);
        // Execution
        Object result = coreOperationMod.computeValue(context);
        // Verification
        verify(arg1).computeValue(context);
        verify(arg2).computeValue(context);
        // Assertion
        assertTrue(result instanceof Double);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testComputeValue_3() throws Exception {
        coreOperationMod = new CoreOperationMod(arg1, arg2);
        // Setup
        when(arg1.computeValue(context)).thenReturn(10.0);
        when(arg2.computeValue(context)).thenReturn(3.0);
        // Execution
        Object result = coreOperationMod.computeValue(context);
        // Verification
        verify(arg1).computeValue(context);
        verify(arg2).computeValue(context);
        // Assertion
        assertEquals(1.0, (Double) result, "The modulus of 10 by 3 should be 1.");}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetPrecedence_hIHl0_cuFD0() {
    Constant arg1 = new Constant(5);
    Constant arg2 = new Constant(10);
    CoreOperationMod operation = new CoreOperationMod(arg1, arg2);
    int expectedPrecedence = operation.getPrecedence(); // Correctly using the method to get the expected precedence
    assertEquals(expectedPrecedence, operation.getPrecedence());
}
}