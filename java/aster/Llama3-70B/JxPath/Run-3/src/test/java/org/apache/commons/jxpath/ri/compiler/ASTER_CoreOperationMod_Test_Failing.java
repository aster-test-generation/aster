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
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
@MockitoSettings(strictness = Strictness.LENIENT)
public class Aster_CoreOperationMod_Test_Failing {
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
    public void testcomputeValue() throws Exception {
        arg1 = mock(Constant.class);
        arg2 = mock(Constant.class);
        context = mock(EvalContext.class);
        infoSetUtil = mock(InfoSetUtil.class);
        coreoperationmod = new CoreOperationMod(arg1, arg2);
        // given
        when(arg1.computeValue(context)).thenReturn(10.0);
        when(arg2.computeValue(context)).thenReturn(3.0);
        when(infoSetUtil.doubleValue(10.0)).thenReturn(10.0);
        when(infoSetUtil.doubleValue(3.0)).thenReturn(3.0);
        // when
        Object result = coreoperationmod.computeValue(context);
        // then
        assertEquals(1.0, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetPrecedence_uOeY0() {
        Constant arg1 = new Constant("string");
        Constant arg2 = new Constant(1);
        CoreOperationMod coreOperationMod = new CoreOperationMod(arg1, arg2);
        assertEquals(2, coreOperationMod.getPrecedence());
    }
}