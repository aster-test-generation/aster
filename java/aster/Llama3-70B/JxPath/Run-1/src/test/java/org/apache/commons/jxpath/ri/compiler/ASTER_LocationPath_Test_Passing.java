/**
 * Generated by Aster
 */
package org.apache.commons.jxpath.ri.compiler;

import java.util.concurrent.TimeUnit;
import org.apache.commons.jxpath.ri.EvalContext;
import org.apache.commons.jxpath.ri.axes.InitialContext;
import org.apache.commons.jxpath.ri.axes.RootContext;
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
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
@MockitoSettings(strictness = Strictness.LENIENT)
public class Aster_LocationPath_Test_Passing {
    @Mock
    private EvalContext evalContext;
    @Mock
    private RootContext rootContext;
    @Mock
    private InitialContext initialContext;
    @Mock
    private Step[] steps;
    private LocationPath locationPath;

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testToString_Absolute_mMoN0() {
        LocationPath locationPath = new LocationPath(true, new Step[]{});
        assertEquals("", locationPath.toString());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testToString_Relative_hpuF1() {
        LocationPath locationPath = new LocationPath(false, new Step[]{});
        assertEquals("", locationPath.toString());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testToString_NullSteps_AnZc4() {
        LocationPath locationPath = new LocationPath(true, null);
        assertEquals("", locationPath.toString());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testComputeContextDependent_absoluteTrue_CbMC0() {
        LocationPath locationPath = new LocationPath(true, new Step[0]);
        assertTrue(locationPath.computeContextDependent());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCompute_Absolute() throws Exception {
        locationPath = new LocationPath(true, steps);
        // Given
        when(evalContext.getRootContext()).thenReturn(rootContext);
        when(rootContext.getAbsoluteRootContext()).thenReturn(evalContext);
        // When
        Object result = locationPath.compute(evalContext);
        // Then
        verify(evalContext).getRootContext();
        verify(rootContext).getAbsoluteRootContext();
        assertEquals(evalContext, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsAbsolute_GwJi0() {
        LocationPath locationPath = new LocationPath(true, new Step[0]);
        assertTrue(locationPath.isAbsolute());
    }
}