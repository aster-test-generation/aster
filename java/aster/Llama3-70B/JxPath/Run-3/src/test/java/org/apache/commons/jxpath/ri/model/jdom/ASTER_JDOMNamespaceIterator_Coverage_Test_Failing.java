/**
 * Generated by Aster
 */
package org.apache.commons.jxpath.ri.model.jdom;
import org.apache.commons.jxpath.ri.model.NodePointer;
import org.apache.commons.jxpath.ri.model.dom.DOMNodePointer;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_JDOMNamespaceIterator_Coverage_Test_Failing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSetPosition_ReturnFalse_zJUV1_CKCx0() {
    JDOMNamespaceIterator iterator = new JDOMNamespaceIterator(new DOMNodePointer(null, null, null));
    iterator.setPosition(1);
    NodePointer nodePointer = iterator.getNodePointer();
    assertNotNull(nodePointer);
}
}