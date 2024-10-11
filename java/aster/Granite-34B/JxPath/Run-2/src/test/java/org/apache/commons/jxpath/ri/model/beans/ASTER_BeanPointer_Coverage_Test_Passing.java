/**
 * Generated by Aster
 */
package org.apache.commons.jxpath.ri.model.beans;

import java.util.concurrent.TimeUnit;
import org.apache.commons.jxpath.JXPathIntrospector;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_BeanPointer_Coverage_Test_Passing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsLeaf1_Uswd0_GGxH0() {
        BeanPointer beanPointer = new BeanPointer(null, new Object(), null, null);
        boolean actual = beanPointer.isLeaf();
        boolean expected = JXPathIntrospector.getBeanInfo(beanPointer.getNode().getClass()).isAtomic();
        assertEquals(expected, actual);
    }
}