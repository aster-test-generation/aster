/**
 * Generated by Aster
 */
package org.apache.commons.jxpath.ri.model.dynabeans;

import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_DynaBeanPropertyPointer_Coverage_Test_Failing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testPropertyName1_oual0() {
        DynaBeanPropertyPointer dynaBeanPropertyPointer = new DynaBeanPropertyPointer(null, null);
        dynaBeanPropertyPointer.getPropertyName();
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testRemoveWhenIndexIsWholeCollection_Rxfd0() {
        DynaBeanPropertyPointer dynaBeanPropertyPointer = new DynaBeanPropertyPointer(null, null);
        dynaBeanPropertyPointer.remove();
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetPropertyIndex1_kded0() {
        DynaBeanPropertyPointer dynaBeanPropertyPointer = new DynaBeanPropertyPointer(null, null);
        dynaBeanPropertyPointer.getPropertyIndex();
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void test1_soKk0() {
        DynaBeanPropertyPointer dynaBeanPropertyPointer = new DynaBeanPropertyPointer(null, null);
        dynaBeanPropertyPointer.getImmediateNode();
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetPropertyNames_Baen0() {
        DynaBeanPropertyPointer dynaBeanPropertyPointer = new DynaBeanPropertyPointer(null, null);
        dynaBeanPropertyPointer.getPropertyNames();
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsActualProperty_apIK0() {
        DynaBeanPropertyPointer dynaBeanPropertyPointer = new DynaBeanPropertyPointer(null, null);
        boolean actual = dynaBeanPropertyPointer.isActualProperty();
        assertFalse(actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetPropertyCount_PhBU0() {
        DynaBeanPropertyPointer dynaBeanPropertyPointer = new DynaBeanPropertyPointer(null, null);
        int propertyCount = dynaBeanPropertyPointer.getPropertyCount();
        assertEquals(0, propertyCount);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testPropertyName1_oual0_PiaP0() {
        DynaBeanPropertyPointer dynaBeanPropertyPointer = new DynaBeanPropertyPointer(null, null);
        dynaBeanPropertyPointer.getPropertyCount();
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testPropertyName1_oual0_Cvkc1() {
        DynaBeanPropertyPointer dynaBeanPropertyPointer = new DynaBeanPropertyPointer(null, null);
        dynaBeanPropertyPointer.getPropertyCount();
        return;
    }
}