/**
 * Generated by Aster
 */
package org.apache.commons.jxpath.ri.model.dynabeans;

import java.util.Locale;
import java.util.concurrent.TimeUnit;
import org.apache.commons.beanutils.LazyDynaBean;
import org.apache.commons.jxpath.ri.QName;
import org.apache.commons.jxpath.ri.model.NodePointer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import org.mockito.junit.jupiter.MockitoSettings;
import org.mockito.quality.Strictness;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

@ExtendWith(MockitoExtension.class)
@MockitoSettings(strictness = Strictness.LENIENT)
public class Aster_StrictLazyDynaBeanPointerFactory_Test_Passing {
    StrictLazyDynaBeanPointerFactory strictlazydynabeanpointerfactory;
    NodePointer parent;
    QName name;
    LazyDynaBean object;

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCreateNodePointerWithNonLazyDynaBeanObject_PtKF1() {
        StrictLazyDynaBeanPointerFactory factory = new StrictLazyDynaBeanPointerFactory();
        Object object = new Object();
        Locale locale = Locale.getDefault();
        NodePointer pointer = factory.createNodePointer(new QName("name"), object, locale);
        assertNull(pointer);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetOrder_jbny0() {
        StrictLazyDynaBeanPointerFactory strictLazyDynaBeanPointerFactory = new StrictLazyDynaBeanPointerFactory();
        int actual = strictLazyDynaBeanPointerFactory.getOrder();
        int expected = DynaBeanPointerFactory.DYNA_BEAN_POINTER_FACTORY_ORDER - 1;
        assertEquals(expected, actual);
    }
}