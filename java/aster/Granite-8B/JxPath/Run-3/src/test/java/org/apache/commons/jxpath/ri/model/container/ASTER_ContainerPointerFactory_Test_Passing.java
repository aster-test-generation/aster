/**
 * Generated by Aster
 */
package org.apache.commons.jxpath.ri.model.container;

import java.util.Locale;
import java.util.concurrent.TimeUnit;
import org.apache.commons.jxpath.ri.QName;
import org.apache.commons.jxpath.ri.model.NodePointer;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import org.mockito.junit.jupiter.MockitoSettings;
import org.mockito.quality.Strictness;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

@ExtendWith(MockitoExtension.class)
@MockitoSettings(strictness = Strictness.LENIENT)
public class Aster_ContainerPointerFactory_Test_Passing {
    ContainerPointerFactory containerpointerfactory;

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testOrder_Sfrh0() {
        ContainerPointerFactory factory = new ContainerPointerFactory();
        int order = factory.getOrder();
        assertEquals(1, order);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCreateNodePointerWithNullBean_sunr1() {
        ContainerPointerFactory factory = new ContainerPointerFactory();
        NodePointer pointer = factory.createNodePointer(new QName("name"), null, Locale.getDefault());
        Assertions.assertNull(pointer);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCreateNodePointerWithNonContainerBean_PDGC2() {
        ContainerPointerFactory factory = new ContainerPointerFactory();
        Object bean = new Object();
        NodePointer pointer = factory.createNodePointer(new QName("name"), bean, Locale.getDefault());
        Assertions.assertNull(pointer);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEquals_RCQT3_1() {
        QName qname = new QName("prefix", "local");
        assertFalse(qname.equals(null));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEquals_RCQT3_2() {
        QName qname = new QName("prefix", "local");
        assertFalse(qname.equals(new Object()));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEquals_RCQT3_3() {
        QName qname = new QName("prefix", "local");
        assertTrue(qname.equals(qname));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEquals_RCQT3_4() {
        QName qname = new QName("prefix", "local");
        assertTrue(qname.equals(new QName("prefix", "local")));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEquals_RCQT3_5() {
        QName qname = new QName("prefix", "local");
        assertFalse(qname.equals(new QName("prefix1", "local")));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEquals_RCQT3_6() {
        QName qname = new QName("prefix", "local");
        assertFalse(qname.equals(new QName("prefix", "local1")));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetName_PDDm4() {
        QName qname = new QName("prefix", "local");
        assertEquals("local", qname.getName());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetPrefix_FKSt5() {
        QName qname = new QName("prefix", "local");
        assertEquals("prefix", qname.getPrefix());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testToString_ZxIQ6() {
        QName qname = new QName("prefix", "local");
        assertEquals("{prefix}local", qname.toString());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHashCode_ZXtd7() {
        QName qname1 = new QName("prefix", "local");
        QName qname2 = new QName("prefix", "local");
        assertEquals(qname1.hashCode(), qname2.hashCode());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEquals_RCQT3() {
        QName qname = new QName("prefix", "local");
        assertFalse(qname.equals(null));
        assertFalse(qname.equals(new Object()));
        assertTrue(qname.equals(qname));
        assertTrue(qname.equals(new QName("prefix", "local")));
        assertFalse(qname.equals(new QName("prefix1", "local")));
        assertFalse(qname.equals(new QName("prefix", "local1")));
    }
}