/**
 * Generated by Aster
 */
package org.apache.commons.jxpath.ri.model.jdom;
import org.apache.commons.jxpath.ri.model.NodePointer;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.mockito.Mockito.when;
import static org.mockito.Mockito.when;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_JDOMNodeIterator_Coverage_Test_Failing {
    private int position = 0;
    JDOMNodeIterator jdomnodeiterator;
@BeforeEach
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testsetPosition_GreaterPosition_False_SeXh2_HBzT0() throws Exception {
    NodePointer nodePointer = jdomnodeiterator.getNodePointer();
    when(nodePointer.getIndex()).thenReturn(4);
    boolean result = jdomnodeiterator.setPosition(5);
    assertEquals(false, result);
}
}