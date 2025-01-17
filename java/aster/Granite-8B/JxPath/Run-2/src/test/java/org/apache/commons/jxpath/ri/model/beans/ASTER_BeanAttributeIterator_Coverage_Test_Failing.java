/**
 * Generated by Aster
 */
package org.apache.commons.jxpath.ri.model.beans;
import org.apache.commons.jxpath.ri.model.NodePointer;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_BeanAttributeIterator_Coverage_Test_Failing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetPosition1_eZzB0() {
        BeanAttributeIterator beanAttributeIterator = new BeanAttributeIterator(null, null);
        beanAttributeIterator.setPosition(1);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetPosition2_LHSL1() {
        BeanAttributeIterator beanAttributeIterator = new BeanAttributeIterator(null, null);
        beanAttributeIterator.setPosition(0);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetNodePointer_OqjU0() {
        BeanAttributeIterator iterator = new BeanAttributeIterator(null, null);
        NodePointer pointer = iterator.getNodePointer();
        assertNotNull(pointer);
    }
}