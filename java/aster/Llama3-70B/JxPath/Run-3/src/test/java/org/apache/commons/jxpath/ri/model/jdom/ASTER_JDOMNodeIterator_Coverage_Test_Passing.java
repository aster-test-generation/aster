/**
 * Generated by Aster
 */
package org.apache.commons.jxpath.ri.model.jdom;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_JDOMNodeIterator_Coverage_Test_Passing {
    private int position = 0;
    JDOMNodeIterator jdomnodeiterator;
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testsetPosition_LessPosition_vmjv3_QdYk0() throws Exception {
    JDOMNodeIterator jdomnodeiterator = mock(JDOMNodeIterator.class);
    when(jdomnodeiterator.setPosition(5)).thenReturn(true);
    when(jdomnodeiterator.setPosition(3)).thenReturn(true);
    boolean result = jdomnodeiterator.setPosition(2);
    assertEquals(true, result);
    verify(jdomnodeiterator, times(3)).setPosition(anyInt());
}
}