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
    public void testSetPositionWithNullNamespaces_XQco0() {
        JDOMNamespaceIterator iterator = new JDOMNamespaceIterator(null);
        boolean result = iterator.setPosition(1);
        assertFalse(result);
    }
}