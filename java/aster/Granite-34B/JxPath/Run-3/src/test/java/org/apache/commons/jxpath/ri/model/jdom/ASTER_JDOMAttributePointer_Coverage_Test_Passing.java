/**
 * Generated by Aster
 */
package org.apache.commons.jxpath.ri.model.jdom;

import java.util.concurrent.TimeUnit;
import org.apache.commons.jxpath.ri.model.dom.DOMNodePointer;
import org.jdom.Attribute;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_JDOMAttributePointer_Coverage_Test_Passing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testMethod1_DWbL0() {
        JDOMAttributePointer obj = new JDOMAttributePointer(null, null);
        assertEquals(0, obj.hashCode());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void test_equals_Object_0_ifvq0() {
        JDOMAttributePointer jDOMAttributePointer0 = new JDOMAttributePointer((DOMNodePointer) null, (Attribute) null);
        boolean boolean0 = jDOMAttributePointer0.equals((Object) null);
        assertEquals(false, boolean0);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void test_equals_Object_1_SoXE1() {
        JDOMAttributePointer jDOMAttributePointer0 = new JDOMAttributePointer((DOMNodePointer) null, (Attribute) null);
        boolean boolean0 = jDOMAttributePointer0.equals((Object) jDOMAttributePointer0);
        assertEquals(true, boolean0);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testBufferNotAppendedWithParentPath_KIqs3() {
        JDOMAttributePointer pointer = new JDOMAttributePointer(null, new Attribute("name", "value"));
        assertFalse(pointer.asPath().contains("parent"));
    }
}