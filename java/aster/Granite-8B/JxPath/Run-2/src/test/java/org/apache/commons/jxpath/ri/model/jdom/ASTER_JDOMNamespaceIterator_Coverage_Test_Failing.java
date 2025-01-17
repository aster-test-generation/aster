/**
 * Generated by Aster
 */
package org.apache.commons.jxpath.ri.model.jdom;
import static org.junit.jupiter.api.Assertions.assertFalse;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_JDOMNamespaceIterator_Coverage_Test_Failing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetPosition1_snVu0() {
        JDOMNamespaceIterator jDOMNamespaceIterator = new JDOMNamespaceIterator(null);
        boolean result = jDOMNamespaceIterator.setPosition(0);
        assertFalse(result);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetPosition2_mFzJ1() {
        JDOMNamespaceIterator jDOMNamespaceIterator = new JDOMNamespaceIterator(null);
        boolean result = jDOMNamespaceIterator.setPosition(1);
        assertFalse(result);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetPosition3_ygJo2() {
        JDOMNamespaceIterator jDOMNamespaceIterator = new JDOMNamespaceIterator(null);
        boolean result = jDOMNamespaceIterator.setPosition(-1);
        assertFalse(result);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetPosition4_IMWN3() {
        JDOMNamespaceIterator jDOMNamespaceIterator = new JDOMNamespaceIterator(null);
        boolean result = jDOMNamespaceIterator.setPosition(10);
        assertFalse(result);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetNodePointer1_QYpv0() {
        JDOMNamespaceIterator iterator = new JDOMNamespaceIterator(null);
        iterator.getNodePointer();
    }
}