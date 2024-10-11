/**
 * Generated by Aster
 */
package org.apache.commons.jxpath.ri.model.dynabeans;

import java.util.concurrent.TimeUnit;
import org.apache.commons.beanutils.DynaClass;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_DynaBeanPropertyPointer_Coverage_Test_Passing {
    private DynaClass dynaClass;

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetPropertyIndex_SameIndex_uilF0() {
        DynaBeanPropertyPointer dynaBeanPropertyPointer = new DynaBeanPropertyPointer(null, null);
        dynaBeanPropertyPointer.setPropertyIndex(0);
        assertEquals(0, dynaBeanPropertyPointer.getPropertyIndex());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetPropertyIndex_SuperGetPropertyIndex_VVmy5() {
        DynaBeanPropertyPointer dynaBeanPropertyPointer = new DynaBeanPropertyPointer(null, null);
        dynaBeanPropertyPointer.setPropertyIndex(1);
        assertEquals(1, dynaBeanPropertyPointer.getPropertyIndex());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetPropertyIndex_DifferentIndex_omXk1_1() {
        DynaBeanPropertyPointer dynaBeanPropertyPointer = new DynaBeanPropertyPointer(null, null);
        dynaBeanPropertyPointer.setPropertyIndex(0);
        dynaBeanPropertyPointer.setPropertyIndex(1);
        assertEquals(1, dynaBeanPropertyPointer.getPropertyIndex());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetPropertyName_xoix0_cKhb0() {
        DynaBeanPropertyPointer dynaBeanPropertyPointer = new DynaBeanPropertyPointer(null, null);
        dynaBeanPropertyPointer.setPropertyName("testProperty");
        assertEquals("testProperty", dynaBeanPropertyPointer.getPropertyName());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void setDynaClass(DynaClass dynaClass) {
        this.dynaClass = dynaClass;
    }
}