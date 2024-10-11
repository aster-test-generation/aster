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
public void testCreateNodePointerWithNonNodeBean_YpfE0_bDHp0() {
    DOMPointerFactory factory = new DOMPointerFactory();
    QName name = new QName("test");
    Object nonNodeBean = new Object(); // This is not an instance of Node
    Locale locale = Locale.getDefault();
    NodePointer result = factory.createNodePointer(null, name, nonNodeBean);
    assertNull(result, "Expected null since bean is not an instance of Node");
}
}