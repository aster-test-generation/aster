/**
 * Generated by Aster
 */
package org.apache.commons.jxpath.ri.model.dom;
import java.util.Locale;
import org.apache.commons.jxpath.ri.QName;
import org.apache.commons.jxpath.ri.model.NodePointer;
import static org.junit.jupiter.api.Assertions.assertNull;
import java.util.Locale;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_DOMPointerFactory_Coverage_Test_Passing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testCreateNodePointerWithNonNode_qPyl1_mYyq0() {
    DOMPointerFactory factory = new DOMPointerFactory();
    QName name = new QName("test");
    Object nonNodeBean = new Object();
    NodePointer parent = new DOMNodePointer(null, Locale.getDefault());
    NodePointer result = factory.createNodePointer(parent, name, nonNodeBean);
    assertNull(result);
}
}