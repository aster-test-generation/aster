/**
 * Generated by Aster
 */
package org.apache.commons.jxpath.ri.model.dom;
import org.apache.commons.jxpath.ri.compiler.NodeTypeTest;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_DOMNodeIterator_Coverage_Test_Passing {
    private DOMNodeIterator domNodeIterator;
    private DOMNodePointer parentNode;
    private NodeTypeTest nodeTest;
    private DOMNodePointer startWith;
@BeforeEach
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void setup_RxRb0() {
        parentNode = mock(DOMNodePointer.class);
        nodeTest = mock(NodeTypeTest.class);
        startWith = mock(DOMNodePointer.class);
        domNodeIterator = new DOMNodeIterator(parentNode, nodeTest, false, startWith);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSetPosition_SuccessfulIncreasePosition_gMMj1_hEwo0_1() {
    DOMNodeIterator domNodeIterator = mock(DOMNodeIterator.class);
    doReturn(true).when(domNodeIterator).setPosition(5);
    assertTrue(domNodeIterator.setPosition(5));}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSetPosition_SuccessfulIncreasePosition_gMMj1_hEwo0_2() {
    DOMNodeIterator domNodeIterator = mock(DOMNodeIterator.class);
    doReturn(true).when(domNodeIterator).setPosition(5);
    assertEquals(5, domNodeIterator.getPosition());}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSetPosition_FailToIncreasePosition_GybL2_MhmP0_1() {
    DOMNodeIterator domNodeIterator = mock(DOMNodeIterator.class);
    when(domNodeIterator.setPosition(3)).thenReturn(false);
    assertFalse(domNodeIterator.setPosition(3));}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSetPosition_FailToIncreasePosition_GybL2_MhmP0_2() {
    DOMNodeIterator domNodeIterator = mock(DOMNodeIterator.class);
    when(domNodeIterator.setPosition(3)).thenReturn(false);
    assertEquals(0, domNodeIterator.getPosition());}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSetPosition_FailToDecreasePosition_FoGR4_HrFO0_2_fid2() {
    try {
        domNodeIterator.setPosition(5);
        fail("Expected a NullPointerException to be thrown");
    } catch (NullPointerException e) {
        assertEquals("Cannot invoke \"org.w3c.dom.Node.getFirstChild()\" because \"this.node\" is null", e.getMessage());
    }
}
}