/**
 * Generated by Aster
 */
package org.apache.commons.jxpath.ri.model.dom;
import org.apache.commons.jxpath.ri.model.NodePointer;
import org.w3c.dom.Node;
import org.apache.commons.jxpath.ri.compiler.NodeTypeTest;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_DOMNodeIterator_Coverage_Test_Failing {
    private int position = 0;
    DOMNodeIterator domNodeIterator;
    Node node;
    NodePointer nodePointer;
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testsetPosition_PositionNegative_ThrowsException_JbIk7() throws Exception {
        assertThrows(IllegalArgumentException.class, () -> domNodeIterator.setPosition(-1));
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetNodePointer_PositionNotZero_EUrt1_GHCY0() {
    DOMNodePointer pointer = new DOMNodePointer(null, null, null);
    DOMNodeIterator iterator = new DOMNodeIterator(pointer, new NodeTypeTest(0), false, null);
    assertNull(iterator.getNodePointer());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetNodePointer_ChildIsNull_EutA2_nWIv0_fid2() {
    DOMNodePointer parent = new DOMNodePointer(null, null, null);
    NodeTypeTest nodeTest = new NodeTypeTest(0);
    DOMNodeIterator iterator = new DOMNodeIterator(parent, nodeTest, false, null);
    NodePointer pointer = iterator.getNodePointer();
    assertNull(pointer);
}
}