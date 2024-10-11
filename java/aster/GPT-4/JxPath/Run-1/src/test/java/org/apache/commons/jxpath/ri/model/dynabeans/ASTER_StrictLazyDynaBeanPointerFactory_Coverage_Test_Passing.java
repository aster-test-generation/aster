/**
 * Generated by Aster
 */
package org.apache.commons.jxpath.ri.model.dynabeans;
import java.util.Locale;
import org.apache.commons.beanutils.LazyDynaBean;
import org.apache.commons.jxpath.ri.QName;
import org.apache.commons.jxpath.ri.model.NodePointer;
import org.apache.commons.jxpath.ri.model.dom.DOMNodePointer;
import static org.junit.jupiter.api.Assertions.*;
import java.util.Locale;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_StrictLazyDynaBeanPointerFactory_Coverage_Test_Passing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetOrder_nwUH0() {
        int expectedOrder = DynaBeanPointerFactory.DYNA_BEAN_POINTER_FACTORY_ORDER - 1;
        StrictLazyDynaBeanPointerFactory factory = new StrictLazyDynaBeanPointerFactory();
        int actualOrder = factory.getOrder();
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCreateNodePointerWithNonLazyDynaBean_zkoO1() {
        StrictLazyDynaBeanPointerFactory factory = new StrictLazyDynaBeanPointerFactory();
        NodePointer parent = new DOMNodePointer(null, null, null); // Assuming suitable constructor
        QName name = new QName("testName");
        Object nonLazyDynaBean = new Object(); // Not a LazyDynaBean
        NodePointer result = factory.createNodePointer(parent, name, nonLazyDynaBean);
        assertNull(result);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testCreateNodePointerWithNonLazyDynaBean_RXud1_TMCi0() {
    QName name = new QName("test");
    Object nonLazyDynaBean = new Object(); // Not a LazyDynaBean
    Locale locale = Locale.getDefault();
    StrictLazyDynaBeanPointerFactory factory = new StrictLazyDynaBeanPointerFactory();
    NodePointer result = factory.createNodePointer(null, name, nonLazyDynaBean);
    assertNull(result, "NodePointer should be null when input is not a LazyDynaBean");
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testCreateNodePointerWithLazyDynaBean_UcCG0_QIqb0_1() {
    StrictLazyDynaBeanPointerFactory factory = new StrictLazyDynaBeanPointerFactory();
    NodePointer parent = new DOMNodePointer(null, null, null); // Assuming suitable constructor
    QName name = new QName("testName");
    LazyDynaBean lazyDynaBean = new LazyDynaBean(); // Assuming LazyDynaBean is a valid class
    NodePointer result = factory.createNodePointer(parent, name, lazyDynaBean);
    assertNotNull(result);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testCreateNodePointerWithLazyDynaBean_UcCG0_QIqb0_2() {
    StrictLazyDynaBeanPointerFactory factory = new StrictLazyDynaBeanPointerFactory();
    NodePointer parent = new DOMNodePointer(null, null, null); // Assuming suitable constructor
    QName name = new QName("testName");
    LazyDynaBean lazyDynaBean = new LazyDynaBean(); // Assuming LazyDynaBean is a valid class
    NodePointer result = factory.createNodePointer(parent, name, lazyDynaBean);
    assertTrue(result instanceof NodePointer);}
}