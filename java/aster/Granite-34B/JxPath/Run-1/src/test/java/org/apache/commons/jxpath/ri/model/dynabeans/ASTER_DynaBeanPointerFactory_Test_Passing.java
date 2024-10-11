/**
 * Generated by Aster
 */
package org.apache.commons.jxpath.ri.model.dynabeans;

import java.util.Locale;
import java.util.concurrent.TimeUnit;
import org.apache.commons.jxpath.ri.QName;
import org.apache.commons.jxpath.ri.model.NodePointer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import org.mockito.junit.jupiter.MockitoSettings;
import org.mockito.quality.Strictness;

import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

@ExtendWith(MockitoExtension.class)
@MockitoSettings(strictness = Strictness.LENIENT)
public class Aster_DynaBeanPointerFactory_Test_Passing {
    DynaBeanPointerFactory dynabeanpointerfactory;
    NodePointer parent;
    QName name;
    Object bean;

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCreateNodePointerWithoutDynaBean_Vbce1() {
        DynaBeanPointerFactory factory = new DynaBeanPointerFactory();
        Object bean = new Object();
        Locale locale = Locale.getDefault();
        NodePointer pointer = factory.createNodePointer(new QName("name"), bean, locale);
        assertNull(pointer);
    }
}