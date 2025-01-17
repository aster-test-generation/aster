/**
 * Generated by Aster
 */
package org.apache.commons.jxpath.ri.model.dynabeans;
import java.util.Locale;
import org.apache.commons.beanutils.LazyDynaBean;
import org.apache.commons.jxpath.ri.QName;
import org.apache.commons.jxpath.ri.model.NodePointer;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;
import java.util.Locale;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_StrictLazyDynaBeanPointerFactory_Coverage_Test_Passing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCreateNodePointerWithLazyDynaBean_DDPQ0() {
        StrictLazyDynaBeanPointerFactory factory = new StrictLazyDynaBeanPointerFactory();
        LazyDynaBean dynaBean = new LazyDynaBean();
        Locale locale = Locale.getDefault();
        NodePointer pointer = factory.createNodePointer(new QName("name"), dynaBean, locale);
        assertNotNull(pointer);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCreateNodePointerWithoutLazyDynaBean_xKYK1() {
        StrictLazyDynaBeanPointerFactory factory = new StrictLazyDynaBeanPointerFactory();
        Object object = new Object();
        Locale locale = Locale.getDefault();
        NodePointer pointer = factory.createNodePointer(new QName("name"), object, locale);
        assertNull(pointer);
    }
}