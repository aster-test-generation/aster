/**
 * Generated by Aster
 */
package org.apache.commons.jxpath.ri.model.jdom;

import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_JDOMAttributeIterator_Coverage_Test_Failing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void test1_Wnik0() {
        JDOMAttributeIterator instance = new JDOMAttributeIterator(null, null);
        int expResult = 0;
        int result = instance.getPosition();
        assertEquals(expResult, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetPositionWithNullAttributes_yMeY0() {
        JDOMAttributeIterator iterator = new JDOMAttributeIterator(null, null);
        assertFalse(iterator.setPosition(1));
    }
}