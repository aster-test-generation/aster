/**
 * Generated by Aster
 */
package org.apache.commons.jxpath.ri.model.dom;
import static org.junit.jupiter.api.Assertions.assertNull;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.mockito.Mockito.when;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_DOMNamespaceIterator_Coverage_Test_Passing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetNodePointer_PositionNotSet_LzjQ0_LEwj0() {
    DOMNodePointer parent = mock(DOMNodePointer.class);
    DOMNamespaceIterator iterator = new DOMNamespaceIterator(parent);
    when(iterator.setPosition(1)).thenReturn(false);
    assertNull(iterator.getNodePointer());
}
}