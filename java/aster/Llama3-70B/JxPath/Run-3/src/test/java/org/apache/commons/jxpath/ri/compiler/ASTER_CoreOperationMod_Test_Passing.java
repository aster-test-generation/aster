/**
 * Generated by Aster
 */
package org.apache.commons.jxpath.ri.compiler;

import java.util.concurrent.TimeUnit;
import org.apache.commons.jxpath.ri.EvalContext;
import org.apache.commons.jxpath.ri.InfoSetUtil;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.mockito.junit.jupiter.MockitoSettings;
import org.mockito.quality.Strictness;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

@ExtendWith(MockitoExtension.class)
@MockitoSettings(strictness = Strictness.LENIENT)
public class Aster_CoreOperationMod_Test_Passing {
    @Mock
    private Constant arg1;
    @Mock
    private Constant arg2;
    @Mock
    private EvalContext context;
    @Mock
    private InfoSetUtil infoSetUtil;
    private CoreOperationMod coreoperationmod;

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetSymbol_LAaO0() {
        CoreOperationMod coreOperationMod = new CoreOperationMod(new Constant("string"), new Constant(1));
        assertEquals("mod", coreOperationMod.getSymbol());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsSymmetric_YatC0() {
        Constant arg1 = new Constant("string");
        Constant arg2 = new Constant(1);
        CoreOperationMod coreOperationMod = new CoreOperationMod(arg1, arg2);
        assertFalse(coreOperationMod.isSymmetric());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetPrecedence_uOeY0_fid1() {
        Constant arg1 = new Constant("string");
        Constant arg5 = new Constant(1);
        CoreOperationMod coreOperationMod = new CoreOperationMod(arg1, arg5);
        assertEquals(5, coreOperationMod.getPrecedence());
    }
}