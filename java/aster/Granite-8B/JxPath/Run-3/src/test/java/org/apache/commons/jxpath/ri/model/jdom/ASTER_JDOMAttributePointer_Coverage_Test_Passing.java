/**
 * Generated by Aster
 */
package org.apache.commons.jxpath.ri.model.jdom;

import java.util.concurrent.TimeUnit;
import org.jdom.Attribute;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_JDOMAttributePointer_Coverage_Test_Passing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCompareChildNodePointers_tPPh0() {
        JDOMAttributePointer jDOMAttributePointer = new JDOMAttributePointer(null, null);
        int actual = jDOMAttributePointer.compareChildNodePointers(null, null);
        int expected = 0;
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAsPathWithNonNullParentAndEmptyBuffer_zzeC1() {
        Attribute attr = new Attribute("attr", "value");
        JDOMAttributePointer jDOMAttributePointer = new JDOMAttributePointer(new JDOMNodePointer(null, null, null), attr);
        assertEquals("/@attr", jDOMAttributePointer.asPath());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsActual_JJVo0()
    {
        JDOMAttributePointer jDOMAttributePointer = new JDOMAttributePointer(null, null);
        boolean actual = jDOMAttributePointer.isActual();
        boolean expected = true;
        assertEquals(expected, actual);
    }
}