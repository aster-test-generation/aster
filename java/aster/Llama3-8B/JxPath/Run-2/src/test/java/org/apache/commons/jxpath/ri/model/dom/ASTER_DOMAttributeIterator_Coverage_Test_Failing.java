/**
 * Generated by Aster
 */
package org.apache.commons.jxpath.ri.model.dom;
import org.apache.commons.jxpath.ri.model.NodePointer;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_DOMAttributeIterator_Coverage_Test_Failing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSetPositionFailed_FOfx2_HtoQ0_1() {
    DOMAttributeIterator iterator = new DOMAttributeIterator(null, null);
    boolean result = iterator.setPosition(1);
    NodePointer result1 = iterator.getNodePointer();
    assertFalse(result);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSetPositionFailed_FOfx2_HtoQ0_2() {
    DOMAttributeIterator iterator = new DOMAttributeIterator(null, null);
    boolean result = iterator.setPosition(1);
    NodePointer result1 = iterator.getNodePointer();
    assertNull(result1);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSetPositionSuccess_oGXz3_Guun0() {
    DOMAttributeIterator iterator = new DOMAttributeIterator(null, null);
    iterator.setPosition(1);
    NodePointer result1 = iterator.getNodePointer();
    assertNotNull(result1);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetPositionNonZero_JIyp1_aqpx0() {
    DOMAttributeIterator iterator = new DOMAttributeIterator(null, null);
    DOMAttributeIterator positionSetter = new DOMAttributeIterator(null, null);
    NodePointer result = positionSetter.getNodePointer();
    assertNotNull(result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testIndexLessThanZero_uSJJ4_yVUa1() {
    DOMAttributeIterator iterator = new DOMAttributeIterator(null, null);
    iterator.setPosition(-1);
    NodePointer result = iterator.getNodePointer();
    assertNotNull(result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testIndexZero_vscA5_HDfi0_1() {
    DOMAttributeIterator iterator = new DOMAttributeIterator(null, null);
    iterator.setPosition(0);
    NodePointer result = iterator.getNodePointer();
    assertNotNull(iterator.setPosition(0));}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testIndexZero_vscA5_HDfi0_2() {
    DOMAttributeIterator iterator = new DOMAttributeIterator(null, null);
    iterator.setPosition(0);
    NodePointer result = iterator.getNodePointer();
    assertNotNull(result);}
}