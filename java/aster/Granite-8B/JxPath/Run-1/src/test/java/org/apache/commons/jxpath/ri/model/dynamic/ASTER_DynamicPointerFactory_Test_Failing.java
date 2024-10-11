/**
 * Generated by Aster
 */
package org.apache.commons.jxpath.ri.model.dynamic;

import java.util.Locale;
import java.util.concurrent.TimeUnit;
import org.apache.commons.jxpath.DynamicPropertyHandler;
import org.apache.commons.jxpath.JXPathIntrospector;
import org.apache.commons.jxpath.ri.QName;
import org.apache.commons.jxpath.ri.model.NodePointer;
import org.apache.commons.jxpath.util.ValueUtils;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.mockito.junit.jupiter.MockitoSettings;
import org.mockito.quality.Strictness;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

@ExtendWith(MockitoExtension.class)
@MockitoSettings(strictness = Strictness.LENIENT)
public class Aster_DynamicPointerFactory_Test_Failing {
    @Mock
    private JXPathIntrospector jXPathIntrospector;
    @Mock
    private ValueUtils valueUtils;
    @Mock
    private DynamicPropertyHandler dynamicPropertyHandler;

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCreateNodePointerDynamic_iTFZ0() {
        DynamicPointerFactory factory = new DynamicPointerFactory();
        QName name = new QName("prefix", "localName");
        Object bean = new Object();
        Locale locale = Locale.US;
        NodePointer result = factory.createNodePointer(name, bean, locale);
        Assertions.assertNotNull(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetOrder_GydZ0_gLJz0() {
        DynamicPointerFactory dynamicPointerFactory = new DynamicPointerFactory();
        int order = dynamicPointerFactory.getOrder();
        assertEquals(0, order);
    }
}