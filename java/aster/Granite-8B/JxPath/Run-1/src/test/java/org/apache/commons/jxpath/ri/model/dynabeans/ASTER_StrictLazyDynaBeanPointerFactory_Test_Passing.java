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
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.mockito.junit.jupiter.MockitoSettings;
import org.mockito.quality.Strictness;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

@ExtendWith(MockitoExtension.class)
@MockitoSettings(strictness = Strictness.LENIENT)
public class Aster_StrictLazyDynaBeanPointerFactory_Test_Passing {
    @Mock
    private NodePointer parent;
    @Mock
    private QName name;
    @Mock
    private LazyDynaBean object;
    private StrictLazyDynaBeanPointerFactory strictlazydynabeanpointerfactory;

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCreateNodePointerLazyDynaBean_RkNN0() {
        StrictLazyDynaBeanPointerFactory factory = new StrictLazyDynaBeanPointerFactory();
        QName name = new QName("prefix", "localName");
        LazyDynaBean object = new LazyDynaBean();
        Locale locale = Locale.US;
        NodePointer result = factory.createNodePointer(name, object, locale);
        assertNotNull(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCreateNodePointerNotLazyDynaBean_iVED1() {
        StrictLazyDynaBeanPointerFactory factory = new StrictLazyDynaBeanPointerFactory();
        QName name = new QName("prefix", "localName");
        Object object = new Object();
        Locale locale = Locale.US;
        NodePointer result = factory.createNodePointer(name, object, locale);
        assertNull(result);
    }
}