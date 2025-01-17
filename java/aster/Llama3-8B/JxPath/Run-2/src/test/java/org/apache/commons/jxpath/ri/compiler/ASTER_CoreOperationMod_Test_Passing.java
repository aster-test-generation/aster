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
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.jupiter.MockitoExtension;
import static org.mockito.Mockito.when;   
@ExtendWith(MockitoExtension.class)
@MockitoSettings(strictness = Strictness.LENIENT)
public class Aster_CoreOperationMod_Test_Passing {
@Mock
    EvalContext evalContext;
@Mock
    Constant constant1;
@Mock
    Constant constant2;
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetSymbol_mWLt0() {
        Constant constant1 = new Constant("a");
        Constant constant2 = new Constant(2);
        CoreOperationMod coreOperationMod = new CoreOperationMod(constant1, constant2);
        String symbol = coreOperationMod.getSymbol();
        assert symbol.equals("mod");
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testcomputeValue() throws Exception{
        MockitoAnnotations.initMocks(this);
        when(constant1.computeValue(evalContext)).thenReturn(1.0);
        when(constant2.computeValue(evalContext)).thenReturn(2.0);
        CoreOperationMod coreOperationMod = new CoreOperationMod(constant1, constant2);
        Object result = coreOperationMod.computeValue(evalContext);
        assertEquals(1.0, result);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsSymmetric_bDUq0() {
        CoreOperationMod coreOperationMod = new CoreOperationMod(new Constant("Hello"), new Constant(10));
        assertFalse(coreOperationMod.isSymmetric());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsSymmetric2_iEvV1_fid2() {
        CoreOperationMod coreOperationMod = new CoreOperationMod(new Constant(10), new Constant("Hello"));
        assertFalse(coreOperationMod.isSymmetric());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetPrecedence_YzuT0_fid2() {
        CoreOperationMod coreOperationMod = new CoreOperationMod(new Constant("a"), new Constant(5));
        assertEquals(5, coreOperationMod.getPrecedence());
    }
}