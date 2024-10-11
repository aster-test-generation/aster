/**
 * Generated by Aster
 */
package org.apache.commons.jxpath.ri.compiler;

import java.util.concurrent.TimeUnit;
import org.apache.commons.jxpath.ri.EvalContext;
import org.apache.commons.jxpath.ri.axes.InitialContext;
import org.apache.commons.jxpath.ri.axes.NamespaceContext;
import org.apache.commons.jxpath.ri.axes.RootContext;
import org.apache.commons.jxpath.ri.axes.SelfContext;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.mockito.junit.jupiter.MockitoSettings;
import org.mockito.quality.Strictness;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
import static org.mockito.Mockito.*;

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
    public void testComputeValue_Absolute() throws Exception {
        locationPath = new LocationPath(true, steps);
        // Given
        when(evalContext.getRootContext()).thenReturn(rootContext);
        when(rootContext.getAbsoluteRootContext()).thenReturn(rootContext);
        // When
        Object result = locationPath.computeValue(evalContext);
        // Then
        verify(evalContext).getRootContext();
        verify(rootContext).getAbsoluteRootContext();
        assertNotNull(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCompute_Absolute() throws Exception {
        locationPath = new LocationPath(true, steps);
        // Given
        when(evalContext.getRootContext()).thenReturn(rootContext);
        when(locationPath.isAbsolute()).thenReturn(true);
        // When
        Object result = locationPath.compute(evalContext);
        // Then
        verify(evalContext).getRootContext();
        assertEquals(rootContext, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCompute_Relative() throws Exception {
        locationPath = new LocationPath(true, steps);
        // Given
        when(locationPath.isAbsolute()).thenReturn(false);
        when(new InitialContext(evalContext)).thenReturn(initialContext);
        // When
        Object result = locationPath.compute(evalContext);
        // Then
        verify(new InitialContext(evalContext));
        assertEquals(initialContext, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testToString_EmptySteps_FJHj3() {
        LocationPath locationPath = new LocationPath(true, new Step[]{});
        assertEquals("", locationPath.toString());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testToString_NullSteps_DPij4() {
        LocationPath locationPath = new LocationPath(true, null);
        assertEquals("", locationPath.toString());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testComputeContextDependent_absoluteTrue_hIzV0() {
        LocationPath locationPath = new LocationPath(true, new Step[0]);
        assertTrue(locationPath.computeContextDependent());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testComputeContextDependent_absoluteFalse_computeContextDependentTrue_RgTl1() {
        LocationPath locationPath = new LocationPath(false, new Step[0]);
        LocationPath locationPathSuper = new LocationPath(false, new Step[0]);
        when(locationPathSuper.computeContextDependent()).thenReturn(true);
        assertTrue(locationPath.computeContextDependent());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testComputeContextDependent_absoluteFalse_computeContextDependentFalse_ZBNy2() {
        LocationPath locationPath = new LocationPath(false, new Step[0]);
        LocationPath locationPathSuper = new LocationPath(false, new Step[0]);
        when(locationPathSuper.computeContextDependent()).thenReturn(false);
        assertFalse(locationPath.computeContextDependent());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsAbsolute_Esup0() {
        LocationPath locationPath = new LocationPath(true, new Step[0]);
        assertTrue(locationPath.isAbsolute());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testComputeValue_Relative_ITIU0() throws Exception {
        locationPath = new LocationPath(false, steps);
        when(evalContext.getRootContext()).thenReturn(rootContext);
        InitialContext initialContext = mock(InitialContext.class);
        when(new InitialContext(evalContext)).thenReturn(initialContext);
        Object result = locationPath.compute(evalContext);
        verify(evalContext).getRootContext();
        verify(initialContext);
        assertNotNull(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testComputeValue_Relative_KHMQ1_yeZm0() {
        NodeTypeTest nodeTypeTest = new NodeTypeTest(1);
        NamespaceContext namespaceContext = new NamespaceContext(new SelfContext(new NamespaceContext(null, nodeTypeTest), nodeTypeTest), nodeTypeTest);
        EvalContext evalContext = new InitialContext(namespaceContext);
        LocationPath locationPath = new LocationPath(false, new Step[0]);
        Object result = locationPath.compute(evalContext);
        assert result != null;
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCompute_Absolute_eMAT0_bAol0() {
        NodeTypeTest nodeTypeTest = new NodeTypeTest(1);
        NamespaceContext namespaceContext = new NamespaceContext(new SelfContext(new NamespaceContext(null, nodeTypeTest), nodeTypeTest), nodeTypeTest);
        InitialContext evalContext = new InitialContext(namespaceContext);
        LocationPath locationPath = new LocationPath(true, new Step[0]);
        Object result = locationPath.compute(evalContext);
        assertNotNull(result);
    }
}