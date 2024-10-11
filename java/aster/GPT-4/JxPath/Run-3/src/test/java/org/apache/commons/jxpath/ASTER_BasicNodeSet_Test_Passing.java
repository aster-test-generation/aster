/**
 * Generated by Aster
 */
package org.apache.commons.jxpath;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;
import java.util.List;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_BasicNodeSet_Test_Passing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetPointersReturnsUnmodifiableList_iHjJ1() {
    BasicNodeSet nodeSet = new BasicNodeSet();
    List pointers = nodeSet.getPointers();
    try {
        pointers.add(new Object());
        fail("Should throw UnsupportedOperationException on attempt to modify list");
    } catch (UnsupportedOperationException e) {
    }
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetValuesWhenEmpty_LuWm0() {
    BasicNodeSet nodeSet = new BasicNodeSet();
    List result = nodeSet.getValues();
    assertTrue(result.isEmpty());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testToStringReturnsEmptyListStringWhenNoPointers_rCfp0() {
    BasicNodeSet basicNodeSet = new BasicNodeSet();
    assertEquals("[]", basicNodeSet.toString());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetNodes_EmptyPointerList_FUxZ0() {
    BasicNodeSet basicNodeSet = new BasicNodeSet();
    List result = basicNodeSet.getNodes();
    assertTrue(result.isEmpty());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAddNullPointer_oBHq1() {
        BasicNodeSet nodeSet = new BasicNodeSet();
        Pointer pointer = null;
        try {
            nodeSet.add(pointer);
            fail("Should throw NullPointerException");
        } catch (NullPointerException e) {
        }
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetPointersReturnsNonNullList_FwPd0_jswb0() {
    BasicNodeSet nodeSet = new BasicNodeSet();
    assertNotNull(nodeSet.getPointers(), "List returned should not be null");
}
}