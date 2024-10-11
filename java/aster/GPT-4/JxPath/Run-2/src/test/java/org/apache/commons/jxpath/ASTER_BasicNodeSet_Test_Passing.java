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
public void testGetPointersWhenInitiallyEmpty_vMSS0_1() {
    BasicNodeSet nodeSet = new BasicNodeSet();
    List result = nodeSet.getPointers();
    assertNotNull(result);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetPointersWhenInitiallyEmpty_vMSS0_2() {
    BasicNodeSet nodeSet = new BasicNodeSet();
    List result = nodeSet.getPointers();
    assertTrue(result.isEmpty());}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetPointersReturnsUnmodifiableList_iKSD1() {
    BasicNodeSet nodeSet = new BasicNodeSet();
    List result = nodeSet.getPointers();
    try {
        result.add(new Object());
        fail("Expected UnsupportedOperationException");
    } catch (UnsupportedOperationException e) {
    }
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetValues_WhenEmpty_gBDK0() {
    BasicNodeSet nodeSet = new BasicNodeSet();
    List result = nodeSet.getValues();
    assertTrue(result.isEmpty());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testToStringReturnsEmptyListRepresentation_mgST0() {
    BasicNodeSet basicNodeSet = new BasicNodeSet();
    assertEquals("[]", basicNodeSet.toString());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetNodesWhenEmpty_IlbH0() {
    BasicNodeSet basicNodeSet = new BasicNodeSet();
    List result = basicNodeSet.getNodes();
    assertTrue(result.isEmpty());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetPointersWhenInitiallyEmpty_vMSS0() {
    BasicNodeSet nodeSet = new BasicNodeSet();
    List result = nodeSet.getPointers();
    assertNotNull(result);
    assertTrue(result.isEmpty());
}
}