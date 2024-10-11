/**
 * Generated by Aster
 */
package org.apache.commons.jxpath.ri.axes;

import java.util.concurrent.TimeUnit;
import org.apache.commons.jxpath.ri.compiler.NodeTypeTest;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_ParentContext_Coverage_Test_Failing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testNextNodeSetStarted_WbSz0() {
        ParentContext parentContext = new ParentContext(new NamespaceContext(new SelfContext(new NamespaceContext(null, new NodeTypeTest(1)), new NodeTypeTest(1)), new NodeTypeTest(1)), new NodeTypeTest(1));
        boolean actual = parentContext.nextNode();
        boolean expected = false;
        assert actual == expected;
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testNextNodeSetStartedTrue_qNiA2() {
        ParentContext parentContext = new ParentContext(new NamespaceContext(new SelfContext(new NamespaceContext(null, new NodeTypeTest(1)), new NodeTypeTest(1)), new NodeTypeTest(1)), new NodeTypeTest(1));
        boolean actual = parentContext.nextNode();
        boolean expected = true;
        assert actual == expected;
    }
}