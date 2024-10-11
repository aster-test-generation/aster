/**
 * Generated by Aster
 */
package org.apache.commons.jxpath.ri.compiler;
import org.apache.commons.jxpath.ri.EvalContext;
import org.apache.commons.jxpath.ri.axes.InitialContext;
import org.apache.commons.jxpath.ri.axes.RootContext;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_LocationPath_Coverage_Test_Passing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCompute_Absolute_fWwD0() {
        LocationPath locationPath = new LocationPath(true, new Step[0]);
        EvalContext context = mock(EvalContext.class);
        RootContext rootContext = mock(RootContext.class);
        when(context.getRootContext()).thenReturn(rootContext);
        when(rootContext.getAbsoluteRootContext()).thenReturn(context);
        Object result = locationPath.compute(context);
        assertEquals(context, result);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCompute_Relative_lRrS1() {
        LocationPath locationPath = new LocationPath(false, new Step[0]);
        EvalContext context = mock(EvalContext.class);
        InitialContext initialContext = mock(InitialContext.class);
        when(new InitialContext(context)).thenReturn(initialContext);
        Object result = locationPath.compute(context);
        assertEquals(initialContext, result);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCompute_RootContext_AwAS3() {
        LocationPath locationPath = new LocationPath(true, new Step[0]);
        EvalContext context = mock(EvalContext.class);
        RootContext rootContext = mock(RootContext.class);
        when(context.getRootContext()).thenReturn(rootContext);
        locationPath.compute(context);
        verify(context, times(1)).getRootContext();
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testToString_WithNullSteps_uHfK2() {
        LocationPath locationPath = new LocationPath(true, null);
        String actual = locationPath.toString();
        assertEquals("", actual);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testToString_WithEmptySteps_fsqr3() {
        LocationPath locationPath = new LocationPath(true, new Step[0]);
        String actual = locationPath.toString();
        assertEquals("", actual);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testToString_BufferNotNull_ojbM5_xLPz0() {
    Step[] steps = new Step[1];
    LocationPath locationPath = new LocationPath(true, steps);
    assertTrue(locationPath.isAbsolute());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testToString_WithAbsolutePath_AnEp0_zEnp0() {
    LocationPath locationPath = new LocationPath(true, new Step[]{});
    boolean result = locationPath.isAbsolute();
    assertTrue(result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testComputeContextDependent_AbsoluteTrue_SuperReturnsFalse_KZra1_nZzy0() {
    LocationPath locationPath = new LocationPath(true, new Step[0]);
    boolean result = locationPath.isAbsolute();
    assert(result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testComputeContextDependent_AbsoluteTrue_SuperReturnsFalse_KZra1_XSfT1() {
    LocationPath locationPath = new LocationPath(true, new Step[0]);
    boolean result = locationPath.isAbsolute();
    assertTrue(result);
}
}