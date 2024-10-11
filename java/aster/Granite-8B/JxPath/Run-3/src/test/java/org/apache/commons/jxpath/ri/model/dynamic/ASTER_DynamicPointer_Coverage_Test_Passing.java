/**
 * Generated by Aster
 */
package org.apache.commons.jxpath.ri.model.dynamic;

import java.util.Locale;
import java.util.concurrent.TimeUnit;
import org.apache.commons.jxpath.ri.QName;
import org.apache.commons.jxpath.ri.model.NodeIterator;
import org.apache.commons.jxpath.ri.model.dom.DOMNodePointer;
import org.apache.commons.jxpath.servlet.PageContextHandler;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_DynamicPointer_Coverage_Test_Passing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEqualsWhenBeanIsNotEqual_Vhzw2() {
        DynamicPointer dynamicPointer = new DynamicPointer(null, new Object(), null, null);
        DynamicPointer other = new DynamicPointer(null, new Object(), null, null);
        boolean result = dynamicPointer.equals(other);
        assertFalse(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAttributeIterator_eCIF0() {
        DynamicPointer dynamicPointer = new DynamicPointer(new QName("name"), new Object(), new PageContextHandler(), new Locale("en"));
        NodeIterator nodeIterator = dynamicPointer.attributeIterator(new QName("name"));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetName_Mhdq0()
    {
        DynamicPointer dynamicPointer = new DynamicPointer(new QName("name"), new Object(), new PageContextHandler(), new Locale("en"));
        QName actualName = dynamicPointer.getName();
        QName expectedName = new QName("name");
        assertEquals(expectedName, actualName);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEqualsWhenNameIsNotEqual_vwkg3_XZDV0() {
        DOMNodePointer parent = new DOMNodePointer(null, null, null);
        DynamicPointer dynamicPointer = new DynamicPointer(parent, null, null, null);
        DynamicPointer other = new DynamicPointer(parent, null, null, null);
        boolean result = dynamicPointer.equals(other);
        assertTrue(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetName_Mhdq0_wLmn0() {
        {
            DynamicPointer dynamicPointer = new DynamicPointer(new QName("name"), new Object(), new PageContextHandler(), new Locale("en"));
            QName actualName = dynamicPointer.getName();
            QName expectedName = new QName("name");
            assertEquals(expectedName, actualName);
        }
    }
}