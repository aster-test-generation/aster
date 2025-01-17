/**
 * Generated by Aster
 */
package org.apache.commons.jxpath.ri.compiler;

import java.util.concurrent.TimeUnit;
import org.apache.commons.jxpath.ri.EvalContext;
import org.apache.commons.jxpath.ri.axes.NamespaceContext;
import org.apache.commons.jxpath.ri.axes.SelfContext;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import org.mockito.junit.jupiter.MockitoSettings;
import org.mockito.quality.Strictness;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

@ExtendWith(MockitoExtension.class)
@MockitoSettings(strictness = Strictness.LENIENT)
public class Aster_LocationPath_Test_Failing {
    LocationPath locationpath;
    EvalContext evalContext;
    NamespaceContext namespaceContext;
    SelfContext selfContext;
    NodeTypeTest nodeTypeTest;
    Step[] steps;

    private Object getSingleNodePointerForSteps(EvalContext context) {
        return null;
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testToStringWithNoStepsAndAbsoluteTrue_pXqR1() {
        LocationPath locationPath = new LocationPath(true, new Step[0]);
        assertEquals("/", locationPath.toString());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testComputeContextDependentWithAbsoluteTrueAndSuperComputeContextDependentTrue_qyth0() {
        LocationPath locationPath = new LocationPath(true, new Step[0]);
        boolean result = locationPath.computeContextDependent();
        assert result;
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testComputeContextDependentWithAbsoluteFalse_ivbW2() {
        LocationPath locationPath = new LocationPath(false, new Step[0]);
        boolean result = locationPath.computeContextDependent();
        assert !result;
    }
}