/**
 * Generated by Aster
 */
package org.apache.commons.jxpath.ri.axes;

import java.util.concurrent.TimeUnit;
import org.apache.commons.jxpath.ri.compiler.NodeTypeTest;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_AttributeContext_Coverage_Test_Passing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetPosition_lwqo0() {
        AttributeContext attributeContext = new AttributeContext(new NamespaceContext(new SelfContext(new NamespaceContext(null, new NodeTypeTest(0)), new NodeTypeTest(0)), new NodeTypeTest(0)), new NodeTypeTest(0));
        boolean result = attributeContext.setPosition(10);
        assertFalse(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetPositionWithInvalidPosition_vVSQ1() {
        AttributeContext attributeContext = new AttributeContext(new NamespaceContext(new SelfContext(new NamespaceContext(null, new NodeTypeTest(0)), new NodeTypeTest(0)), new NodeTypeTest(0)), new NodeTypeTest(0));
        boolean result = attributeContext.setPosition(-1);
        assertTrue(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testNextNode_iteratorNull_TfLo0() {
        AttributeContext attributeContext = new AttributeContext(new NamespaceContext(new SelfContext(new NamespaceContext(null, null), null), null), null);
        assertFalse(attributeContext.nextNode());
    }
}