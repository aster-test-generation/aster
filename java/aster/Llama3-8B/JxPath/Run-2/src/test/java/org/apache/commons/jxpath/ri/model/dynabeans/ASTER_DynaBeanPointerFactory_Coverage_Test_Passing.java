/**
 * Generated by Aster
 */
package org.apache.commons.jxpath.ri.model.dynabeans;
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
public class Aster_DynaBeanPointerFactory_Coverage_Test_Passing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCreateNodePointer_NotDynaBean_gnSE1() {
        DynaBeanPointerFactory factory = new DynaBeanPointerFactory();
        QName name = new QName("testName");
        Object bean = new Object();
        Locale locale = Locale.US;
        NodePointer result = factory.createNodePointer(name, bean, locale);
        assertNull(result);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testCreateNodePointer_NotDynaBean_zwOg1_SEHv0() {
    DynaBeanPointerFactory factory = new DynaBeanPointerFactory();
    QName name = new QName("testName");
    Object bean = new Object();
    NodePointer parent = null;
    NodePointer result = factory.createNodePointer(parent, name, bean);
    assertNull(result);
}
}