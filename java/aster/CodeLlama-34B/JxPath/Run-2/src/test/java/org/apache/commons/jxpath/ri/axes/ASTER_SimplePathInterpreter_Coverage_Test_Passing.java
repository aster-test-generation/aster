/**
 * Generated by Aster
 */
package org.apache.commons.jxpath.ri.axes;

import java.util.concurrent.TimeUnit;
import org.apache.commons.jxpath.ri.EvalContext;
import org.apache.commons.jxpath.ri.compiler.Step;
import org.apache.commons.jxpath.ri.model.NodePointer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class Aster_SimplePathInterpreter_Coverage_Test_Passing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testcreateNullPointer3_aLJK2() throws Exception {
        EvalContext context = mock(EvalContext.class);
        NodePointer parent = mock(NodePointer.class);
        Step[] steps = mock(Step[].class);
        int currentStep = 1;
        when(steps.length).thenReturn(currentStep);
        when(parent.getValuePointer()).thenReturn(null);
        NodePointer result = SimplePathInterpreter.createNullPointer(context, parent, steps, currentStep);
        assertNotEquals(parent, result);
    }
}