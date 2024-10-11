/**
 * Generated by Aster
 */
package org.apache.commons.jxpath.ri.axes;

import java.util.concurrent.TimeUnit;
import org.apache.commons.jxpath.ri.EvalContext;
import org.apache.commons.jxpath.ri.compiler.Expression;
import org.apache.commons.jxpath.ri.compiler.Step;
import org.apache.commons.jxpath.ri.model.NodePointer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.mockito.junit.jupiter.MockitoSettings;
import org.mockito.quality.Strictness;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
import static org.mockito.Mockito.mock;

@ExtendWith(MockitoExtension.class)
@MockitoSettings(strictness = Strictness.LENIENT)
public class Aster_SimplePathInterpreter_Test_Passing {
    SimplePathInterpreter simplepathinterpreter;
    @Mock
    EvalContext context;
    @Mock
    NodePointer root;
    @Mock
    Expression[] predicates;
    @Mock
    Step[] steps;

    {
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testcreateNullPointer() throws Exception {
        simplepathinterpreter = new SimplePathInterpreter();
        EvalContext context = mock(EvalContext.class);
        NodePointer parent = mock(NodePointer.class);
        Step[] steps = new Step[0];
        int currentStep = 0;
        NodePointer result = simplepathinterpreter.createNullPointer(context, parent, steps, currentStep);
        // add meaningful assertion here
        assertNotNull(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testinterpretSimpleLocationPath() throws Exception {
        simplepathinterpreter = new SimplePathInterpreter();
        EvalContext context = mock(EvalContext.class);
        NodePointer root = mock(NodePointer.class);
        Step[] steps = new Step[0];
        NodePointer pointer = simplepathinterpreter.interpretSimpleLocationPath(context, root, steps);
        assertNotNull(pointer);
    }
}