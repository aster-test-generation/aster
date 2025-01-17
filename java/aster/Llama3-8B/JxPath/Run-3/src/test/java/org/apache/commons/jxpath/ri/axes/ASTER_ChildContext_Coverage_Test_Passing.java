/**
 * Generated by Aster
 */
package org.apache.commons.jxpath.ri.axes;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.mockito.Mockito.when;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_ChildContext_Coverage_Test_Passing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void setup_EjHx0_oTFj0() throws Exception {
    ChildContext childContext = new ChildContext(null, null, false, false);
    ChildContext childContextMock = mock(ChildContext.class);
    when(childContextMock.nextNode()).thenReturn(true);
    when(childContextMock.getCurrentPosition()).thenReturn(0);
    when(childContextMock.getPosition()).thenReturn(0);
    when(childContextMock.setPosition(1)).thenReturn(true);
    when(childContextMock.getPosition()).thenReturn(1);
}
}