/**
 * Generated by Aster
 */
package org.apache.commons.jxpath.ri.model.beans;

import java.beans.PropertyDescriptor;
import java.util.concurrent.TimeUnit;
import org.apache.commons.jxpath.ri.model.VariablePointer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_BeanPropertyPointer_Coverage_Test_Failing {
    private PropertyDescriptor pd;
    private VariablePointer variablePointer;

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsCollection_pdNull_sZBz0() {
        BeanPropertyPointer bpp = new BeanPropertyPointer(null, null);
        assertFalse(bpp.isCollection());
    }

    @Test
    public void testGetPropertyCount_KhHB0() {
        BeanPropertyPointer beanPropertyPointer = new BeanPropertyPointer(null, null);
        int actual = beanPropertyPointer.getPropertyCount();
        assertEquals(0, actual);
    }

    @Test
    public void testGetPropertyCount_KhHB0_fid2() {
        BeanPropertyPointer beanPropertyPointer = new BeanPropertyPointer(null, null);
        int actual = 0;
        assertEquals(actual, beanPropertyPointer.getPropertyCount());
    }
}