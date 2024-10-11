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
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.jupiter.MockitoExtension;
import org.mockito.junit.jupiter.MockitoSettings;
import org.mockito.quality.Strictness;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
@MockitoSettings(strictness = Strictness.LENIENT)
public class Aster_CoreOperationNegate_Test_Passing {
    @Mock
    private EvalContext evalContext;
    @Mock
    private Constant constant;

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetSymbol_XWkH1() {
        CoreOperationNegate coreOperationNegate = new CoreOperationNegate(new Constant("a"));
        assertEquals("-", coreOperationNegate.getSymbol());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetSymbolNumber_WkiH2() {
        CoreOperationNegate coreOperationNegate = new CoreOperationNegate(new Constant(10));
        assertEquals("-", coreOperationNegate.getSymbol());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testcomputeValue() throws Exception {
        MockitoAnnotations.initMocks(this);
        CoreOperationNegate coreoperationnegate = new CoreOperationNegate(constant);
        // Given
        Mockito.when(constant.computeValue(evalContext)).thenReturn(10.0);
        // When
        Object result = coreoperationnegate.computeValue(evalContext);
        // Then
        Mockito.verify(constant, Mockito.times(1)).computeValue(evalContext);
        assertEquals(-10.0, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsSymmetric_SgUJ0() {
        CoreOperationNegate coreOperationNegate = new CoreOperationNegate(new Constant("Hello"));
        assertFalse(coreOperationNegate.isSymmetric());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsSymmetric2_NmHT1() {
        CoreOperationNegate coreOperationNegate = new CoreOperationNegate(new Constant(10));
        assertFalse(coreOperationNegate.isSymmetric());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetPrecedence_ihpr6() {
        CoreOperationNegate coreOperationNegate = new CoreOperationNegate(new Constant("constant"));
        assertEquals(6, coreOperationNegate.getPrecedence());
    }
}