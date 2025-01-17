/**
 * Generated by Aster
 */
package org.apache.commons.jxpath.ri.model.beans;

import java.util.concurrent.TimeUnit;
import org.apache.commons.jxpath.JXPathBasicBeanInfo;
import org.apache.commons.jxpath.ri.model.dom.DOMNodePointer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_BeanPointer_Coverage_Test_Failing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsLeafNonAtomicValue_xveP2_fid1() {
        BeanPointer beanPointer = new BeanPointer(null, null, "nonAtomicValue", new JXPathBasicBeanInfo(String.class, false));
        assertFalse(beanPointer.isLeaf());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsLeafNonStringValue_WqqM3_fid1() {
        BeanPointer beanPointer = new BeanPointer(null, null, new Integer(1), new JXPathBasicBeanInfo(Integer.class, false));
        assertFalse(beanPointer.isLeaf());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEquals_DifferentParent_ReturnsFalse_PzDn3_uDeM0_fid3() {
        BeanPointer beanPointer = new BeanPointer(new DOMNodePointer(null, null, null), null, null, null);
        BeanPointer other = new BeanPointer(new DOMNodePointer(null, null, null), null, null, null);
        assertEquals(false, beanPointer.equals(other));
    }
}