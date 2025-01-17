/**
 * Generated by Aster
 */
package org.apache.commons.jxpath.ri.compiler;
import org.apache.commons.jxpath.ri.EvalContext;
import org.apache.commons.jxpath.ri.axes.InitialContext;
import org.apache.commons.jxpath.ri.model.NodePointer;
import org.apache.commons.jxpath.ri.axes.RootContext;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoSettings;
import org.mockito.quality.Strictness;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;   
@ExtendWith(MockitoExtension.class)
@MockitoSettings(strictness = Strictness.LENIENT)
public class Aster_LocationPath_Test_Passing {
@Mock
    EvalContext evalContext;
@Mock
    RootContext rootContext;
@Mock
    InitialContext initialContext;
@Mock
    NodePointer nodePointer;
LocationPath locationpath;
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testComputeContextDependentAbsoluteTrue_OrSR0() {
    LocationPath locationPath = new LocationPath(true, new Step[0]);
    boolean result = locationPath.computeContextDependent();
    assert (!result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testComputeContextDependentAbsoluteFalse_SyDv1() {
    LocationPath locationPath = new LocationPath(false, new Step[0]);
    boolean result = locationPath.computeContextDependent();
    assert (result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testComputeContextDependentNullSteps_ixzS2() {
    LocationPath locationPath = new LocationPath(true, null);
    boolean result = locationPath.computeContextDependent();
    assert (!result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testIsAbsoluteTrue_xkrz0() {
    LocationPath locationPath = new LocationPath(true, new Step[0]);
    boolean result = locationPath.isAbsolute();
    assert(result == true);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testIsAbsoluteFalse_dlqI1() {
    LocationPath locationPath = new LocationPath(false, new Step[0]);
    boolean result = locationPath.isAbsolute();
    assert(result == false);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testToStringEmptyPath_FoXf4_fid1() {
    LocationPath locationPath = new LocationPath(true, new Step[0]);
    assertEquals("", locationPath.toString());
}
}